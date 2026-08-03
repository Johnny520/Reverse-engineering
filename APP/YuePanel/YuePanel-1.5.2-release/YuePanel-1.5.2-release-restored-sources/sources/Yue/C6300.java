package Yue;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۡۡۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n*L\n101#1:105,6\n*E\n"})
public final class C6300<K, V> implements InterfaceC6299<K, V> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Map<K, V> f15895;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<K, V> f15896;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6300(@InterfaceC6399 Map<K, V> map, @InterfaceC6399 InterfaceC5124<? super K, ? extends V> interfaceC5124) {
        C5499.m17103(map, "map");
        C5499.m17103(interfaceC5124, "default");
        this.f15895 = map;
        this.f15896 = interfaceC5124;
    }

    @Override // java.util.Map
    public void clear() {
        getMap().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getMap().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m2775();
    }

    @Override // java.util.Map
    public boolean equals(@InterfaceC6489 Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    @InterfaceC6489
    public V get(Object obj) {
        return getMap().get(obj);
    }

    @Override // Yue.InterfaceC6299, Yue.InterfaceC5938
    @InterfaceC6399
    public Map<K, V> getMap() {
        return this.f15895;
    }

    @Override // java.util.Map
    public int hashCode() {
        return getMap().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m2776();
    }

    @Override // java.util.Map
    @InterfaceC6489
    public V put(K k, V v) {
        return getMap().put(k, v);
    }

    @Override // java.util.Map
    public void putAll(@InterfaceC6399 Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "from");
        getMap().putAll(map);
    }

    @Override // java.util.Map
    @InterfaceC6489
    public V remove(Object obj) {
        return getMap().remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m19609();
    }

    @InterfaceC6399
    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m19610();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public Set<Map.Entry<K, V>> m2775() {
        return getMap().entrySet();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public Set<K> m2776() {
        return getMap().keySet();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m19609() {
        return getMap().size();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Collection<V> m19610() {
        return getMap().values();
    }

    @Override // Yue.InterfaceC5938
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public V mo18558(K k) {
        Map<K, V> map = getMap();
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : this.f15896.invoke(k);
    }
}
