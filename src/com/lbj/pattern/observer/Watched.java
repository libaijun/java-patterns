package com.lbj.pattern.observer;

import java.util.Observable;
/**
 * 被观察者，JAVA提供的Observable
 * 
 * @author libojun
 *
 * 2016-3-28 下午9:41:36
 */
public class Watched extends Observable {
	private String data = "";
	public String getData(){
		return this.data;
	}
	public void changeData(String data){
		if(!this.data.equals(data)){
			this.data = data;
			// 1.改变状态
			this.setChanged();
		}
		// 2.通知改变,实际上调用的是观察者的update方法
		notifyObservers();
	}
}
