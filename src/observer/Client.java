package observer;

public class Client {
	public static void main(String[] args) {
		Watched watched = new Watched();
		new Watcher(watched);
		
		watched.changeData("JAVA");
		watched.changeData("JAVA");
		watched.changeData("C++");
		watched.changeData("PHP");
		watched.changeData("LINUX");
		watched.changeData("JAVA");
	}
}
