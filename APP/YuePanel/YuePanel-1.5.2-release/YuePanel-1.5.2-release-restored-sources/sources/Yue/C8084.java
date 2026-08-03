package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "UStringsKt")
public final class C8084 {
    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ */
    public static final String m4123(long j, int i) {
        return C8113.m26721(j, C3791.m836(i));
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m4124(byte b, int i) {
        String string = Integer.toString(b & 255, C3791.m836(i));
        C5499.m17102(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String m26662(int i, int i2) {
        String string = Long.toString(((long) i) & C8578.f25466, C3791.m836(i2));
        C5499.m17102(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String m26663(short s, int i) {
        String string = Integer.toString(s & C8080.f23970, C3791.m836(i));
        C5499.m17102(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final byte m26664(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        C8048 c8048M26666 = m26666(str);
        if (c8048M26666 != null) {
            return c8048M26666.m26245();
        }
        C7626.m23932(str);
        throw new C5667();
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final byte m26665(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        C8048 c8048M26667 = m26667(str, i);
        if (c8048M26667 != null) {
            return c8048M26667.m26245();
        }
        C7626.m23932(str);
        throw new C5667();
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final C8048 m26666(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m26667(str, 10);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C8048 m26667(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        C8057 c8057M26671 = m26671(str, i);
        if (c8057M26671 == null) {
            return null;
        }
        int iM26372 = c8057M26671.m26372();
        if (Integer.compareUnsigned(iM26372, C8057.m26318(255)) > 0) {
            return null;
        }
        return C8048.m26188(C8048.m26193((byte) iM26372));
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m26668(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        C8057 c8057M26670 = m26670(str);
        if (c8057M26670 != null) {
            return c8057M26670.m26372();
        }
        C7626.m23932(str);
        throw new C5667();
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m26669(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        C8057 c8057M26671 = m26671(str, i);
        if (c8057M26671 != null) {
            return c8057M26671.m26372();
        }
        C7626.m23932(str);
        throw new C5667();
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final C8057 m26670(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m26671(str, 10);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final C8057 m26671(@InterfaceC6399 String str, int i) {
        int i2;
        C5499.m17103(str, "<this>");
        C3791.m836(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (C5499.m17107(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int iM26318 = C8057.m26318(i);
        int iDivideUnsigned = 119304647;
        while (i2 < length) {
            int iM837 = C3791.m837(str.charAt(i2), i);
            if (iM837 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i3, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, iM26318);
                    if (Integer.compareUnsigned(i3, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int iM263182 = C8057.m26318(i3 * iM26318);
            int iM263183 = C8057.m26318(C8057.m26318(iM837) + iM263182);
            if (Integer.compareUnsigned(iM263183, iM263182) < 0) {
                return null;
            }
            i2++;
            i3 = iM263183;
        }
        return C8057.m26313(i3);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long m26672(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        C8064 c8064M26674 = m26674(str);
        if (c8064M26674 != null) {
            return c8064M26674.m26462();
        }
        C7626.m23932(str);
        throw new C5667();
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final long m26673(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        C8064 c8064M26675 = m26675(str, i);
        if (c8064M26675 != null) {
            return c8064M26675.m26462();
        }
        C7626.m23932(str);
        throw new C5667();
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final C8064 m26674(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m26675(str, 10);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final C8064 m26675(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        C3791.m836(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (C5499.m17107(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jM26408 = C8064.m26408(i);
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i2 < length) {
            int iM837 = C3791.m837(str.charAt(i2), i);
            if (iM837 < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(-1L, jM26408);
                    if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jM264082 = C8064.m26408(j * jM26408);
            long jM264083 = C8064.m26408(C8064.m26408(((long) C8057.m26318(iM837)) & C8578.f25466) + jM264082);
            if (Long.compareUnsigned(jM264083, jM264082) < 0) {
                return null;
            }
            i2++;
            j = jM264083;
        }
        return C8064.m26403(j);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final short m26676(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        C8080 c8080M26678 = m26678(str);
        if (c8080M26678 != null) {
            return c8080M26678.m26642();
        }
        C7626.m23932(str);
        throw new C5667();
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final short m26677(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        C8080 c8080M26679 = m26679(str, i);
        if (c8080M26679 != null) {
            return c8080M26679.m26642();
        }
        C7626.m23932(str);
        throw new C5667();
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final C8080 m26678(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m26679(str, 10);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final C8080 m26679(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        C8057 c8057M26671 = m26671(str, i);
        if (c8057M26671 == null) {
            return null;
        }
        int iM26372 = c8057M26671.m26372();
        if (Integer.compareUnsigned(iM26372, C8057.m26318(65535)) > 0) {
            return null;
        }
        return C8080.m26585(C8080.m26590((short) iM26372));
    }
}
