(defproject shoutr "0.1.0-SNAPSHOT"
  :description "Twitter like clone"
  :url "http://github.com/iamjarvo/shoutr"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [postgresql "9.1-901.jdbc4"]
                 [ring/ring-jetty-adapter "1.1.6"]
                 [hiccup "1.0.2"]
                 [clj-time "0.6.0"]
                 [compojure "1.1.3"]]
  :main shoutr.core)
