package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MultiType implements java.lang.reflect.Type {
    private final java.lang.reflect.Type[] types;

    public MultiType(java.lang.reflect.Type... r1) {
            r0 = this;
            r0.<init>()
            r0.types = r1
            return
    }

    public java.lang.reflect.Type getType(int r2) {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.types
            r2 = r0[r2]
            return r2
    }

    public int size() {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.types
            int r0 = r0.length
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.types
            java.lang.String r0 = com.alibaba.fastjson2.JSON.toJSONString(r0)
            return r0
    }
}
