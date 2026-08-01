package p000;

/* JADX INFO: renamed from: ht */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0371ht extends p000.wq1 {

    /* JADX INFO: renamed from: ι */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f4799 = null;
    private volatile /* synthetic */ int _decision$volatile;

    static {
            java.lang.Class<ht> r0 = p000.C0371ht.class
            java.lang.String r1 = "_decision$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p000.C0371ht.f4799 = r0
            return
    }

    @Override // p000.wq1, p000.fo0
    /* JADX INFO: renamed from: ο */
    public final void mo2181(java.lang.Object r1) {
            r0 = this;
            r0.mo2182(r1)
            return
    }

    @Override // p000.wq1, p000.fo0
    /* JADX INFO: renamed from: π */
    public final void mo2182(java.lang.Object r4) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.C0371ht.f4799
            int r1 = r0.get(r3)
            if (r1 == 0) goto L1f
            r0 = 1
            if (r1 != r0) goto L19
            op r3 = r3.f11801
            op r3 = p000.AbstractC0978xb.m6563(r3)
            java.lang.Object r4 = p000.AbstractC1021yh.m6910(r4)
            p000.jx0.m3033(r3, r4)
            return
        L19:
            java.lang.String r3 = "Already resumed"
            p000.C1080.m7279(r3)
            return
        L1f:
            r1 = 2
            r2 = 0
            boolean r0 = r0.compareAndSet(r3, r2, r1)
            if (r0 == 0) goto L0
            return
    }
}
