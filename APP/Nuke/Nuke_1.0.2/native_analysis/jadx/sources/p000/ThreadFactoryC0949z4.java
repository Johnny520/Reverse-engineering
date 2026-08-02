package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: z4 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0949z4 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13716a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f13716a) {
            case 0:
                return new Thread(new RunnableC0910y4(0, runnable), "glide-active-resources");
            default:
                return new C0809vg(runnable);
        }
    }
}
