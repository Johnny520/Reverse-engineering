package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt8Field<T> extends FieldReader<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderInt8Field(String str, Class cls, int i9, long j3, String str2, Byte b10, Field field) {
        super(str, cls, cls, i9, j3, str2, null, b10, null, field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        try {
            this.field.set(t9, TypeUtils.toByte(obj));
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        Integer int32 = jSONReader.readInt32();
        try {
            this.field.set(t9, int32 == null ? null : Byte.valueOf(int32.byteValue()));
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0255e.m1024m(new StringBuilder("set "), this.fieldName, " error", jSONReader), e6);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, float f3) {
        accept(t9, Byte.valueOf((byte) f3));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, double d10) {
        accept(t9, Byte.valueOf((byte) d10));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, int i9) {
        accept(t9, Byte.valueOf((byte) i9));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, long j3) {
        accept(t9, Byte.valueOf((byte) j3));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, short s10) {
        accept(t9, Byte.valueOf((byte) s10));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Byte.valueOf((byte) jSONReader.readInt32Value());
    }
}
