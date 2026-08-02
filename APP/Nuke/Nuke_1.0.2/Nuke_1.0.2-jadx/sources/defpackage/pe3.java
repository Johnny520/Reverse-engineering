package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pe3 {
    public final cf3 a;
    public zz0[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pe3(cf3 cf3Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = cf3Var;
        c(cf3Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        zz0[] zz0VarArr = this.b;
        if (zz0VarArr != null) {
            zz0 zz0VarI = zz0VarArr[0];
            zz0 zz0VarI2 = zz0VarArr[1];
            cf3 cf3Var = this.a;
            if (zz0VarI2 == null) {
                zz0VarI2 = cf3Var.a.i(2);
            }
            if (zz0VarI == null) {
                zz0VarI = cf3Var.a.i(1);
            }
            h(zz0.a(zz0VarI, zz0VarI2));
            zz0 zz0Var = this.b[ze3.a(16)];
            if (zz0Var != null) {
                g(zz0Var);
            }
            zz0 zz0Var2 = this.b[ze3.a(32)];
            if (zz0Var2 != null) {
                e(zz0Var2);
            }
            zz0 zz0Var3 = this.b[ze3.a(64)];
            if (zz0Var3 != null) {
                i(zz0Var3);
            }
        }
    }

    public abstract cf3 b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(cf3 cf3Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listF = cf3Var.a.f(i);
            int iA = ze3.a(i);
            this.c[iA] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List<Rect> listG = cf3Var.a.g(i);
                this.d[iA] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(int i, zz0 zz0Var) {
        if (this.b == null) {
            this.b = new zz0[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[ze3.a(i2)] = zz0Var;
            }
        }
    }

    public abstract void f(zz0 zz0Var);

    public abstract void h(zz0 zz0Var);

    public pe3() {
        this(new cf3((cf3) null));
    }

    public void e(zz0 zz0Var) {
    }

    public void g(zz0 zz0Var) {
    }

    public void i(zz0 zz0Var) {
    }
}
