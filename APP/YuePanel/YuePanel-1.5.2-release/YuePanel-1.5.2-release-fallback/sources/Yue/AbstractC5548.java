package Yue;

import Yue.AbstractC5548;

/* JADX INFO: renamed from: Yue.ۥۡۧۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5548<S extends Yue.AbstractC5548<S>> extends Yue.AbstractC1448<S> {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f20497 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int cleanedAndPointers;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long f20498;

    static {
            java.lang.Class<Yue.ۥۡۧۨ۟> r0 = Yue.AbstractC5548.class
            java.lang.String r1 = "cleanedAndPointers"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            Yue.AbstractC5548.f20497 = r0
            return
    }

    public AbstractC5548(long r1, @Yue.InterfaceC4543 S r3, int r4) {
            r0 = this;
            r0.<init>(r3)
            r0.f20498 = r1
            int r1 = r4 << 16
            r0.cleanedAndPointers = r1
            return
    }

    @Override // Yue.AbstractC1448
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo7111() {
            r2 = this;
            int r0 = r2.cleanedAndPointers
            int r1 = r2.mo20812()
            if (r0 != r1) goto L10
            boolean r0 = r2.m7113()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m20810() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.AbstractC5548.f20497
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r0 = r0.addAndGet(r2, r1)
            int r1 = r2.mo20812()
            if (r0 != r1) goto L16
            boolean r0 = r2.m7113()
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final long m20811() {
            r2 = this;
            long r0 = r2.f20498
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract int mo20812();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m20813() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Yue.AbstractC5548.f20497
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.mo20812()
            if (r0 != r1) goto L15
            boolean r0 = r2.m7113()
            if (r0 != 0) goto L15
            r2.m7116()
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m20814() {
            r3 = this;
        L0:
            int r0 = r3.cleanedAndPointers
            int r1 = r3.mo20812()
            if (r0 != r1) goto L11
            boolean r1 = r3.m7113()
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L1d
        L11:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = Yue.AbstractC5548.f20497
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r0
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L0
            r0 = 1
        L1d:
            return r0
    }
}
