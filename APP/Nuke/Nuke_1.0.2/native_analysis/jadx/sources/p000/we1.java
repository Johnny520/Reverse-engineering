package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class we1 extends xe1 {
    /* JADX INFO: renamed from: p0 */
    public static Object m5875p0(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: q0 */
    public static Map m5876q0(ow1... ow1VarArr) {
        if (ow1VarArr.length <= 0) {
            return ce0.f1492h;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.m6103U(ow1VarArr.length));
        m5878s0(linkedHashMap, ow1VarArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: r0 */
    public static LinkedHashMap m5877r0(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m5878s0(HashMap map, ow1[] ow1VarArr) {
        for (ow1 ow1Var : ow1VarArr) {
            map.put(ow1Var.f7862h, ow1Var.f7863i);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static List m5879t0(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        if (linkedHashMap.size() != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return AbstractC0179eu.m1434O(new ow1(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                arrayList.add(new ow1(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new ow1(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return be0.f819h;
    }

    /* JADX INFO: renamed from: u0 */
    public static Map m5880u0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return ce0.f1492h;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.m6103U(arrayList.size()));
            m5882w0(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        ow1 ow1Var = (ow1) arrayList.get(0);
        ow1Var.getClass();
        Map mapSingletonMap = Collections.singletonMap(ow1Var.f7862h, ow1Var.f7863i);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: v0 */
    public static Map m5881v0(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        int size = linkedHashMap.size();
        if (size == 0) {
            return ce0.f1492h;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: w0 */
    public static void m5882w0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ow1 ow1Var = (ow1) it.next();
            linkedHashMap.put(ow1Var.f7862h, ow1Var.f7863i);
        }
    }
}
