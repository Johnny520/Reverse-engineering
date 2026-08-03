package p001;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001.C0259ic;

/* JADX INFO: renamed from: ۟.b8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0157b8 extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: ۟.b8$a */
    public static final class a extends FutureTask<RunnableC0163c0> implements Comparable<a> {

        /* JADX INFO: renamed from: ۥ */
        public final RunnableC0163c0 f705;

        public a(RunnableC0163c0 runnableC0163c0) {
            super(runnableC0163c0, null);
            this.f705 = runnableC0163c0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            RunnableC0163c0 runnableC0163c0 = this.f705;
            int i = runnableC0163c0.f1360;
            RunnableC0163c0 runnableC0163c02 = aVar.f705;
            int i2 = runnableC0163c02.f1360;
            return i == i2 ? runnableC0163c0.f716 - runnableC0163c02.f716 : C0167c4.m1040(i2) - C0167c4.m1040(i);
        }
    }

    public C0157b8() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C0259ic.b());
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        a aVar = new a((RunnableC0163c0) runnable);
        execute(aVar);
        return aVar;
    }
}
