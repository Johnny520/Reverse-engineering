package p265s1;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import okhttp3.internal.p218ws.WebSocketProtocol;
import p024b9.AbstractC1043k;
import p172l8.AbstractC4704k0;
import p172l8.C4688c0;
import p276t1.AbstractC8027c;
import p276t1.AbstractC8029d;
import p276t1.C8043k;

/* JADX INFO: renamed from: s1.q1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7128q1 {

    /* JADX INFO: renamed from: b */
    public static final a f23644b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final long f23645c = AbstractC7138s1.m28200d(4278190080L);

    /* JADX INFO: renamed from: d */
    public static final long f23646d = AbstractC7138s1.m28200d(4282664004L);

    /* JADX INFO: renamed from: e */
    public static final long f23647e = AbstractC7138s1.m28200d(4287137928L);

    /* JADX INFO: renamed from: f */
    public static final long f23648f = AbstractC7138s1.m28200d(4291611852L);

    /* JADX INFO: renamed from: g */
    public static final long f23649g = AbstractC7138s1.m28200d(4294967295L);

    /* JADX INFO: renamed from: h */
    public static final long f23650h = AbstractC7138s1.m28200d(4294901760L);

    /* JADX INFO: renamed from: i */
    public static final long f23651i = AbstractC7138s1.m28200d(4278255360L);

    /* JADX INFO: renamed from: j */
    public static final long f23652j = AbstractC7138s1.m28200d(4278190335L);

    /* JADX INFO: renamed from: k */
    public static final long f23653k = AbstractC7138s1.m28200d(4294967040L);

    /* JADX INFO: renamed from: l */
    public static final long f23654l = AbstractC7138s1.m28200d(4278255615L);

    /* JADX INFO: renamed from: m */
    public static final long f23655m = AbstractC7138s1.m28200d(4294902015L);

    /* JADX INFO: renamed from: n */
    public static final long f23656n = AbstractC7138s1.m28198b(0);

    /* JADX INFO: renamed from: o */
    public static final long f23657o = AbstractC7138s1.m28197a(0.0f, 0.0f, 0.0f, 0.0f, C8043k.f26795a.m30941C());

    /* JADX INFO: renamed from: a */
    public final long f23658a;

    public /* synthetic */ C7128q1(long j10) {
        this.f23658a = j10;
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ C7128q1 m28125k(long j10) {
        return new C7128q1(j10);
    }

    /* JADX INFO: renamed from: m */
    public static final long m28127m(long j10, AbstractC8027c abstractC8027c) {
        return AbstractC8029d.m30866i(m28134t(j10), abstractC8027c, 0, 2, null).mo30966a(j10);
    }

    /* JADX INFO: renamed from: n */
    public static final long m28128n(long j10, float f10, float f11, float f12, float f13) {
        return AbstractC7138s1.m28197a(f11, f12, f13, f10, m28134t(j10));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ long m28129o(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m28132r(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = m28136v(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = m28135u(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = m28133s(j10);
        }
        return m28128n(j10, f14, f15, f16, f13);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m28130p(long j10, Object obj) {
        return (obj instanceof C7128q1) && j10 == ((C7128q1) obj).m28139y();
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m28131q(long j10, long j11) {
        return C4688c0.m18731h(j10, j11);
    }

    /* JADX INFO: renamed from: r */
    public static final float m28132r(long j10) {
        float fM18785c;
        float f10;
        if (C4688c0.m18729c(63 & j10) == 0) {
            fM18785c = (float) AbstractC4704k0.m18785c(C4688c0.m18729c(C4688c0.m18729c(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fM18785c = (float) AbstractC4704k0.m18785c(C4688c0.m18729c(C4688c0.m18729c(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fM18785c / f10;
    }

    /* JADX INFO: renamed from: s */
    public static final float m28133s(long j10) {
        int i10;
        int i11;
        int i12;
        if (C4688c0.m18729c(63 & j10) == 0) {
            return ((float) AbstractC4704k0.m18785c(C4688c0.m18729c(C4688c0.m18729c(j10 >>> 32) & 255))) / 255.0f;
        }
        short sM18729c = (short) C4688c0.m18729c(C4688c0.m18729c(j10 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i13 = Short.MIN_VALUE & sM18729c;
        int i14 = ((65535 & sM18729c) >>> 10) & 31;
        int i15 = sM18729c & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + Opcodes.IREM;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC7059c2.f23493a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* JADX INFO: renamed from: t */
    public static final AbstractC8027c m28134t(long j10) {
        C8043k c8043k = C8043k.f26795a;
        return c8043k.m30955p()[(int) C4688c0.m18729c(j10 & 63)];
    }

    /* JADX INFO: renamed from: u */
    public static final float m28135u(long j10) {
        int i10;
        int i11;
        int i12;
        if (C4688c0.m18729c(63 & j10) == 0) {
            return ((float) AbstractC4704k0.m18785c(C4688c0.m18729c(C4688c0.m18729c(j10 >>> 40) & 255))) / 255.0f;
        }
        short sM18729c = (short) C4688c0.m18729c(C4688c0.m18729c(j10 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i13 = Short.MIN_VALUE & sM18729c;
        int i14 = ((65535 & sM18729c) >>> 10) & 31;
        int i15 = sM18729c & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + Opcodes.IREM;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC7059c2.f23493a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* JADX INFO: renamed from: v */
    public static final float m28136v(long j10) {
        int i10;
        int i11;
        int i12;
        if (C4688c0.m18729c(63 & j10) == 0) {
            return ((float) AbstractC4704k0.m18785c(C4688c0.m18729c(C4688c0.m18729c(j10 >>> 48) & 255))) / 255.0f;
        }
        short sM18729c = (short) C4688c0.m18729c(C4688c0.m18729c(j10 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i13 = Short.MIN_VALUE & sM18729c;
        int i14 = ((65535 & sM18729c) >>> 10) & 31;
        int i15 = sM18729c & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + Opcodes.IREM;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC7059c2.f23493a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* JADX INFO: renamed from: w */
    public static int m28137w(long j10) {
        return C4688c0.m18732i(j10);
    }

    /* JADX INFO: renamed from: x */
    public static String m28138x(long j10) {
        return "Color(" + m28136v(j10) + ", " + m28135u(j10) + ", " + m28133s(j10) + ", " + m28132r(j10) + ", " + m28134t(j10).m30853f() + ')';
    }

    public boolean equals(Object obj) {
        return m28130p(this.f23658a, obj);
    }

    public int hashCode() {
        return m28137w(this.f23658a);
    }

    public String toString() {
        return m28138x(this.f23658a);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long m28139y() {
        return this.f23658a;
    }

    /* JADX INFO: renamed from: s1.q1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m28140a() {
            return C7128q1.f23645c;
        }

        /* JADX INFO: renamed from: b */
        public final long m28141b() {
            return C7128q1.f23652j;
        }

        /* JADX INFO: renamed from: c */
        public final long m28142c() {
            return C7128q1.f23654l;
        }

        /* JADX INFO: renamed from: d */
        public final long m28143d() {
            return C7128q1.f23651i;
        }

        /* JADX INFO: renamed from: e */
        public final long m28144e() {
            return C7128q1.f23655m;
        }

        /* JADX INFO: renamed from: f */
        public final long m28145f() {
            return C7128q1.f23650h;
        }

        /* JADX INFO: renamed from: g */
        public final long m28146g() {
            return C7128q1.f23656n;
        }

        /* JADX INFO: renamed from: h */
        public final long m28147h() {
            return C7128q1.f23657o;
        }

        /* JADX INFO: renamed from: i */
        public final long m28148i() {
            return C7128q1.f23649g;
        }

        /* JADX INFO: renamed from: j */
        public final long m28149j() {
            return C7128q1.f23653k;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: l */
    public static long m28126l(long j10) {
        return j10;
    }
}
