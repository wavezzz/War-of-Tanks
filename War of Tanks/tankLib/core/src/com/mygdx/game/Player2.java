package com.mygdx.game;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Player2 {
	private Vector2 position;
	private static final int [][] DIR_OFFSETS = new int [][] {
        {0,0},
        {0,-1},
        {1,0},
        {0,1},
        {-1,0}
    };
    public static final int SPEED = 5;
    public static final int DIRECTION_LEFT = 4;
    public static final int DIRECTION_UP = 3;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 1;
    public static final int DIRECTION_STILL = 0;
    private Rectangle rectangle;
	public int width;
    public int height;

	
	public Player2(int x , int y) {
		position = new Vector2(x,y);
		width = 60;
        height = 80;
		rectangle = new Rectangle(position.x,position.y,width,height);
	}
	
	public Vector2 getPosition() {
		return position;
	}
	
	public void move(int dir) { 
        position.x += SPEED * DIR_OFFSETS[dir][0];
        position.y += SPEED * DIR_OFFSETS[dir][1];
        rectangle.setPosition(position.x,position.y);
    }
	
	public Rectangle getRectangle() {
	    return rectangle;
	}
}