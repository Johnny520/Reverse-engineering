package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplClass extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplClass INSTANCE = null;
    static final long TYPE_HASH = 0;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplClass r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplClass
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplClass.INSTANCE = r0
            java.lang.String r0 = "java.lang.Class"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplClass.TYPE_HASH = r0
            return
    }

    public ObjectReaderImplClass() {
            r1 = this;
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            r0 = -110(0xffffffffffffff92, float:NaN)
            boolean r0 = r7.nextIfMatch(r0)
            if (r0 == 0) goto L12
            long r0 = r7.readTypeHashCode()
            long r2 = com.alibaba.fastjson2.reader.ObjectReaderImplClass.TYPE_HASH
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto L33
        L18:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "not support autoType : "
            r8.<init>(r9)
            java.lang.String r9 = r7.getString()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r7 = r7.info(r8)
            ah.a.w(r7)
            r7 = 0
            return r7
        L33:
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            return r7
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            long r1 = r7.readValueHashCode()
            com.alibaba.fastjson2.JSONReader$Context r8 = r7.context
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r0 = r8.getContextAutoTypeBeforeHandler()
            if (r0 == 0) goto L22
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r4 = r10
            java.lang.Class r9 = r0.apply(r1, r3, r4)
            if (r9 != 0) goto L1f
            java.lang.String r9 = r7.getString()
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            java.lang.Class r9 = r0.apply(r9, r10, r4)
        L1f:
            if (r9 == 0) goto L23
            return r9
        L22:
            r4 = r10
        L23:
            java.lang.String r9 = r7.getString()
            long r10 = r8.features
            long r10 = r10 | r4
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportClassForName
            long r0 = r0.mask
            long r10 = r10 & r0
            r0 = 0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 == 0) goto L61
            java.lang.Class r10 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r9)
            if (r10 == 0) goto L3c
            return r10
        L3c:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r8 = r8.provider
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r10 = r10.mask
            r0 = 0
            java.lang.Class r8 = r8.checkAutoType(r9, r0, r10)
            if (r8 == 0) goto L4a
            return r8
        L4a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "class not found "
            r8.<init>(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r7 = r7.info(r8)
            ah.a.w(r7)
        L5f:
            r7 = 0
            return r7
        L61:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "not support ClassForName : "
            r8.<init>(r10)
            r8.append(r9)
            java.lang.String r9 = ", you can config 'JSONReader.Feature.SupportClassForName'"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r7 = r7.info(r8)
            ah.a.w(r7)
            goto L5f
    }
}
