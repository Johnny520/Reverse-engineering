package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt8ValueArray extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray INSTANCE = null;
    static final long JSONB_TYPE_HASH = 0;
    static final byte[] JSONB_TYPE_NAME_BYTES = null;
    private final java.util.function.Function<java.lang.Object, byte[]> function;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray.INSTANCE = r0
            java.lang.String r0 = "[B"
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray.JSONB_TYPE_NAME_BYTES = r1
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray.JSONB_TYPE_HASH = r0
            return
    }

    public ObjectWriterImplInt8ValueArray(java.util.function.Function<java.lang.Object, byte[]> r1) {
            r0 = this;
            r0.<init>()
            r0.function = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r7, java.lang.Object r8, java.lang.Object r9, java.lang.reflect.Type r10, long r11) {
            r6 = this;
            if (r8 != 0) goto L6
            r7.writeArrayNull()
            return
        L6:
            java.util.function.Function<java.lang.Object, byte[]> r9 = r6.function
            if (r9 == 0) goto L11
            java.lang.Object r8 = r9.apply(r8)
            byte[] r8 = (byte[]) r8
            goto L13
        L11:
            byte[] r8 = (byte[]) r8
        L13:
            com.alibaba.fastjson2.JSONWriter$Context r9 = r7.context
            java.lang.String r9 = r9.getDateFormat()
            java.lang.String r10 = "millis"
            boolean r10 = r10.equals(r9)
            r0 = 0
            if (r10 == 0) goto L23
            r9 = r0
        L23:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r1 = r10.mask
            long r1 = r1 & r11
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 == 0) goto L32
            r7.writeString(r8)
            return
        L32:
            java.lang.String r10 = "gzip"
            boolean r10 = r10.equals(r9)
            java.lang.String r1 = "gzip,base64"
            if (r10 != 0) goto L42
            boolean r10 = r1.equals(r9)
            if (r10 == 0) goto L6b
        L42:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r10.<init>()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            int r2 = r8.length     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r5 = 512(0x200, float:7.17E-43)
            if (r2 >= r5) goto L58
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            int r5 = r8.length     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r2.<init>(r10, r5)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
        L52:
            r0 = r2
            goto L5e
        L54:
            r7 = move-exception
            goto Lab
        L56:
            r7 = move-exception
            goto La3
        L58:
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            goto L52
        L5e:
            r0.write(r8)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r0.finish()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            byte[] r8 = r10.toByteArray()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            com.alibaba.fastjson2.util.IOUtils.close(r0)
        L6b:
            java.lang.String r10 = "base64"
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L9f
            boolean r9 = r1.equals(r9)
            if (r9 != 0) goto L9f
            long r9 = r7.getFeatures(r11)
            com.alibaba.fastjson2.JSONWriter$Feature r11 = com.alibaba.fastjson2.JSONWriter.Feature.WriteByteArrayAsBase64
            long r11 = r11.mask
            long r9 = r9 & r11
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 == 0) goto L87
            goto L9f
        L87:
            r7.startArray()
            r9 = 0
        L8b:
            int r10 = r8.length
            if (r9 >= r10) goto L9b
            if (r9 == 0) goto L93
            r7.writeComma()
        L93:
            r10 = r8[r9]
            r7.writeInt32(r10)
            int r9 = r9 + 1
            goto L8b
        L9b:
            r7.endArray()
            return
        L9f:
            r7.writeBase64(r8)
            return
        La3:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L54
            java.lang.String r9 = "write gzipBytes error"
            r8.<init>(r9, r7)     // Catch: java.lang.Throwable -> L54
            throw r8     // Catch: java.lang.Throwable -> L54
        Lab:
            com.alibaba.fastjson2.util.IOUtils.close(r0)
            throw r7
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            boolean r3 = r1.isWriteTypeInfo(r2, r4)
            if (r3 == 0) goto L1d
            java.lang.Class<byte[]> r3 = byte[].class
            if (r2 != r3) goto L12
            byte[] r3 = com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray.JSONB_TYPE_NAME_BYTES
            long r4 = com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray.JSONB_TYPE_HASH
            r1.writeTypeName(r3, r4)
            goto L1d
        L12:
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            r1.writeTypeName(r3)
        L1d:
            java.util.function.Function<java.lang.Object, byte[]> r3 = r0.function
            if (r3 == 0) goto L2a
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r3.apply(r2)
            byte[] r2 = (byte[]) r2
            goto L2c
        L2a:
            byte[] r2 = (byte[]) r2
        L2c:
            r1.writeBinary(r2)
            return
    }
}
