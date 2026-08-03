package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "CollectionsJDK8Kt")
public final class C1205 {
    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <K, V> V m6178(java.util.Map<? extends K, ? extends V> r1, K r2, V r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Object r1 = r1.getOrDefault(r2, r3)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <K, V> boolean m6179(java.util.Map<? extends K, ? extends V> r1, K r2, V r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.Map r1 = Yue.C6466.m23824(r1)
            boolean r1 = r1.remove(r2, r3)
            return r1
    }
}
