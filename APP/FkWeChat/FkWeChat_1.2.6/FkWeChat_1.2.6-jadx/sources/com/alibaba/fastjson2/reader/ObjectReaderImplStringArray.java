package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplStringArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplStringArray INSTANCE = new ObjectReaderImplStringArray();
    public static final long HASH_TYPE = Fnv.hashCode64("[String");

    public ObjectReaderImplStringArray() {
        super(Long[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        String[] strArr = new String[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            strArr[i10] = next == null ? null : next instanceof String ? (String) next : next.toString();
            i10++;
        }
        return strArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return jSONReader.readStringArray();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return jSONReader.readStringArray();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Object createInstance(long j10) {
        return super.createInstance(j10);
    }
}
