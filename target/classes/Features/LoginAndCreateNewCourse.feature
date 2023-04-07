Feature: LoginAndCreateNewCourse

  Background:

  Scenario Outline: Login To Winjgo Website And Create New Course
    Given Open Winjgo Website
    When Insert Email "<Email>"
    And Insert Password "<Password>"
    And click On Login Button
    And Click On Courses Icon
    And Click On Create New Course Icon
    And Insert Course Name "<CourseName>"
    And Click To Select Subject
    And Click To Choose Subject
    And Click To Select Grade Year
    And Click To Choose Grade Year
    And Click To Select Course Teacher
    And Click To Choose Course Teacher
    And Scroll Down
    And Click To Choose Final Assessment
    And Scroll Down
    And Click To Select Course Setting
    And Scroll Down
    And Insert Course Capacity "<CourseCapacity>"
    And Insert Course Location "<CourseLocation>"
    And Click On Check Enable Learning Path
    And Click On Check Student Learning Objective Achievement Settings
    And Click On Save Course Button
    Then Assert On Course Created Successfully

    Examples:
    |Email               | |Password    | |CourseName| |CourseCapacity| |CourseLocation|
    |testregister@aaa.com| | Wakram_123 | |Selenium  | |20            | |Cairo         |