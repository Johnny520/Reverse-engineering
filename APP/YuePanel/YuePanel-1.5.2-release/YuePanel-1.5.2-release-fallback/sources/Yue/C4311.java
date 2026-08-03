package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n*L\n101#1:105,6\n*E\n"})
public final class C4311<K, V> implements Yue.InterfaceC4310<K, V> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Map<K, V> f13649;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<K, V> f13650;

    public C4311(@Yue.InterfaceC4418 java.util.Map<K, V> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super K, ? extends V> r3) {
            r1 = this;
            java.lang.String r0 = "map"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "default"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f13649 = r2
            r1.f13650 = r3
            return
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            r0.clear()
            return
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
            java.util.Set r0 = r1.m16922()
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

    @Override // Yue.InterfaceC4310, Yue.InterfaceC3896
    @Yue.InterfaceC4418
    public java.util.Map<K, V> getMap() {
            r1 = this;
            java.util.Map<K, V> r0 = r1.f13649
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
            java.util.Set r0 = r1.m16923()
            return r0
    }

    @Override // java.util.Map
    @Yue.InterfaceC4543
    public V put(K r2, V r3) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public void putAll(@Yue.InterfaceC4418 java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "from"
            Yue.C3329.m13906(r2, r0)
            java.util.Map r0 = r1.getMap()
            r0.putAll(r2)
            return
    }

    @Override // java.util.Map
    @Yue.InterfaceC4543
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.m16924()
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
            java.util.Collection r0 = r1.m16925()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.Set<java.util.Map.Entry<K, V>> m16922() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.Set<K> m16923() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m16924() {
            r1 = this;
            java.util.Map r0 = r1.getMap()
            int r0 = r0.size()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Collection<V> m16925() {
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
            Yue.ۥۣ۠ۡ۟<K, V> r0 = r2.f13650
            java.lang.Object r1 = r0.invoke(r3)
        L16:
            return r1
    }
}
