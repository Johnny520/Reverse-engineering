package Yue;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public class C5942 extends C5941 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1789 = 1073741824;

    @InterfaceC6399
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <K, V> Map<K, V> m18562(@InterfaceC6399 Map<K, V> map) {
        C5499.m17103(map, "builder");
        return ((C5926) map).m18508();
    }

    @InterfaceC5438
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18563(int i, InterfaceC5124<? super Map<K, V>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        Map mapM18566 = m18566(i);
        interfaceC5124.invoke(mapM18566);
        return m18562(mapM18566);
    }

    @InterfaceC5438
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18564(InterfaceC5124<? super Map<K, V>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        Map mapM18565 = m18565();
        interfaceC5124.invoke(mapM18565);
        return m18562(mapM18565);
    }

    @InterfaceC6399
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18565() {
        return new C5926();
    }

    @InterfaceC6399
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static <K, V> Map<K, V> m18566(int i) {
        return new C5926(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <K, V> V m18567(@InterfaceC6399 ConcurrentMap<K, V> concurrentMap, K k, @InterfaceC6399 InterfaceC5122<? extends V> interfaceC5122) {
        C5499.m17103(concurrentMap, "<this>");
        C5499.m17103(interfaceC5122, "defaultValue");
        V v = concurrentMap.get(k);
        if (v != null) {
            return v;
        }
        V vInvoke = interfaceC5122.invoke();
        V vPutIfAbsent = concurrentMap.putIfAbsent(k, vInvoke);
        return vPutIfAbsent == null ? vInvoke : vPutIfAbsent;
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m18568(int i) {
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

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18569(@InterfaceC6399 C6599<? extends K, ? extends V> c6599) {
        C5499.m17103(c6599, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(c6599.m20938(), c6599.m20939());
        C5499.m17102(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <K, V> SortedMap<K, V> m18570(@InterfaceC6399 Comparator<? super K> comparator, @InterfaceC6399 C6599<? extends K, ? extends V>... c6599Arr) {
        C5499.m17103(comparator, "comparator");
        C5499.m17103(c6599Arr, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        C5943.m18635(treeMap, c6599Arr);
        return treeMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m18571(@InterfaceC6399 C6599<? extends K, ? extends V>... c6599Arr) {
        C5499.m17103(c6599Arr, "pairs");
        TreeMap treeMap = new TreeMap();
        C5943.m18635(treeMap, c6599Arr);
        return treeMap;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final Properties m18572(Map<String, String> map) {
        C5499.m17103(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18573(@InterfaceC6399 Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C5499.m17102(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18574(Map<K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        return m18573(map);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m18575(@InterfaceC6399 Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        return new TreeMap(map);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <K, V> SortedMap<K, V> m18576(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 Comparator<? super K> comparator) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
