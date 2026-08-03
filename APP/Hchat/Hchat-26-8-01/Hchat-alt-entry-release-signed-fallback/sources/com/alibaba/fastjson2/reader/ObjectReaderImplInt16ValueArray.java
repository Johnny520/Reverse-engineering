package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt16ValueArray extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final long HASH_TYPE = 0;
    static final com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray INSTANCE = null;
    final java.util.function.Function<short[], java.lang.Object> builder;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray.INSTANCE = r0
            java.lang.String r0 = "[S"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray.HASH_TYPE = r0
            return
    }

    public ObjectReaderImplInt16ValueArray(java.util.function.Function<short[], java.lang.Object> r2) {
            r1 = this;
            java.lang.Class<short[]> r0 = short[].class
            r1.<init>(r0)
            r1.builder = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r6, long r7) {
            r5 = this;
            int r7 = r6.size()
            short[] r7 = new short[r7]
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
            r0 = r8
        Lc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r6.next()
            if (r1 != 0) goto L1a
            r1 = r8
            goto L3d
        L1a:
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L25
            java.lang.Number r1 = (java.lang.Number) r1
            short r1 = r1.shortValue()
            goto L3d
        L25:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r3 = r1.getClass()
            java.lang.Class r4 = java.lang.Short.TYPE
            java.util.function.Function r2 = r2.getTypeConvert(r3, r4)
            if (r2 == 0) goto L43
            java.lang.Object r1 = r2.apply(r1)
            java.lang.Short r1 = (java.lang.Short) r1
            short r1 = r1.shortValue()
        L3d:
            int r2 = r0 + 1
            r7[r0] = r1
            r0 = r2
            goto Lc
        L43:
            java.lang.String r6 = "can not cast to short "
            java.lang.Class r7 = r1.getClass()
            ah.a.i(r7, r6)
            r6 = 0
            return r6
        L4e:
            java.util.function.Function<short[], java.lang.Object> r6 = r5.builder
            if (r6 == 0) goto L57
            java.lang.Object r6 = r6.apply(r7)
            return r6
        L57:
            return r7
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            r2 = -110(0xffffffffffffff92, float:NaN)
            boolean r2 = r1.nextIfMatch(r2)
            if (r2 == 0) goto L24
            long r2 = r1.readTypeHashCode()
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray.HASH_TYPE
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L24
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplInt16Array.HASH_TYPE
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L19
            goto L24
        L19:
            java.lang.String r2 = "not support autoType : "
            java.lang.String r1 = r1.getString()
            ah.a.i(r1, r2)
            r1 = 0
            return r1
        L24:
            int r2 = r1.startArray()
            r3 = -1
            if (r2 != r3) goto L2d
            r1 = 0
            return r1
        L2d:
            short[] r3 = new short[r2]
            r4 = 0
        L30:
            if (r4 >= r2) goto L3c
            int r5 = r1.readInt32Value()
            short r5 = (short) r5
            r3[r4] = r5
            int r4 = r4 + 1
            goto L30
        L3c:
            java.util.function.Function<short[], java.lang.Object> r1 = r0.builder
            if (r1 == 0) goto L45
            java.lang.Object r1 = r1.apply(r3)
            return r1
        L45:
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r2, java.lang.reflect.Type r3, java.lang.Object r4, long r5) {
            r1 = this;
            boolean r3 = r2.readIfNull()
            r4 = 0
            if (r3 == 0) goto L8
            return r4
        L8:
            boolean r3 = r2.nextIfArrayStart()
            if (r3 == 0) goto L57
            r3 = 16
            short[] r3 = new short[r3]
            r4 = 0
        L13:
            boolean r5 = r2.nextIfArrayEnd()
            if (r5 == 0) goto L29
            r2.nextIfComma()
            short[] r2 = java.util.Arrays.copyOf(r3, r4)
            java.util.function.Function<short[], java.lang.Object> r3 = r1.builder
            if (r3 == 0) goto L28
            java.lang.Object r2 = r3.apply(r2)
        L28:
            return r2
        L29:
            boolean r5 = r2.isEnd()
            if (r5 != 0) goto L4c
            int r5 = r4 + 1
            int r6 = r3.length
            int r6 = r5 - r6
            if (r6 <= 0) goto L43
            int r6 = r3.length
            int r0 = r6 >> 1
            int r6 = r6 + r0
            int r0 = r6 - r5
            if (r0 >= 0) goto L3f
            r6 = r5
        L3f:
            short[] r3 = java.util.Arrays.copyOf(r3, r6)
        L43:
            int r6 = r2.readInt32Value()
            short r6 = (short) r6
            r3[r4] = r6
            r4 = r5
            goto L13
        L4c:
            java.lang.String r3 = "input end"
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
        L55:
            r2 = 0
            return r2
        L57:
            boolean r3 = r2.isString()
            if (r3 == 0) goto L76
            java.lang.String r3 = r2.readString()
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L68
            return r4
        L68:
            java.lang.String r4 = "not support input "
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            goto L55
        L76:
            java.lang.String r3 = "TODO"
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            goto L55
    }
}
