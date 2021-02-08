# Automation-Exercise

I started to build my project :
1. By using Cucumber - Junit.
2. I placed my dependencies and plugins in the pom.xml , in order to be able to use libraries and to get reports.
3. I generate my feature files in my resources file which I write my Feature and secenarios with the steps in Gherkin language.
4. I generate “runners” package with “TestRunner” and “FaildTestRunner” classes. In this class I place plugin, features, glue, dry run, tags. (Inside the classes I explained why I used these.)
5. I generated “pages” package for my elements which I located. 
6. I generate “step definitions” package with the classes which I implement my snippets after running and write my codes.
7. For multiple browser testing I generated Driver class in the utilities package and used switch statement for it.
8. I use configuration properties file in order to store my sensitive data and I generate “ConfiguratonReader” class for reading this data.
9. And in the “Target” folder the Maven-Cucumber reporting is generated.
10. I implement screenshots and @Before and @After methods inside the Hook Class. 

## Screenshots of my maven - cucumber report.
Screenshot of first scenario :
<img width="678" alt="Screen Shot 2021-02-05 at 4 58 47 PM" src="https://user-images.githubusercontent.com/78556065/107172454-6628f000-6993-11eb-9569-d245b3a3864f.png">

Screenshot of second scenario :
<img width="665" alt="Screen Shot 2021-02-05 at 4 59 04 PM" src="https://user-images.githubusercontent.com/78556065/107172633-d3d51c00-6993-11eb-8161-af99f14cb130.png">



