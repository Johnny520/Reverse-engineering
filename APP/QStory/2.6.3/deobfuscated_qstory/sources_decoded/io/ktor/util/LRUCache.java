package io.ktor.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B9\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/util/LRUCache;", "K", "V", "Ljava/util/LinkedHashMap;", "Lkotlin/Function1;", "supplier", "Lkotlin/飘花落叶言子楪兰苏哲世;", "close", "", "maxSize", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)V", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;", "I", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final InterfaceC6558 close;
    private final int maxSize;
    private final InterfaceC6558 supplier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LRUCache(InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, int i) {
        super(10, 0.75f, true);
        interfaceC6558.getClass();
        interfaceC65582.getClass();
        this.supplier = interfaceC6558;
        this.close = interfaceC65582;
        this.maxSize = i;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) getEntries();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object key) {
        if (this.maxSize == 0) {
            return (V) this.supplier.invoke(key);
        }
        synchronized (this) {
            V v = (V) super.get(key);
            if (v != null) {
                return v;
            }
            V v2 = (V) this.supplier.invoke(key);
            put(key, v2);
            return v2;
        }
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<? extends K, ? extends V> eldest) {
        eldest.getClass();
        boolean z = size() > this.maxSize;
        if (z) {
            this.close.invoke(eldest.getValue());
        }
        return z;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }
}
