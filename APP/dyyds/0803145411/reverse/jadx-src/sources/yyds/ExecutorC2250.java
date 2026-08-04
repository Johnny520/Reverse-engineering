package yyds;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: yyds.ᲁᛶᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2250 implements Executor {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Runnable f11090;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Executor f11091;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f11092;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Object f11093;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ArrayDeque f11094;

    public ExecutorC2250(Executor executor) {
        this.f11092 = 1;
        this.f11091 = executor;
        this.f11094 = new ArrayDeque();
        this.f11093 = new Object();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11092) {
            case 0:
                synchronized (this.f11093) {
                    try {
                        this.f11094.add(new RunnableC2696(this, 0, runnable));
                        if (this.f11090 == null) {
                            m4250();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f11093) {
                    this.f11094.offer(new RunnableC2696(runnable, this));
                    if (this.f11090 == null) {
                        m4250();
                    }
                    break;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4250() {
        switch (this.f11092) {
            case 0:
                synchronized (this.f11093) {
                    try {
                        Runnable runnable = (Runnable) this.f11094.poll();
                        this.f11090 = runnable;
                        if (runnable != null) {
                            ((ExecutorC1267) this.f11091).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f11093) {
                    Object objPoll = this.f11094.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.f11090 = runnable2;
                    if (objPoll != null) {
                        this.f11091.execute(runnable2);
                    }
                    break;
                }
                return;
        }
    }

    public ExecutorC2250(ExecutorC1267 executorC1267) {
        this.f11092 = 0;
        this.f11093 = new Object();
        this.f11094 = new ArrayDeque();
        this.f11091 = executorC1267;
    }
}
