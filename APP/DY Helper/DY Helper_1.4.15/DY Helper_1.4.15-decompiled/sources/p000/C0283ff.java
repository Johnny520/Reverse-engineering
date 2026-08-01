package p000;

/* JADX INFO: renamed from: ff */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0283ff {

    /* JADX INFO: renamed from: α */
    public final int f3915;

    /* JADX INFO: renamed from: β */
    public final long f3916;

    /* JADX INFO: renamed from: γ */
    public final long f3917;

    /* JADX INFO: renamed from: δ */
    public final boolean f3918;

    public C0283ff(int r1, long r2, long r4, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f3915 = r1
            r0.f3916 = r2
            r0.f3917 = r4
            r0.f3918 = r6
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.C0283ff
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ff r8 = (p000.C0283ff) r8
            int r1 = r7.f3915
            int r3 = r8.f3915
            if (r1 == r3) goto L13
            return r2
        L13:
            long r3 = r7.f3916
            long r5 = r8.f3916
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1c
            return r2
        L1c:
            long r3 = r7.f3917
            long r5 = r8.f3917
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L25
            return r2
        L25:
            boolean r7 = r7.f3918
            boolean r8 = r8.f3918
            if (r7 == r8) goto L2c
            return r2
        L2c:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f3915
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f3916
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.f3917
            int r0 = p000.lz1.m3677(r0, r1, r2)
            boolean r4 = r4.f3918
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChapterSegment(index="
            r0.<init>(r1)
            int r1 = r5.f3915
            r0.append(r1)
            java.lang.String r1 = ", startMs="
            r0.append(r1)
            long r1 = r5.f3916
            r0.append(r1)
            java.lang.String r1 = ", endMs="
            java.lang.String r2 = ", isAd="
            long r3 = r5.f3917
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            java.lang.String r1 = ")"
            boolean r5 = r5.f3918
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }
}
