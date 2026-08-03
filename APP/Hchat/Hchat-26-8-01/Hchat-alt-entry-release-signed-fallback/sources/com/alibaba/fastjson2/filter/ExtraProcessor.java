package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ExtraProcessor extends com.alibaba.fastjson2.filter.Filter {
    default java.lang.reflect.Type getType(java.lang.String r1) {
            r0 = this;
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            return r1
    }

    void processExtra(java.lang.Object r1, java.lang.String r2, java.lang.Object r3);
}
