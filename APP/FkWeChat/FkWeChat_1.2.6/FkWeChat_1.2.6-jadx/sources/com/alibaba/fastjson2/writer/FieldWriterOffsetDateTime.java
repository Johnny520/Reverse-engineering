package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterOffsetDateTime<T> extends FieldWriterObjectFinal<T> {
    public FieldWriterOffsetDateTime(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Function function) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, function);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObjectFinal, com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        OffsetDateTime offsetDateTime = (OffsetDateTime) this.propertyAccessor.getObject(t10);
        if (offsetDateTime == null) {
            if (((this.features | jSONWriter.getFeatures()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeNull();
            return true;
        }
        writeFieldName(jSONWriter);
        if (this.objectWriter == null) {
            this.objectWriter = getObjectWriter(jSONWriter, OffsetDateTime.class);
        }
        if (this.objectWriter != ObjectWriterImplOffsetDateTime.INSTANCE) {
            this.objectWriter.write(jSONWriter, offsetDateTime, this.fieldName, ((FieldWriterObjectFinal) this).fieldClass, this.features);
        } else {
            jSONWriter.writeOffsetDateTime(offsetDateTime);
        }
        return true;
    }
}
