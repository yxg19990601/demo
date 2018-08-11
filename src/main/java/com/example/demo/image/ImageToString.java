package com.example.demo.image;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;

public class ImageToString {
	
	public static String toChar = "qwertyuioa*dfasdf345678905erwer545|)123!@#$%^&*|+_| ";
	public static int width = 64, height = 64;
	public static void main(String[] args) throws Exception {
		BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\ouyanghuachen\\Desktop\\1.png"));
		
		BufferedImage scalc = getScaledImg(bufferedImage);
		char[][] cary = getImageMatrix(scalc);
		for(char[] cs : cary) {
			for(char c : cs) {
				System.out.print(c);
			}
			System.out.println();
		}

	}
	
	
	private static char[][] getImageMatrix(BufferedImage img) {
		int w = img.getWidth(), h = img.getHeight();
		char[][] rst = new char[w][h];
		for(int i=0; i<w; i++)
			for(int j=0; j<h; j++) {
				int rgb = img.getRGB(i, j);
				// 注意溢出
				int r = Integer.valueOf(Integer.toBinaryString(rgb).substring(0, 8), 2);
				int g = (rgb & 0xff00) >> 8;
				int b = rgb & 0xff;
				int gray = (int) (0.2126 * r + 0.7152 * g + 0.0722 * b);
				
				// 把int gray转换成char
				int len = toChar.length();
				int base = 256/len + 1;
				int charIdx = gray/base;
				rst[i][j] = toChar.charAt(charIdx);
			} 
		
		return rst;
	}
	
	private static BufferedImage getScaledImg(BufferedImage image) {
		BufferedImage rst = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
		rst.getGraphics().drawImage(image, 0, 0, width, height, null);
		return rst;
	}

	public static void imageToStr(BufferedImage bufferedImage) {
		
		int height = bufferedImage.getHeight();
		int width = bufferedImage.getWidth();
		
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				int value = bufferedImage.getRGB(i, j);
				
			}
			
		}
		
		
		
	}

}
