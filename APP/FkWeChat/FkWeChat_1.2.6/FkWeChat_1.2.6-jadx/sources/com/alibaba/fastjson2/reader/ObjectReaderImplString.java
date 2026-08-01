package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplString extends ObjectReaderPrimitive {
    static final ObjectReaderImplString INSTANCE = new ObjectReaderImplString();

    public ObjectReaderImplString() {
        super(String.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Map map, long j10) {
        if (map == null) {
            return null;
        }
        return JSON.toJSONString(map);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return jSONReader.readString();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return jSONReader.readString();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        if (collection == null) {
            return null;
        }
        return JSON.toJSONString(collection);
    }
}
