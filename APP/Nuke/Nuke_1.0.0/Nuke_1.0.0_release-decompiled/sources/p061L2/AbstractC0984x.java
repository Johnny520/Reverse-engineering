package p061L2;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import p049I2.AbstractC0797o;
import p056K2.C0882h;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: L2.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0984x extends AbstractC0797o {
    /* JADX INFO: renamed from: E */
    public static Object m2033E(Object obj, Map map) {
        AbstractC1665j.m2985e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: F */
    public static int m2034F(int i5) {
        if (i5 < 0) {
            return i5;
        }
        if (i5 < 3) {
            return i5 + 1;
        }
        if (i5 < 1073741824) {
            return (int) ((i5 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: G */
    public static Map m2035G(C0882h... c0882hArr) {
        if (c0882hArr.length <= 0) {
            return C0982v.f3048d;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m2034F(c0882hArr.length));
        m2037I(linkedHashMap, c0882hArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: H */
    public static LinkedHashMap m2036H(Map map, Map map2) {
        AbstractC1665j.m2985e(map, "<this>");
        AbstractC1665j.m2985e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: I */
    public static final void m2037I(HashMap map, C0882h[] c0882hArr) {
        for (C0882h c0882h : c0882hArr) {
            map.put(c0882h.f2769d, c0882h.f2770e);
        }
    }

    /* JADX INFO: renamed from: J */
    public static Map m2038J(LinkedHashMap linkedHashMap) {
        AbstractC1665j.m2985e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            return C0982v.f3048d;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        AbstractC1665j.m2985e(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC1665j.m2984d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
