Feature: Onliner basket test

  Background: I located on ManiPage of site
    Given Open site

  Scenario: Check add product
    When Mobile phones click
    And Choose first product
    And Click button 'in basket'
    And Click 'into a basket'
    Then Check product in list and product in basket