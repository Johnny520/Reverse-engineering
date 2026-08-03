package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class C0943 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f2709;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C0943.InterfaceC0944 f2710;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.Object f2711;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f2712;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ$ۥ, reason: contains not printable characters */
    public interface InterfaceC0944 {
        void onCancel();
    }

    public C0943() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m5362() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2709     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L3a
        L9:
            r0 = 1
            r3.f2709 = r0     // Catch: java.lang.Throwable -> L7
            r3.f2712 = r0     // Catch: java.lang.Throwable -> L7
            Yue.ۥۣ۟ۨۧ$ۥ r0 = r3.f2710     // Catch: java.lang.Throwable -> L7
            java.lang.Object r1 = r3.f2711     // Catch: java.lang.Throwable -> L7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            r2 = 0
            if (r0 == 0) goto L1c
            r0.onCancel()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r0 = move-exception
            goto L24
        L1c:
            if (r1 == 0) goto L2f
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch: java.lang.Throwable -> L1a
            r1.cancel()     // Catch: java.lang.Throwable -> L1a
            goto L2f
        L24:
            monitor-enter(r3)
            r3.f2712 = r2     // Catch: java.lang.Throwable -> L2c
            r3.notifyAll()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r0
        L2c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r0
        L2f:
            monitor-enter(r3)
            r3.f2712 = r2     // Catch: java.lang.Throwable -> L37
            r3.notifyAll()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.Object m5363() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.f2711     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            r2.f2711 = r0     // Catch: java.lang.Throwable -> L14
            boolean r1 = r2.f2709     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            r0.cancel()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L1a
        L16:
            java.lang.Object r0 = r2.f2711     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return r0
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m5364() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f2709     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m5365(@Yue.InterfaceC4544 Yue.C0943.InterfaceC0944 r2) {
            r1 = this;
            monitor-enter(r1)
            r1.m5367()     // Catch: java.lang.Throwable -> La
            Yue.ۥۣ۟ۨۧ$ۥ r0 = r1.f2710     // Catch: java.lang.Throwable -> La
            if (r0 != r2) goto Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            goto L1c
        Lc:
            r1.f2710 = r2     // Catch: java.lang.Throwable -> La
            boolean r0 = r1.f2709     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L1a
            if (r2 != 0) goto L15
            goto L1a
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            r2.onCancel()
            return
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m5366() {
            r1 = this;
            boolean r0 = r1.m5364()
            if (r0 != 0) goto L7
            return
        L7:
            Yue.ۥۣۡۤ۟ r0 = new Yue.ۥۣۡۤ۟
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m5367() {
            r1 = this;
        L0:
            boolean r0 = r1.f2712
            if (r0 == 0) goto L8
            r1.wait()     // Catch: java.lang.InterruptedException -> L0
            goto L0
        L8:
            return
    }
}
