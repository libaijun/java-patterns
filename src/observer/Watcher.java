package observer;

import java.util.Observable;
import java.util.Observer;
/**
 * 观察者，JAVA提供
 * 
 * @author libojun
 *
 * 2016-3-28 下午9:42:39
 */
public class Watcher implements Observer {

	public Watcher() {
		super();
	}
	
	public Watcher(Watched w) {
		super();
		w.addObserver(this);	// 添加观察者对象
	}

	@Override
	public void update(Observable o, Object arg) {
		Watched w = (Watched)o;
		System.out.println("data has been changed to : " + w.getData());
	}

}
