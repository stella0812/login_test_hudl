# login_test_hudl

This ReadMe file highlights how to set up the Selenium Webdriver framework on Intellij, create a new project using selenium, install Chromedriver and run the test.

Tooling used: Selenium, intellij, 
Language: Java, Maven (POM), Junit 

# Setting up Selenium Framework

Pre-Req:

* Install JDK Latest version https://www.oracle.com/uk/java/technologies/downloads/  

* Install Chromedriver ensuring you download the correct driver. Click here to see the right chrome driver to download https://chromedriver.chromium.org/downloads 

* Create a Git Repository https://github.com/ 



Create project to write and run test:

* Download IntelliJ and follow the instructions to successfully get it installed

* Open IntelliJ and on the left side of the app, select pluggins

* Click on the Selenium UI testing pluggin and install

* Once installed, go back to the first screen of the app and click on New Project

* Select the Selenium plugin on the left 

* Give your project a name

* Select the JDK that was previously downloaded and click next 

* Project is created

* Create a class in the space and start writing tests. Ensure to import the correct selenium web driver, element and chromedriver

* Also, use System.setProperty in your code to set the folder path of your chromedriver
 
 
 
# How to install Chromedriver:

* Go into the url from the pre-req above to install Chromdriver

* Select the driver that is compatible with your Chrome browser 

* Ensure your chrome browser is updated by clicking the 3 dots at the top of your browser, going into 'Help' and selecting 'About Chrome'. This will tell you the correct version of chrome driver to download

* Once chrome driver is installed. You'll be able to run your tests (see the next steps)

* Another alternative to installing Chrome driver if something goes wrong with downloading it directly from the website is to use brew sh https://brew.sh/ 

* Using the brew sh command from the above link on mac terminal will trigger instructions to follow in order to complete installation

* After a successful installation of chrome driver, use the new binary path provided in terminal to set your System.setProperty



# How to Run your test:

* Go into the folder/path of the Chromedriver that was installed and double click on it. A session will start in terminal with a successful message. 

* After writing your tests, Open the Run drop down and select ‘Run’ or click on the green run button on the app 

* Tests will either run successfully or will trigger an error. 

* If successful, commit changes to git repository. If you run into errors, debug and fix by looking into the error message at the bottom section of intelliJ containing the test output.



# Git Version control:

* Open terminal by clicking on ‘Terminal’ at bottom of the app 

* Clone repository using git clone <url>

* Use the git add command to add files to repository

* Commit changes and push to repository

* Go into your Github repository to see all committed and pushed files.
