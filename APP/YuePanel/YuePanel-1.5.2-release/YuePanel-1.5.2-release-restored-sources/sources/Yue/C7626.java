package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7626 extends C7625 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final Void m23932(@InterfaceC6399 String str) {
        C5499.m17103(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final Byte m23933(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m23934(str, 10);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final Byte m23934(@InterfaceC6399 String str, int i) {
        int iIntValue;
        C5499.m17103(str, "<this>");
        Integer numM23936 = m23936(str, i);
        if (numM23936 == null || (iIntValue = numM23936.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static Integer m23935(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m23936(str, 10);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final Integer m23936(@InterfaceC6399 String str, int i) {
        boolean z;
        int i2;
        int i3;
        C5499.m17103(str, "<this>");
        C3791.m836(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (C5499.m17107(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i5 = Integer.MIN_VALUE;
                z = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z = false;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iM837 = C3791.m837(str.charAt(i2), i);
            if (iM837 < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iM837) {
                return null;
            }
            i4 = i3 - iM837;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static Long m23937(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m23938(str, 10);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final Long m23938(@InterfaceC6399 String str, int i) {
        boolean z;
        C5499.m17103(str, "<this>");
        C3791.m836(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (C5499.m17107(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j = Long.MIN_VALUE;
                i2 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z = false;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int iM837 = C3791.m837(str.charAt(i2), i);
            if (iM837 < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / ((long) i);
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * ((long) i);
            long j6 = iM837;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final Short m23939(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m23940(str, 10);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final Short m23940(@InterfaceC6399 String str, int i) {
        int iIntValue;
        C5499.m17103(str, "<this>");
        Integer numM23936 = m23936(str, i);
        if (numM23936 == null || (iIntValue = numM23936.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }
}
