package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wx1 extends i93 {
    public an b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public an g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public xv2 q;
    public final y9 r;
    public y9 s;
    public y9 t;
    public final j71 u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wx1() {
        int i = s93.a;
        this.d = be0.h;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        y9 y9VarA = aa.a();
        this.r = y9VarA;
        this.s = y9VarA;
        this.u = p7.B(i91.i, jy.t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i93
    public final void a(nc0 nc0Var) {
        nc0 nc0Var2;
        xv2 xv2Var;
        if (this.n) {
            pp0.H(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        an anVar = this.b;
        if (anVar != null) {
            nc0Var2 = nc0Var;
            nc0.v(nc0Var2, this.s, anVar, this.c, null, 56);
        } else {
            nc0Var2 = nc0Var;
        }
        an anVar2 = this.g;
        if (anVar2 != null) {
            xv2 xv2Var2 = this.q;
            if (this.o || xv2Var2 == null) {
                xv2 xv2Var3 = new xv2(this.f, this.j, this.h, this.i, 16);
                this.q = xv2Var3;
                this.o = false;
                xv2Var = xv2Var3;
            } else {
                xv2Var = xv2Var2;
            }
            nc0.v(nc0Var2, this.s, anVar2, this.e, xv2Var, 48);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        float f = this.k;
        y9 y9Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = y9Var;
            return;
        }
        if (t11.l(this.s, y9Var)) {
            this.s = aa.a();
        } else {
            Path.FillType fillType = this.s.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        j71 j71Var = this.u;
        ((z9) j71Var.getValue()).a.setPath(y9Var != null ? y9Var.a : null, false);
        float length = ((z9) j71Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((z9) j71Var.getValue()).a(f4, f5, this.s);
            return;
        }
        y9 y9VarA = this.t;
        if (y9VarA == null) {
            y9VarA = aa.a();
            this.t = y9VarA;
        }
        y9VarA.g();
        ((z9) j71Var.getValue()).a(f4, length, y9VarA);
        y9.a(this.s, y9VarA);
        y9VarA.g();
        ((z9) j71Var.getValue()).a(0.0f, f5, y9VarA);
        y9.a(this.s, y9VarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.r.toString();
    }
}
