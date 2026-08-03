package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC1877 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.AbstractC1643 f5804;

    public ExecutorC1877(@Yue.InterfaceC4418 Yue.AbstractC1643 r1) {
            r0 = this;
            r0.<init>()
            r0.f5804 = r1
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@Yue.InterfaceC4418 java.lang.Runnable r3) {
            r2 = this;
            Yue.ۥ۟ۧۦۨ r0 = r2.f5804
            Yue.ۥ۠۠ۧۦ r1 = Yue.C2141.f6728
            r0.dispatch(r1, r3)
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            Yue.ۥ۟ۧۦۨ r0 = r1.f5804
            java.lang.String r0 = r0.toString()
            return r0
    }
}
