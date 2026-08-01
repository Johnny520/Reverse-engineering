package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
            r0 = this;
            java.util.List<org.simpleframework.xml.core.Label> r0 = r0.list
            return r0
    }

    public org.simpleframework.xml.core.Label getPrimary() {
            r1 = this;
            int r0 = r1.size
            if (r0 <= 0) goto Le
            java.util.List<org.simpleframework.xml.core.Label> r1 = r1.list
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            org.simpleframework.xml.core.Label r1 = (org.simpleframework.xml.core.Label) r1
            return r1
        Le:
            r1 = 0
            return r1
    }
}
