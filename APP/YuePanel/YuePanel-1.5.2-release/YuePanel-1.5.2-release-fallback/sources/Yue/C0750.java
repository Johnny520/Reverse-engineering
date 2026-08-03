package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0750 implements Yue.InterfaceC3643 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f2106 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f2107 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f2108 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f2109 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.InterfaceC3643 f2110;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f2111;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f2112;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f2113;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.lang.Object f2114;

    public C0750(@Yue.InterfaceC4410 Yue.InterfaceC3643 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2111 = r0
            r0 = -1
            r1.f2112 = r0
            r1.f2113 = r0
            r0 = 0
            r1.f2114 = r0
            r1.f2110 = r2
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo4605(int r2, int r3) {
            r1 = this;
            r1.m4609()
            Yue.ۥ۠ۧۢۦ r0 = r1.f2110
            r0.mo4605(r2, r3)
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void mo4606(int r5, int r6) {
            r4 = this;
            int r0 = r4.f2111
            r1 = 1
            if (r0 != r1) goto L19
            int r0 = r4.f2112
            if (r5 < r0) goto L19
            int r2 = r4.f2113
            int r3 = r0 + r2
            if (r5 > r3) goto L19
            int r2 = r2 + r6
            r4.f2113 = r2
            int r5 = java.lang.Math.min(r5, r0)
            r4.f2112 = r5
            return
        L19:
            r4.m4609()
            r4.f2112 = r5
            r4.f2113 = r6
            r4.f2111 = r1
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo4607(int r4, int r5) {
            r3 = this;
            int r0 = r3.f2111
            r1 = 2
            if (r0 != r1) goto L15
            int r0 = r3.f2112
            if (r0 < r4) goto L15
            int r2 = r4 + r5
            if (r0 > r2) goto L15
            int r0 = r3.f2113
            int r0 = r0 + r5
            r3.f2113 = r0
            r3.f2112 = r4
            return
        L15:
            r3.m4609()
            r3.f2112 = r4
            r3.f2113 = r5
            r3.f2111 = r1
            return
    }

    @Override // Yue.InterfaceC3643
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo4608(int r6, int r7, java.lang.Object r8) {
            r5 = this;
            int r0 = r5.f2111
            r1 = 3
            if (r0 != r1) goto L26
            int r0 = r5.f2112
            int r2 = r5.f2113
            int r3 = r0 + r2
            if (r6 > r3) goto L26
            int r3 = r6 + r7
            if (r3 < r0) goto L26
            java.lang.Object r4 = r5.f2114
            if (r4 != r8) goto L26
            int r2 = r2 + r0
            int r6 = java.lang.Math.min(r6, r0)
            r5.f2112 = r6
            int r6 = java.lang.Math.max(r2, r3)
            int r7 = r5.f2112
            int r6 = r6 - r7
            r5.f2113 = r6
            return
        L26:
            r5.m4609()
            r5.f2112 = r6
            r5.f2113 = r7
            r5.f2114 = r8
            r5.f2111 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m4609() {
            r4 = this;
            int r0 = r4.f2111
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            if (r0 == r1) goto L25
            r1 = 2
            if (r0 == r1) goto L1b
            r1 = 3
            if (r0 == r1) goto Lf
            goto L2e
        Lf:
            Yue.ۥ۠ۧۢۦ r0 = r4.f2110
            int r1 = r4.f2112
            int r2 = r4.f2113
            java.lang.Object r3 = r4.f2114
            r0.mo4608(r1, r2, r3)
            goto L2e
        L1b:
            Yue.ۥ۠ۧۢۦ r0 = r4.f2110
            int r1 = r4.f2112
            int r2 = r4.f2113
            r0.mo4607(r1, r2)
            goto L2e
        L25:
            Yue.ۥ۠ۧۢۦ r0 = r4.f2110
            int r1 = r4.f2112
            int r2 = r4.f2113
            r0.mo4606(r1, r2)
        L2e:
            r0 = 0
            r4.f2114 = r0
            r0 = 0
            r4.f2111 = r0
            return
    }
}
