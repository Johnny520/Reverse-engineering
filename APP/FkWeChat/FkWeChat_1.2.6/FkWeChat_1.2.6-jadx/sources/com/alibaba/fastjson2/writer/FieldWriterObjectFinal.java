package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class FieldWriterObjectFinal<T> extends FieldWriterObject<T> {
    final Class fieldClass;
    final Type fieldType;
    volatile ObjectWriter objectWriter;
    final boolean refDetect;

    public FieldWriterObjectFinal(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Function function) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, function);
        this.fieldType = type;
        this.fieldClass = cls;
        this.refDetect = !ObjectWriterProvider.isNotReferenceDetect(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        if (this.fieldClass != cls) {
            return super.getObjectWriter(jSONWriter, cls);
        }
        if (this.objectWriter != null) {
            return this.objectWriter;
        }
        ObjectWriter objectWriter = super.getObjectWriter(jSONWriter, cls);
        this.objectWriter = objectWriter;
        return objectWriter;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        FieldWriterObjectFinal<T> fieldWriterObjectFinal;
        JSONWriter jSONWriter2;
        try {
            Object fieldValue = getFieldValue(t10);
            if (fieldValue == null) {
                if (((this.features | jSONWriter.getFeatures()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask)) == 0) {
                    return false;
                }
                writeFieldName(jSONWriter);
                if (this.fieldClass.isArray()) {
                    jSONWriter.writeArrayNull();
                } else {
                    Class<?> cls = this.fieldClass;
                    if (cls == StringBuffer.class || cls == StringBuilder.class) {
                        jSONWriter.writeStringNull();
                    } else {
                        jSONWriter.writeObjectNull(cls);
                    }
                }
                return true;
            }
            ObjectWriter objectWriter = getObjectWriter(jSONWriter, this.fieldClass);
            if (this.unwrapped) {
                jSONWriter2 = jSONWriter;
                boolean zWriteWithUnwrapped = writeWithUnwrapped(jSONWriter2, fieldValue, this.features, this.refDetect, objectWriter);
                fieldWriterObjectFinal = this;
                objectWriter = objectWriter;
                if (zWriteWithUnwrapped) {
                    return true;
                }
            } else {
                fieldWriterObjectFinal = this;
                jSONWriter2 = jSONWriter;
            }
            writeFieldName(jSONWriter2);
            boolean z10 = jSONWriter2.jsonb;
            String str = fieldWriterObjectFinal.fieldName;
            if (z10) {
                objectWriter.writeJSONB(jSONWriter2, fieldValue, str, fieldWriterObjectFinal.fieldType, fieldWriterObjectFinal.features);
            } else {
                objectWriter.write(jSONWriter2, fieldValue, str, fieldWriterObjectFinal.fieldType, fieldWriterObjectFinal.features);
            }
            return true;
        } catch (RuntimeException e10) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e10;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        JSONWriter jSONWriter2;
        Object fieldValue = getFieldValue(t10);
        if (fieldValue == null) {
            jSONWriter.writeNull();
            return;
        }
        boolean z10 = this.refDetect && jSONWriter.isRefDetect();
        if (z10) {
            if (fieldValue == t10) {
                jSONWriter.writeReference("..");
                return;
            }
            String path = jSONWriter.setPath(this.fieldName, fieldValue);
            if (path != null) {
                jSONWriter.writeReference(path);
                jSONWriter.popPath(fieldValue);
                return;
            }
        }
        ObjectWriter objectWriter = getObjectWriter(jSONWriter, this.fieldClass);
        boolean z11 = (jSONWriter.getFeatures(this.features) & JSONWriter.Feature.BeanToArray.mask) != 0;
        if (jSONWriter.jsonb) {
            String str = this.fieldName;
            if (z11) {
                jSONWriter2 = jSONWriter;
                objectWriter.writeArrayMappingJSONB(jSONWriter2, fieldValue, str, this.fieldType, this.features);
            } else {
                jSONWriter2 = jSONWriter;
                objectWriter.writeJSONB(jSONWriter2, fieldValue, str, this.fieldType, this.features);
            }
        } else {
            String str2 = this.fieldName;
            if (z11) {
                jSONWriter2 = jSONWriter;
                objectWriter.writeArrayMapping(jSONWriter2, fieldValue, str2, this.fieldType, this.features);
            } else {
                jSONWriter2 = jSONWriter;
                objectWriter.write(jSONWriter2, fieldValue, str2, this.fieldType, this.features);
            }
        }
        if (z10) {
            jSONWriter2.popPath(fieldValue);
        }
    }
}
