package p185m8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p172l8.C4711r;

/* JADX INFO: renamed from: m8.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5113w0 extends AbstractC5111v0 {
    /* JADX INFO: renamed from: z */
    public static List m20792z(Map map) {
        map.getClass();
        if (map.size() == 0) {
            return AbstractC5114x.m20800o();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return AbstractC5114x.m20800o();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC5112w.m20789e(new C4711r(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C4711r(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C4711r(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
