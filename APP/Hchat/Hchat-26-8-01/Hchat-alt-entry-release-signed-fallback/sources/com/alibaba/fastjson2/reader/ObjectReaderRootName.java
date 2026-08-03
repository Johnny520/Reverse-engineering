package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderRootName<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    protected final java.lang.String rootName;
    protected final long rootNameHashCode;

    public ObjectReaderRootName(java.lang.Class r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, long r18, java.util.function.Supplier r20, java.util.function.Function r21, java.lang.Class[] r22, java.lang.String[] r23, java.lang.Class r24, com.alibaba.fastjson2.reader.FieldReader[] r25) {
            r13 = this;
            r0 = r17
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r18
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r13.rootName = r0
            if (r0 != 0) goto L1f
            r14 = 0
            goto L23
        L1f:
            long r14 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
        L23:
            r13.rootNameHashCode = r14
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(java.util.Map r2, long r3) {
            r1 = this;
            java.lang.String r0 = r1.rootName
            java.lang.Object r2 = r2.get(r0)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.lang.Object r2 = super.createInstance(r2, r3)
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            boolean r0 = r7.nextIfNullOrEmptyString()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r7.nextIfObjectStart()
            if (r0 == 0) goto L37
        Le:
            boolean r0 = r7.nextIfObjectEnd()
            if (r0 == 0) goto L15
            return r1
        L15:
            long r2 = r6.rootNameHashCode
            long r4 = r7.readFieldNameHashCode()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L2a
            java.lang.Object r0 = super.readJSONBObject(r7, r8, r9, r10)
            r2 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r1 = r0
            goto L32
        L2a:
            r2 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r8.skipValue()
        L32:
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r2
            goto Le
        L37:
            r8 = r7
            r7 = r6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "read rootName error "
            r9.<init>(r10)
            java.lang.String r10 = r7.typeName
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r8 = r8.info(r9)
            ah.a.w(r8)
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            boolean r0 = r7.nextIfNullOrEmptyString()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r7.nextIfObjectStart()
            if (r0 == 0) goto L37
        Le:
            boolean r0 = r7.nextIfObjectEnd()
            if (r0 == 0) goto L15
            return r1
        L15:
            long r2 = r6.rootNameHashCode
            long r4 = r7.readFieldNameHashCode()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L2a
            java.lang.Object r0 = super.readObject(r7, r8, r9, r10)
            r2 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r1 = r0
            goto L32
        L2a:
            r2 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r8.skipValue()
        L32:
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r2
            goto Le
        L37:
            r8 = r7
            r7 = r6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "read rootName error "
            r9.<init>(r10)
            java.lang.String r10 = r7.typeName
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r8 = r8.info(r9)
            ah.a.w(r8)
            r8 = 0
            return r8
    }
}
