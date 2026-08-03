package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.MultiType;
import java.lang.reflect.Type;
import java.util.Collection;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectArrayReaderMultiType implements ObjectReader {
    final ObjectReader[] readers;
    final Type[] types;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectArrayReaderMultiType(MultiType multiType) {
        int size = multiType.size();
        Type[] typeArr = new Type[size];
        for (int i9 = 0; i9 < multiType.size(); i9++) {
            typeArr[i9] = multiType.getType(i9);
        }
        this.types = typeArr;
        this.readers = new ObjectReader[size];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        return new Object[this.types.length];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader getObjectReader(JSONReader jSONReader, int i9) {
        ObjectReader objectReader = this.readers[i9];
        if (objectReader != null) {
            return objectReader;
        }
        ObjectReader objectReader2 = jSONReader.getObjectReader(this.types[i9]);
        this.readers[i9] = objectReader2;
        return objectReader2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0042 */
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
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        ?? r42;
        long j4;
        ?? object;
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        ?? r12 = new Object[this.types.length];
        int i9 = 0;
        ?? r10 = jSONReader;
        while (i9 < iStartArray) {
            if (r10.isReference()) {
                String reference = r10.readReference();
                if ("..".equals(reference)) {
                    object = r12;
                } else {
                    r10.addResolveTask(r12, i9, JSONPath.m1657of(reference));
                    object = 0;
                }
                r42 = r10;
                j4 = j3;
            } else {
                r42 = r10;
                j4 = j3;
                object = getObjectReader(r10, i9).readObject(r42, this.types[i9], Integer.valueOf(i9), j4);
            }
            r12[i9] = object;
            i9++;
            r10 = r42;
            j3 = j4;
        }
        return r12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0060 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        long j4;
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
            C0086a.m464w(jSONReader2.info("TODO"));
            return null;
        }
        int i9 = 0;
        JSONReader jSONReader3 = jSONReader2;
        while (!jSONReader3.nextIfArrayEnd()) {
            if (jSONReader3.isReference()) {
                String reference = jSONReader3.readReference();
                if ("..".equals(reference)) {
                    object = objArr;
                } else {
                    jSONReader3.addResolveTask(objArr, i9, JSONPath.m1657of(reference));
                    object = null;
                }
                j4 = j3;
            } else {
                JSONReader jSONReader4 = jSONReader3;
                j4 = j3;
                object = getObjectReader(jSONReader4, i9).readObject(jSONReader4, this.types[i9], Integer.valueOf(i9), j4);
                jSONReader3 = jSONReader4;
            }
            objArr[i9] = object;
            jSONReader3.nextIfComma();
            i9++;
            j3 = j4;
            jSONReader3 = jSONReader3;
        }
        jSONReader3.nextIfComma();
        return objArr;
    }
}
