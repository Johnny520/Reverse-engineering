package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5354 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f13014 = 16384;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f13015 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f13016 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f13017 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f13018 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f13019 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f13020 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f13021 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f13022 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f13023 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f13024 = 9;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f13025 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f13026 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f13027 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f13028 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f13029 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f13030 = 8;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f13031 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f13032 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String[] f13035;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C5354 f1449 = new C5354();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3630 f1450 = C3630.f6370.m9876("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String[] f13033 = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String[] f13034 = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C5499.m17102(binaryString, "toBinaryString(it)");
            strArr[i] = C7627.m23997(C8158.m26854("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f13035 = strArr;
        String[] strArr2 = f13034;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = strArr2[i2] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f13034;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
        }
        int length = f13034.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f13034;
            if (strArr4[i7] == null) {
                strArr4[i7] = f13035[i7];
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final String m2115(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : f13035[i2];
            }
            if (i != 7 && i != 8) {
                String[] strArr = f13034;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    C5499.m17100(str);
                } else {
                    str = f13035[i2];
                }
                String str2 = str;
                return (i != 5 || (i2 & 4) == 0) ? (i != 0 || (i2 & 32) == 0) ? str2 : C7627.m23998(str2, "PRIORITY", "COMPRESSED", false, 4, null) : C7627.m23998(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f13035[i2];
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final String m2116(int i) {
        String[] strArr = f13033;
        return i < strArr.length ? strArr[i] : C8158.m26854("0x%02x", Integer.valueOf(i));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String m16490(boolean z, int i, int i2, int i3, int i4) {
        return C8158.m26854("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), m2116(i3), m2115(i3, i4));
    }
}
