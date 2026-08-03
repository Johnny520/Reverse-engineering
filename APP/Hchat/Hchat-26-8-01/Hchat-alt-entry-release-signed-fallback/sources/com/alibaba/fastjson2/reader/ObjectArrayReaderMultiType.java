package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectArrayReaderMultiType implements com.alibaba.fastjson2.reader.ObjectReader {
    final com.alibaba.fastjson2.reader.ObjectReader[] readers;
    final java.lang.reflect.Type[] types;

    public ObjectArrayReaderMultiType(com.alibaba.fastjson2.util.MultiType r5) {
            r4 = this;
            r4.<init>()
            int r0 = r5.size()
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r0]
            r2 = 0
        La:
            int r3 = r5.size()
            if (r2 >= r3) goto L19
            java.lang.reflect.Type r3 = r5.getType(r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto La
        L19:
            r4.types = r1
            com.alibaba.fastjson2.reader.ObjectReader[] r5 = new com.alibaba.fastjson2.reader.ObjectReader[r0]
            r4.readers = r5
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r1, long r2) {
            r0 = this;
            java.lang.reflect.Type[] r1 = r0.types
            int r1 = r1.length
            java.lang.Object[] r1 = new java.lang.Object[r1]
            return r1
    }

    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader r2, int r3) {
            r1 = this;
            com.alibaba.fastjson2.reader.ObjectReader[] r0 = r1.readers
            r0 = r0[r3]
            if (r0 != 0) goto L13
            java.lang.reflect.Type[] r0 = r1.types
            r0 = r0[r3]
            com.alibaba.fastjson2.reader.ObjectReader r2 = r2.getObjectReader(r0)
            com.alibaba.fastjson2.reader.ObjectReader[] r0 = r1.readers
            r0[r3] = r2
            return r2
        L13:
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r10, java.lang.reflect.Type r11, java.lang.Object r12, long r13) {
            r9 = this;
            int r11 = r10.startArray()
            r12 = -1
            r0 = 0
            if (r11 != r12) goto L9
            return r0
        L9:
            java.lang.reflect.Type[] r12 = r9.types
            int r12 = r12.length
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r1 = 0
        Lf:
            if (r1 >= r11) goto L49
            boolean r2 = r10.isReference()
            if (r2 == 0) goto L30
            java.lang.String r2 = r10.readReference()
            java.lang.String r3 = ".."
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L25
            r2 = r12
            goto L2d
        L25:
            com.alibaba.fastjson2.JSONPath r2 = com.alibaba.fastjson2.JSONPath.of(r2)
            r10.addResolveTask(r12, r1, r2)
            r2 = r0
        L2d:
            r4 = r10
            r7 = r13
            goto L42
        L30:
            com.alibaba.fastjson2.reader.ObjectReader r3 = r9.getObjectReader(r10, r1)
            java.lang.reflect.Type[] r2 = r9.types
            r5 = r2[r1]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r4 = r10
            r7 = r13
            java.lang.Object r2 = r3.readObject(r4, r5, r6, r7)
        L42:
            r12[r1] = r2
            int r1 = r1 + 1
            r10 = r4
            r13 = r7
            goto Lf
        L49:
            return r12
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r9, java.lang.reflect.Type r10, java.lang.Object r11, long r12) {
            r8 = this;
            boolean r0 = r9.jsonb
            if (r0 == 0) goto Lf
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            java.lang.Object r9 = r1.readJSONBObject(r2, r3, r4, r5)
            return r9
        Lf:
            r1 = r8
            r2 = r9
            boolean r9 = r2.nextIfNullOrEmptyString()
            r10 = 0
            if (r9 == 0) goto L19
            return r10
        L19:
            java.lang.reflect.Type[] r9 = r1.types
            int r9 = r9.length
            java.lang.Object[] r9 = new java.lang.Object[r9]
            boolean r11 = r2.nextIfArrayStart()
            if (r11 == 0) goto L69
            r11 = 0
        L25:
            boolean r0 = r2.nextIfArrayEnd()
            if (r0 == 0) goto L2f
            r2.nextIfComma()
            return r9
        L2f:
            boolean r0 = r2.isReference()
            if (r0 == 0) goto L4d
            java.lang.String r0 = r2.readReference()
            java.lang.String r3 = ".."
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L43
            r0 = r9
            goto L4b
        L43:
            com.alibaba.fastjson2.JSONPath r0 = com.alibaba.fastjson2.JSONPath.of(r0)
            r2.addResolveTask(r9, r11, r0)
            r0 = r10
        L4b:
            r6 = r12
            goto L60
        L4d:
            r3 = r2
            com.alibaba.fastjson2.reader.ObjectReader r2 = r8.getObjectReader(r3, r11)
            java.lang.reflect.Type[] r0 = r1.types
            r4 = r0[r11]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r6 = r12
            java.lang.Object r0 = r2.readObject(r3, r4, r5, r6)
            r2 = r3
        L60:
            r9[r11] = r0
            r2.nextIfComma()
            int r11 = r11 + 1
            r12 = r6
            goto L25
        L69:
            java.lang.String r9 = "TODO"
            java.lang.String r9 = r2.info(r9)
            ah.a.w(r9)
            r9 = 0
            return r9
    }
}
