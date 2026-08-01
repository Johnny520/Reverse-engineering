package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplMapEntry extends ObjectReaderPrimitive {
    volatile ObjectReader keyReader;
    final Type keyType;
    volatile ObjectReader valueReader;
    final Type valueType;

    public ObjectReaderImplMapEntry(Type type, Type type2) {
        super(Map.Entry.class);
        this.keyType = type;
        this.valueType = type2;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        JSONReader jSONReader2;
        Type type2;
        Object obj2;
        long j11;
        Object object;
        Object object2;
        int iStartArray = jSONReader.startArray();
        if (iStartArray != 2) {
            C1569c.m6258a(jSONReader.info("entryCnt must be 2, but " + iStartArray));
            return null;
        }
        if (this.keyType == null) {
            object = jSONReader.readAny();
            jSONReader2 = jSONReader;
            type2 = type;
            obj2 = obj;
            j11 = j10;
        } else {
            if (this.keyReader == null) {
                this.keyReader = jSONReader.getObjectReader(this.keyType);
            }
            jSONReader2 = jSONReader;
            type2 = type;
            obj2 = obj;
            j11 = j10;
            object = this.keyReader.readObject(jSONReader2, type2, obj2, j11);
        }
        if (this.valueType == null) {
            object2 = jSONReader2.readAny();
        } else {
            if (this.valueReader == null) {
                this.valueReader = jSONReader2.getObjectReader(this.valueType);
            }
            object2 = this.valueReader.readObject(jSONReader2, type2, obj2, j11);
        }
        return new AbstractMap.SimpleEntry(object, object2);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        JSONReader jSONReader2;
        Object object;
        jSONReader.nextIfObjectStart();
        Object any = jSONReader.readAny();
        jSONReader.nextIfMatch(':');
        if (this.valueType == null) {
            object = jSONReader.readAny();
            jSONReader2 = jSONReader;
        } else {
            if (this.valueReader == null) {
                this.valueReader = jSONReader.getObjectReader(this.valueType);
            }
            jSONReader2 = jSONReader;
            object = this.valueReader.readObject(jSONReader2, type, obj, j10);
        }
        jSONReader2.nextIfObjectEnd();
        jSONReader2.nextIfComma();
        return new AbstractMap.SimpleEntry(any, object);
    }
}
