package com.tarena.shoot;
import java.awt.image.BufferedImage;
/** 英雄机：是飞行物 */
public class Hero extends FlyingObject {
   private int life;//命
   private int doubleFire;//火力值
   private BufferedImage[] images;//图片数组(两张图片切换)
   private int index;//协助图片切换
   
   /** 构造方法 */
   public Hero(){
	   
   }
}