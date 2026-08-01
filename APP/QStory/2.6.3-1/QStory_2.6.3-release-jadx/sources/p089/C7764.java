package p089;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC5171;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7764 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f18847;

    public C7764(LinkedHashMap linkedHashMap) {
        this.f18847 = linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7764 m12790() {
        LinkedHashMap linkedHashMap = this.f18847;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5171.m9331(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C7754 c7754 = (C7754) entry.getValue();
            linkedHashMap2.put(key, new C7754(c7754.f18825, c7754.f18824, c7754.f18823, true, true));
        }
        return new C7764(linkedHashMap2);
    }
}
