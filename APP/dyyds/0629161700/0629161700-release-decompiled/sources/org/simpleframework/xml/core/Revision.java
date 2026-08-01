package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Revision {
    private boolean equal;

    public Revision() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.equal = r0
            return
    }

    public boolean compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            if (r4 == 0) goto L9
            boolean r3 = r4.equals(r3)
            r2.equal = r3
            goto L17
        L9:
            if (r3 == 0) goto L17
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            boolean r3 = r3.equals(r4)
            r2.equal = r3
        L17:
            boolean r2 = r2.equal
            return r2
    }

    public double getDefault() {
            r2 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r0
    }

    public boolean isEqual() {
            r0 = this;
            boolean r0 = r0.equal
            return r0
    }
}
