package application;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		
		/**
		 * Stream fixation exercise
		 */
//		
//		String path = "employeesList.txt";
//		path = path.replace("\\", "/");
//		File file = new File(path);
//		Scanner sc = new Scanner(file);
//		List<Employee> empList = new ArrayList<>();
//		
//		while(sc.hasNextLine()) {
//			String[] e = sc.nextLine().split(",");
//			empList.add(new Employee(e[0], e[1], Double.parseDouble(e[2])));
//		}
//		
//		Scanner sc2 = new Scanner(System.in);
//		sc2.useLocale(Locale.ENGLISH);
//		System.out.println("Enter salary: ");
//		Double baseSalary =	sc2.nextDouble();
//		sc2.close();
//		
//		System.out.println("\nEmail of people whose salary is more than " + String.format("%.2f", baseSalary) + ":");
//		System.out.println(empList.stream()
//									.filter(e -> e.getSalary() > baseSalary)
//									.map(e -> e.getEmail())
//									.collect(Collectors.toList()));
//		
//		double sumSalary = empList.stream()
//									.filter(e -> (e.getName().toUpperCase()).charAt(0) == 'M')
//									.map(e -> e.getSalary())
//									.reduce(0d, (x, y) -> x + y);
//		
//		System.out.println("Sum of salary of people whose name starts with 'M': " + sumSalary);
//		sc.close();
		
		/***
		 * Stream pipeline example
		 */
		
//		String path = "products.txt";
//		path = path.replace("\\", "/");
//		File myFile = new File(path);
//		Scanner sc = new Scanner(myFile);
//		List<Product> pList = new ArrayList<>();
//		
//		while(sc.hasNextLine()) {
//			String[] pSplit = sc.nextLine().split(",");
//			String name = pSplit[0];
//			double price = Double.parseDouble(pSplit[1]);
//			
//			Product p = new Product(name, price);
//			pList.add(p);
//		}
//		double avg = pList.stream().mapToDouble(Product::getPrice).average().getAsDouble();
//		
//		Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());  
//		
//		System.out.println("Average price: " + String.format("%.2f", avg));
//		List<String> orderedProductList = pList.stream()
//												.filter(p -> p.getPrice() < avg)
//												.map(p -> p.getName())
//												.sorted(comp.reversed())
//												.collect(Collectors.toList()) ;
//		
//		System.out.println(orderedProductList.toString());
//		
//		sc.close();
		
		
		//System.out.println(list.stream().max());
		//System.out.println(list.stream().map(x -> x * 10).collect(Collectors.toList()));
		
		
//		Stream<Long> st = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
//		System.out.println(Arrays.toString(st.limit(10).toArray()));
		
		/***
		 * Streams review pt1
		 */
//		List<Product> list = new ArrayList<Product>();	
//		list.add(new Product("Tv", 900.00));
//		list.add(new Product("Mouse", 50.00));
//		list.add(new Product("Tablet", 350.50));
//		list.add(new Product("Hd", 80.90));
//		
//		//return sum of products that the name starts with 'T';
//		double sumProducts = list.stream().filter((p) -> p.getName().charAt(0) == 'T').mapToDouble(p -> p.getPrice()).sum();
//		System.out.println("Sum: " + sumProducts);
		
		/***
		 * Hash Review
		 */
//		Set<Integer> alunosA = new HashSet<Integer>();
//		Set<Integer> alunosB = new HashSet<Integer>();
//		Set<Integer> alunosC = new HashSet<Integer>();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How many students for course A:");
//		int numberA = sc.nextInt();
//		
//		for(int i = 0; i < numberA; i++) {
//			alunosA.add(sc.nextInt());
//		}
//		
//		System.out.println("How many students for course B:");
//		int numberB = sc.nextInt();
//		
//		for(int i = 0; i < numberB; i++) {
//			alunosB.add(sc.nextInt());
//		}
//		
//		System.out.println("How many students for course C:");
//		int numberC = sc.nextInt();
//		
//		for(int i = 0; i < numberC; i++) {
//			alunosC.add(sc.nextInt());
//		}
//		
//		Set<Integer> total = new HashSet<Integer>(alunosA);
//		total.addAll(alunosB);
//		total.addAll(alunosC);
//		
//		System.out.println("Total Students: " +  total.size());
//		
//		sc.close();
//				
/***
 * Generics Review ex1
 * 		
 */
//		List <Shape> figures = new ArrayList<Shape>();
//		figures.add(new Rectangle(2.5, 2.5));
//		figures.add(new Circle(3.2));
//		System.out.println(GenericsReview.figuresListArea(figures));
		
/***
 * Generics Review ex2
 */
//		List<Integer> listInteger = new ArrayList<Integer>();
//		listInteger.add(1);
//		listInteger.add(2);
//		listInteger.add(3);
//		
//		List<Double> listDouble = new ArrayList<Double>();
//		listDouble.add(1.5);
//		listDouble.add(2.5);
//		listDouble.add(3.5);
//		
//		List<Object> destiny = new ArrayList<Object>();
//		GenericsReview.copy(listInteger, destiny);
//		GenericsReview.copy(listDouble, destiny);
//		
//		for (Object object : destiny) {
//			System.out.println(object);
//		}
		
	}
}
