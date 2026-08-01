package p345xc;

import p024b9.AbstractC1052o0;
import p300uc.C8661o;
import p300uc.InterfaceC8662p;
import p329wc.InterfaceC9218f;
import p361yc.C9758s1;

/* JADX INFO: renamed from: xc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9484b implements InterfaceC9488f, InterfaceC9486d {
    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: A */
    public void mo630A(long j10) {
        mo36968I(Long.valueOf(j10));
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: B */
    public final void mo36964B(InterfaceC9218f interfaceC9218f, int i10, int i11) {
        interfaceC9218f.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo650z(i11);
        }
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: C */
    public InterfaceC9486d mo36965C(InterfaceC9218f interfaceC9218f, int i10) {
        return super.mo36965C(interfaceC9218f, i10);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: D */
    public final void mo36966D(InterfaceC9218f interfaceC9218f, int i10, String str) {
        interfaceC9218f.getClass();
        str.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo631F(str);
        }
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: E */
    public final void mo36967E(InterfaceC9218f interfaceC9218f, int i10, boolean z10) {
        interfaceC9218f.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo644k(z10);
        }
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: F */
    public void mo631F(String str) {
        str.getClass();
        mo36968I(str);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: G */
    public void mo632G(InterfaceC8662p interfaceC8662p, Object obj) {
        super.mo632G(interfaceC8662p, obj);
    }

    /* JADX INFO: renamed from: H */
    public boolean mo633H(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return true;
    }

    /* JADX INFO: renamed from: I */
    public void mo36968I(Object obj) {
        obj.getClass();
        throw new C8661o("Non-serializable " + AbstractC1052o0.m3807b(obj.getClass()) + " is not supported by " + AbstractC1052o0.m3807b(getClass()) + " encoder");
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: c */
    public InterfaceC9486d mo637c(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void mo638d(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo639e(InterfaceC9218f interfaceC9218f, int i10) {
        return super.mo639e(interfaceC9218f, i10);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: f */
    public void mo640f() {
        throw new C8661o("'null' is not supported by default");
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: g */
    public void mo36969g(InterfaceC9218f interfaceC9218f, int i10, InterfaceC8662p interfaceC8662p, Object obj) {
        interfaceC9218f.getClass();
        interfaceC8662p.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo632G(interfaceC8662p, obj);
        }
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: h */
    public void mo641h(double d10) {
        mo36968I(Double.valueOf(d10));
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: i */
    public void mo642i(short s10) {
        mo36968I(Short.valueOf(s10));
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: j */
    public void mo643j(byte b10) {
        mo36968I(Byte.valueOf(b10));
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: k */
    public void mo644k(boolean z10) {
        mo36968I(Boolean.valueOf(z10));
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: l */
    public final InterfaceC9488f mo36970l(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo633H(interfaceC9218f, i10) ? mo645m(interfaceC9218f.mo35894h(i10)) : C9758s1.f33027a;
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: m */
    public InterfaceC9488f mo645m(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return this;
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: n */
    public final void mo36971n(InterfaceC9218f interfaceC9218f, int i10, float f10) {
        interfaceC9218f.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo647p(f10);
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo646o(InterfaceC9218f interfaceC9218f, int i10, InterfaceC8662p interfaceC8662p, Object obj) {
        interfaceC9218f.getClass();
        interfaceC8662p.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo36975w(interfaceC8662p, obj);
        }
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: p */
    public void mo647p(float f10) {
        mo36968I(Float.valueOf(f10));
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: q */
    public final void mo36972q(InterfaceC9218f interfaceC9218f, int i10, long j10) {
        interfaceC9218f.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo630A(j10);
        }
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: r */
    public void mo648r(char c10) {
        mo36968I(Character.valueOf(c10));
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: s */
    public void mo649s(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        mo36968I(Integer.valueOf(i10));
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: t */
    public final void mo36973t(InterfaceC9218f interfaceC9218f, int i10, short s10) {
        interfaceC9218f.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo642i(s10);
        }
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: u */
    public final void mo36974u(InterfaceC9218f interfaceC9218f, int i10, char c10) {
        interfaceC9218f.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo648r(c10);
        }
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: v */
    public void mo741v() {
        super.mo741v();
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: w */
    public void mo36975w(InterfaceC8662p interfaceC8662p, Object obj) {
        super.mo36975w(interfaceC8662p, obj);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: x */
    public final void mo36976x(InterfaceC9218f interfaceC9218f, int i10, double d10) {
        interfaceC9218f.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo641h(d10);
        }
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: y */
    public final void mo36977y(InterfaceC9218f interfaceC9218f, int i10, byte b10) {
        interfaceC9218f.getClass();
        if (mo633H(interfaceC9218f, i10)) {
            mo643j(b10);
        }
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: z */
    public void mo650z(int i10) {
        mo36968I(Integer.valueOf(i10));
    }
}
