package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: t */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0714t implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10446a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f10446a) {
            case 0:
                Thread thread = new Thread(runnable, "Nuke-AIChat");
                thread.setDaemon(true);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable, "Nuke-ChatAutoReply");
                thread2.setDaemon(true);
                return thread2;
            default:
                Thread thread3 = new Thread(runnable, "NukeNativeWorker");
                thread3.setDaemon(true);
                return thread3;
        }
    }
}
