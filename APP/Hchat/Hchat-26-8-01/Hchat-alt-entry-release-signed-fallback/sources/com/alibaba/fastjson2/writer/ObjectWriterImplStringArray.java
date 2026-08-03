package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplStringArray extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplStringArray INSTANCE = null;
    static final long JSONB_TYPE_HASH = 0;
    static final byte[] TYPE_NAME_BYTES = null;

    static {
            java.lang.String r0 = "[String"
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplStringArray.TYPE_NAME_BYTES = r1
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplStringArray.JSONB_TYPE_HASH = r0
            com.alibaba.fastjson2.writer.ObjectWriterImplStringArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplStringArray
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplStringArray.INSTANCE = r0
            return
    }

    public ObjectWriterImplStringArray() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeArrayNull()
            return
        L6:
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.writeString(r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, long r7) {
            r2 = this;
            if (r4 != 0) goto L6
            r3.writeArrayNull()
            return
        L6:
            boolean r5 = r3.isWriteTypeInfo(r4, r6, r7)
            if (r5 == 0) goto L13
            byte[] r5 = com.alibaba.fastjson2.writer.ObjectWriterImplStringArray.TYPE_NAME_BYTES
            long r6 = com.alibaba.fastjson2.writer.ObjectWriterImplStringArray.JSONB_TYPE_HASH
            r3.writeTypeName(r5, r6)
        L13:
            java.lang.String[] r4 = (java.lang.String[]) r4
            int r5 = r4.length
            r3.startArray(r5)
            r5 = 0
        L1a:
            int r6 = r4.length
            if (r5 >= r6) goto L40
            r6 = r4[r5]
            if (r6 != 0) goto L3a
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r6 = r6.mask
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r0 = r8.mask
            long r6 = r6 | r0
            boolean r6 = r3.isEnabled(r6)
            if (r6 == 0) goto L36
            java.lang.String r6 = ""
            r3.writeString(r6)
            goto L3d
        L36:
            r3.writeNull()
            goto L3d
        L3a:
            r3.writeString(r6)
        L3d:
            int r5 = r5 + 1
            goto L1a
        L40:
            return
    }
}
