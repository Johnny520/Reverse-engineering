package lin.xposed.hook.item.test;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
