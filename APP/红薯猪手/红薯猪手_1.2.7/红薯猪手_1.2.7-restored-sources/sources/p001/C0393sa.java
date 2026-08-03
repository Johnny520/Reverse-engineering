package p001;

/* JADX INFO: renamed from: ۟.sa */
/* JADX INFO: loaded from: classes.dex */
public class C0393sa extends C0380ra {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static final Double m1233(String str) {
        C0237h4.m1090("<this>", str);
        try {
            C0404t8 c0404t8 = C0418u9.f1141;
            c0404t8.getClass();
            if (c0404t8.f1114.matcher(str).matches()) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public static final Integer m1234(String str) {
        int i;
        int i2;
        C0237h4.m1090("<this>", str);
        int i3 = 0;
        boolean z = true;
        if (!(10 <= new C0223g4(2, 36).f762)) {
            throw new IllegalArgumentException("radix 10 was not in valid range " + new C0223g4(2, 36));
        }
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        if ((cCharAt < '0' ? (byte) -1 : cCharAt == '0' ? (byte) 0 : (byte) 1) >= 0) {
            i = 0;
            z = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i4 = Integer.MIN_VALUE;
                i = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                i = 1;
                z = false;
            }
        }
        int i5 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }
}
