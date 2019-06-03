public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter() ;
//        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting() ;
//        greeter.greet(helloWorldGreeting);

        Greeting printfunction = () -> System.out.println("Hello from lambda expression");

        Greeting addNumbers = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Using anonymous class in lambda expressions");
            }
        };

        greeter.greet(printfunction);
        greeter.greet(addNumbers);


//        printfunction.perform();
//        addNumbers.perform();

//        printfunction();

    }

}

//interface lamda{
//    void print();
//}
