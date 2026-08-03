package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
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
            boolean r3 = r2.equal
            return r3
    }

    public double getDefault() {
            r2 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r0
    }

    public boolean isEqual() {
            r1 = this;
            boolean r0 = r1.equal
            return r0
    }
}
