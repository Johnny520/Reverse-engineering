package org.luckypray.dexkit.util;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.AbstractC0431r2;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AdaptiveLoaderCache<K, V> {
    private final ReentrantReadWriteLock lock;
    private WeakHashMap<ClassLoader, Map<K, Ref<V>>> multi;
    private WeakReference<ClassLoader> singleLoaderRef;
    private Map<K, Ref<V>> singleMap;
    private final boolean weakValue;

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public interface Ref<V> {
        V get();
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class StrongRef<V> implements Ref<V> {

        /* JADX INFO: renamed from: v */
        private final V f667v;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public StrongRef(V v) {
            v.getClass();
            this.f667v = v;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref
        public V get() {
            return this.f667v;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class WeakRef<V> implements Ref<V> {
        private final WeakReference<V> ref;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public WeakRef(V v) {
            v.getClass();
            this.ref = new WeakReference<>(v);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref
        public V get() {
            return this.ref.get();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AdaptiveLoaderCache(boolean z) {
        this.weakValue = z;
        this.lock = new ReentrantReadWriteLock();
        this.singleMap = new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Ref<V> wrap(V v) {
        return this.weakValue ? new WeakRef(v) : new StrongRef(v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void clear(ClassLoader classLoader) {
        classLoader.getClass();
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        writeLock.getClass();
        writeLock.lock();
        try {
            WeakHashMap<ClassLoader, Map<K, Ref<V>>> weakHashMap = this.multi;
            if (weakHashMap != null) {
                weakHashMap.remove(classLoader);
            }
            WeakHashMap<ClassLoader, Map<K, Ref<V>>> weakHashMap2 = this.multi;
            if (weakHashMap2 != null && weakHashMap2.isEmpty()) {
                this.multi = null;
            }
            WeakReference<ClassLoader> weakReference = this.singleLoaderRef;
            if ((weakReference != null ? weakReference.get() : null) == classLoader) {
                this.singleLoaderRef = null;
                this.singleMap.clear();
            }
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, INVOKE, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO, INVOKE, INVOKE, IGET, INVOKE, INVOKE, INVOKE] complete}, expected: {[GOTO, INVOKE, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    public final V get(ClassLoader classLoader, K k, InterfaceC0279j5 interfaceC0279j5) {
        Ref<V> ref;
        V v;
        Map<K, Ref<V>> map;
        V v2;
        Ref<V> ref2;
        V v3;
        classLoader.getClass();
        k.getClass();
        interfaceC0279j5.getClass();
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.getClass();
        lock.lock();
        try {
            WeakHashMap<ClassLoader, Map<K, Ref<V>>> weakHashMap = this.multi;
            if (weakHashMap == null) {
                WeakReference<ClassLoader> weakReference = this.singleLoaderRef;
                if ((weakReference != null ? weakReference.get() : null) == classLoader && (ref2 = this.singleMap.get(k)) != null && (v3 = ref2.get()) != null) {
                    lock.unlock();
                    return v3;
                }
            } else {
                Map<K, Ref<V>> map2 = weakHashMap.get(classLoader);
                if (map2 != null && (ref = map2.get(k)) != null && (v = ref.get()) != null) {
                    lock.unlock();
                    return v;
                }
            }
            lock.unlock();
            ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
            writeLock.getClass();
            writeLock.lock();
            try {
                WeakHashMap<ClassLoader, Map<K, Ref<V>>> weakHashMap2 = this.multi;
                if (weakHashMap2 == null) {
                    WeakReference<ClassLoader> weakReference2 = this.singleLoaderRef;
                    ClassLoader classLoader2 = weakReference2 != null ? weakReference2.get() : null;
                    if (classLoader2 == null) {
                        this.singleLoaderRef = new WeakReference<>(classLoader);
                        this.singleMap.clear();
                    } else if (classLoader2 != classLoader) {
                        weakHashMap2 = new WeakHashMap<>();
                        weakHashMap2.put(classLoader2, this.singleMap);
                        weakHashMap2.put(classLoader, new HashMap());
                        this.multi = weakHashMap2;
                        this.singleLoaderRef = null;
                        this.singleMap = new HashMap();
                    }
                }
                if (weakHashMap2 != null) {
                    Map<K, Ref<V>> map3 = weakHashMap2.get(classLoader);
                    if (map3 == null) {
                        map3 = new HashMap<>();
                        weakHashMap2.put(classLoader, map3);
                    }
                    map = map3;
                } else {
                    map = this.singleMap;
                }
                Ref<V> ref3 = map.get(k);
                if (ref3 != null && (v2 = ref3.get()) != null) {
                    writeLock.unlock();
                    return v2;
                }
                V v4 = (V) interfaceC0279j5.invoke();
                map.put(k, wrap(v4));
                writeLock.unlock();
                return v4;
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public AdaptiveLoaderCache() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:22) call: org.luckypray.dexkit.util.AdaptiveLoaderCache.<init>(boolean):void type: THIS */
    public /* synthetic */ AdaptiveLoaderCache(boolean z, int i, AbstractC0431r2 abstractC0431r2) {
        this((i & 1) != 0 ? true : z);
    }

    public final void clear() {
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        writeLock.getClass();
        writeLock.lock();
        try {
            WeakHashMap<ClassLoader, Map<K, Ref<V>>> weakHashMap = this.multi;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            this.multi = null;
            this.singleLoaderRef = null;
            this.singleMap.clear();
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }
}
