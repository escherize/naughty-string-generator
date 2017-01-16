# naughty-string-generator

A Clojure library designed to help you crash your programs! (During testing.)

Based on this [big list of naughty strings][1], here's a generator for use with spec, test.check, or anywhere else you'd like to generate naughty strings.

## Usage

``` clojure

(ns my-ns
  (:require [naughty-string-generator.core :as nsg]
            [clojure.spec :as s]
            [clojure.spec.gen :as sg]))


(s/exercise (s/gen nsg/naughty-strings))
;;=>



```

## License

Copyright © 2017 Bryan Maass

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.


[1]: https://github.com/minimaxir/big-list-of-naughty-strings
