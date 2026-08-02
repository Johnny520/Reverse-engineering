package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lf0 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ sf0 j;
    public final /* synthetic */ ph0 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf0(sf0 sf0Var, ph0 ph0Var, int i) {
        super(1);
        this.i = i;
        this.j = sf0Var;
        this.k = ph0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        fj0 fj0Var;
        fj0 fj0Var2;
        int i = this.i;
        if0 if0Var = if0.j;
        if0 if0Var2 = if0.i;
        if0 if0Var3 = if0.h;
        float f = 1.0f;
        sf0 sf0Var = this.j;
        ph0 ph0Var = this.k;
        switch (i) {
            case 0:
                v33 v33Var = (v33) obj;
                if (v33Var.a(if0Var3, if0Var2)) {
                    uh0 uh0Var = sf0Var.a.a;
                    return (uh0Var == null || (fj0Var2 = uh0Var.a) == null) ? nf0.b : fj0Var2;
                }
                if (!v33Var.a(if0Var2, if0Var)) {
                    return nf0.b;
                }
                uh0 uh0Var2 = ph0Var.a.a;
                return (uh0Var2 == null || (fj0Var = uh0Var2.a) == null) ? nf0.b : fj0Var;
            case 1:
                int iOrdinal = ((if0) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            c80.s();
                            return null;
                        }
                        if (ph0Var.a.a != null) {
                            f = 0.0f;
                        }
                    }
                } else if (sf0Var.a.a != null) {
                }
                return Float.valueOf(f);
            case 2:
                v33 v33Var2 = (v33) obj;
                if (v33Var2.a(if0Var3, if0Var2)) {
                    cd2 cd2Var = sf0Var.a.b;
                    return cd2Var != null ? cd2Var.b : nf0.b;
                }
                if (!v33Var2.a(if0Var2, if0Var)) {
                    return nf0.b;
                }
                cd2 cd2Var2 = ph0Var.a.b;
                return cd2Var2 != null ? cd2Var2.b : nf0.b;
            default:
                int iOrdinal2 = ((if0) obj).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            c80.s();
                            return null;
                        }
                        if (ph0Var.a.b != null) {
                            f = 0.96f;
                        }
                    }
                } else if (sf0Var.a.b != null) {
                }
                return Float.valueOf(f);
        }
    }
}
