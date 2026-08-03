package Yue;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7783 {
    @InterfaceC6399
    @InterfaceC4367
    /* JADX INFO: renamed from: ۥ۟ */
    public static final AbstractC4746 m3882(final int i, @InterfaceC6399 final String str) {
        if (i >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return C4749.m14312(Executors.newScheduledThreadPool(i, new ThreadFactory() { // from class: Yue.ۥۢۡۢ۠
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return C7783.m24725(i, str, atomicInteger, runnable);
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i + " specified").toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Thread m24725(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + SignatureVisitor.SUPER + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    @InterfaceC6399
    @InterfaceC4367
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final AbstractC4746 m24726(@InterfaceC6399 String str) {
        return m3882(1, str);
    }
}
