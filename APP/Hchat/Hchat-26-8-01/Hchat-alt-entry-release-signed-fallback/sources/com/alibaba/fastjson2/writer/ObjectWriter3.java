package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriter3<T> extends com.alibaba.fastjson2.writer.ObjectWriterAdapter<T> {
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter0;
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter1;
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter2;

    public ObjectWriter3(java.lang.Class<T> r1, java.lang.String r2, java.lang.String r3, long r4, java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r6) {
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
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L1b
            return r0
        L1b:
            r4 = 0
            return r4
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r13, java.lang.Object r14, java.lang.Object r15, java.lang.reflect.Type r16, long r17) {
            r12 = this;
            r2 = r17
            long r4 = r12.features
            long r4 = r4 | r2
            long r6 = r13.getFeatures()
            long r4 = r4 | r6
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r6 = r6.mask
            long r6 = r6 & r4
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            boolean r7 = r13.jsonb
            if (r7 == 0) goto L26
            if (r6 == 0) goto L22
            r12.writeArrayMappingJSONB(r13, r14, r15, r16, r17)
            return
        L22:
            r12.writeJSONB(r13, r14, r15, r16, r17)
            return
        L26:
            if (r6 == 0) goto L2c
            r12.writeArrayMapping(r13, r14, r15, r16, r17)
            return
        L2c:
            boolean r6 = r12.serializable
            if (r6 != 0) goto L4a
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable
            long r6 = r6.mask
            long r6 = r6 & r4
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L3d
            r12.errorOnNoneSerializable()
            return
        L3d:
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable
            long r6 = r6.mask
            long r4 = r4 & r6
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L4a
            r13.writeNull()
            return
        L4a:
            boolean r4 = r12.hasFilter(r13)
            if (r4 == 0) goto L5c
            r5 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r0.writeWithFilter(r1, r2, r3, r4, r5)
            return
        L5c:
            r13.startObject()
            long r5 = r12.features
            long r5 = r5 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r10 = r7.mask
            long r5 = r5 & r10
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L71
            boolean r2 = r13.isWriteTypeInfo(r14, r2)
            if (r2 == 0) goto L74
        L71:
            r12.writeTypeInfo(r13)
        L74:
            com.alibaba.fastjson2.writer.FieldWriter r2 = r12.fieldWriter0
            r2.write(r13, r14)
            com.alibaba.fastjson2.writer.FieldWriter r2 = r12.fieldWriter1
            r2.write(r13, r14)
            com.alibaba.fastjson2.writer.FieldWriter r2 = r12.fieldWriter2
            r2.write(r13, r14)
            r13.endObject()
            return
    }
}
