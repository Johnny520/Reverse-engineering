package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplCollection extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplCollection INSTANCE = null;
    static final long LINKED_HASH_SET_JSONB_TYPE_HASH = 0;
    static final byte[] LINKED_HASH_SET_JSONB_TYPE_NAME_BYTES = null;
    static final long TREE_SET_JSONB_TYPE_HASH = 0;
    static final byte[] TREE_SET_JSONB_TYPE_NAME_BYTES = null;
    long features;
    java.lang.reflect.Type itemType;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplCollection r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplCollection
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplCollection.INSTANCE = r0
            java.lang.Class<java.util.LinkedHashSet> r0 = java.util.LinkedHashSet.class
            java.lang.String r1 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplCollection.LINKED_HASH_SET_JSONB_TYPE_NAME_BYTES = r1
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplCollection.LINKED_HASH_SET_JSONB_TYPE_HASH = r0
            java.lang.Class<java.util.TreeSet> r0 = java.util.TreeSet.class
            java.lang.String r1 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplCollection.TREE_SET_JSONB_TYPE_NAME_BYTES = r1
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplCollection.TREE_SET_JSONB_TYPE_HASH = r0
            return
    }

    public ObjectWriterImplCollection() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9, java.lang.Object r10, java.lang.reflect.Type r11, long r12) {
            r7 = this;
            boolean r0 = r8.jsonb
            if (r0 == 0) goto L9
            r7.writeJSONB(r8, r9, r10, r11, r12)
            r8 = r7
            return
        L9:
            r1 = r8
            r8 = r7
            if (r9 != 0) goto L11
            r1.writeNull()
            return
        L11:
            boolean r10 = r9 instanceof java.util.Set
            if (r10 == 0) goto L23
            long r10 = r8.features
            long r10 = r10 | r12
            boolean r10 = r1.isWriteTypeInfo(r9, r10)
            if (r10 == 0) goto L23
            java.lang.String r10 = "Set"
            r1.writeRaw(r10)
        L23:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r1.startArray()
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
            r11 = 0
            r12 = r11
            r11 = r10
        L30:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L64
            if (r12 == 0) goto L3b
            r1.writeComma()
        L3b:
            java.lang.Object r2 = r9.next()
            if (r2 != 0) goto L47
            r1.writeNull()
            int r12 = r12 + 1
            goto L30
        L47:
            java.lang.Class r13 = r2.getClass()
            if (r13 != r10) goto L4f
        L4d:
            r0 = r11
            goto L55
        L4f:
            com.alibaba.fastjson2.writer.ObjectWriter r11 = r1.getObjectWriter(r13)
            r10 = r13
            goto L4d
        L55:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.reflect.Type r4 = r8.itemType
            long r5 = r8.features
            r0.write(r1, r2, r3, r4, r5)
            int r12 = r12 + 1
            r11 = r0
            goto L30
        L64:
            r1.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r15, java.lang.Object r16, java.lang.Object r17, java.lang.reflect.Type r18, long r19) {
            r14 = this;
            r0 = r16
            r2 = r18
            if (r0 != 0) goto La
            r15.writeNull()
            return
        La:
            boolean r3 = r2 instanceof java.lang.Class
            r7 = 1
            r4 = 0
            r8 = 0
            if (r3 == 0) goto L16
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            r5 = r4
            goto L37
        L16:
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L35
            r3 = r2
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r5 = r3.getActualTypeArguments()
            int r6 = r5.length
            if (r6 != r7) goto L27
            r5 = r5[r8]
            goto L28
        L27:
            r5 = r4
        L28:
            java.lang.reflect.Type r3 = r3.getRawType()
            boolean r6 = r3 instanceof java.lang.Class
            if (r6 == 0) goto L33
            java.lang.Class r3 = (java.lang.Class) r3
            goto L37
        L33:
            r3 = r4
            goto L37
        L35:
            r3 = r4
            r5 = r3
        L37:
            r6 = r0
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Class r9 = r0.getClass()
            boolean r0 = r15.isWriteTypeInfo(r0, r3)
            if (r0 == 0) goto L57
            java.lang.Class<java.util.Set> r10 = java.util.Set.class
            if (r3 != r10) goto L4e
            java.lang.Class<java.util.HashSet> r3 = java.util.HashSet.class
            if (r9 != r3) goto L4e
        L4c:
            r0 = r8
            goto L57
        L4e:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            if (r2 != r3) goto L57
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            if (r9 != r2) goto L57
            goto L4c
        L57:
            if (r0 == 0) goto L78
            java.lang.Class<java.util.LinkedHashSet> r0 = java.util.LinkedHashSet.class
            if (r9 != r0) goto L65
            byte[] r0 = com.alibaba.fastjson2.writer.ObjectWriterImplCollection.LINKED_HASH_SET_JSONB_TYPE_NAME_BYTES
            long r2 = com.alibaba.fastjson2.writer.ObjectWriterImplCollection.LINKED_HASH_SET_JSONB_TYPE_HASH
            r15.writeTypeName(r0, r2)
            goto L78
        L65:
            java.lang.Class<java.util.TreeSet> r0 = java.util.TreeSet.class
            if (r9 != r0) goto L71
            byte[] r0 = com.alibaba.fastjson2.writer.ObjectWriterImplCollection.TREE_SET_JSONB_TYPE_NAME_BYTES
            long r2 = com.alibaba.fastjson2.writer.ObjectWriterImplCollection.TREE_SET_JSONB_TYPE_HASH
            r15.writeTypeName(r0, r2)
            goto L78
        L71:
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r9)
            r15.writeTypeName(r0)
        L78:
            boolean r0 = r15.isRefDetect()
            int r2 = r6.size()
            if (r2 <= r7) goto L8c
            boolean r2 = r6 instanceof java.util.SortedSet
            if (r2 != 0) goto L8c
            boolean r2 = r6 instanceof java.util.LinkedHashSet
            if (r2 != 0) goto L8c
            r9 = r8
            goto L8d
        L8c:
            r9 = r0
        L8d:
            int r0 = r6.size()
            r15.startArray(r0)
            java.util.Iterator r10 = r6.iterator()
            r0 = r4
            r11 = r8
        L9a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Le8
            java.lang.Object r2 = r10.next()
            if (r2 != 0) goto Lac
            r15.writeNull()
            r12 = r4
        Laa:
            r4 = r5
            goto Le3
        Lac:
            java.lang.Class r3 = r2.getClass()
            if (r3 != r4) goto Lb4
            r12 = r4
            goto Lb9
        Lb4:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r15.getObjectWriter(r3)
            r12 = r3
        Lb9:
            if (r9 == 0) goto Lc3
            boolean r3 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r3)
            if (r3 != 0) goto Lc3
            r13 = r7
            goto Lc4
        Lc3:
            r13 = r8
        Lc4:
            if (r13 == 0) goto Ld3
            java.lang.String r3 = r15.setPath(r11, r2)
            if (r3 == 0) goto Ld3
            r15.writeReference(r3)
            r15.popPath(r2)
            goto Laa
        Ld3:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r1 = r15
            r4 = r5
            r5 = r19
            r0.writeJSONB(r1, r2, r3, r4, r5)
            if (r13 == 0) goto Le3
            r15.popPath(r2)
        Le3:
            int r11 = r11 + 1
            r5 = r4
            r4 = r12
            goto L9a
        Le8:
            return
    }
}
