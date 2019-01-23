package com.tarena.shoot;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


/** 主程序类 */
public class ShootGame {
	public static final int WIDTH = 400;//窗口宽
	public static final int HEIGHT = 654;//窗口高
	
	public static BufferedImage background;//背景图
	public static BufferedImage start;     //启动图
	public static BufferedImage pause;     //暂停图
	public static BufferedImage gameover;  //游戏结束图
	public static BufferedImage airplane;  //敌机
	public static BufferedImage bee;       //小蜜蜂
	public static BufferedImage bullet;    //子弹
	public static BufferedImage hero0;     //英雄机0
	public static BufferedImage hero1;     //英雄机1
	
	static{//初始化静态资源(图片)
		try{
			background = ImageIO.read(ShootGame.class.getResource("background.png"));
			start = ImageIO.read(ShootGame.class.getResource("start.png"));
			pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
			gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
			airplane = ImageIO.read(ShootGame.class.getResource("airplane.png"));
			bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
			bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
			hero0 = ImageIO.read(ShootGame.class.getResource("hero0.png"));
			hero1 = ImageIO.read(ShootGame.class.getResource("hero1.png"));
		}catch(Exception e){
            e.printStackTrace();
		}
	}
	public static void main(String[] args) {


	}
}
