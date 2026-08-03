package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n731#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"})
@Yue.InterfaceC3421(name = "DurationConversionsJDK8Kt")
public final class C2047 {
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2312.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.time.Duration m9581(long r2) {
            long r0 = Yue.C2045.m9472(r2)
            int r2 = Yue.C2045.m9476(r2)
            long r2 = (long) r2
            java.time.Duration r2 = java.time.Duration.ofSeconds(r0, r2)
            java.lang.String r3 = "toJavaDuration-LRDsOJo"
            Yue.C3329.m13905(r2, r3)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2312.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long m9582(java.time.Duration r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            long r0 = r4.getSeconds()
            Yue.ۥۣ۠۠ r2 = Yue.EnumC2050.f6546
            long r0 = Yue.C2049.m9652(r0, r2)
            int r4 = r4.getNano()
            Yue.ۥۣ۠۠ r2 = Yue.EnumC2050.f6543
            long r2 = Yue.C2049.m9651(r4, r2)
            long r0 = Yue.C2045.m9490(r0, r2)
            return r0
    }
}
