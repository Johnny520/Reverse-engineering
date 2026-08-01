package p244u;

import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p117X2.AbstractC1665j;
import p169h0.C2194c;
import p169h0.C2198g;

/* JADX INFO: renamed from: u.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3255Y {

    /* JADX INFO: renamed from: a */
    public static final C3256Z f10071a = new C3256Z(AbstractC3273i.f10110a, C2194c.f7169m);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C3256Z m5504a(InterfaceC3267f interfaceC3267f, C2198g c2198g, InterfaceC1373m interfaceC1373m, int i5) {
        if (AbstractC1665j.m2981a(interfaceC3267f, AbstractC3273i.f10110a) && AbstractC1665j.m2981a(c2198g, C2194c.f7169m)) {
            C1383r c1383r = (C1383r) interfaceC1373m;
            c1383r.m2568W(-1073830487);
            c1383r.m2597p(false);
            return f10071a;
        }
        C1383r c1383r2 = (C1383r) interfaceC1373m;
        c1383r2.m2568W(-1073779616);
        boolean z5 = true;
        boolean z6 = (((i5 & 14) ^ 6) > 4 && c1383r2.m2582f(interfaceC3267f)) || (i5 & 6) == 4;
        if ((((i5 & 112) ^ 48) <= 32 || !c1383r2.m2582f(c2198g)) && (i5 & 48) != 32) {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        Object objM2558L = c1383r2.m2558L();
        if (z7 || objM2558L == C1371l.f4833a) {
            objM2558L = new C3256Z(interfaceC3267f, c2198g);
            c1383r2.m2585g0(objM2558L);
        }
        C3256Z c3256z = (C3256Z) objM2558L;
        c1383r2.m2597p(false);
        return c3256z;
    }
}
