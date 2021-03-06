package com.khjxiaogu.webserver.wrappers.inadapters;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.khjxiaogu.webserver.Utils;
import com.khjxiaogu.webserver.web.lowlayer.Request;
import com.khjxiaogu.webserver.wrappers.InAdapter;

public class JsonIn implements InAdapter {

	@Override
	public Object handle(Request req) throws JsonSyntaxException, IOException {
		return JsonParser.parseString(new String(Utils.readAll(req.body), StandardCharsets.UTF_8));
	}
}
