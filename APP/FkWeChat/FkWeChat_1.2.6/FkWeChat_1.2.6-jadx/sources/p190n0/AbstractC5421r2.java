package p190n0;

import java.util.List;
import p015b0.EnumC0872v1;
import p080f9.AbstractC2368o;
import p121i3.C3189s;
import p135j2.AbstractC3581x;
import p135j2.InterfaceC3578w;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p190n0.C5419r0;
import p215oc.C5729x;
import p250r1.AbstractC6458h;
import p250r1.C6455e;
import p250r1.C6457g;
import p319w2.C9137t3;
import p376zd.C10010p0;

/* JADX INFO: renamed from: n0.r2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5421r2 {

    /* JADX INFO: renamed from: a */
    public static final C6457g f16725a = new C6457g(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: n0.r2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16726a;

        static {
            int[] iArr = new int[EnumC0872v1.values().length];
            try {
                iArr[EnumC0872v1.f2747r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0872v1.f2748s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0872v1.f2746q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16726a = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m22126c(C5415q2 c5415q2, long j10) {
        C5419r0 c5419r0M22064S = c5415q2.m22064S();
        if (c5419r0M22064S == null) {
            return C6455e.f20314b.m25568b();
        }
        EnumC0872v1 enumC0872v1M22051J = c5415q2.m22051J();
        int i10 = enumC0872v1M22051J == null ? -1 : a.f16726a[enumC0872v1M22051J.ordinal()];
        if (i10 == -1) {
            return C6455e.f20314b.m25568b();
        }
        if (i10 == 1) {
            return m22129f(c5415q2, j10, c5419r0M22064S.m22115e());
        }
        if (i10 == 2) {
            return m22129f(c5415q2, j10, c5419r0M22064S.m22113c());
        }
        if (i10 != 3) {
            C5729x.m23182a();
            return 0L;
        }
        C10010p0.m38820a("SelectionContainer does not support cursor");
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m22127d(C6457g c6457g, long j10) {
        float fM25583l = c6457g.m25583l();
        float fM25584m = c6457g.m25584m();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        if (fM25583l > fIntBitsToFloat || fIntBitsToFloat > fM25584m) {
            return false;
        }
        float fM25586o = c6457g.m25586o();
        float fM25580i = c6457g.m25580i();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return fM25586o <= fIntBitsToFloat2 && fIntBitsToFloat2 <= fM25580i;
    }

    /* JADX INFO: renamed from: e */
    public static final List m22128e(List list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : AbstractC5114x.m20803r(AbstractC5081g0.m20576j0(list), AbstractC5081g0.m20587u0(list));
    }

    /* JADX INFO: renamed from: f */
    public static final long m22129f(C5415q2 c5415q2, long j10, C5419r0.a aVar) {
        float fM8585l;
        InterfaceC5401o0 interfaceC5401o0M22033A = c5415q2.m22033A(aVar);
        if (interfaceC5401o0M22033A == null) {
            return C6455e.f20314b.m25568b();
        }
        InterfaceC3578w interfaceC3578wM22035B = c5415q2.m22035B();
        if (interfaceC3578wM22035B == null) {
            return C6455e.f20314b.m25568b();
        }
        InterfaceC3578w interfaceC3578wMo21975B = interfaceC5401o0M22033A.mo21975B();
        if (interfaceC3578wMo21975B == null) {
            return C6455e.f20314b.m25568b();
        }
        int iM22120d = aVar.m22120d();
        if (iM22120d > interfaceC5401o0M22033A.mo21981j()) {
            return C6455e.f20314b.m25568b();
        }
        C6455e c6455eM22043F = c5415q2.m22043F();
        c6455eM22043F.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC3578wMo21975B.mo13253v(interfaceC3578wM22035B, c6455eM22043F.m25566t()) >> 32));
        long jMo21986o = interfaceC5401o0M22033A.mo21986o(iM22120d);
        if (C9137t3.m35517h(jMo21986o)) {
            fM8585l = interfaceC5401o0M22033A.mo21979h(iM22120d);
        } else {
            float fMo21979h = interfaceC5401o0M22033A.mo21979h(C9137t3.m35523n(jMo21986o));
            float fMo21977d = interfaceC5401o0M22033A.mo21977d(C9137t3.m35518i(jMo21986o) - 1);
            fM8585l = AbstractC2368o.m8585l(fIntBitsToFloat, Math.min(fMo21979h, fMo21977d), Math.max(fMo21979h, fMo21977d));
        }
        if (fM8585l == -1.0f) {
            return C6455e.f20314b.m25568b();
        }
        if (!C3189s.m12084e(j10, C3189s.f8481b.m12088a()) && Math.abs(fIntBitsToFloat - fM8585l) > ((int) (j10 >> 32)) / 2) {
            return C6455e.f20314b.m25568b();
        }
        float fMo21982k = interfaceC5401o0M22033A.mo21982k(iM22120d);
        if (fMo21982k == -1.0f) {
            return C6455e.f20314b.m25568b();
        }
        return interfaceC3578wM22035B.mo13253v(interfaceC3578wMo21975B, C6455e.m25551e((((long) Float.floatToRawIntBits(fM8585l)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fMo21982k)))));
    }

    /* JADX INFO: renamed from: g */
    public static final C6457g m22130g(List list, InterfaceC3578w interfaceC3578w) {
        int i10;
        InterfaceC3578w interfaceC3578wMo21975B;
        int[] iArr;
        if (list.isEmpty()) {
            return f16725a;
        }
        C6457g c6457g = f16725a;
        float fM25574b = c6457g.m25574b();
        float fM25575c = c6457g.m25575c();
        float fM25576d = c6457g.m25576d();
        float fM25577e = c6457g.m25577e();
        int size = list.size();
        char c10 = 0;
        int i11 = 0;
        while (i11 < size) {
            C4711r c4711r = (C4711r) list.get(i11);
            InterfaceC5401o0 interfaceC5401o0 = (InterfaceC5401o0) c4711r.m18792a();
            C5419r0 c5419r0 = (C5419r0) c4711r.m18793b();
            int iM22120d = c5419r0.m22115e().m22120d();
            int iM22120d2 = c5419r0.m22113c().m22120d();
            if (iM22120d == iM22120d2 || (interfaceC3578wMo21975B = interfaceC5401o0.mo21975B()) == null) {
                i10 = size;
            } else {
                int iMin = Math.min(iM22120d, iM22120d2);
                int iMax = Math.max(iM22120d, iM22120d2) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[c10] = iMin;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c10] = iMin;
                    iArr2[1] = iMax;
                    iArr = iArr2;
                }
                C6457g c6457g2 = f16725a;
                float fM25574b2 = c6457g2.m25574b();
                float fM25575c2 = c6457g2.m25575c();
                float fM25576d2 = c6457g2.m25576d();
                float fM25577e2 = c6457g2.m25577e();
                int length = iArr.length;
                i10 = size;
                int i12 = 0;
                while (i12 < length) {
                    int i13 = i12;
                    C6457g c6457gMo21976c = interfaceC5401o0.mo21976c(iArr[i13]);
                    fM25574b2 = Math.min(fM25574b2, c6457gMo21976c.m25583l());
                    fM25575c2 = Math.min(fM25575c2, c6457gMo21976c.m25586o());
                    fM25576d2 = Math.max(fM25576d2, c6457gMo21976c.m25584m());
                    fM25577e2 = Math.max(fM25577e2, c6457gMo21976c.m25580i());
                    i12 = i13 + 1;
                }
                long jM25551e = C6455e.m25551e((((long) Float.floatToRawIntBits(fM25574b2)) << 32) | (((long) Float.floatToRawIntBits(fM25575c2)) & 4294967295L));
                long jM25551e2 = C6455e.m25551e((((long) Float.floatToRawIntBits(fM25576d2)) << 32) | (((long) Float.floatToRawIntBits(fM25577e2)) & 4294967295L));
                long jMo13253v = interfaceC3578w.mo13253v(interfaceC3578wMo21975B, jM25551e);
                long jMo13253v2 = interfaceC3578w.mo13253v(interfaceC3578wMo21975B, jM25551e2);
                fM25574b = Math.min(fM25574b, Float.intBitsToFloat((int) (jMo13253v >> 32)));
                fM25575c = Math.min(fM25575c, Float.intBitsToFloat((int) (jMo13253v & 4294967295L)));
                fM25576d = Math.max(fM25576d, Float.intBitsToFloat((int) (jMo13253v2 >> 32)));
                fM25577e = Math.max(fM25577e, Float.intBitsToFloat((int) (jMo13253v2 & 4294967295L)));
            }
            i11++;
            size = i10;
            c10 = 0;
        }
        return new C6457g(fM25574b, fM25575c, fM25576d, fM25577e);
    }

    /* JADX INFO: renamed from: h */
    public static final C5419r0 m22131h(C5419r0 c5419r0, C5419r0 c5419r02) {
        C5419r0 c5419r0M22116f;
        return (c5419r0 == null || (c5419r0M22116f = c5419r0.m22116f(c5419r02)) == null) ? c5419r02 : c5419r0M22116f;
    }

    /* JADX INFO: renamed from: i */
    public static final C6457g m22132i(InterfaceC3578w interfaceC3578w) {
        C6457g c6457gM13413d = AbstractC3581x.m13413d(interfaceC3578w, true);
        return AbstractC6458h.m25595a(interfaceC3578w.mo13241Z(c6457gM13413d.m25587p()), interfaceC3578w.mo13241Z(c6457gM13413d.m25581j()));
    }
}
