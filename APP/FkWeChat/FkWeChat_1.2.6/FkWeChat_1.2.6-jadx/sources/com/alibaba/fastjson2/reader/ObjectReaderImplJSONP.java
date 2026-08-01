package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPObject;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplJSONP implements ObjectReader {
    private final Class objectClass;

    public ObjectReaderImplJSONP(Class cls) {
        this.objectClass = cls;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        JSONPObject jSONPObject;
        String fieldNameUnquote = jSONReader.readFieldNameUnquote();
        if (jSONReader.nextIfMatch('.')) {
            fieldNameUnquote = fieldNameUnquote + '.' + jSONReader.readFieldNameUnquote();
        }
        char cCurrent = jSONReader.current();
        if (cCurrent == '/' && jSONReader.nextIfMatchIdent('/', '*', '*', '/')) {
            cCurrent = jSONReader.current();
        }
        if (cCurrent != '(') {
            C1569c.m6258a(jSONReader.info("illegal jsonp input"));
            return null;
        }
        jSONReader.next();
        Class cls = this.objectClass;
        if (cls == JSONObject.class) {
            jSONPObject = new JSONPObject(fieldNameUnquote);
        } else {
            try {
                jSONPObject = (JSONPObject) cls.newInstance();
                jSONPObject.setFunction(fieldNameUnquote);
            } catch (IllegalAccessException | InstantiationException e10) {
                C1565a.m6255a("create jsonp instance error", e10);
                return null;
            }
        }
        while (!jSONReader.isEnd()) {
            if (jSONReader.nextIfMatch(')')) {
                jSONReader.nextIfMatch(';');
                jSONReader.nextIfMatchIdent('/', '*', '*', '/');
                return jSONPObject;
            }
            jSONPObject.addParameter(jSONReader.readAny());
        }
        C1569c.m6258a(jSONReader.info("illegal jsonp input"));
        return null;
    }
}
