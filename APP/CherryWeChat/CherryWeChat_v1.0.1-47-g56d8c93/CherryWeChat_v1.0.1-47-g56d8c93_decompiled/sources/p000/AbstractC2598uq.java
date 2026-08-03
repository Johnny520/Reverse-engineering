package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: uq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2598uq extends AbstractC0714Qj {
    /* JADX INFO: renamed from: J */
    public static Object m5108J(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: K */
    public static int m5109K(int i) {
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

    /* JADX INFO: renamed from: L */
    public static Map m5110L(C0208Et... c0208EtArr) {
        if (c0208EtArr.length <= 0) {
            return C0495Lf.f1620a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5109K(c0208EtArr.length));
        for (C0208Et c0208Et : c0208EtArr) {
            linkedHashMap.put(c0208Et.f613a, c0208Et.f614b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: M */
    public static Map m5111M(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C0495Lf.f1620a;
        }
        if (size == 1) {
            C0208Et c0208Et = (C0208Et) arrayList.get(0);
            return Collections.singletonMap(c0208Et.f613a, c0208Et.f614b);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5109K(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0208Et c0208Et2 = (C0208Et) it.next();
            linkedHashMap.put(c0208Et2.f613a, c0208Et2.f614b);
        }
        return linkedHashMap;
    }
}
