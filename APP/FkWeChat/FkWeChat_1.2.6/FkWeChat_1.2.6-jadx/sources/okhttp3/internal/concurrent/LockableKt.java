package okhttp3.internal.concurrent;

import kotlin.Metadata;
import okhttp3.internal.C5757c;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1057r;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\u0003\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u000b\u0010\u0003\u001a8\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m16758d2 = {"Lokhttp3/internal/concurrent/Lockable;", "Ll8/i0;", "wait", "(Lokhttp3/internal/concurrent/Lockable;)V", "notify", "notifyAll", _UrlKt.FRAGMENT_ENCODE_SET, "nanos", "awaitNanos", "(Lokhttp3/internal/concurrent/Lockable;J)V", "assertLockNotHeld", "assertLockHeld", "T", "Lkotlin/Function0;", "action", "withLock", "(Lokhttp3/internal/concurrent/Lockable;La9/a;)Ljava/lang/Object;", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class LockableKt {
    public static final void assertLockHeld(Lockable lockable) {
        lockable.getClass();
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(lockable)) {
            return;
        }
        C5757c.m23260a(Thread.currentThread().getName(), " MUST hold lock on ", lockable);
    }

    public static final void assertLockNotHeld(Lockable lockable) {
        lockable.getClass();
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(lockable)) {
            C5757c.m23260a(Thread.currentThread().getName(), " MUST NOT hold lock on ", lockable);
        }
    }

    public static final void awaitNanos(Lockable lockable, long j10) throws InterruptedException {
        lockable.getClass();
        long j11 = j10 / 1000000;
        long j12 = j10 - (1000000 * j11);
        if (j11 > 0 || j10 > 0) {
            lockable.wait(j11, (int) j12);
        }
    }

    public static final void notify(Lockable lockable) {
        lockable.getClass();
        lockable.notify();
    }

    public static final void notifyAll(Lockable lockable) {
        lockable.getClass();
        lockable.notifyAll();
    }

    public static final void wait(Lockable lockable) throws InterruptedException {
        lockable.getClass();
        lockable.wait();
    }

    public static final <T> T withLock(Lockable lockable, InterfaceC0173a interfaceC0173a) {
        T t10;
        lockable.getClass();
        interfaceC0173a.getClass();
        synchronized (lockable) {
            try {
                t10 = (T) interfaceC0173a.invoke();
                AbstractC1057r.m3834b(1);
            } catch (Throwable th) {
                AbstractC1057r.m3834b(1);
                AbstractC1057r.m3833a(1);
                throw th;
            }
        }
        AbstractC1057r.m3833a(1);
        return t10;
    }
}
