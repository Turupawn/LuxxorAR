package edu.dhbw.andar.pub;

import java.io.BufferedReader;

import android.content.res.AssetManager;
import edu.dhbw.andar.ARToolkit;
import edu.dhbw.andar.nav.Explosion;
import edu.dhbw.andar.nav.Jugador1;
import edu.dhbw.andobjviewer.graphics.Model3D;
import edu.dhbw.andobjviewer.models.Model;
import edu.dhbw.andobjviewer.parser.ObjParser;
import edu.dhbw.andobjviewer.util.AssetsFileUtil;
import edu.dhbw.andobjviewer.util.BaseFileUtil;

public class Global {
	public static String player_action = "nada";
	
	public static ARToolkit artoolkit;
	public static AssetManager am;
	
	public static boolean turno_jugador_1=true;	
	
	public static Model3D cofre1;
	public static Model3D cofre2;
	public static Model3D cofre3;
	public static Model3D cofre4;
//	public static Jugador2 jugador2;
	public static Explosion explosion1;
	public static Explosion explosion2;
	public static Explosion explosion3;
	public static Explosion explosion4;
//	public static Explosion2 explosion2;
//	public static Explosion1A explosion1a;
//	public static Explosion2A explosion2a;
//	public static Poder1 poder1;
//	public static Poder2 poder2;
//	public static Terreno terreno;
	
	
//	public static Hunter hunter;
//	public static Rampano rampano;
//	public static Wing wing;
//	public static Dreamspark dreamspark;
//	public static StartupWeekend sw;
//	public static Explosion explosion;
//	public static Explosion2 explosion2;
//	public static Explosion3 explosion3;
//	public static Explosion4 explosion4;
	
	public static Model getModel(String obj_path)
	{
		BaseFileUtil fileUtil = new AssetsFileUtil(am);
		fileUtil.setBaseFolder("models/");
		Model model = null;
		ObjParser parser = new ObjParser(fileUtil);
		if(fileUtil != null) {
			BufferedReader fileReader = fileUtil.getReaderFromName(obj_path);
			if(fileReader != null) {
				try {
					model = parser.parse("Model", fileReader);
					model.scale=4;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return model;
	}
	
	
	
}
