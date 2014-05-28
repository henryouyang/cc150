package chapter1;

/*
 分析如下需求，写出你分析的类有哪些，以及功能。
 最后写一个测试类，针对每个类的功能进行测试。

 动物园里有很多种动物：
 比如说，狗，猫等。
 狗有姓名和年龄，猫也有姓名和年龄。
 狗有跑步的方法，猫也有跑步的方法。而且都仅仅是跑步。
 狗有吃饭的方法，猫也有吃饭的方法。只不过，狗吃骨头，猫吃鱼。
 请用所学知识，对这个问题进行解决。
 */
class Animal {
	private String name;
	private int age;

	Animal() {
	}

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void run() {
		System.out.println(name + "^^^^^^^^^^^^^^^^" + age + "岁了");
		System.out.println("看他跑起来了~！");
	}
	void like(){
		
	}

	public static void main(String[] args) {
		Animal c = new Cat("小花", 3);
		c.run();
		
		c.like();
		Dog d = new Dog("小明", 4);
		
		d.run();
		d.eat();
	}
}

class Cat extends Animal {
	Cat() {
	}

	Cat(String name, int age) {
		super(name, age);
	}
	void run() {
		System.out.println("catdefangfa");

	}

	void eat() {
		System.out.println("他是猫，他在吃鱼。");
	}
}

class Dog extends Animal {
	Dog() {
	}

	Dog(String name, int age) {
		super(name, age);
	}

	void eat() {
		System.out.println("他是狗，他在吃骨头。");
	}
}
