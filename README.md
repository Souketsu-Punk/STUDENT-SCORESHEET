# STUDENT-SCORESHEET

ReportCard is a Java code that collects student information, records marks for multiple subjects, computes totals, assigns ranks from A–F, and finally prints out a neatly formatted report card.

The program shows:

Input handling with Scanner

Use of arrays for storing student data

Iteration using loops

Conditional grading logic

Aggregation of scores (per subject and overall)

Console table formatting using printf

Program Flow

1. Collect School Information

The application begins by prompting the user to enter basic details:

School name

Teacher name

Grade level

Academic year

Number of students


2. Initialize Data Structures

Several arrays are created to store data for each student:

studentNames[]

Subject arrays:
english[], math[], history[], geography[], science[], programming[]

total[] — total marks per student

rank[] — letter grade assigned to each student

Using parallel arrays keeps all records aligned by index.

A subject list array is also created:

String[] subjects = {"English", "Math", "History", "Geography", "Science", "Programming"};


This makes it easier to loop through subjects consistently.


3. Input Student Names and Marks

A loop runs for each student:

for (int i = 0; i < STUDENT_COUNT; i++) { ... }


Inside this loop:

The student's name is recorded.

Another loop prompts for marks in each subject.

A switch statement stores each mark in the correct subject array.

This structure avoids repetition.


4. Calculate Totals and Assign Ranks

Each student’s total marks are calculated by summing all six subjects:

total[i] = english[i] + math[i] + history[i] + geography[i] + science[i] + programming[i];


Ranks are assigned based on total score thresholds:

Total Marks	Rank
≥ 540	A
≥ 480	B
≥ 420	C
≥ 360	D
< 360	F

The code also counts how many students fall into each rank category.


5. Compute Subject Totals and Averages

Two additional loops compute:

Total marks per subject (English, Math, etc.)

Grand total of all students’ scores



This provides a class-level performance overview.

Report Output

The report is printed in a fully formatted table using System.out.printf.
Sections include:

School Header

Displays school name, teacher, grade, and year.

Student Marks Table

Includes:

Student Name

Marks for all six subjects

Total marks

Rank

Formatting ensures aligned columns:

System.out.printf("%-18s %-10.2f %-10.2f ...");

Subject Totals and Averages

The report includes:

Total marks for each subject

Average marks per subject

Total and average marks for the entire class

Rank Distribution Summary

Shows how many students received each grade:

A's: 2   B's: 5   C's: 3   D's: 1   F's: 0

