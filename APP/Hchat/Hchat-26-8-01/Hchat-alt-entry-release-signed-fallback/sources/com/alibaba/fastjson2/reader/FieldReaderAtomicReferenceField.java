package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderAtomicReferenceField<T> extends com.alibaba.fastjson2.reader.FieldReaderAtomicReference<T> {
    final boolean readOnly;

    public FieldReaderAtomicReferenceField(java.lang.String r11, java.lang.reflect.Type r12, java.lang.Class r13, int r14, java.lang.String r15, java.lang.reflect.Field r16) {
            r10 = this;
            r5 = 0
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r7 = r15
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            int r11 = r16.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isFinal(r11)
            r10.readOnly = r11
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r2.readOnly     // Catch: java.lang.Exception -> L13
            java.lang.reflect.Field r1 = r2.field
            if (r0 == 0) goto L15
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Exception -> L13
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3     // Catch: java.lang.Exception -> L13
            r3.set(r4)     // Catch: java.lang.Exception -> L13
            return
        L13:
            r3 = move-exception
            goto L1e
        L15:
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch: java.lang.Exception -> L13
            r0.<init>(r4)     // Catch: java.lang.Exception -> L13
            r1.set(r3, r0)     // Catch: java.lang.Exception -> L13
            return
        L1e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r4.<init>(r0)
            java.lang.String r0 = r2.fieldName
            java.lang.String r1 = " error"
            java.lang.String r4 = eh.a.r(r4, r0, r1)
            ah.a.x(r4, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
            r1 = this;
            r0 = 1
            return r0
    }
}
