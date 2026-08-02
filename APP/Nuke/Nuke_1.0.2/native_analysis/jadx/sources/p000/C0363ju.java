package p000;

/* JADX INFO: renamed from: ju */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0363ju {

    /* JADX INFO: renamed from: b */
    public static final long f5212b = sp0.m4932c(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f5213c;

    /* JADX INFO: renamed from: d */
    public static final long f5214d;

    /* JADX INFO: renamed from: e */
    public static final long f5215e;

    /* JADX INFO: renamed from: f */
    public static final long f5216f;

    /* JADX INFO: renamed from: g */
    public static final long f5217g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f5218h = 0;

    /* JADX INFO: renamed from: a */
    public final long f5219a;

    static {
        sp0.m4932c(4282664004L);
        sp0.m4932c(4287137928L);
        sp0.m4932c(4291611852L);
        f5213c = sp0.m4932c(4294967295L);
        f5214d = sp0.m4932c(4294901760L);
        sp0.m4932c(4278255360L);
        f5215e = sp0.m4932c(4278190335L);
        sp0.m4932c(4294967040L);
        sp0.m4932c(4278255615L);
        sp0.m4932c(4294902015L);
        f5216f = sp0.m4930b(0);
        f5217g = sp0.m4928a(0.0f, 0.0f, 0.0f, 0.0f, C0786uu.f11500u);
    }

    public /* synthetic */ C0363ju(long j) {
        this.f5219a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final long m2564a(long j, AbstractC0708su abstractC0708su) {
        C0942yy c0942yyM4661F;
        AbstractC0708su abstractC0708suM2569f = m2569f(j);
        int i = abstractC0708suM2569f.f10370c;
        int i2 = abstractC0708su.f10370c;
        if ((i | i2) < 0) {
            c0942yyM4661F = s11.m4661F(abstractC0708suM2569f, abstractC0708su);
        } else {
            zj1 zj1Var = AbstractC0979zy.f14147a;
            int i3 = i | (i2 << 6);
            Object objM6022b = zj1Var.m6022b(i3);
            if (objM6022b == null) {
                objM6022b = s11.m4661F(abstractC0708suM2569f, abstractC0708su);
                zj1Var.m6421h(i3, objM6022b);
            }
            c0942yyM4661F = (C0942yy) objM6022b;
        }
        return c0942yyM4661F.mo6020a(j);
    }

    /* JADX INFO: renamed from: b */
    public static long m2565b(float f, long j) {
        return sp0.m4928a(m2571h(j), m2570g(j), m2568e(j), f, m2569f(j));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m2566c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final float m2567d(long j) {
        float fM2667b;
        float f;
        if ((63 & j) == 0) {
            fM2667b = (float) kf3.m2667b((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fM2667b = (float) kf3.m2667b((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM2667b / f;
    }

    /* JADX INFO: renamed from: e */
    public static final float m2568e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) kf3.m2667b((j >>> 32) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - rj0.f9605a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC0708su m2569f(long j) {
        float[] fArr = C0786uu.f11480a;
        return C0786uu.f11504y[(int) (j & 63)];
    }

    /* JADX INFO: renamed from: g */
    public static final float m2570g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) kf3.m2667b((j >>> 40) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - rj0.f9605a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: h */
    public static final float m2571h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) kf3.m2667b((j >>> 48) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - rj0.f9605a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: i */
    public static String m2572i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m2571h(j));
        sb.append(", ");
        sb.append(m2570g(j));
        sb.append(", ");
        sb.append(m2568e(j));
        sb.append(", ");
        sb.append(m2567d(j));
        sb.append(", ");
        return hk1.m2210i(sb, m2569f(j).f10368a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0363ju) {
            return this.f5219a == ((C0363ju) obj).f5219a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5219a);
    }

    public final String toString() {
        return m2572i(this.f5219a);
    }
}
