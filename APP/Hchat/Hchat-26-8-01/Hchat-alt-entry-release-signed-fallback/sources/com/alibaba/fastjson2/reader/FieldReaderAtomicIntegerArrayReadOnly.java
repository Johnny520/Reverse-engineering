package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderAtomicIntegerArrayReadOnly<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    public FieldReaderAtomicIntegerArrayReadOnly(java.lang.String r13, java.lang.Class r14, int r15, java.lang.reflect.Method r16) {
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
            goto L3b
        L3:
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.Exception -> L23
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L23
            java.util.concurrent.atomic.AtomicIntegerArray r3 = (java.util.concurrent.atomic.AtomicIntegerArray) r3     // Catch: java.lang.Exception -> L23
            boolean r0 = r4 instanceof java.util.concurrent.atomic.AtomicIntegerArray     // Catch: java.lang.Exception -> L23
            r1 = 0
            if (r0 == 0) goto L25
            java.util.concurrent.atomic.AtomicIntegerArray r4 = (java.util.concurrent.atomic.AtomicIntegerArray) r4     // Catch: java.lang.Exception -> L23
        L13:
            int r0 = r4.length()     // Catch: java.lang.Exception -> L23
            if (r1 >= r0) goto L3b
            int r0 = r4.get(r1)     // Catch: java.lang.Exception -> L23
            r3.set(r1, r0)     // Catch: java.lang.Exception -> L23
            int r1 = r1 + 1
            goto L13
        L23:
            r3 = move-exception
            goto L3c
        L25:
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Exception -> L23
        L27:
            int r0 = r4.size()     // Catch: java.lang.Exception -> L23
            if (r1 >= r0) goto L3b
            java.lang.Object r0 = r4.get(r1)     // Catch: java.lang.Exception -> L23
            int r0 = com.alibaba.fastjson2.util.TypeUtils.toIntValue(r0)     // Catch: java.lang.Exception -> L23
            r3.set(r1, r0)     // Catch: java.lang.Exception -> L23
            int r1 = r1 + 1
            goto L27
        L3b:
            return
        L3c:
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
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r2) {
            r1 = this;
            boolean r0 = r2.nextIfNull()
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.util.List r2 = r2.readArray(r0)
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r4, T r5) {
            r3 = this;
            boolean r0 = r4.readIfNull()
            if (r0 == 0) goto L7
            goto L30
        L7:
            java.lang.reflect.Method r0 = r3.method     // Catch: java.lang.Exception -> L31
            r1 = 0
            java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Exception -> L31
            java.util.concurrent.atomic.AtomicIntegerArray r5 = (java.util.concurrent.atomic.AtomicIntegerArray) r5     // Catch: java.lang.Exception -> L31
            boolean r0 = r4.nextIfArrayStart()
            if (r0 == 0) goto L30
            r0 = 0
        L17:
            boolean r1 = r4.nextIfArrayEnd()
            if (r1 == 0) goto L1e
            goto L30
        L1e:
            int r1 = r4.readInt32Value()
            if (r5 == 0) goto L2d
            int r2 = r5.length()
            if (r0 >= r2) goto L2d
            r5.set(r0, r1)
        L2d:
            int r0 = r0 + 1
            goto L17
        L30:
            return
        L31:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "set "
            r0.<init>(r1)
            java.lang.String r1 = r3.fieldName
            java.lang.String r2 = " error"
            java.lang.String r4 = bc.e.m(r0, r1, r2, r4)
            ah.a.x(r4, r5)
            return
    }
}
