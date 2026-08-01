package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterInt16<T> extends FieldWriter<T> {
    public FieldWriterInt16(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t10) {
        return this.propertyAccessor.getObject(t10);
    }

    public short getFieldValueShort(T t10) {
        if (t10 != null) {
            return this.propertyAccessor.getShortValue(t10);
        }
        C1607k.m6296a("field.get error, ", this.fieldName);
        return (short) 0;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        return cls == this.fieldClass ? ObjectWriterImplInt16.INSTANCE : jSONWriter.getObjectWriter(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Short sh = (Short) this.propertyAccessor.getObject(t10);
            if (sh == null) {
                return writeIntNull(jSONWriter);
            }
            writeInt16(jSONWriter, sh.shortValue());
            return true;
        } catch (RuntimeException e10) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e10;
        }
    }

    public final void writeInt16(JSONWriter jSONWriter, short s10) {
        long features = jSONWriter.getFeatures(this.features);
        if (s10 == 0 && (JSONWriter.Feature.NotWriteDefaultValue.mask & features) != 0 && this.defaultValue == null) {
            return;
        }
        if ((features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            writeFieldName(jSONWriter);
            jSONWriter.writeString(Short.toString(s10));
        } else {
            writeFieldName(jSONWriter);
            jSONWriter.writeInt16(s10);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        Short sh = (Short) this.propertyAccessor.getObject(t10);
        if (sh == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt32(sh.shortValue());
        }
    }
}
