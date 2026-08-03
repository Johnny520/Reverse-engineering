package org.luckypray.dexkit.util;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;

/* JADX INFO: loaded from: classes.dex */
public final class WeakCache<K, V> implements Iterable<Map.Entry<? extends K, ? extends V>>, InterfaceC0319a {
    private final Map<K, V> cache;
    private final ReentrantReadWriteLock lock;

    public WeakCache() {
        this.cache = new WeakHashMap();
        this.lock = new ReentrantReadWriteLock();
    }

    public final void clear() {
        ReentrantReadWriteLock.WriteLock r02 = this.lock.writeLock();
        AbstractC0307g.m702d(r02, "lock.writeLock()");
        r02.lock();
        this.cache.clear();     // Catch: Throwable -> L6
        r02.unlock();
        return;
    L6:
        th = move-exception;
        r02.unlock();
        throw th;
    }

    public final V get(K r3) {
        AbstractC0307g.m703e(r3, "key");
        ReentrantReadWriteLock.ReadLock r02 = this.lock.readLock();
        AbstractC0307g.m702d(r02, "lock.readLock()");
        r02.lock();
        V r32 = this.cache.get(r3);     // Catch: Throwable -> L6
        r02.unlock();
        return r32;
    L6:
        th = move-exception;
        r02.unlock();
        throw th;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.cache.entrySet().iterator();
    }

    public final V put(K r3, V r4) {
        AbstractC0307g.m703e(r3, "key");
        ReentrantReadWriteLock.WriteLock r02 = this.lock.writeLock();
        AbstractC0307g.m702d(r02, "lock.writeLock()");
        r02.lock();
        this.cache.put(r3, r4);     // Catch: Throwable -> L6
        r02.unlock();
        return r4;
    L6:
        th = move-exception;
        r02.unlock();
        throw th;
    }

    public final void remove(K r3) {
        AbstractC0307g.m703e(r3, "key");
        ReentrantReadWriteLock.WriteLock r02 = this.lock.writeLock();
        AbstractC0307g.m702d(r02, "lock.writeLock()");
        r02.lock();
        this.cache.remove(r3);     // Catch: Throwable -> L6
        r02.unlock();
        return;
    L6:
        th = move-exception;
        r02.unlock();
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V get(K r2, InterfaceC0275a r3) {
        AbstractC0307g.m703e(r2, "key");
        AbstractC0307g.m703e(r3, "block");
        V r02 = (V) get(r2);
        if (r02 != null) goto L15;
        monitor-enter(r2);
        V r03 = (V) get(r2);
        if (r03 != null) goto L11;
        r03 = (V) put(r2, r3.invoke());
    L11:
        monitor-exit(r2);
        return r03;
    L9:
        th = move-exception;
        throw th;
    L15:
        return r02;
    }
}
