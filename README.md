# 23-George_the-fourth-homewprk
做完了String和StringBuilder的测试，发现StringBuilder的效率远远高于String。现在来分析一下原因。首先我们查看源码得知，String类的声明是：public final，所以可以很清楚的知道，fianl的话是改变不了的，所以，如果我们用String来操作字符串的时候，一旦我们字符串的值改变，就会在内存创建多一个空间来保存新的字符串，所以遇到复杂的操作时，String的效率将会变得非常的低下。而StringBuilder则不会存在常量池中。他继承了AbstractStringBuilder,当字符串发生改变时，我们直接在之前的StringBuilder对象中进行增加、插入等操作。而不需要在创建一个新的空间来保存对象，所以效率要高于String，尤其是在复杂的增插操作时，表现的更加明显。
