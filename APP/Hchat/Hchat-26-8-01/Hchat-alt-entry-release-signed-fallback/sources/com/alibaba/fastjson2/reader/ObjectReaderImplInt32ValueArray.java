package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplInt32ValueArray extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    public static final long HASH_TYPE = 0;
    static final com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray INSTANCE = null;
    final java.util.function.Function<int[], java.lang.Object> builder;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray
            java.lang.Class<int[]> r1 = int[].class
            r2 = 0
            r0.<init>(r1, r2)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray.INSTANCE = r0
            java.lang.String r0 = "[I"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray.HASH_TYPE = r0
            return
    }

    public ObjectReaderImplInt32ValueArray(java.lang.Class r1, java.util.function.Function<int[], java.lang.Object> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.builder = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r6, long r7) {
            r5 = this;
            int r7 = r6.size()
            int[] r7 = new int[r7]
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
            int r1 = r1.intValue()
            goto L3d
        L25:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r3 = r1.getClass()
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.util.function.Function r2 = r2.getTypeConvert(r3, r4)
            if (r2 == 0) goto L43
            java.lang.Object r1 = r2.apply(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L3d:
            int r2 = r0 + 1
            r7[r0] = r1
            r0 = r2
            goto Lc
        L43:
            java.lang.String r6 = "can not cast to int "
            java.lang.Class r7 = r1.getClass()
            ah.a.i(r7, r6)
            r6 = 0
            return r6
        L4e:
            java.util.function.Function<int[], java.lang.Object> r6 = r5.builder
            if (r6 == 0) goto L57
            java.lang.Object r6 = r6.apply(r7)
            return r6
        L57:
            return r7
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = super.getObjectClass()
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            r2 = -110(0xffffffffffffff92, float:NaN)
            boolean r2 = r1.nextIfMatch(r2)
            if (r2 == 0) goto L24
            long r2 = r1.readTypeHashCode()
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray.HASH_TYPE
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L24
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplInt32Array.HASH_TYPE
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
            int[] r3 = new int[r2]
            r4 = 0
        L30:
            if (r4 >= r2) goto L3b
            int r5 = r1.readInt32Value()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L30
        L3b:
            java.util.function.Function<int[], java.lang.Object> r1 = r0.builder
            if (r1 == 0) goto L44
            java.lang.Object r1 = r1.apply(r3)
            return r1
        L44:
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            boolean r0 = r3.jsonb
            if (r0 == 0) goto La
            java.lang.Object r3 = r2.readJSONBObject(r3, r4, r5, r6)
            r4 = r2
            return r3
        La:
            r4 = r2
            boolean r5 = r3.readIfNull()
            r6 = 0
            if (r5 == 0) goto L13
            return r6
        L13:
            boolean r5 = r3.nextIfArrayStart()
            if (r5 == 0) goto L61
            r5 = 16
            int[] r5 = new int[r5]
            r6 = 0
        L1e:
            boolean r7 = r3.nextIfArrayEnd()
            if (r7 == 0) goto L34
            r3.nextIfComma()
            int[] r3 = java.util.Arrays.copyOf(r5, r6)
            java.util.function.Function<int[], java.lang.Object> r5 = r4.builder
            if (r5 == 0) goto L33
            java.lang.Object r3 = r5.apply(r3)
        L33:
            return r3
        L34:
            boolean r7 = r3.isEnd()
            if (r7 != 0) goto L56
            int r7 = r6 + 1
            int r0 = r5.length
            int r0 = r7 - r0
            if (r0 <= 0) goto L4e
            int r0 = r5.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            int r1 = r0 - r7
            if (r1 >= 0) goto L4a
            r0 = r7
        L4a:
            int[] r5 = java.util.Arrays.copyOf(r5, r0)
        L4e:
            int r0 = r3.readInt32Value()
            r5[r6] = r0
            r6 = r7
            goto L1e
        L56:
            java.lang.String r5 = "input end"
            java.lang.String r3 = r3.info(r5)
            ah.a.w(r3)
            r3 = 0
            return r3
        L61:
            boolean r5 = r3.isString()
            if (r5 == 0) goto L81
            java.lang.String r5 = r3.readString()
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L72
            return r6
        L72:
            java.lang.String r6 = "not support input "
            java.lang.String r5 = r6.concat(r5)
            java.lang.String r3 = r3.info(r5)
            ah.a.w(r3)
            r3 = 0
            return r3
        L81:
            java.lang.String r5 = "TODO"
            java.lang.String r3 = r3.info(r5)
            ah.a.w(r3)
            r3 = 0
            return r3
    }
}
