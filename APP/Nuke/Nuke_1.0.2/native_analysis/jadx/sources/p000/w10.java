package p000;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w10 extends u60 implements on2 {

    /* JADX INFO: renamed from: A */
    public boolean f12260A;

    /* JADX INFO: renamed from: B */
    public boolean f12261B;

    /* JADX INFO: renamed from: C */
    public boolean f12262C;

    /* JADX INFO: renamed from: D */
    public us1 f12263D;

    /* JADX INFO: renamed from: E */
    public b03 f12264E;

    /* JADX INFO: renamed from: F */
    public xx0 f12265F;

    /* JADX INFO: renamed from: G */
    public gl0 f12266G;

    /* JADX INFO: renamed from: x */
    public q33 f12267x;

    /* JADX INFO: renamed from: y */
    public k03 f12268y;

    /* JADX INFO: renamed from: z */
    public t91 f12269z;

    /* JADX INFO: renamed from: P0 */
    public static void m5825P0(t91 t91Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        t03 t03Var = t91Var.f10626e;
        n10 n10Var = t91Var.f10643v;
        if (t03Var == null) {
            int length = str.length();
            n10Var.mo5j(new k03(str, fg1.m1636i(length, length), 4));
        } else {
            k03 k03VarM5042q = t91Var.f10625d.m5042q(AbstractC0179eu.m1435P(new y60(), new C0180ev(str, 1)));
            t03Var.m5048a(null, k03VarM5042q);
            n10Var.mo5j(k03VarM5042q);
        }
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        boolean z = this.f12262C;
        C0690sd c0690sd = this.f12268y.f5296a;
        v41[] v41VarArr = xn2.f13086a;
        yn2 yn2Var = vn2.f12046F;
        v41[] v41VarArr2 = xn2.f13086a;
        v41 v41Var = v41VarArr2[18];
        zn2Var.mo1533a(yn2Var, c0690sd);
        C0690sd c0690sd2 = this.f12267x.f8721a;
        yn2 yn2Var2 = vn2.f12047G;
        v41 v41Var2 = v41VarArr2[19];
        zn2Var.mo1533a(yn2Var2, c0690sd2);
        long j = this.f12268y.f5297b;
        yn2 yn2Var3 = vn2.f12048H;
        v41 v41Var3 = v41VarArr2[20];
        zn2Var.mo1533a(yn2Var3, new f13(j));
        C0874x7 c0874x7 = C0700sn.f10198B;
        yn2 yn2Var4 = vn2.f12076s;
        v41 v41Var4 = v41VarArr2[9];
        zn2Var.mo1533a(yn2Var4, c0874x7);
        C0801v8 c0801v8 = new C0801v8(AutofillValue.forText(this.f12268y.f5296a));
        yn2 yn2Var5 = vn2.f12077t;
        v41 v41Var5 = v41VarArr2[10];
        zn2Var.mo1533a(yn2Var5, c0801v8);
        boolean z2 = false;
        z2 = false;
        zn2Var.mo1533a(kn2.f5666h, new C0603q3(null, new v10(this, z2 ? 1 : 0)));
        int i = this.f12265F.f13217d;
        if (i == 6) {
            k00.f5292a.getClass();
            C0913y7 c0913y7 = j00.f4871c;
            yn2 yn2Var6 = vn2.f12075r;
            v41 v41Var6 = v41VarArr2[8];
            zn2Var.mo1533a(yn2Var6, c0913y7);
        } else if (i == 7 || i == 8) {
            k00.f5292a.getClass();
            C0913y7 c0913y72 = j00.f4870b;
            yn2 yn2Var7 = vn2.f12075r;
            v41 v41Var7 = v41VarArr2[8];
            zn2Var.mo1533a(yn2Var7, c0913y72);
        } else if (i == 4) {
            k00.f5292a.getClass();
            C0913y7 c0913y73 = j00.f4872d;
            yn2 yn2Var8 = vn2.f12075r;
            v41 v41Var8 = v41VarArr2[8];
            zn2Var.mo1533a(yn2Var8, c0913y73);
        }
        boolean z3 = this.f12261B;
        a83 a83Var = a83.f116a;
        if (!z3) {
            zn2Var.mo1533a(vn2.f12067j, a83Var);
        }
        if (z) {
            zn2Var.mo1533a(vn2.f12052L, a83Var);
        }
        int i2 = 1;
        if (this.f12261B && !this.f12260A) {
            z2 = true;
        }
        yn2 yn2Var9 = vn2.f12055O;
        v41 v41Var9 = v41VarArr2[28];
        zn2Var.mo1533a(yn2Var9, Boolean.valueOf(z2));
        xn2.m6161a(zn2Var, new v10(this, i2));
        int i3 = 2;
        if (z2) {
            zn2Var.mo1533a(kn2.f5669k, new C0603q3(null, new v10(this, i3)));
            zn2Var.mo1533a(kn2.f5673o, new C0603q3(null, new v10(this, zn2Var)));
        }
        zn2Var.mo1533a(kn2.f5668j, new C0603q3(null, new wt0(3, this)));
        int i4 = this.f12265F.f13218e;
        u10 u10Var = new u10(this, 6);
        zn2Var.mo1533a(vn2.f12049I, new wx0(i4));
        zn2Var.mo1533a(kn2.f5674p, new C0603q3(null, u10Var));
        zn2Var.mo1533a(kn2.f5660b, new C0603q3(null, new u10(this, 7)));
        zn2Var.mo1533a(kn2.f5661c, new C0603q3(null, new u10(this, 1)));
        if (!f13.m1494c(this.f12268y.f5297b) && !z) {
            zn2Var.mo1533a(kn2.f5675q, new C0603q3(null, new u10(this, 2)));
            if (this.f12261B && !this.f12260A) {
                zn2Var.mo1533a(kn2.f5676r, new C0603q3(null, new u10(this, 3)));
            }
        }
        if (!this.f12261B || this.f12260A) {
            return;
        }
        zn2Var.mo1533a(kn2.f5677s, new C0603q3(null, new u10(this, 5)));
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: o0 */
    public final boolean mo358o0() {
        return true;
    }
}
