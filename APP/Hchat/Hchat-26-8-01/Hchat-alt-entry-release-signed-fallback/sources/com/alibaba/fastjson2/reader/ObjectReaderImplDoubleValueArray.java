package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplDoubleValueArray extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplDoubleValueArray INSTANCE = null;
    static final long TYPE_HASH = 0;
    final java.util.function.Function<double[], java.lang.Object> builder;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplDoubleValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplDoubleValueArray
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplDoubleValueArray.INSTANCE = r0
            java.lang.String r0 = "[D"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplDoubleValueArray.TYPE_HASH = r0
            return
    }

    public ObjectReaderImplDoubleValueArray(java.util.function.Function<double[], java.lang.Object> r2) {
            r1 = this;
            java.lang.Class<double[]> r0 = double[].class
            r1.<init>(r0)
            r1.builder = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r5, long r6) {
            r4 = this;
            int r6 = r5.size()
            double[] r6 = new double[r6]
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r5.next()
            if (r0 != 0) goto L1a
            r0 = 0
            goto L3d
        L1a:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L25
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            goto L3d
        L25:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r3 = java.lang.Double.TYPE
            java.util.function.Function r1 = r1.getTypeConvert(r2, r3)
            if (r1 == 0) goto L43
            java.lang.Object r0 = r1.apply(r0)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
        L3d:
            int r2 = r7 + 1
            r6[r7] = r0
            r7 = r2
            goto Lb
        L43:
            java.lang.String r5 = "can not cast to double "
            java.lang.Class r6 = r0.getClass()
            ah.a.i(r6, r5)
            r5 = 0
            return r5
        L4e:
            java.util.function.Function<double[], java.lang.Object> r5 = r4.builder
            if (r5 == 0) goto L57
            java.lang.Object r5 = r5.apply(r6)
            return r5
        L57:
            return r6
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            r4 = -110(0xffffffffffffff92, float:NaN)
            boolean r4 = r3.nextIfMatch(r4)
            if (r4 == 0) goto L1e
            long r4 = r3.readTypeHashCode()
            long r6 = com.alibaba.fastjson2.reader.ObjectReaderImplDoubleValueArray.TYPE_HASH
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L13
            goto L1e
        L13:
            java.lang.String r4 = "not support autoType : "
            java.lang.String r3 = r3.getString()
            ah.a.i(r3, r4)
            r3 = 0
            return r3
        L1e:
            int r4 = r3.startArray()
            r5 = -1
            if (r4 != r5) goto L27
            r3 = 0
            return r3
        L27:
            double[] r5 = new double[r4]
            r6 = 0
        L2a:
            if (r6 >= r4) goto L35
            double r0 = r3.readDoubleValue()
            r5[r6] = r0
            int r6 = r6 + 1
            goto L2a
        L35:
            java.util.function.Function<double[], java.lang.Object> r3 = r2.builder
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r3.apply(r5)
            return r3
        L3e:
            return r5
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
            if (r4 == 0) goto L56
            r4 = 16
            double[] r4 = new double[r4]
            r5 = 0
        L13:
            boolean r6 = r3.nextIfArrayEnd()
            if (r6 == 0) goto L29
            r3.nextIfComma()
            double[] r3 = java.util.Arrays.copyOf(r4, r5)
            java.util.function.Function<double[], java.lang.Object> r4 = r2.builder
            if (r4 == 0) goto L28
            java.lang.Object r3 = r4.apply(r3)
        L28:
            return r3
        L29:
            boolean r6 = r3.isEnd()
            if (r6 != 0) goto L4b
            int r6 = r5 + 1
            int r7 = r4.length
            int r7 = r6 - r7
            if (r7 <= 0) goto L43
            int r7 = r4.length
            int r0 = r7 >> 1
            int r7 = r7 + r0
            int r0 = r7 - r6
            if (r0 >= 0) goto L3f
            r7 = r6
        L3f:
            double[] r4 = java.util.Arrays.copyOf(r4, r7)
        L43:
            double r0 = r3.readDoubleValue()
            r4[r5] = r0
            r5 = r6
            goto L13
        L4b:
            java.lang.String r4 = "input end"
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
        L54:
            r3 = 0
            return r3
        L56:
            boolean r4 = r3.isString()
            if (r4 == 0) goto L75
            java.lang.String r4 = r3.readString()
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L67
            return r5
        L67:
            java.lang.String r5 = "not support input "
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            goto L54
        L75:
            java.lang.String r4 = "TODO"
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            goto L54
    }
}
