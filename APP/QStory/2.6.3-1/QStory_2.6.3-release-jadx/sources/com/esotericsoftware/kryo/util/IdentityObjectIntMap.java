package com.esotericsoftware.kryo.util;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class IdentityObjectIntMap<K> extends ObjectIntMap<K> {
    public IdentityObjectIntMap() {
    }

    @Override // com.esotericsoftware.kryo.util.ObjectIntMap
    public int get(K k, int i) {
        int iPlace = place(k);
        while (true) {
            K k2 = this.keyTable[iPlace];
            if (k2 == null) {
                return i;
            }
            if (k2 == k) {
                return this.valueTable[iPlace];
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    @Override // com.esotericsoftware.kryo.util.ObjectIntMap
    public int hashCode() {
        int iIdentityHashCode = this.size;
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                iIdentityHashCode = System.identityHashCode(k) + iArr[i] + iIdentityHashCode;
            }
        }
        return iIdentityHashCode;
    }

    @Override // com.esotericsoftware.kryo.util.ObjectIntMap
    public int locateKey(K k) {
        if (k == null) {
            C6755.m11869("key cannot be null.");
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

    @Override // com.esotericsoftware.kryo.util.ObjectIntMap
    public int place(K k) {
        return this.mask & System.identityHashCode(k);
    }

    public IdentityObjectIntMap(int i) {
        super(i);
    }

    public IdentityObjectIntMap(int i, float f) {
        super(i, f);
    }

    public IdentityObjectIntMap(IdentityObjectIntMap<K> identityObjectIntMap) {
        super(identityObjectIntMap);
    }
}
