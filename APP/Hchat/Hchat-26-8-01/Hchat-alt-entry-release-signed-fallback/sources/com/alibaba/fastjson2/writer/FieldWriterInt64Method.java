package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt64Method<T> extends com.alibaba.fastjson2.writer.FieldWriterInt64<T> {
    public FieldWriterInt64Method(java.lang.String r11, int r12, long r13, java.lang.String r15, java.lang.String r16, java.lang.reflect.Method r17, java.lang.reflect.Field r18, java.lang.Class r19) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r6 = r16
            r9 = r17
            r8 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(T r5) {
            r4 = this;
            java.lang.String r0 = "invoke getter method error, "
            java.lang.reflect.Method r1 = r4.method     // Catch: java.lang.IllegalAccessException -> La java.lang.IllegalArgumentException -> Lc java.lang.reflect.InvocationTargetException -> Le
            r2 = 0
            java.lang.Object r5 = r1.invoke(r5, r2)     // Catch: java.lang.IllegalAccessException -> La java.lang.IllegalArgumentException -> Lc java.lang.reflect.InvocationTargetException -> Le
            return r5
        La:
            r5 = move-exception
            goto L10
        Lc:
            r5 = move-exception
            goto L10
        Le:
            r5 = move-exception
            goto L17
        L10:
            java.lang.String r1 = r4.fieldName
            ah.a.o(r0, r1, r5)
            r5 = 0
            return r5
        L17:
            java.lang.Throwable r1 = r5.getCause()
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r4.fieldName
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            if (r1 == 0) goto L2e
            r5 = r1
        L2e:
            r2.<init>(r0, r5)
            throw r2
    }
}
