package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplLocale extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplLocale INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplLocale r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplLocale
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterImplLocale.INSTANCE = r0
            return
    }

    public ObjectWriterImplLocale() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.util.Locale r2 = (java.util.Locale) r2
            java.lang.String r2 = r2.toString()
            r1.writeString(r2)
            return
    }
}
