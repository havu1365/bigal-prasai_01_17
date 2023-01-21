# Welcome!
Thank you for considering NinjaRMM as your future home. In this repository you'll find some of our screening materials that we expect you to complete. The folder structure is explained below.

Take your time when completing these test materials as accuracy is important. Feel free to use whatever reference materials you need in order to complete and answer all of the questions. Incomplete submissions will not be considered. You should begin by creating a branch that contains your name and start date as you'll need to submit this as a pull-request once you are done.

# Overview
The repository is broken down into individual steps we would like for you to complete. Each subfolder step1 -> step4 contains an individual piece of test material. We expect that the solution for each step will be contained as a subfolder, for example for step1 we ask you to write some basic code for us. Ideally you would structure that folder so that the source code is contained in a subfolder called "src" so {root}/step1/src/* would contain your answer.

Create a Fork of the repository and a branch with your name and the date.

    Example Branch Name: chester-nimitz-2022-12-22

## Step 1
The first step is to solve the problem in the `{root}/step1/README.md` file. 

Please provide a {root}/{step#}/src/`RUNME.md` file for your source code that explains how to compile and execute your logic.

Please use ***Java*** or ***Javascript*** to code your submission.

## Step 2
Follow the instructions in the `{root}/step2/README.md` file and provide examples of how you would test the provided API.

# Submission
Once you feel you have everything in a good spot, please submit your answer as a pull-request against this repository and notify your contact that you are complete. We'll review it as soon as possible and get back to you.

Please make sure all of the following are checked:

1. All of the questions in step 1 have been answered.
2. The code for steps 1 compiles (if using a compiled language) and runs without errors.
3. Given the instructions you provide in the `RUNME.md`, we should be able to execute your solutions from step 1 from the command line and have the results printed to the console.

Happy coding!

# Knapsack Problem
Imagine that you are a thief breaking into a house. There are so many valuables to steal, but you’re just one person who can only carry so much. Each item has a weight and value, and your goal is to maximize the total value of items while remaining within the weight limit of your knapsack. Implement a `knapsack()` function or method in either ***Java*** or ***Javascript*** takes in:

* the total amount of weight you can carry
* an array of the weights of all the items
* an array of the values of all of the items

and returns the maximum value that you will be able to carry.

For example, let’s say your knapsack can carry `10` units of weight. The item weights are `[3, 6, 8]` and their values are `[50, 60, 100]`. Your knapsack function should return `110` since you can carry the first and second items, whose values total `110`. If you tried to carry the third item, which has a value of `100`, you wouldn’t be able to fit anything else in the knapsack.

***

Please place your code in the `src` directory and add a `RUNME.md` file with instructions on how to compile/run your code.

**Hint:** Since this position involves testing, we are looking for how you implement the above problem and how you test it.