package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplField implements ObjectReader {
    static final long HASH_DECLARING_CLASS = Fnv.hashCode64("declaringClass");
    static final long HASH_NAME = Fnv.hashCode64("name");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Field getField(long j3, String str, String str2) {
        if ((j3 & JSONReader.Feature.SupportClassForName.mask) == 0) {
            C0086a.m464w("ClassForName not support");
            return null;
        }
        try {
            return TypeUtils.loadClass(str2).getDeclaredField(str);
        } catch (NoSuchFieldException e6) {
            C0086a.m465x("method not found", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.startArray() != 2) {
            C0086a.m450i(jSONReader.info(), "not support input ");
            return null;
        }
        String string = jSONReader.readString();
        return getField(j3 | jSONReader.context.features, jSONReader.readString(), string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (!jSONReader.nextIfArrayStart()) {
            C0086a.m450i(jSONReader.info(), "not support input ");
            return null;
        }
        String string = jSONReader.readString();
        String string2 = jSONReader.readString();
        if (jSONReader.nextIfArrayEnd()) {
            jSONReader.nextIfComma();
            return getField(jSONReader.context.features | j3, string2, string);
        }
        C0086a.m450i(jSONReader.info(), "not support input ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return readObject(jSONReader, type, obj, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (!jSONReader.nextIfObjectStart()) {
            if (jSONReader.isSupportBeanArray(j3)) {
                return jSONReader.jsonb ? readArrayMappingJSONBObject(jSONReader, type, obj, j3) : readArrayMappingObject(jSONReader, type, obj, j3);
            }
            C0086a.m450i(jSONReader.info(), "not support input ");
            return null;
        }
        String string = null;
        String string2 = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == HASH_DECLARING_CLASS) {
                string2 = jSONReader.readString();
            } else if (fieldNameHashCode == HASH_NAME) {
                string = jSONReader.readString();
            } else {
                jSONReader.skipValue();
            }
        }
        if (!jSONReader.jsonb) {
            jSONReader.nextIfComma();
        }
        return getField(j3 | jSONReader.context.features, string, string2);
    }
}
