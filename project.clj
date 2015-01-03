(defproject cursive-resolve "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2511"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :source-paths ["src/shared-clj"
                 "src/clj"]
  :cljsbuild {:builds {:dev
                       {:source-paths ["src/shared-cljs"
                                       "src/cljs"]
                        :compiler     {:output-to     "js/main.js"
                                       :optimizations :whitespace}}}})
