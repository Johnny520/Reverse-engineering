package p000;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class om1 extends wk1 {

    /* JADX INFO: renamed from: o */
    public final wk1 f7731o;

    /* JADX INFO: renamed from: p */
    public boolean f7732p;

    public om1(long j, bs2 bs2Var, in0 in0Var, in0 in0Var2, wk1 wk1Var) {
        super(j, bs2Var, in0Var, in0Var2);
        this.f7731o = wk1Var;
        wk1Var.mo82k();
    }

    @Override // p000.wk1, p000.vr2
    /* JADX INFO: renamed from: c */
    public final void mo75c() {
        if (this.f12148c) {
            return;
        }
        super.mo75c();
        if (this.f7732p) {
            return;
        }
        this.f7732p = true;
        this.f7731o.mo83l();
    }

    @Override // p000.wk1
    /* JADX INFO: renamed from: w */
    public final p40 mo90w() {
        om1 om1Var;
        wk1 wk1Var = this.f7731o;
        if (wk1Var.f12565m || wk1Var.f12148c) {
            return new xr2(this);
        }
        sk1 sk1Var = this.f12560h;
        long j = this.f12147b;
        HashMap mapM1118b = sk1Var != null ? ds2.m1118b(wk1Var.mo79g(), this, this.f7731o.mo76d()) : null;
        Object obj = ds2.f2181c;
        synchronized (obj) {
            try {
                ds2.m1119c(this);
                if (sk1Var == null || sk1Var.f10177d == 0) {
                    om1Var = this;
                    om1Var.m5785a();
                } else {
                    om1Var = this;
                    p40 p40VarM5943z = om1Var.m5943z(this.f7731o.mo79g(), sk1Var, mapM1118b, this.f7731o.mo76d());
                    if (!p40VarM5943z.equals(yr2.f13600n)) {
                        return p40VarM5943z;
                    }
                    sk1 sk1VarMo91x = om1Var.f7731o.mo91x();
                    if (sk1VarMo91x != null) {
                        sk1VarMo91x.m4891j(sk1Var);
                    } else {
                        om1Var.f7731o.mo72B(sk1Var);
                        om1Var.f12560h = null;
                    }
                }
                if (t11.m5090p(om1Var.f7731o.mo79g(), j) < 0) {
                    om1Var.f7731o.m5942v();
                }
                wk1 wk1Var2 = om1Var.f7731o;
                wk1Var2.mo86r(wk1Var2.mo76d().m585b(j).m584a(om1Var.f12562j));
                om1Var.f7731o.m5941A(j);
                wk1 wk1Var3 = om1Var.f7731o;
                int i = om1Var.f12149d;
                om1Var.f12149d = -1;
                if (i >= 0) {
                    int[] iArr = wk1Var3.f12563k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    wk1Var3.f12563k = iArrCopyOf;
                } else {
                    wk1Var3.getClass();
                }
                wk1 wk1Var4 = om1Var.f7731o;
                bs2 bs2Var = om1Var.f12562j;
                wk1Var4.getClass();
                synchronized (obj) {
                    wk1Var4.f12562j = wk1Var4.f12562j.m587d(bs2Var);
                    wk1 wk1Var5 = om1Var.f7731o;
                    int[] iArr2 = om1Var.f12563k;
                    wk1Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = wk1Var5.f12563k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        wk1Var5.f12563k = iArr2;
                    }
                }
                om1Var.f12565m = true;
                if (!om1Var.f7732p) {
                    om1Var.f7732p = true;
                    om1Var.f7731o.mo83l();
                }
                return yr2.f13600n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
