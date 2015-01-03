(ns foo.baz
  (:require [foo.macros :refer [defreq]]))

(defn g [_ _])

(defreq patch g)