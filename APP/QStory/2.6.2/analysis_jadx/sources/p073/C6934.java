package p073;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC4338;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6934 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f18507;

    public C6934(LinkedHashMap linkedHashMap) {
        this.f18507 = linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6934 m12203() {
        LinkedHashMap linkedHashMap = this.f18507;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4338.m8779(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C6924 c6924 = (C6924) entry.getValue();
            linkedHashMap2.put(key, new C6924(c6924.f18485, c6924.f18484, c6924.f18483, true, true));
        }
        return new C6934(linkedHashMap2);
    }
}
