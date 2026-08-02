package defpackage;

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
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object p0(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map q0(ow1... ow1VarArr) {
        if (ow1VarArr.length <= 0) {
            return ce0.h;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.U(ow1VarArr.length));
        s0(linkedHashMap, ow1VarArr);
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LinkedHashMap r0(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void s0(HashMap map, ow1[] ow1VarArr) {
        for (ow1 ow1Var : ow1VarArr) {
            map.put(ow1Var.h, ow1Var.i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List t0(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        if (linkedHashMap.size() != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return eu.O(new ow1(entry.getKey(), entry.getValue()));
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
        return be0.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map u0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return ce0.h;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.U(arrayList.size()));
            w0(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        ow1 ow1Var = (ow1) arrayList.get(0);
        ow1Var.getClass();
        Map mapSingletonMap = Collections.singletonMap(ow1Var.h, ow1Var.i);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map v0(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        int size = linkedHashMap.size();
        if (size == 0) {
            return ce0.h;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void w0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ow1 ow1Var = (ow1) it.next();
            linkedHashMap.put(ow1Var.h, ow1Var.i);
        }
    }
}
