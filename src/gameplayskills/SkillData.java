/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayskills;

import lombok.Data;

/**
 *
 * @author FinFan
 */
@Data
public class SkillData {
	private final int id;
	private final int level;
	private final String name;
	private final String description;
	private final int mpConsume;
	private final float castTime;
	private final float reuseDelay;
	private final String[] effects;
}
