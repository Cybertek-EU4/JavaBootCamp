package day01;

public class Day1_Notes {
}


/*
03/29/2021
Java Boot Camp

	Topics:
		1. Primitives: int, double, char, boolean
		2. Primitive Type Castings: Implicit vs Explicit
		3. Wrapper class
		4. String
		5. String vs StringBuilder vs StringBuffer
		6. Loops: for & while
		7. Array
		8. for each loop
		9. Custom Methods
		10. Method Overloading
		11. Constructor
		12. Class & Objects
		13. Static vs Instance
		14. Import Statements
		15. Access Modifiers
		16. OOP Encapsulations
		17. OOP Inheritance
		18. Is A vs Has A
		19. Method Overriding
		20. Final keyword
		21. OOP Abstraction
		22. Abstract Class vs Interface
		23. OOP Polymorphism
		24. Reference Type Castings: Upcasting vs DownCasting
		25. Exceptions: checked & unchecked
		26. Exception Handlings
		27. final vs finally vs finalize
		28. garbage collection & garbage collector
		29. Collections: List, Set, Queue
		30. Iteable & Iterator
		31. Maps
		32.
		33.
		34.
		35.


1. primitives:  byte < short < int < long < float < double
				char , boolean

2.
		implicit casting: from smaller tyep to larger type
		explicit casting: from larger type to smaller type


3. wrapper class: the objects that represents the primitives
				  Byte, Short, Integer, Long, Float, Double, Character, Boolean


4. String: char sequences
			"EU5"
			 012

		 methods: charAt, length, substring, lower case & uper case, replace, equals, contains, startsWith & endsWith, spilit, toCharArray


5. Char Sequences:
			1. String: immutable
			2. StringBuilder: mutable, not synchronized
			3. StringBuffer: mutable,  Synchronized ==> slower


			Synchroniozed: thread-safe => one theard at a time

			thread: sub sequence of a process

			multi-thread: multiple threads are being executed



6. Loops: repeated actions
			for:
				for(initialization; Condition; Iterator){

				}


			while:
				while(Condition){

				}


7. Array: one of data strutures (array, collection, map).
		  fixed size


8. for each loop: must be applied to data string
			      iteration order is fixed (from beginning to end)


			      for(  Variable : Data Structure ){

			      }


9. Custom method: function. grouping series of codes
					reusable

10. Method Overloading: multiple methods having samme method name
						Parameter MUSt be different
						method name MUST be same

						any method can be overloaded



11. Constructor: special method.  used for creating an object from class
				execution ALWAYS depends on object
		decleare:
				AccessModifier  ClassName(paremter){
						statements;
				}


		creating object:
				new ConstructorOfClass


12. Class & Object:	class is blueprint of object
					object is coming from the class, real


13. instance vs static
		static: only one copy (class)
		instance: multiple copies (object)



14.
	class imports:
		import Packge.ClassName;  // for importing one class from the package
		import Packge.*;	  // for importing all the classes from the package

	static import:
		import static Packge.ClassName.staticMember;  // imports one static member of the lcass
		import static Packge.ClassName.*;  // imports all static members of the lcass

		RestAssure.when()..
		RestAssured.get()..

 		when().get()....


15. Access Modifiers:
		private < default < protected < public

		private: you can not use outside class
		default: cannot use outside package
		protected: MAY use outside package(only if it's sub class)
		public: for every where


16. OOP: Object orientaed Programming.
		 		less codes
		 		less duplication
		 		clean
		 		easy to maintain...

	OOP Enacapsulation: data hiding by giving private AM. use public getter&setter to use the data

			getter: Read ONLY
			setter: Write ONLy








 */
