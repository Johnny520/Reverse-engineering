package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w10 extends u60 implements on2 {
    public boolean A;
    public boolean B;
    public boolean C;
    public us1 D;
    public b03 E;
    public xx0 F;
    public gl0 G;
    public q33 x;
    public k03 y;
    public t91 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void P0(t91 t91Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        t03 t03Var = t91Var.e;
        n10 n10Var = t91Var.v;
        if (t03Var == null) {
            int length = str.length();
            n10Var.j(new k03(str, fg1.i(length, length), 4));
        } else {
            k03 k03VarQ = t91Var.d.q(eu.P(new y60(), new ev(str, 1)));
            t03Var.a(null, k03VarQ);
            n10Var.j(k03VarQ);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        boolean z = this.C;
        sd sdVar = this.y.a;
        v41[] v41VarArr = xn2.a;
        yn2 yn2Var = vn2.F;
        v41[] v41VarArr2 = xn2.a;
        v41 v41Var = v41VarArr2[18];
        zn2Var.a(yn2Var, sdVar);
        sd sdVar2 = this.x.a;
        yn2 yn2Var2 = vn2.G;
        v41 v41Var2 = v41VarArr2[19];
        zn2Var.a(yn2Var2, sdVar2);
        long j = this.y.b;
        yn2 yn2Var3 = vn2.H;
        v41 v41Var3 = v41VarArr2[20];
        zn2Var.a(yn2Var3, new f13(j));
        x7 x7Var = sn.B;
        yn2 yn2Var4 = vn2.s;
        v41 v41Var4 = v41VarArr2[9];
        zn2Var.a(yn2Var4, x7Var);
        v8 v8Var = new v8(AutofillValue.forText(this.y.a));
        yn2 yn2Var5 = vn2.t;
        v41 v41Var5 = v41VarArr2[10];
        zn2Var.a(yn2Var5, v8Var);
        boolean z2 = false;
        z2 = false;
        zn2Var.a(kn2.h, new q3(null, new v10(this, z2 ? 1 : 0)));
        int i = this.F.d;
        if (i == 6) {
            k00.a.getClass();
            y7 y7Var = j00.c;
            yn2 yn2Var6 = vn2.r;
            v41 v41Var6 = v41VarArr2[8];
            zn2Var.a(yn2Var6, y7Var);
        } else if (i == 7 || i == 8) {
            k00.a.getClass();
            y7 y7Var2 = j00.b;
            yn2 yn2Var7 = vn2.r;
            v41 v41Var7 = v41VarArr2[8];
            zn2Var.a(yn2Var7, y7Var2);
        } else if (i == 4) {
            k00.a.getClass();
            y7 y7Var3 = j00.d;
            yn2 yn2Var8 = vn2.r;
            v41 v41Var8 = v41VarArr2[8];
            zn2Var.a(yn2Var8, y7Var3);
        }
        boolean z3 = this.B;
        a83 a83Var = a83.a;
        if (!z3) {
            zn2Var.a(vn2.j, a83Var);
        }
        if (z) {
            zn2Var.a(vn2.L, a83Var);
        }
        int i2 = 1;
        if (this.B && !this.A) {
            z2 = true;
        }
        yn2 yn2Var9 = vn2.O;
        v41 v41Var9 = v41VarArr2[28];
        zn2Var.a(yn2Var9, Boolean.valueOf(z2));
        xn2.a(zn2Var, new v10(this, i2));
        int i3 = 2;
        if (z2) {
            zn2Var.a(kn2.k, new q3(null, new v10(this, i3)));
            zn2Var.a(kn2.o, new q3(null, new v10(this, zn2Var)));
        }
        zn2Var.a(kn2.j, new q3(null, new wt0(3, this)));
        int i4 = this.F.e;
        u10 u10Var = new u10(this, 6);
        zn2Var.a(vn2.I, new wx0(i4));
        zn2Var.a(kn2.p, new q3(null, u10Var));
        zn2Var.a(kn2.b, new q3(null, new u10(this, 7)));
        zn2Var.a(kn2.c, new q3(null, new u10(this, 1)));
        if (!f13.c(this.y.b) && !z) {
            zn2Var.a(kn2.q, new q3(null, new u10(this, 2)));
            if (this.B && !this.A) {
                zn2Var.a(kn2.r, new q3(null, new u10(this, 3)));
            }
        }
        if (!this.B || this.A) {
            return;
        }
        zn2Var.a(kn2.s, new q3(null, new u10(this, 5)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final boolean o0() {
        return true;
    }
}
