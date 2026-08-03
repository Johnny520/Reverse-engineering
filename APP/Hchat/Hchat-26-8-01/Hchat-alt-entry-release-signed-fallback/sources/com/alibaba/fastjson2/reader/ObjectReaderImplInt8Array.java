package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt8Array extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final long HASH_TYPE = 0;
    static final com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array INSTANCE = null;
    final java.lang.String format;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array.INSTANCE = r0
            java.lang.String r0 = "[Byte"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array.HASH_TYPE = r0
            return
    }

    public ObjectReaderImplInt8Array(java.lang.String r2) {
            r1 = this;
            java.lang.Class<java.lang.Byte[]> r0 = java.lang.Byte[].class
            r1.<init>(r0)
            r1.format = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r5, long r6) {
            r4 = this;
            int r6 = r5.size()
            java.lang.Byte[] r6 = new java.lang.Byte[r6]
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
            byte r0 = r0.byteValue()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            goto L3c
        L28:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r2 = r0.getClass()
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            java.util.function.Function r1 = r1.getTypeConvert(r2, r3)
            if (r1 == 0) goto L42
            java.lang.Object r0 = r1.apply(r0)
            java.lang.Byte r0 = (java.lang.Byte) r0
        L3c:
            int r1 = r7 + 1
            r6[r7] = r0
            r7 = r1
            goto Lb
        L42:
            java.lang.String r5 = "can not cast to Byte "
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
            if (r3 == 0) goto L1e
            long r3 = r2.readTypeHashCode()
            long r5 = com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array.HASH_TYPE
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L13
            goto L1e
        L13:
            java.lang.String r3 = "not support autoType : "
            java.lang.String r2 = r2.getString()
            ah.a.i(r2, r3)
            r2 = 0
            return r2
        L1e:
            boolean r3 = r2.isString()
            if (r3 == 0) goto L33
            java.lang.String r3 = "hex"
            java.lang.String r4 = r1.format
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L33
            byte[] r2 = r2.readHex()
            return r2
        L33:
            int r3 = r2.startArray()
            r4 = -1
            r5 = 0
            if (r3 != r4) goto L3c
            return r5
        L3c:
            java.lang.Byte[] r4 = new java.lang.Byte[r3]
            r6 = 0
        L3f:
            if (r6 >= r3) goto L56
            java.lang.Integer r0 = r2.readInt32()
            if (r0 != 0) goto L49
            r0 = r5
            goto L51
        L49:
            byte r0 = r0.byteValue()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
        L51:
            r4[r6] = r0
            int r6 = r6 + 1
            goto L3f
        L56:
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
            r6 = 0
            if (r4 == 0) goto L5c
            r4 = 16
            java.lang.Byte[] r4 = new java.lang.Byte[r4]
        L13:
            boolean r7 = r3.nextIfArrayEnd()
            if (r7 == 0) goto L21
            r3.nextIfComma()
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r6)
            return r3
        L21:
            boolean r7 = r3.isEnd()
            if (r7 != 0) goto L51
            int r7 = r6 + 1
            int r0 = r4.length
            int r0 = r7 - r0
            if (r0 <= 0) goto L3d
            int r0 = r4.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            int r1 = r0 - r7
            if (r1 >= 0) goto L37
            r0 = r7
        L37:
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.lang.Byte[] r4 = (java.lang.Byte[]) r4
        L3d:
            java.lang.Integer r0 = r3.readInt32()
            if (r0 != 0) goto L45
            r0 = r5
            goto L4d
        L45:
            byte r0 = r0.byteValue()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
        L4d:
            r4[r6] = r0
            r6 = r7
            goto L13
        L51:
            java.lang.String r4 = "input end"
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            r3 = 0
            return r3
        L5c:
            char r4 = r3.current()
            r7 = 120(0x78, float:1.68E-43)
            if (r4 != r7) goto L69
            byte[] r3 = r3.readBinary()
            return r3
        L69:
            boolean r4 = r3.isString()
            if (r4 == 0) goto Le2
            java.lang.String r4 = "hex"
            java.lang.String r7 = r2.format
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L7e
            byte[] r3 = r3.readHex()
            return r3
        L7e:
            java.lang.String r4 = r3.readString()
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L89
            return r5
        L89:
            java.lang.String r5 = "base64"
            java.lang.String r7 = r2.format
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L98
            byte[] r3 = com.alibaba.fastjson2.util.IOUtils.decodeBase64(r4)
            return r3
        L98:
            java.lang.String r5 = "gzip,base64"
            java.lang.String r7 = r2.format
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto Lac
            java.lang.String r5 = "gzip"
            java.lang.String r7 = r2.format
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto Le2
        Lac:
            byte[] r4 = com.alibaba.fastjson2.util.IOUtils.decodeBase64(r4)
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> Lcf
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> Lcf
            r7.<init>(r4)     // Catch: java.io.IOException -> Lcf
            r5.<init>(r7)     // Catch: java.io.IOException -> Lcf
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> Lcf
            r4.<init>()     // Catch: java.io.IOException -> Lcf
        Lbf:
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.io.IOException -> Lcf
            int r0 = r5.read(r7)     // Catch: java.io.IOException -> Lcf
            r1 = -1
            if (r0 != r1) goto Ld1
            byte[] r3 = r4.toByteArray()     // Catch: java.io.IOException -> Lcf
            return r3
        Lcf:
            r4 = move-exception
            goto Ld7
        Ld1:
            if (r0 <= 0) goto Lbf
            r4.write(r7, r6, r0)     // Catch: java.io.IOException -> Lcf
            goto Lbf
        Ld7:
            java.lang.String r5 = "unzip bytes error."
            java.lang.String r3 = r3.info(r5)
            ah.a.x(r3, r4)
            r3 = 0
            return r3
        Le2:
            java.lang.String r4 = "TODO"
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            r3 = 0
            return r3
    }
}
