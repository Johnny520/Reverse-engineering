package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplListInt64 implements com.alibaba.fastjson2.reader.ObjectReader {
    final java.lang.Class instanceType;
    final long instanceTypeHash;
    final java.lang.Class listType;

    public ObjectReaderImplListInt64(java.lang.Class r1, java.lang.Class r2) {
            r0 = this;
            r0.<init>()
            r0.listType = r1
            r0.instanceType = r2
            java.lang.String r1 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r2)
            long r1 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
            r0.instanceTypeHash = r1
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(long r1) {
            r0 = this;
            java.lang.Class r1 = r0.instanceType
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            if (r1 != r2) goto Lc
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
        Lc:
            java.lang.Class<java.util.LinkedList> r2 = java.util.LinkedList.class
            if (r1 != r2) goto L16
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            return r1
        L16:
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            java.lang.String r1 = "create list error, type "
            java.lang.Class r2 = r0.instanceType
            ah.a.i(r2, r1)
            r1 = 0
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r1, long r2) {
            r0 = this;
            java.lang.Object r2 = r0.createInstance(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r1.next()
            java.lang.Long r3 = com.alibaba.fastjson2.util.TypeUtils.toLong(r3)
            r2.add(r3)
            goto La
        L1c:
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            boolean r8 = r7.nextIfNull()
            if (r8 == 0) goto L8
            r7 = 0
            return r7
        L8:
            java.lang.Class r1 = r6.listType
            long r2 = r6.instanceTypeHash
            r0 = r7
            r4 = r10
            com.alibaba.fastjson2.reader.ObjectReader r7 = r0.checkAutoType(r1, r2, r4)
            if (r7 == 0) goto L18
            java.lang.Class r1 = r7.getObjectClass()
        L18:
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            if (r1 != r8) goto L22
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L44
        L22:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r8 = com.alibaba.fastjson2.JSONArray.class
            if (r1 != r8) goto L2c
            com.alibaba.fastjson2.JSONArray r8 = new com.alibaba.fastjson2.JSONArray
            r8.<init>()
            goto L44
        L2c:
            if (r1 == 0) goto L39
            java.lang.Class r8 = r6.listType
            if (r1 == r8) goto L39
            java.lang.Object r8 = r7.createInstance(r4)
            java.util.Collection r8 = (java.util.Collection) r8
            goto L44
        L39:
            com.alibaba.fastjson2.JSONReader$Context r8 = r0.context
            long r8 = r8.features
            long r8 = r8 | r4
            java.lang.Object r8 = r6.createInstance(r8)
            java.util.Collection r8 = (java.util.Collection) r8
        L44:
            int r9 = r0.startArray()
            r10 = 0
        L49:
            if (r10 >= r9) goto L55
            java.lang.Long r11 = r0.readInt64()
            r8.add(r11)
            int r10 = r10 + 1
            goto L49
        L55:
            if (r7 == 0) goto L64
            java.util.function.Function r7 = r7.getBuildFunction()
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.apply(r8)
            java.util.Collection r7 = (java.util.Collection) r7
            return r7
        L64:
            return r8
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r8, java.lang.reflect.Type r9, java.lang.Object r10, long r11) {
            r7 = this;
            boolean r0 = r8.jsonb
            if (r0 == 0) goto Lf
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r8 = r1.readJSONBObject(r2, r3, r4, r5)
            return r8
        Lf:
            r1 = r7
            r2 = r8
            boolean r8 = r2.readIfNull()
            if (r8 == 0) goto L19
            r8 = 0
            return r8
        L19:
            boolean r8 = r2.isString()
            r9 = 44
            if (r8 == 0) goto L61
            com.alibaba.fastjson2.JSONReader$Context r8 = r2.context
            long r3 = r8.features
            long r10 = r3 | r11
            java.lang.Object r8 = r7.createInstance(r10)
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.String r10 = r2.readString()
            int r9 = r10.indexOf(r9)
            r11 = -1
            if (r9 == r11) goto L52
            java.lang.String r9 = ","
            java.lang.String[] r9 = r10.split(r9)
            int r10 = r9.length
            r11 = 0
        L40:
            if (r11 >= r10) goto L5d
            r12 = r9[r11]
            long r3 = java.lang.Long.parseLong(r12)
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r8.add(r12)
            int r11 = r11 + 1
            goto L40
        L52:
            long r9 = java.lang.Long.parseLong(r10)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8.add(r9)
        L5d:
            r2.nextIfComma()
            return r8
        L61:
            boolean r8 = r2.nextIfSet()
            char r10 = r2.current()
            r0 = 91
            if (r10 != r0) goto Lbc
            r2.next()
            if (r8 == 0) goto L7e
            java.lang.Class r8 = r1.instanceType
            java.lang.Class<java.util.Collection> r10 = java.util.Collection.class
            if (r8 != r10) goto L7e
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            goto L8a
        L7e:
            com.alibaba.fastjson2.JSONReader$Context r8 = r2.context
            long r3 = r8.features
            long r10 = r3 | r11
            java.lang.Object r8 = r7.createInstance(r10)
            java.util.Collection r8 = (java.util.Collection) r8
        L8a:
            boolean r10 = r2.isEnd()
            java.lang.String r11 = "illegal input error"
            if (r10 != 0) goto Lb3
            boolean r10 = r2.nextIfArrayEnd()
            if (r10 == 0) goto L9c
            r2.nextIfComma()
            return r8
        L9c:
            char r10 = r2.current()
            if (r10 == r9) goto Laa
            java.lang.Long r10 = r2.readInt64()
            r8.add(r10)
            goto L8a
        Laa:
            java.lang.String r8 = r2.info(r11)
            ah.a.w(r8)
            r8 = 0
            return r8
        Lb3:
            java.lang.String r8 = r2.info(r11)
            ah.a.w(r8)
            r8 = 0
            return r8
        Lbc:
            java.lang.String r8 = "format error"
            java.lang.String r8 = r2.info(r8)
            ah.a.w(r8)
            r8 = 0
            return r8
    }
}
