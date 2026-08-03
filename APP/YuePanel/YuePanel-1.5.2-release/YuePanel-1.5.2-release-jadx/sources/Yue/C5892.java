package Yue;

import android.util.LruCache;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5892 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۤ$ۥ */
    @InterfaceC7507({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$1\n*L\n1#1,54:1\n*E\n"})
    public static final class C0893 extends AbstractC5673 implements InterfaceC5138<Object, Object, Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C0893 f14612 = new C0893();

        public C0893() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Integer invoke(@InterfaceC6399 Object obj, @InterfaceC6399 Object obj2) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۤ$ۥ۟ */
    @InterfaceC7507({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$2\n*L\n1#1,54:1\n*E\n"})
    public static final class C0894 extends AbstractC5673 implements InterfaceC5124<Object, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C0894 f14613 = new C0894();

        public C0894() {
            super(1);
        }

        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$3\n*L\n1#1,54:1\n*E\n"})
    public static final class C5893 extends AbstractC5673 implements InterfaceC5141<Boolean, Object, Object, Object, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C5893 f14614 = new C5893();

        public C5893() {
            super(4);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m18270(boolean z, @InterfaceC6399 Object obj, @InterfaceC6399 Object obj2, @InterfaceC6489 Object obj3) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5141
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
        public /* bridge */ /* synthetic */ C8107 mo15381(Boolean bool, Object obj, Object obj2, Object obj3) {
            m18270(bool.booleanValue(), obj, obj2, obj3);
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۨۤ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$4\n*L\n1#1,54:1\n*E\n"})
    public static final class C5894<K, V> extends LruCache<K, V> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5138<K, V, Integer> f1759;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ InterfaceC5124<K, V> f1760;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5141<Boolean, K, V, V, C8107> f14615;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super K, ? super V, java.lang.Integer> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super K, ? extends V> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۢۥ<? super java.lang.Boolean, ? super K, ? super V, ? super V, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5894(int i, InterfaceC5138<? super K, ? super V, Integer> interfaceC5138, InterfaceC5124<? super K, ? extends V> interfaceC5124, InterfaceC5141<? super Boolean, ? super K, ? super V, ? super V, C8107> interfaceC5141) {
            super(i);
            this.f1759 = interfaceC5138;
            this.f1760 = interfaceC5124;
            this.f14615 = interfaceC5141;
        }

        @Override // android.util.LruCache
        @InterfaceC6489
        public V create(@InterfaceC6399 K k) {
            return this.f1760.invoke(k);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, @InterfaceC6399 K k, @InterfaceC6399 V v, @InterfaceC6489 V v2) {
            this.f14615.mo15381(Boolean.valueOf(z), k, v, v2);
        }

        @Override // android.util.LruCache
        public int sizeOf(@InterfaceC6399 K k, @InterfaceC6399 V v) {
            return this.f1759.invoke(k, v).intValue();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <K, V> LruCache<K, V> m2560(int i, @InterfaceC6399 InterfaceC5138<? super K, ? super V, Integer> interfaceC5138, @InterfaceC6399 InterfaceC5124<? super K, ? extends V> interfaceC5124, @InterfaceC6399 InterfaceC5141<? super Boolean, ? super K, ? super V, ? super V, C8107> interfaceC5141) {
        return new C5894(i, interfaceC5138, interfaceC5124, interfaceC5141);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ LruCache m2561(int i, InterfaceC5138 interfaceC5138, InterfaceC5124 interfaceC5124, InterfaceC5141 interfaceC5141, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC5138 = C0893.f14612;
        }
        if ((i2 & 4) != 0) {
            interfaceC5124 = C0894.f14613;
        }
        if ((i2 & 8) != 0) {
            interfaceC5141 = C5893.f14614;
        }
        return new C5894(i, interfaceC5138, interfaceC5124, interfaceC5141);
    }
}
