package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class sr1 extends p000.AbstractC0439jo implements p000.w31 {

    /* JADX INFO: renamed from: δ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f10003 = null;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: γ */
    public final long f10004;

    static {
            java.lang.Class<sr1> r0 = p000.sr1.class
            java.lang.String r1 = "cleanedAndPointers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p000.sr1.f10003 = r0
            return
    }

    public sr1(long r1, p000.sr1 r3, int r4) {
            r0 = this;
            r0.<init>(r3)
            r0.f10004 = r1
            int r1 = r4 << 16
            r0.cleanedAndPointers$volatile = r1
            return
    }

    @Override // p000.AbstractC0439jo
    /* JADX INFO: renamed from: γ */
    public final boolean mo2976() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.sr1.f10003
            int r0 = r0.get(r2)
            int r1 = r2.mo4588()
            if (r0 != r1) goto L15
            jo r2 = r2.m2975()
            if (r2 != 0) goto L13
            goto L15
        L13:
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m5530() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.sr1.f10003
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r0 = r0.addAndGet(r2, r1)
            int r1 = r2.mo4588()
            if (r0 != r1) goto L17
            jo r2 = r2.m2975()
            if (r2 != 0) goto L15
            goto L17
        L15:
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ζ */
    public abstract int mo4588();

    /* JADX INFO: renamed from: η */
    public abstract void mo4589(int r1, p000.InterfaceC0880up r2);

    /* JADX INFO: renamed from: θ */
    public final void m5531() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.sr1.f10003
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.mo4588()
            if (r0 != r1) goto Lf
            r2.m2977()
        Lf:
            return
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m5532() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.sr1.f10003
            int r1 = r0.get(r3)
            int r2 = r3.mo4588()
            if (r1 != r2) goto L15
            jo r2 = r3.m2975()
            if (r2 != 0) goto L13
            goto L15
        L13:
            r3 = 0
            return r3
        L15:
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            r3 = 1
            return r3
    }
}
