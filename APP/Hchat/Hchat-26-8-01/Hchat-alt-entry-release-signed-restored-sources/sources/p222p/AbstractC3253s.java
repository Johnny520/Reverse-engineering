package p222p;

import gg.AbstractC1416l;
import p117i0.C1836h0;
import p117i0.C1851l;
import p356y0.C5840b;
import p356y0.C5843e;

/* JADX INFO: renamed from: p.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3253s {

    /* JADX INFO: renamed from: a */
    public static final C3256t f10357a = new C3256t(AbstractC3226j.f10300c, C5840b.f23773s);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C3256t m6935a(InterfaceC3223i interfaceC3223i, C5843e c5843e, C1836h0 c1836h0, int i9) {
        if (AbstractC1416l.m3825a(interfaceC3223i, AbstractC3226j.f10300c) && c5843e.equals(C5840b.f23773s)) {
            c1836h0.m4525a0(-1446604504);
            c1836h0.m4553p(false);
            return f10357a;
        }
        c1836h0.m4525a0(-1446550657);
        boolean z9 = true;
        boolean z10 = (((i9 & 14) ^ 6) > 4 && c1836h0.m4534f(interfaceC3223i)) || (i9 & 6) == 4;
        if ((((i9 & 112) ^ 48) <= 32 || !c1836h0.m4534f(c5843e)) && (i9 & 48) != 32) {
            z9 = false;
        }
        boolean z11 = z10 | z9;
        Object objM4514P = c1836h0.m4514P();
        if (z11 || objM4514P == C1851l.f6155a) {
            objM4514P = new C3256t(interfaceC3223i, c5843e);
            c1836h0.m4545k0(objM4514P);
        }
        C3256t c3256t = (C3256t) objM4514P;
        c1836h0.m4553p(false);
        return c3256t;
    }
}
