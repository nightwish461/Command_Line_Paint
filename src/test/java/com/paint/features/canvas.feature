## 

Feature: Testing the canvas

  Scenario: Creating a canvas with command "C 5 5"
    Given the programm has started
    When a canvas is created with the command "C 5 5"
    Then expected canvas is '-------\n|     |\n|     |\n|     |\n|     |\n|     |\n-------'


	Scenario: Creating a canvas with command "C 5 8"
    Given the programm has started
    When a canvas is created with the command "C 5 8"
    And a line is drawn with the command "L 2 3 2 5"
    Then expected canvas is
    	"""
      -------\n
    	|     |\n
    	|  xxx|\n 
    	|     |\n 
    	|     |\n 
    	|     |\n
    	|     |\n
    	|     |\n
    	|     |\n
    	-------\n
    """

  Scenario: Creating a canvas with command "C 5 8"
    Given the programm has started
    When a canvas is created with the command "C 5 8"
    And a rectangle is drawn with the command "R 2 3 4 5"
    Then expected canvas is
    	"""
      -------\n
    	|     |\n
    	|  xxx|\n 
    	|  xxx|\n 
    	|  xxx|\n 
    	|     |\n
    	|     |\n
    	|     |\n
    	|     |\n
    	-------\n
    """
