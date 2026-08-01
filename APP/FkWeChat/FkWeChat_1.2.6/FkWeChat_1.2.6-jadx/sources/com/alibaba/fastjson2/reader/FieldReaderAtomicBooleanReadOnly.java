package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderAtomicBooleanReadOnly<T> extends FieldReader<T> {
    public FieldReaderAtomicBooleanReadOnly(String str, Class cls, int i10, String str2, AtomicBoolean atomicBoolean, JSONSchema jSONSchema, Method method, Field field) {
        super(str, cls, cls, i10, 0L, str2, null, atomicBoolean, jSONSchema, method, field);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t10, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = (AtomicBoolean) this.propertyAccessor.getObject(t10);
            if (obj instanceof AtomicBoolean) {
                obj = Boolean.valueOf(((AtomicBoolean) obj).get());
            }
            atomicBoolean.set(((Boolean) obj).booleanValue());
        } catch (Exception e10) {
            C1738y.m6412a("set ", this.fieldName, e10);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t10) {
        accept(t10, jSONReader.readBool());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return jSONReader.readBool();
    }
}
