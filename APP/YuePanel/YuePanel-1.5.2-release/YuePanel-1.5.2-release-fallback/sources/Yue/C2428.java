package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2428 extends Yue.AbstractC2754 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final long f8097;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean f8098;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long f8099;

    public C2428(@Yue.InterfaceC4418 Yue.InterfaceC5839 r2, long r3, boolean r5) {
            r1 = this;
            java.lang.String r0 = "delegate"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r2)
            r1.f8097 = r3
            r1.f8098 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m11204(Yue.C0843 r2, long r3) {
            r1 = this;
            Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
            r0.<init>()
            r0.mo4815(r2)
            r2.mo4176(r0, r3)
            r0.m4808()
            return
    }

    @Override // Yue.AbstractC2754, Yue.InterfaceC5839
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r10, long r11) {
            r9 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r10, r0)
            long r0 = r9.f8099
            long r2 = r9.f8097
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = -1
            r7 = 0
            if (r4 <= 0) goto L13
            r11 = r7
            goto L21
        L13:
            boolean r4 = r9.f8098
            if (r4 == 0) goto L21
            long r2 = r2 - r0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L1d
            return r5
        L1d:
            long r11 = java.lang.Math.min(r11, r2)
        L21:
            long r11 = super.mo4179(r10, r11)
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r1 = r9.f8099
            long r1 = r1 + r11
            r9.f8099 = r1
        L2e:
            long r1 = r9.f8099
            long r3 = r9.f8097
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L38
            if (r0 == 0) goto L3c
        L38:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L74
        L3c:
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 <= 0) goto L51
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 <= 0) goto L51
            long r11 = r10.m4889()
            long r0 = r9.f8099
            long r2 = r9.f8097
            long r0 = r0 - r2
            long r11 = r11 - r0
            r9.m11204(r10, r11)
        L51:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "expected "
            r11.append(r12)
            long r0 = r9.f8097
            r11.append(r0)
            java.lang.String r12 = " bytes but got "
            r11.append(r12)
            long r0 = r9.f8099
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L74:
            return r11
    }
}
