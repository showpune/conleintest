(ns conleintest.core)

(:require
  [ring.adapter.jetty :as jetty]
  [conleintest.handler :refer [app]])

(defn -main []
  (jetty/run-jetty app {:port 3000}))
