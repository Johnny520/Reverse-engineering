package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriter2<T> extends com.alibaba.fastjson2.writer.ObjectWriterAdapter<T> {
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter0;
    public final com.alibaba.fastjson2.writer.FieldWriter fieldWriter1;

    public ObjectWriter2(java.lang.Class<T> r1, java.lang.String r2, java.lang.String r3, long r4, java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r6) {
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
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L12
            return r0
        L12:
            r4 = 0
            return r4
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r9, java.lang.Object r10, java.lang.Object r11, java.lang.reflect.Type r12, long r13) {
            r8 = this;
            long r0 = r8.features
            long r0 = r0 | r13
            long r2 = r9.getFeatures()
            long r0 = r0 | r2
            boolean r2 = r9.jsonb
            r3 = 0
            if (r2 == 0) goto L1f
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r5 = r2.mask
            long r0 = r0 & r5
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L1b
            r8.writeArrayMappingJSONB(r9, r10, r11, r12, r13)
            return
        L1b:
            r8.writeJSONB(r9, r10, r11, r12, r13)
            return
        L1f:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r5 = r2.mask
            long r5 = r5 & r0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L2d
            r8.writeArrayMapping(r9, r10, r11, r12, r13)
            r9 = r8
            return
        L2d:
            r2 = r9
            r9 = r8
            boolean r5 = r9.serializable
            if (r5 != 0) goto L4d
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable
            long r5 = r5.mask
            long r5 = r5 & r0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L40
            r8.errorOnNoneSerializable()
            return
        L40:
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable
            long r5 = r5.mask
            long r0 = r0 & r5
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L4d
            r2.writeNull()
            return
        L4d:
            boolean r0 = r8.hasFilter(r2)
            if (r0 == 0) goto L5d
            r6 = 0
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.writeWithFilter(r2, r3, r4, r5, r6)
            return
        L5d:
            r2.startObject()
            long r11 = r9.features
            long r11 = r11 | r13
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r0 = r0.mask
            long r11 = r11 & r0
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 != 0) goto L72
            boolean r11 = r2.isWriteTypeInfo(r10, r13)
            if (r11 == 0) goto L75
        L72:
            r8.writeTypeInfo(r2)
        L75:
            com.alibaba.fastjson2.writer.FieldWriter r11 = r9.fieldWriter0
            r11.write(r2, r10)
            com.alibaba.fastjson2.writer.FieldWriter r11 = r9.fieldWriter1
            r11.write(r2, r10)
            r2.endObject()
            return
    }
}
