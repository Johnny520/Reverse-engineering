package p000;

/* JADX INFO: renamed from: f4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0272f4 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f3745;

    /* JADX INFO: renamed from: β */
    public final int f3746;

    /* JADX INFO: renamed from: γ */
    public final int f3747;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f3748;

    public C0272f4(int r2, int r3, java.lang.Object r4) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r4, r2, r3, r0)
            return
    }

    public C0272f4(java.lang.Object r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f3745 = r1
            r0.f3746 = r2
            r0.f3747 = r3
            r0.f3748 = r4
            if (r2 > r3) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L17
            java.lang.String r0 = "Reversed range is not supported"
            p000.bm0.m982(r0)
        L17:
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0272f4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            f4 r5 = (p000.C0272f4) r5
            java.lang.Object r1 = r4.f3745
            java.lang.Object r3 = r5.f3745
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f3746
            int r3 = r5.f3746
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.f3747
            int r3 = r5.f3747
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r4 = r4.f3748
            java.lang.String r5 = r5.f3748
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f3745
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f3746
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f3747
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f3748
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Range(item="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f3745
            r0.append(r1)
            java.lang.String r1 = ", start="
            r0.append(r1)
            int r1 = r2.f3746
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r2.f3747
            r0.append(r1)
            java.lang.String r1 = ", tag="
            r0.append(r1)
            java.lang.String r2 = r2.f3748
            r1 = 41
            java.lang.String r2 = p000.AbstractC0602nx.m4132(r0, r2, r1)
            return r2
    }
}
