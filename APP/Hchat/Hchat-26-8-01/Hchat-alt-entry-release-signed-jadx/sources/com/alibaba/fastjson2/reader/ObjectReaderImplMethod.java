package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplMethod implements ObjectReader<Method> {
    static final long HASH_DECLARING_CLASS = Fnv.hashCode64("declaringClass");
    static final long HASH_NAME = Fnv.hashCode64("name");
    static final long HASH_PARAMETER_TYPES = Fnv.hashCode64("parameterTypes");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method getMethod(long j3, String str, String str2, List<String> list) {
        Class<?>[] clsArr;
        if ((j3 & JSONReader.Feature.SupportClassForName.mask) == 0) {
            C0086a.m464w("ClassForName not support");
            return null;
        }
        Class clsLoadClass = TypeUtils.loadClass(str2);
        if (list == null) {
            clsArr = new Class[0];
        } else {
            Class<?>[] clsArr2 = new Class[list.size()];
            for (int i9 = 0; i9 < list.size(); i9++) {
                clsArr2[i9] = TypeUtils.loadClass(list.get(i9));
            }
            clsArr = clsArr2;
        }
        try {
            return clsLoadClass.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e6) {
            C0086a.m465x("method not found", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.startArray() != 3) {
            C0086a.m450i(jSONReader.info(), "not support input ");
            return null;
        }
        String string = jSONReader.readString();
        return getMethod(jSONReader.context.features | j3, jSONReader.readString(), string, jSONReader.readArray(String.class));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: readArrayMappingObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (!jSONReader.nextIfArrayStart()) {
            C0086a.m450i(jSONReader.info(), "not support input ");
            return null;
        }
        String string = jSONReader.readString();
        String string2 = jSONReader.readString();
        List array = jSONReader.readArray(String.class);
        if (jSONReader.nextIfArrayEnd()) {
            jSONReader.nextIfComma();
            return getMethod(jSONReader.context.features | j3, string2, string, array);
        }
        C0086a.m450i(jSONReader.info(), "not support input ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (!jSONReader.nextIfObjectStart()) {
            if (jSONReader.isSupportBeanArray(j3)) {
                return jSONReader.jsonb ? readArrayMappingJSONBObject(jSONReader, type, obj, j3) : readArrayMappingObject(jSONReader, type, obj, j3);
            }
            C0086a.m450i(jSONReader.info(), "not support input ");
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
        return getMethod(jSONReader.context.features | j3, string, string2, array);
    }

    /* JADX DEBUG: Method merged with bridge method: readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Method readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return readObject(jSONReader, type, obj, j3);
    }
}
