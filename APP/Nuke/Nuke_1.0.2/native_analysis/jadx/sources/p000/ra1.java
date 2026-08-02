package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 implements Executor {

    /* JADX INFO: renamed from: h */
    public RunnableC0724t7 f9485h;

    /* JADX INFO: renamed from: i */
    public RunnableC0724t7 f9486i;

    /* JADX INFO: renamed from: a */
    public final synchronized void m4418a() {
        RunnableC0724t7 runnableC0724t7 = this.f9486i;
        this.f9485h = runnableC0724t7;
        this.f9486i = null;
        if (runnableC0724t7 != null) {
            ci0.m785J().execute(this.f9485h);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f9485h == null) {
                this.f9485h = new RunnableC0724t7(5, this, runnable);
                ci0.m785J().execute(this.f9485h);
            } else if (this.f9486i == null) {
                this.f9486i = new RunnableC0724t7(5, this, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
