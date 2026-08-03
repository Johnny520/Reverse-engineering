package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplMapString extends ObjectReaderImplMapTyped {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplMapString(Class cls, Class cls2, long j3) {
        super(cls, cls2, null, String.class, j3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped, com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        ObjectReaderImplMapString objectReaderImplMapString;
        JSONReader jSONReader2;
        Object objPut;
        JSONReader jSONReader3;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j3);
        }
        if (jSONReader.nextIfObjectStart()) {
            objectReaderImplMapString = this;
            jSONReader2 = jSONReader;
        } else {
            if (jSONReader.current() == '[') {
                jSONReader.next();
                if (jSONReader.current() == '{') {
                    jSONReader3 = jSONReader;
                    Object object = readObject(jSONReader3, String.class, obj, j3);
                    if (jSONReader3.nextIfArrayEnd()) {
                        jSONReader3.nextIfComma();
                        return object;
                    }
                } else {
                    jSONReader3 = jSONReader;
                }
                C0086a.m464w(jSONReader3.info("expect '{', but '['"));
                return null;
            }
            objectReaderImplMapString = this;
            jSONReader2 = jSONReader;
            if (jSONReader2.nextIfNullOrEmptyString()) {
                return null;
            }
        }
        JSONReader.Context context = jSONReader2.context;
        Map map = objectReaderImplMapString.instanceType == HashMap.class ? new HashMap() : (Map) createInstance(context.features | j3);
        long j4 = j3 | context.features;
        int i9 = 0;
        while (!jSONReader2.nextIfObjectEnd()) {
            String fieldName = jSONReader2.readFieldName();
            String string = jSONReader2.readString();
            if ((i9 != 0 || (JSONReader.Feature.SupportAutoType.mask & j4) == 0 || !fieldName.equals(getTypeKey())) && ((string != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j4) == 0) && (objPut = map.put(fieldName, string)) != null && (JSONReader.Feature.DuplicateKeyValueAsArray.mask & j4) != 0)) {
                if (objPut instanceof Collection) {
                    ((Collection) objPut).add(string);
                    map.put(fieldName, objPut);
                } else {
                    map.put(fieldName, JSONArray.m1634of(objPut, (Object) string));
                }
            }
            i9++;
        }
        jSONReader2.nextIfComma();
        return map;
    }
}
