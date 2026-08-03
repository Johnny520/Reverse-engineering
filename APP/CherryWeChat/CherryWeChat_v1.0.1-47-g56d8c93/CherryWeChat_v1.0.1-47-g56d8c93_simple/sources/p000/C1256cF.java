package p000;

import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: cF */
/* JADX INFO: loaded from: classes.dex */
public final class C1256cF implements Iterable, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f4256a;

    /* JADX INFO: renamed from: b */
    public final ReentrantReadWriteLock f4257b;

    public C1256cF() {
        this.f4256a = new WeakHashMap();
        this.f4257b = new ReentrantReadWriteLock();
    }

    /* JADX INFO: renamed from: a */
    public final Object m2371a(Object r3) {
        ReentrantReadWriteLock.ReadLock r0 = this.f4257b.readLock();
        r0.lock();
        Object r32 = this.f4256a.get(r3);     // Catch: Throwable -> L6
        r0.unlock();
        return r32;
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final Object m2372b(Object r3, InterfaceC0884Ui r4) {
        Object r0 = m2371a(r3);
        if (r0 != null) goto L19;
        monitor-enter(r3);
        Object r02 = m2371a(r3);     // Catch: Throwable -> L13
        if (r02 != null) goto L15;
        r02 = r4.mo6a();     // Catch: Throwable -> L13
        ReentrantReadWriteLock.WriteLock r42 = this.f4257b.writeLock();     // Catch: Throwable -> L13
        r42.lock();     // Catch: Throwable -> L13
        this.f4256a.put(r3, r02);     // Catch: Throwable -> L10
        r42.unlock();     // Catch: Throwable -> L13
        goto L15
    L10:
        th = move-exception;
        r42.unlock();     // Catch: Throwable -> L13
        throw th;     // Catch: Throwable -> L13
    L15:
        monitor-exit(r3);
        return r02;
    L13:
        th = move-exception;
        throw th;
    L19:
        return r0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4256a.entrySet().iterator();
    }
}
