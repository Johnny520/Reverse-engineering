package Yue;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5521 extends C5520 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۨۥ$ۥ */
    @InterfaceC7507({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class C0783 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0783 f1549 = new C0783();

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC5568
        @InterfaceC6489
        public static final Integer f1550;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f1550 = num;
        }
    }

    @Override // Yue.C6670
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public AbstractC7000 mo2265() {
        return m17152(34) ? new C6674() : super.mo2265();
    }

    @Override // Yue.C6670
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C5955 mo17151(@InterfaceC6399 MatchResult matchResult, @InterfaceC6399 String str) {
        C5499.m17103(matchResult, "matchResult");
        C5499.m17103(str, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        C5458 c5458 = new C5458(matcher.start(str), matcher.end(str) - 1);
        if (c5458.mo830().intValue() < 0) {
            return null;
        }
        String strGroup = matcher.group(str);
        C5499.m17102(strGroup, "matcher.group(name)");
        return new C5955(strGroup, c5458);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m17152(int i) {
        Integer num = C0783.f1550;
        return num == null || num.intValue() >= i;
    }
}
