package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplOffsetTime extends com.alibaba.fastjson2.codec.DateTimeCodec implements com.alibaba.fastjson2.writer.ObjectWriter {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplOffsetTime INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetTime r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplOffsetTime
            r1 = 0
            r0.<init>(r1, r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetTime.INSTANCE = r0
            return
    }

    public ObjectWriterImplOffsetTime(java.lang.String r1, java.util.Locale r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r3 = r1.context
            java.time.OffsetTime r2 = (java.time.OffsetTime) r2
            java.time.format.DateTimeFormatter r4 = r0.getDateFormatter()
            if (r4 != 0) goto L14
            java.time.format.DateTimeFormatter r4 = r3.getDateFormatter()
        L14:
            if (r4 != 0) goto L1a
            r1.writeOffsetTime(r2)
            return
        L1a:
            java.lang.String r2 = r4.format(r2)
            r1.writeString(r2)
            return
    }
}
