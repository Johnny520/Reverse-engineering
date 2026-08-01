package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ql0 {

    /* JADX INFO: renamed from: α */
    public final int f9045;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f9046;

    public ql0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f9045 = r1
            r0.f9046 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.ql0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ql0 r5 = (p000.ql0) r5
            int r1 = r4.f9045
            int r3 = r5.f9045
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Object r4 = r4.f9046
            java.lang.Object r5 = r5.f9046
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f9045
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            java.lang.Object r1 = r1.f9046
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
            java.lang.String r1 = "IndexedValue(index="
            r0.<init>(r1)
            int r1 = r2.f9045
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.Object r2 = r2.f9046
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
