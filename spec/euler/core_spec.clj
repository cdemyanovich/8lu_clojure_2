(ns euler.core-spec
  (:use
    [speclj.core]
    [euler.core])
  (:require clojure.contrib.math))

(describe "Sum of digits"

  (it "is the number itself when the number has one digit"
    (should= 2 (sum-digits 2))
  )

  (it "is 7 for 16"
    (should= 7 (sum-digits 16))
  )

  (it "is 13 for 256"
    (should= 13 (sum-digits 256))
  )

  (it "is 7 for 1024"
    (should= 7 (sum-digits 1024))
  )

  (it "is 26 for 32768"
    (should= 26 (sum-digits 32768))
  )

  (it "is 1366 for 2 to the 1000th pwower (Project Euler problem #16)"
    (should= 1366 (sum-digits (clojure.contrib.math/expt 2 1000)))
  )
)

(describe "Sum of even Fibonacci numbers less than"

  (it "5 is 2"
    (should= 2 (sum-even-fibonaccis-less-than 5))
  )

  (it "10 is 10"
    (should= 10 (sum-even-fibonaccis-less-than 10))
  )

  (it "35 is 44"
    (should= 44 (sum-even-fibonaccis-less-than 35))
  )

  (it "200 is 188"
    (should= 188 (sum-even-fibonaccis-less-than 200))
  )

  (it "4,000,000 is 4,613,732 (Project Euler problem #2)"
    (should= 4613732 (sum-even-fibonaccis-less-than 4000000))
  )

)

(run-specs)
