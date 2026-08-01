package p000;

/* JADX INFO: renamed from: ff */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0207ff {

    /* JADX INFO: renamed from: b */
    public static final long f1702b = p30.m2993c(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f1703c;

    /* JADX INFO: renamed from: d */
    public static final long f1704d;

    /* JADX INFO: renamed from: e */
    public static final long f1705e;

    /* JADX INFO: renamed from: f */
    public static final long f1706f;

    /* JADX INFO: renamed from: g */
    public static final long f1707g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f1708h = 0;

    /* JADX INFO: renamed from: a */
    public final long f1709a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        p30.m2993c(4282664004L);
        p30.m2993c(4287137928L);
        p30.m2993c(4291611852L);
        f1703c = p30.m2993c(4294967295L);
        f1704d = p30.m2993c(4294901760L);
        p30.m2993c(4278255360L);
        f1705e = p30.m2993c(4278190335L);
        p30.m2993c(4294967040L);
        p30.m2993c(4278255615L);
        p30.m2993c(4294902015L);
        f1706f = p30.m2992b(0);
        f1707g = p30.m2991a(0.0f, 0.0f, 0.0f, 0.0f, C0687rf.f5407u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [g70.invoke(java.lang.Object):java.lang.Object, o30.d(hw, pe0, boolean, x01, cc, gc, jn0, xw, ji, int, int):void, r60.c(long, s71, ww, ji, int):void, s2.invoke(java.lang.Object):java.lang.Object] */
    public /* synthetic */ C0207ff(long j) {
        this.f1709a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m1092a(long j, AbstractC0549of abstractC0549of) {
        C0476mj c0476mjM4055t;
        AbstractC0549of abstractC0549ofM1097f = m1097f(j);
        int i = abstractC0549ofM1097f.f4546c;
        int i2 = abstractC0549of.f4546c;
        if ((i | i2) < 0) {
            c0476mjM4055t = s91.m4055t(abstractC0549ofM1097f, abstractC0549of);
        } else {
            ug0 ug0Var = AbstractC0514nj.f4284a;
            int i3 = i | (i2 << 6);
            Object objM4248b = ug0Var.m4248b(i3);
            if (objM4248b == null) {
                objM4248b = s91.m4055t(abstractC0549ofM1097f, abstractC0549of);
                ug0Var.m4330i(i3, objM4248b);
            }
            c0476mjM4055t = (C0476mj) objM4248b;
        }
        return c0476mjM4055t.mo1908a(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static long m1093b(float f, long j) {
        return p30.m2991a(m1099h(j), m1098g(j), m1096e(j), f, m1097f(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m1094c(long j, long j2) {
        return j == j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final float m1095d(long j) {
        float fM3398G;
        float f;
        if ((63 & j) == 0) {
            fM3398G = (float) r60.m3398G((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fM3398G = (float) r60.m3398G((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM3398G / f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final float m1096e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) r60.m3398G((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC0148du.f1192a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final AbstractC0549of m1097f(long j) {
        float[] fArr = C0687rf.f5387a;
        return C0687rf.f5411y[(int) (j & 63)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final float m1098g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) r60.m3398G((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC0148du.f1192a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final float m1099h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) r60.m3398G((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC0148du.f1192a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m1100i(long j) {
        return "Color(" + m1099h(j) + ", " + m1098g(j) + ", " + m1096e(j) + ", " + m1095d(j) + ", " + m1097f(j).f4544a + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0207ff) {
            return this.f1709a == ((C0207ff) obj).f1709a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f1709a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m1100i(this.f1709a);
    }
}
