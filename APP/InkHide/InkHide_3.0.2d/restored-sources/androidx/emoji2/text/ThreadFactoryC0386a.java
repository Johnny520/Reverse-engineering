package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: androidx.emoji2.text.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0386a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1164a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f1164a);
        thread.setPriority(10);
        return thread;
    }
}
