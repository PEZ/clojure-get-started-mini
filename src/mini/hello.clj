(ns mini.hello)

;; Start by loading this file in the REPL: Ctrl+Alt+C, ENTER
;; (Alt is labeled `option` or `opt` on many Macs)

(println "When loading the file, this is printed in the Output/REPL Window")
;; You can print it again, by evaluating the expression (aka form)
;; Place the cursor in the expression and press: Alt+ENTER
;; This is referred to as ”Evaluating a top-level form”

;; This function will also be defined
(defn hello [s]
  (str "Hello! " s))

;; Call it, and print the result by evaluating this
;; top-level form (Alt+ENTER, remember?)
(println (hello "When loading the file, this will be printed"))

;; You can redefine the `hello` function  by editing it,
;; and with the cursor still inside it, evaluate top-level form.
;; Then call the function again to see the new result.


;; This is a so called Rich Comment, nothing in it will be evaluated
;; when you load the file
(comment
  (println (hello "This will NOT be be printed when you load the file"))
  ;; You can print it by evaluating it as a top-level form

  ;; This call (evaluate top-level form) will give an error
  (println (hello2 "The function hello2 is not defined by the file load"))

  ;; Evaluate this top-level form, and then try the above call again
  (defn hello2 [s]
    (str "Hello again! " s))

  ;; There is also a command for evaluating the Current Form: Ctrl+ENTER
  ;; Try it at some different places in the below expression
  (println
   (str 0 1 "foo"
        :bar [1 2 3]
        (inc 41)))
  )

;; Now you know the most important things about Calva, enough to follow
;; along what is happening in this video: https://www.youtube.com/watch?v=d0K1oaFGvuQ
;; (Clojure Workflow with Calva coding FizzBuzz)

;; To learn more about Calva, and some basics about Clojure, use the command:
;; **Calva: Fire up the Getting Started REPL**
;; Please visit https://calva.io for Calva documentation

(println (hello "This will also be be printed when you load the file"))

"When loading the file in the REPL, this string will be the result"
