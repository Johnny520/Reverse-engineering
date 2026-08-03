package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectArrayReader extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    public static final com.alibaba.fastjson2.reader.ObjectArrayReader INSTANCE = null;
    public static final long TYPE_HASH_CODE = 0;

    static {
            com.alibaba.fastjson2.reader.ObjectArrayReader r0 = new com.alibaba.fastjson2.reader.ObjectArrayReader
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectArrayReader.INSTANCE = r0
            java.lang.String r0 = "[O"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectArrayReader.TYPE_HASH_CODE = r0
            return
    }

    public ObjectArrayReader() {
            r1 = this;
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Object createInstance(java.util.Collection r1, long r2) {
            r0 = this;
            java.lang.Object[] r1 = r0.createInstance(r1, r2)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object[] createInstance(java.util.Collection r3, long r4) {
            r2 = this;
            int r4 = r3.size()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r3.next()
            int r1 = r5 + 1
            r4[r5] = r0
            r5 = r1
            goto Lb
        L1b:
            return r4
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = super.getObjectClass()
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r13, java.lang.reflect.Type r14, java.lang.Object r15, long r16) {
            r12 = this;
            byte r0 = r13.getType()
            r1 = -110(0xffffffffffffff92, float:NaN)
            if (r0 != r1) goto L20
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            long r4 = com.alibaba.fastjson2.reader.ObjectArrayReader.TYPE_HASH_CODE
            r2 = r13
            r6 = r16
            com.alibaba.fastjson2.reader.ObjectReader r0 = r2.checkAutoType(r3, r4, r6)
            if (r0 == r12) goto L20
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r6 = r0
            java.lang.Object r13 = r6.readJSONBObject(r7, r8, r9, r10)
            return r13
        L20:
            int r14 = r13.startArray()
            r15 = -1
            r0 = 0
            if (r14 != r15) goto L29
            return r0
        L29:
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r2 = 0
            r8 = r2
        L2d:
            if (r8 >= r14) goto L92
            byte r2 = r13.getType()
            r3 = 73
            if (r2 < r3) goto L40
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 > r3) goto L40
            java.lang.String r2 = r13.readString()
            goto L8d
        L40:
            if (r2 != r1) goto L5f
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            r2 = r13
            r6 = r16
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.checkAutoType(r3, r4, r6)
            if (r3 == 0) goto L5a
            r4 = 0
            r5 = 0
            r6 = r16
            r2 = r3
            r3 = r13
            java.lang.Object r2 = r2.readJSONBObject(r3, r4, r5, r6)
            goto L8d
        L5a:
            java.lang.Object r2 = r13.readAny()
            goto L8d
        L5f:
            r3 = -81
            if (r2 != r3) goto L68
            r13.next()
            r2 = r0
            goto L8d
        L68:
            r3 = -79
            if (r2 != r3) goto L72
            r13.next()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L8d
        L72:
            r3 = -80
            if (r2 != r3) goto L7c
            r13.next()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L8d
        L7c:
            r3 = -66
            if (r2 != r3) goto L89
            long r2 = r13.readInt64Value()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L8d
        L89:
            java.lang.Object r2 = r13.readAny()
        L8d:
            r15[r8] = r2
            int r8 = r8 + 1
            goto L2d
        L92:
            return r15
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            boolean r4 = r3.nextIfNullOrEmptyString()
            r5 = 0
            if (r4 == 0) goto L8
            return r5
        L8:
            boolean r4 = r3.nextIfArrayStart()
            if (r4 == 0) goto Lab
            r4 = 16
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r6 = 0
        L13:
            boolean r7 = r3.nextIfArrayEnd()
            if (r7 == 0) goto L21
            r3.nextIfComma()
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r6)
            return r3
        L21:
            int r7 = r6 + 1
            int r0 = r4.length
            int r0 = r7 - r0
            if (r0 <= 0) goto L35
            int r0 = r4.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            int r1 = r0 - r7
            if (r1 >= 0) goto L31
            r0 = r7
        L31:
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
        L35:
            char r0 = r3.current()
            r1 = 34
            if (r0 == r1) goto La2
            r1 = 43
            if (r0 == r1) goto L9d
            r1 = 83
            if (r0 == r1) goto L85
            r1 = 91
            if (r0 == r1) goto L80
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L77
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L72
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L77
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L6d
            r1 = 45
            if (r0 == r1) goto L9d
            r1 = 46
            if (r0 == r1) goto L9d
            switch(r0) {
                case 48: goto L9d;
                case 49: goto L9d;
                case 50: goto L9d;
                case 51: goto L9d;
                case 52: goto L9d;
                case 53: goto L9d;
                case 54: goto L9d;
                case 55: goto L9d;
                case 56: goto L9d;
                case 57: goto L9d;
                default: goto L64;
            }
        L64:
            java.lang.String r3 = r3.info()
            ah.a.w(r3)
            r3 = 0
            return r3
        L6d:
            java.util.Map r0 = r3.readObject()
            goto La6
        L72:
            r3.readNull()
            r0 = r5
            goto La6
        L77:
            boolean r0 = r3.readBoolValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto La6
        L80:
            java.util.List r0 = r3.readArray()
            goto La6
        L85:
            boolean r0 = r3.nextIfSet()
            if (r0 == 0) goto L92
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            java.lang.Object r0 = r3.read(r0)
            goto La6
        L92:
            java.lang.String r4 = "Expected Set format but parsing failed: "
            java.lang.String r3 = r3.info()
            ah.a.i(r3, r4)
            r3 = 0
            return r3
        L9d:
            java.lang.Number r0 = r3.readNumber()
            goto La6
        La2:
            java.lang.String r0 = r3.readString()
        La6:
            r4[r6] = r0
            r6 = r7
            goto L13
        Lab:
            java.lang.String r4 = "TODO"
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            r3 = 0
            return r3
    }
}
