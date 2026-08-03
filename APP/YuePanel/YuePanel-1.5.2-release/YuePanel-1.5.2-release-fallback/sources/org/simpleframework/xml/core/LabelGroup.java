package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class LabelGroup {
    private final java.util.List<org.simpleframework.xml.core.Label> list;
    private final int size;

    public LabelGroup(java.util.List<org.simpleframework.xml.core.Label> r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.size()
            r1.size = r0
            r1.list = r2
            return
    }

    public LabelGroup(org.simpleframework.xml.core.Label r3) {
            r2 = this;
            r0 = 1
            org.simpleframework.xml.core.Label[] r0 = new org.simpleframework.xml.core.Label[r0]
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            r2.<init>(r3)
            return
    }

    public java.util.List<org.simpleframework.xml.core.Label> getList() {
            r1 = this;
            java.util.List<org.simpleframework.xml.core.Label> r0 = r1.list
            return r0
    }

    public org.simpleframework.xml.core.Label getPrimary() {
            r2 = this;
            int r0 = r2.size
            if (r0 <= 0) goto Le
            java.util.List<org.simpleframework.xml.core.Label> r0 = r2.list
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.simpleframework.xml.core.Label r0 = (org.simpleframework.xml.core.Label) r0
            return r0
        Le:
            r0 = 0
            return r0
    }
}
