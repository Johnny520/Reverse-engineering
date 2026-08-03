package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterArrayFinal extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    public static final com.alibaba.fastjson2.writer.ObjectWriterArrayFinal DECIMAL_ARRAY = null;
    public static final com.alibaba.fastjson2.writer.ObjectWriterArrayFinal DOUBLE_ARRAY = null;
    public static final com.alibaba.fastjson2.writer.ObjectWriterArrayFinal FLOAT_ARRAY = null;
    public final java.text.DecimalFormat format;
    final java.lang.Class itemClass;
    volatile com.alibaba.fastjson2.writer.ObjectWriter itemObjectWriter;
    public boolean refDetect;
    final byte[] typeNameBytes;
    final long typeNameHash;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r0 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            r2 = 0
            r0.<init>(r1, r2)
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.FLOAT_ARRAY = r0
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r0 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            r0.<init>(r1, r2)
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.DOUBLE_ARRAY = r0
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r0 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            r0.<init>(r1, r2)
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.DECIMAL_ARRAY = r0
            return
    }

    public ObjectWriterArrayFinal(java.lang.Class r3, java.text.DecimalFormat r4) {
            r2 = this;
            r2.<init>()
            r2.itemClass = r3
            r2.format = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "["
            r4.<init>(r0)
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r3)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            byte[] r0 = com.alibaba.fastjson2.JSONB.toBytes(r4)
            r2.typeNameBytes = r0
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r4)
            r2.typeNameHash = r0
            boolean r3 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r3)
            r3 = r3 ^ 1
            r2.refDetect = r3
            return
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getItemObjectWriter(com.alibaba.fastjson2.JSONWriter r3) {
            r2 = this;
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r2.itemObjectWriter
            if (r0 != 0) goto L47
            java.lang.Class r0 = r2.itemClass
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 != r1) goto L19
            java.text.DecimalFormat r3 = r2.format
            if (r3 == 0) goto L16
            com.alibaba.fastjson2.writer.ObjectWriterImplFloat r3 = new com.alibaba.fastjson2.writer.ObjectWriterImplFloat
            java.text.DecimalFormat r0 = r2.format
            r3.<init>(r0)
            goto L44
        L16:
            com.alibaba.fastjson2.writer.ObjectWriterImplFloat r3 = com.alibaba.fastjson2.writer.ObjectWriterImplFloat.INSTANCE
            goto L44
        L19:
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 != r1) goto L2c
            java.text.DecimalFormat r3 = r2.format
            if (r3 == 0) goto L29
            com.alibaba.fastjson2.writer.ObjectWriterImplDouble r3 = new com.alibaba.fastjson2.writer.ObjectWriterImplDouble
            java.text.DecimalFormat r0 = r2.format
            r3.<init>(r0)
            goto L44
        L29:
            com.alibaba.fastjson2.writer.ObjectWriterImplDouble r3 = com.alibaba.fastjson2.writer.ObjectWriterImplDouble.INSTANCE
            goto L44
        L2c:
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r0 != r1) goto L40
            java.text.DecimalFormat r3 = r2.format
            if (r3 == 0) goto L3d
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r3 = new com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal
            java.text.DecimalFormat r0 = r2.format
            r1 = 0
            r3.<init>(r0, r1)
            goto L44
        L3d:
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r3 = com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal.INSTANCE
            goto L44
        L40:
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r3.getObjectWriter(r0)
        L44:
            r2.itemObjectWriter = r3
            return r3
        L47:
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9, java.lang.Object r10, java.lang.reflect.Type r11, long r12) {
            r7 = this;
            boolean r0 = r8.jsonb
            if (r0 == 0) goto L9
            r7.writeJSONB(r8, r9, r10, r11, r12)
            r8 = r7
            return
        L9:
            r1 = r8
            r8 = r7
            if (r9 != 0) goto L11
            r1.writeArrayNull()
            return
        L11:
            boolean r10 = r1.isRefDetect()
            if (r10 == 0) goto L19
            boolean r10 = r8.refDetect
        L19:
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            r1.startArray()
            r11 = 0
        L1f:
            int r0 = r9.length
            if (r11 >= r0) goto L54
            if (r11 == 0) goto L27
            r1.writeComma()
        L27:
            r2 = r9[r11]
            if (r2 != 0) goto L2f
            r1.writeNull()
            goto L51
        L2f:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r7.getItemObjectWriter(r1)
            if (r10 == 0) goto L42
            java.lang.String r3 = r1.setPath(r11, r2)
            if (r3 == 0) goto L42
            r1.writeReference(r3)
            r1.popPath(r2)
            goto L51
        L42:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Class r4 = r8.itemClass
            r5 = r12
            r0.write(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L51
            r1.popPath(r2)
        L51:
            int r11 = r11 + 1
            goto L1f
        L54:
            r1.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r9, java.lang.Object r10, java.lang.Object r11, java.lang.reflect.Type r12, long r13) {
            r8 = this;
            if (r10 != 0) goto L6
            r9.writeArrayNull()
            return
        L6:
            boolean r11 = r9.isRefDetect()
            if (r11 == 0) goto Le
            boolean r11 = r8.refDetect
        Le:
            r0 = r10
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r10 = r9.isWriteTypeInfo(r10, r12)
            if (r10 == 0) goto L1e
            byte[] r10 = r8.typeNameBytes
            long r1 = r8.typeNameHash
            r9.writeTypeName(r10, r1)
        L1e:
            int r10 = r0.length
            r9.startArray(r10)
            r10 = 0
        L23:
            int r12 = r0.length
            if (r10 >= r12) goto L58
            r3 = r0[r10]
            if (r3 != 0) goto L30
            r9.writeNull()
        L2d:
            r2 = r9
            r6 = r13
            goto L53
        L30:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r8.getItemObjectWriter(r9)
            if (r11 == 0) goto L43
            java.lang.String r12 = r9.setPath(r10, r3)
            if (r12 == 0) goto L43
            r9.writeReference(r12)
            r9.popPath(r3)
            goto L2d
        L43:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.Class r5 = r8.itemClass
            r2 = r9
            r6 = r13
            r1.writeJSONB(r2, r3, r4, r5, r6)
            if (r11 == 0) goto L53
            r2.popPath(r3)
        L53:
            int r10 = r10 + 1
            r9 = r2
            r13 = r6
            goto L23
        L58:
            return
    }
}
