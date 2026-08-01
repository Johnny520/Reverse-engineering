package p000A;

import com.bumptech.glide.AbstractC1923e;
import p058L.InterfaceC0940l;
import p077P0.AbstractC1126m;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p136b0.AbstractC1848j;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p244u.AbstractC3261c;

/* JADX INFO: renamed from: A.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0063h {

    /* JADX INFO: renamed from: a */
    public static final float f292a;

    /* JADX INFO: renamed from: b */
    public static final float f293b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float f2 = 25;
        f292a = f2;
        f293b = (f2 * 2.0f) / 2.4142137f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m61a(InterfaceC0940l interfaceC0940l, InterfaceC2207p interfaceC2207p, long j5, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1776202187);
        int i7 = (c1383r.m2582f(interfaceC0940l) ? 4 : 2) | i5 | (c1383r.m2582f(interfaceC2207p) ? 32 : 16) | 128;
        if (c1383r.m2560O(i7 & 1, (i7 & 147) != 146)) {
            c1383r.m2565T();
            if ((i5 & 1) == 0 || c1383r.m2606y()) {
                i6 = i7 & (-897);
                j5 = 9205357640488583168L;
            } else {
                c1383r.m2563R();
                i6 = i7 & (-897);
            }
            c1383r.m2598q();
            int i8 = i6 & 14;
            boolean z5 = i8 == 4;
            Object objM2558L = c1383r.m2558L();
            if (z5 || objM2558L == C1371l.f4833a) {
                objM2558L = new C0049a(0, interfaceC0940l);
                c1383r.m2585g0(objM2558L);
            }
            AbstractC1923e.m3463a(interfaceC0940l, C2194c.f7161e, AbstractC1848j.m3314c(-1653527038, new C0051b(j5, AbstractC1126m.m2162a(interfaceC2207p, false, (InterfaceC1601c) objM2558L)), c1383r), c1383r, i8 | 432);
        } else {
            c1383r.m2563R();
        }
        long j6 = j5;
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0053c(interfaceC0940l, interfaceC2207p, j6, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m62b(InterfaceC2207p interfaceC2207p, InterfaceC1373m interfaceC1373m, int i5, int i6) {
        int i7;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(694251107);
        int i8 = i6 & 1;
        if (i8 != 0) {
            i7 = i5 | 6;
        } else {
            i7 = (c1383r.m2582f(interfaceC2207p) ? 4 : 2) | i5;
        }
        if (c1383r.m2560O(i7 & 1, (i7 & 3) != 2)) {
            if (i8 != 0) {
                interfaceC2207p = C2204m.f7185a;
            }
            AbstractC3261c.m5516c(c1383r, AbstractC2192a.m4014a(AbstractC3261c.m5534u(interfaceC2207p, f293b, f292a), new C0057e(0)));
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0055d(interfaceC2207p, i5, i6);
        }
    }
}
