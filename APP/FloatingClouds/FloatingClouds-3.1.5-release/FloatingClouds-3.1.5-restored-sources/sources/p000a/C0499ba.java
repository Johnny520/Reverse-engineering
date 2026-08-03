package p000a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: a.ba */
/* JADX INFO: loaded from: classes.dex */
public class C0499ba extends C0480aa {
    /* JADX INFO: renamed from: E */
    public static <K, V> Map<K, V> m1229E(C0710mc<? extends K, ? extends V>... c0710mcArr) {
        if (c0710mcArr.length <= 0) {
            return C0457Z5.f1721a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0480aa.m1169C(c0710mcArr.length));
        m1230F(linkedHashMap, c0710mcArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: F */
    public static final void m1230F(LinkedHashMap linkedHashMap, C0710mc[] c0710mcArr) {
        for (C0710mc c0710mc : c0710mcArr) {
            linkedHashMap.put(c0710mc.f2680a, c0710mc.f2681b);
        }
    }

    /* JADX INFO: renamed from: G */
    public static Map m1231G(ArrayList arrayList) {
        C0457Z5 c0457z5 = C0457Z5.f1721a;
        int size = arrayList.size();
        if (size == 0) {
            return c0457z5;
        }
        if (size == 1) {
            return C0480aa.m1170D((C0710mc) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0480aa.m1169C(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0710mc c0710mc = (C0710mc) it.next();
            linkedHashMap.put(c0710mc.f2680a, c0710mc.f2681b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: H */
    public static Map m1232H(LinkedHashMap linkedHashMap) {
        C0631i9.m1482e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            return C0457Z5.f1721a;
        }
        if (size != 1) {
            return m1233I(linkedHashMap);
        }
        C0631i9.m1482e(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C0631i9.m1481d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: I */
    public static LinkedHashMap m1233I(Map map) {
        C0631i9.m1482e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
