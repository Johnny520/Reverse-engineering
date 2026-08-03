package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterImplToString extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    public static final com.alibaba.fastjson2.writer.ObjectWriterImplToString DIRECT = null;
    public static final com.alibaba.fastjson2.writer.ObjectWriterImplToString INSTANCE = null;
    private final boolean direct;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterImplToString r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplToString
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplToString.INSTANCE = r0
            com.alibaba.fastjson2.writer.ObjectWriterImplToString r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplToString
            r1 = 1
            r0.<init>(r1)
            com.alibaba.fastjson2.writer.ObjectWriterImplToString.DIRECT = r0
            return
    }

    public ObjectWriterImplToString() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public ObjectWriterImplToString(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.direct = r1
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.lang.String r2 = r2.toString()
            boolean r3 = r0.direct
            if (r3 == 0) goto L12
            r1.writeRaw(r2)
            return
        L12:
            r1.writeString(r2)
            return
    }
}
