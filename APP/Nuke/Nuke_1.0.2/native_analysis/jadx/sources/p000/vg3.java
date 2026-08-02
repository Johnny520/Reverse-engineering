package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg3 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f11953a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f11954b;

    public /* synthetic */ vg3(String str, boolean z) {
        this.f11953a = str;
        this.f11954b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f11953a);
        thread.setDaemon(this.f11954b);
        return thread;
    }
}
