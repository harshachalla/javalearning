### Q1. Explain JDK, JRE and JVM?

 ##### ans:
   JDK(java development kit):
  
 To develop and run java applications JDK is required ,it provides development tools.
 
 JRE(java run time environment):
 
 Only to run java applications JRE is required,it provides library classes.
 In JRE to run our program JVM is responsible
 
 
 JVM(java virtual machine) :
 
 
 JVM reads line by line of bytecode and converts in to native understanding form of OS.
 
 JDK =JRE+DEVELOPMENT TOOLS
 
 JRE = JVM+LIBRARY CLASSES
 
 
### Q2 .Explain public static void main(String args[])


#####ans:
Each and every java program starts with main method ,main method is one of the psudo method whose information is mentioned in java compiler and jvm

Hence main method is not reffering any value and hence its return type is "void"

Sine main method of java executing once  and hence its type is "static".

Since the main method of java can be used in every class of java programmer and hence whose access modifier must be "public".

Each and every main method of java takes "array of objects of string class".


###Q3. Why Java is platform independent?

######ans: 
 The same program works on any platform (operating system) without needing any modification. In the case of Java the application runs in a Java Virtual Machine which itself isn't platform independent.
 
 Because java program compiled code can run in all operating systems.
 
 ###Q4. Why java is not 100% Object-oriented?
 ##### ans:
 Pure Object Oriented Language or Complete Object Oriented Language are Fully Object Oriented Language which supports or have features which treats everything inside program as objects. It doesn’t support primitive datatype(like int, char, float, bool, etc.). There are seven qualities to be satisfied for a programming language to be pure Object Oriented. They are:
 
 ##### 1.Encapsulation/Data Hiding
 ##### 2.Inheritance
 ##### 3.Polymorphism
 ##### 4.Abstraction
 ##### 5.All predefined types are objects
 ##### 6.All user defined types are objects
 ##### 7.All operations performed on objects must be only through methods exposed at the objects.
 Java supports property 1, 2, 3, 4 and 6 but fails to support property 5 and 7 given above. Java language is not a Pure Object Oriented Language as it contain these properties.
 
 ###Q5. What are wrapper classes?
 ##### ans.
 For each and every fundamental data type there exist a predefined class and it is called "wrapper class".
 
 The purpose of wrapper class is that to convert numerical string type values in to numerical(or) fundamental type values
 
 ex: public static byte parseByte(string).
 
 ###Q6. What are constructors in Java?
 ##### ans.
 A constructor is one of the special member method which is automatically called by jvm during the object creation time and whose role is to place our own values with out placing default values.
 ###Q7. What is singleton class and how can we make a class singleton?
##### ans.
Singleton class means you can create only one object for the given class. You can create a singleton class by making its constructor as private.
###Q8. What is the difference between Array list and vector?
##### ans.
###### ArrayList:
1) ArrayList is not synchronized.
2) ArrayList increments 50% of current array size if number of element exceeds from its capacity.
3) ArrayList is not a legacy class, it is introduced in JDK 1.2
4) ArrayList is fast because it is non-synchronized.	
5) ArrayList uses Iterator interface to traverse the elements.
###### Vector:
1.Vector is synchronized.
2.Vector increments 100% means doubles the array size if total number of element exceeds than its capacity.
3.Vector is a legacy class.
4.Vector is slow because it is synchronized i.e. in multithreading environment, it will hold the other threads in runnable or non-runnable state until current thread releases the lock of object.
5.Vector uses Enumeration interface to traverse the elements. But it can use Iterator also.

###Q9. What is the difference between equals() and == ?
##### ans:
Main difference between .equals() method and == operator is that one is method and other is operator.

Ex:



    public static void main(String[] args)
    {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

output:

false

true
###Q10. What are the differences between Heap and Stack Memory?
##### ans:
The main difference between heap and stack is that stack memory is used to store local variables and function call while heap memory is used to store objects in Java. No matter, where the object is created in code e.g. as a member variable, local variable or class variable,  they are always created inside heap space in Java.



