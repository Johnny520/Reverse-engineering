package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterBigInteger implements com.alibaba.fastjson2.writer.ObjectWriter {
    static final com.alibaba.fastjson2.writer.ObjectWriterBigInteger INSTANCE = null;
    final long features;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterBigInteger r0 = new com.alibaba.fastjson2.writer.ObjectWriterBigInteger
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterBigInteger.INSTANCE = r0
            return
    }

    public ObjectWriterBigInteger(long r1) {
            r0 = this;
            r0.<init>()
            r0.features = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNumberNull()
            return
        L6:
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            r1.writeBigInt(r2, r5)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNumberNull()
            return
        L6:
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            r1.writeBigInt(r2, r5)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNumberNull()
            return
        L6:
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            r1.writeBigInt(r2, r5)
            return
    }
}
