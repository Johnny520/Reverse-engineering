package com.android.dx.io.instructions;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class AddressMap {
    private final HashMap<Integer, Integer> map = new HashMap<>();

    public int get(int i) {
        Integer num = this.map.get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public void put(int i, int i2) {
        this.map.put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
