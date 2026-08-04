package yyds;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲁᲈᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2366 extends AbstractC0395 {
    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static Map m4381(Map map) {
        int size = map.size();
        if (size == 0) {
            return C0704.f3312;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static int m4382(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static Map m4383(List list) {
        int size = list.size();
        if (size == 0) {
            return C0704.f3312;
        }
        if (size == 1) {
            Pair pair = (Pair) list.get(0);
            return Collections.singletonMap(pair.getFirst(), pair.getSecond());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m4382(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            linkedHashMap.put(pair2.component1(), pair2.component2());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static final void m4384(LinkedHashMap linkedHashMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            linkedHashMap.put(pair.component1(), pair.component2());
        }
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static Map m4385(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return C0704.f3312;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m4382(pairArr.length));
        m4384(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static Object m4386(LinkedHashMap linkedHashMap, Object obj) {
        Object obj2 = linkedHashMap.get(obj);
        if (obj2 != null || linkedHashMap.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
