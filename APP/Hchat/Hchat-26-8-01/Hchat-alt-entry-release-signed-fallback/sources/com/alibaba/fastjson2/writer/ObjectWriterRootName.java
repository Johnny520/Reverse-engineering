package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectWriterRootName<T> extends com.alibaba.fastjson2.writer.ObjectWriterAdapter<T> {
    final java.lang.String rootName;

    public ObjectWriterRootName(java.lang.Class<T> r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, long r12, java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r14) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r6)
            r0.rootName = r11
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter
    public com.alibaba.fastjson2.JSONObject toJSONObject(T r2, long r3) {
            r1 = this;
            java.lang.String r0 = r1.rootName
            com.alibaba.fastjson2.JSONObject r2 = super.toJSONObject(r2, r3)
            com.alibaba.fastjson2.JSONObject r2 = com.alibaba.fastjson2.JSONObject.of(r0, r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3, java.lang.Object r4, java.lang.reflect.Type r5, long r6) {
            r1 = this;
            r2.startObject()
            java.lang.String r0 = r1.rootName
            r2.writeName(r0)
            r2.writeColon()
            super.write(r2, r3, r4, r5, r6)
            r2.endObject()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterAdapter, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3, java.lang.Object r4, java.lang.reflect.Type r5, long r6) {
            r1 = this;
            r2.startObject()
            java.lang.String r0 = r1.rootName
            r2.writeName(r0)
            super.writeJSONB(r2, r3, r4, r5, r6)
            r2.endObject()
            return
    }
}
