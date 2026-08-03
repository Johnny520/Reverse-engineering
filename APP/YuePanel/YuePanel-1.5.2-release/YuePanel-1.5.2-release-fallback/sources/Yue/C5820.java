package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5820 extends Yue.C0632 {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.net.Socket f21344;

    public C5820(@Yue.InterfaceC4418 java.net.Socket r2) {
            r1 = this;
            java.lang.String r0 = "socket"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f21344 = r2
            return
    }

    @Override // Yue.C0632
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public java.io.IOException mo4161(@Yue.InterfaceC4543 java.io.IOException r3) {
            r2 = this;
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            r0.initCause(r3)
        Lc:
            return r0
    }

    @Override // Yue.C0632
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public void mo4165() {
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r5.f21344     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> La
            r1.close()     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> La
            goto L48
        L8:
            r1 = move-exception
            goto Lc
        La:
            r1 = move-exception
            goto L2e
        Lc:
            boolean r2 = Yue.C4603.m18387(r1)
            if (r2 == 0) goto L2d
            java.util.logging.Logger r2 = Yue.C4604.m18400()
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.net.Socket r0 = r5.f21344
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
            goto L48
        L2d:
            throw r1
        L2e:
            java.util.logging.Logger r2 = Yue.C4604.m18400()
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.net.Socket r0 = r5.f21344
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
        L48:
            return
    }
}
