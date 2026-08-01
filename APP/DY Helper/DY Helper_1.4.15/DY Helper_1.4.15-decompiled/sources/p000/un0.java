package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class un0 extends p000.co0 {

    /* JADX INFO: renamed from: κ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f10913 = null;
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: ι */
    public final p000.C0585ng f10914;

    static {
            java.lang.Class<un0> r0 = p000.un0.class
            java.lang.String r1 = "_invoked$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p000.un0.f10913 = r0
            return
    }

    public un0(p000.C0585ng r1) {
            r0 = this;
            r0.<init>()
            r0.f10914 = r1
            r1 = 0
            r0._invoked$volatile = r1
            return
    }

    @Override // p000.co0
    /* JADX INFO: renamed from: λ */
    public final boolean mo1280() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // p000.co0
    /* JADX INFO: renamed from: μ */
    public final void mo1281(java.lang.Throwable r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p000.un0.f10913
            boolean r0 = r2.compareAndSet(r3, r0, r1)
            if (r0 == 0) goto Lf
            ng r3 = r3.f10914
            r3.invoke(r4)
        Lf:
            return
    }
}
