package com.android.dx.io.instructions;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
