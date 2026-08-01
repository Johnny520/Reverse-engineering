package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplCharacter extends ObjectReaderPrimitive {
    static final ObjectReaderImplCharacter INSTANCE = new ObjectReaderImplCharacter();

    public ObjectReaderImplCharacter() {
        super(Character.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return Character.valueOf(jSONReader.readCharValue());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        String string = jSONReader.readString();
        if (string == null) {
            return null;
        }
        return Character.valueOf(string.charAt(0));
    }
}
