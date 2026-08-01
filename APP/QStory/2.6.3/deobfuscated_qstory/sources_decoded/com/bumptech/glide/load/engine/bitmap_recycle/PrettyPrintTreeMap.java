package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.activity.AbstractC0053;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sbM140 = AbstractC0053.m140("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            sbM140.append('{');
            sbM140.append(entry.getKey());
            sbM140.append(':');
            sbM140.append(entry.getValue());
            sbM140.append("}, ");
        }
        if (!isEmpty()) {
            sbM140.replace(sbM140.length() - 2, sbM140.length(), "");
        }
        sbM140.append(" )");
        return sbM140.toString();
    }
}
