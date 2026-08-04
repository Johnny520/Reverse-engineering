package yyds;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: yyds.ᲀᲇᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2122 implements ThreadFactory {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f10471;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f10472;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AtomicInteger f10473 = new AtomicInteger();

    public ThreadFactoryC2122(ThreadFactoryC0710 threadFactoryC0710, String str, boolean z) {
        this.f10471 = str;
        this.f10472 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        C0840 c0840 = new C0840(new RunnableC2660(this, 3, runnable));
        c0840.setName("glide-" + this.f10471 + "-thread-" + this.f10473.getAndIncrement());
        return c0840;
    }
}
