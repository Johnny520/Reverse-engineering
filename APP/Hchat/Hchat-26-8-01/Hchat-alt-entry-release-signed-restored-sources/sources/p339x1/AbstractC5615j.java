package p339x1;

import gg.AbstractC1416l;
import okio.C3193a;
import p069f.C0925b0;
import p136j8.C2104o;
import p292u1.AbstractC4229a;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: x1.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5615j extends AbstractC5852n {

    /* JADX INFO: renamed from: u */
    public final int f22874u = AbstractC5617j1.m10139e(this);

    /* JADX INFO: renamed from: v */
    public AbstractC5852n f22875v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: a1 */
    public final void mo10115a1() {
        super.mo10115a1();
        for (AbstractC5852n abstractC5852n = this.f22875v; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
            abstractC5852n.mo10121j1(this.f23795n);
            if (!abstractC5852n.f23801t) {
                abstractC5852n.mo10115a1();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: b1 */
    public final void mo10116b1() {
        for (AbstractC5852n abstractC5852n = this.f22875v; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
            abstractC5852n.mo10116b1();
        }
        super.mo10116b1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: f1 */
    public final void mo10117f1() {
        super.mo10117f1();
        for (AbstractC5852n abstractC5852n = this.f22875v; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
            abstractC5852n.mo10117f1();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: g1 */
    public final void mo10118g1() {
        for (AbstractC5852n abstractC5852n = this.f22875v; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
            abstractC5852n.mo10118g1();
        }
        super.mo10118g1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: h1 */
    public final void mo10119h1() {
        super.mo10119h1();
        for (AbstractC5852n abstractC5852n = this.f22875v; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
            abstractC5852n.mo10119h1();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: i1 */
    public final void mo10120i1(AbstractC5852n abstractC5852n) {
        this.f23788g = abstractC5852n;
        for (AbstractC5852n abstractC5852n2 = this.f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
            abstractC5852n2.mo10120i1(abstractC5852n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: j1 */
    public final void mo10121j1(AbstractC5614i1 abstractC5614i1) {
        this.f23795n = abstractC5614i1;
        for (AbstractC5852n abstractC5852n = this.f22875v; abstractC5852n != null; abstractC5852n = abstractC5852n.f23793l) {
            abstractC5852n.mo10121j1(abstractC5614i1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC5612i m10122k1(InterfaceC5612i interfaceC5612i) {
        AbstractC5852n abstractC5852n = ((AbstractC5852n) interfaceC5612i).f23788g;
        if (abstractC5852n != interfaceC5612i) {
            AbstractC5852n abstractC5852n2 = interfaceC5612i instanceof AbstractC5852n ? (AbstractC5852n) interfaceC5612i : null;
            AbstractC5852n abstractC5852n3 = abstractC5852n2 != null ? abstractC5852n2.f23792k : null;
            if (abstractC5852n != this.f23788g || !AbstractC1416l.m3825a(abstractC5852n3, this)) {
                C2104o.m5276A("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (abstractC5852n.f23801t) {
                AbstractC4229a.m8494b("Cannot delegate to an already attached node");
            }
            abstractC5852n.mo10120i1(this.f23788g);
            int i9 = this.f23790i;
            int iM10140f = AbstractC5617j1.m10140f(abstractC5852n);
            abstractC5852n.f23790i = iM10140f;
            int i10 = this.f23790i;
            int i11 = iM10140f & 2;
            if (i11 != 0 && (i10 & 2) != 0 && !(this instanceof InterfaceC5651v)) {
                AbstractC4229a.m8494b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC5852n);
            }
            abstractC5852n.f23793l = this.f22875v;
            this.f22875v = abstractC5852n;
            abstractC5852n.f23792k = this;
            m10124m1(iM10140f | this.f23790i, false);
            if (this.f23801t) {
                if (i11 == 0 || (i9 & 2) != 0) {
                    mo10121j1(this.f23795n);
                } else {
                    C5587b1 c5587b1 = AbstractC5618k.m10167w(this).f22778L;
                    this.f23788g.mo10121j1(null);
                    c5587b1.m9985g();
                }
                abstractC5852n.mo10115a1();
                abstractC5852n.mo10118g1();
                if (!abstractC5852n.f23801t) {
                    AbstractC4229a.m8494b("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC5617j1.m10135a(abstractC5852n, -1, 1);
            }
        }
        return interfaceC5612i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public final void m10123l1(InterfaceC5612i interfaceC5612i) {
        AbstractC5852n abstractC5852n = null;
        for (AbstractC5852n abstractC5852n2 = this.f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
            if (abstractC5852n2 == interfaceC5612i) {
                boolean z9 = abstractC5852n2.f23801t;
                if (z9) {
                    C0925b0 c0925b0 = AbstractC5617j1.f22893a;
                    if (!z9) {
                        AbstractC4229a.m8494b("autoInvalidateRemovedNode called on unattached node");
                    }
                    AbstractC5617j1.m10135a(abstractC5852n2, -1, 2);
                    abstractC5852n2.mo10119h1();
                    abstractC5852n2.mo10116b1();
                }
                abstractC5852n2.mo10120i1(abstractC5852n2);
                abstractC5852n2.f23791j = 0;
                AbstractC5852n abstractC5852n3 = abstractC5852n2.f23793l;
                if (abstractC5852n == null) {
                    this.f22875v = abstractC5852n3;
                } else {
                    abstractC5852n.f23793l = abstractC5852n3;
                }
                abstractC5852n2.f23793l = null;
                abstractC5852n2.f23792k = null;
                int i9 = this.f23790i;
                int iM10140f = AbstractC5617j1.m10140f(this);
                m10124m1(iM10140f, true);
                if (this.f23801t && (i9 & 2) != 0 && (iM10140f & 2) == 0) {
                    C5587b1 c5587b1 = AbstractC5618k.m10167w(this).f22778L;
                    this.f23788g.mo10121j1(null);
                    c5587b1.m9985g();
                    return;
                }
                return;
            }
            abstractC5852n = abstractC5852n2;
        }
        C3193a.m6826p(interfaceC5612i, "Could not find delegate: ");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final void m10124m1(int i9, boolean z9) {
        AbstractC5852n abstractC5852n;
        int i10 = this.f23790i;
        this.f23790i = i9;
        if (i10 != i9) {
            AbstractC5852n abstractC5852n2 = this.f23788g;
            if (abstractC5852n2 == this) {
                this.f23791j = i9;
            }
            if (this.f23801t) {
                AbstractC5852n abstractC5852n3 = this;
                while (abstractC5852n3 != null) {
                    i9 |= abstractC5852n3.f23790i;
                    abstractC5852n3.f23790i = i9;
                    if (abstractC5852n3 == abstractC5852n2) {
                        break;
                    } else {
                        abstractC5852n3 = abstractC5852n3.f23792k;
                    }
                }
                if (z9 && abstractC5852n3 == abstractC5852n2) {
                    i9 = AbstractC5617j1.m10140f(abstractC5852n2);
                    abstractC5852n2.f23790i = i9;
                }
                int i11 = i9 | ((abstractC5852n3 == null || (abstractC5852n = abstractC5852n3.f23793l) == null) ? 0 : abstractC5852n.f23791j);
                while (abstractC5852n3 != null) {
                    i11 |= abstractC5852n3.f23790i;
                    abstractC5852n3.f23791j = i11;
                    abstractC5852n3 = abstractC5852n3.f23792k;
                }
            }
        }
    }
}
