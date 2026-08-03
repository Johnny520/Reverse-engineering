package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplDouble extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplDouble INSTANCE = null;
    private final java.text.DecimalFormat format;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplDouble r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplDouble
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplDouble.INSTANCE = r0
            return
    }

    public ObjectWriterImplDouble(java.text.DecimalFormat r1) {
            r0 = this;
            r0.<init>()
            r0.format = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r5, java.lang.Object r6, java.lang.Object r7, java.lang.reflect.Type r8, long r9) {
            r4 = this;
            if (r6 != 0) goto L6
            r5.writeNull()
            return
        L6:
            java.text.DecimalFormat r7 = r4.format
            if (r7 == 0) goto L12
            java.lang.String r6 = r7.format(r6)
            r5.writeRaw(r6)
            return
        L12:
            java.lang.Double r6 = (java.lang.Double) r6
            double r6 = r6.doubleValue()
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r0 = r0.mask
            long r0 = r0 & r9
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L27
            r5.writeString(r6)
            return
        L27:
            r5.writeDouble(r6)
            long r6 = r5.getFeatures()
            long r6 = r6 | r9
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r9 = r9.mask
            long r6 = r6 & r9
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L45
            java.lang.Class<java.lang.Double> r6 = java.lang.Double.class
            if (r8 == r6) goto L45
            java.lang.Class r6 = java.lang.Double.TYPE
            if (r8 == r6) goto L45
            r6 = 68
            r5.writeRaw(r6)
        L45:
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4, java.lang.Object r5, java.lang.reflect.Type r6, long r7) {
            r2 = this;
            if (r4 != 0) goto L6
            r3.writeNull()
            return
        L6:
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r0 = r6.mask
            long r6 = r7 & r0
            r0 = 0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L1c
            r3.writeString(r4)
            return
        L1c:
            r3.writeDouble(r4)
            return
    }
}
