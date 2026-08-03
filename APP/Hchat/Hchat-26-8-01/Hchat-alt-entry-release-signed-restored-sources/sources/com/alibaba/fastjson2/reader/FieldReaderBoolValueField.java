package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderBoolValueField<T> extends FieldReader<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderBoolValueField(String str, int i9, long j3, String str2, Boolean bool, Field field) {
        Class cls = Boolean.TYPE;
        super(str, cls, cls, i9, j3, str2, null, bool, null, field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        if (obj == null) {
            if ((this.features & JSONReader.Feature.IgnoreSetNullValue.mask) != 0) {
                return;
            }
            accept((Object) t9, false);
        } else if (obj instanceof Boolean) {
            accept(t9, ((Boolean) obj).booleanValue());
        } else {
            C0086a.m454m("set ", this.fieldName, " error, type not support ", obj.getClass());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        try {
            this.field.setBoolean(t9, jSONReader.readBoolValue());
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0255e.m1024m(new StringBuilder("set "), this.fieldName, " error", jSONReader), e6);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        return Boolean.valueOf(jSONReader.readBoolValue());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, int i9) {
        accept(t9, TypeUtils.toBooleanValue(Integer.valueOf(i9)));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, boolean z9) {
        long j3 = this.fieldOffset;
        if (j3 != -1) {
            JDKUtils.UNSAFE.putBoolean(t9, j3, z9);
            return;
        }
        try {
            this.field.setBoolean(t9, z9);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }
}
