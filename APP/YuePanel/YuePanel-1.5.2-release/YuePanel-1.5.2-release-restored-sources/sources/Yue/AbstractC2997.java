package Yue;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
public abstract class AbstractC2997<K, V> extends AbstractMap<K, V> implements Map<K, V>, InterfaceC5597 {
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo64();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) mo65();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC6489
    public abstract V put(K k, V v);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return mo5810();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) m5811();
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract Set mo64();

    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ Set<Object> mo65() {
        return super.keySet();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public /* bridge */ int mo5810() {
        return super.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public /* bridge */ Collection<Object> m5811() {
        return super.values();
    }
}
