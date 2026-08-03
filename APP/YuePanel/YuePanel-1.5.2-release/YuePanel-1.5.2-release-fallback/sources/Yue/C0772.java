package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0772<T> extends Yue.AbstractC0043<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Thread f2175;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.AbstractC2237 f2176;

    public C0772(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4418 java.lang.Thread r3, @Yue.InterfaceC4543 Yue.AbstractC2237 r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.f2175 = r3
            r1.f2176 = r4
            return
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void mo4680(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread r0 = r1.f2175
            boolean r2 = Yue.C3329.m13897(r2, r0)
            if (r2 != 0) goto L20
            java.lang.Thread r2 = r1.f2175
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto L1a
            r0.m535(r2)
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L20
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L20:
            return
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public boolean mo4681() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final T m4682() {
            r6 = this;
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto L9
            r0.m532()
        L9:
            Yue.ۥ۠ۡۡ۠ r0 = r6.f2176     // Catch: java.lang.Throwable -> L14
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L16
            Yue.AbstractC2237.m10252(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L7b
        L16:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L6a
            Yue.ۥ۠ۡۡ۠ r0 = r6.f2176     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L27
            long r4 = r0.mo10262()     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r0 = move-exception
            goto L73
        L27:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2c:
            boolean r0 = r6.mo13978()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L45
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L3e
            r0.m531(r6, r4)     // Catch: java.lang.Throwable -> L25
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L25
            goto L3f
        L3e:
            r0 = r3
        L3f:
            if (r0 != 0) goto L16
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r4)     // Catch: java.lang.Throwable -> L25
            goto L16
        L45:
            Yue.ۥ۠ۡۡ۠ r0 = r6.f2176     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L4c
            Yue.AbstractC2237.m10251(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L14
        L4c:
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto L55
            r0.m536()
        L55:
            java.lang.Object r0 = r6.m14111()
            java.lang.Object r0 = Yue.C3409.m14169(r0)
            boolean r1 = r0 instanceof Yue.C1417
            if (r1 == 0) goto L64
            r3 = r0
            Yue.ۥ۟ۦۣۢ r3 = (Yue.C1417) r3
        L64:
            if (r3 != 0) goto L67
            return r0
        L67:
            java.lang.Throwable r0 = r3.f4520
            throw r0
        L6a:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            r6.m14093(r0)     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L25
        L73:
            Yue.ۥ۠ۡۡ۠ r4 = r6.f2176     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L7a
            Yue.AbstractC2237.m10251(r4, r2, r1, r3)     // Catch: java.lang.Throwable -> L14
        L7a:
            throw r0     // Catch: java.lang.Throwable -> L14
        L7b:
            Yue.ۥ۟۟ۢۧ r1 = Yue.C0098.m539()
            if (r1 == 0) goto L84
            r1.m536()
        L84:
            throw r0
    }
}
