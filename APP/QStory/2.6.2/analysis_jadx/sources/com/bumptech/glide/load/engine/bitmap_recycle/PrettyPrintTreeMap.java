package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.activity.AbstractC0053;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sbM149 = AbstractC0053.m149("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            sbM149.append('{');
            sbM149.append(entry.getKey());
            sbM149.append(':');
            sbM149.append(entry.getValue());
            sbM149.append("}, ");
        }
        if (!isEmpty()) {
            sbM149.replace(sbM149.length() - 2, sbM149.length(), "");
        }
        sbM149.append(" )");
        return sbM149.toString();
    }
}
