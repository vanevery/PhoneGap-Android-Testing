package com.mobvcasting.phonegaptest;

import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;
import com.phonegap.api.PluginResult.Status;
import org.json.JSONObject;

public class PluginTesting extends Plugin {

	@Override
	public PluginResult execute(String action, JSONArray data, String callbackId) {
		Log.v("PLUGINTESTING","Running");

		PluginResult result = null;
		if (action.equals("doIt")) {
			try {
				JSONObject resultObject = new JSONObject();
				resultObject.put("result", new String("Hello World"));
				result = new PluginResult(Status.OK,resultObject);
			} catch (JSONException e) {
				e.printStackTrace();
				result = new PluginResult(Status.ERROR);
			}
		}
		return result;
	}
}
