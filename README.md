# Distributed Systems Course Project

This project uses **Java** as its programming language, since it provides robust and platform-independent support for network programming. The instructions below help you get started with the project, from installing Java to running the client for the first time.


## Prerequisites

### Install the Java Development Kit (JDK)

Download the JDK from the official Oracle website:

https://www.oracle.com/java/technologies/downloads/

To make sure the JDK is installed, run:

```bash
java -version
```

### Install the Eclipse IDE

Download Eclipse from:

https://www.eclipse.org/downloads/

## Get the Source Code

The source code is provided as a template when signing for the Classroom50 assignment. The link is in the PDF documentation.

The template code for this assignment is also published at [LUH-VSS/ds-project-2026](https://github.com/LUH-VSS/ds-project-2025). Clone it with:

```bash
git clone git@github.com:LUH-VSS/ds-project-2025.git
cd ds-project-2025
ls
```

You should see:

```
README.md    src
```

## Import the Project into Eclipse

Once the repository is cloned to your machine:

1. Open **Eclipse**.
2. Go to **File → Import**.
3. Select **General → Existing Projects into Workspace → Next**.
4. Click **Select root directory**, browse to the root of the repository (the folder containing `README.md` and `src`), then click **Finish**.

The project should now appear in the **Package Explorer** tab on the left-hand side.

## Verify Your Setup

To confirm that everything was imported correctly:

1. Navigate to `src/de/luh/vss/chat/client/ChatClient.java`.
2. Right-click `ChatClient.java` and select **Run As → Java Application**.

If everything works, you should see the following message in the console:

```
Congratulation for successfully setting up your environment for Distributed Systems Exercises!
```




If the **JRE System Library** is not part of your project, add it as follows:

1. Right-click your project → **Build Path → Configure Build Path**.
2. Select **Java Build Path** and open the **Libraries** tab.
3. You should see the path to JARs and class folders. If not, click **Add Library** on the right side of the window.
4. Select **Workspace default JRE**.
5. Click **Finish**, then **Apply**.


If you don't have a system JRE installed, download one here and choose the version that suits your system:

https://www.oracle.com/java/technologies/downloads/?er=221886

Check that the installation was successful:

```bash
java --version
```

Example output:

```
java 17.0.11 2024-04-16 LTS
Java(TM) SE Runtime Environment (build 17.0.11+7-LTS-207)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.11+7-LTS-207, mixed mode, sharing)
```

Then return to the steps above to add the JRE System Library to your project, and run `ChatClient.java` again to see the congratulatory message.