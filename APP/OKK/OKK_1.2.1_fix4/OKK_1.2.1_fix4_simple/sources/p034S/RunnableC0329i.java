package p034S;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p089x0.C1121e;

/* JADX INFO: renamed from: S.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0329i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f643a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f644b;

    public /* synthetic */ RunnableC0329i(Context r1, int r2) {
        this.f643a = r2;
        this.f644b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f643a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ExecutorC0325e r02 = new ExecutorC0325e();
        C1121e r1 = AbstractC0327g.f630a;
        AbstractC0327g.m746s(this.f644b, r02, r1, false);
        return;
    L6:
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0329i(this.f644b, 1));
    }
}
