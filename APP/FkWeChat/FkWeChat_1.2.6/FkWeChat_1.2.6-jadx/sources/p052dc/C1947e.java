package p052dc;

import java.util.Iterator;
import java.util.Map;
import p024b9.AbstractC1061t;
import p376zd.C9987e;

/* JADX INFO: renamed from: dc.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1947e {

    /* JADX INFO: renamed from: a */
    public static final C1947e f5423a = new C1947e();

    /* JADX INFO: renamed from: a */
    public final boolean m7056a(Map map, Map.Entry entry) {
        map.getClass();
        entry.getClass();
        Object obj = map.get(entry.getKey());
        return obj != null ? AbstractC1061t.m3842c(obj, entry.getValue()) : entry.getValue() == null && map.containsKey(entry.getKey());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7057b(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        if (map.size() != map2.size()) {
            C9987e.m38645a("Failed requirement.");
            return false;
        }
        if (map2.isEmpty()) {
            return true;
        }
        Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            if (!f5423a.m7056a(map, (Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m7058c(Map map) {
        map.getClass();
        return map.entrySet().hashCode();
    }
}
