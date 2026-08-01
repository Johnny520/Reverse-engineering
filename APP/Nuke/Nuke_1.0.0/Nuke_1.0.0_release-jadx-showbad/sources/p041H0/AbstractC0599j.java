package p041H0;

import p023E0.AbstractC0277a;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p186k.C2444z;

/* JADX INFO: renamed from: H0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0599j extends AbstractC2206o {

    /* JADX INFO: renamed from: r */
    public final int f1942r = AbstractC0598i0.m1012e(this);

    /* JADX INFO: renamed from: s */
    public AbstractC2206o f1943s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: A0 */
    public final void mo1015A0() {
        for (AbstractC2206o abstractC2206o = this.f1943s; abstractC2206o != null; abstractC2206o = abstractC2206o.f7191i) {
            abstractC2206o.mo1015A0();
        }
        super.mo1015A0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: E0 */
    public final void mo1016E0() {
        super.mo1016E0();
        for (AbstractC2206o abstractC2206o = this.f1943s; abstractC2206o != null; abstractC2206o = abstractC2206o.f7191i) {
            abstractC2206o.mo1016E0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: F0 */
    public final void mo1017F0() {
        for (AbstractC2206o abstractC2206o = this.f1943s; abstractC2206o != null; abstractC2206o = abstractC2206o.f7191i) {
            abstractC2206o.mo1017F0();
        }
        super.mo1017F0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: G0 */
    public final void mo1018G0() throws ClassNotFoundException {
        super.mo1018G0();
        for (AbstractC2206o abstractC2206o = this.f1943s; abstractC2206o != null; abstractC2206o = abstractC2206o.f7191i) {
            abstractC2206o.mo1018G0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: H0 */
    public final void mo1019H0(AbstractC2206o abstractC2206o) {
        this.f7186d = abstractC2206o;
        for (AbstractC2206o abstractC2206o2 = this.f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
            abstractC2206o2.mo1019H0(abstractC2206o);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: I0 */
    public final void mo1020I0(AbstractC0596h0 abstractC0596h0) {
        this.f7193k = abstractC0596h0;
        for (AbstractC2206o abstractC2206o = this.f1943s; abstractC2206o != null; abstractC2206o = abstractC2206o.f7191i) {
            abstractC2206o.mo1020I0(abstractC0596h0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC0597i m1021J0(InterfaceC0597i interfaceC0597i) {
        AbstractC2206o abstractC2206o = ((AbstractC2206o) interfaceC0597i).f7186d;
        if (abstractC2206o != interfaceC0597i) {
            AbstractC2206o abstractC2206o2 = interfaceC0597i instanceof AbstractC2206o ? (AbstractC2206o) interfaceC0597i : null;
            AbstractC2206o abstractC2206o3 = abstractC2206o2 != null ? abstractC2206o2.f7190h : null;
            if (abstractC2206o != this.f7186d || !AbstractC1665j.m2981a(abstractC2206o3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (abstractC2206o.f7199q) {
                AbstractC0277a.m483b("Cannot delegate to an already attached node");
            }
            abstractC2206o.mo1019H0(this.f7186d);
            int i5 = this.f7188f;
            int iM1013f = AbstractC0598i0.m1013f(abstractC2206o);
            abstractC2206o.f7188f = iM1013f;
            int i6 = this.f7188f;
            int i7 = iM1013f & 2;
            if (i7 != 0 && (i6 & 2) != 0 && !(this instanceof InterfaceC0627x)) {
                AbstractC0277a.m483b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC2206o);
            }
            abstractC2206o.f7191i = this.f1943s;
            this.f1943s = abstractC2206o;
            abstractC2206o.f7190h = this;
            m1023L0(iM1013f | this.f7188f, false);
            if (this.f7199q) {
                if (i7 == 0 || (i5 & 2) != 0) {
                    mo1020I0(this.f7193k);
                } else {
                    C0590e0 c0590e0 = AbstractC0601k.m1044t(this).f1699J;
                    this.f7186d.mo1020I0(null);
                    c0590e0.m965g();
                }
                abstractC2206o.mo1024z0();
                abstractC2206o.mo1017F0();
                if (!abstractC2206o.f7199q) {
                    AbstractC0277a.m483b("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC0598i0.m1008a(abstractC2206o, -1, 1);
            }
        }
        return interfaceC0597i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public final void m1022K0(InterfaceC0597i interfaceC0597i) throws ClassNotFoundException {
        AbstractC2206o abstractC2206o = null;
        for (AbstractC2206o abstractC2206o2 = this.f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
            if (abstractC2206o2 == interfaceC0597i) {
                boolean z5 = abstractC2206o2.f7199q;
                if (z5) {
                    C2444z c2444z = AbstractC0598i0.f1941a;
                    if (!z5) {
                        AbstractC0277a.m483b("autoInvalidateRemovedNode called on unattached node");
                    }
                    AbstractC0598i0.m1008a(abstractC2206o2, -1, 2);
                    abstractC2206o2.mo1018G0();
                    abstractC2206o2.mo1015A0();
                }
                abstractC2206o2.mo1019H0(abstractC2206o2);
                abstractC2206o2.f7189g = 0;
                if (abstractC2206o == null) {
                    this.f1943s = abstractC2206o2.f7191i;
                } else {
                    abstractC2206o.f7191i = abstractC2206o2.f7191i;
                }
                abstractC2206o2.f7191i = null;
                abstractC2206o2.f7190h = null;
                int i5 = this.f7188f;
                int iM1013f = AbstractC0598i0.m1013f(this);
                m1023L0(iM1013f, true);
                if (this.f7199q && (i5 & 2) != 0 && (iM1013f & 2) == 0) {
                    C0590e0 c0590e0 = AbstractC0601k.m1044t(this).f1699J;
                    this.f7186d.mo1020I0(null);
                    c0590e0.m965g();
                    return;
                }
                return;
            }
            abstractC2206o = abstractC2206o2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0597i).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public final void m1023L0(int i5, boolean z5) {
        AbstractC2206o abstractC2206o;
        int i6 = this.f7188f;
        this.f7188f = i5;
        if (i6 != i5) {
            AbstractC2206o abstractC2206o2 = this.f7186d;
            if (abstractC2206o2 == this) {
                this.f7189g = i5;
            }
            if (this.f7199q) {
                AbstractC2206o abstractC2206o3 = this;
                while (abstractC2206o3 != null) {
                    i5 |= abstractC2206o3.f7188f;
                    abstractC2206o3.f7188f = i5;
                    if (abstractC2206o3 == abstractC2206o2) {
                        break;
                    } else {
                        abstractC2206o3 = abstractC2206o3.f7190h;
                    }
                }
                if (z5 && abstractC2206o3 == abstractC2206o2) {
                    i5 = AbstractC0598i0.m1013f(abstractC2206o2);
                    abstractC2206o2.f7188f = i5;
                }
                int i7 = i5 | ((abstractC2206o3 == null || (abstractC2206o = abstractC2206o3.f7191i) == null) ? 0 : abstractC2206o.f7189g);
                while (abstractC2206o3 != null) {
                    i7 |= abstractC2206o3.f7188f;
                    abstractC2206o3.f7189g = i7;
                    abstractC2206o3 = abstractC2206o3.f7190h;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: z0 */
    public final void mo1024z0() {
        super.mo1024z0();
        for (AbstractC2206o abstractC2206o = this.f1943s; abstractC2206o != null; abstractC2206o = abstractC2206o.f7191i) {
            abstractC2206o.mo1020I0(this.f7193k);
            if (!abstractC2206o.f7199q) {
                abstractC2206o.mo1024z0();
            }
        }
    }
}
