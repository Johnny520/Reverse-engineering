package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
public final class C3897<K, V> implements Yue.InterfaceC3896<K, V> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Map<K, V> f12441;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<K, V> f12442;

    public C3897(@Yue.InterfaceC4418 java.util.Map<K, ? extends V> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super K, ? extends V> r3) {
            r1 = this;
            java.lang.String r0 = "map"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "default"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f12441 = r2
            r1.f12442 = r3
            return
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.m15709()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.Map
    @Yue.InterfaceC4543
    public V get(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // Yue.InterfaceC3896
    @Yue.InterfaceC4418
    public java.util.Map<K, V> getMap() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.f12441
            return r0
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.m15710()
            return r0
    }

    @Override // java.util.Map
    public V put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.m15711()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.m15712()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.Set<java.util.Map.Entry<K, V>> m15709() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.Set<K> m15710() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m15711() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            int r0 = r0.size()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Collection<V> m15712() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Collection r0 = r0.values()
            return r0
    }

    @Override // Yue.InterfaceC3896
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public V mo15708(K r3) {
            r2 = this;
            java.util.Map r0 = r2.getMap()
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L16
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L16
            Yue.ۥۣ۠ۡ۟<K, V> r0 = r2.f12442
            java.lang.Object r1 = r0.invoke(r3)
        L16:
            return r1
    }
}
