package p076P;

import p077P0.AbstractC1126m;
import p091S.AbstractC1242n;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p193l0.AbstractC2485h;
import p204n0.C2686e;
import p211o0.C2753l;
import p211o0.C2762u;
import p239t0.AbstractC3207b;
import p244u.AbstractC3261c;
import p244u.AbstractC3282o;
import p245u0.AbstractC3305b;
import p245u0.C3309f;

/* JADX INFO: renamed from: P.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1056B {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2207p f3298a = AbstractC3261c.m5533t(C2204m.f7185a, AbstractC1242n.f4282a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2124a(AbstractC3207b abstractC3207b, String str, InterfaceC2207p interfaceC2207p, long j5, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        InterfaceC2207p interfaceC2207pM2162a;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-2142239481);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2586h(abstractC3207b) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2582f(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2582f(interfaceC2207p) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c1383r.m2580e(j5) ? 2048 : 1024;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 1171) != 1170)) {
            c1383r.m2565T();
            if ((i5 & 1) != 0 && !c1383r.m2606y()) {
                c1383r.m2563R();
            }
            c1383r.m2598q();
            boolean z5 = (((i6 & 7168) ^ 3072) > 2048 && c1383r.m2580e(j5)) || (i6 & 3072) == 2048;
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (z5 || objM2558L == c1357e) {
                objM2558L = C2762u.m4921c(j5, C2762u.f8762g) ? null : new C2753l(j5, 5);
                c1383r.m2585g0(objM2558L);
            }
            C2753l c2753l = (C2753l) objM2558L;
            InterfaceC2207p interfaceC2207p2 = C2204m.f7185a;
            if (str != null) {
                c1383r.m2568W(-536990979);
                boolean z6 = (i6 & 112) == 32;
                Object objM2558L2 = c1383r.m2558L();
                if (z6 || objM2558L2 == c1357e) {
                    objM2558L2 = new C1108u(str, 1);
                    c1383r.m2585g0(objM2558L2);
                }
                interfaceC2207pM2162a = AbstractC1126m.m2162a(interfaceC2207p2, false, (InterfaceC1601c) objM2558L2);
                c1383r.m2597p(false);
            } else {
                c1383r.m2568W(-536832197);
                c1383r.m2597p(false);
                interfaceC2207pM2162a = interfaceC2207p2;
            }
            if (!C2686e.m4661a(abstractC3207b.mo5483d(), 9205357640488583168L)) {
                long jMo5483d = abstractC3207b.mo5483d();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jMo5483d >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jMo5483d & 4294967295L)))) {
                    interfaceC2207p2 = f3298a;
                }
                AbstractC3282o.m5558a(AbstractC2485h.m4432f(interfaceC2207p.mo4021c(interfaceC2207p2), abstractC3207b, c2753l).mo4021c(interfaceC2207pM2162a), c1383r, 0);
            }
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C1055A(abstractC3207b, str, interfaceC2207p, j5, i5, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2125b(C3309f c3309f, String str, InterfaceC2207p interfaceC2207p, long j5, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-126890956);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2582f(c3309f) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2582f(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2582f(interfaceC2207p) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c1383r.m2580e(j5) ? 2048 : 1024;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 1171) != 1170)) {
            c1383r.m2565T();
            if ((i5 & 1) != 0 && !c1383r.m2606y()) {
                c1383r.m2563R();
            }
            c1383r.m2598q();
            m2124a(AbstractC3305b.m5573d(c3309f, c1383r), str, interfaceC2207p, j5, c1383r, (i6 & 112) | 8 | (i6 & 896) | (i6 & 7168));
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C1055A(c3309f, str, interfaceC2207p, j5, i5, 0);
        }
    }
}
