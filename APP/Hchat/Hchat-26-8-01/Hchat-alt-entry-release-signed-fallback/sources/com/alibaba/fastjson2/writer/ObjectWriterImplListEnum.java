package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplListEnum extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    final java.lang.Class defineClass;
    final java.lang.Class enumType;
    final long features;
    byte[] typeNameJSONB;

    public ObjectWriterImplListEnum(java.lang.Class r1, java.lang.Class r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.defineClass = r1
            r0.enumType = r2
            r0.features = r3
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.List r2 = com.alibaba.fastjson2.util.TypeUtils.toList(r2)
            r1.startArray()
            r3 = 0
        Le:
            int r4 = r2.size()
            if (r3 >= r4) goto L2b
            if (r3 == 0) goto L19
            r1.writeComma()
        L19:
            java.lang.Object r4 = r2.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L25
            r1.writeNull()
            goto L28
        L25:
            r1.writeString(r4)
        L28:
            int r3 = r3 + 1
            goto Le
        L2b:
            r1.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r10, java.lang.Object r11, java.lang.Object r12, java.lang.reflect.Type r13, long r14) {
            r9 = this;
            if (r11 != 0) goto L6
            r10.writeNull()
            return
        L6:
            java.lang.Class r12 = r11.getClass()
            boolean r13 = r10.isWriteTypeInfo(r11)
            if (r13 == 0) goto L1b
            java.lang.Class r13 = r9.defineClass
            if (r13 == r12) goto L1b
            java.lang.String r12 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r12)
            r10.writeTypeName(r12)
        L1b:
            java.util.List r11 = com.alibaba.fastjson2.util.TypeUtils.toList(r11)
            int r12 = r11.size()
            r10.startArray(r12)
            com.alibaba.fastjson2.JSONWriter$Feature r13 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString
            boolean r13 = r10.isEnabled(r13)
            r0 = 0
        L2d:
            if (r0 >= r12) goto L67
            java.lang.Object r1 = r11.get(r0)
            r4 = r1
            java.lang.Enum r4 = (java.lang.Enum) r4
            if (r4 != 0) goto L3d
            r10.writeNull()
            r3 = r10
            goto L63
        L3d:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r2 = r9.enumType
            if (r1 == r2) goto L54
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r10.getObjectWriter(r1)
            java.lang.Class r6 = r9.enumType
            long r7 = r9.features
            long r7 = r7 | r14
            r5 = 0
            r3 = r10
            r2.writeJSONB(r3, r4, r5, r6, r7)
            goto L63
        L54:
            r3 = r10
            if (r13 == 0) goto L5c
            java.lang.String r10 = r4.toString()
            goto L60
        L5c:
            java.lang.String r10 = r4.name()
        L60:
            r3.writeString(r10)
        L63:
            int r0 = r0 + 1
            r10 = r3
            goto L2d
        L67:
            r3 = r10
            r3.endArray()
            return
    }
}
