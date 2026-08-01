package p166l2;

import p024b9.AbstractC1061t;
import p120i2.AbstractC3167a;
import p165l1.InterfaceC4507m;
import p314vb.C8897d;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l2.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4565m extends InterfaceC4507m.c {

    /* JADX INFO: renamed from: F */
    public final int f13419F = AbstractC4551i1.m17823g(this);

    /* JADX INFO: renamed from: G */
    public InterfaceC4507m.c f13420G;

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: F2 */
    public void mo17451F2(AbstractC4539f1 abstractC4539f1) {
        super.mo17451F2(abstractC4539f1);
        for (InterfaceC4507m.c cVarM18050H2 = m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
            cVarM18050H2.mo17451F2(abstractC4539f1);
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final InterfaceC4553j m18049G2(InterfaceC4553j interfaceC4553j) {
        InterfaceC4507m.c cVarMo17471z = interfaceC4553j.mo17471z();
        if (cVarMo17471z != interfaceC4553j) {
            InterfaceC4507m.c cVar = interfaceC4553j instanceof InterfaceC4507m.c ? (InterfaceC4507m.c) interfaceC4553j : null;
            InterfaceC4507m.c cVarM17459j2 = cVar != null ? cVar.m17459j2() : null;
            if (cVarMo17471z == mo17471z() && AbstractC1061t.m3842c(cVarM17459j2, this)) {
                return interfaceC4553j;
            }
            C10010p0.m38820a("Cannot delegate to an already delegated node");
            return null;
        }
        if (cVarMo17471z.m17461m2()) {
            AbstractC3167a.m11956b("Cannot delegate to an already attached node");
        }
        cVarMo17471z.mo17468w2(mo17471z());
        int iM17457h2 = m17457h2();
        int iM17824h = AbstractC4551i1.m17824h(cVarMo17471z);
        cVarMo17471z.m17446A2(iM17824h);
        m18054L2(iM17824h, cVarMo17471z);
        cVarMo17471z.m17469x2(this.f13420G);
        this.f13420G = cVarMo17471z;
        cVarMo17471z.m17448C2(this);
        m18053K2(m17457h2() | iM17824h, false);
        if (m17461m2()) {
            if ((iM17824h & AbstractC4547h1.m17812a(2)) == 0 || (iM17457h2 & AbstractC4547h1.m17812a(2)) != 0) {
                mo17451F2(m17454e2());
            } else {
                C4531d1 c4531d1M17965v0 = AbstractC4557k.m18015q(this).m17965v0();
                mo17471z().mo17451F2(null);
                c4531d1M17965v0.m17589C();
            }
            cVarMo17471z.mo17462n2();
            cVarMo17471z.mo17465t2();
            AbstractC4551i1.m17817a(cVarMo17471z);
        }
        return interfaceC4553j;
    }

    /* JADX INFO: renamed from: H2 */
    public final InterfaceC4507m.c m18050H2() {
        return this.f13420G;
    }

    /* JADX INFO: renamed from: I2 */
    public final int m18051I2() {
        return this.f13419F;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m18052J2(InterfaceC4553j interfaceC4553j) {
        InterfaceC4507m.c cVar = null;
        for (InterfaceC4507m.c cVarM17453d2 = this.f13420G; cVarM17453d2 != null; cVarM17453d2 = cVarM17453d2.m17453d2()) {
            if (cVarM17453d2 == interfaceC4553j) {
                if (cVarM17453d2.m17461m2()) {
                    AbstractC4551i1.m17820d(cVarM17453d2);
                    cVarM17453d2.mo17466u2();
                    cVarM17453d2.mo17463o2();
                }
                cVarM17453d2.mo17468w2(cVarM17453d2);
                cVarM17453d2.m17467v2(0);
                if (cVar == null) {
                    this.f13420G = cVarM17453d2.m17453d2();
                } else {
                    cVar.m17469x2(cVarM17453d2.m17453d2());
                }
                cVarM17453d2.m17469x2(null);
                cVarM17453d2.m17448C2(null);
                int iM17457h2 = m17457h2();
                int iM17824h = AbstractC4551i1.m17824h(this);
                m18053K2(iM17824h, true);
                if (m17461m2() && (iM17457h2 & AbstractC4547h1.m17812a(2)) != 0 && (AbstractC4547h1.m17812a(2) & iM17824h) == 0) {
                    C4531d1 c4531d1M17965v0 = AbstractC4557k.m18015q(this).m17965v0();
                    mo17471z().mo17451F2(null);
                    c4531d1M17965v0.m17589C();
                    return;
                }
                return;
            }
            cVar = cVarM17453d2;
        }
        C8897d.m34134a("Could not find delegate: ", interfaceC4553j);
    }

    /* JADX INFO: renamed from: K2 */
    public final void m18053K2(int i10, boolean z10) {
        InterfaceC4507m.c cVarM17453d2;
        int iM17457h2 = m17457h2();
        m17446A2(i10);
        if (iM17457h2 != i10) {
            if (AbstractC4557k.m18007i(this)) {
                m17467v2(i10);
            }
            if (m17461m2()) {
                InterfaceC4507m.c cVarMo17471z = mo17471z();
                InterfaceC4507m.c cVarM17459j2 = this;
                while (cVarM17459j2 != null) {
                    i10 |= cVarM17459j2.m17457h2();
                    cVarM17459j2.m17446A2(i10);
                    if (cVarM17459j2 == cVarMo17471z) {
                        break;
                    } else {
                        cVarM17459j2 = cVarM17459j2.m17459j2();
                    }
                }
                if (z10 && cVarM17459j2 == cVarMo17471z) {
                    i10 = AbstractC4551i1.m17824h(cVarMo17471z);
                    cVarMo17471z.m17446A2(i10);
                }
                int iM17452c2 = i10 | ((cVarM17459j2 == null || (cVarM17453d2 = cVarM17459j2.m17453d2()) == null) ? 0 : cVarM17453d2.m17452c2());
                while (cVarM17459j2 != null) {
                    iM17452c2 |= cVarM17459j2.m17457h2();
                    cVarM17459j2.m17467v2(iM17452c2);
                    cVarM17459j2 = cVarM17459j2.m17459j2();
                }
            }
        }
    }

    /* JADX INFO: renamed from: L2 */
    public final void m18054L2(int i10, InterfaceC4507m.c cVar) {
        int iM17457h2 = m17457h2();
        if ((i10 & AbstractC4547h1.m17812a(2)) == 0 || (AbstractC4547h1.m17812a(2) & iM17457h2) == 0 || (this instanceof InterfaceC4534e0)) {
            return;
        }
        AbstractC3167a.m11956b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: n2 */
    public void mo17462n2() {
        super.mo17462n2();
        for (InterfaceC4507m.c cVarM18050H2 = m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
            cVarM18050H2.mo17451F2(m17454e2());
            if (!cVarM18050H2.m17461m2()) {
                cVarM18050H2.mo17462n2();
            }
        }
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: o2 */
    public void mo17463o2() {
        for (InterfaceC4507m.c cVarM18050H2 = m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
            cVarM18050H2.mo17463o2();
        }
        super.mo17463o2();
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: s2 */
    public void mo17464s2() {
        super.mo17464s2();
        for (InterfaceC4507m.c cVarM18050H2 = m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
            cVarM18050H2.mo17464s2();
        }
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: t2 */
    public void mo17465t2() {
        for (InterfaceC4507m.c cVarM18050H2 = m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
            cVarM18050H2.mo17465t2();
        }
        super.mo17465t2();
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: u2 */
    public void mo17466u2() {
        super.mo17466u2();
        for (InterfaceC4507m.c cVarM18050H2 = m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
            cVarM18050H2.mo17466u2();
        }
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: w2 */
    public void mo17468w2(InterfaceC4507m.c cVar) {
        super.mo17468w2(cVar);
        for (InterfaceC4507m.c cVarM18050H2 = m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
            cVarM18050H2.mo17468w2(cVar);
        }
    }
}
