(ns naughty-string-generator.core
  (:require [naughty-string-generator.data :refer [naughty-words]]
            [clojure.spec :as s]
            [clojure.spec.gen :as sg]))

(def naughty-string-generator (s/gen (set (naughty-words))))
