# Friender Chest
A plugin for Minecraft Spigot that adds coloured ender chests with global inventories

## Project setup
#### Prerequisites
You must have the following installed before running the project:
- [Git](https://git-scm.com/downloads)
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) (see [Installing](#Installing) below if you don't want to install Java 17 as your default Java version)
- [Apache Maven](https://maven.apache.org/download.cgi)

#### Installing
- Clone this project and `cd` into it
    ```bash
    git clone https://github.com/x04e/mc-friender-chest.git && cd mc-friender-chest
    ```
- (Optional) Create an *env.sh* file in the project root. This script is sourced by *start.sh* if it exists and allows you to set any environment variables you need, like `JAVA_HOME`
    ```bash
    #!/bin/sh
    # env.sh
    export JAVA_HOME=/usr/lib/jvm/java-17-openjdk/
    export JRE_HOME=$JAVA_HOME
    export PATH=$JAVA_HOME/bin:$PATH
    ```
- Run the *start.sh* script
    ```bash
    ./start.sh
    ```
    The script will source *env.sh* if it exists and download the Spigot jar to the `server/` folder. It then packages the Maven project and runs a development Minecraft server
- Connect to the Spigot server within Minecraft by going to Multiplayer > Add Server and entering `localhost` as the server address.

