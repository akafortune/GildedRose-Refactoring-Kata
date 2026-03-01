Deliverable Locations
-------------------------------------------------------------------
Refactor code is in src/main/java

Test cases are in src/test/java

Images are in output images (On my end only the code coverage image is available in IDE, you may need to go into file 
explorer to view the test case image

Video URLs
-------------------------------------------------------------------
Test Case Mob Session: https://www.youtube.com/watch?v=F2zRGAdO_sI

Refactor Mob Session: https://www.youtube.com/watch?v=jAD5hH_ufHA

New Feature Mob Session: https://www.youtube.com/watch?v=jAD5hH_ufHA

Solution Rationale
-------------------------------------------------------------------
Our mob identified readability and extensibility as the two main issues with the initial state of the gilded rose kata.

We identified that the easiest way to refactor would be to split the item update behaviors up by the name of the item 
by having the body of the for loop be an if/else if block that string checks the name of the item and runs certain behaviors 
based on that. This allows for extensibility as a new item can be given different behaviors by just adding a new name check. 
It also increases readability by visually separating the behaviors of different items.

We then targeted smaller issues, we identified that alot of the visual noise in the kata came from an overabundance of nested for loops.0
This made the flow control of the code extremely difficult to track and would likely lead to significant issues when trying to extend the code. 
In accordance with this we made nested ifs into compound conditionals where possible
 
Lastly, we zeroed in on problems at the micro-level, we identified that repeatedly accessing the array and lengthy addition 
statements made the code visually busy, so we parameterized the quality and sellIn, and transformed every instance of incrementing 
or decrementing by 1 to ++ or --. We also noted that we were repeatedly checking the same numbers for quality and sellIn thresholds, 
so we parameterized those as well. 

Tool Rationales
-------------------------------------------------------------------
For meeting we used Microsoft Teams, this was an obvious choice as it has robust scheduling, chat, video call and media sharing
features that allowed for a smooth and robust experience that allowed us to work together without issue.

For version control we used GitHub and GitHub Desktop, these allowed us to remotely update push and update code, this is the
industry standard and was also the medium through which we could most easily fork the Gilded Rose Kata to begin with.

For IDEs we used a mix of Eclipse and IntelliJ, with team members sticking to whatever they were most comfortable with.
