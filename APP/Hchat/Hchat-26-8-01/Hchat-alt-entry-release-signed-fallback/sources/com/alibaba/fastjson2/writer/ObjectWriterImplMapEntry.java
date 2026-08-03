package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplMapEntry extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplMapEntry INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplMapEntry r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplMapEntry
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplMapEntry.INSTANCE = r0
            return
    }

    public ObjectWriterImplMapEntry() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r5, java.lang.Object r6, java.lang.Object r7, java.lang.reflect.Type r8, long r9) {
            r4 = this;
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            if (r6 != 0) goto L8
            r5.writeNull()
            return
        L8:
            r5.startObject()
            com.alibaba.fastjson2.JSONWriter$Context r7 = r5.context
            long r7 = r7.getFeatures()
            java.lang.Object r9 = r6.getKey()
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringKeyAsString
            long r0 = r10.mask
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r2 = r10.mask
            long r0 = r0 | r2
            long r7 = r7 & r0
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 == 0) goto L2d
            java.lang.String r7 = r9.toString()
            r5.writeAny(r7)
            goto L30
        L2d:
            r5.writeAny(r9)
        L30:
            r5.writeColon()
            java.lang.Object r6 = r6.getValue()
            r5.writeAny(r6)
            r5.endObject()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r5, java.lang.Object r6, java.lang.Object r7, java.lang.reflect.Type r8, long r9) {
            r4 = this;
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            if (r6 != 0) goto L8
            r5.writeNull()
            return
        L8:
            r7 = 2
            r5.startArray(r7)
            com.alibaba.fastjson2.JSONWriter$Context r7 = r5.context
            long r7 = r7.getFeatures()
            java.lang.Object r9 = r6.getKey()
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringKeyAsString
            long r0 = r10.mask
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r2 = r10.mask
            long r0 = r0 | r2
            long r7 = r7 & r0
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 == 0) goto L2e
            java.lang.String r7 = r9.toString()
            r5.writeAny(r7)
            goto L31
        L2e:
            r5.writeAny(r9)
        L31:
            java.lang.Object r6 = r6.getValue()
            r5.writeAny(r6)
            return
    }
}
