package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplFloatValueArray extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplFloatValueArray INSTANCE = null;
    static final long TYPE_HASH = 0;
    final java.util.function.Function<float[], java.lang.Object> builder;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplFloatValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFloatValueArray
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplFloatValueArray.INSTANCE = r0
            java.lang.String r0 = "[F"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplFloatValueArray.TYPE_HASH = r0
            return
    }

    public ObjectReaderImplFloatValueArray(java.util.function.Function<float[], java.lang.Object> r2) {
            r1 = this;
            java.lang.Class<float[]> r0 = float[].class
            r1.<init>(r0)
            r1.builder = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r5, long r6) {
            r4 = this;
            int r6 = r5.size()
            float[] r6 = new float[r6]
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
            if (r1 == 0) goto L24
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            goto L3c
        L24:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r3 = java.lang.Float.TYPE
            java.util.function.Function r1 = r1.getTypeConvert(r2, r3)
            if (r1 == 0) goto L42
            java.lang.Object r0 = r1.apply(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
        L3c:
            int r1 = r7 + 1
            r6[r7] = r0
            r7 = r1
            goto Lb
        L42:
            java.lang.String r5 = "can not cast to float "
            java.lang.Class r6 = r0.getClass()
            ah.a.i(r6, r5)
            r5 = 0
            return r5
        L4d:
            java.util.function.Function<float[], java.lang.Object> r5 = r4.builder
            if (r5 == 0) goto L56
            java.lang.Object r5 = r5.apply(r6)
            return r5
        L56:
            return r6
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            r2 = -110(0xffffffffffffff92, float:NaN)
            boolean r2 = r1.nextIfMatch(r2)
            if (r2 == 0) goto L1e
            long r2 = r1.readTypeHashCode()
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplFloatValueArray.TYPE_HASH
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L1e
        L13:
            java.lang.String r2 = "not support autoType : "
            java.lang.String r1 = r1.getString()
            ah.a.i(r1, r2)
            r1 = 0
            return r1
        L1e:
            int r2 = r1.startArray()
            r3 = -1
            if (r2 != r3) goto L27
            r1 = 0
            return r1
        L27:
            float[] r3 = new float[r2]
            r4 = 0
        L2a:
            if (r4 >= r2) goto L35
            float r5 = r1.readFloatValue()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L2a
        L35:
            java.util.function.Function<float[], java.lang.Object> r1 = r0.builder
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.apply(r3)
            return r1
        L3e:
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
            if (r3 == 0) goto L56
            r3 = 16
            float[] r3 = new float[r3]
            r4 = 0
        L13:
            boolean r5 = r2.nextIfArrayEnd()
            if (r5 == 0) goto L29
            r2.nextIfComma()
            float[] r2 = java.util.Arrays.copyOf(r3, r4)
            java.util.function.Function<float[], java.lang.Object> r3 = r1.builder
            if (r3 == 0) goto L28
            java.lang.Object r2 = r3.apply(r2)
        L28:
            return r2
        L29:
            boolean r5 = r2.isEnd()
            if (r5 != 0) goto L4b
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
            float[] r3 = java.util.Arrays.copyOf(r3, r6)
        L43:
            float r6 = r2.readFloatValue()
            r3[r4] = r6
            r4 = r5
            goto L13
        L4b:
            java.lang.String r3 = "input end"
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
        L54:
            r2 = 0
            return r2
        L56:
            boolean r3 = r2.isString()
            if (r3 == 0) goto L75
            java.lang.String r3 = r2.readString()
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L67
            return r4
        L67:
            java.lang.String r4 = "not support input "
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            goto L54
        L75:
            java.lang.String r3 = "TODO"
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            goto L54
    }
}
