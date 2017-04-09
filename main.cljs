(ns main)
(let [torch (js/require "torch")
      express (js/require "express")
      app (express)
      port 3000]
  (.get app "/" (fn [req res] (.send res "Hello world!")))
  (.listen app port (fn []
                      (.blue torch (str "listening on localhost:" port)))))
