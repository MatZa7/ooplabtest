# TU856/TU858 Object Oriented Programming Lab Test 2022

## Rules
- Stay on Teams for the duration of the test. I may ask you to turn on your cam or screenshare at any time
- You have three hours to complete the test 
- You can access the [Java reference](https://docs.oracle.com/javase/7/docs/api/) and the [Processing reference](https://processing.org/reference/) or the [git reference](https://git-scm.com/docs) if you need to look something up
- No use of notes or previously written code
- No collaboration or communication

- [Submit your solution](https://forms.office.com/Pages/ResponsePage.aspx?id=yxdjdkjpX06M7Nq8ji_V2ou3qmFXqEdGlmiD1Myl3gNUQjVRWjY0SklMUEFHVFdTWjZKUTBKUlI2MS4u)

Nematodes, also called roundworms, are multicellular organisms that occur as parasites in animals and plants or as free-living forms in soil and water. Many species of nematodes are microscopic, however, some species such as tapeworms can grow to several meters in length. They are the most abundant multicellular lifeforms on the planet and there are over 400 quintillion individual nematodes. In today's lab test you will be coding a visualiser for a dataset of nematodes. Here is a video of the finished program (click the image for a video):

[![YouTube](http://img.youtube.com/vi/Sixvl_2LgLg/0.jpg)](https://youtu.be/Sixvl_2LgLg)

The dataset is stored in a csv file called nematodes.csv, The csv file has the following fields:

| Field | Description |
|-------|-------------|
| name | The name of the nematode. |
| length | The length of the nematode. This is denoted by the number of segments drawn. |
| limbs | A value of 1 indicates that the nematode has limbs. A value of 0 indicates that the nematode has no limbs. If the nematode has limbs, these are drawn as lines either side of the segments. |
| gender | This can be a value of m, f, h or n. m indicates male and is drawn with a line and a circle on the last segment. f indicates female and is drawn with a circle in the bottom segment. h indicates hermaphrodite and is drawn with both male and female symbols. n indicates no gender and nothing is drawn in the last segment.
| eyes | A value of 1 indicates that the nematode has eyes. This is drawn with two lines and circles drawn from the top segment. A value of 0 indicates that the nematode has no eyes. | 

_The file is stored in java/data for Windows users and in /data for Mac users_

## Instructions

- Fork this repo
- Set up origin and upstream remotes on your fork
- Write a class called Nematode that has appropriate fields, a constructor, accessor methods and a toString method. Include in your solution a constructor that takes a TableRow parameter from the Processing library as a parameter
- Write a method loadNematodes on the class NematodeVisualiser. It should load the csv file and populate an ArrayList of Nematode onjects
- Write code to visualise the nematodes as per the video
- Write code to cycle through the nematodes using the arrow keys 
- Add any other cool thing to your program, such as additional fields, colours, navigation etc etc.

## Marking Scheme

| Marks | Description |
|-------|-------------|
| 20 | Creating the Nematode class |
| 10 | Loading the dataset |
| 30 | Visualising the dataset |
| 20 | Navigating through the dataset |
| 20 | Any other cool thing |