package p000;

/* JADX INFO: renamed from: p9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0679p9 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f8457;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f8458;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f8459;

    /* JADX INFO: renamed from: δ */
    public final long f8460;

    public C0679p9(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f8457 = r1
            r0.f8458 = r2
            r0.f8459 = r3
            r0.f8460 = r4
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p000.C0679p9
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p9 r6 = (p000.C0679p9) r6
            java.lang.String r1 = r5.f8457
            java.lang.String r3 = r6.f8457
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.f8458
            java.lang.String r3 = r6.f8458
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.f8459
            java.lang.String r3 = r6.f8459
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            long r3 = r5.f8460
            long r5 = r6.f8460
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L36
            return r2
        L36:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f8457
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f8458
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f8459
            int r0 = p000.a12.m15(r0, r1, r2)
            long r1 = r3.f8460
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", notice="
            java.lang.String r1 = ", hash="
            java.lang.String r2 = "NoticeEntry(date="
            java.lang.String r3 = r5.f8457
            java.lang.String r4 = r5.f8458
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f8459
            r0.append(r1)
            java.lang.String r1 = ", recordTime="
            r0.append(r1)
            long r1 = r5.f8460
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
