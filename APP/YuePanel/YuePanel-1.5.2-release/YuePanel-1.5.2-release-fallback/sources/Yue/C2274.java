package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2274 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5225 f7050;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0296 f7051;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5215 f7052;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.AbstractC2233 f7053;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C5439.C5441 f7054;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C5439 f7055;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f7056;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f7057;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f7058;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C5436 f7059;

    public C2274(@Yue.InterfaceC4418 Yue.C5225 r2, @Yue.InterfaceC4418 Yue.C0296 r3, @Yue.InterfaceC4418 Yue.C5215 r4, @Yue.InterfaceC4418 Yue.AbstractC2233 r5) {
            r1 = this;
            java.lang.String r0 = "connectionPool"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "address"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "eventListener"
            Yue.C3329.m13906(r5, r0)
            r1.<init>()
            r1.f7050 = r2
            r1.f7051 = r3
            r1.f7052 = r4
            r1.f7053 = r5
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.InterfaceC2272 m10512(@Yue.InterfaceC4418 Yue.C4559 r9, @Yue.InterfaceC4418 Yue.C5228 r10) {
            r8 = this;
            java.lang.String r0 = "client"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "chain"
            Yue.C3329.m13906(r10, r0)
            int r2 = r10.m19752()     // Catch: java.io.IOException -> L38 Yue.C5438 -> L3a
            int r3 = r10.m19754()     // Catch: java.io.IOException -> L38 Yue.C5438 -> L3a
            int r4 = r10.m19756()     // Catch: java.io.IOException -> L38 Yue.C5438 -> L3a
            int r5 = r9.m18188()     // Catch: java.io.IOException -> L38 Yue.C5438 -> L3a
            boolean r6 = r9.m18194()     // Catch: java.io.IOException -> L38 Yue.C5438 -> L3a
            Yue.ۥۡۦۤۧ r0 = r10.m19755()     // Catch: java.io.IOException -> L38 Yue.C5438 -> L3a
            java.lang.String r0 = r0.m20086()     // Catch: java.io.IOException -> L38 Yue.C5438 -> L3a
            java.lang.String r1 = "GET"
            boolean r0 = Yue.C3329.m13897(r0, r1)     // Catch: java.io.IOException -> L38 Yue.C5438 -> L3a
            r7 = r0 ^ 1
            r1 = r8
            Yue.ۥۡۦ۠ۥ r0 = r1.m10514(r2, r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L38 Yue.C5438 -> L3a
            Yue.ۥۣ۠ۡ۠ r9 = r0.m19728(r9, r10)     // Catch: java.io.IOException -> L38 Yue.C5438 -> L3a
            return r9
        L38:
            r9 = move-exception
            goto L3c
        L3a:
            r9 = move-exception
            goto L45
        L3c:
            r8.m10519(r9)
            Yue.ۥۡۧ۠ۥ r10 = new Yue.ۥۡۧ۠ۥ
            r10.<init>(r9)
            throw r10
        L45:
            java.io.IOException r10 = r9.m20521()
            r8.m10519(r10)
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C5219 m10513(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
            r14 = this;
            r1 = r14
            Yue.ۥۡۦ۠ۤ r0 = r1.f7052
            boolean r0 = r0.mo5244()
            if (r0 != 0) goto L175
            Yue.ۥۡۦ۠ۤ r0 = r1.f7052
            Yue.ۥۡۦ۠ۥ r2 = r0.m19682()
            r3 = 0
            if (r2 == 0) goto L5f
            monitor-enter(r2)
            boolean r0 = r2.m19722()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L30
            Yue.ۥۣۡۧ۠ r0 = r2.mo7317()     // Catch: java.lang.Throwable -> L2e
            Yue.ۥ۟۠ۢ r0 = r0.m20512()     // Catch: java.lang.Throwable -> L2e
            Yue.ۥ۠ۤۨۥ r0 = r0.m1318()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r14.m10518(r0)     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L2c
            goto L30
        L2c:
            r0 = r3
            goto L36
        L2e:
            r0 = move-exception
            goto L5d
        L30:
            Yue.ۥۡۦ۠ۤ r0 = r1.f7052     // Catch: java.lang.Throwable -> L2e
            java.net.Socket r0 = r0.m19693()     // Catch: java.lang.Throwable -> L2e
        L36:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)
            Yue.ۥۡۦ۠ۤ r4 = r1.f7052
            Yue.ۥۡۦ۠ۥ r4 = r4.m19682()
            if (r4 == 0) goto L50
            if (r0 != 0) goto L44
            return r2
        L44:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L50:
            if (r0 == 0) goto L55
            Yue.C6656.m25569(r0)
        L55:
            Yue.ۥ۠ۡۡ۟ r0 = r1.f7053
            Yue.ۥۡۦ۠ۤ r4 = r1.f7052
            r0.mo10232(r4, r2)
            goto L5f
        L5d:
            monitor-exit(r2)
            throw r0
        L5f:
            r0 = 0
            r1.f7056 = r0
            r1.f7057 = r0
            r1.f7058 = r0
            Yue.ۥۡۦ۠ۦ r2 = r1.f7050
            Yue.ۥ۟۠ۢ r4 = r1.f7051
            Yue.ۥۡۦ۠ۤ r5 = r1.f7052
            boolean r2 = r2.m19740(r4, r5, r3, r0)
            if (r2 == 0) goto L83
            Yue.ۥۡۦ۠ۤ r0 = r1.f7052
            Yue.ۥۡۦ۠ۥ r0 = r0.m19682()
            Yue.C3329.m13903(r0)
            Yue.ۥ۠ۡۡ۟ r2 = r1.f7053
            Yue.ۥۡۦ۠ۤ r3 = r1.f7052
            r2.mo10231(r3, r0)
            return r0
        L83:
            Yue.ۥۣۡۧ۠ r2 = r1.f7059
            if (r2 == 0) goto L8e
            Yue.C3329.m13903(r2)
            r1.f7059 = r3
        L8c:
            r4 = r3
            goto Lf3
        L8e:
            Yue.ۥۡۧ۠ۦ$ۥ۟ r2 = r1.f7054
            if (r2 == 0) goto La5
            Yue.C3329.m13903(r2)
            boolean r2 = r2.m20531()
            if (r2 == 0) goto La5
            Yue.ۥۡۧ۠ۦ$ۥ۟ r0 = r1.f7054
            Yue.C3329.m13903(r0)
            Yue.ۥۣۡۧ۠ r2 = r0.m20532()
            goto L8c
        La5:
            Yue.ۥۡۧ۠ۦ r2 = r1.f7055
            if (r2 != 0) goto Lc0
            Yue.ۥۡۧ۠ۦ r2 = new Yue.ۥۡۧ۠ۦ
            Yue.ۥ۟۠ۢ r4 = r1.f7051
            Yue.ۥۡۦ۠ۤ r5 = r1.f7052
            Yue.ۥۣۡۢۨ r5 = r5.m19681()
            Yue.ۥۡۧ۠ۤ r5 = r5.m18182()
            Yue.ۥۡۦ۠ۤ r6 = r1.f7052
            Yue.ۥ۠ۡۡ۟ r7 = r1.f7053
            r2.<init>(r4, r5, r6, r7)
            r1.f7055 = r2
        Lc0:
            Yue.ۥۡۧ۠ۦ$ۥ۟ r2 = r2.m20525()
            r1.f7054 = r2
            java.util.List r4 = r2.m20530()
            Yue.ۥۡۦ۠ۤ r5 = r1.f7052
            boolean r5 = r5.mo5244()
            if (r5 != 0) goto L16d
            Yue.ۥۡۦ۠ۦ r5 = r1.f7050
            Yue.ۥ۟۠ۢ r6 = r1.f7051
            Yue.ۥۡۦ۠ۤ r7 = r1.f7052
            boolean r0 = r5.m19740(r6, r7, r4, r0)
            if (r0 == 0) goto Lef
            Yue.ۥۡۦ۠ۤ r0 = r1.f7052
            Yue.ۥۡۦ۠ۥ r0 = r0.m19682()
            Yue.C3329.m13903(r0)
            Yue.ۥ۠ۡۡ۟ r2 = r1.f7053
            Yue.ۥۡۦ۠ۤ r3 = r1.f7052
            r2.mo10231(r3, r0)
            return r0
        Lef:
            Yue.ۥۣۡۧ۠ r2 = r2.m20532()
        Lf3:
            Yue.ۥۡۦ۠ۥ r13 = new Yue.ۥۡۦ۠ۥ
            Yue.ۥۡۦ۠ۦ r0 = r1.f7050
            r13.<init>(r0, r2)
            Yue.ۥۡۦ۠ۤ r0 = r1.f7052
            r0.m19695(r13)
            Yue.ۥۡۦ۠ۤ r11 = r1.f7052     // Catch: java.lang.Throwable -> L166
            Yue.ۥ۠ۡۡ۟ r12 = r1.f7053     // Catch: java.lang.Throwable -> L166
            r5 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r5.m19711(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L166
            Yue.ۥۡۦ۠ۤ r0 = r1.f7052
            r0.m19695(r3)
            Yue.ۥۡۦ۠ۤ r0 = r1.f7052
            Yue.ۥۣۡۢۨ r0 = r0.m19681()
            Yue.ۥۡۧ۠ۤ r0 = r0.m18182()
            Yue.ۥۣۡۧ۠ r3 = r13.mo7317()
            r0.m20516(r3)
            Yue.ۥۡۦ۠ۦ r0 = r1.f7050
            Yue.ۥ۟۠ۢ r3 = r1.f7051
            Yue.ۥۡۦ۠ۤ r5 = r1.f7052
            r6 = 1
            boolean r0 = r0.m19740(r3, r5, r4, r6)
            if (r0 == 0) goto L14d
            Yue.ۥۡۦ۠ۤ r0 = r1.f7052
            Yue.ۥۡۦ۠ۥ r0 = r0.m19682()
            Yue.C3329.m13903(r0)
            r1.f7059 = r2
            java.net.Socket r2 = r13.mo7319()
            Yue.C6656.m25569(r2)
            Yue.ۥ۠ۡۡ۟ r2 = r1.f7053
            Yue.ۥۡۦ۠ۤ r3 = r1.f7052
            r2.mo10231(r3, r0)
            return r0
        L14d:
            monitor-enter(r13)
            Yue.ۥۡۦ۠ۦ r0 = r1.f7050     // Catch: java.lang.Throwable -> L163
            r0.m19747(r13)     // Catch: java.lang.Throwable -> L163
            Yue.ۥۡۦ۠ۤ r0 = r1.f7052     // Catch: java.lang.Throwable -> L163
            r0.m19674(r13)     // Catch: java.lang.Throwable -> L163
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L163
            monitor-exit(r13)
            Yue.ۥ۠ۡۡ۟ r0 = r1.f7053
            Yue.ۥۡۦ۠ۤ r2 = r1.f7052
            r0.mo10231(r2, r13)
            return r13
        L163:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L166:
            r0 = move-exception
            Yue.ۥۡۦ۠ۤ r2 = r1.f7052
            r2.m19695(r3)
            throw r0
        L16d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L175:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C5219 m10514(int r3, int r4, int r5, int r6, boolean r7, boolean r8) throws java.io.IOException {
            r2 = this;
        L0:
            Yue.ۥۡۦ۠ۥ r0 = r2.m10513(r3, r4, r5, r6, r7)
            boolean r1 = r0.m19726(r8)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r0.m19731()
            Yue.ۥۣۡۧ۠ r0 = r2.f7059
            if (r0 != 0) goto L0
            Yue.ۥۡۧ۠ۦ$ۥ۟ r0 = r2.f7054
            r1 = 1
            if (r0 == 0) goto L1c
            boolean r0 = r0.m20531()
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 != 0) goto L0
            Yue.ۥۡۧ۠ۦ r0 = r2.f7055
            if (r0 == 0) goto L27
            boolean r1 = r0.m20523()
        L27:
            if (r1 == 0) goto L2a
            goto L0
        L2a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "exhausted all routes"
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C0296 m10515() {
            r1 = this;
            Yue.ۥ۟۠ۢ r0 = r1.f7051
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m10516() {
            r2 = this;
            int r0 = r2.f7056
            if (r0 != 0) goto Le
            int r0 = r2.f7057
            if (r0 != 0) goto Le
            int r0 = r2.f7058
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            Yue.ۥۣۡۧ۠ r0 = r2.f7059
            r1 = 1
            if (r0 == 0) goto L14
            return r1
        L14:
            Yue.ۥۣۡۧ۠ r0 = r2.m10517()
            if (r0 == 0) goto L1d
            r2.f7059 = r0
            return r1
        L1d:
            Yue.ۥۡۧ۠ۦ$ۥ۟ r0 = r2.f7054
            if (r0 == 0) goto L28
            boolean r0 = r0.m20531()
            if (r0 != r1) goto L28
            return r1
        L28:
            Yue.ۥۡۧ۠ۦ r0 = r2.f7055
            if (r0 != 0) goto L2d
            return r1
        L2d:
            boolean r0 = r0.m20523()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.C5436 m10517() {
            r4 = this;
            int r0 = r4.f7056
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L44
            int r0 = r4.f7057
            if (r0 > r2) goto L44
            int r0 = r4.f7058
            if (r0 <= 0) goto Lf
            goto L44
        Lf:
            Yue.ۥۡۦ۠ۤ r0 = r4.f7052
            Yue.ۥۡۦ۠ۥ r0 = r0.m19682()
            if (r0 != 0) goto L18
            return r1
        L18:
            monitor-enter(r0)
            int r2 = r0.m19723()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L21
            monitor-exit(r0)
            return r1
        L21:
            Yue.ۥۣۡۧ۠ r2 = r0.mo7317()     // Catch: java.lang.Throwable -> L41
            Yue.ۥ۟۠ۢ r2 = r2.m20512()     // Catch: java.lang.Throwable -> L41
            Yue.ۥ۠ۤۨۥ r2 = r2.m1318()     // Catch: java.lang.Throwable -> L41
            Yue.ۥ۟۠ۢ r3 = r4.f7051     // Catch: java.lang.Throwable -> L41
            Yue.ۥ۠ۤۨۥ r3 = r3.m1318()     // Catch: java.lang.Throwable -> L41
            boolean r2 = Yue.C6656.m25564(r2, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L3b
            monitor-exit(r0)
            return r1
        L3b:
            Yue.ۥۣۡۧ۠ r1 = r0.mo7317()     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)
            return r1
        L41:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L44:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m10518(@Yue.InterfaceC4418 Yue.C3171 r4) {
            r3 = this;
            java.lang.String r0 = "url"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥ۟۠ۢ r0 = r3.f7051
            Yue.ۥ۠ۤۨۥ r0 = r0.m1318()
            int r1 = r4.m13470()
            int r2 = r0.m13470()
            if (r1 != r2) goto L25
            java.lang.String r4 = r4.m13463()
            java.lang.String r0 = r0.m13463()
            boolean r4 = Yue.C3329.m13897(r4, r0)
            if (r4 == 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m10519(@Yue.InterfaceC4418 java.io.IOException r3) {
            r2 = this;
            java.lang.String r0 = "e"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            r2.f7059 = r0
            boolean r0 = r3 instanceof Yue.C5960
            if (r0 == 0) goto L1c
            r0 = r3
            Yue.ۥۢ۠۠ۦ r0 = (Yue.C5960) r0
            Yue.ۥ۠ۡ۠ۢ r0 = r0.f21739
            Yue.ۥ۠ۡ۠ۢ r1 = Yue.EnumC2176.f6797
            if (r0 != r1) goto L1c
            int r3 = r2.f7056
            int r3 = r3 + 1
            r2.f7056 = r3
            goto L2d
        L1c:
            boolean r3 = r3 instanceof Yue.C1486
            if (r3 == 0) goto L27
            int r3 = r2.f7057
            int r3 = r3 + 1
            r2.f7057 = r3
            goto L2d
        L27:
            int r3 = r2.f7058
            int r3 = r3 + 1
            r2.f7058 = r3
        L2d:
            return
    }
}
