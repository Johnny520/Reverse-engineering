package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterInt64<T> extends FieldWriter<T> {
    final boolean browserCompatible;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterInt64(String str, int i9, long j3, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i9, j3, str2, str3, cls, cls, field, method);
        this.browserCompatible = (JSONWriter.Feature.BrowserCompatible.mask & j3) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        try {
            Long l10 = (Long) getFieldValue(t9);
            if (l10 != null) {
                writeInt64(jSONWriter, l10.longValue());
                return true;
            }
            long features = this.features | jSONWriter.getFeatures();
            long j3 = JSONWriter.Feature.WriteNulls.mask;
            JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
            long j4 = j3 | feature.mask;
            JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
            if (((j4 | feature2.mask) & features) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            if ((features & (feature.mask | feature2.mask)) != 0) {
                jSONWriter.writeInt64(0L);
            } else {
                jSONWriter.writeNull();
            }
            return true;
        } catch (RuntimeException e6) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeInt64(JSONWriter jSONWriter, long j3) {
        boolean z9 = false;
        boolean z10 = ((jSONWriter.getFeatures() | this.features) & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0;
        writeFieldName(jSONWriter);
        if (!z10) {
            if (this.browserCompatible && !jSONWriter.jsonb && (j3 > 9007199254740991L || j3 < -9007199254740991L)) {
                z9 = true;
            }
            z10 = z9;
        }
        if (z10) {
            jSONWriter.writeString(Long.toString(j3));
        } else {
            jSONWriter.writeInt64(j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        Long l10 = (Long) getFieldValue(t9);
        if (l10 == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeInt64(l10);
        }
    }
}
