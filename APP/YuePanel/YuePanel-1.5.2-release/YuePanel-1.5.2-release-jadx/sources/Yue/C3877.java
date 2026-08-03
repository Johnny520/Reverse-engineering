package Yue;

import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "CollectionsJDK8Kt")
public final class C3877 {
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ */
    public static final <K, V> V m915(Map<? extends K, ? extends V> map, K k, V v) {
        C5499.m17103(map, "<this>");
        return map.getOrDefault(k, v);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <K, V> boolean m916(Map<? extends K, ? extends V> map, K k, V v) {
        C5499.m17103(map, "<this>");
        return C8012.m25259(map).remove(k, v);
    }
}
