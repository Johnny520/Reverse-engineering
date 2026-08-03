package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderInt32ValueField<T> extends FieldReader<T> {
    final long fieldOffset;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderInt32ValueField(String str, Class cls, int i9, String str2, Integer num, Field field) {
        super(str, cls, cls, i9, 0L, str2, null, num, null, field);
        this.fieldOffset = JDKUtils.UNSAFE.objectFieldOffset(field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        JDKUtils.UNSAFE.putInt(t9, this.fieldOffset, TypeUtils.toIntValue(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        JDKUtils.UNSAFE.putInt(t9, this.fieldOffset, jSONReader.readInt32Value());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(JSONReader jSONReader, T t9) {
        accept((Object) t9, jSONReader.readInt32Value());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, double d10) {
        accept(t9, Integer.valueOf((int) d10));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Integer.valueOf(jSONReader.readInt32Value());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, float f3) {
        accept(t9, Integer.valueOf((int) f3));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, long j3) {
        JDKUtils.UNSAFE.putInt(t9, this.fieldOffset, (int) j3);
    }
}
