package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplInt64Array extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    public static final long HASH_TYPE = 0;
    static final com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array.INSTANCE = r0
            java.lang.String r0 = "[Long"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array.HASH_TYPE = r0
            return
    }

    public ObjectReaderImplInt64Array() {
            r1 = this;
            java.lang.Class<java.lang.Long[]> r0 = java.lang.Long[].class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r5, long r6) {
            r4 = this;
            int r6 = r5.size()
            java.lang.Long[] r6 = new java.lang.Long[r6]
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r5.next()
            if (r0 != 0) goto L19
            r0 = 0
            goto L3c
        L19:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L28
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L3c
        L28:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r2 = r0.getClass()
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            java.util.function.Function r1 = r1.getTypeConvert(r2, r3)
            if (r1 == 0) goto L42
            java.lang.Object r0 = r1.apply(r0)
            java.lang.Long r0 = (java.lang.Long) r0
        L3c:
            int r1 = r7 + 1
            r6[r7] = r0
            r7 = r1
            goto Lb
        L42:
            java.lang.String r5 = "can not cast to Integer "
            java.lang.Class r6 = r0.getClass()
            ah.a.i(r6, r5)
            r5 = 0
            return r5
        L4d:
            return r6
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
            if (r2 == 0) goto L40
            long r2 = r1.readTypeHashCode()
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array.HASH_TYPE
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L40
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray.HASH_TYPE
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L40
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplInt32Array.HASH_TYPE
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L40
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray.HASH_TYPE
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L25
            goto L40
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "not support type "
            r2.<init>(r3)
            java.lang.String r3 = r1.getString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.info(r2)
            ah.a.w(r1)
            r1 = 0
            return r1
        L40:
            int r2 = r1.startArray()
            r3 = -1
            if (r2 != r3) goto L49
            r1 = 0
            return r1
        L49:
            java.lang.Long[] r3 = new java.lang.Long[r2]
            r4 = 0
        L4c:
            if (r4 >= r2) goto L57
            java.lang.Long r5 = r1.readInt64()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L4c
        L57:
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
            if (r3 == 0) goto L50
            r3 = 16
            java.lang.Long[] r3 = new java.lang.Long[r3]
            r4 = 0
        L13:
            boolean r5 = r2.nextIfArrayEnd()
            if (r5 == 0) goto L21
            r2.nextIfComma()
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r4)
            return r2
        L21:
            boolean r5 = r2.isEnd()
            if (r5 != 0) goto L45
            int r5 = r4 + 1
            int r6 = r3.length
            int r6 = r5 - r6
            if (r6 <= 0) goto L3d
            int r6 = r3.length
            int r0 = r6 >> 1
            int r6 = r6 + r0
            int r0 = r6 - r5
            if (r0 >= 0) goto L37
            r6 = r5
        L37:
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r6)
            java.lang.Long[] r3 = (java.lang.Long[]) r3
        L3d:
            java.lang.Long r6 = r2.readInt64()
            r3[r4] = r6
            r4 = r5
            goto L13
        L45:
            java.lang.String r3 = "input end"
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            r2 = 0
            return r2
        L50:
            boolean r3 = r2.isString()
            if (r3 == 0) goto L70
            java.lang.String r3 = r2.readString()
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L61
            return r4
        L61:
            java.lang.String r4 = "not support input "
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            r2 = 0
            return r2
        L70:
            boolean r3 = r2.isNumber()
            if (r3 == 0) goto L7f
            java.lang.Long r2 = r2.readInt64()
            java.lang.Long[] r2 = new java.lang.Long[]{r2}
            return r2
        L7f:
            java.lang.String r3 = "TODO"
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            r2 = 0
            return r2
    }
}
