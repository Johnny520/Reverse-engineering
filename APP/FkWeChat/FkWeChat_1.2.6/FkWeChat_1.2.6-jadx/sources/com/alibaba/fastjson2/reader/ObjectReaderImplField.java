package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplField implements ObjectReader {
    static final long HASH_DECLARING_CLASS = Fnv.hashCode64("declaringClass");
    static final long HASH_NAME = Fnv.hashCode64("name");

    private Field getField(long j10, String str, String str2) {
        if ((j10 & JSONReader.Feature.SupportClassForName.mask) == 0) {
            C1569c.m6258a("ClassForName not support");
            return null;
        }
        try {
            return TypeUtils.loadClass(str2).getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            C1565a.m6255a("method not found", e10);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.startArray() != 2) {
            C1607k.m6296a("not support input ", jSONReader.info());
            return null;
        }
        String string = jSONReader.readString();
        return getField(j10 | jSONReader.getContext().getFeatures(), jSONReader.readString(), string);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (!jSONReader.nextIfArrayStart()) {
            C1607k.m6296a("not support input ", jSONReader.info());
            return null;
        }
        String string = jSONReader.readString();
        String string2 = jSONReader.readString();
        if (jSONReader.nextIfArrayEnd()) {
            jSONReader.nextIfComma();
            return getField(jSONReader.getContext().getFeatures() | j10, string2, string);
        }
        C1607k.m6296a("not support input ", jSONReader.info());
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return readObject(jSONReader, type, obj, j10);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (!jSONReader.nextIfObjectStart()) {
            if (jSONReader.isSupportBeanArray(j10)) {
                return jSONReader.jsonb ? readArrayMappingJSONBObject(jSONReader, type, obj, j10) : readArrayMappingObject(jSONReader, type, obj, j10);
            }
            C1607k.m6296a("not support input ", jSONReader.info());
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
        return getField(j10 | jSONReader.getContext().getFeatures(), string, string2);
    }
}
