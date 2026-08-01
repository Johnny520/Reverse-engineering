package p073;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC4339;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6935 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f18502;

    public C6935(LinkedHashMap linkedHashMap) {
        this.f18502 = linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6935 m12231() {
        LinkedHashMap linkedHashMap = this.f18502;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4339.m8772(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C6925 c6925 = (C6925) entry.getValue();
            linkedHashMap2.put(key, new C6925(c6925.f18480, c6925.f18479, c6925.f18478, true, true));
        }
        return new C6935(linkedHashMap2);
    }
}
