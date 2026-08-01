package p007B0;

import p001A0.C0111k;
import p041H0.AbstractC0554C0;
import p041H0.AbstractC0601k;
import p041H0.C0592f0;
import p041H0.C0603l;
import p041H0.InterfaceC0558E0;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0624v0;
import p117X2.C1671p;
import p117X2.C1675t;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: B0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0194h extends AbstractC2206o implements InterfaceC0558E0, InterfaceC0624v0, InterfaceC0595h {

    /* JADX INFO: renamed from: r */
    public C0603l f675r;

    /* JADX INFO: renamed from: s */
    public C0187a f676s;

    /* JADX INFO: renamed from: t */
    public boolean f677t;

    public AbstractC0194h(C0187a c0187a, C0603l c0603l) {
        this.f675r = c0603l;
        this.f676s = c0187a;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        m298N0();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m296J0() {
        C0187a c0187a;
        C1675t c1675t = new C1675t();
        AbstractC0601k.m1048x(this, new C0193g(1));
        AbstractC0194h abstractC0194h = (AbstractC0194h) c1675t.f5710e;
        if (abstractC0194h == null || (c0187a = abstractC0194h.f676s) == null) {
            c0187a = this.f676s;
        }
        mo263K0(c0187a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: K */
    public final void mo286K(C0200n c0200n, EnumC0201o enumC0201o, long j5) {
        if (enumC0201o == EnumC0201o.f703e) {
            ?? r32 = c0200n.f696a;
            int size = r32.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (mo264M0(((C0209w) r32.get(i5)).f719i)) {
                    int i6 = c0200n.f701f;
                    if (i6 == 4) {
                        this.f677t = true;
                        m297L0();
                        return;
                    } else {
                        if (i6 == 5) {
                            m298N0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public abstract void mo263K0(InterfaceC0206t interfaceC0206t);

    /* JADX INFO: renamed from: L0 */
    public final void m297L0() {
        C1671p c1671p = new C1671p();
        c1671p.f5705d = true;
        AbstractC0601k.m1050z(this, new C0192f(c1671p));
        if (c1671p.f5705d) {
            m296J0();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public abstract boolean mo264M0(int i5);

    /* JADX INFO: renamed from: N0 */
    public final void m298N0() {
        if (this.f677t) {
            this.f677t = false;
            if (this.f7199q) {
                C1675t c1675t = new C1675t();
                AbstractC0601k.m1048x(this, new C0111k(c1675t, 1));
                AbstractC0194h abstractC0194h = (AbstractC0194h) c1675t.f5710e;
                if (abstractC0194h != null) {
                    abstractC0194h.m296J0();
                } else {
                    mo263K0(null);
                }
            }
        }
    }

    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: g0 */
    public final void mo291g0() {
        m298N0();
    }

    @Override // p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: w */
    public final long mo299w() {
        C0603l c0603l = this.f675r;
        if (c0603l == null) {
            return AbstractC0554C0.f1666a;
        }
        InterfaceC2007c interfaceC2007c = AbstractC0601k.m1044t(this).f1692C;
        int i5 = AbstractC0554C0.f1667b;
        return C0592f0.m967c(interfaceC2007c.mo270S(c0603l.f1951a), interfaceC2007c.mo270S(c0603l.f1952b), interfaceC2007c.mo270S(c0603l.f1953c), interfaceC2007c.mo270S(c0603l.f1954d));
    }
}
