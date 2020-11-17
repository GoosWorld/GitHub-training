public class HelloWorld {
	public static void main(String[] args){
		Arrays.spliterator(args).forEachRemaining(System.out::println);
		System.out.println("Hello World!");
	}
}