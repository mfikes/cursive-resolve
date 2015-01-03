(ns foo.macros)

(defmacro defreq [method request]
  `(defn ~method
     ~(str "Some doc")
     ~'{:arglists '([url opts callback] [url callback])}
     ~'[url & [s1 s2]]
     (if (fn? ~'s1)
       (~request {:url ~'url :method ~(keyword method)} ~'s1)
       (~request (merge ~'s1 {:url ~'url :method ~(keyword method)}) ~'s2))))
