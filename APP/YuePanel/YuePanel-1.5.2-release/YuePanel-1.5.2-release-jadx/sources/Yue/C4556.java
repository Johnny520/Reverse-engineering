package Yue;

import java.time.Duration;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n731#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"})
@InterfaceC5572(name = "DurationConversionsJDK8Kt")
public final class C4556 {
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4774.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ */
    public static final Duration m1502(long j) {
        Duration durationOfSeconds = Duration.ofSeconds(C4555.m13424(j), C4555.m13428(j));
        C5499.m17102(durationOfSeconds, "toJavaDuration-LRDsOJo");
        return durationOfSeconds;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4774.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final long m1503(Duration duration) {
        C5499.m17103(duration, "<this>");
        return C4555.m13442(C4558.m13596(duration.getSeconds(), EnumC4559.f9813), C4558.m13595(duration.getNano(), EnumC4559.f9810));
    }
}
