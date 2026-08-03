package c5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c5.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1029i;

    public d(int r2, x5.d r3) {
            r1 = this;
            r0 = -2
            r1.<init>(r2, r0)
            int r2 = r3.f21187h
            r1.f1029i = r2
            return
    }

    @Override // b5.j
    public final boolean c(e5.a r14) {
            r13 = this;
            java.lang.String r0 = ".line "
            r14.write(r0)
            int r0 = r13.f1029i
            if (r0 >= 0) goto L3d
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1b
            r4 = 45
            r14.write(r4)
        L1b:
            r4 = 23
        L1d:
            r5 = 10
            long r7 = r0 % r5
            long r7 = java.lang.Math.abs(r7)
            char[] r9 = r14.f2354i
            int r10 = r4 + (-1)
            r11 = 48
            long r7 = r7 + r11
            int r7 = (int) r7
            char r7 = (char) r7
            r9[r4] = r7
            long r0 = r0 / r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L3b
            int r0 = 24 - r4
            r14.write(r9, r4, r0)
            goto L40
        L3b:
            r4 = r10
            goto L1d
        L3d:
            r14.z(r0)
        L40:
            r14 = 1
            return r14
    }
}
