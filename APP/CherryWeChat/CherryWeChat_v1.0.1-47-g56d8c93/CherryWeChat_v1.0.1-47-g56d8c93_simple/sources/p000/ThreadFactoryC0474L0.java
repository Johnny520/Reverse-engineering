package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: L0 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0474L0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1570a;

    public /* synthetic */ ThreadFactoryC0474L0(int r1) {
        this.f1570a = r1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r4) {
        switch(this.f1570a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new C1298cw(r4);
    L7:
        return new C0885Uj(r4);
    L9:
        return new Thread(new RunnableC0431K0(0, r4), "glide-active-resources");
    }
}
