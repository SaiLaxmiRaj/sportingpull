Feature:HomePage Test
  As User, I Want navigate SportingBull homepage

  @smoke
  Scenario: User Should navigate homepage tab
    Given   I am on homepage
    When    I should click on accept cookies
    Then    I navigate homepage


