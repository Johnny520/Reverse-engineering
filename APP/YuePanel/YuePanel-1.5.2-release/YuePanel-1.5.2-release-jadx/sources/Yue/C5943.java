package Yue;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,804:1\n403#1:814\n414#1:819\n511#1,6:824\n536#1,6:830\n1#2:805\n1238#3,4:806\n1238#3,4:810\n1238#3,4:815\n1238#3,4:820\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n453#1:814\n468#1:819\n526#1:824,6\n551#1:830,6\n403#1:806,4\n414#1:810,4\n453#1:815,4\n468#1:820,4\n*E\n"})
public class C5943 extends C5942 {
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18577(int i, @InterfaceC3614 InterfaceC5124<? super Map<K, V>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        Map mapM18566 = C5942.m18566(i);
        interfaceC5124.invoke(mapM18566);
        return C5942.m18562(mapM18566);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18578(@InterfaceC3614 InterfaceC5124<? super Map<K, V>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        Map mapM18565 = C5942.m18565();
        interfaceC5124.invoke(mapM18565);
        return C5942.m18562(mapM18565);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <K, V> K m18579(Map.Entry<? extends K, ? extends V> entry) {
        C5499.m17103(entry, "<this>");
        return entry.getKey();
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final <K, V> V m18580(Map.Entry<? extends K, ? extends V> entry) {
        C5499.m17103(entry, "<this>");
        return entry.getValue();
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final <K, V> boolean m18581(Map<? extends K, ? extends V> map, K k) {
        C5499.m17103(map, "<this>");
        return map.containsKey(k);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final <K> boolean m18582(Map<? extends K, ?> map, K k) {
        C5499.m17103(map, "<this>");
        return map.containsKey(k);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final <K, V> boolean m18583(Map<K, ? extends V> map, V v) {
        C5499.m17103(map, "<this>");
        return map.containsValue(v);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static <K, V> Map<K, V> m18584() {
        C4634 c4634 = C4634.f9947;
        C5499.m17101(c4634, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c4634;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18585(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Boolean> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (interfaceC5124.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18586(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super K, Boolean> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (interfaceC5124.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18587(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Boolean> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!interfaceC5124.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m18588(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Boolean> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!interfaceC5124.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m18589(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, Boolean> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (interfaceC5124.invoke(entry).booleanValue()) {
                m.put(entry.getKey(), entry.getValue());
            }
        }
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18590(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super V, Boolean> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (interfaceC5124.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final <K, V> V m18591(Map<? extends K, ? extends V> map, K k) {
        C5499.m17103(map, "<this>");
        return map.get(k);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final <K, V> V m18592(Map<K, ? extends V> map, K k, InterfaceC5122<? extends V> interfaceC5122) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5122, "defaultValue");
        V v = map.get(k);
        return v == null ? interfaceC5122.invoke() : v;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final <K, V> V m18593(@InterfaceC6399 Map<K, ? extends V> map, K k, @InterfaceC6399 InterfaceC5122<? extends V> interfaceC5122) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5122, "defaultValue");
        V v = map.get(k);
        return (v != null || map.containsKey(k)) ? v : interfaceC5122.invoke();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final <K, V> V m18594(@InterfaceC6399 Map<K, V> map, K k, @InterfaceC6399 InterfaceC5122<? extends V> interfaceC5122) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5122, "defaultValue");
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        V vInvoke = interfaceC5122.invoke();
        map.put(k, vInvoke);
        return vInvoke;
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final <K, V> V m18595(@InterfaceC6399 Map<K, ? extends V> map, K k) {
        C5499.m17103(map, "<this>");
        return (V) C5941.m2606(map, k);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final <K, V> HashMap<K, V> m18596() {
        return new HashMap<>();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final <K, V> HashMap<K, V> m18597(@InterfaceC6399 C6599<? extends K, ? extends V>... c6599Arr) {
        C5499.m17103(c6599Arr, "pairs");
        HashMap<K, V> map = new HashMap<>(C5942.m18568(c6599Arr.length));
        m18635(map, c6599Arr);
        return map;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;LYue/ۥۣ۠۠ۨ<+TR;>;)TR; */
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final Object m18598(Map map, InterfaceC5122 interfaceC5122) {
        C5499.m17103(interfaceC5122, "defaultValue");
        return map.isEmpty() ? interfaceC5122.invoke() : map;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final <K, V> boolean m18599(Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        return !map.isEmpty();
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final <K, V> boolean m18600(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final <K, V> Iterator<Map.Entry<K, V>> m18601(Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        return map.entrySet().iterator();
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final <K, V> LinkedHashMap<K, V> m18602() {
        return new LinkedHashMap<>();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final <K, V> LinkedHashMap<K, V> m18603(@InterfaceC6399 C6599<? extends K, ? extends V>... c6599Arr) {
        C5499.m17103(c6599Arr, "pairs");
        return (LinkedHashMap) m18645(c6599Arr, new LinkedHashMap(C5942.m18568(c6599Arr.length)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Yue.ۥۣ۠ۨۧ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final <K, V, R> Map<R, V> m18604(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5942.m18568(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(interfaceC5124.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super R, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final <K, V, R, M extends Map<? super R, ? super V>> M m18605(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            m.put(interfaceC5124.invoke(entry), entry.getValue());
        }
        return m;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18606() {
        return m18584();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static <K, V> Map<K, V> m18607(@InterfaceC6399 C6599<? extends K, ? extends V>... c6599Arr) {
        C5499.m17103(c6599Arr, "pairs");
        return c6599Arr.length > 0 ? m18645(c6599Arr, new LinkedHashMap(C5942.m18568(c6599Arr.length))) : m18584();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Yue.ۥۣ۠ۨۧ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <K, V, R> Map<K, R> m18608(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5942.m18568(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), interfaceC5124.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super K, ? super R> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final <K, V, R, M extends Map<? super K, ? super R>> M m18609(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            m.put(entry.getKey(), interfaceC5124.invoke(entry));
        }
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18610(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC7326<? extends K> interfaceC7326) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC7326, "keys");
        Map mapM18646 = m18646(map);
        C3885.m10788(mapM18646.keySet(), interfaceC7326);
        return m18621(mapM18646);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18611(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 Iterable<? extends K> iterable) {
        C5499.m17103(map, "<this>");
        C5499.m17103(iterable, "keys");
        Map mapM18646 = m18646(map);
        C3885.m10789(mapM18646.keySet(), iterable);
        return m18621(mapM18646);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18612(@InterfaceC6399 Map<? extends K, ? extends V> map, K k) {
        C5499.m17103(map, "<this>");
        Map mapM18646 = m18646(map);
        mapM18646.remove(k);
        return m18621(mapM18646);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18613(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 K[] kArr) {
        C5499.m17103(map, "<this>");
        C5499.m17103(kArr, "keys");
        Map mapM18646 = m18646(map);
        C3885.m10791(mapM18646.keySet(), kArr);
        return m18621(mapM18646);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final <K, V> void m18614(Map<K, V> map, InterfaceC7326<? extends K> interfaceC7326) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC7326, "keys");
        C3885.m10788(map.keySet(), interfaceC7326);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final <K, V> void m18615(Map<K, V> map, Iterable<? extends K> iterable) {
        C5499.m17103(map, "<this>");
        C5499.m17103(iterable, "keys");
        C3885.m10789(map.keySet(), iterable);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final <K, V> void m18616(Map<K, V> map, K k) {
        C5499.m17103(map, "<this>");
        map.remove(k);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final <K, V> void m18617(Map<K, V> map, K[] kArr) {
        C5499.m17103(map, "<this>");
        C5499.m17103(kArr, "keys");
        C3885.m10791(map.keySet(), kArr);
    }

    @InterfaceC5438
    @InterfaceC5572(name = "mutableIterator")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final <K, V> Iterator<Map.Entry<K, V>> m18618(Map<K, V> map) {
        C5499.m17103(map, "<this>");
        return map.entrySet().iterator();
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18619() {
        return new LinkedHashMap();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static <K, V> Map<K, V> m18620(@InterfaceC6399 C6599<? extends K, ? extends V>... c6599Arr) {
        C5499.m17103(c6599Arr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5942.m18568(c6599Arr.length));
        m18635(linkedHashMap, c6599Arr);
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18621(@InterfaceC6399 Map<K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C5942.m18573(map) : m18584();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18622(Map<K, ? extends V> map) {
        return map == 0 ? m18584() : map;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18623(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 C6599<? extends K, ? extends V> c6599) {
        C5499.m17103(map, "<this>");
        C5499.m17103(c6599, "pair");
        if (map.isEmpty()) {
            return C5942.m18569(c6599);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c6599.m20938(), c6599.m20939());
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18624(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 InterfaceC7326<? extends C6599<? extends K, ? extends V>> interfaceC7326) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC7326, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m18633(linkedHashMap, interfaceC7326);
        return m18621(linkedHashMap);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18625(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 Iterable<? extends C6599<? extends K, ? extends V>> iterable) {
        C5499.m17103(map, "<this>");
        C5499.m17103(iterable, "pairs");
        if (map.isEmpty()) {
            return m18640(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m18634(linkedHashMap, iterable);
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18626(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 Map<? extends K, ? extends V> map2) {
        C5499.m17103(map, "<this>");
        C5499.m17103(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18627(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 C6599<? extends K, ? extends V>[] c6599Arr) {
        C5499.m17103(map, "<this>");
        C5499.m17103(c6599Arr, "pairs");
        if (map.isEmpty()) {
            return m18644(c6599Arr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m18635(linkedHashMap, c6599Arr);
        return linkedHashMap;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final <K, V> void m18628(Map<? super K, ? super V> map, C6599<? extends K, ? extends V> c6599) {
        C5499.m17103(map, "<this>");
        C5499.m17103(c6599, "pair");
        map.put(c6599.m20938(), c6599.m20939());
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final <K, V> void m18629(Map<? super K, ? super V> map, InterfaceC7326<? extends C6599<? extends K, ? extends V>> interfaceC7326) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC7326, "pairs");
        m18633(map, interfaceC7326);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final <K, V> void m18630(Map<? super K, ? super V> map, Iterable<? extends C6599<? extends K, ? extends V>> iterable) {
        C5499.m17103(map, "<this>");
        C5499.m17103(iterable, "pairs");
        m18634(map, iterable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final <K, V> void m18631(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        C5499.m17103(map, "<this>");
        C5499.m17103(map2, "map");
        map.putAll(map2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final <K, V> void m18632(Map<? super K, ? super V> map, C6599<? extends K, ? extends V>[] c6599Arr) {
        C5499.m17103(map, "<this>");
        C5499.m17103(c6599Arr, "pairs");
        m18635(map, c6599Arr);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final <K, V> void m18633(@InterfaceC6399 Map<? super K, ? super V> map, @InterfaceC6399 InterfaceC7326<? extends C6599<? extends K, ? extends V>> interfaceC7326) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC7326, "pairs");
        for (C6599<? extends K, ? extends V> c6599 : interfaceC7326) {
            map.put(c6599.m3062(), c6599.m3063());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final <K, V> void m18634(@InterfaceC6399 Map<? super K, ? super V> map, @InterfaceC6399 Iterable<? extends C6599<? extends K, ? extends V>> iterable) {
        C5499.m17103(map, "<this>");
        C5499.m17103(iterable, "pairs");
        for (C6599<? extends K, ? extends V> c6599 : iterable) {
            map.put(c6599.m3062(), c6599.m3063());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final <K, V> void m18635(@InterfaceC6399 Map<? super K, ? super V> map, @InterfaceC6399 C6599<? extends K, ? extends V>[] c6599Arr) {
        C5499.m17103(map, "<this>");
        C5499.m17103(c6599Arr, "pairs");
        for (C6599<? extends K, ? extends V> c6599 : c6599Arr) {
            map.put(c6599.m3062(), c6599.m3063());
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final <K, V> V m18636(Map<? extends K, V> map, K k) {
        C5499.m17103(map, "<this>");
        return (V) C8012.m25259(map).remove(k);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final <K, V> void m18637(Map<K, V> map, K k, V v) {
        C5499.m17103(map, "<this>");
        map.put(k, v);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18638(@InterfaceC6399 InterfaceC7326<? extends C6599<? extends K, ? extends V>> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return m18621(m18639(interfaceC7326, new LinkedHashMap()));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m18639(@InterfaceC6399 InterfaceC7326<? extends C6599<? extends K, ? extends V>> interfaceC7326, @InterfaceC6399 M m) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(m, "destination");
        m18633(m, interfaceC7326);
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static <K, V> Map<K, V> m18640(@InterfaceC6399 Iterable<? extends C6599<? extends K, ? extends V>> iterable) {
        C5499.m17103(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m18621(m18641(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m18584();
        }
        if (size != 1) {
            return m18641(iterable, new LinkedHashMap(C5942.m18568(collection.size())));
        }
        return C5942.m18569(iterable instanceof List ? (C6599<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m18641(@InterfaceC6399 Iterable<? extends C6599<? extends K, ? extends V>> iterable, @InterfaceC6399 M m) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(m, "destination");
        m18634(m, iterable);
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static <K, V> Map<K, V> m18642(@InterfaceC6399 Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m18646(map) : C5942.m18573(map) : m18584();
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m18643(@InterfaceC6399 Map<? extends K, ? extends V> map, @InterfaceC6399 M m) {
        C5499.m17103(map, "<this>");
        C5499.m17103(m, "destination");
        m.putAll(map);
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18644(@InterfaceC6399 C6599<? extends K, ? extends V>[] c6599Arr) {
        C5499.m17103(c6599Arr, "<this>");
        int length = c6599Arr.length;
        return length != 0 ? length != 1 ? m18645(c6599Arr, new LinkedHashMap(C5942.m18568(c6599Arr.length))) : C5942.m18569(c6599Arr[0]) : m18584();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m18645(@InterfaceC6399 C6599<? extends K, ? extends V>[] c6599Arr, @InterfaceC6399 M m) {
        C5499.m17103(c6599Arr, "<this>");
        C5499.m17103(m, "destination");
        m18635(m, c6599Arr);
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static <K, V> Map<K, V> m18646(@InterfaceC6399 Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "<this>");
        return new LinkedHashMap(map);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final <K, V> C6599<K, V> m18647(Map.Entry<? extends K, ? extends V> entry) {
        C5499.m17103(entry, "<this>");
        return new C6599<>(entry.getKey(), entry.getValue());
    }
}
