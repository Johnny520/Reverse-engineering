package com.alibaba.fastjson2.writer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterObjectMethod<T> extends FieldWriterObject<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterObjectMethod(String str, int i9, long j3, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i9, j3, str2, str3, type, cls, field, method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        try {
            return this.method.invoke(obj, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e6) {
            C0086a.m456o("invoke getter method error, ", this.fieldName, e6);
            return null;
        }
    }
}
