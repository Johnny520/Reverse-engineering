package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4562 extends C4561 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۡ$ۥ */
    public /* synthetic */ class C0441 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f972;

        static {
            int[] iArr = new int[EnumC4559.values().length];
            try {
                iArr[EnumC4559.f9810.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4559.f9811.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4559.f9812.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4559.f9813.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4559.f9814.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC4559.f9815.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC4559.f9816.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f972 = iArr;
        }
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final EnumC4559 m13602(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return EnumC4559.f9816;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        }
        if (c == 'H') {
            return EnumC4559.f9815;
        }
        if (c == 'M') {
            return EnumC4559.f9814;
        }
        if (c == 'S') {
            return EnumC4559.f9813;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final EnumC4559 m13603(@InterfaceC6399 String str) {
        C5499.m17103(str, "shortName");
        int iHashCode = str.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && str.equals("us")) {
                                    return EnumC4559.f9811;
                                }
                            } else if (str.equals("ns")) {
                                return EnumC4559.f9810;
                            }
                        } else if (str.equals("ms")) {
                            return EnumC4559.f9812;
                        }
                    } else if (str.equals("s")) {
                        return EnumC4559.f9813;
                    }
                } else if (str.equals(C6597.f2164)) {
                    return EnumC4559.f9814;
                }
            } else if (str.equals("h")) {
                return EnumC4559.f9815;
            }
        } else if (str.equals("d")) {
            return EnumC4559.f9816;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String m13604(@InterfaceC6399 EnumC4559 enumC4559) {
        C5499.m17103(enumC4559, "<this>");
        switch (C0441.f972[enumC4559.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return C6597.f2164;
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + enumC4559).toString());
        }
    }
}
