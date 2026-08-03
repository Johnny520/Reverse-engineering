package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt8ValueArray extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final long HASH_TYPE = 0;
    static final com.alibaba.fastjson2.reader.ObjectReaderImplInt8ValueArray INSTANCE = null;
    final java.util.function.Function<byte[], java.lang.Object> builder;
    final long features;
    final java.lang.String format;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplInt8ValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt8ValueArray
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt8ValueArray.INSTANCE = r0
            java.lang.String r0 = "[B"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplInt8ValueArray.HASH_TYPE = r0
            return
    }

    public ObjectReaderImplInt8ValueArray(java.lang.String r3) {
            r2 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            r2.<init>(r0)
            r2.format = r3
            r3 = 0
            r2.builder = r3
            r0 = 0
            r2.features = r0
            return
    }

    public ObjectReaderImplInt8ValueArray(java.util.function.Function<byte[], java.lang.Object> r3, java.lang.String r4) {
            r2 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            r2.<init>(r0)
            r2.format = r4
            java.lang.String r0 = "base64"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L14
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.Base64StringAsByteArray
            long r0 = r4.mask
            goto L16
        L14:
            r0 = 0
        L16:
            r2.features = r0
            r2.builder = r3
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r6, long r7) {
            r5 = this;
            int r7 = r6.size()
            byte[] r7 = new byte[r7]
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
            byte r1 = r1.byteValue()
            goto L3d
        L25:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r3 = r1.getClass()
            java.lang.Class r4 = java.lang.Byte.TYPE
            java.util.function.Function r2 = r2.getTypeConvert(r3, r4)
            if (r2 == 0) goto L43
            java.lang.Object r1 = r2.apply(r1)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
        L3d:
            int r2 = r0 + 1
            r7[r0] = r1
            r0 = r2
            goto Lc
        L43:
            java.lang.String r6 = "can not cast to byte "
            java.lang.Class r7 = r1.getClass()
            ah.a.i(r7, r6)
            r6 = 0
            return r6
        L4e:
            java.util.function.Function<byte[], java.lang.Object> r6 = r5.builder
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
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplInt8ValueArray.HASH_TYPE
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L24
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array.HASH_TYPE
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
            boolean r2 = r1.isBinary()
            if (r2 == 0) goto L2f
            byte[] r1 = r1.readBinary()
            goto L57
        L2f:
            boolean r2 = r1.isString()
            if (r2 == 0) goto L3e
            java.lang.String r1 = r1.readString()
            byte[] r1 = com.alibaba.fastjson2.util.IOUtils.decodeBase64(r1)
            goto L57
        L3e:
            int r2 = r1.startArray()
            r3 = -1
            if (r2 != r3) goto L47
            r1 = 0
            return r1
        L47:
            byte[] r3 = new byte[r2]
            r4 = 0
        L4a:
            if (r4 >= r2) goto L56
            int r5 = r1.readInt32Value()
            byte r5 = (byte) r5
            r3[r4] = r5
            int r4 = r4 + 1
            goto L4a
        L56:
            r1 = r3
        L57:
            java.util.function.Function<byte[], java.lang.Object> r2 = r0.builder
            if (r2 == 0) goto L5f
            java.lang.Object r1 = r2.apply(r1)
        L5f:
            return r1
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
            if (r4 == 0) goto L57
            r4 = 16
            byte[] r4 = new byte[r4]
            r5 = 0
        L13:
            boolean r6 = r3.nextIfArrayEnd()
            if (r6 == 0) goto L29
            r3.nextIfComma()
            byte[] r3 = java.util.Arrays.copyOf(r4, r5)
            java.util.function.Function<byte[], java.lang.Object> r4 = r2.builder
            if (r4 == 0) goto L28
            java.lang.Object r3 = r4.apply(r3)
        L28:
            return r3
        L29:
            boolean r6 = r3.isEnd()
            if (r6 != 0) goto L4c
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
            byte[] r4 = java.util.Arrays.copyOf(r4, r7)
        L43:
            int r7 = r3.readInt32Value()
            byte r7 = (byte) r7
            r4[r5] = r7
            r5 = r6
            goto L13
        L4c:
            java.lang.String r4 = "input end"
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
        L55:
            r3 = 0
            return r3
        L57:
            boolean r4 = r3.isString()
            if (r4 == 0) goto Lae
            long r0 = r2.features
            long r6 = r6 | r0
            long r6 = r3.features(r6)
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.Base64StringAsByteArray
            long r0 = r4.mask
            long r6 = r6 & r0
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 == 0) goto L74
            byte[] r5 = r3.readBase64()
            goto L96
        L74:
            java.lang.String r4 = r3.readString()
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L7f
            goto L96
        L7f:
            java.lang.String r5 = ";base64,"
            int r5 = r4.indexOf(r5)
            r6 = -1
            if (r5 == r6) goto La0
            int r5 = r5 + 8
            java.lang.String r3 = r4.substring(r5)
            java.util.Base64$Decoder r4 = java.util.Base64.getDecoder()
            byte[] r5 = r4.decode(r3)
        L96:
            java.util.function.Function<byte[], java.lang.Object> r3 = r2.builder
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r3.apply(r5)
            return r3
        L9f:
            return r5
        La0:
            java.lang.String r5 = "illegal input : "
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            goto L55
        Lae:
            java.lang.String r4 = "TODO"
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            goto L55
    }
}
