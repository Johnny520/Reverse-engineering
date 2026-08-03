package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt8Array extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplInt8Array INSTANCE = null;
    static final long JSONB_TYPE_HASH = 0;
    static final byte[] JSONB_TYPE_NAME_BYTES = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8Array r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplInt8Array
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8Array.INSTANCE = r0
            java.lang.String r0 = "[Byte"
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8Array.JSONB_TYPE_NAME_BYTES = r1
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8Array.JSONB_TYPE_HASH = r0
            return
    }

    public ObjectWriterImplInt8Array() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r3 = r3.mask
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = r4
        L15:
            java.lang.Byte[] r2 = (java.lang.Byte[]) r2
            r1.startArray()
        L1a:
            int r5 = r2.length
            if (r4 >= r5) goto L3e
            if (r4 == 0) goto L22
            r1.writeComma()
        L22:
            r5 = r2[r4]
            if (r5 != 0) goto L2a
            r1.writeNull()
            goto L3b
        L2a:
            if (r3 == 0) goto L34
            byte r5 = r5.byteValue()
            r1.writeString(r5)
            goto L3b
        L34:
            byte r5 = r5.byteValue()
            r1.writeInt8(r5)
        L3b:
            int r4 = r4 + 1
            goto L1a
        L3e:
            r1.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, long r7) {
            r2 = this;
            if (r4 != 0) goto L6
            r3.writeNull()
            return
        L6:
            boolean r5 = r3.isWriteTypeInfo(r4, r6)
            if (r5 == 0) goto L13
            byte[] r5 = com.alibaba.fastjson2.writer.ObjectWriterImplInt8Array.JSONB_TYPE_NAME_BYTES
            long r0 = com.alibaba.fastjson2.writer.ObjectWriterImplInt8Array.JSONB_TYPE_HASH
            r3.writeTypeName(r5, r0)
        L13:
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r5 = r5.mask
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L21
            r5 = 1
            goto L22
        L21:
            r5 = r6
        L22:
            java.lang.Byte[] r4 = (java.lang.Byte[]) r4
            int r7 = r4.length
            r3.startArray(r7)
        L28:
            int r7 = r4.length
            if (r6 >= r7) goto L47
            r7 = r4[r6]
            if (r7 != 0) goto L33
            r3.writeNull()
            goto L44
        L33:
            if (r5 == 0) goto L3d
            byte r7 = r7.byteValue()
            r3.writeString(r7)
            goto L44
        L3d:
            byte r7 = r7.byteValue()
            r3.writeInt8(r7)
        L44:
            int r6 = r6 + 1
            goto L28
        L47:
            return
    }
}
