Feature: Login to jQuery Application 
 
 Scenario:1 
    Given User is on jQuery Home page
    When User select "Droppable" option from left menu under Interactions
    Then User should be able to Drag "Drag me to my target" component to "Drop here" component
    
 Scenario:2 
    Given User is on jQuery Home page
    When User select "Selectable" option from left menu under Interactions
    Then User should be able to select "Item 1","Item 3","Item 7"
    
 Scenario:3 
    Given User is on jQuery Home page
    When User select "Controlgroup" option from left menu under Widgets
    Then User should be able to perform the actions     