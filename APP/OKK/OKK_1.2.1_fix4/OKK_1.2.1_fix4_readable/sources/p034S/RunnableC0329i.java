package p034S;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: S.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0329i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f643a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f644b;

    public /* synthetic */ RunnableC0329i(Context context, int i2) {
        this.f643a = i2;
        this.f644b = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f643a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0329i(this.f644b, 1));
                break;
            default:
                AbstractC0327g.m746s(this.f644b, new ExecutorC0325e(), AbstractC0327g.f630a, false);
                break;
        }
    }
}
