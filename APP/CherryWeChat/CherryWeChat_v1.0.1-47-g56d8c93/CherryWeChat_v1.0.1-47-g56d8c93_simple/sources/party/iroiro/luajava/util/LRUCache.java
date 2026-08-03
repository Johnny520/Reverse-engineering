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

        public Cache(int r4) {
            super(r4 + 1, 0.75f, true);
            this.maxEntries = r4;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> r2) {
            if (size() <= this.maxEntries) goto L6;
            return true;
        L6:
            return false;
        }
    }

    public LRUCache(int r3, int r4, int r5) {
        if (r5 <= 1) goto L12;
        if (Integer.bitCount(r5) != 1) goto L12;
        this.innerSize = r4;
        ArrayList r42 = new ArrayList(r5);
        int r0 = 0;
    L7:
        if (r0 >= r5) goto L9;
        r42.add(Collections.synchronizedMap(new Cache(r3)));
        r0 = r0 + 1;
        goto L7
    L9:
        this.cacheShards = Collections.unmodifiableList(r42);
        return;
    L12:
        throw new IllegalArgumentException("shards must be of 2^N");
    }

    private Map<K2, V> getInnerCache(K1 r4) {
        Map<K1, Map<K2, V>> r0 = this.cacheShards.get(r4.hashCode() & (this.cacheShards.size() - 1));
        Map<K2, V> r1 = r0.get(r4);
        if (r1 != null) goto L7;
        r1 = Collections.synchronizedMap(new Cache(this.innerSize));
        Map<K2, V> r42 = r0.putIfAbsent(r4, r1);
        if (r42 == null) goto L7;
        return r42;
    L7:
        return r1;
    }

    public V get(K1 r1, K2 r2) {
        return getInnerCache(r1).get(r2);
    }

    public void put(K1 r1, K2 r2, V r3) {
        getInnerCache(r1).putIfAbsent(r2, r3);
    }
}
