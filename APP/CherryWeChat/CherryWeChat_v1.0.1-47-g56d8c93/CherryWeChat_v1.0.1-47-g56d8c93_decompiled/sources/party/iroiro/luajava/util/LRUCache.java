package party.iroiro.luajava.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LRUCache<K1, K2, V> {
    private final List<Map<K1, Map<K2, V>>> cacheShards;
    private final int innerSize;

    public static final class Cache<K, V> extends LinkedHashMap<K, V> {
        private final int maxEntries;

        public Cache(int i) {
            super(i + 1, 0.75f, true);
            this.maxEntries = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.maxEntries;
        }
    }

    public LRUCache(int i, int i2, int i3) {
        if (i3 <= 1 || Integer.bitCount(i3) != 1) {
            throw new IllegalArgumentException("shards must be of 2^N");
        }
        this.innerSize = i2;
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(Collections.synchronizedMap(new Cache(i)));
        }
        this.cacheShards = Collections.unmodifiableList(arrayList);
    }

    private Map<K2, V> getInnerCache(K1 k1) {
        Map<K2, V> mapPutIfAbsent;
        Map<K1, Map<K2, V>> map = this.cacheShards.get(k1.hashCode() & (this.cacheShards.size() - 1));
        Map<K2, V> mapSynchronizedMap = map.get(k1);
        return (mapSynchronizedMap != null || (mapPutIfAbsent = map.putIfAbsent(k1, (mapSynchronizedMap = Collections.synchronizedMap(new Cache(this.innerSize))))) == null) ? mapSynchronizedMap : mapPutIfAbsent;
    }

    public V get(K1 k1, K2 k2) {
        return getInnerCache(k1).get(k2);
    }

    public void put(K1 k1, K2 k2, V v) {
        getInnerCache(k1).putIfAbsent(k2, v);
    }
}
