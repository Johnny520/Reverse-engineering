package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectArrayReader extends ObjectReaderPrimitive {
    public static final ObjectArrayReader INSTANCE = new ObjectArrayReader();
    public static final long TYPE_HASH_CODE = Fnv.hashCode64("[O");

    public ObjectArrayReader() {
        super(Object[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object[] createInstance(Collection collection, long j10) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Object objValueOf;
        ObjectReader objectReaderCheckAutoType;
        if (jSONReader.getType() == -110 && (objectReaderCheckAutoType = jSONReader.checkAutoType(Object[].class, TYPE_HASH_CODE, j10)) != this) {
            return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j10);
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Object[] objArr = new Object[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            byte type2 = jSONReader.getType();
            if (type2 >= 73 && type2 <= 125) {
                objValueOf = jSONReader.readString();
            } else if (type2 == -110) {
                ObjectReader objectReaderCheckAutoType2 = jSONReader.checkAutoType(Object.class, 0L, j10);
                objValueOf = objectReaderCheckAutoType2 != null ? objectReaderCheckAutoType2.readJSONBObject(jSONReader, null, null, j10) : jSONReader.readAny();
            } else if (type2 == -81) {
                jSONReader.next();
                objValueOf = null;
            } else if (type2 == -79) {
                jSONReader.next();
                objValueOf = Boolean.TRUE;
            } else if (type2 == -80) {
                jSONReader.next();
                objValueOf = Boolean.FALSE;
            } else {
                objValueOf = type2 == -66 ? Long.valueOf(jSONReader.readInt64Value()) : jSONReader.readAny();
            }
            objArr[i10] = objValueOf;
        }
        return objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectArrayReader.readObject(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Object createInstance(long j10) {
        return super.createInstance(j10);
    }
}
