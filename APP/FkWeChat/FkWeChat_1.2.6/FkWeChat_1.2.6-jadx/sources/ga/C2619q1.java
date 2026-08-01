package ga;

import java.util.LinkedHashMap;
import java.util.Map;
import p185m8.AbstractC5107t0;

/* JADX INFO: renamed from: ga.q1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2619q1 {

    /* JADX INFO: renamed from: a */
    public final Map f6938a;

    public C2619q1(Map map) {
        map.getClass();
        this.f6938a = map;
    }

    /* JADX INFO: renamed from: a */
    public final C2619q1 m9307a() {
        Map map = this.f6938a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5107t0.m20763e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C2590h.m9248c((C2590h) entry.getValue(), null, null, false, true, 7, null));
        }
        return new C2619q1(linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final Map m9308b() {
        return this.f6938a;
    }
}
