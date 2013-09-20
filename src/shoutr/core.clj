(ns shoutr.core
  (:use [compojure.core :only (defroutes GET)]
        [ring.adapter.jetty :as ring]
        [hiccup.page :only (html5)]
        [clj-time.core]
        ))


(defn day-name []
  (case (day-of-week (now))
    1 "Monday"
    2 "Tuesday"
    3 "Wednesday"
    4 "Thursday"
    5 "Friday"
    6 "Saturday"
    7 "Sunday"
   ))

(defn index []
  (html5
    [:head
     [:title "Hello World"]]
    [:body
     [:div {:id "content"} (str "OHAI! Happy " (day-name))]]))

(defroutes routes
  (GET "/" [] (index)))

(defn -main []
  (run-jetty #'routes {:port (Integer/parseInt (or (System/getenv "PORT") "8080")) :join? false}))
