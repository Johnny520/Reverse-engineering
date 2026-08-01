package p123Y3;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: Y3.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1775f implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f6074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f6075b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ThreadFactoryC1775f(String str, boolean z5) {
        this.f6074a = str;
        this.f6075b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f6074a);
        thread.setDaemon(this.f6075b);
        return thread;
    }
}
