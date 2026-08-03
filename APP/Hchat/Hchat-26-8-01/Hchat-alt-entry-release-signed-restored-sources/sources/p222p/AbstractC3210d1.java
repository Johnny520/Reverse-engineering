package p222p;

import gg.AbstractC1416l;
import p117i0.C1836h0;
import p117i0.C1851l;
import p356y0.C5840b;
import p356y0.C5844f;

/* JADX INFO: renamed from: p.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3210d1 {

    /* JADX INFO: renamed from: a */
    public static final C3213e1 f10260a = new C3213e1(AbstractC3226j.f10298a, C5840b.f23770p);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C3213e1 m6892a(InterfaceC3217g interfaceC3217g, C5844f c5844f, C1836h0 c1836h0, int i9) {
        if (AbstractC1416l.m3825a(interfaceC3217g, AbstractC3226j.f10298a) && AbstractC1416l.m3825a(c5844f, C5840b.f23770p)) {
            c1836h0.m4525a0(-1073830487);
            c1836h0.m4553p(false);
            return f10260a;
        }
        c1836h0.m4525a0(-1073779616);
        boolean z9 = true;
        boolean z10 = (((i9 & 14) ^ 6) > 4 && c1836h0.m4534f(interfaceC3217g)) || (i9 & 6) == 4;
        if ((((i9 & 112) ^ 48) <= 32 || !c1836h0.m4534f(c5844f)) && (i9 & 48) != 32) {
            z9 = false;
        }
        boolean z11 = z10 | z9;
        Object objM4514P = c1836h0.m4514P();
        if (z11 || objM4514P == C1851l.f6155a) {
            objM4514P = new C3213e1(interfaceC3217g, c5844f);
            c1836h0.m4545k0(objM4514P);
        }
        C3213e1 c3213e1 = (C3213e1) objM4514P;
        c1836h0.m4553p(false);
        return c3213e1;
    }
}
