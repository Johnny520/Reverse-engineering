package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s50 implements if1 {
    public final /* synthetic */ int h;
    public final if1 i;
    public final Enum j;
    public final Enum k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ s50(if1 if1Var, Enum r2, Enum r3, int i) {
        this.h = i;
        this.i = if1Var;
        this.j = r2;
        this.k = r3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int N(int i) {
        switch (this.h) {
        }
        return this.i.N(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int W(int i) {
        switch (this.h) {
        }
        return this.i.W(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int X(int i) {
        switch (this.h) {
        }
        return this.i.X(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final sz1 e(long j) {
        int i = this.h;
        Enum r1 = this.j;
        Enum r2 = this.k;
        if1 if1Var = this.i;
        switch (i) {
            case 0:
                q11 q11Var = (q11) r2;
                n11 n11Var = (n11) r1;
                n11 n11Var2 = n11.i;
                if (q11Var == q11.h) {
                    return new jj0(n11Var == n11Var2 ? if1Var.W(fz.g(j)) : if1Var.N(fz.g(j)), fz.c(j) ? fz.g(j) : 32767, 0);
                }
                return new jj0(fz.d(j) ? fz.h(j) : 32767, n11Var == n11Var2 ? if1Var.f(fz.h(j)) : if1Var.X(fz.h(j)), 0);
            case 1:
                sf1 sf1Var = (sf1) r2;
                rf1 rf1Var = (rf1) r1;
                rf1 rf1Var2 = rf1.i;
                if (sf1Var == sf1.h) {
                    return new jj0(rf1Var == rf1Var2 ? if1Var.W(fz.g(j)) : if1Var.N(fz.g(j)), fz.c(j) ? fz.g(j) : 32767, 1);
                }
                return new jj0(fz.d(j) ? fz.h(j) : 32767, rf1Var == rf1Var2 ? if1Var.f(fz.h(j)) : if1Var.X(fz.h(j)), 1);
            default:
                do1 do1Var = (do1) r2;
                co1 co1Var = (co1) r1;
                co1 co1Var2 = co1.i;
                if (do1Var == do1.h) {
                    return new jj0(co1Var == co1Var2 ? if1Var.W(fz.g(j)) : if1Var.N(fz.g(j)), fz.c(j) ? fz.g(j) : 32767, 2);
                }
                return new jj0(fz.d(j) ? fz.h(j) : 32767, co1Var == co1Var2 ? if1Var.f(fz.h(j)) : if1Var.X(fz.h(j)), 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int f(int i) {
        switch (this.h) {
        }
        return this.i.f(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final Object i() {
        switch (this.h) {
        }
        return this.i.i();
    }
}
