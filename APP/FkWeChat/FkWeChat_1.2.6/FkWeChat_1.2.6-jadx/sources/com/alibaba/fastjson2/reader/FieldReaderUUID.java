package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderUUID extends FieldReaderObject {
    public FieldReaderUUID(String str, Type type, Class cls, int i10, long j10, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer) {
        super(str, type, cls, i10, j10, str2, locale, obj, jSONSchema, method, field, biConsumer);
        this.initReader = ObjectReaderImplUUID.INSTANCE;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getObjectReader(JSONReader jSONReader) {
        return this.initReader;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, Object obj) {
        accept(obj, jSONReader.readUUID());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getObjectReader(JSONReader.Context context) {
        return this.initReader;
    }
}
