package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterInt8<T> extends FieldWriter<T> {
    public FieldWriterInt8(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t10) {
        return this.propertyAccessor.getObject(t10);
    }

    public byte getFieldValueByte(T t10) {
        if (t10 != null) {
            return this.propertyAccessor.getByteValue(t10);
        }
        C1607k.m6296a("field.get error, ", this.fieldName);
        return (byte) 0;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Byte b10 = (Byte) this.propertyAccessor.getObject(t10);
            if (b10 == null) {
                return writeIntNull(jSONWriter);
            }
            writeInt8(jSONWriter, b10.byteValue());
            return true;
        } catch (RuntimeException e10) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e10;
        }
    }

    public final boolean writeInt8(JSONWriter jSONWriter, byte b10) {
        long features = jSONWriter.getFeatures(this.features);
        if (b10 == 0 && (JSONWriter.Feature.NotWriteDefaultValue.mask & features) != 0 && this.defaultValue == null) {
            return false;
        }
        boolean z10 = (features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        writeFieldName(jSONWriter);
        if (z10) {
            jSONWriter.writeString(Byte.toString(b10));
        } else {
            jSONWriter.writeInt8(b10);
        }
        return true;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        Byte b10 = (Byte) this.propertyAccessor.getObject(t10);
        if (b10 == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt32(b10.byteValue());
        }
    }
}
