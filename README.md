### About ###

This is the boiler plate for a "build your own" example of an async chat 

### Setup ###
It is highly recommended you run all the setup steps before the workshop as this can take some time.


#### Dependancies ####
  - Java JDK 1.8
  - SBT 13.15
  - Scala 11.11
  - docker
  - docker compose
  - Additional dependancies downloaded by sbt
  - IntelliJ or alternate IDE

#### Download Dependancies ####
- run `sbt run` from this main folder (the one with build.sbt). If successful you should see "Hello World"

#### KAFKA ####
  - Setup: insure that docker and docker-compose are installed and running
      - Follow the steps at [https://docs.docker.com/engine/installation/](https://docs.docker.com/engine/installation/) to install the docker applications
        - Open the Docker application and follow the prompts to complete the installation
        
      - Some operating systems (Linux) many require docker compose to be installed seperatly [https://docs.docker.com/compose/install/](https://docs.docker.com/compose/install/)

  - Start kafka
      - cd into the *kafka-docker* directory
      - run `docker-compose up -d` this will start the kafka continers
      - Other handy commands:
        - To view running containers `docker ps` (there should be 2)
        - To gracefully stop containers `docker-compose stop`
        - To start containers again `docker-compose start`
       
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
