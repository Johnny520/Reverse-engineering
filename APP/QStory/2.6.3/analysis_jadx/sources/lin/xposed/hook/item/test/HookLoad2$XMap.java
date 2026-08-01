package lin.xposed.hook.item.test;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class HookLoad2$XMap extends LinkedHashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public int size() {
        int size = super.size();
        if (size == 9) {
            return 8;
        }
        return size;
    }
}
