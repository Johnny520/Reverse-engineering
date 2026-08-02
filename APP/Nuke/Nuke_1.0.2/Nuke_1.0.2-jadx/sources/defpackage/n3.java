package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n3 {
    public o3[] h;
    public int i;
    public int j;
    public kw2 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o3 b() {
        o3 o3VarC;
        kw2 kw2Var;
        synchronized (this) {
            try {
                o3[] o3VarArrD = this.h;
                if (o3VarArrD == null) {
                    o3VarArrD = d();
                    this.h = o3VarArrD;
                } else if (this.i >= o3VarArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(o3VarArrD, o3VarArrD.length * 2);
                    this.h = (o3[]) objArrCopyOf;
                    o3VarArrD = (o3[]) objArrCopyOf;
                }
                int i = this.j;
                do {
                    o3VarC = o3VarArrD[i];
                    if (o3VarC == null) {
                        o3VarC = c();
                        o3VarArrD[i] = o3VarC;
                    }
                    i++;
                    if (i >= o3VarArrD.length) {
                        i = 0;
                    }
                } while (!o3VarC.a(this));
                this.j = i;
                this.i++;
                kw2Var = this.k;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kw2Var != null) {
            kw2Var.v(1);
        }
        return o3VarC;
    }

    public abstract o3 c();

    public abstract o3[] d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(o3 o3Var) {
        kw2 kw2Var;
        int i;
        t00[] t00VarArrB;
        synchronized (this) {
            try {
                int i2 = this.i - 1;
                this.i = i2;
                kw2Var = this.k;
                if (i2 == 0) {
                    this.j = 0;
                }
                o3Var.getClass();
                t00VarArrB = o3Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (t00 t00Var : t00VarArrB) {
            if (t00Var != null) {
                t00Var.h(a83.a);
            }
        }
        if (kw2Var != null) {
            kw2Var.v(-1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final kw2 f() {
        kw2 kw2Var;
        synchronized (this) {
            kw2Var = this.k;
            if (kw2Var == null) {
                int i = this.i;
                kw2Var = new kw2(1, Integer.MAX_VALUE, hn.i);
                kw2Var.p(Integer.valueOf(i));
                this.k = kw2Var;
            }
        }
        return kw2Var;
    }
}
