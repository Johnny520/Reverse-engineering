package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1873<T> extends Yue.C5512<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f5790 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _decision;

    static {
            java.lang.Class<Yue.ۥ۠۟ۢۡ> r0 = Yue.C1873.class
            java.lang.String r1 = "_decision"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            Yue.C1873.f5790 = r0
            return
    }

    public C1873(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0._decision = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    private final boolean m8757() {
            r4 = this;
        L0:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto L9
            return r1
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C1873.f5790
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    private final boolean m8758() {
            r3 = this;
        L0:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L15
            r2 = 2
            if (r0 != r2) goto L9
            return r1
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.C1873.f5790
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            return r2
    }

    @Override // Yue.C5512, Yue.C3403
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo4680(@Yue.InterfaceC4543 java.lang.Object r1) {
            r0 = this;
            r0.mo376(r1)
            return
    }

    @Override // Yue.C5512, Yue.AbstractC0043
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ */
    public void mo376(@Yue.InterfaceC4543 java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.m8757()
            if (r0 == 0) goto L7
            return
        L7:
            Yue.ۥ۟ۧۤۢ<T> r0 = r3.f20408
            Yue.ۥ۟ۧۤۢ r0 = Yue.C3332.m13940(r0)
            Yue.ۥ۟ۧۤۢ<T> r1 = r3.f20408
            java.lang.Object r4 = Yue.C1423.m7051(r4, r1)
            r1 = 2
            r2 = 0
            Yue.C1872.m8755(r0, r4, r2, r1, r2)
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public final java.lang.Object m8759() {
            r2 = this;
            boolean r0 = r2.m8758()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = Yue.C3341.m13947()
            return r0
        Lb:
            java.lang.Object r0 = r2.m14111()
            java.lang.Object r0 = Yue.C3409.m14169(r0)
            boolean r1 = r0 instanceof Yue.C1417
            if (r1 != 0) goto L18
            return r0
        L18:
            Yue.ۥ۟ۦۣۢ r0 = (Yue.C1417) r0
            java.lang.Throwable r0 = r0.f4520
            throw r0
    }
}
