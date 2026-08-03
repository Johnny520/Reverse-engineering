package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3348 extends Yue.AbstractC3387 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f10802 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _invoked;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> f10803;

    static {
            java.lang.Class<Yue.ۥ۠ۥۨ۟> r0 = Yue.C3348.class
            java.lang.String r1 = "_invoked"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            Yue.C3348.f10802 = r0
            return
    }

    public C3348(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r1) {
            r0 = this;
            r0.<init>()
            r0.f10803 = r1
            r1 = 0
            r0._invoked = r1
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
    public void mo4448(@Yue.InterfaceC4543 java.lang.Throwable r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C3348.f10802
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto Lf
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r0 = r3.f10803
            r0.invoke(r4)
        Lf:
            return
    }
}
