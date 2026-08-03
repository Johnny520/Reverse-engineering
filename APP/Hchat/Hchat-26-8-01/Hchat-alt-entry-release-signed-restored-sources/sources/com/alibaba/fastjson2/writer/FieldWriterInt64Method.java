package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt64Method<T> extends FieldWriterInt64<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterInt64Method(String str, int i9, long j3, String str2, String str3, Method method, Field field, Class cls) {
        super(str, i9, j3, str2, str3, cls, field, method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t9) {
        try {
            return this.method.invoke(t9, null);
        } catch (IllegalAccessException e6) {
            e = e6;
            C0086a.m456o("invoke getter method error, ", this.fieldName, e);
            return null;
        } catch (IllegalArgumentException e7) {
            e = e7;
            C0086a.m456o("invoke getter method error, ", this.fieldName, e);
            return null;
        } catch (InvocationTargetException e10) {
            e = e10;
            Throwable cause = e.getCause();
            String str = "invoke getter method error, " + this.fieldName;
            if (cause != null) {
                e = cause;
            }
            throw new JSONException(str, e);
        }
    }
}
