package Yue;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
public final class C5939<K, V> implements InterfaceC5938<K, V> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Map<K, V> f14890;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<K, V> f14891;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5939(@InterfaceC6399 Map<K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super K, ? extends V> interfaceC5124) {
        C5499.m17103(map, "map");
        C5499.m17103(interfaceC5124, "default");
        this.f14890 = map;
        this.f14891 = interfaceC5124;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        return m2604();
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

    @Override // Yue.InterfaceC5938
    @InterfaceC6399
    public Map<K, V> getMap() {
        return this.f14890;
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
        return m2605();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m18559();
    }

    @InterfaceC6399
    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m18560();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public Set<Map.Entry<K, V>> m2604() {
        return getMap().entrySet();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public Set<K> m2605() {
        return getMap().keySet();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m18559() {
        return getMap().size();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Collection<V> m18560() {
        return getMap().values();
    }

    @Override // Yue.InterfaceC5938
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public V mo18558(K k) {
        Map<K, V> map = getMap();
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : this.f14891.invoke(k);
    }
}
