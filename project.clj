(defproject kaocha-test-bug "0.1.0"
  :source-paths ["test"]
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :profiles {:kaocha {:dependencies [[lambdaisland/kaocha "1.0.641"]]}}
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]})
