package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterArray extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterArray INSTANCE = null;
    volatile com.alibaba.fastjson2.writer.ObjectWriter itemObjectWriter;
    final java.lang.reflect.Type itemType;
    final byte[] typeNameBytes;
    final long typeNameHash;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterArray
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterArray.INSTANCE = r0
            return
    }

    public ObjectWriterArray(java.lang.reflect.Type r3) {
            r2 = this;
            r2.<init>()
            r2.itemType = r3
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r3 != r0) goto L1a
            java.lang.String r3 = "[O"
            byte[] r3 = com.alibaba.fastjson2.JSONB.toBytes(r3)
            r2.typeNameBytes = r3
            java.lang.String r3 = "[0"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r3)
            r2.typeNameHash = r0
            return
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.String r3 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            byte[] r0 = com.alibaba.fastjson2.JSONB.toBytes(r3)
            r2.typeNameBytes = r0
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r3)
            r2.typeNameHash = r0
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r9, java.lang.Object r10, java.lang.Object r11, java.lang.reflect.Type r12, long r13) {
            r8 = this;
            boolean r0 = r9.jsonb
            if (r0 == 0) goto L9
            r8.writeJSONB(r9, r10, r11, r12, r13)
            r9 = r8
            return
        L9:
            r1 = r9
            r9 = r8
            if (r10 != 0) goto L11
            r1.writeArrayNull()
            return
        L11:
            boolean r11 = r1.isRefDetect()
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            r1.startArray()
            r12 = 0
            r0 = 0
            r7 = r0
            r0 = r12
        L1e:
            int r2 = r10.length
            if (r7 >= r2) goto L67
            if (r7 == 0) goto L26
            r1.writeComma()
        L26:
            r2 = r10[r7]
            if (r2 != 0) goto L2e
            r1.writeNull()
            goto L64
        L2e:
            java.lang.Class r3 = r2.getClass()
            if (r3 != r12) goto L35
            goto L46
        L35:
            boolean r11 = r1.isRefDetect()
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r1.getObjectWriter(r3)
            if (r11 == 0) goto L45
            boolean r11 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r3)
            r11 = r11 ^ 1
        L45:
            r12 = r3
        L46:
            if (r11 == 0) goto L55
            java.lang.String r3 = r1.setPath(r7, r2)
            if (r3 == 0) goto L55
            r1.writeReference(r3)
            r1.popPath(r2)
            goto L64
        L55:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.reflect.Type r4 = r9.itemType
            r5 = r13
            r0.write(r1, r2, r3, r4, r5)
            if (r11 == 0) goto L64
            r1.popPath(r2)
        L64:
            int r7 = r7 + 1
            goto L1e
        L67:
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
            r13 = r10
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            boolean r10 = r9.isWriteTypeInfo(r10, r12)
            if (r10 == 0) goto L1a
            byte[] r10 = r8.typeNameBytes
            long r0 = r8.typeNameHash
            r9.writeTypeName(r10, r0)
        L1a:
            int r10 = r13.length
            r9.startArray(r10)
            r10 = 0
            r12 = 0
            r14 = r12
            r12 = r11
            r11 = r10
        L23:
            int r0 = r13.length
            if (r14 >= r0) goto L6f
            r3 = r13[r14]
            if (r3 != 0) goto L2f
            r9.writeNull()
            r2 = r9
            goto L6b
        L2f:
            java.lang.Class r0 = r3.getClass()
            if (r0 != r10) goto L37
            r1 = r11
            goto L49
        L37:
            boolean r12 = r9.isRefDetect()
            com.alibaba.fastjson2.writer.ObjectWriter r11 = r9.getObjectWriter(r0)
            if (r12 == 0) goto L47
            boolean r10 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r0)
            r12 = r10 ^ 1
        L47:
            r1 = r11
            r10 = r0
        L49:
            if (r12 == 0) goto L59
            java.lang.String r11 = r9.setPath(r14, r3)
            if (r11 == 0) goto L59
            r9.writeReference(r11)
            r9.popPath(r3)
            r2 = r9
            goto L6a
        L59:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.reflect.Type r5 = r8.itemType
            r6 = 0
            r2 = r9
            r1.writeJSONB(r2, r3, r4, r5, r6)
            if (r12 == 0) goto L6a
            r2.popPath(r3)
        L6a:
            r11 = r1
        L6b:
            int r14 = r14 + 1
            r9 = r2
            goto L23
        L6f:
            return
    }
}
