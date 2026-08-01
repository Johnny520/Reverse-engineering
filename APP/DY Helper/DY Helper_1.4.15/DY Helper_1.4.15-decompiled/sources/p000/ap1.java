package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ap1 {

    /* JADX INFO: renamed from: α */
    public final p000.bp1 f1270;

    /* JADX INFO: renamed from: β */
    public final p000.bp1 f1271;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Throwable f1272;

    public /* synthetic */ ap1(p000.bp1 r2, java.lang.Throwable r3, int r4) {
            r1 = this;
            r4 = r4 & 4
            r0 = 0
            if (r4 == 0) goto L6
            r3 = r0
        L6:
            r1.<init>(r2, r0, r3)
            return
    }

    public ap1(p000.bp1 r1, p000.C0556mo r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>()
            r0.f1270 = r1
            r0.f1271 = r2
            r0.f1272 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.ap1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ap1 r5 = (p000.ap1) r5
            bp1 r1 = r4.f1270
            bp1 r3 = r5.f1270
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            bp1 r1 = r4.f1271
            bp1 r3 = r5.f1271
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Throwable r4 = r4.f1272
            java.lang.Throwable r5 = r5.f1272
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            bp1 r0 = r3.f1270
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            bp1 r2 = r3.f1271
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Throwable r3 = r3.f1272
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConnectResult(plan="
            r0.<init>(r1)
            bp1 r1 = r2.f1270
            r0.append(r1)
            java.lang.String r1 = ", nextPlan="
            r0.append(r1)
            bp1 r1 = r2.f1271
            r0.append(r1)
            java.lang.String r1 = ", throwable="
            r0.append(r1)
            java.lang.Throwable r2 = r2.f1272
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
