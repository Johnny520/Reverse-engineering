package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterException extends com.alibaba.fastjson2.writer.ObjectWriterAdapter<java.lang.Exception> {
    public ObjectWriterException(java.lang.Class r8, long r9, java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r11) {
            r7 = this;
            r2 = 0
            r3 = 0
            r0 = r7
            r1 = r8
            r4 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r5, java.lang.Object r6, java.lang.Object r7, java.lang.reflect.Type r8, long r9) {
            r4 = this;
            boolean r0 = r5.jsonb
            if (r0 == 0) goto L9
            r4.writeJSONB(r5, r6, r7, r8, r9)
            r5 = r4
            return
        L9:
            r7 = r6
            r6 = r5
            r5 = r4
            boolean r8 = r4.hasFilter(r6)
            if (r8 == 0) goto L16
            r4.writeWithFilter(r6, r7)
            return
        L16:
            r6.startObject()
            long r8 = r6.getFeatures(r9)
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r0 = r10.mask
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.WriteThrowableClassName
            long r2 = r10.mask
            long r0 = r0 | r2
            long r8 = r8 & r0
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 == 0) goto L30
            r4.writeTypeInfo(r6)
        L30:
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r8 = r5.fieldWriters
            int r8 = r8.size()
            r9 = 0
        L37:
            if (r9 >= r8) goto L47
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r10 = r5.fieldWriters
            java.lang.Object r10 = r10.get(r9)
            com.alibaba.fastjson2.writer.FieldWriter r10 = (com.alibaba.fastjson2.writer.FieldWriter) r10
            r10.write(r6, r7)
            int r9 = r9 + 1
            goto L37
        L47:
            r6.endObject()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            r0.writeClassInfo(r1)
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r3 = r0.fieldWriters
            int r3 = r3.size()
            r1.startObject()
            r4 = 0
        Ld:
            if (r4 >= r3) goto L1d
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r5 = r0.fieldWriters
            java.lang.Object r5 = r5.get(r4)
            com.alibaba.fastjson2.writer.FieldWriter r5 = (com.alibaba.fastjson2.writer.FieldWriter) r5
            r5.write(r1, r2)
            int r4 = r4 + 1
            goto Ld
        L1d:
            r1.endObject()
            return
    }
}
