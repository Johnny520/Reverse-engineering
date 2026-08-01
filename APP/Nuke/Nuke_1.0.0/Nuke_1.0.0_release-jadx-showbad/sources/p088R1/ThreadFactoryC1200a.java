package p088R1;

import java.util.concurrent.ThreadFactory;
import p047I0.RunnableC0766v;

/* JADX INFO: renamed from: R1.a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1200a implements ThreadFactory {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC0766v(1, runnable), "glide-active-resources");
    }
}
