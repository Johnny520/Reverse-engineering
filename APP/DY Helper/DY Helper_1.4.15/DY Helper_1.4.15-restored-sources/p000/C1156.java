package p000;

/* JADX INFO: renamed from: ｚ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1156 {

    /* JADX INFO: renamed from: α */
    public final long f13524;

    /* JADX INFO: renamed from: β */
    public final boolean f13525;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object f13526;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f13527;

    public C1156(long r1, boolean r3, java.lang.Object r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>()
            r0.f13524 = r1
            r0.f13525 = r3
            r0.f13526 = r4
            r0.f13527 = r5
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.C1156 m7363(p000.C1156 r6, p000.gc1 r7, p000.dc1 r8, int r9) {
            long r1 = r6.f13524
            r0 = r9 & 2
            if (r0 == 0) goto La
            boolean r0 = r6.f13525
        L8:
            r3 = r0
            goto Lc
        La:
            r0 = 0
            goto L8
        Lc:
            r0 = r9 & 4
            if (r0 == 0) goto L12
            java.lang.Object r7 = r6.f13526
        L12:
            r4 = r7
            r7 = r9 & 8
            if (r7 == 0) goto L19
            java.lang.Object r8 = r6.f13527
        L19:
            r5 = r8
            r6.getClass()
            ｚ r0 = new ｚ
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.C1156
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ｚ r8 = (p000.C1156) r8
            long r3 = r7.f13524
            long r5 = r8.f13524
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            boolean r1 = r7.f13525
            boolean r3 = r8.f13525
            if (r1 == r3) goto L1c
            return r2
        L1c:
            java.lang.Object r1 = r7.f13526
            java.lang.Object r3 = r8.f13526
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L27
            return r2
        L27:
            java.lang.Object r7 = r7.f13527
            java.lang.Object r8 = r8.f13527
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 != 0) goto L32
            return r2
        L32:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f13524
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r4.f13525
            int r0 = p000.lz1.m3678(r0, r1, r2)
            r2 = 0
            java.lang.Object r3 = r4.f13526
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Object r4 = r4.f13527
            if (r4 != 0) goto L21
            goto L25
        L21:
            int r2 = r4.hashCode()
        L25:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Snapshot(runId="
            r0.<init>(r1)
            long r1 = r3.f13524
            r0.append(r1)
            java.lang.String r1 = ", running="
            r0.append(r1)
            boolean r1 = r3.f13525
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            java.lang.Object r1 = r3.f13526
            r0.append(r1)
            java.lang.String r1 = ", summary="
            r0.append(r1)
            java.lang.Object r3 = r3.f13527
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
