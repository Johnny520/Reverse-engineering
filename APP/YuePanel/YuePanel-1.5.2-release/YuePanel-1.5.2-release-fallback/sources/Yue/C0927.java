package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0927 extends Yue.AbstractC3402 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.Future<?> f2692;

    public C0927(@Yue.InterfaceC4418 java.util.concurrent.Future<?> r1) {
            r0 = this;
            r0.<init>()
            r0.f2692 = r1
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.mo4448(r1)
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    @Override // Yue.AbstractC1419
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    public void mo4448(@Yue.InterfaceC4543 java.lang.Throwable r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.concurrent.Future<?> r2 = r1.f2692
            r0 = 0
            r2.cancel(r0)
        L8:
            return
    }
}
