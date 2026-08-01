package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterInt64<T> extends FieldWriter<T> {
    final boolean browserCompatible;

    public FieldWriterInt64(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i10, j10, str2, locale, str3, type, cls, field, method, obj);
        this.browserCompatible = (j10 & JSONWriter.Feature.BrowserCompatible.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t10) {
        return this.propertyAccessor.getObject(t10);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Long l10 = (Long) this.propertyAccessor.getObject(t10);
            if (l10 != null) {
                writeInt64(jSONWriter, l10.longValue());
                return true;
            }
            if ((16777296 & features) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeInt64Null(features);
            return true;
        } catch (RuntimeException e10) {
            if ((features & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                return false;
            }
            throw e10;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeInt64(JSONWriter jSONWriter, long j10) {
        long features = jSONWriter.getFeatures() | this.features;
        if (j10 == 0 && (JSONWriter.Feature.NotWriteDefaultValue.mask & features) != 0 && this.defaultValue == null) {
            return;
        }
        boolean z10 = false;
        boolean z11 = (features & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0;
        writeFieldName(jSONWriter);
        if (!z11) {
            if (this.browserCompatible && !TypeUtils.isJavaScriptSupport(j10) && !jSONWriter.jsonb) {
                z10 = true;
            }
            z11 = z10;
        }
        if (z11) {
            jSONWriter.writeString(j10);
        } else {
            jSONWriter.writeInt64(j10);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        Long l10 = (Long) this.propertyAccessor.getObject(t10);
        if (l10 == null) {
            jSONWriter.writeNumberNull();
        } else {
            jSONWriter.writeInt64(l10);
        }
    }
}
