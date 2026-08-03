package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BeforeFilter implements com.alibaba.fastjson2.filter.Filter {
    private static final java.lang.ThreadLocal<com.alibaba.fastjson2.JSONWriter> serializerLocal = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.alibaba.fastjson2.filter.BeforeFilter.serializerLocal = r0
            return
    }

    public BeforeFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    public void writeBefore(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4) {
            r2 = this;
            java.lang.ThreadLocal<com.alibaba.fastjson2.JSONWriter> r0 = com.alibaba.fastjson2.filter.BeforeFilter.serializerLocal
            java.lang.Object r1 = r0.get()
            com.alibaba.fastjson2.JSONWriter r1 = (com.alibaba.fastjson2.JSONWriter) r1
            r0.set(r3)
            r2.writeBefore(r4)
            r0.set(r1)
            return
    }

    public abstract void writeBefore(java.lang.Object r1);

    public final void writeKeyValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.lang.ThreadLocal<com.alibaba.fastjson2.JSONWriter> r0 = com.alibaba.fastjson2.filter.BeforeFilter.serializerLocal
            java.lang.Object r0 = r0.get()
            com.alibaba.fastjson2.JSONWriter r0 = (com.alibaba.fastjson2.JSONWriter) r0
            boolean r1 = r0.containsReference(r4)
            r0.writeName(r3)
            r0.writeColon()
            r0.writeAny(r4)
            if (r1 != 0) goto L1a
            r0.removeReference(r4)
        L1a:
            return
    }
}
