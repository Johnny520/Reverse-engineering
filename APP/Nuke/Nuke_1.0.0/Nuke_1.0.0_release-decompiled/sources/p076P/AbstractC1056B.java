package p076P;

import p091S.AbstractC1242n;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p244u.AbstractC3261c;
import p245u0.AbstractC3305b;
import p245u0.C3309f;

/* JADX INFO: renamed from: P.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1056B {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2207p f3298a = AbstractC3261c.m5533t(C2204m.f7185a, AbstractC1242n.f4282a);

    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2124a(p239t0.AbstractC3207b r16, java.lang.String r17, p169h0.InterfaceC2207p r18, long r19, p095T.InterfaceC1373m r21, int r22) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p076P.AbstractC1056B.m2124a(t0.b, java.lang.String, h0.p, long, T.m, int):void");
    }

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
