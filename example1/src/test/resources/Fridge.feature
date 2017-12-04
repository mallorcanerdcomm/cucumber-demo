Feature: Inyaki needs always beer on the fridge!
  As a good colleagues
  We need to be able to store beers on the fridge every time we have a meeting on his house
  So that we can demonstrate we have control over the fridge

Scenario: Push a beer on the fridge
  Given an empty fridge
  When I push a beer on the fridge
  Then the fridge contains one item

Scenario: Push two items on the fridge
  Given an empty fridge
  When I push a beer on the fridge
  And I push another beer on the fridge
  Then the fridge contains two beers

Scenario: Drinking one beer from the fridge
  Given an empty fridge
  When I push a beer on the fridge
  And I drink one beer from the fridge
  Then I get the same beer back

Scenario: Drinking some beers on the bdd-cucumber chat
  Given an empty fridge
  When We push some beers on the fridge
    | 12 |
#    | 5 |
#    | 4 |
  And We drink some beers with my friends
    | 4 |
    | 5 |
  Then Inyaki has got 3 beers on the fridge and he'll be able to survive