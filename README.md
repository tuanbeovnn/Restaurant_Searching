# Restaurant_Searching

# Overview

- Searching information plays an important role in using application or website. Therefore, some developers always focus on how to create the tools to help
users to look the exactly places where user want. Now, I have finished the part of searching restaurants information. This is to help user to can find the restaurants near user wanting by using the latitude coordinate and ongitude coordinate.

# Prerequisites

Before you continue, ensure you meet the following requirements:

* You have installed the jdk version 8.
* You are using a Linux or Mac OS machine. Windows is aslo currently supported.
* You have a basic understanding of postman to test. 

# Installation

1) How to set JAVA_HOME on Windows 10.
	- Advanced System Settings: Type advanced system settings in the search box (beside the Windows start button), clicks View advanced system settings.
	- Environment Variables: Select Advance tab, clicks Environment Variables
	- Add JAVA_HOME: In System variables, clicks New... button to add a new JAVA_HOME variable and point it to the JDK installed folder.
	- Update PATH: In System variables, find PATH, clicks edit... button :
	- In old version of Windows, it will prompt you below dialog box to edit the values directly, append this %JAVA_HOME%\bin; to the end of the line.
	- In latest Windows 10, it will prompt you below dialog box, clicks on New button, and add this %JAVA_HOME%\bin.
	- Test: Open a command prompt, type :java -version

2) How to install Maven on Windows
	- Make sure JDK is installed, and JAVA_HOME environment variable is configured.
	- Visit Maven official website, download the Maven zip file, for example : apache-maven-3.6.0-bin.zip.
	- Add a MAVEN_HOME system variables, and point it to the Maven folder.
	- Press Windows key, type adva and clicks on the View advanced system settings.
	- In System Properties dialog, select Advanced tab and clicks on the Environment Variables... button.
	- In “Environment variables” dialog, System variables, Clicks on the New... button and add a MAVEN_HOME variable and point it to c:\opt\apache-maven-3.6.0
	- Add %MAVEN_HOME%\bin To PATH: In system variables, find PATH, clicks on the Edit... button. In “Edit environment variable” dialog, clicks on the New button and add this %MAVEN_HOME%\bin.
	- Verification: Done, start a new command prompt, type mvn –version.
3) Install Postman Native Application
	- To install Postman, go to the this link and click Download for Mac / Windows / Linux depending on your platform.
	- Open Postman windows 64 bit exe file to install it on your system.
	- Once installation of Postman is completed, you will be asked to create an account. You can create an account later time by clicking on “Take me straight to the app, I’ll create an account another time” link.

Note: I highly recommend you to create an account in the beginning itself. If you have an account, it will allow you to save your work that you do inside postman. You wont lose any of your work.

4) Install Intellij or Eclipse IDE. 

# Import a project

- Launch IntelliJ IDEA. If the Welcome screen opens, click Import Project. Otherwise, from the main menu, select File | New | Project from Existing Sources.
- In the dialog that opens, select the directory in which your sources, libraries, and other assets are located and click Open.

* Before you continue.
	1) This is to show you how to run or a web application using Tomcat
	- Tomcat Plugin: File –>> Settings –>> Type Plugin –>> Make sure Tomcat and TomEE Integration is checked. (IntelliJ IDEA)
	- Run –>> Edit Configurations…
	- Clicks + icon, select Tomcat Server –>> Local
	- Clicks on the “Deployment” tab, + icon to select an artifact to deploy. For break point debugging, always choose the exploded war version.
	- Clicks on “Server” tab, select a Tomcat server, and update the on 'Update' action to “Update classes and resources” – for hot swap.
	- Start web application, done.
# Testing project with Postman

1) Launch PostMan. You will see the Startup Screen. 
2) In Body, Click raw /Select JSON. 
2) In the workspace
	- Set your HTTP request to GET : "http://localhost:8080/restaurants/search?q=Sushi&lat=23.941813349723816&lon=60.1707249837842"
	- In the request URL field, input link
	- Click Send
	- You will see 200 OK Message
	- There should the results in the body which indicates that your test has run successfully.

# Contributors

Tuan Nguyen tuanquangnguyen1710@gmail.com
