Example autotests for Drill4J with java+js coverage setup.

Demo scenario:

* start docker containers by
  ```shell
  ./demo-up.sh
  ```
* go to http://localhost:8080 and wait application up
* go to Drill admin http://localhost:8091 and register agents
* run tests by
  ```shell
  ./gradlew clean testBuild1
  ```
* see result on Drill admin and finish scopes
* deploy second build of app by
  ```shell
  ./demo-deploy-build2.sh
  ```
* see new build notifications and diffs in Drill admin
* run tests by
  ```shell
  ./gradlew clean testBuild2
  ```
* see result on Drill admin and finish scopes
* deploy third build of app by
  ```shell
  ./demo-deploy-build3.sh
  ```
* see new build notifications and diffs in Drill admin
* run tests by
  ```shell
  ./gradlew clean testBuild3
  ```
* see result on Drill admin and finish scopes