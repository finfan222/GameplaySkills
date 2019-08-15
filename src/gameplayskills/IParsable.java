/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayskills;

import java.util.List;

/**
 *
 * @author FinFan
 */
public interface IParsable {
	<T> List<T> parseAndGet(String path, Object...args);
}
