package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: p3 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2346p3 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8224a;

    public /* synthetic */ ExecutorC2346p3(int r1) {
        this.f8224a = r1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        switch(this.f8224a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r2.run();
        return;
    L6:
        AbstractC2622vD.m5135f().post(r2);
        return;
    L8:
        new Thread(r2).start();
    }
}
