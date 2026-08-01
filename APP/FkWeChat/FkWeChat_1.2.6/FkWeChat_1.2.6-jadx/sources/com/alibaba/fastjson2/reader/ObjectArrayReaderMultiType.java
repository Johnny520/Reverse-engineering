package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.MultiType;
import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectArrayReaderMultiType implements ObjectReader {
    final ObjectReader[] readers;
    final Type[] types;

    public ObjectArrayReaderMultiType(MultiType multiType) {
        int size = multiType.size();
        Type[] typeArr = new Type[size];
        for (int i10 = 0; i10 < multiType.size(); i10++) {
            typeArr[i10] = multiType.getType(i10);
        }
        this.types = typeArr;
        this.readers = new ObjectReader[size];
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        return new Object[this.types.length];
    }

    public ObjectReader getObjectReader(JSONReader jSONReader, int i10) {
        ObjectReader objectReader = this.readers[i10];
        if (objectReader != null) {
            return objectReader;
        }
        ObjectReader objectReader2 = jSONReader.getObjectReader(this.types[i10]);
        this.readers[i10] = objectReader2;
        return objectReader2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.alibaba.fastjson2.reader.ObjectReader] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.alibaba.fastjson2.reader.ObjectArrayReaderMultiType] */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        ?? r42;
        long j11;
        ?? object;
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        ?? r12 = new Object[this.types.length];
        int i10 = 0;
        ?? r10 = jSONReader;
        while (i10 < iStartArray) {
            if (r10.isReference()) {
                String reference = r10.readReference();
                if ("..".equals(reference)) {
                    object = r12;
                } else {
                    r10.addResolveTask(r12, i10, JSONPath.m6205of(reference));
                    object = 0;
                }
                r42 = r10;
                j11 = j10;
            } else {
                r42 = r10;
                j11 = j10;
                object = getObjectReader(r10, i10).readObject(r42, this.types[i10], Integer.valueOf(i10), j11);
            }
            r12[i10] = object;
            i10++;
            r10 = r42;
            j10 = j11;
        }
        return r12;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        long j11;
        Object object;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        JSONReader jSONReader2 = jSONReader;
        if (jSONReader2.nextIfNullOrEmptyString()) {
            return null;
        }
        Object[] objArr = new Object[this.types.length];
        if (!jSONReader2.nextIfArrayStart()) {
            C1569c.m6258a(jSONReader2.info("TODO"));
            return null;
        }
        int i10 = 0;
        JSONReader jSONReader3 = jSONReader2;
        while (!jSONReader3.nextIfArrayEnd()) {
            if (jSONReader3.isReference()) {
                String reference = jSONReader3.readReference();
                if ("..".equals(reference)) {
                    object = objArr;
                } else {
                    jSONReader3.addResolveTask(objArr, i10, JSONPath.m6205of(reference));
                    object = null;
                }
                j11 = j10;
            } else {
                JSONReader jSONReader4 = jSONReader3;
                j11 = j10;
                object = getObjectReader(jSONReader4, i10).readObject(jSONReader4, this.types[i10], Integer.valueOf(i10), j11);
                jSONReader3 = jSONReader4;
            }
            objArr[i10] = object;
            jSONReader3.nextIfComma();
            i10++;
            j10 = j11;
            jSONReader3 = jSONReader3;
        }
        jSONReader3.nextIfComma();
        return objArr;
    }
}
