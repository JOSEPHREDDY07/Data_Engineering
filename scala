scala:

Scala is a general-purpose programming language providing
support for functional programming and a strong static type
system. Designed to be concise, many of Scala's design decisions
aimed to address criticisms of Java.
Scala source code is intended to be compiled to Java bytecode, so
that the resulting executable code runs on a Java virtual machine.


Flexible
Scala lets you add new types, collections, and control constructs
that feel like they are built-in to the language
Convenient
The Scala standard library has a set of convenient prede

Scala combines object-oriented and functional programming

Scala is object-oriented
Every value is an object
Every operation is a method call
val sumA = 2 + 4


Scala combines object-oriented and functional programming
Scala is functional
1. Functions are first class values
2.operations of program should map input values to output


scala> 2 + 3

res0: Int = 5

res0 * 2

scala> println("Let's play Game!")

val fourHearts: Int = 4

val piDouble: Double = 3.14

val piDouble: Double = 3.141592653589793238462643383
val piFloat: Float = 3.14159265358979323846264338327

val handBusts: Boolean = true
val stringtest: string = "hello world"


Scala has two kinds of variables
val (immutable) --->  val fourHearts: Int = 4
var (mutable) ---> var aceSpades: Int = 1

val fourHearts = 4;
var aceSpades = 1;


Scala scripts
A sequence of instructions in a file, executed in sequence

// Start game
println("Let's play Twenty-One!")

scala game.scala

If we put this code into a file named  game.scala

object Game extends App {
println("Let's play Twenty-One!")
}

compile first and run
$ scalac Game.scala
$ scala Game

to work in scala

Using the command line
Using an IDE (integrated development environment)

IDE:
Especially useful for larger projects with many FILES
IntelliJ IDEA: most commonly-used IDE by Scala developers

sbt - "simple build tool"
Compiles, runs, and tests Scala applications

Scala kernel for Jupyter ??

Functions are invoked with a list of arguments to produce a result
What are the parts of a function?
1. Parameter list
2. Body
3. Result type

// Define a function to determine if hand busts
def bust(hand: Int): Boolean = {
hand > 21
}


// Define a function to determine if hand busts
def bust(hand: Int) = {
hand > 21
}
println(bust(20))
println(bust(22))

println(bust(kingSpades + tenHearts))


Kinds of functions
Method: functions that are members of a class, trait, or singleton object
Local function: functions that are defined inside other function
Procedure: functions with the result type of Unit
Function literal: anonymous functions in source code (at run
time, function literals are instantiated into objects called function
values)

Collections
Mutable collections
can be updated or extended in place
Immutable collections
never change

Array
Mutable sequence of objects that share the same type
Parameterize an array: configure its types and parameter values
Initialize elements of an array: give the array data

scala> val players = Array("Alex", "Chen", "Marta")
scala> val players = new Array[String](3)
scala> val players: Array[String] = new Array[String](3)

other way:

scala> players(0) = "Alex"
scala> players(1) = "Chen"
scala> players(2) = "Marta"
scala> players

arrays are mutable:
scala> val players = Array("Alex", "Chen", "Marta")
scala> players(0) = "Sindhu"

Recommendation: use val with Array

scala> var players = Array("Alex", "Chen", "Marta")

can change elements
scala> players(0) = "Sindhu"

players can be reassigned
scala> players = new Array[String](5)
scala> players


scala> val mixedTypes = new Array[Any](3)

scala> mixedTypes(0) = "I like turtles"
scala> mixedTypes(1) = 5000
scala> mixedTypes(2) = true
scala> mixedTypes

Collections
Mutable collections: can be updated or extended in place
Array : mutable sequence of objects with the same type
Immutable collections: never change
List : immutable sequence of objects with the same type


Array
scala> val players = Array("Alex", "Chen", "Marta")

List
scala> val players = List("Alex", "Chen", "Marta")

How Lists are useful while immutable
List has methods, like all of Scala collections
Method: a function that belongs to an object
There are many List methods
myList.drop()
myList.mkString(", ")
myList.length
myList.reverse


scala> val players = List("Alex", "Chen", "Marta")
players: List[String] = List(Alex, Chen, Marta)
scala> val newPlayers = "Sindhu" :: players
newPlayers: List[String] = List(Sindhu, Alex, Chen, Marta)


scala> var players = List("Alex", "Chen", "Marta")
players: List[String] = List(Alex, Chen, Marta)
scala> players = "Sindhu" :: players
players: List[String] = List(Sindhu, Alex, Chen, Marta)


cons (::)
Prepends a new element to the beginning of an existing List
and returns the resulting List
scala> val players = List("Alex", "Chen", "Marta")
players: List[String] = List(Alex, Chen, Marta)
scala> val newPlayers = "Sindhu" :: players
newPlayers: List[String] = List(Sindhu, Alex, Chen, Marta)
An append operation exists, but its rarely used


Nil is an empty list
scala> Nil


A common way to initialize new lists combines Nil and ::
scala> val players = "Alex" :: "Chen" :: "Marta" :: Nil
players: List[String] = List(Alex, Chen, Marta)
scala> val playersError = "Alex" :: "Chen" :: "Marta"
<console>:11: error: value :: is not a member of String
val playersError = "Alex" :: "Chen" :: "Marta"


Concatenating Lists
::: for concatenation
val playersA = List("Sindhu", "Alex")
val playersB = List("Chen", "Marta")
val allPlayers = playersA ::: playersB
println(playersA + " and " + playersB + " were not mutated,")
println("which means " + allPlayers + " is a new List.")


Type: restricts the possible values to which a variable can refer, or
an expression can produce, at run time
Compile time: when source code is translated into machine code,
i.e., code that a computer can read
Run time: when the program is executing commands (after
compilation, if compiled)


Scala value types have equivalent Java types
Scala types
scala.Double
scala.Float
scala.Long
scala.Int
scala.Short
scala.Byte
scala.Char
scala.Boolean
scala.Unit
Java types
java.lang.Double
java.lang.Float
java.lang.Long
java.lang.Integer
java.lang.Short
java.lang.Byte
java.lang.Character
java.lang.Boolean

Type systems
Static type systems
A language is statically typed if
the type of a variable is known at
compile time. That is, types
checked before run-time.
C/C++
Fortran
Java
Scala


Dynamic type systems
A language is dynamically typed if
types are checked on the fly.
That
is, types are checked during
execution (i.e., run time).

JavaScript
Python
Ruby
R

Reducing verbosity (with variables)

Without type inference
scala> val fourHearts: Int = 4

With type inference
scala> val fourHearts = 4


Reducing verbosity (with collections)

Without type inference
scala> val players: Array[String] = Array("Alex", "Chen", "Marta")

With type inference
scala> val players = Array("Alex", "Chen", "Marta")


A program for playing Twenty-One
Variables
val fourHearts: Int = 4
var aceClubs: Int = 1
Collections
val hands: Array[Int] = new Array[Int](3)`
Functions
// Define a function to determine if hand busts
def bust(hand: Int) = {
hand > 21
}


// Point values for two competing hands
val handA = 17
val handB = 19
// Print the value of the hand with the most points
if (handA > handB)
println(handA)
else
println(handB)


if-else if-else
// Point values for two competing hands
val handA = 26
val handB = 20
// If both hands bust, neither wins
if (bust(handA) & bust(handB)) println(0)
// If hand A busts, hand B wins
else if (bust(handA)) println(handB)
// If hand B busts, hand A wins
else if (bust(handB)) println(handA)
// If hand A is greater than hand B, hand A wins
else if (handA > handB) println(handA)
// Hand B wins otherwise
else println(handB)

if expressions result in a value
val maxHand = if (handA > handB) handA else handB


// Define variables for while loop
var i = 0
val numRepetitions = 3
// Loop to repeat the cheer
while (i < numRepetitions) {
println("Hip hip hooray!")
i = i + 1
}


Rule of thumb: pretty much everything is an object in Scala


Loop with while over a collection
var i = 0
var hands = Array(17, 24, 21)
while (i < hands.length) {
println(bust(hands(i)))
i += 1
}


Scala is a imperative/functional hybrid
Scala usually is functional but can also be imperative sometimes


Scala can be imperative:
One command at a time
Iterate with loops
Mutate shared state (e.g., mutating variables out of scope)
Examples: C, Java, Python


The functional style
Operations of a program should map input values to output values
rather than change data in place
Functions are first class values

// Initialize array with each player's hand
var hands = Array(17, 24, 21)
// See if each hand busts
hands.foreach(bust)

Non-functional code
WHEN operations of a program DON'T map input values to
output values and DO change data in place


Scala is a hybrid imperative/functional language
Prefer
val
Immutable objects
Functions without side effects

If necessary
var
Mutable objects
Functions with side effects












