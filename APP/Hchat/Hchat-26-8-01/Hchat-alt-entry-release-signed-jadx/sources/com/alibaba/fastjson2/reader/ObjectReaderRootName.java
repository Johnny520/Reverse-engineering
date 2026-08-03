package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderRootName<T> extends ObjectReaderAdapter<T> {
    protected final String rootName;
    protected final long rootNameHashCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderRootName(Class cls, String str, String str2, String str3, long j3, Supplier supplier, Function function, Class[] clsArr, String[] strArr, Class cls2, FieldReader[] fieldReaderArr) {
        super(cls, str, str2, j3, supplier, function, clsArr, strArr, cls2, fieldReaderArr);
        this.rootName = str3;
        this.rootNameHashCode = str3 == null ? 0L : Fnv.hashCode64(str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Map map, long j3) {
        Map map2 = (Map) map.get(this.rootName);
        if (map2 == null) {
            return null;
        }
        return (T) super.createInstance(map2, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        long j4;
        Object obj2;
        Type type2;
        JSONReader jSONReader2;
        T t9 = null;
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        if (!jSONReader.nextIfObjectStart()) {
            C0086a.m464w(jSONReader.info("read rootName error " + this.typeName));
            return null;
        }
        while (!jSONReader.nextIfObjectEnd()) {
            if (this.rootNameHashCode == jSONReader.readFieldNameHashCode()) {
                Object jSONBObject = super.readJSONBObject(jSONReader, type, obj, j3);
                j4 = j3;
                obj2 = obj;
                type2 = type;
                jSONReader2 = jSONReader;
                t9 = (T) jSONBObject;
            } else {
                j4 = j3;
                obj2 = obj;
                type2 = type;
                jSONReader2 = jSONReader;
                jSONReader2.skipValue();
            }
            jSONReader = jSONReader2;
            type = type2;
            obj = obj2;
            j3 = j4;
        }
        return t9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        long j4;
        Object obj2;
        Type type2;
        JSONReader jSONReader2;
        T t9 = null;
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        if (!jSONReader.nextIfObjectStart()) {
            C0086a.m464w(jSONReader.info("read rootName error " + this.typeName));
            return null;
        }
        while (!jSONReader.nextIfObjectEnd()) {
            if (this.rootNameHashCode == jSONReader.readFieldNameHashCode()) {
                Object object = super.readObject(jSONReader, type, obj, j3);
                j4 = j3;
                obj2 = obj;
                type2 = type;
                jSONReader2 = jSONReader;
                t9 = (T) object;
            } else {
                j4 = j3;
                obj2 = obj;
                type2 = type;
                jSONReader2 = jSONReader;
                jSONReader2.skipValue();
            }
            jSONReader = jSONReader2;
            type = type2;
            obj = obj2;
            j3 = j4;
        }
        return t9;
    }
}
