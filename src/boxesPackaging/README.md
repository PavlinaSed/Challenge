BOXES products PACKAGING
The task is to create a program that will calculate the size of the box needed to pack the products.
We assume that we manufacture a variety of products. Each product may have a different size, but they are all in the shape of a rectangle cuboid. We want to pack these products in a box. The requirement is that the box should be in the shape of a cube and further the requirement is that the box should be fully utilized (no gaps). We only ever place products of one type in the box. But we only want to have boxes of one kind, so it must be possible to use them for any of our products. There is no limit to the number of products in the box. The challenge is to determine the smallest possible size of such a box for the given product sizes.
The input to the program is the sizes of the products to be manufactured. Three decimal numbers are always entered, indicating the dimensions of one product. The decimal number is given to two decimal places and is in the range 0.01 to 10000000.00 inclusive. The dimensions of all manufactured products are entered successively on the input. The input ends when EOF is signalled.
The output of the program is the calculated box size. The output is displayed to two decimal places in the format shown in the example. If the size of the box exceeds the value 10000000.00, the program displays information about the box being too large (the exact format is again in the sample). Note that there is a line break (\n) after the listing.
If the input is invalid, the program must detect this and display an error message. Display the error message on the standard output (not on the error output). Consider the following as an error:
no products have been entered,
three numbers were not entered for the product,
the dimension was entered as non-numeric,
the dimension was not in the range 0.01 to 10000000.00.
The program should also check that the dimensions are entered as decimal numbers to two decimal places. This test is more demanding, so it is not required in the basic version (in the basic version, decimal numbers are always entered to two decimal places). The task offers a bonus (optional test). In this bonus test, decimal numbers with fewer/more decimal places are also entered, which the program should evaluate as incorrect inputs. If you modify the program to handle this test as well, you will get extra points.
Sample output:
Product Size:
1.00 2.00 3.00
4.00 5.00 6.00
Box size: 60.00
Sample Output:
Product Size:
1.00 2.00 -28.00
Incorrect Input.

Translated with DeepL.com (free version)





Úkolem je vytvořit program, který bude počítat velikost krabice potřebné pro zabalení výrobků.
Předpokládáme, že vyrábíme různé výrobky. Každý výrobek může mít jinou velikost. ale všechny jsou ve tvaru kvádru. Tyto výrobky chceme balit do krabice. Požadavkem je, aby krabice měla tvar krychle a dále je požadavkem, aby krabice byla plně využita (bez mezer). Do krabice vždy umisťujeme pouze výrobky jednoho druhu. Ale krabice chceme mít pouze jednoho druhu, tedy musí být možné je použít pro náš libovolný výrobek. Počet výrobků v krabici není nijak omezen. Úkolem je určit nejmenší možnou velikost takové krabice pro zadané velikosti výrobků.
Vstupem programu jsou velikosti vyráběných výrobků. Zadávána jsou vždy tři desetinná čísla udávající rozměry jednoho výrobku. Desetinné číslo je zadáno na dvě desetinná místa a je v rozsahu 0.01 až 10000000.00 včetně. Na vstupu jsou postupně zadány rozměry všech vyráběných výrobků. Zadávání končí v okamžiku, kdy je signalizován EOF.
Výstupem programu je vypočtená velikost krabice. Výstup je zobrazen na dvě desetinná místa ve formátu podle ukázky. Pokud rozměr krabice přesáhne hodnotu 10000000.00, program zobrazí informaci o příliš velké krabici (přesný formát je opět v ukázce). Pozor, za výpisem je odřádkování (\n).
Pokud je vstup neplatný, program to musí detekovat a zobrazit chybové hlášení. Chybové hlášení zobrazujte na standardní výstup (ne na chybový výstup). Za chybu považujte:
nebyly zadané žádné výrobky,
pro výrobek nebyla zadaná tři čísla,
rozměr byl zadaný jako nečíselný,
rozměr nebyl z rozsahu 0.01 až 10000000.00.
Program by dále měl kontrolovat, že rozměry jsou zadané jako desetinná čísla na dvě desetinná místa. Tento test je náročnější, proto není v základní verzi požadovaný (v základní verzi se zadávají desetinná čísla vždy na dvě desetinná místa). Úloha nabízí bonusový (nepovinný test). V tomto bonusovém testu jsou zadávána i desetinná čísla s menším/větším počtem desetinných míst, která by program měl vyhodnotit jako nesprávné vstupy. Pokud program upravíte, aby zvládl i tento test, dostanete body navíc.
Ukázkový výstup:
Velikost vyrobku:
1.00 2.00 3.00
4.00 5.00 6.00
Velikost krabice: 60.00
Ukázkový výstup:
Velikost vyrobku:
1.00 2.00 -28.00
Nespravny vstup. 