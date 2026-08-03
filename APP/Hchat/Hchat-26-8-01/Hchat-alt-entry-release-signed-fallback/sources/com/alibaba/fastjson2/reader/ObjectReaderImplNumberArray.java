package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplNumberArray extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplNumberArray INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplNumberArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplNumberArray
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplNumberArray.INSTANCE = r0
            return
    }

    public ObjectReaderImplNumberArray() {
            r1 = this;
            java.lang.Class<java.lang.Number[]> r0 = java.lang.Number[].class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r5, long r6) {
            r4 = this;
            int r6 = r5.size()
            java.lang.Number[] r6 = new java.lang.Number[r6]
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r5.next()
            if (r0 == 0) goto L3c
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L1c
            goto L3c
        L1c:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r2 = r0.getClass()
            java.lang.Class<java.lang.Number> r3 = java.lang.Number.class
            java.util.function.Function r1 = r1.getTypeConvert(r2, r3)
            if (r1 == 0) goto L31
            java.lang.Object r0 = r1.apply(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            goto L3e
        L31:
            java.lang.String r5 = "can not cast to Number "
            java.lang.Class r6 = r0.getClass()
            ah.a.i(r6, r5)
            r5 = 0
            return r5
        L3c:
            java.lang.Number r0 = (java.lang.Number) r0
        L3e:
            int r1 = r7 + 1
            r6[r7] = r0
            r7 = r1
            goto Lb
        L44:
            return r6
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            int r2 = r1.startArray()
            r3 = -1
            if (r2 != r3) goto L9
            r1 = 0
            return r1
        L9:
            java.lang.Number[] r3 = new java.lang.Number[r2]
            r4 = 0
        Lc:
            if (r4 >= r2) goto L17
            java.lang.Number r5 = r1.readNumber()
            r3[r4] = r5
            int r4 = r4 + 1
            goto Lc
        L17:
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r2, java.lang.reflect.Type r3, java.lang.Object r4, long r5) {
            r1 = this;
            boolean r3 = r2.readIfNull()
            if (r3 == 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r3 = r2.nextIfArrayStart()
            if (r3 == 0) goto L3f
            r3 = 16
            java.lang.Number[] r3 = new java.lang.Number[r3]
            r4 = 0
        L13:
            boolean r5 = r2.nextIfArrayEnd()
            if (r5 == 0) goto L21
            r2.nextIfComma()
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r4)
            return r2
        L21:
            int r5 = r4 + 1
            int r6 = r3.length
            int r6 = r5 - r6
            if (r6 <= 0) goto L37
            int r6 = r3.length
            int r0 = r6 >> 1
            int r6 = r6 + r0
            int r0 = r6 - r5
            if (r0 >= 0) goto L31
            r6 = r5
        L31:
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r6)
            java.lang.Number[] r3 = (java.lang.Number[]) r3
        L37:
            java.lang.Number r6 = r2.readNumber()
            r3[r4] = r6
            r4 = r5
            goto L13
        L3f:
            java.lang.String r3 = "TODO"
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            r2 = 0
            return r2
    }
}
