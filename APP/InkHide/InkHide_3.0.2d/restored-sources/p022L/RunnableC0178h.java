package p022L;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: L.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0178h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f525b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0178h(Context context, int i2) {
        this.f524a = i2;
        this.f525b = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f524a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0178h(this.f525b, 1));
                break;
            default:
                AbstractC0177g.m380s(this.f525b, new ExecutorC0175e(), AbstractC0177g.f514a, false);
                break;
        }
    }
}
