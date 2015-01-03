(ns foo.bar
  (:require-macros [foo.macros :refer [defreq]]))

(defn f [_ _])

(defreq post f)
