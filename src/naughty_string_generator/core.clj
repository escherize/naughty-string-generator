(ns naughty-string-generator.core
  (:require [naughty-string-generator.data :refer [raw-list]]
            [clojure.spec :as s]
            [clojure.spec.gen :as sg]))

(def naughty-string-generator (s/gen (set (raw-list))))
