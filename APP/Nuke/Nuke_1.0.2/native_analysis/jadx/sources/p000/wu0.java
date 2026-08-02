package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wu0 extends th1 implements d43, r12, InterfaceC0257gy {

    /* JADX INFO: renamed from: v */
    public db0 f12649v;

    /* JADX INFO: renamed from: w */
    public C0270ha f12650w;

    /* JADX INFO: renamed from: x */
    public boolean f12651x;

    public wu0(C0270ha c0270ha, db0 db0Var) {
        this.f12649v = db0Var;
        this.f12650w = c0270ha;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        m6000Q0();
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: J */
    public final void mo215J(h12 h12Var, i12 i12Var, long j) {
        if (i12Var == i12.f4217i) {
            List list = h12Var.f3776a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (mo1206P0(((o12) list.get(i)).f7428i)) {
                    int i2 = h12Var.f3781f;
                    if (i2 == 4) {
                        this.f12651x = true;
                        m5999O0();
                        return;
                    } else {
                        if (i2 == 5) {
                            m6000Q0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m5998M0() {
        C0270ha c0270ha;
        o72 o72Var = new o72();
        tb3.m5158d(this, new oq0(22, o72Var));
        wu0 wu0Var = (wu0) o72Var.f7574i;
        if (wu0Var == null || (c0270ha = wu0Var.f12650w) == null) {
            c0270ha = this.f12650w;
        }
        mo1205N0(c0270ha);
    }

    /* JADX INFO: renamed from: N0 */
    public abstract void mo1205N0(m12 m12Var);

    /* JADX INFO: renamed from: O0 */
    public final void m5999O0() {
        y62 y62Var = new y62();
        y62Var.f13324h = true;
        tb3.m5160f(this, new fb0(y62Var));
        if (y62Var.f13324h) {
            m5998M0();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public abstract boolean mo1206P0(int i);

    /* JADX INFO: renamed from: Q0 */
    public final void m6000Q0() {
        if (this.f12651x) {
            this.f12651x = false;
            if (this.f10770u) {
                o72 o72Var = new o72();
                tb3.m5158d(this, new C0762u6(o72Var, 1));
                wu0 wu0Var = (wu0) o72Var.f7574i;
                if (wu0Var != null) {
                    wu0Var.m5998M0();
                } else {
                    mo1205N0(null);
                }
            }
        }
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: m0 */
    public final void mo233m0() {
        m6000Q0();
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: s */
    public final long mo300s() {
        if (this.f12649v == null) {
            return x23.f12780a;
        }
        e70 e70Var = sp0.m4933c0(this).f9365F;
        int i = x23.f12781b;
        return jx2.m2595e(e70Var.mo692T(10.0f), e70Var.mo692T(40.0f), e70Var.mo692T(10.0f), e70Var.mo692T(40.0f));
    }
}
