package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1874<T> extends Yue.AbstractRunnableC6112 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public int f5791;

    public AbstractC1874(int r1) {
            r0 = this;
            r0.<init>()
            r0.f5791 = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            Yue.ۥۢ۠ۨۨ r0 = r10.f22060
            Yue.ۥ۟ۧۤۢ r1 = r10.mo5315()     // Catch: java.lang.Throwable -> L1e
            Yue.ۥ۠۟ۢ۟ r1 = (Yue.C1871) r1     // Catch: java.lang.Throwable -> L1e
            Yue.ۥ۟ۧۤۢ<T> r2 = r1.f5785     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.f5787     // Catch: java.lang.Throwable -> L1e
            Yue.ۥ۟ۧۦۥ r3 = r2.getContext()     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = Yue.C6179.m23131(r3, r1)     // Catch: java.lang.Throwable -> L1e
            Yue.ۥۢ۠ۦۢ r4 = Yue.C6179.f22151     // Catch: java.lang.Throwable -> L1e
            r5 = 0
            if (r1 == r4) goto L21
            Yue.ۥۣۢ۠۟ r4 = Yue.C1639.m7920(r2, r3, r1)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r1 = move-exception
            goto Lb4
        L21:
            r4 = r5
        L22:
            Yue.ۥ۟ۧۦۥ r6 = r2.getContext()     // Catch: java.lang.Throwable -> L41
            java.lang.Object r7 = r10.mo5318()     // Catch: java.lang.Throwable -> L41
            java.lang.Throwable r8 = r10.mo5316(r7)     // Catch: java.lang.Throwable -> L41
            if (r8 != 0) goto L43
            int r9 = r10.f5791     // Catch: java.lang.Throwable -> L41
            boolean r9 = Yue.C1875.m8763(r9)     // Catch: java.lang.Throwable -> L41
            if (r9 == 0) goto L43
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r9 = Yue.InterfaceC3383.f10824     // Catch: java.lang.Throwable -> L41
            Yue.ۥ۟ۧۦۥ$ۥ۟ r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L41
            Yue.ۥ۠ۦ۟ۡ r6 = (Yue.InterfaceC3383) r6     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r2 = move-exception
            goto La8
        L43:
            r6 = r5
        L44:
            if (r6 == 0) goto L61
            boolean r9 = r6.mo371()     // Catch: java.lang.Throwable -> L41
            if (r9 != 0) goto L61
            java.util.concurrent.CancellationException r6 = r6.mo13982()     // Catch: java.lang.Throwable -> L41
            r10.mo5314(r7, r6)     // Catch: java.lang.Throwable -> L41
            Yue.ۥۡۦۧۤ$ۥ r7 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L41
            java.lang.Object r6 = Yue.C5391.m20390(r6)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r6 = Yue.C5388.m20377(r6)     // Catch: java.lang.Throwable -> L41
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L41
            goto L7e
        L61:
            if (r8 == 0) goto L71
            Yue.ۥۡۦۧۤ$ۥ r6 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L41
            java.lang.Object r6 = Yue.C5391.m20390(r8)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r6 = Yue.C5388.m20377(r6)     // Catch: java.lang.Throwable -> L41
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L41
            goto L7e
        L71:
            Yue.ۥۡۦۧۤ$ۥ r6 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L41
            java.lang.Object r6 = r10.mo5317(r7)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r6 = Yue.C5388.m20377(r6)     // Catch: java.lang.Throwable -> L41
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L41
        L7e:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L88
            boolean r4 = r4.m25373()     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L8b
        L88:
            Yue.C6179.m23129(r3, r1)     // Catch: java.lang.Throwable -> L1e
        L8b:
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L95
            r0.mo14526()     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> L95
            goto La0
        L95:
            r0 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Object r0 = Yue.C5391.m20390(r0)
            java.lang.Object r0 = Yue.C5388.m20377(r0)
        La0:
            java.lang.Throwable r0 = Yue.C5388.m20380(r0)
            r10.m8760(r5, r0)
            goto Ld2
        La8:
            if (r4 == 0) goto Lb0
            boolean r4 = r4.m25373()     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto Lb3
        Lb0:
            Yue.C6179.m23129(r3, r1)     // Catch: java.lang.Throwable -> L1e
        Lb3:
            throw r2     // Catch: java.lang.Throwable -> L1e
        Lb4:
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lc0
            r0.mo14526()     // Catch: java.lang.Throwable -> Lc0
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r0 = Yue.C5388.m20377(r0)     // Catch: java.lang.Throwable -> Lc0
            goto Lcb
        Lc0:
            r0 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029
            java.lang.Object r0 = Yue.C5391.m20390(r0)
            java.lang.Object r0 = Yue.C5388.m20377(r0)
        Lcb:
            java.lang.Throwable r0 = Yue.C5388.m20380(r0)
            r10.m8760(r1, r0)
        Ld2:
            return
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void mo5314(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4418 java.lang.Throwable r2) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract Yue.InterfaceC1598<T> mo5315();

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public java.lang.Throwable mo5316(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C1417
            r1 = 0
            if (r0 == 0) goto L8
            Yue.ۥ۟ۦۣۢ r3 = (Yue.C1417) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto Ld
            java.lang.Throwable r1 = r3.f4520
        Ld:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public <T> T mo5317(@Yue.InterfaceC4543 java.lang.Object r1) {
            r0 = this;
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m8760(@Yue.InterfaceC4543 java.lang.Throwable r3, @Yue.InterfaceC4543 java.lang.Throwable r4) {
            r2 = this;
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            return
        L5:
            if (r3 == 0) goto Lc
            if (r4 == 0) goto Lc
            Yue.C2268.m10468(r3, r4)
        Lc:
            if (r3 != 0) goto Lf
            r3 = r4
        Lf:
            Yue.ۥ۟ۧۨ۟ r4 = new Yue.ۥ۟ۧۨ۟
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fatal exception in coroutines machinery for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            Yue.C3329.m13903(r3)
            r4.<init>(r0, r3)
            Yue.ۥ۟ۧۤۢ r3 = r2.mo5315()
            Yue.ۥ۟ۧۦۥ r3 = r3.getContext()
            Yue.C1650.m7933(r3, r4)
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public abstract java.lang.Object mo5318();
}
