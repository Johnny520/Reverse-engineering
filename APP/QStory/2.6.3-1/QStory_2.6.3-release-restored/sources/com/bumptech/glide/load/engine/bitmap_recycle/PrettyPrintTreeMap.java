package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.activity.AbstractC0900;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sbM700 = AbstractC0900.m700("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            sbM700.append('{');
            sbM700.append(entry.getKey());
            sbM700.append(':');
            sbM700.append(entry.getValue());
            sbM700.append("}, ");
        }
        if (!isEmpty()) {
            sbM700.replace(sbM700.length() - 2, sbM700.length(), "");
        }
        sbM700.append(" )");
        return sbM700.toString();
    }
}
