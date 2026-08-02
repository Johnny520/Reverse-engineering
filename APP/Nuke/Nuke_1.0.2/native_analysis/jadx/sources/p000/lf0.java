package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lf0 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f6094i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ sf0 f6095j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ph0 f6096k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf0(sf0 sf0Var, ph0 ph0Var, int i) {
        super(1);
        this.f6094i = i;
        this.f6095j = sf0Var;
        this.f6096k = ph0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        fj0 fj0Var;
        fj0 fj0Var2;
        int i = this.f6094i;
        if0 if0Var = if0.f4589j;
        if0 if0Var2 = if0.f4588i;
        if0 if0Var3 = if0.f4587h;
        float f = 1.0f;
        sf0 sf0Var = this.f6095j;
        ph0 ph0Var = this.f6096k;
        switch (i) {
            case 0:
                v33 v33Var = (v33) obj;
                if (v33Var.m5620a(if0Var3, if0Var2)) {
                    uh0 uh0Var = sf0Var.f10101a.f13712a;
                    return (uh0Var == null || (fj0Var2 = uh0Var.f11314a) == null) ? nf0.f7131b : fj0Var2;
                }
                if (!v33Var.m5620a(if0Var2, if0Var)) {
                    return nf0.f7131b;
                }
                uh0 uh0Var2 = ph0Var.f8350a.f13712a;
                return (uh0Var2 == null || (fj0Var = uh0Var2.f11314a) == null) ? nf0.f7131b : fj0Var;
            case 1:
                int iOrdinal = ((if0) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            c80.m675s();
                            return null;
                        }
                        if (ph0Var.f8350a.f13712a != null) {
                            f = 0.0f;
                        }
                    }
                } else if (sf0Var.f10101a.f13712a != null) {
                }
                return Float.valueOf(f);
            case 2:
                v33 v33Var2 = (v33) obj;
                if (v33Var2.m5620a(if0Var3, if0Var2)) {
                    cd2 cd2Var = sf0Var.f10101a.f13713b;
                    return cd2Var != null ? cd2Var.f1490b : nf0.f7131b;
                }
                if (!v33Var2.m5620a(if0Var2, if0Var)) {
                    return nf0.f7131b;
                }
                cd2 cd2Var2 = ph0Var.f8350a.f13713b;
                return cd2Var2 != null ? cd2Var2.f1490b : nf0.f7131b;
            default:
                int iOrdinal2 = ((if0) obj).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            c80.m675s();
                            return null;
                        }
                        if (ph0Var.f8350a.f13713b != null) {
                            f = 0.96f;
                        }
                    }
                } else if (sf0Var.f10101a.f13713b != null) {
                }
                return Float.valueOf(f);
        }
    }
}
