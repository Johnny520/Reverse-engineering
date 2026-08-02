package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dh0 implements Executor {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2052h;

    public /* synthetic */ dh0(int i) {
        this.f2052h = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2052h) {
            case 0:
                b93.m499f().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
