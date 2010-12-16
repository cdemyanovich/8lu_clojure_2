(ns euler.core
  (:require clojure.contrib.lazy-seqs))

(defn- char-to-digit
  [char]
  (- (int char) (int \0)))

(defn- number-to-digits
  [number]
  (map char-to-digit (seq (str number))))

(defn sum-digits
  [number]
  (reduce + (number-to-digits number)))

(defn sum-even-fibonaccis-less-than
  [max]
  (reduce + (filter even? (take-while (fn [member] (< member max)) (clojure.contrib.lazy-seqs/fibs)))))
