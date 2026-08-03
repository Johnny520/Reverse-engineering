package ac;

import java.util.concurrent.Executor;
import p002a1.RunnableC0006d;

/* JADX INFO: renamed from: ac.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0064q implements Executor {

    /* JADX INFO: renamed from: g */
    public RunnableC0006d f217g;

    /* JADX INFO: renamed from: h */
    public RunnableC0006d f218h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m434a() {
        RunnableC0006d runnableC0006d = this.f218h;
        this.f217g = runnableC0006d;
        this.f218h = null;
        if (runnableC0006d != null) {
            AbstractC0063p.m430w().execute(this.f217g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f217g == null) {
                this.f217g = new RunnableC0006d(this, 2, runnable);
                AbstractC0063p.m430w().execute(this.f217g);
            } else if (this.f218h == null) {
                this.f218h = new RunnableC0006d(this, 2, runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
