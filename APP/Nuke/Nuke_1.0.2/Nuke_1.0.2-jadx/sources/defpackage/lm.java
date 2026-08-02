package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lm {
    public final zk1 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lm(int i) {
        switch (i) {
            case 1:
                this.a = new zk1(new p71[16]);
                break;
            default:
                this.a = new zk1(new d00[16]);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(CancellationException cancellationException) {
        zk1 zk1Var = this.a;
        int i = zk1Var.j;
        lp[] lpVarArr = new lp[i];
        for (int i2 = 0; i2 < i; i2++) {
            lpVarArr[i2] = ((d00) zk1Var.h[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            lpVarArr[i3].n(cancellationException);
        }
        if (zk1Var.j == 0) {
            return;
        }
        nz0.c("uncancelled requests present");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        zk1 zk1Var = this.a;
        c11 c11VarX = ci0.X(0, zk1Var.j);
        int i = c11VarX.h;
        int i2 = c11VarX.i;
        if (i <= i2) {
            while (true) {
                ((d00) zk1Var.h[i]).b.h(a83.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        zk1Var.g();
    }
}
