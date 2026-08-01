package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplMethod implements ObjectReader<Method> {
    static final long HASH_DECLARING_CLASS = Fnv.hashCode64("declaringClass");
    static final long HASH_NAME = Fnv.hashCode64("name");
    static final long HASH_PARAMETER_TYPES = Fnv.hashCode64("parameterTypes");

    private Method getMethod(long j10, String str, String str2, List<String> list) {
        Class<?>[] clsArr;
        if ((j10 & JSONReader.Feature.SupportClassForName.mask) == 0) {
            C1569c.m6258a("ClassForName not support");
            return null;
        }
        Class clsLoadClass = TypeUtils.loadClass(str2);
        if (list == null) {
            clsArr = new Class[0];
        } else {
            Class<?>[] clsArr2 = new Class[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                clsArr2[i10] = TypeUtils.loadClass(list.get(i10));
            }
            clsArr = clsArr2;
        }
        try {
            return clsLoadClass.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            C1565a.m6255a("method not found", e10);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.startArray() != 3) {
            C1607k.m6296a("not support input ", jSONReader.info());
            return null;
        }
        String string = jSONReader.readString();
        return getMethod(jSONReader.getContext().getFeatures() | j10, jSONReader.readString(), string, jSONReader.readArray(String.class));
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (!jSONReader.nextIfArrayStart()) {
            C1607k.m6296a("not support input ", jSONReader.info());
            return null;
        }
        String string = jSONReader.readString();
        String string2 = jSONReader.readString();
        List array = jSONReader.readArray(String.class);
        if (jSONReader.nextIfArrayEnd()) {
            jSONReader.nextIfComma();
            return getMethod(jSONReader.getContext().getFeatures() | j10, string2, string, array);
        }
        C1607k.m6296a("not support input ", jSONReader.info());
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (!jSONReader.nextIfObjectStart()) {
            if (jSONReader.isSupportBeanArray(j10)) {
                return jSONReader.jsonb ? readArrayMappingJSONBObject(jSONReader, type, obj, j10) : readArrayMappingObject(jSONReader, type, obj, j10);
            }
            C1607k.m6296a("not support input ", jSONReader.info());
            return null;
        }
        String string = null;
        String string2 = null;
        List array = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == HASH_DECLARING_CLASS) {
                string2 = jSONReader.readString();
            } else if (fieldNameHashCode == HASH_NAME) {
                string = jSONReader.readString();
            } else if (fieldNameHashCode == HASH_PARAMETER_TYPES) {
                array = jSONReader.readArray(String.class);
            } else {
                jSONReader.skipValue();
            }
        }
        if (!jSONReader.jsonb) {
            jSONReader.nextIfComma();
        }
        return getMethod(jSONReader.getContext().getFeatures() | j10, string, string2, array);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return readObject(jSONReader, type, obj, j10);
    }
}
