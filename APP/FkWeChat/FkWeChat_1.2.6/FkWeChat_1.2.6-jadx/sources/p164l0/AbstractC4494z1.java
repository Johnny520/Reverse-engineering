package p164l0;

import android.graphics.PointF;
import p015b0.C0831p2;
import p015b0.C0882w4;
import p018b3.C0963m;
import p018b3.InterfaceC0955i;
import p135j2.InterfaceC3578w;
import p179m2.InterfaceC4862j3;
import p250r1.C6455e;
import p250r1.C6457g;
import p319w2.AbstractC9092k3;
import p319w2.AbstractC9142u3;
import p319w2.C9103n;
import p319w2.C9122q3;
import p319w2.C9137t3;
import p319w2.InterfaceC9112o3;

/* JADX INFO: renamed from: l0.z1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4494z1 {

    /* JADX INFO: renamed from: l0.z1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0955i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0955i[] f13016a;

        public a(InterfaceC0955i[] interfaceC0955iArr) {
            this.f13016a = interfaceC0955iArr;
        }

        @Override // p018b3.InterfaceC0955i
        /* JADX INFO: renamed from: a */
        public void mo3444a(C0963m c0963m) {
            for (InterfaceC0955i interfaceC0955i : this.f13016a) {
                interfaceC0955i.mo3444a(c0963m);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final long m17384j(long j10, CharSequence charSequence) {
        int iM35523n = C9137t3.m35523n(j10);
        int iM35518i = C9137t3.m35518i(j10);
        int iCodePointBefore = iM35523n > 0 ? Character.codePointBefore(charSequence, iM35523n) : 10;
        int iCodePointAt = iM35518i < charSequence.length() ? Character.codePointAt(charSequence, iM35518i) : 10;
        if (m17398x(iCodePointBefore) && (m17397w(iCodePointAt) || m17396v(iCodePointAt))) {
            do {
                iM35523n -= Character.charCount(iCodePointBefore);
                if (iM35523n == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iM35523n);
            } while (m17398x(iCodePointBefore));
            return AbstractC9142u3.m35530b(iM35523n, iM35518i);
        }
        if (!m17398x(iCodePointAt)) {
            return j10;
        }
        if (!m17397w(iCodePointBefore) && !m17396v(iCodePointBefore)) {
            return j10;
        }
        do {
            iM35518i += Character.charCount(iCodePointAt);
            if (iM35518i == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iM35518i);
        } while (m17398x(iCodePointAt));
        return AbstractC9142u3.m35530b(iM35523n, iM35518i);
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC0955i m17385k(InterfaceC0955i... interfaceC0955iArr) {
        return new a(interfaceC0955iArr);
    }

    /* JADX INFO: renamed from: l */
    public static final long m17386l(long j10, long j11) {
        return AbstractC9142u3.m35530b(Math.min(C9137t3.m35523n(j10), C9137t3.m35523n(j10)), Math.max(C9137t3.m35518i(j11), C9137t3.m35518i(j11)));
    }

    /* JADX INFO: renamed from: m */
    public static final int m17387m(C9103n c9103n, long j10, InterfaceC4862j3 interfaceC4862j3) {
        float fMo19409h = interfaceC4862j3 != null ? interfaceC4862j3.mo19409h() : 0.0f;
        int i10 = (int) (4294967295L & j10);
        int iM35348s = c9103n.m35348s(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) >= c9103n.m35353x(iM35348s) - fMo19409h && Float.intBitsToFloat(i10) <= c9103n.m35344n(iM35348s) + fMo19409h) {
            int i11 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i11) >= (-fMo19409h) && Float.intBitsToFloat(i11) <= c9103n.m35326F() + fMo19409h) {
                return iM35348s;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static final int m17388n(C0831p2 c0831p2, long j10, InterfaceC4862j3 interfaceC4862j3) {
        C9122q3 c9122q3M3243f;
        C9103n c9103nM35403w;
        C0882w4 c0882w4M3120n = c0831p2.m3120n();
        if (c0882w4M3120n == null || (c9122q3M3243f = c0882w4M3120n.m3243f()) == null || (c9103nM35403w = c9122q3M3243f.m35403w()) == null) {
            return -1;
        }
        return m17389o(c9103nM35403w, j10, c0831p2.m3119m(), interfaceC4862j3);
    }

    /* JADX INFO: renamed from: o */
    public static final int m17389o(C9103n c9103n, long j10, InterfaceC3578w interfaceC3578w, InterfaceC4862j3 interfaceC4862j3) {
        long jMo13250q;
        int iM17387m;
        if (interfaceC3578w == null || (iM17387m = m17387m(c9103n, (jMo13250q = interfaceC3578w.mo13250q(j10)), interfaceC4862j3)) == -1) {
            return -1;
        }
        return c9103n.m35355z(C6455e.m25553g(jMo13250q, 0.0f, (c9103n.m35353x(iM17387m) + c9103n.m35344n(iM17387m)) / 2.0f, 1, null));
    }

    /* JADX INFO: renamed from: p */
    public static final long m17390p(C9122q3 c9122q3, long j10, long j11, InterfaceC3578w interfaceC3578w, InterfaceC4862j3 interfaceC4862j3) {
        if (c9122q3 == null || interfaceC3578w == null) {
            return C9137t3.f31232b.m35528a();
        }
        long jMo13250q = interfaceC3578w.mo13250q(j10);
        long jMo13250q2 = interfaceC3578w.mo13250q(j11);
        int iM17387m = m17387m(c9122q3.m35403w(), jMo13250q, interfaceC4862j3);
        int iM17387m2 = m17387m(c9122q3.m35403w(), jMo13250q2, interfaceC4862j3);
        if (iM17387m != -1) {
            if (iM17387m2 != -1) {
                iM17387m = Math.min(iM17387m, iM17387m2);
            }
            iM17387m2 = iM17387m;
        } else if (iM17387m2 == -1) {
            return C9137t3.f31232b.m35528a();
        }
        float fM35402v = (c9122q3.m35402v(iM17387m2) + c9122q3.m35394m(iM17387m2)) / 2;
        int i10 = (int) (jMo13250q >> 32);
        int i11 = (int) (jMo13250q2 >> 32);
        return c9122q3.m35403w().m35325E(new C6457g(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fM35402v - 0.1f, Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fM35402v + 0.1f), AbstractC9092k3.f31142a.m35313a(), InterfaceC9112o3.f31161a.m35359d());
    }

    /* JADX INFO: renamed from: q */
    public static final long m17391q(C9103n c9103n, C6457g c6457g, InterfaceC3578w interfaceC3578w, int i10, InterfaceC9112o3 interfaceC9112o3) {
        return (c9103n == null || interfaceC3578w == null) ? C9137t3.f31232b.m35528a() : c9103n.m35325E(c6457g.m25593v(interfaceC3578w.mo13250q(C6455e.f20314b.m25569c())), i10, interfaceC9112o3);
    }

    /* JADX INFO: renamed from: r */
    public static final long m17392r(C0831p2 c0831p2, C6457g c6457g, int i10, InterfaceC9112o3 interfaceC9112o3) {
        C9122q3 c9122q3M3243f;
        C0882w4 c0882w4M3120n = c0831p2.m3120n();
        return m17391q((c0882w4M3120n == null || (c9122q3M3243f = c0882w4M3120n.m3243f()) == null) ? null : c9122q3M3243f.m35403w(), c6457g, c0831p2.m3119m(), i10, interfaceC9112o3);
    }

    /* JADX INFO: renamed from: s */
    public static final long m17393s(C0831p2 c0831p2, C6457g c6457g, C6457g c6457g2, int i10, InterfaceC9112o3 interfaceC9112o3) {
        long jM17392r = m17392r(c0831p2, c6457g, i10, interfaceC9112o3);
        if (C9137t3.m35517h(jM17392r)) {
            return C9137t3.f31232b.m35528a();
        }
        long jM17392r2 = m17392r(c0831p2, c6457g2, i10, interfaceC9112o3);
        return C9137t3.m35517h(jM17392r2) ? C9137t3.f31232b.m35528a() : m17386l(jM17392r, jM17392r2);
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m17394t(C9122q3 c9122q3, int i10) {
        int iM35397q = c9122q3.m35397q(i10);
        return (i10 == c9122q3.m35401u(iM35397q) || i10 == C9122q3.m35379p(c9122q3, iM35397q, false, 2, null)) ? c9122q3.m35405y(i10) != c9122q3.m35384c(i10) : c9122q3.m35384c(i10) != c9122q3.m35384c(i10 - 1);
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m17395u(int i10) {
        int type = Character.getType(i10);
        return type == 14 || type == 13 || i10 == 10;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m17396v(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m17397w(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m17398x(int i10) {
        return m17397w(i10) && !m17395u(i10);
    }

    /* JADX INFO: renamed from: y */
    public static final long m17399y(CharSequence charSequence, int i10) {
        int iCharCount = i10;
        while (iCharCount > 0) {
            int iM17254c = AbstractC4425h.m17254c(charSequence, iCharCount);
            if (!m17397w(iM17254c)) {
                break;
            }
            iCharCount -= Character.charCount(iM17254c);
        }
        while (i10 < charSequence.length()) {
            int iM17253b = AbstractC4425h.m17253b(charSequence, i10);
            if (!m17397w(iM17253b)) {
                break;
            }
            i10 += AbstractC4425h.m17252a(iM17253b);
        }
        return AbstractC9142u3.m35530b(iCharCount, i10);
    }

    /* JADX INFO: renamed from: z */
    public static final long m17400z(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return C6455e.m25551e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }
}
