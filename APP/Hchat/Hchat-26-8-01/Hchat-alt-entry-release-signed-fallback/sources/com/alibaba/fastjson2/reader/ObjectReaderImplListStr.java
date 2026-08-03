package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplListStr implements com.alibaba.fastjson2.reader.ObjectReader {
    final java.lang.Class instanceType;
    final java.lang.Class listType;

    public ObjectReaderImplListStr(java.lang.Class r1, java.lang.Class r2) {
            r0 = this;
            r0.<init>()
            r0.listType = r1
            r0.instanceType = r2
            return
    }

    public static /* synthetic */ java.util.Collection a(java.util.Collection r0) {
            java.util.Collection r0 = lambda$readJSONBObject$0(r0)
            return r0
    }

    public static /* synthetic */ java.util.Collection b(java.util.Collection r0) {
            java.util.Collection r0 = lambda$readJSONBObject$1(r0)
            return r0
    }

    private static /* synthetic */ java.util.Collection lambda$readJSONBObject$0(java.util.Collection r0) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Set r0 = java.util.Collections.singleton(r0)
            return r0
    }

    private static /* synthetic */ java.util.Collection lambda$readJSONBObject$1(java.util.Collection r0) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
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
    public java.lang.Object createInstance(java.util.Collection r3, long r4) {
            r2 = this;
            java.lang.Class r0 = r2.listType
            boolean r0 = r0.isInstance(r3)
            if (r0 == 0) goto L1c
            java.util.Iterator r0 = r3.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            boolean r1 = r1 instanceof java.lang.String
            if (r1 != 0) goto Lc
            goto L1c
        L1b:
            return r3
        L1c:
            java.lang.Object r4 = r2.createInstance(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r3.next()
            if (r5 == 0) goto L3f
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L37
            goto L3f
        L37:
            java.lang.String r5 = com.alibaba.fastjson2.JSON.toJSONString(r5)
            r4.add(r5)
            goto L26
        L3f:
            r4.add(r5)
            goto L26
        L43:
            return r4
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = r1.listType
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r8, java.lang.reflect.Type r9, java.lang.Object r10, long r11) {
            r7 = this;
            java.lang.Class r9 = r7.instanceType
            boolean r10 = r8.nextIfNull()
            r0 = 0
            if (r10 == 0) goto La
            return r0
        La:
            java.lang.Class r2 = r7.listType
            r3 = 0
            r1 = r8
            r5 = r11
            com.alibaba.fastjson2.reader.ObjectReader r8 = r1.checkAutoType(r2, r3, r5)
            if (r8 == 0) goto L1a
            java.lang.Class r9 = r8.getObjectClass()
        L1a:
            java.lang.Class r8 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_ARRAYS_LIST
            r10 = 0
            if (r9 != r8) goto L35
            int r8 = r1.startArray()
            java.lang.String[] r9 = new java.lang.String[r8]
        L25:
            if (r10 >= r8) goto L30
            java.lang.String r11 = r1.readString()
            r9[r10] = r11
            int r10 = r10 + 1
            goto L25
        L30:
            java.util.List r8 = java.util.Arrays.asList(r9)
            return r8
        L35:
            int r8 = r1.startArray()
            java.lang.Class<java.util.ArrayList> r11 = java.util.ArrayList.class
            if (r9 != r11) goto L4b
            java.util.ArrayList r9 = new java.util.ArrayList
            if (r8 <= 0) goto L46
            r9.<init>(r8)
            goto Le5
        L46:
            r9.<init>()
            goto Le5
        L4b:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r11 = com.alibaba.fastjson2.JSONArray.class
            if (r9 != r11) goto L5d
            com.alibaba.fastjson2.JSONArray r9 = new com.alibaba.fastjson2.JSONArray
            if (r8 <= 0) goto L58
            r9.<init>(r8)
            goto Le5
        L58:
            r9.<init>()
            goto Le5
        L5d:
            java.lang.Class r11 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_COLLECTION
            if (r9 != r11) goto L6e
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.alibaba.fastjson2.reader.f r0 = new com.alibaba.fastjson2.reader.f
            r11 = 1
            r0.<init>(r11)
            goto Le5
        L6e:
            java.lang.Class r11 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_LIST
            if (r9 != r11) goto L7e
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.alibaba.fastjson2.reader.f r0 = new com.alibaba.fastjson2.reader.f
            r11 = 2
            r0.<init>(r11)
            goto Le5
        L7e:
            java.lang.Class r11 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_SET
            if (r9 != r11) goto L8e
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            com.alibaba.fastjson2.reader.f r0 = new com.alibaba.fastjson2.reader.f
            r11 = 3
            r0.<init>(r11)
            goto Le5
        L8e:
            java.lang.Class r11 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON
            if (r9 != r11) goto L9f
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.alibaba.fastjson2.reader.f r0 = new com.alibaba.fastjson2.reader.f
            r11 = 17
            r0.<init>(r11)
            goto Le5
        L9f:
            java.lang.Class r11 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON_LIST
            if (r9 != r11) goto Lb0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.alibaba.fastjson2.reader.f r0 = new com.alibaba.fastjson2.reader.f
            r11 = 18
            r0.<init>(r11)
            goto Le5
        Lb0:
            if (r9 == 0) goto Lda
            java.lang.Class r11 = r7.listType
            if (r9 == r11) goto Lda
            java.lang.Object r11 = r9.newInstance()     // Catch: java.lang.IllegalAccessException -> Lbe java.lang.InstantiationException -> Lc1
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.IllegalAccessException -> Lbe java.lang.InstantiationException -> Lc1
            r9 = r11
            goto Le5
        Lbe:
            r0 = move-exception
        Lbf:
            r8 = r0
            goto Lc3
        Lc1:
            r0 = move-exception
            goto Lbf
        Lc3:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "create instance error "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r9 = r1.info(r9)
            ah.a.x(r9, r8)
            r8 = 0
            return r8
        Lda:
            com.alibaba.fastjson2.JSONReader$Context r9 = r1.context
            long r11 = r9.features
            long r11 = r11 | r5
            java.lang.Object r9 = r7.createInstance(r11)
            java.util.Collection r9 = (java.util.Collection) r9
        Le5:
            if (r10 >= r8) goto Lf1
            java.lang.String r11 = r1.readString()
            r9.add(r11)
            int r10 = r10 + 1
            goto Le5
        Lf1:
            if (r0 == 0) goto Lfa
            java.lang.Object r8 = r0.apply(r9)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        Lfa:
            return r9
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
            boolean r8 = r2.nextIfSet()
            if (r8 == 0) goto L25
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            goto L30
        L25:
            com.alibaba.fastjson2.JSONReader$Context r8 = r2.context
            long r8 = r8.features
            long r8 = r8 | r11
            java.lang.Object r8 = r7.createInstance(r8)
            java.util.Collection r8 = (java.util.Collection) r8
        L30:
            char r9 = r2.current()
            r10 = 91
            if (r9 != r10) goto L51
            r2.next()
        L3b:
            boolean r9 = r2.nextIfArrayEnd()
            if (r9 == 0) goto L42
            goto L74
        L42:
            java.lang.String r9 = r2.readString()
            if (r9 != 0) goto L4d
            boolean r10 = r8 instanceof java.util.SortedSet
            if (r10 == 0) goto L4d
            goto L3b
        L4d:
            r8.add(r9)
            goto L3b
        L51:
            r10 = 34
            if (r9 == r10) goto L67
            r10 = 39
            if (r9 == r10) goto L67
            r10 = 123(0x7b, float:1.72E-43)
            if (r9 != r10) goto L5e
            goto L67
        L5e:
            java.lang.String r8 = r2.info()
            ah.a.w(r8)
            r8 = 0
            return r8
        L67:
            java.lang.String r9 = r2.readString()
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L74
            r8.add(r9)
        L74:
            r2.nextIfComma()
            return r8
    }
}
