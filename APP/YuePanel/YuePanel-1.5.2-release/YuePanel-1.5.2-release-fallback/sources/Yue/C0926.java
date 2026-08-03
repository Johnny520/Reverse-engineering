package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0926 extends Yue.AbstractC0928 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.Future<?> f2691;

    public C0926(@Yue.InterfaceC4418 java.util.concurrent.Future<?> r1) {
            r0 = this;
            r0.<init>()
            r0.f2691 = r1
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.mo353(r1)
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CancelFutureOnCancel["
            r0.append(r1)
            java.util.concurrent.Future<?> r1 = r2.f2691
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC0929
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo353(@Yue.InterfaceC4543 java.lang.Throwable r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.concurrent.Future<?> r2 = r1.f2691
            r0 = 0
            r2.cancel(r0)
        L8:
            return
    }
}
