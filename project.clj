(defproject paip "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [net.mikera/core.matrix "0.52.2"]]
  :main ^:skip-aot paip.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
