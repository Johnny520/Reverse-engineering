package p000;

/* JADX INFO: renamed from: ej */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0250ej {

    /* JADX INFO: renamed from: α */
    public final int f3567;

    /* JADX INFO: renamed from: β */
    public final int f3568;

    /* JADX INFO: renamed from: γ */
    public final int f3569;

    public C0250ej(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f3567 = r1
            r0.f3568 = r2
            r0.f3569 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0250ej
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ej r5 = (p000.C0250ej) r5
            int r1 = r4.f3567
            int r3 = r5.f3567
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f3568
            int r3 = r5.f3568
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r4 = r4.f3569
            int r5 = r5.f3569
            if (r4 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f3567
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f3568
            int r0 = p000.a12.m14(r2, r0, r1)
            int r3 = r3.f3569
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", channelCount="
            java.lang.String r1 = ", encoding="
            java.lang.String r2 = "TrackInfo(sampleRate="
            int r3 = r5.f3567
            int r4 = r5.f3568
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            int r5 = r5.f3569
            java.lang.String r5 = p000.AbstractC0602nx.m4131(r0, r5, r1)
            return r5
    }
}
