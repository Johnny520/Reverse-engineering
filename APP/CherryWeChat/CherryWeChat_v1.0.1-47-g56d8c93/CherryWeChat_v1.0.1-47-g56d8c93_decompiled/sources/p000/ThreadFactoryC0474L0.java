package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: L0 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0474L0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1570a;

    public /* synthetic */ ThreadFactoryC0474L0(int i) {
        this.f1570a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1570a) {
            case 0:
                return new Thread(new RunnableC0431K0(0, runnable), "glide-active-resources");
            case 1:
                return new C0885Uj(runnable);
            default:
                return new C1298cw(runnable);
        }
    }
}
