package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterChar<T> extends FieldWriter<T> {
    public FieldWriterChar(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, obj);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t10) {
        return this.propertyAccessor.getObject(t10);
    }

    public char getFieldValueChar(T t10) {
        if (t10 != null) {
            return this.propertyAccessor.getCharValue(t10);
        }
        C1607k.m6296a("field.get error, ", this.fieldName);
        return (char) 0;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Character ch = (Character) this.propertyAccessor.getObject(t10);
            if (ch != null) {
                return writeChar(jSONWriter, ch.charValue());
            }
            if ((80 & features) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            if ((features & 64) == 0) {
                jSONWriter.writeNull();
                return true;
            }
            jSONWriter.writeString("\u0000");
            return true;
        } catch (RuntimeException e10) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e10;
        }
    }

    public final boolean writeChar(JSONWriter jSONWriter, char c10) {
        if (c10 == 0 && (jSONWriter.getFeatures(this.features) & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0 && this.defaultValue == null) {
            return false;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeChar(c10);
        return true;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        Character ch = (Character) this.propertyAccessor.getObject(t10);
        if (ch == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeChar(ch.charValue());
        }
    }
}
