package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriter8<T> extends com.alibaba.fastjson2.writer.ObjectWriterAdapter<T> {
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter0;
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter1;
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter2;
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter3;
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter4;
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter5;
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter6;
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter7;

    public ObjectWriter8(java.lang.Class<T> r1, java.lang.String r2, java.lang.String r3, long r4, java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r6)
            r1 = r0
            r2 = 0
            java.lang.Object r2 = r6.get(r2)
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            r1.fieldWriter0 = r2
            r2 = 1
            java.lang.Object r2 = r6.get(r2)
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            r1.fieldWriter1 = r2
            r2 = 2
            java.lang.Object r2 = r6.get(r2)
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            r1.fieldWriter2 = r2
            r2 = 3
            java.lang.Object r2 = r6.get(r2)
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            r1.fieldWriter3 = r2
            r2 = 4
            java.lang.Object r2 = r6.get(r2)
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            r1.fieldWriter4 = r2
            r2 = 5
            java.lang.Object r2 = r6.get(r2)
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            r1.fieldWriter5 = r2
            r2 = 6
            java.lang.Object r2 = r6.get(r2)
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            r1.fieldWriter6 = r2
            r2 = 7
            java.lang.Object r2 = r6.get(r2)
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            r1.fieldWriter7 = r2
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public final com.alibaba.fastjson2.writer.FieldWriter getFieldWriter(long r4) {
            r3 = this;
            com.alibaba.fastjson2.writer.FieldWriter r0 = r3.fieldWriter0
            long r1 = r0.hashCode
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L9
            return r0
        L9:
            com.alibaba.fastjson2.writer.FieldWriter r0 = r3.fieldWriter1
            long r1 = r0.hashCode
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L12
            return r0
        L12:
            com.alibaba.fastjson2.writer.FieldWriter r0 = r3.fieldWriter2
            long r1 = r0.hashCode
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L1b
            return r0
        L1b:
            com.alibaba.fastjson2.writer.FieldWriter r0 = r3.fieldWriter3
            long r1 = r0.hashCode
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L24
            return r0
        L24:
            com.alibaba.fastjson2.writer.FieldWriter r0 = r3.fieldWriter4
            long r1 = r0.hashCode
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L2d
            return r0
        L2d:
            com.alibaba.fastjson2.writer.FieldWriter r0 = r3.fieldWriter5
            long r1 = r0.hashCode
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L36
            return r0
        L36:
            com.alibaba.fastjson2.writer.FieldWriter r0 = r3.fieldWriter6
            long r1 = r0.hashCode
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L3f
            return r0
        L3f:
            com.alibaba.fastjson2.writer.FieldWriter r0 = r3.fieldWriter7
            long r1 = r0.hashCode
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L48
            return r0
        L48:
            r4 = 0
            return r4
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r13, java.lang.Object r14, java.lang.Object r15, java.lang.reflect.Type r16, long r17) {
            r12 = this;
            r0 = r17
            long r2 = r12.features
            long r2 = r2 | r0
            long r4 = r13.getFeatures()
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r4 = r4.mask
            long r4 = r4 & r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L17
            r4 = 1
            goto L18
        L17:
            r4 = 0
        L18:
            boolean r5 = r13.jsonb
            if (r5 == 0) goto L26
            if (r4 == 0) goto L22
            r12.writeArrayMappingJSONB(r13, r14, r15, r16, r17)
            return
        L22:
            r12.writeJSONB(r13, r14, r15, r16, r17)
            return
        L26:
            if (r4 == 0) goto L36
            long r2 = r12.features
            long r9 = r0 | r2
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r4.writeArrayMapping(r5, r6, r7, r8, r9)
            return
        L36:
            boolean r5 = r12.serializable
            if (r5 != 0) goto L54
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable
            long r8 = r5.mask
            long r8 = r8 & r2
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 == 0) goto L47
            r12.errorOnNoneSerializable()
            return
        L47:
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable
            long r8 = r5.mask
            long r2 = r2 & r8
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L54
            r13.writeNull()
            return
        L54:
            boolean r2 = r12.hasFilter(r13)
            if (r2 == 0) goto L66
            r5 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r0.writeWithFilter(r1, r2, r3, r4, r5)
            return
        L66:
            r13.startObject()
            long r8 = r12.features
            long r8 = r8 | r0
            com.alibaba.fastjson2.JSONWriter$Feature r15 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r10 = r15.mask
            long r8 = r8 & r10
            int r15 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r15 != 0) goto L7b
            boolean r15 = r13.isWriteTypeInfo(r14, r0)
            if (r15 == 0) goto L7e
        L7b:
            r12.writeTypeInfo(r13)
        L7e:
            com.alibaba.fastjson2.writer.FieldWriter r15 = r12.fieldWriter0
            r15.write(r13, r14)
            com.alibaba.fastjson2.writer.FieldWriter r15 = r12.fieldWriter1
            r15.write(r13, r14)
            com.alibaba.fastjson2.writer.FieldWriter r15 = r12.fieldWriter2
            r15.write(r13, r14)
            com.alibaba.fastjson2.writer.FieldWriter r15 = r12.fieldWriter3
            r15.write(r13, r14)
            com.alibaba.fastjson2.writer.FieldWriter r15 = r12.fieldWriter4
            r15.write(r13, r14)
            com.alibaba.fastjson2.writer.FieldWriter r15 = r12.fieldWriter5
            r15.write(r13, r14)
            com.alibaba.fastjson2.writer.FieldWriter r15 = r12.fieldWriter6
            r15.write(r13, r14)
            com.alibaba.fastjson2.writer.FieldWriter r15 = r12.fieldWriter7
            r15.write(r13, r14)
            r13.endObject()
            return
    }
}
