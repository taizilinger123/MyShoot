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
	   image = ShootGame.hero0;//图片
	   width = image.getWidth();  //宽
	   height = image.getHeight();//高
       x = 150;//x:固定的值
       y = 400;//y:固定的值
	   life = 3;//默认3条命
	   doubleFire = 0;//默认火力值为0，即单倍火力
	   images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};//两张图片hero0,hero1
	   index = 0;//协助切换
   }

   /** 重写step() */
   public void step(){//10毫秒走一次
	   image = images[index++/10%images.length];//每100毫秒切换一次
	   
	   
	   
	   /*
	   //每100毫秒切一次
	   index++;
	   int a = index/10;
	   int b = a%2;
	   image = images[b];
	   */
   	   /*
   	    * 10M  index=1 a=0 b=0
   	    * 20M  index=2 a=0 b=0
   	    * 30M  index=3 a=0 b=0
   	    * 40M  index=4 a=0 b=0
   	    * ...
   	    * 100M index=10 a=1 b=1
   	    * 110M index=11 a=1 b=1
   	    * ...
   	    * 200M index=20 a=2 b=0 
   	    * 210M index=21 a=2 b=0
   	    * ...
   	    * 300M index=30 a=3 b=1
   	    * ...
   	    */
   }
   
   /** 英雄机发射子弹  */
   public Bullet[] shoot(){
	    int xStep = this.width/4;//1/4英雄机的宽
	    int yStep = 20;//y坐标向上20
	    if(doubleFire>0){//双倍火力
	    	Bullet[] bs = new Bullet[2];
	    	bs[0] = new Bullet(this.x+1*xStep, this.y-yStep);//x:英雄机的x+1/4英雄机的宽y:英雄机的y-20
	    	bs[1] = new Bullet(this.x+3*xStep, this.y-yStep);//x:英雄机的x+3/4英雄机的宽y:英雄机的y-20
	    	doubleFire-=2;//发射一次双倍火力则火力值减2
	    	return bs;
	    }else{//单倍火力
	    	Bullet[] bs = new Bullet[1];
	    	bs[0] = new Bullet(this.x+2*xStep, this.y-yStep);//x:英雄机的x+2/4英雄机的宽y:英雄机的y-20
	    	return bs;
	    }
   }
   
   /** 英雄机随着鼠标移动 x:鼠标的x坐标 y:鼠标的y坐标  */
   public void moveTo(int x,int y){
	   this.x = x - this.width/2;//英雄机的x=鼠标的x-1/2英雄机得宽
	   this.y = y - this.height/2;//英雄机的y=鼠标的y-1/2英雄机的高
   }
   
   /** 重写outOfBounds() */
   public boolean outOfBounds(){
   	   return false;//永不越界
   }
   
   /** 增命 */
   public void addLife(){
	   life++;//命数增1
   }
   
   /** 获取命 */
   public int getLife(){
	   return life;//返回命数
   }
   
   /** 减命  */
   public void subtractLife(){
	   life--;//命数减1
   }
   
   /** 增火力 */
   public void addDoubleFire(){
	   doubleFire+=40;//火力值增40
   }
   
   /** 清空火力值 */
   public void clearDoubleFire(){
	   doubleFire = 0;//火力值归零
   }
   
   /** 英雄机撞敌人 this:英雄机   obj:敌人 */
   public boolean hit(FlyingObject obj){
	   int x1 = obj.x - this.width/2;//x1:敌人的x-1/2英雄机的宽
	   int x2 = obj.x+obj.width+this.width/2;//x2:敌人的x+敌人的宽+1/2英雄机的宽
	   int y1 = obj.y-this.height/2;//y1:敌人的y-1/2英雄机的高
	   int y2 = obj.y+obj.height+this.height/2;//y2:敌人的y+敌人的高+1/2英雄机的高
	   int x = this.x+this.width/2;//x:英雄机的x+1/2英雄机的宽
	   int y = this.y+this.height/2;//y:英雄机的y+1/2英雄机的高
	   return x>x1 && x<x2
			  && 
			  y>y1 && y<y2;//x在x1和x2之间，并且，y在y1和y2之间，即为撞上了
   }
   
}
