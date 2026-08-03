package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplGenericArray implements com.alibaba.fastjson2.reader.ObjectReader {
    final java.lang.Class arrayClass;
    final java.lang.String arrayClassName;
    final long arrayClassNameHash;
    final java.lang.reflect.Type arrayType;
    final java.lang.Class<?> componentClass;
    com.alibaba.fastjson2.reader.ObjectReader itemObjectReader;
    final java.lang.reflect.Type itemType;

    public ObjectReaderImplGenericArray(java.lang.reflect.GenericArrayType r3) {
            r2 = this;
            r2.<init>()
            r2.arrayType = r3
            java.lang.Class r0 = com.alibaba.fastjson2.util.TypeUtils.getClass(r3)
            r2.arrayClass = r0
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r2.itemType = r3
            java.lang.Class r3 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r3)
            r2.componentClass = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.String r3 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.arrayClassName = r3
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r3)
            r2.arrayClassNameHash = r0
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            r8 = -110(0xffffffffffffff92, float:NaN)
            boolean r8 = r7.nextIfMatch(r8)
            if (r8 == 0) goto L22
            long r8 = r7.readTypeHashCode()
            long r10 = r6.arrayClassNameHash
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L13
            goto L22
        L13:
            java.lang.String r7 = r7.getString()
            java.lang.String r8 = "not support input typeName "
            java.lang.String r7 = wb.en.g(r8, r7)
            ah.a.w(r7)
            r7 = 0
            return r7
        L22:
            int r8 = r7.startArray()
            if (r8 <= 0) goto L36
            com.alibaba.fastjson2.reader.ObjectReader r9 = r6.itemObjectReader
            if (r9 != 0) goto L36
            com.alibaba.fastjson2.JSONReader$Context r9 = r7.context
            java.lang.reflect.Type r10 = r6.itemType
            com.alibaba.fastjson2.reader.ObjectReader r9 = r9.getObjectReader(r10)
            r6.itemObjectReader = r9
        L36:
            java.lang.Class<?> r9 = r6.componentClass
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r8)
            r10 = 0
        L3d:
            if (r10 >= r8) goto L52
            com.alibaba.fastjson2.reader.ObjectReader r0 = r6.itemObjectReader
            java.lang.reflect.Type r2 = r6.itemType
            r3 = 0
            r4 = 0
            r1 = r7
            java.lang.Object r7 = r0.readJSONBObject(r1, r2, r3, r4)
            java.lang.reflect.Array.set(r9, r10, r7)
            int r10 = r10 + 1
            r7 = r1
            goto L3d
        L52:
            return r9
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r9, java.lang.reflect.Type r10, java.lang.Object r11, long r12) {
            r8 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r8.itemObjectReader
            if (r0 != 0) goto Le
            com.alibaba.fastjson2.JSONReader$Context r0 = r9.context
            java.lang.reflect.Type r1 = r8.itemType
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReader(r1)
            r8.itemObjectReader = r0
        Le:
            boolean r0 = r9.jsonb
            if (r0 == 0) goto L1d
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            java.lang.Object r9 = r1.readJSONBObject(r2, r3, r4, r5)
            return r9
        L1d:
            r1 = r8
            r2 = r9
            r3 = r10
            boolean r9 = r2.readIfNull()
            r10 = 0
            if (r9 == 0) goto L28
            return r10
        L28:
            char r9 = r2.current()
            r11 = 34
            if (r9 != r11) goto L70
            boolean r9 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r9 == 0) goto L5c
            r9 = r3
            java.lang.reflect.GenericArrayType r9 = (java.lang.reflect.GenericArrayType) r9
            java.lang.reflect.Type r9 = r9.getGenericComponentType()
            java.lang.Class r11 = java.lang.Byte.TYPE
            if (r9 != r11) goto L5c
            long r9 = r2.features(r12)
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.Base64StringAsByteArray
            long r11 = r11.mask
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L57
            java.lang.String r9 = r2.readString()
            byte[] r9 = com.alibaba.fastjson2.util.IOUtils.decodeBase64(r9)
            return r9
        L57:
            byte[] r9 = r2.readBinary()
            return r9
        L5c:
            java.lang.String r9 = r2.readString()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L67
            return r10
        L67:
            java.lang.String r9 = r2.info()
            ah.a.w(r9)
            r9 = 0
            return r9
        L70:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = 91
            if (r9 != r11) goto Lda
            r2.next()
        L7c:
            boolean r9 = r2.nextIfArrayEnd()
            if (r9 == 0) goto La1
            r2.nextIfComma()
            java.lang.Class<?> r9 = r1.componentClass
            int r11 = r10.size()
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r11)
            r11 = 0
        L90:
            int r12 = r10.size()
            if (r11 >= r12) goto La0
            java.lang.Object r12 = r10.get(r11)
            java.lang.reflect.Array.set(r9, r11, r12)
            int r11 = r11 + 1
            goto L90
        La0:
            return r9
        La1:
            r3 = r2
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.itemObjectReader
            java.lang.reflect.Type r4 = r1.itemType
            if (r2 == 0) goto Lb1
            r5 = 0
            r6 = 0
            java.lang.Object r9 = r2.readObject(r3, r4, r5, r6)
            r2 = r3
            goto Lba
        Lb1:
            r2 = r3
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            if (r4 != r9) goto Lc1
            java.lang.String r9 = r2.readString()
        Lba:
            r10.add(r9)
            r2.nextIfComma()
            goto L7c
        Lc1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "TODO : "
            r9.<init>(r10)
            java.lang.reflect.Type r10 = r1.itemType
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r2.info(r9)
            ah.a.w(r9)
            r9 = 0
            return r9
        Lda:
            java.lang.String r9 = r2.info()
            ah.a.w(r9)
            r9 = 0
            return r9
    }
}
