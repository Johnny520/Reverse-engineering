package p211o0;

import p011B4.AbstractC0231b;
import p128a.AbstractC1785a;
import p186k.C2439u;
import p217p0.AbstractC2872c;
import p217p0.AbstractC2877h;
import p217p0.AbstractC2879j;
import p217p0.C2873d;
import p217p0.C2876g;

/* JADX INFO: renamed from: o0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2762u {

    /* JADX INFO: renamed from: b */
    public static final long f8757b = AbstractC2767z.m4934d(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f8758c;

    /* JADX INFO: renamed from: d */
    public static final long f8759d;

    /* JADX INFO: renamed from: e */
    public static final long f8760e;

    /* JADX INFO: renamed from: f */
    public static final long f8761f;

    /* JADX INFO: renamed from: g */
    public static final long f8762g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f8763h = 0;

    /* JADX INFO: renamed from: a */
    public final long f8764a;

    static {
        AbstractC2767z.m4934d(4282664004L);
        AbstractC2767z.m4934d(4287137928L);
        AbstractC2767z.m4934d(4291611852L);
        f8758c = AbstractC2767z.m4934d(4294967295L);
        f8759d = AbstractC2767z.m4934d(4294901760L);
        AbstractC2767z.m4934d(4278255360L);
        f8760e = AbstractC2767z.m4934d(4278190335L);
        AbstractC2767z.m4934d(4294967040L);
        AbstractC2767z.m4934d(4278255615L);
        AbstractC2767z.m4934d(4294902015L);
        f8761f = AbstractC2767z.m4933c(0);
        f8762g = AbstractC2767z.m4932b(0.0f, 0.0f, 0.0f, 0.0f, C2873d.f9091u);
    }

    public /* synthetic */ C2762u(long j5) {
        this.f8764a = j5;
    }

    /* JADX INFO: renamed from: a */
    public static final long m4919a(long j5, AbstractC2872c abstractC2872c) {
        C2876g c2876gM5085e;
        AbstractC2872c abstractC2872cM4924f = m4924f(j5);
        int i5 = abstractC2872cM4924f.f9070c;
        int i6 = abstractC2872c.f9070c;
        if ((i5 | i6) < 0) {
            c2876gM5085e = AbstractC2879j.m5085e(abstractC2872cM4924f, abstractC2872c);
        } else {
            C2439u c2439u = AbstractC2877h.f9103a;
            int i7 = i5 | (i6 << 6);
            Object objM4318b = c2439u.m4318b(i7);
            if (objM4318b == null) {
                objM4318b = AbstractC2879j.m5085e(abstractC2872cM4924f, abstractC2872c);
                c2439u.m4344h(i7, objM4318b);
            }
            c2876gM5085e = (C2876g) objM4318b;
        }
        return c2876gM5085e.mo5080a(j5);
    }

    /* JADX INFO: renamed from: b */
    public static long m4920b(float f2, long j5) {
        return AbstractC2767z.m4932b(m4926h(j5), m4925g(j5), m4923e(j5), f2, m4924f(j5));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4921c(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX INFO: renamed from: d */
    public static final float m4922d(long j5) {
        float fM3259u;
        float f2;
        if ((63 & j5) == 0) {
            fM3259u = (float) AbstractC1785a.m3259u((j5 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fM3259u = (float) AbstractC1785a.m3259u((j5 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fM3259u / f2;
    }

    /* JADX INFO: renamed from: e */
    public static final float m4923e(long j5) {
        int i5;
        int i6;
        int i7;
        if ((63 & j5) == 0) {
            return ((float) AbstractC1785a.m3259u((j5 >>> 32) & 255)) / 255.0f;
        }
        short s5 = (short) ((j5 >>> 16) & 65535);
        int i8 = Short.MIN_VALUE & s5;
        int i9 = ((65535 & s5) >>> 10) & 31;
        int i10 = s5 & 1023;
        if (i9 != 0) {
            int i11 = i10 << 13;
            if (i9 == 31) {
                i5 = 255;
                if (i11 != 0) {
                    i11 |= 4194304;
                }
            } else {
                i5 = i9 + 112;
            }
            int i12 = i5;
            i6 = i11;
            i7 = i12;
        } else {
            if (i10 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i10 + 1056964608) - AbstractC2764w.f8767a;
                return i8 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i7 = 0;
            i6 = 0;
        }
        return Float.intBitsToFloat((i7 << 23) | (i8 << 16) | i6);
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC2872c m4924f(long j5) {
        float[] fArr = C2873d.f9071a;
        return C2873d.f9095y[(int) (j5 & 63)];
    }

    /* JADX INFO: renamed from: g */
    public static final float m4925g(long j5) {
        int i5;
        int i6;
        int i7;
        if ((63 & j5) == 0) {
            return ((float) AbstractC1785a.m3259u((j5 >>> 40) & 255)) / 255.0f;
        }
        short s5 = (short) ((j5 >>> 32) & 65535);
        int i8 = Short.MIN_VALUE & s5;
        int i9 = ((65535 & s5) >>> 10) & 31;
        int i10 = s5 & 1023;
        if (i9 != 0) {
            int i11 = i10 << 13;
            if (i9 == 31) {
                i5 = 255;
                if (i11 != 0) {
                    i11 |= 4194304;
                }
            } else {
                i5 = i9 + 112;
            }
            int i12 = i5;
            i6 = i11;
            i7 = i12;
        } else {
            if (i10 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i10 + 1056964608) - AbstractC2764w.f8767a;
                return i8 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i7 = 0;
            i6 = 0;
        }
        return Float.intBitsToFloat((i7 << 23) | (i8 << 16) | i6);
    }

    /* JADX INFO: renamed from: h */
    public static final float m4926h(long j5) {
        int i5;
        int i6;
        int i7;
        if ((63 & j5) == 0) {
            return ((float) AbstractC1785a.m3259u((j5 >>> 48) & 255)) / 255.0f;
        }
        short s5 = (short) ((j5 >>> 48) & 65535);
        int i8 = Short.MIN_VALUE & s5;
        int i9 = ((65535 & s5) >>> 10) & 31;
        int i10 = s5 & 1023;
        if (i9 != 0) {
            int i11 = i10 << 13;
            if (i9 == 31) {
                i5 = 255;
                if (i11 != 0) {
                    i11 |= 4194304;
                }
            } else {
                i5 = i9 + 112;
            }
            int i12 = i5;
            i6 = i11;
            i7 = i12;
        } else {
            if (i10 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i10 + 1056964608) - AbstractC2764w.f8767a;
                return i8 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i7 = 0;
            i6 = 0;
        }
        return Float.intBitsToFloat((i7 << 23) | (i8 << 16) | i6);
    }

    /* JADX INFO: renamed from: i */
    public static String m4927i(long j5) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m4926h(j5));
        sb.append(", ");
        sb.append(m4925g(j5));
        sb.append(", ");
        sb.append(m4923e(j5));
        sb.append(", ");
        sb.append(m4922d(j5));
        sb.append(", ");
        return AbstractC0231b.m402m(sb, m4924f(j5).f9068a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2762u) {
            return this.f8764a == ((C2762u) obj).f8764a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8764a);
    }

    public final String toString() {
        return m4927i(this.f8764a);
    }
}
