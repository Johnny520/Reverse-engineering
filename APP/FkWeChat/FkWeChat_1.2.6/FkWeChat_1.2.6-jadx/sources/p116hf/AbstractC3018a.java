package p116hf;

import gf.EnumC2795d;
import java.io.Serializable;
import p086ff.AbstractC2438f;
import p086ff.InterfaceC2436d;
import p086ff.InterfaceC2440h;

/* JADX INFO: renamed from: hf.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3018a implements InterfaceC2436d, Serializable {
    private static final long serialVersionUID = -2529255052481744503L;

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: A */
    public void mo8797A(String str) {
        if (mo8816n()) {
            m11173I(EnumC2795d.TRACE, null, str, null);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: B */
    public void mo8798B(String str, Object... objArr) {
        if (mo8813k()) {
            m11172G(EnumC2795d.INFO, null, str, objArr);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: C */
    public void mo8799C(InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        if (mo8806d(interfaceC2440h)) {
            m11173I(EnumC2795d.TRACE, interfaceC2440h, str, th);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: D */
    public void mo8800D(InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        if (mo8814l(interfaceC2440h)) {
            m11173I(EnumC2795d.WARN, interfaceC2440h, str, th);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: F */
    public void mo8802F(InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        if (mo8811i(interfaceC2440h)) {
            m11173I(EnumC2795d.ERROR, interfaceC2440h, str, th);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m11172G(EnumC2795d enumC2795d, InterfaceC2440h interfaceC2440h, String str, Object[] objArr) {
        Throwable thM11178a = AbstractC3023f.m11178a(objArr);
        if (thM11178a != null) {
            mo9959H(enumC2795d, interfaceC2440h, str, AbstractC3023f.m11179b(objArr), thM11178a);
        } else {
            mo9959H(enumC2795d, interfaceC2440h, str, objArr, null);
        }
    }

    /* JADX INFO: renamed from: H */
    public abstract void mo9959H(EnumC2795d enumC2795d, InterfaceC2440h interfaceC2440h, String str, Object[] objArr, Throwable th);

    /* JADX INFO: renamed from: I */
    public final void m11173I(EnumC2795d enumC2795d, InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        mo9959H(enumC2795d, interfaceC2440h, str, null, th);
    }

    /* JADX INFO: renamed from: J */
    public final void m11174J(EnumC2795d enumC2795d, InterfaceC2440h interfaceC2440h, String str, Object obj) {
        mo9959H(enumC2795d, interfaceC2440h, str, new Object[]{obj}, null);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: f */
    public void mo8808f(String str, Throwable th) {
        if (mo8810h()) {
            m11173I(EnumC2795d.ERROR, null, str, th);
        }
    }

    public abstract String getName();

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: j */
    public void mo8812j(String str, Object... objArr) {
        if (mo8803a()) {
            m11172G(EnumC2795d.WARN, null, str, objArr);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: m */
    public void mo8815m(String str) {
        if (mo8804b()) {
            m11173I(EnumC2795d.DEBUG, null, str, null);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: o */
    public void mo8817o(String str, Object... objArr) {
        if (mo8810h()) {
            m11172G(EnumC2795d.ERROR, null, str, objArr);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: p */
    public void mo8818p(InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        if (mo8801E(interfaceC2440h)) {
            m11173I(EnumC2795d.DEBUG, interfaceC2440h, str, th);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: q */
    public void mo8819q(InterfaceC2440h interfaceC2440h, String str, Throwable th) {
        if (mo8805c(interfaceC2440h)) {
            m11173I(EnumC2795d.INFO, interfaceC2440h, str, th);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: r */
    public void mo8820r(String str, Object obj) {
        if (mo8804b()) {
            m11174J(EnumC2795d.DEBUG, null, str, obj);
        }
    }

    public Object readResolve() {
        return AbstractC2438f.m8840l(getName());
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: s */
    public void mo8821s(String str, Object... objArr) {
        if (mo8804b()) {
            m11172G(EnumC2795d.DEBUG, null, str, objArr);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: t */
    public void mo8822t(String str, Throwable th) {
        if (mo8803a()) {
            m11173I(EnumC2795d.WARN, null, str, th);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: u */
    public void mo8823u(String str, Throwable th) {
        if (mo8816n()) {
            m11173I(EnumC2795d.TRACE, null, str, th);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: w */
    public void mo8825w(String str, Throwable th) {
        if (mo8804b()) {
            m11173I(EnumC2795d.DEBUG, null, str, th);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: x */
    public void mo8826x(String str) {
        if (mo8813k()) {
            m11173I(EnumC2795d.INFO, null, str, null);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: y */
    public void mo8827y(String str) {
        if (mo8803a()) {
            m11173I(EnumC2795d.WARN, null, str, null);
        }
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: z */
    public void mo8828z(String str, Object... objArr) {
        if (mo8816n()) {
            m11172G(EnumC2795d.TRACE, null, str, objArr);
        }
    }
}
