package p102U1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p027E4.RunnableC0338y;

/* JADX INFO: renamed from: U1.c */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1473c implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactoryC1472b f5154a;

    /* JADX INFO: renamed from: b */
    public final String f5155b;

    /* JADX INFO: renamed from: d */
    public final boolean f5157d;

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f5158e = new AtomicInteger();

    /* JADX INFO: renamed from: c */
    public final C1474d f5156c = C1474d.f5159a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ThreadFactoryC1473c(ThreadFactoryC1472b threadFactoryC1472b, String str, boolean z5) {
        this.f5154a = threadFactoryC1472b;
        this.f5155b = str;
        this.f5157d = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC0338y runnableC0338y = new RunnableC0338y(this, runnable, 1);
        this.f5154a.getClass();
        C1471a c1471a = new C1471a(runnableC0338y);
        c1471a.setName("glide-" + this.f5155b + "-thread-" + this.f5158e.getAndIncrement());
        return c1471a;
    }
}
