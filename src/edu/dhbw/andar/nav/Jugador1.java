package edu.dhbw.andar.nav;

import edu.dhbw.andar.pub.Global;
import edu.dhbw.andobjviewer.graphics.Model3D;

public class Jugador1 extends Model3D{
	public Jugador1()
	{
		super(Global.getModel("cofre.obj"),"Wing.patt");
		model.scale=10;
	}
}
