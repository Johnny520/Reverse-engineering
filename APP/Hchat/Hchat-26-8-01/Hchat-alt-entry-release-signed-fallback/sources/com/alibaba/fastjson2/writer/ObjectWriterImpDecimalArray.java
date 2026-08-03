package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImpDecimalArray extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImpDecimalArray INSTANCE = null;
    static final byte[] JSONB_TYPE_NAME_BYTES = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImpDecimalArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImpDecimalArray
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImpDecimalArray.INSTANCE = r0
            java.lang.String r0 = "[BigDecimal"
            byte[] r0 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImpDecimalArray.JSONB_TYPE_NAME_BYTES = r0
            return
    }

    public ObjectWriterImpDecimalArray() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3, java.lang.Object r4, java.lang.reflect.Type r5, long r6) {
            r1 = this;
            if (r3 != 0) goto L1c
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r3 = r3.mask
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty
            long r5 = r5.mask
            long r3 = r3 | r5
            boolean r3 = r2.isEnabled(r3)
            if (r3 == 0) goto L18
            r2.startArray()
            r2.endArray()
            return
        L18:
            r2.writeNull()
            return
        L1c:
            java.math.BigDecimal[] r3 = (java.math.BigDecimal[]) r3
            r2.startArray()
            r4 = 0
        L22:
            int r5 = r3.length
            if (r4 >= r5) goto L35
            if (r4 == 0) goto L2a
            r2.writeComma()
        L2a:
            r5 = r3[r4]
            r6 = 0
            r0 = 0
            r2.writeDecimal(r5, r6, r0)
            int r4 = r4 + 1
            goto L22
        L35:
            r2.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3, java.lang.Object r4, java.lang.reflect.Type r5, long r6) {
            r1 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            boolean r4 = r2.isWriteTypeInfo(r3, r5)
            if (r4 == 0) goto L16
            byte[] r4 = com.alibaba.fastjson2.writer.ObjectWriterImpDecimalArray.JSONB_TYPE_NAME_BYTES
            r5 = -2138534155605614069(0xe25266841316620b, double:-4.238441007007491E165)
            r2.writeTypeName(r4, r5)
        L16:
            java.math.BigDecimal[] r3 = (java.math.BigDecimal[]) r3
            int r4 = r3.length
            r2.startArray(r4)
            r4 = 0
        L1d:
            int r5 = r3.length
            if (r4 >= r5) goto L2b
            r5 = r3[r4]
            r6 = 0
            r0 = 0
            r2.writeDecimal(r5, r6, r0)
            int r4 = r4 + 1
            goto L1d
        L2b:
            return
    }
}
