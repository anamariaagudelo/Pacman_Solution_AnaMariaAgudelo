/*
 * Developed by 10Pines SRL
 * License: 
 * This work is licensed under the 
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/3.0/ 
 * or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, 
 * California, 94041, USA.
 *  
 */
package pacman;

public class SpaceType extends ConstructionBlockType {
	@Override
	public Point nextPositionForGoing(Actor anActor, Point aMovement) {
		if(anActor instanceof Pacman){
			int coordenadaX= aMovement.x();
			int coordenadaY= aMovement.y();	
			return new Point(coordenadaX*2,coordenadaY*2);
		}else if(anActor instanceof Ghost){
				return aMovement;
		}
		return null;
	}
}
