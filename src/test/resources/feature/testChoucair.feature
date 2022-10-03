#Autor : Deivith Enrique Amaya Lopez
@stories
  Feature: Choucair test
    As a user, I want to enter Utest.com and register
    @scenario1
    Scenario: Register on the page
      Given that Juanito wants to register in Utest
        | strButtonName |
        | Join Today    |
      When he enters the registration data in the form
        | strFirstName | strLastName | strEmailAddres           | strMonth | intDay | intYear | strNextButton | strVersion | strLanguage | strMobile | strModel      | strSystem | strPassword | strRePassword |
        | juanito      | poveda      | juanito9804182@gmail.com | July     | 14     | 1985    | Next          | Ubuntu     | English     | Asus      | Nexus 7(2013) |Android 2  |Dari980418*  |Dari980418*    |
      Then he search confirm that the password is correct
        | strStateDone |
        | done         |