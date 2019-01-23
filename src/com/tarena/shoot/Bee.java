package com.tarena.shoot;
/** 小蜜蜂：是飞行物，也是奖励 */
public class Bee extends FlyingObject implements Award{ 
    private int xSpeed = 1;//x坐标走步步数
    private int ySpeed = 2;//y坐标走步步数
    private int awardType;//奖励的类型(0或1)
	
    /** 构造方法 */
    public Bee(){
    	
    }
    
	/** 重写getType() */
    public int getType(){
		return awardType;//返回奖励类型(0或1)
	}
}
