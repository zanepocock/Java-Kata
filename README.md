# Java-Kata
Coding Kata Excercises in Java, collated from around the web

This repository represents the start of a collection of short programs in Java, which are to be re-written as often as possible (ideally daily) in order to refine programming skills. The repository is open to any new excercises or changes proposed.

# To-Dos

Immediate:

- Implement all Katas found at the URL http://www.codingdojo.org/cgi-bin/index.pl?KataCatalogue

- <a href="http://codingbat.com/java">Coding Bat Java</a> has an amazing supply of practice excercises - it would be good to incorporate the best of these here. 

Long-term: 

- Sort into a training program. On one hand, this should classify groups of excercises that cover as many bases as possible in a certain amount of time, i.e. folders for "30 minute workout," "45 minute workout," and "One hour workout." On the other hand, it should also feature a marathon-like training schedule. I am undecided as to whether this should reference the set workouts, or have its own.

- Incorporate Test Cases

- Develop user interface and offer Kata as an application -- could be useful on tablets.

- Develop a similar Android Kata

# Best Practices, as found at <a href="http://www.javacodegeeks.com/2015/06/java-programming-tips-best-practices-beginners.html">Java Code Geeks</a>

1) Prefer returning Empty Collections instead of Null

If a program is returning a collection which does not have any value, make sure an Empty collection is returned rather than Null elements. This saves a lot of “if else” testing on Null Elements.

        public class getLocationName {
          return (null==cityName ? "": cityName);
        }

{WIP}

# With thanks to these resources:

Katas found at <a href="http://www.codingdojo.org/cgi-bin/index.pl?KataCatalogue">Coding Dojo</a>.

A few handy Java screencasts can be found at <a href="http://www.codekatas.org/casts/tagged/java">Code Katas</a>.

<a href="http://codingbat.com/java">Coding Bat Java</a> for a wide range of practice excercises.

Another resource to look into is <a href="http://www.codewars.com/kata/latest">Code Wars</a> && <a href="http://www.java2novice.com/java-interview-programs/">Java 2 Novice's Interview Programs</a>.
