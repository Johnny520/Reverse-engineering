package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b41 {

    /* JADX INFO: renamed from: α */
    public final int f1465;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f1466;

    public b41(int r1, java.lang.Integer r2) {
            r0 = this;
            r0.<init>()
            r0.f1465 = r1
            r0.f1466 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.b41
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            b41 r5 = (p000.b41) r5
            int r1 = r4.f1465
            int r3 = r5.f1465
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Integer r4 = r4.f1466
            java.lang.Integer r5 = r5.f1466
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f1465
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            java.lang.Integer r1 = r1.f1466
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ObjectLocation(group="
            r0.<init>(r1)
            int r1 = r2.f1465
            r0.append(r1)
            java.lang.String r1 = ", dataOffset="
            r0.append(r1)
            java.lang.Integer r2 = r2.f1466
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
