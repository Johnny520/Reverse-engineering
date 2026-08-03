package tf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import p007a7.AbstractC0018a;
import p276sf.C3958e;

/* JADX INFO: renamed from: tf.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4178y extends AbstractC0018a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static Object m8436Y(Object obj, Map map) {
        map.getClass();
        if (map instanceof InterfaceC4177x) {
            return ((InterfaceC4177x) map).m8435b();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static LinkedHashMap m8437Z(C3958e... c3958eArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(m8438a0(c3958eArr.length));
        m8441d0(linkedHashMap, c3958eArr);
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static int m8438a0(int i9) {
        if (i9 < 0) {
            return i9;
        }
        if (i9 < 3) {
            return i9 + 1;
        }
        if (i9 < 1073741824) {
            return (int) ((i9 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static Map m8439b0(C3958e... c3958eArr) {
        if (c3958eArr.length <= 0) {
            return C4174u.f13711g;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m8438a0(c3958eArr.length));
        m8441d0(linkedHashMap, c3958eArr);
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static LinkedHashMap m8440c0(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static final void m8441d0(HashMap map, C3958e[] c3958eArr) {
        for (C3958e c3958e : c3958eArr) {
            map.put(c3958e.f12961g, c3958e.f12962h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static Map m8442e0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C4174u.f13711g;
        }
        if (size == 1) {
            C3958e c3958e = (C3958e) arrayList.get(0);
            c3958e.getClass();
            Map mapSingletonMap = Collections.singletonMap(c3958e.f12961g, c3958e.f12962h);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m8438a0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3958e c3958e2 = (C3958e) it.next();
            linkedHashMap.put(c3958e2.f12961g, c3958e2.f12962h);
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static Map m8443f0(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return C4174u.f13711g;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
