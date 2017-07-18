### About ###

This is the boiler plate for a "build your own" example of an async chat 

### Setup ###

#### Dependancies ####
  - Java JDK 1.8
  - SBT 13.15
  - Scala 11.11
  - docker
  - docker compose
  - Additional dependancies downloaded by sbt

#### Download Dependancies ####
- run `sbt run` from this folder. If successful you should see "Hello World"

#### KAFKA ####
  - Setup: insure that docker and docker-compose are installed and running
      - https://docs.docker.com/engine/installation/
      - https://docs.docker.com/compose/install/

  - Start kafka
      - cd into kafka-docker and run `docker-compose up -d`

### License ###

  Copyright 2017 James Townley 

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.