/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayskills;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

/**
 *
 * @author FinFan
 */
public class SkillHolder implements IReloadable {

	@Getter private static final SkillHolder instance = new SkillHolder();

	private final Map<Integer, SkillData> skills = new HashMap<>();
	
	public SkillHolder() {
		load();
		System.out.println("Loaded: " + skills.size() + " skill templates!");
	}
	
	private void load() {
		final List<SkillData> parsedSkills = Parser.getInstance().parseAndGet("data/skills.json", SkillData[].class);
		for(SkillData next : parsedSkills) {
			skills.put(getSkillHashCode(next.getId(), next.getLevel()), next);
		}
	}
	
	@Override
	public void reload() {
		skills.clear();
		load();
		System.out.println("SkillHolder with " + skills.size() + " was reloaded!");
	}
	
	public SkillData findSkill(int id, int level) {
		return skills.get(getSkillHashCode(id, level));
	}
	
	public static final int getSkillHashCode(int id, int level) {
		int hash = 7;
		hash = 31 * hash + id;
		hash = 31 * hash + level;
		return hash;
	}
}
