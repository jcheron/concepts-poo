package edu.models;

import java.util.HashMap;
import java.util.Map;

public class Preferences {
	private Map<String, Object> prefs;
	
	public Preferences() {
		prefs=new HashMap<>();
	}
	
	/**Défini ou modifie la préférence à la position key
	 * @param key
	 * @param value
	 */
	public void setPref(String key,Object value) {
		prefs.put(key, value);
	}
	
	public Object getValue(String key) {
		return prefs.get(key);
	}
	
	public boolean exists(String key) {
		return prefs.containsKey(key);
	}
	
	public static Preferences getDefault() {
		Preferences result=new Preferences();
		result.setPref("admin", true);
		result.setPref("bgColor", "black");
		return result;
	}

	@Override
	public String toString() {
		return "Preferences [prefs=" + prefs + "]";
	}
}
