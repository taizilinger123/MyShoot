package com.tarena.shoot;
/** 敌机:是飞行物，也是敌人 */
public class Airplane extends FlyingObject implements Enemy {
	private int speed = 2; //走步的步数
    
	/** 构造方法 */
	public Airplane(){
		
	}
	
	/** 重写getScore() */
	public int getScore(){
		return 5;//打掉一个敌机得5分
	}
}
