package org.luckypray.dexkit.util;

/* JADX INFO: compiled from: WeakCache.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0015\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ!\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0002\u0010\u0012J\u001b\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0014H\u0096\u0002J\u001b\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m115d2 = {"Lorg/luckypray/dexkit/util/WeakCache;", "K", "", "V", "", "", "()V", "cache", "", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "clear", "", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "iterator", "", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "(Ljava/lang/Object;)V", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class WeakCache<K, V> implements java.lang.Iterable<java.util.Map.Entry<? extends K, ? extends V>>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.Map<K, V> cache;
    private final java.util.concurrent.locks.ReentrantReadWriteLock lock;

    public WeakCache() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.cache = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.lock = r0
            return
    }

    public final void clear() {
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            java.lang.String r1 = "lock.writeLock()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            r1 = 0
            java.util.Map<K, V> r2 = r3.cache     // Catch: java.lang.Throwable -> L1d
            r2.clear()     // Catch: java.lang.Throwable -> L1d
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            return
        L1d:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final V get(K r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            java.lang.String r1 = "lock.readLock()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            r1 = 0
            java.util.Map<K, V> r2 = r3.cache     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L20
            r0.unlock()
            return r2
        L20:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final V get(K r6, kotlin.jvm.functions.Function0<? extends V> r7) {
            r5 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Object r0 = r5.get(r6)
            if (r0 != 0) goto L2e
            r0 = r5
            org.luckypray.dexkit.util.WeakCache r0 = (org.luckypray.dexkit.util.WeakCache) r0
            r1 = 0
            r2 = 0
            monitor-enter(r6)
            r3 = 0
            java.lang.Object r4 = r0.get(r6)     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L25
            java.lang.Object r4 = r7.invoke()     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = r0.put(r6, r4)     // Catch: java.lang.Throwable -> L2b
        L25:
            r2 = r4
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return r2
        L2b:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
        L2e:
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.cache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final V put(K r4, V r5) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            java.lang.String r1 = "lock.writeLock()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            r1 = 0
            java.util.Map<K, V> r2 = r3.cache     // Catch: java.lang.Throwable -> L22
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L22
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L22
            r0.unlock()
            return r5
        L22:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final void remove(K r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            java.lang.String r1 = "lock.writeLock()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            r1 = 0
            java.util.Map<K, V> r2 = r3.cache     // Catch: java.lang.Throwable -> L1f
            r2.remove(r4)     // Catch: java.lang.Throwable -> L1f
            r0.unlock()
            return
        L1f:
            r1 = move-exception
            r0.unlock()
            throw r1
    }
}
