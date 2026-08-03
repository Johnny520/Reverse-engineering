package com.alibaba.fastjson2.writer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBoolField extends FieldWriterBoolean {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterBoolField(String str, int i9, long j3, String str2, String str3, Field field, Method method, Class cls) {
        super(str, i9, j3, str2, str3, cls, cls, field, method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        if (obj == null) {
            C0086a.m450i(this.fieldName, "field.get error, ");
            return null;
        }
        try {
            return this.field.get(obj);
        } catch (IllegalAccessException | IllegalArgumentException e6) {
            C0086a.m456o("field.get error, ", this.fieldName, e6);
            return null;
        }
    }
}
