/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayskills;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;

/**
 *
 * @author FinFan
 */
public class Parser implements IParsable {

	@Getter private static final Parser instance = new Parser();

	@Override
	public <T> List<T> parseAndGet(String path, Object... args) {
		final Class<T[]> type = (Class<T[]>) args[0];
		final Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
		try (Reader reader = new FileReader(new File(path))) {
			return Arrays.asList(gson.fromJson(reader, type));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
