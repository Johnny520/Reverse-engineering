package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt16Array extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final long HASH_TYPE = 0;
    static final com.alibaba.fastjson2.reader.ObjectReaderImplInt16Array INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt16Array r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt16Array
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplInt16Array.INSTANCE = r0
            java.lang.String r0 = "[Short"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt16Array.HASH_TYPE = r0
            return
    }

    public ObjectReaderImplInt16Array() {
            r1 = this;
            java.lang.Class<java.lang.Short[]> r0 = java.lang.Short[].class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r5, long r6) {
            r4 = this;
            int r6 = r5.size()
            java.lang.Short[] r6 = new java.lang.Short[r6]
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
            short r0 = r0.shortValue()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            goto L3c
        L28:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r2 = r0.getClass()
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            java.util.function.Function r1 = r1.getTypeConvert(r2, r3)
            if (r1 == 0) goto L42
            java.lang.Object r0 = r1.apply(r0)
            java.lang.Short r0 = (java.lang.Short) r0
        L3c:
            int r1 = r7 + 1
            r6[r7] = r0
            r7 = r1
            goto Lb
        L42:
            java.lang.String r5 = "can not cast to Short "
            java.lang.Class r6 = r0.getClass()
            ah.a.i(r6, r5)
            r5 = 0
            return r5
        L4d:
            return r6
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r2, java.lang.reflect.Type r3, java.lang.Object r4, long r5) {
            r1 = this;
            r3 = -110(0xffffffffffffff92, float:NaN)
            boolean r3 = r2.nextIfMatch(r3)
            if (r3 == 0) goto L34
            long r3 = r2.readTypeHashCode()
            long r5 = com.alibaba.fastjson2.reader.ObjectReaderImplInt16Array.HASH_TYPE
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L34
            long r5 = com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray.HASH_TYPE
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L19
            goto L34
        L19:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "not support type "
            r3.<init>(r4)
            java.lang.String r4 = r2.getString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            r2 = 0
            return r2
        L34:
            int r3 = r2.startArray()
            r4 = -1
            r5 = 0
            if (r3 != r4) goto L3d
            return r5
        L3d:
            java.lang.Short[] r4 = new java.lang.Short[r3]
            r6 = 0
        L40:
            if (r6 >= r3) goto L57
            java.lang.Integer r0 = r2.readInt32()
            if (r0 != 0) goto L4a
            r0 = r5
            goto L52
        L4a:
            short r0 = r0.shortValue()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
        L52:
            r4[r6] = r0
            int r6 = r6 + 1
            goto L40
        L57:
            return r4
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            boolean r4 = r3.readIfNull()
            r5 = 0
            if (r4 == 0) goto L8
            return r5
        L8:
            boolean r4 = r3.nextIfArrayStart()
            if (r4 == 0) goto L5d
            r4 = 16
            java.lang.Short[] r4 = new java.lang.Short[r4]
            r5 = 0
            r6 = r5
        L14:
            boolean r7 = r3.nextIfArrayEnd()
            if (r7 == 0) goto L22
            r3.nextIfComma()
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r6)
            return r3
        L22:
            boolean r7 = r3.isEnd()
            if (r7 != 0) goto L52
            int r7 = r6 + 1
            int r0 = r4.length
            int r0 = r7 - r0
            if (r0 <= 0) goto L3e
            int r0 = r4.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            int r1 = r0 - r7
            if (r1 >= 0) goto L38
            r0 = r7
        L38:
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.lang.Short[] r4 = (java.lang.Short[]) r4
        L3e:
            java.lang.Integer r0 = r3.readInt32()
            if (r0 != 0) goto L46
            r0 = r5
            goto L4a
        L46:
            short r0 = r0.shortValue()
        L4a:
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r4[r6] = r0
            r6 = r7
            goto L14
        L52:
            java.lang.String r4 = "input end"
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            r3 = 0
            return r3
        L5d:
            boolean r4 = r3.isString()
            if (r4 == 0) goto L7d
            java.lang.String r4 = r3.readString()
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L6e
            return r5
        L6e:
            java.lang.String r5 = "not support input "
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            r3 = 0
            return r3
        L7d:
            java.lang.String r4 = "TODO"
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            r3 = 0
            return r3
    }
}
