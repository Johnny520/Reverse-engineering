package p185m8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import p172l8.C4711r;
import p198n8.C5511d;

/* JADX INFO: renamed from: m8.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5107t0 extends AbstractC5105s0 {
    /* JADX INFO: renamed from: b */
    public static Map m20760b(Map map) {
        map.getClass();
        return ((C5511d) map).m22461q();
    }

    /* JADX INFO: renamed from: c */
    public static Map m20761c() {
        return new C5511d();
    }

    /* JADX INFO: renamed from: d */
    public static Map m20762d(int i10) {
        return new C5511d(i10);
    }

    /* JADX INFO: renamed from: e */
    public static int m20763e(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: f */
    public static Map m20764f(C4711r c4711r) {
        c4711r.getClass();
        Map mapSingletonMap = Collections.singletonMap(c4711r.m18795e(), c4711r.m18796f());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: g */
    public static final Map m20765g(Map map) {
        map.getClass();
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: h */
    public static SortedMap m20766h(Map map, Comparator comparator) {
        map.getClass();
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
