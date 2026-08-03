package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterInt16<T> extends FieldWriter<T> {
    final boolean writeNonStringValueAsString;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterInt16(String str, int i9, long j3, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i9, j3, str2, str3, cls, cls, field, method);
        this.writeNonStringValueAsString = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        return ObjectWriterImplInt16.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        try {
            Short sh2 = (Short) getFieldValue(t9);
            if (sh2 == null) {
                return writeIntNull(jSONWriter);
            }
            writeInt16(jSONWriter, sh2.shortValue());
            return true;
        } catch (RuntimeException e6) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeInt16(JSONWriter jSONWriter, short s10) {
        writeFieldName(jSONWriter);
        if (this.writeNonStringValueAsString) {
            jSONWriter.writeString(s10);
        } else {
            jSONWriter.writeInt16(s10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        Short sh2 = (Short) getFieldValue(t9);
        if (sh2 == null) {
            jSONWriter.writeNumberNull();
            return;
        }
        short sShortValue = sh2.shortValue();
        if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(sShortValue);
        } else {
            jSONWriter.writeInt16(sShortValue);
        }
    }
}
