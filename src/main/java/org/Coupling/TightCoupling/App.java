package org.Coupling.TightCoupling;

public class App {
        public static void main(String[] args)
        {
            GreetingService greetingService = new GreetingService();
            greetingService.greet("John");
        }
}
