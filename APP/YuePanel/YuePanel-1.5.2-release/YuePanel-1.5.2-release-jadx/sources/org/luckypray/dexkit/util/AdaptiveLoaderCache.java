package org.luckypray.dexkit.util;

import Yue.C4335;
import Yue.C4750;
import Yue.C5499;
import Yue.C6659;
import Yue.C8107;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import com.android.p001dx.rop.code.RegisterSpec;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003$%&B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R6\u0010\"\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u001e\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;", "", "K", C4750.f10496, "", "weakValue", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Z)V", RegisterSpec.PREFIX, "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;", "wrap", "(Ljava/lang/Object;)Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;", "Ljava/lang/ClassLoader;", "loader", C6659.f17103, "Lkotlin/Function0;", "producer", "get", "(Ljava/lang/ClassLoader;Ljava/lang/Object;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;", "LYue/ۥۣۢ۠ۤ;", "clear", "()V", "(Ljava/lang/ClassLoader;)V", "Z", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/lang/ref/WeakReference;", "singleLoaderRef", "Ljava/lang/ref/WeakReference;", "", "singleMap", "Ljava/util/Map;", "Ljava/util/WeakHashMap;", "multi", "Ljava/util/WeakHashMap;", "Ref", "StrongRef", "WeakRef", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
@InterfaceC7507({"SMAP\nAdaptiveLoaderCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdaptiveLoaderCache.kt\norg/luckypray/dexkit/util/AdaptiveLoaderCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n355#2,7:127\n1#3:134\n*S KotlinDebug\n*F\n+ 1 AdaptiveLoaderCache.kt\norg/luckypray/dexkit/util/AdaptiveLoaderCache\n*L\n90#1:127,7\n*E\n"})
public final class AdaptiveLoaderCache<K, V> {

    @InterfaceC6399
    private final ReentrantReadWriteLock lock;

    @InterfaceC6489
    private WeakHashMap<ClassLoader, Map<K, Ref<V>>> multi;

    @InterfaceC6489
    private WeakReference<ClassLoader> singleLoaderRef;

    @InterfaceC6399
    private Map<K, Ref<V>> singleMap;
    private final boolean weakValue;

    @InterfaceC6211(m2698d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m2699d2 = {"Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;", C4750.f10496, "", "get", "()Ljava/lang/Object;", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public interface Ref<V> {
        @InterfaceC6489
        V get();
    }

    @InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0002\u0010\u0005J\r\u0010\u0007\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\bR\u0010\u0010\u0004\u001a\u00028\u0002X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\t"}, m2699d2 = {"Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;", C4750.f10496, "", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;", RegisterSpec.PREFIX, "(Ljava/lang/Object;)V", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "get", "()Ljava/lang/Object;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class StrongRef<V> implements Ref<V> {

        /* JADX INFO: renamed from: v */
        @InterfaceC6399
        private final V f4236v;

        public StrongRef(@InterfaceC6399 V v) {
            C5499.m17103(v, RegisterSpec.PREFIX);
            this.f4236v = v;
        }

        @Override // org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref
        @InterfaceC6399
        public V get() {
            return this.f4236v;
        }
    }

    @InterfaceC6211(m2698d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\u0004\u0018\u00018\u0002H\u0016¢\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00018\u00028\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m2699d2 = {"Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;", C4750.f10496, "", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;", RegisterSpec.PREFIX, "(Ljava/lang/Object;)V", "ref", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "get", "()Ljava/lang/Object;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class WeakRef<V> implements Ref<V> {

        @InterfaceC6399
        private final WeakReference<V> ref;

        public WeakRef(@InterfaceC6399 V v) {
            C5499.m17103(v, RegisterSpec.PREFIX);
            this.ref = new WeakReference<>(v);
        }

        @Override // org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref
        @InterfaceC6489
        public V get() {
            return this.ref.get();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AdaptiveLoaderCache() {
        this(false, 1, null);
    }

    private final Ref<V> wrap(V v) {
        return this.weakValue ? new WeakRef(v) : new StrongRef(v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void clear() {
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        C5499.m17102(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            WeakHashMap<ClassLoader, Map<K, Ref<V>>> weakHashMap = this.multi;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            this.multi = null;
            this.singleLoaderRef = null;
            this.singleMap.clear();
            C8107 c8107 = C8107.f3222;
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    @InterfaceC6399
    public final V get(@InterfaceC6399 ClassLoader loader, @InterfaceC6399 K key, @InterfaceC6399 InterfaceC5122<? extends V> producer) {
        Ref<V> ref;
        V v;
        Map<K, Ref<V>> map;
        V v2;
        Ref<V> ref2;
        V v3;
        C5499.m17103(loader, "loader");
        C5499.m17103(key, C6659.f17103);
        C5499.m17103(producer, "producer");
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        C5499.m17102(lock, "lock.readLock()");
        lock.lock();
        try {
            WeakHashMap<ClassLoader, Map<K, Ref<V>>> weakHashMap = this.multi;
            if (weakHashMap == null) {
                WeakReference<ClassLoader> weakReference = this.singleLoaderRef;
                if ((weakReference != null ? weakReference.get() : null) == loader && (ref2 = this.singleMap.get(key)) != null && (v3 = ref2.get()) != null) {
                    lock.unlock();
                    return v3;
                }
            } else {
                Map<K, Ref<V>> map2 = weakHashMap.get(loader);
                if (map2 != null && (ref = map2.get(key)) != null && (v = ref.get()) != null) {
                    lock.unlock();
                    return v;
                }
            }
            C8107 c8107 = C8107.f3222;
            lock.unlock();
            ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
            C5499.m17102(writeLock, "lock.writeLock()");
            writeLock.lock();
            try {
                WeakHashMap<ClassLoader, Map<K, Ref<V>>> weakHashMap2 = this.multi;
                if (weakHashMap2 == null) {
                    WeakReference<ClassLoader> weakReference2 = this.singleLoaderRef;
                    ClassLoader classLoader = weakReference2 != null ? weakReference2.get() : null;
                    if (classLoader == null) {
                        this.singleLoaderRef = new WeakReference<>(loader);
                        this.singleMap.clear();
                    } else if (classLoader != loader) {
                        weakHashMap2 = new WeakHashMap<>();
                        weakHashMap2.put(classLoader, this.singleMap);
                        weakHashMap2.put(loader, new HashMap());
                        this.multi = weakHashMap2;
                        this.singleLoaderRef = null;
                        this.singleMap = new HashMap();
                    }
                }
                if (weakHashMap2 != null) {
                    Map<K, Ref<V>> map3 = weakHashMap2.get(loader);
                    if (map3 == null) {
                        map3 = new HashMap<>();
                        weakHashMap2.put(loader, map3);
                    }
                    map = map3;
                } else {
                    map = this.singleMap;
                }
                Ref<V> ref3 = map.get(key);
                if (ref3 != null && (v2 = ref3.get()) != null) {
                    writeLock.unlock();
                    return v2;
                }
                V vInvoke = producer.invoke();
                C5499.m17102(map, "targetMap");
                map.put(key, wrap(vInvoke));
                writeLock.unlock();
                return vInvoke;
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AdaptiveLoaderCache(boolean z) {
        this.weakValue = z;
        this.lock = new ReentrantReadWriteLock();
        this.singleMap = new HashMap();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:6) call: org.luckypray.dexkit.util.AdaptiveLoaderCache.<init>(boolean):void type: THIS */
    public /* synthetic */ AdaptiveLoaderCache(boolean z, int i, C4335 c4335) {
        this((i & 1) != 0 ? true : z);
    }

    public final void clear(@InterfaceC6399 ClassLoader loader) {
        C5499.m17103(loader, "loader");
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        C5499.m17102(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            WeakHashMap<ClassLoader, Map<K, Ref<V>>> weakHashMap = this.multi;
            if (weakHashMap != null) {
                weakHashMap.remove(loader);
            }
            WeakHashMap<ClassLoader, Map<K, Ref<V>>> weakHashMap2 = this.multi;
            if (weakHashMap2 != null && weakHashMap2.isEmpty()) {
                this.multi = null;
            }
            WeakReference<ClassLoader> weakReference = this.singleLoaderRef;
            if ((weakReference != null ? weakReference.get() : null) == loader) {
                this.singleLoaderRef = null;
                this.singleMap.clear();
            }
            C8107 c8107 = C8107.f3222;
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }
}
