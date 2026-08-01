package p011F0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p006D.AbstractC0079h;
import p009E0.C0103c;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: F0.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0134v extends AbstractC0079h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static int m294Y(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static Map m295Z(C0103c c0103c) {
        AbstractC0223g.m418e(c0103c, "pair");
        Map mapSingletonMap = Collections.singletonMap(c0103c.f394a, c0103c.f395b);
        AbstractC0223g.m417d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static LinkedHashMap m296a0(C0103c... c0103cArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(m294Y(c0103cArr.length));
        m297b0(linkedHashMap, c0103cArr);
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static final void m297b0(LinkedHashMap linkedHashMap, C0103c[] c0103cArr) {
        for (C0103c c0103c : c0103cArr) {
            linkedHashMap.put(c0103c.f394a, c0103c.f395b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static Map m298c0(ArrayList arrayList) {
        C0132t c0132t = C0132t.f427a;
        int size = arrayList.size();
        if (size == 0) {
            return c0132t;
        }
        if (size == 1) {
            return m295Z((C0103c) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m294Y(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0103c c0103c = (C0103c) it.next();
            linkedHashMap.put(c0103c.f394a, c0103c.f395b);
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static LinkedHashMap m299d0(Map map) {
        AbstractC0223g.m418e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
