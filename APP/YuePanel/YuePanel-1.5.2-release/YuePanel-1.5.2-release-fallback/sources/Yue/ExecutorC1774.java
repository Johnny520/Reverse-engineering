package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC1774 extends Yue.AbstractC2277 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.ExecutorC1774 f5496 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.AbstractC1643 f5497 = null;

    static {
            Yue.ۥ۟ۨۥۧ r0 = new Yue.ۥ۟ۨۥۧ
            r0.<init>()
            Yue.ExecutorC1774.f5496 = r0
            Yue.ۥۣۢ۠ۥ r0 = Yue.C6594.f23017
            r1 = 64
            int r2 = Yue.C6087.m22842()
            int r4 = Yue.C5196.m19514(r1, r2)
            r7 = 12
            r8 = 0
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            r5 = 0
            r6 = 0
            int r1 = Yue.C6087.m22847(r3, r4, r5, r6, r7, r8)
            Yue.ۥ۟ۧۦۨ r0 = r0.limitedParallelism(r1)
            Yue.ExecutorC1774.f5497 = r0
            return
    }

    public ExecutorC1774() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.AbstractC2277, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot be invoked on Dispatchers.IO"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.AbstractC1643
    public void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4418 java.lang.Runnable r3) {
            r1 = this;
            Yue.ۥ۟ۧۦۨ r0 = Yue.ExecutorC1774.f5497
            r0.dispatch(r2, r3)
            return
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC3324
    public void dispatchYield(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4418 java.lang.Runnable r3) {
            r1 = this;
            Yue.ۥ۟ۧۦۨ r0 = Yue.ExecutorC1774.f5497
            r0.dispatchYield(r2, r3)
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@Yue.InterfaceC4418 java.lang.Runnable r2) {
            r1 = this;
            Yue.ۥ۠۠ۧۦ r0 = Yue.C2141.f6728
            r1.dispatch(r0, r2)
            return
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    @Yue.InterfaceC2302
    public Yue.AbstractC1643 limitedParallelism(int r2) {
            r1 = this;
            Yue.ۥۣۢ۠ۥ r0 = Yue.C6594.f23017
            Yue.ۥ۟ۧۦۨ r2 = r0.limitedParallelism(r2)
            return r2
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }

    @Override // Yue.AbstractC2277
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public java.util.concurrent.Executor mo8460() {
            r0 = this;
            return r0
    }
}
