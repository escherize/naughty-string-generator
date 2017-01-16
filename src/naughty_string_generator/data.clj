(ns naughty-string-generator.data
  (:require [clojure.string :as str]
            [clojure.spec :as s]))

(defmemo retrieve-list []
  (slurp "https://raw.githubusercontent.com/minimaxir/big-list-of-naughty-strings/master/blns.txt"))

(defn write-list []
  (->> (retrieve-list)
       str/split-lines
       (remove #(= "" %))
       (remove #(re-matches #"^\#.*" %))
       (str/join "\n")
       (spit "naughty.edn")))

(defmemo raw-list []
  (-> "naughty.edn" slurp str/split-lines))
