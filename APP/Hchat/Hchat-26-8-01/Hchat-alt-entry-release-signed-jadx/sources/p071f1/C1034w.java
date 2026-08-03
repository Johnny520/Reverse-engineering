package p071f1;

import okhttp3.internal.p221ws.WebSocketProtocol;
import p068eh.AbstractC0921a;
import p069f.C0965w;
import p080fb.AbstractC1184v0;
import p089g1.AbstractC1274c;
import p089g1.AbstractC1280i;
import p089g1.AbstractC1282k;
import p089g1.C1276e;
import p089g1.C1279h;

/* JADX INFO: renamed from: f1.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1034w {

    /* JADX INFO: renamed from: b */
    public static final long f3258b = AbstractC0996c0.m2508d(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f3259c;

    /* JADX INFO: renamed from: d */
    public static final long f3260d;

    /* JADX INFO: renamed from: e */
    public static final long f3261e;

    /* JADX INFO: renamed from: f */
    public static final long f3262f;

    /* JADX INFO: renamed from: g */
    public static final long f3263g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f3264h = 0;

    /* JADX INFO: renamed from: a */
    public final long f3265a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC0996c0.m2508d(4282664004L);
        AbstractC0996c0.m2508d(4287137928L);
        AbstractC0996c0.m2508d(4291611852L);
        f3259c = AbstractC0996c0.m2508d(4294967295L);
        f3260d = AbstractC0996c0.m2508d(4294901760L);
        AbstractC0996c0.m2508d(4278255360L);
        f3261e = AbstractC0996c0.m2508d(4278190335L);
        AbstractC0996c0.m2508d(4294967040L);
        AbstractC0996c0.m2508d(4278255615L);
        AbstractC0996c0.m2508d(4294902015L);
        f3262f = AbstractC0996c0.m2507c(0);
        f3263g = AbstractC0996c0.m2506b(0.0f, 0.0f, 0.0f, 0.0f, C1276e.f4256u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b0.s.invoke(java.lang.Object):java.lang.Object, b1.f.invoke(java.lang.Object):java.lang.Object, bc.e.e(long, i0.j1, i0.j1):java.lang.Object, i2.q.invoke(java.lang.Object):java.lang.Object, ig.a.b(bi.b, bi.l, boolean, s0.d, i0.h0, int):void, q2.f.d(long):void] */
    public /* synthetic */ C1034w(long j3) {
        this.f3265a = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m2633a(long j3, AbstractC1274c abstractC1274c) {
        C1279h c1279hM3426e;
        AbstractC1274c abstractC1274cM2638f = m2638f(j3);
        int i9 = abstractC1274cM2638f.f4233c;
        int i10 = abstractC1274c.f4233c;
        if ((i9 | i10) < 0) {
            c1279hM3426e = AbstractC1282k.m3426e(abstractC1274cM2638f, abstractC1274c);
        } else {
            C0965w c0965w = AbstractC1280i.f4268a;
            int i11 = i9 | (i10 << 6);
            Object objM2313b = c0965w.m2313b(i11);
            if (objM2313b == null) {
                objM2313b = AbstractC1282k.m3426e(abstractC1274cM2638f, abstractC1274c);
                c0965w.m2379h(i11, objM2313b);
            }
            c1279hM3426e = (C1279h) objM2313b;
        }
        return c1279hM3426e.mo3421a(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static long m2634b(long j3, float f3) {
        return AbstractC0996c0.m2506b(m2640h(j3), m2639g(j3), m2637e(j3), f3, m2638f(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m2635c(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final float m2636d(long j3) {
        float fM3188O;
        float f3;
        if ((63 & j3) == 0) {
            fM3188O = (float) AbstractC1184v0.m3188O((j3 >>> 56) & 255);
            f3 = 255.0f;
        } else {
            fM3188O = (float) AbstractC1184v0.m3188O((j3 >>> 6) & 1023);
            f3 = 1023.0f;
        }
        return fM3188O / f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final float m2637e(long j3) {
        int i9;
        int i10;
        int i11;
        if ((63 & j3) == 0) {
            return ((float) AbstractC1184v0.m3188O((j3 >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j3 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i12 = Short.MIN_VALUE & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i9 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i9 = i13 + 112;
            }
            int i16 = i9;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - AbstractC1036y.f3268a;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final AbstractC1274c m2638f(long j3) {
        float[] fArr = C1276e.f4236a;
        return C1276e.f4260y[(int) (j3 & 63)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final float m2639g(long j3) {
        int i9;
        int i10;
        int i11;
        if ((63 & j3) == 0) {
            return ((float) AbstractC1184v0.m3188O((j3 >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j3 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i12 = Short.MIN_VALUE & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i9 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i9 = i13 + 112;
            }
            int i16 = i9;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - AbstractC1036y.f3268a;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final float m2640h(long j3) {
        int i9;
        int i10;
        int i11;
        if ((63 & j3) == 0) {
            return ((float) AbstractC1184v0.m3188O((j3 >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j3 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i12 = Short.MIN_VALUE & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i9 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i9 = i13 + 112;
            }
            int i16 = i9;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - AbstractC1036y.f3268a;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m2641i(long j3) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(m2640h(j3));
        sb2.append(", ");
        sb2.append(m2639g(j3));
        sb2.append(", ");
        sb2.append(m2637e(j3));
        sb2.append(", ");
        sb2.append(m2636d(j3));
        sb2.append(", ");
        return AbstractC0921a.m2254q(sb2, m2638f(j3).f4231a, ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1034w) {
            return this.f3265a == ((C1034w) obj).f3265a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f3265a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m2641i(this.f3265a);
    }
}
