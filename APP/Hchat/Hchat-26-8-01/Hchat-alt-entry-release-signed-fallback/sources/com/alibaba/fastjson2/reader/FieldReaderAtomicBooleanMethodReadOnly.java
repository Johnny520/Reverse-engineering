package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderAtomicBooleanMethodReadOnly<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    public FieldReaderAtomicBooleanMethodReadOnly(java.lang.String r13, java.lang.Class r14, int r15, java.lang.reflect.Method r16) {
            r12 = this;
            r9 = 0
            r11 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r14
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.Exception -> L1b
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L1b
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3     // Catch: java.lang.Exception -> L1b
            boolean r0 = r4 instanceof java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Exception -> L1b
            if (r0 == 0) goto L1d
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4     // Catch: java.lang.Exception -> L1b
            boolean r4 = r4.get()     // Catch: java.lang.Exception -> L1b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L27
        L1d:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L1b
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L1b
            r3.set(r4)     // Catch: java.lang.Exception -> L1b
            return
        L27:
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

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.Boolean r1 = r1.readBool()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r1, T r2) {
            r0 = this;
            java.lang.Boolean r1 = r1.readBool()
            r0.accept(r2, r1)
            return
    }
}
