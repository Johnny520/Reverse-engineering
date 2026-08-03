package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplMapEntry extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    volatile com.alibaba.fastjson2.reader.ObjectReader keyReader;
    final java.lang.reflect.Type keyType;
    volatile com.alibaba.fastjson2.reader.ObjectReader valueReader;
    final java.lang.reflect.Type valueType;

    public ObjectReaderImplMapEntry(java.lang.reflect.Type r2, java.lang.reflect.Type r3) {
            r1 = this;
            java.lang.Class<java.util.Map$Entry> r0 = java.util.Map.Entry.class
            r1.<init>(r0)
            r1.keyType = r2
            r1.valueType = r3
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r8, java.lang.reflect.Type r9, java.lang.Object r10, long r11) {
            r7 = this;
            int r0 = r8.startArray()
            r1 = 2
            if (r0 != r1) goto L4b
            java.lang.reflect.Type r0 = r7.keyType
            if (r0 != 0) goto L14
            java.lang.Object r0 = r8.readAny()
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            goto L2a
        L14:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.keyReader
            if (r0 != 0) goto L20
            java.lang.reflect.Type r0 = r7.keyType
            com.alibaba.fastjson2.reader.ObjectReader r0 = r8.getObjectReader(r0)
            r7.keyReader = r0
        L20:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.keyReader
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r0 = r1.readObject(r2, r3, r4, r5)
        L2a:
            java.lang.reflect.Type r8 = r7.valueType
            if (r8 != 0) goto L33
            java.lang.Object r8 = r2.readAny()
            goto L45
        L33:
            com.alibaba.fastjson2.reader.ObjectReader r8 = r7.valueReader
            if (r8 != 0) goto L3f
            java.lang.reflect.Type r8 = r7.valueType
            com.alibaba.fastjson2.reader.ObjectReader r8 = r2.getObjectReader(r8)
            r7.valueReader = r8
        L3f:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.valueReader
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)
        L45:
            java.util.AbstractMap$SimpleEntry r9 = new java.util.AbstractMap$SimpleEntry
            r9.<init>(r0, r8)
            return r9
        L4b:
            r2 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "entryCnt must be 2, but "
            r8.<init>(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r2.info(r8)
            ah.a.w(r8)
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r9, java.lang.reflect.Type r10, java.lang.Object r11, long r12) {
            r8 = this;
            r9.nextIfObjectStart()
            java.lang.Object r0 = r9.readAny()
            r1 = 58
            r9.nextIfMatch(r1)
            java.lang.reflect.Type r1 = r8.valueType
            if (r1 != 0) goto L16
            java.lang.Object r10 = r9.readAny()
            r3 = r9
            goto L2c
        L16:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r8.valueReader
            if (r1 != 0) goto L22
            java.lang.reflect.Type r1 = r8.valueType
            com.alibaba.fastjson2.reader.ObjectReader r1 = r9.getObjectReader(r1)
            r8.valueReader = r1
        L22:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r8.valueReader
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r10 = r2.readObject(r3, r4, r5, r6)
        L2c:
            r3.nextIfObjectEnd()
            r3.nextIfComma()
            java.util.AbstractMap$SimpleEntry r9 = new java.util.AbstractMap$SimpleEntry
            r9.<init>(r0, r10)
            return r9
    }
}
