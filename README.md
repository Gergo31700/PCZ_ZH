_#_ A programozás módszertana I. Pót ZH - C2 csoport

A dolgozathoz csak és kizárólag a saját, korábban megírt kódok használhatóak. Minden más segítég tilos!

## Feladatok

0. (0 pont) Klónozza jelen repository-t és ossza meg a saját GitHub fiókjában:
    - Code / URL másolása
    - File / New / Project from Version Control...
    - Git / GitHub / Share Project on GitHub (a repository nevét ne változtassa meg)
1. (2 pont) Készítsen egy ***Matrix*** osztályt. Az osztályban írja meg a ***sumOfNumbersDivisibleByFive*** és a
   ***indexOfRowsWithZeros*** metódusokat. Mindkét metódus meghatározza egy 2-dimenziós egész mátrixban: előbbi az 5-tel
   osztható számok összegét, utóbbi azon sorok indexeit, melyek csupa 0 értékből állnak!
2. (4 pont) Implementálja a ***Timetable*** osztályt, ami kurzusok nevét és időpontjait kezeli (courseName, timestamp).
   Az osztálynak rendelkeznie kell egy ***newCourse*** (új kurzus hozzáadása, csak név), egy ***removeCourse*** (adott
   elem törlése) és egy ***getCourses*** (egy String-ben visszaadja az aktuálisan tárolt kurzusok adatait: <kurzusnév>
   <időpont> formátumban) metódussal.
3. (2 pont) Származtasson egy ***Scheduler*** osztályt a ***Timetable*** osztályból, melynek ***setTimestamp***
   metódusával lehessen beállítani a ***Timetable*** kurzusainak időpontját.

## Beadás módja

A feladatok megoldására 1,5 óra áll rendelkezésre. A megoldásokat az adott határidőn belül fel kell tölteni
a saját GitHub repository-jukba. A commit and push művelet során commit message-ként használja a neptunkódját.

## Értékelés

* 0-4 pont: Elégtelen (1)
* 5 pont: Elégséges (2)
* 6 pont: Közepes (3)
* 7 pont: Jó (4)
* 8 pont: Jeles (5)