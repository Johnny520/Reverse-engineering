package Yue;

import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "MapAccessorsKt")
public final class C5925 {
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final <V, V1 extends V> V1 m2593(Map<? super String, ? extends V> map, Object obj, InterfaceC5604<?> interfaceC5604) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5604, "property");
        return (V1) C5941.m2606(map, interfaceC5604.getName());
    }

    @InterfaceC5438
    @InterfaceC5572(name = "getVar")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <V, V1 extends V> V1 m2594(Map<? super String, ? extends V> map, Object obj, InterfaceC5604<?> interfaceC5604) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5604, "property");
        return (V1) C5941.m2606(map, interfaceC5604.getName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <V> void m18497(Map<? super String, ? super V> map, Object obj, InterfaceC5604<?> interfaceC5604, V v) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5604, "property");
        map.put(interfaceC5604.getName(), v);
    }
}
