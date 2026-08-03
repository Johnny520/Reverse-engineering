package p000;

import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: cF */
/* JADX INFO: loaded from: classes.dex */
public final class C1256cF implements Iterable, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f4256a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public final ReentrantReadWriteLock f4257b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: a */
    public final Object m2371a(Object obj) {
        ReentrantReadWriteLock.ReadLock lock = this.f4257b.readLock();
        lock.lock();
        try {
            return this.f4256a.get(obj);
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m2372b(Object obj, InterfaceC0884Ui interfaceC0884Ui) {
        Object objM2371a;
        Object objM2371a2 = m2371a(obj);
        if (objM2371a2 != null) {
            return objM2371a2;
        }
        synchronized (obj) {
            objM2371a = m2371a(obj);
            if (objM2371a == null) {
                objM2371a = interfaceC0884Ui.mo6a();
                ReentrantReadWriteLock.WriteLock writeLock = this.f4257b.writeLock();
                writeLock.lock();
                try {
                    this.f4256a.put(obj, objM2371a);
                    writeLock.unlock();
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
        }
        return objM2371a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4256a.entrySet().iterator();
    }
}
