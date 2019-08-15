/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayskills;

/**
 *
 * @author FinFan
 */
public class GameplaySkills {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		SkillHolder.getInstance();
		System.out.println(SkillHolder.getInstance().findSkill(1, 1));
		SkillHolder.getInstance().reload();
		System.out.println(SkillHolder.getInstance().findSkill(1, 2));
	}
	
}
