package p135j2;

import p166l2.AbstractC4539f1;
import p250r1.C6455e;
import p250r1.C6457g;

/* JADX INFO: renamed from: j2.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3581x {
    /* JADX INFO: renamed from: a */
    public static final C6457g m13410a(InterfaceC3578w interfaceC3578w) {
        C6457g c6457gM13371r0;
        InterfaceC3578w interfaceC3578wMo13248h0 = interfaceC3578w.mo13248h0();
        return (interfaceC3578wMo13248h0 == null || (c6457gM13371r0 = InterfaceC3578w.m13371r0(interfaceC3578wMo13248h0, interfaceC3578w, false, 2, null)) == null) ? new C6457g(0.0f, 0.0f, (int) (interfaceC3578w.mo13242a() >> 32), (int) (interfaceC3578w.mo13242a() & 4294967295L)) : c6457gM13371r0;
    }

    /* JADX INFO: renamed from: b */
    public static final C6457g m13411b(InterfaceC3578w interfaceC3578w) {
        return InterfaceC3578w.m13371r0(m13415f(interfaceC3578w), interfaceC3578w, false, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static final C6457g m13413d(InterfaceC3578w interfaceC3578w, boolean z10) {
        InterfaceC3578w interfaceC3578wM13415f = m13415f(interfaceC3578w);
        float fMo13242a = (int) (interfaceC3578wM13415f.mo13242a() >> 32);
        float fMo13242a2 = (int) (interfaceC3578wM13415f.mo13242a() & 4294967295L);
        C6457g c6457gMo13249j0 = interfaceC3578wM13415f.mo13249j0(interfaceC3578w, z10);
        float fM25583l = c6457gMo13249j0.m25583l();
        if (z10) {
            if (fM25583l < 0.0f) {
                fM25583l = 0.0f;
            }
            if (fM25583l > fMo13242a) {
                fM25583l = fMo13242a;
            }
        }
        float fM25586o = c6457gMo13249j0.m25586o();
        if (z10) {
            if (fM25586o < 0.0f) {
                fM25586o = 0.0f;
            }
            if (fM25586o > fMo13242a2) {
                fM25586o = fMo13242a2;
            }
        }
        if (z10) {
            float fM25584m = c6457gMo13249j0.m25584m();
            if (fM25584m < 0.0f) {
                fM25584m = 0.0f;
            }
            if (fM25584m <= fMo13242a) {
                fMo13242a = fM25584m;
            }
        } else {
            fMo13242a = c6457gMo13249j0.m25584m();
        }
        if (z10) {
            float fM25580i = c6457gMo13249j0.m25580i();
            float f10 = fM25580i >= 0.0f ? fM25580i : 0.0f;
            if (f10 <= fMo13242a2) {
                fMo13242a2 = f10;
            }
        } else {
            fMo13242a2 = c6457gMo13249j0.m25580i();
        }
        if (fM25583l == fMo13242a || fM25586o == fMo13242a2) {
            return C6457g.f20319e.m25594a();
        }
        long jMo13254x = interfaceC3578wM13415f.mo13254x(C6455e.m25551e((((long) Float.floatToRawIntBits(fM25583l)) << 32) | (((long) Float.floatToRawIntBits(fM25586o)) & 4294967295L)));
        long jMo13254x2 = interfaceC3578wM13415f.mo13254x(C6455e.m25551e((((long) Float.floatToRawIntBits(fMo13242a)) << 32) | (((long) Float.floatToRawIntBits(fM25586o)) & 4294967295L)));
        long jMo13254x3 = interfaceC3578wM13415f.mo13254x(C6455e.m25551e((((long) Float.floatToRawIntBits(fMo13242a)) << 32) | (((long) Float.floatToRawIntBits(fMo13242a2)) & 4294967295L)));
        long jMo13254x4 = interfaceC3578wM13415f.mo13254x(C6455e.m25551e((((long) Float.floatToRawIntBits(fMo13242a2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM25583l)) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo13254x >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo13254x2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo13254x4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo13254x3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo13254x & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo13254x2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo13254x4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo13254x3 & 4294967295L));
        return new C6457g(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C6457g m13414e(InterfaceC3578w interfaceC3578w, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m13413d(interfaceC3578w, z10);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC3578w m13415f(InterfaceC3578w interfaceC3578w) {
        InterfaceC3578w interfaceC3578w2;
        InterfaceC3578w interfaceC3578wMo13248h0 = interfaceC3578w.mo13248h0();
        while (true) {
            InterfaceC3578w interfaceC3578w3 = interfaceC3578wMo13248h0;
            interfaceC3578w2 = interfaceC3578w;
            interfaceC3578w = interfaceC3578w3;
            if (interfaceC3578w == null) {
                break;
            }
            interfaceC3578wMo13248h0 = interfaceC3578w.mo13248h0();
        }
        AbstractC4539f1 abstractC4539f1 = interfaceC3578w2 instanceof AbstractC4539f1 ? (AbstractC4539f1) interfaceC3578w2 : null;
        if (abstractC4539f1 == null) {
            return interfaceC3578w2;
        }
        AbstractC4539f1 abstractC4539f1M17716X2 = abstractC4539f1.m17716X2();
        while (true) {
            AbstractC4539f1 abstractC4539f12 = abstractC4539f1M17716X2;
            AbstractC4539f1 abstractC4539f13 = abstractC4539f1;
            abstractC4539f1 = abstractC4539f12;
            if (abstractC4539f1 == null) {
                return abstractC4539f13;
            }
            abstractC4539f1M17716X2 = abstractC4539f1.m17716X2();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final long m13416g(InterfaceC3578w interfaceC3578w) {
        return interfaceC3578w.mo13252u0(C6455e.f20314b.m25569c());
    }

    /* JADX INFO: renamed from: h */
    public static final long m13417h(InterfaceC3578w interfaceC3578w) {
        return interfaceC3578w.mo13254x(C6455e.f20314b.m25569c());
    }

    /* JADX INFO: renamed from: i */
    public static final long m13418i(InterfaceC3578w interfaceC3578w) {
        return interfaceC3578w.mo13247g(C6455e.f20314b.m25569c());
    }
}
