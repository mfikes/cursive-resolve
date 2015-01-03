(ns alpha.beta
  (:require [foo.bar :as problemo]))

(defn howdy []
  (problemo/post "http://bar.com" {} identity))