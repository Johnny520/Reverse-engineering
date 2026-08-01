package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class uj0 {

    /* JADX INFO: renamed from: α */
    public final int f10855;

    /* JADX INFO: renamed from: β */
    public final int f10856;

    /* JADX INFO: renamed from: γ */
    public final int f10857;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f10858;

    public /* synthetic */ uj0(int r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public uj0(int r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f10855 = r1
            r0.f10856 = r2
            r0.f10857 = r3
            r0.f10858 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.uj0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            uj0 r5 = (p000.uj0) r5
            int r1 = r4.f10855
            int r3 = r5.f10855
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f10856
            int r3 = r5.f10856
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.f10857
            int r3 = r5.f10857
            if (r1 == r3) goto L21
            return r2
        L21:
            java.lang.String r4 = r4.f10858
            java.lang.String r5 = r5.f10858
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L2c
            return r2
        L2c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f10855
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f10856
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f10857
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f10858
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", succeeded="
            java.lang.String r1 = ", failed="
            java.lang.String r2 = "Result(total="
            int r3 = r5.f10855
            int r4 = r5.f10856
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            int r1 = r5.f10857
            r0.append(r1)
            java.lang.String r1 = ", fatalMessage="
            r0.append(r1)
            java.lang.String r5 = r5.f10858
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
