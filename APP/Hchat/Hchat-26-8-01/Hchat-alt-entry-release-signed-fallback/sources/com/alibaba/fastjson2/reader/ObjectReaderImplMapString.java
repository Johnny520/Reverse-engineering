package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplMapString extends com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped {
    public ObjectReaderImplMapString(java.lang.Class r9, java.lang.Class r10, long r11) {
            r8 = this;
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r7 = 0
            r3 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r9, java.lang.reflect.Type r10, java.lang.Object r11, long r12) {
            r8 = this;
            boolean r0 = r9.jsonb
            if (r0 == 0) goto L9
            java.lang.Object r9 = r8.readJSONBObject(r9, r10, r11, r12)
            return r9
        L9:
            boolean r10 = r9.nextIfObjectStart()
            if (r10 != 0) goto L4d
            char r10 = r9.current()
            r0 = 91
            if (r10 != r0) goto L43
            r9.next()
            char r10 = r9.current()
            r0 = 123(0x7b, float:1.72E-43)
            if (r10 != r0) goto L36
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            java.lang.Object r9 = r1.readObject(r2, r3, r4, r5)
            boolean r10 = r2.nextIfArrayEnd()
            if (r10 == 0) goto L38
            r2.nextIfComma()
            return r9
        L36:
            r1 = r8
            r2 = r9
        L38:
            java.lang.String r9 = "expect '{', but '['"
            java.lang.String r9 = r2.info(r9)
            ah.a.w(r9)
            r9 = 0
            return r9
        L43:
            r1 = r8
            r2 = r9
            boolean r9 = r2.nextIfNullOrEmptyString()
            if (r9 == 0) goto L4f
            r9 = 0
            return r9
        L4d:
            r1 = r8
            r2 = r9
        L4f:
            com.alibaba.fastjson2.JSONReader$Context r9 = r2.context
            java.lang.Class r10 = r1.instanceType
            java.lang.Class<java.util.HashMap> r11 = java.util.HashMap.class
            if (r10 != r11) goto L5d
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            goto L66
        L5d:
            long r10 = r9.features
            long r10 = r10 | r12
            java.lang.Object r10 = r8.createInstance(r10)
            java.util.Map r10 = (java.util.Map) r10
        L66:
            long r3 = r9.features
            long r11 = r12 | r3
            r9 = 0
        L6b:
            boolean r13 = r2.nextIfObjectEnd()
            if (r13 == 0) goto L75
            r2.nextIfComma()
            return r10
        L75:
            java.lang.String r13 = r2.readFieldName()
            java.lang.String r0 = r2.readString()
            r3 = 0
            if (r9 != 0) goto L95
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r5 = r5.mask
            long r5 = r5 & r11
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L95
            java.lang.String r5 = r8.getTypeKey()
            boolean r5 = r13.equals(r5)
            if (r5 == 0) goto L95
            goto Lc5
        L95:
            if (r0 != 0) goto La1
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r5 = r5.mask
            long r5 = r5 & r11
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto La1
            goto Lc5
        La1:
            java.lang.Object r5 = r10.put(r13, r0)
            if (r5 == 0) goto Lc5
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.DuplicateKeyValueAsArray
            long r6 = r6.mask
            long r6 = r6 & r11
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto Lc5
            boolean r3 = r5 instanceof java.util.Collection
            if (r3 == 0) goto Lbe
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r0)
            r10.put(r13, r5)
            goto Lc5
        Lbe:
            com.alibaba.fastjson2.JSONArray r0 = com.alibaba.fastjson2.JSONArray.of(r5, r0)
            r10.put(r13, r0)
        Lc5:
            int r9 = r9 + 1
            goto L6b
    }
}
