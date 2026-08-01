package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterInt32<T> extends FieldWriter<T> {
    final boolean toString;

    public FieldWriterInt32(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, obj);
        this.toString = (j10 & 256) != 0 || "string".equals(str2);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t10) {
        try {
            return this.propertyAccessor.getObject(t10);
        } catch (Throwable th) {
            throw errorOnGet(th);
        }
    }

    public int getFieldValueInt(T t10) {
        if (t10 != null) {
            return this.propertyAccessor.getIntValue(t10);
        }
        C1569c.m6258a("field.get error, ".concat(this.fieldName));
        return 0;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        return cls == this.fieldClass ? ObjectWriterImplInt32.INSTANCE : jSONWriter.getObjectWriter(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Integer num = (Integer) this.propertyAccessor.getObject(t10);
            if (num == null) {
                return writeIntNull(jSONWriter);
            }
            writeInt32(jSONWriter, num.intValue());
            return true;
        } catch (RuntimeException e10) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e10;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeInt32(JSONWriter jSONWriter, int i10) {
        long features = jSONWriter.getFeatures() | this.features;
        if (i10 == 0 && (features & JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE) != 0 && this.defaultValue == null) {
            return;
        }
        if (this.toString) {
            writeFieldName(jSONWriter);
            jSONWriter.writeString(Integer.toString(i10));
            return;
        }
        writeFieldName(jSONWriter);
        String str = this.format;
        if (str != null) {
            jSONWriter.writeInt32(i10, str);
        } else {
            jSONWriter.writeInt32(i10);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        Integer num = (Integer) this.propertyAccessor.getObject(t10);
        if (num == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt32(num);
        }
    }
}
