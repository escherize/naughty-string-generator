# naughty-string-generator

A Clojure library designed to help you crash your programs! (During testing.)

Based on this [big list of naughty strings][1], here's a generator for use with spec, test.check, or anywhere else you'd like to generate naughty strings.

## Usage

``` clojure

(ns my-ns
  (:require [naughty-string-generator.core :refer [naughty-string-generator]]
            [clojure.spec.gen :as sg]))

(sg/sample naughty-string-generator)

;;=>("\"`'><script>\\xE2\\x80\\x86javascript:alert(1)</script>"
     "<IMG SRC=# onmouseover=\"alert('xxs')\">"
     "`\"'><img src=xxx:x \\x0Aonerror=javascript:alert(1)>"
     "ﷺ"
     ","
     "<a href=\"\\x08javascript:javascript:alert(1)\" id=\"fuzzelement1\">test</a>"
     "ABC<div style=\"x:\\xE2\\x80\\x84expression(javascript:alert(1)\">DEF"
     "\\"
     "0xabad1dea"
     "<SCRIPT/XSS SRC=\"http://ha.ckers.org/xss.js\"></SCRIPT>")
```

## License

Copyright © 2017 Bryan Maass

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.


[1]: https://github.com/minimaxir/big-list-of-naughty-strings
