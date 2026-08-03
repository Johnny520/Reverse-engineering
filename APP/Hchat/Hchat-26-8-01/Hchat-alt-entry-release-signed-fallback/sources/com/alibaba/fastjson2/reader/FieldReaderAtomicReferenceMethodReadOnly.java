package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderAtomicReferenceMethodReadOnly<T> extends com.alibaba.fastjson2.reader.FieldReaderAtomicReference<T> {
    public FieldReaderAtomicReferenceMethodReadOnly(java.lang.String r11, java.lang.reflect.Type r12, java.lang.Class r13, int r14, java.lang.reflect.Method r15) {
            r10 = this;
            r7 = 0
            r9 = 0
            r5 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.Exception -> L10
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L10
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3     // Catch: java.lang.Exception -> L10
            r3.set(r4)     // Catch: java.lang.Exception -> L10
            return
        L10:
            r3 = move-exception
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
