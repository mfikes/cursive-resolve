(ns gamma.delta
  (:require [foo.baz :as no-problemo]))

(defn howdy []
  (no-problemo/patch "http://abc.com" {} identity))