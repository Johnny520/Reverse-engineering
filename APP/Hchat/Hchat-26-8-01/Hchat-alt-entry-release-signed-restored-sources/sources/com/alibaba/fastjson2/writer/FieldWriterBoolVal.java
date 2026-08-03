package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterBoolVal extends FieldWriterBoolean {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterBoolVal(String str, int i9, long j3, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i9, j3, str2, str3, type, cls, field, method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriterBoolean, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, Object obj) {
        try {
            boolean zBooleanValue = ((Boolean) getFieldValue(obj)).booleanValue();
            if (!zBooleanValue && ((this.features | jSONWriter.getFeatures()) & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                return false;
            }
            writeBool(jSONWriter, zBooleanValue);
            return true;
        } catch (RuntimeException e6) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e6;
        }
    }
}
