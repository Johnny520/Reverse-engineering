package Yue;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
public class C5941 {
    @InterfaceC6839
    @InterfaceC5572(name = "getOrImplicitDefaultNullable")
    /* JADX INFO: renamed from: ۥ */
    public static final <K, V> V m2606(@InterfaceC6399 Map<K, ? extends V> map, K k) {
        C5499.m17103(map, "<this>");
        if (map instanceof InterfaceC5938) {
            return (V) ((InterfaceC5938) map).mo18558(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <K, V> Map<K, V> m2607(@InterfaceC6399 Map<K, ? extends V> map, @InterfaceC6399 InterfaceC5124<? super K, ? extends V> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "defaultValue");
        return map instanceof InterfaceC5938 ? m2607(((InterfaceC5938) map).getMap(), interfaceC5124) : new C5939(map, interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "withDefaultMutable")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m18561(@InterfaceC6399 Map<K, V> map, @InterfaceC6399 InterfaceC5124<? super K, ? extends V> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "defaultValue");
        return map instanceof InterfaceC6299 ? m18561(((InterfaceC6299) map).getMap(), interfaceC5124) : new C6300(map, interfaceC5124);
    }
}
