package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003$%&B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R6\u0010\"\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u001e\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;", "", "K", "V", "", "weakValue", "<init>", "(Z)V", "v", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;", "wrap", "(Ljava/lang/Object;)Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;", "Ljava/lang/ClassLoader;", "loader", "key", "Lkotlin/Function0;", "producer", "get", "(Ljava/lang/ClassLoader;Ljava/lang/Object;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;", "LYue/ۥۣۢ۠ۤ;", "clear", "()V", "(Ljava/lang/ClassLoader;)V", "Z", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/lang/ref/WeakReference;", "singleLoaderRef", "Ljava/lang/ref/WeakReference;", "", "singleMap", "Ljava/util/Map;", "Ljava/util/WeakHashMap;", "multi", "Ljava/util/WeakHashMap;", "Ref", "StrongRef", "WeakRef", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
@Yue.InterfaceC5840({"SMAP\nAdaptiveLoaderCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdaptiveLoaderCache.kt\norg/luckypray/dexkit/util/AdaptiveLoaderCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n355#2,7:127\n1#3:134\n*S KotlinDebug\n*F\n+ 1 AdaptiveLoaderCache.kt\norg/luckypray/dexkit/util/AdaptiveLoaderCache\n*L\n90#1:127,7\n*E\n"})
public final class AdaptiveLoaderCache<K, V> {

    @Yue.InterfaceC4418
    private final java.util.concurrent.locks.ReentrantReadWriteLock lock;

    @Yue.InterfaceC4543
    private java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref<V>>> multi;

    @Yue.InterfaceC4543
    private java.lang.ref.WeakReference<java.lang.ClassLoader> singleLoaderRef;

    @Yue.InterfaceC4418
    private java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref<V>> singleMap;
    private final boolean weakValue;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;", "V", "", "get", "()Ljava/lang/Object;", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Ref<V> {
        @Yue.InterfaceC4543
        V get();
    }

    @Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0002\u0010\u0005J\r\u0010\u0007\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\bR\u0010\u0010\u0004\u001a\u00028\u0002X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;", "V", "", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;", "v", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "get", "()Ljava/lang/Object;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class StrongRef<V> implements org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref<V> {

        @Yue.InterfaceC4418
        private final V v;

        public StrongRef(@Yue.InterfaceC4418 V r2) {
                r1 = this;
                java.lang.String r0 = "v"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.v = r2
                return
        }

        @Override // org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref
        @Yue.InterfaceC4418
        public V get() {
                r1 = this;
                V r0 = r1.v
                return r0
        }
    }

    @Yue.InterfaceC4201(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\u0004\u0018\u00018\u0002H\u0016¢\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00018\u00028\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;", "V", "", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;", "v", "(Ljava/lang/Object;)V", "ref", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "get", "()Ljava/lang/Object;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WeakRef<V> implements org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref<V> {

        @Yue.InterfaceC4418
        private final java.lang.ref.WeakReference<V> ref;

        public WeakRef(@Yue.InterfaceC4418 V r2) {
                r1 = this;
                java.lang.String r0 = "v"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.ref = r0
                return
        }

        @Override // org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref
        @Yue.InterfaceC4543
        public V get() {
                r1 = this;
                java.lang.ref.WeakReference<V> r0 = r1.ref
                java.lang.Object r0 = r0.get()
                return r0
        }
    }

    public AdaptiveLoaderCache() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public AdaptiveLoaderCache(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.weakValue = r1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r1.<init>()
            r0.lock = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.singleMap = r1
            return
    }

    public /* synthetic */ AdaptiveLoaderCache(boolean r1, int r2, Yue.C1769 r3) {
            r0 = this;
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L5
            r1 = r3
        L5:
            r0.<init>(r1)
            return
    }

    private final org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref<V> wrap(V r2) {
            r1 = this;
            boolean r0 = r1.weakValue
            if (r0 == 0) goto La
            org.luckypray.dexkit.util.AdaptiveLoaderCache$WeakRef r0 = new org.luckypray.dexkit.util.AdaptiveLoaderCache$WeakRef
            r0.<init>(r2)
            goto Lf
        La:
            org.luckypray.dexkit.util.AdaptiveLoaderCache$StrongRef r0 = new org.luckypray.dexkit.util.AdaptiveLoaderCache$StrongRef
            r0.<init>(r2)
        Lf:
            return r0
    }

    public final void clear() {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            java.lang.String r1 = "lock.writeLock()"
            Yue.C3329.m13905(r0, r1)
            r0.lock()
            java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>>> r1 = r2.multi     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            r1.clear()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L28
        L18:
            r1 = 0
            r2.multi = r1     // Catch: java.lang.Throwable -> L16
            r2.singleLoaderRef = r1     // Catch: java.lang.Throwable -> L16
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r1 = r2.singleMap     // Catch: java.lang.Throwable -> L16
            r1.clear()     // Catch: java.lang.Throwable -> L16
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return
        L28:
            r0.unlock()
            throw r1
    }

    public final void clear(@Yue.InterfaceC4418 java.lang.ClassLoader r5) {
            r4 = this;
            java.lang.String r0 = "loader"
            Yue.C3329.m13906(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            java.lang.String r1 = "lock.writeLock()"
            Yue.C3329.m13905(r0, r1)
            r0.lock()
            java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>>> r1 = r4.multi     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.lang.Object r1 = r1.remove(r5)     // Catch: java.lang.Throwable -> L1e
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r5 = move-exception
            goto L49
        L20:
            java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>>> r1 = r4.multi     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 == 0) goto L2e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            if (r1 != r3) goto L2e
            r4.multi = r2     // Catch: java.lang.Throwable -> L1e
        L2e:
            java.lang.ref.WeakReference<java.lang.ClassLoader> r1 = r4.singleLoaderRef     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L39
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1e
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch: java.lang.Throwable -> L1e
            goto L3a
        L39:
            r1 = r2
        L3a:
            if (r1 != r5) goto L43
            r4.singleLoaderRef = r2     // Catch: java.lang.Throwable -> L1e
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r5 = r4.singleMap     // Catch: java.lang.Throwable -> L1e
            r5.clear()     // Catch: java.lang.Throwable -> L1e
        L43:
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1e
            r0.unlock()
            return
        L49:
            r0.unlock()
            throw r5
    }

    @Yue.InterfaceC4418
    public final V get(@Yue.InterfaceC4418 java.lang.ClassLoader r6, @Yue.InterfaceC4418 K r7, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends V> r8) {
            r5 = this;
            java.lang.String r0 = "loader"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "producer"
            Yue.C3329.m13906(r8, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            java.lang.String r1 = "lock.readLock()"
            Yue.C3329.m13905(r0, r1)
            r0.lock()
            java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>>> r1 = r5.multi     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            if (r1 != 0) goto L48
            java.lang.ref.WeakReference<java.lang.ClassLoader> r1 = r5.singleLoaderRef     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L30
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L2d
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r6 = move-exception
            goto Lf5
        L30:
            r1 = r2
        L31:
            if (r1 != r6) goto L63
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r1 = r5.singleMap     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L2d
            org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref r1 = (org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref) r1     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L3e
            goto L63
        L3e:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L63
            r0.unlock()
            return r1
        L48:
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L2d
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L63
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L2d
            org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref r1 = (org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref) r1     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L59
            goto L63
        L59:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L63
            r0.unlock()
            return r1
        L63:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2d
            r0.unlock()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.lock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            java.lang.String r1 = "lock.writeLock()"
            Yue.C3329.m13905(r0, r1)
            r0.lock()
            java.util.WeakHashMap<java.lang.ClassLoader, java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>>> r1 = r5.multi     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto Lb6
            java.lang.ref.WeakReference<java.lang.ClassLoader> r3 = r5.singleLoaderRef     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L87
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L85
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3     // Catch: java.lang.Throwable -> L85
            goto L88
        L85:
            r6 = move-exception
            goto Lf1
        L87:
            r3 = r2
        L88:
            if (r3 != 0) goto L97
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L85
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L85
            r5.singleLoaderRef = r2     // Catch: java.lang.Throwable -> L85
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r2 = r5.singleMap     // Catch: java.lang.Throwable -> L85
            r2.clear()     // Catch: java.lang.Throwable -> L85
            goto Lb6
        L97:
            if (r3 == r6) goto Lb6
            java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r4 = r5.singleMap     // Catch: java.lang.Throwable -> L85
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L85
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L85
            r3.<init>()     // Catch: java.lang.Throwable -> L85
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> L85
            r5.multi = r1     // Catch: java.lang.Throwable -> L85
            r5.singleLoaderRef = r2     // Catch: java.lang.Throwable -> L85
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            r5.singleMap = r2     // Catch: java.lang.Throwable -> L85
        Lb6:
            if (r1 == 0) goto Lc9
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L85
            if (r2 != 0) goto Lc6
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> L85
        Lc6:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L85
            goto Lcb
        Lc9:
            java.util.Map<K, org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref<V>> r2 = r5.singleMap     // Catch: java.lang.Throwable -> L85
        Lcb:
            java.lang.Object r6 = r2.get(r7)     // Catch: java.lang.Throwable -> L85
            org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref r6 = (org.luckypray.dexkit.util.AdaptiveLoaderCache.Ref) r6     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto Ldd
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto Ldd
            r0.unlock()
            return r6
        Ldd:
            java.lang.Object r6 = r8.invoke()     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = "targetMap"
            Yue.C3329.m13905(r2, r8)     // Catch: java.lang.Throwable -> L85
            org.luckypray.dexkit.util.AdaptiveLoaderCache$Ref r8 = r5.wrap(r6)     // Catch: java.lang.Throwable -> L85
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L85
            r0.unlock()
            return r6
        Lf1:
            r0.unlock()
            throw r6
        Lf5:
            r0.unlock()
            throw r6
    }
}
