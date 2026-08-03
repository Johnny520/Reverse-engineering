package Yue;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4561 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠۠$ۥ */
    public /* synthetic */ class C0440 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f971;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f971 = iArr;
        }
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ */
    public static final double m1509(double d, @InterfaceC6399 EnumC4559 enumC4559, @InterfaceC6399 EnumC4559 enumC45592) {
        C5499.m17103(enumC4559, "sourceUnit");
        C5499.m17103(enumC45592, "targetUnit");
        long jConvert = enumC45592.m13598().convert(1L, enumC4559.m13598());
        return jConvert > 0 ? d * jConvert : d / enumC4559.m13598().convert(1L, enumC45592.m13598());
    }

    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final long m1510(long j, @InterfaceC6399 EnumC4559 enumC4559, @InterfaceC6399 EnumC4559 enumC45592) {
        C5499.m17103(enumC4559, "sourceUnit");
        C5499.m17103(enumC45592, "targetUnit");
        return enumC45592.m13598().convert(j, enumC4559.m13598());
    }

    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m13599(long j, @InterfaceC6399 EnumC4559 enumC4559, @InterfaceC6399 EnumC4559 enumC45592) {
        C5499.m17103(enumC4559, "sourceUnit");
        C5499.m17103(enumC45592, "targetUnit");
        return enumC45592.m13598().convert(j, enumC4559.m13598());
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4774.class})
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final EnumC4559 m13600(@InterfaceC6399 TimeUnit timeUnit) {
        C5499.m17103(timeUnit, "<this>");
        switch (C0440.f971[timeUnit.ordinal()]) {
            case 1:
                return EnumC4559.f9810;
            case 2:
                return EnumC4559.f9811;
            case 3:
                return EnumC4559.f9812;
            case 4:
                return EnumC4559.f9813;
            case 5:
                return EnumC4559.f9814;
            case 6:
                return EnumC4559.f9815;
            case 7:
                return EnumC4559.f9816;
            default:
                throw new C6380();
        }
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4774.class})
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final TimeUnit m13601(@InterfaceC6399 EnumC4559 enumC4559) {
        C5499.m17103(enumC4559, "<this>");
        return enumC4559.m13598();
    }
}
