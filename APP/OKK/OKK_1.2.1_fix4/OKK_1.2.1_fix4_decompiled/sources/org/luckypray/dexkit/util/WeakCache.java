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
    private final Map<K, V> cache = new WeakHashMap();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public final void clear() {
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        AbstractC0307g.m702d(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            this.cache.clear();
        } finally {
            writeLock.unlock();
        }
    }

    public final V get(K k2) {
        AbstractC0307g.m703e(k2, "key");
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        AbstractC0307g.m702d(lock, "lock.readLock()");
        lock.lock();
        try {
            return this.cache.get(k2);
        } finally {
            lock.unlock();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.cache.entrySet().iterator();
    }

    public final V put(K k2, V v2) {
        AbstractC0307g.m703e(k2, "key");
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        AbstractC0307g.m702d(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            this.cache.put(k2, v2);
            return v2;
        } finally {
            writeLock.unlock();
        }
    }

    public final void remove(K k2) {
        AbstractC0307g.m703e(k2, "key");
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        AbstractC0307g.m702d(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            this.cache.remove(k2);
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V get(K k2, InterfaceC0275a interfaceC0275a) {
        V v2;
        AbstractC0307g.m703e(k2, "key");
        AbstractC0307g.m703e(interfaceC0275a, "block");
        V v3 = (V) get(k2);
        if (v3 != null) {
            return v3;
        }
        synchronized (k2) {
            v2 = (V) get(k2);
            if (v2 == null) {
                v2 = (V) put(k2, interfaceC0275a.invoke());
            }
        }
        return v2;
    }
}
