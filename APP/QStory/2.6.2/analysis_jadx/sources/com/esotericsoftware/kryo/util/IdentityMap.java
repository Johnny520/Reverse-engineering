package com.esotericsoftware.kryo.util;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class IdentityMap<K, V> extends ObjectMap<K, V> {
    public IdentityMap() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.esotericsoftware.kryo.util.ObjectMap
    public <T extends K> V get(T t) {
        int iPlace = place(t);
        while (true) {
            K k = this.keyTable[iPlace];
            if (k == null) {
                return null;
            }
            if (k == t) {
                return this.valueTable[iPlace];
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    @Override // com.esotericsoftware.kryo.util.ObjectMap
    public int hashCode() {
        int iHashCode = this.size;
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                int iIdentityHashCode = System.identityHashCode(k) + iHashCode;
                V v = vArr[i];
                iHashCode = v != null ? v.hashCode() + iIdentityHashCode : iIdentityHashCode;
            }
        }
        return iHashCode;
    }

    @Override // com.esotericsoftware.kryo.util.ObjectMap
    public int locateKey(K k) {
        if (k == null) {
            C5919.m11249("key cannot be null.");
            return 0;
        }
        K[] kArr = this.keyTable;
        int iPlace = place(k);
        while (true) {
            K k2 = kArr[iPlace];
            if (k2 == null) {
                return -(iPlace + 1);
            }
            if (k2 == k) {
                return iPlace;
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    @Override // com.esotericsoftware.kryo.util.ObjectMap
    public int place(K k) {
        return this.mask & System.identityHashCode(k);
    }

    public IdentityMap(int i) {
        super(i);
    }

    public IdentityMap(int i, float f) {
        super(i, f);
    }

    public IdentityMap(IdentityMap<K, V> identityMap) {
        super(identityMap);
    }

    @Override // com.esotericsoftware.kryo.util.ObjectMap
    public V get(K k, V v) {
        int iPlace = place(k);
        while (true) {
            K k2 = this.keyTable[iPlace];
            if (k2 == null) {
                return v;
            }
            if (k2 == k) {
                return this.valueTable[iPlace];
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }
}
