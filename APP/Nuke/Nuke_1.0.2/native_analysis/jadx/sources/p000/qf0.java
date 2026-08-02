package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8951i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ rf0 f8952j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf0(rf0 rf0Var, int i) {
        super(1);
        this.f8951i = i;
        this.f8952j = rf0Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f8951i;
        if0 if0Var = if0.f4589j;
        if0 if0Var2 = if0.f4588i;
        if0 if0Var3 = if0.f4587h;
        rf0 rf0Var = this.f8952j;
        switch (i) {
            case 0:
                v33 v33Var = (v33) obj;
                boolean zM5620a = v33Var.m5620a(if0Var3, if0Var2);
                qt2 qt2Var = null;
                if (!zM5620a) {
                    if (v33Var.m5620a(if0Var2, if0Var)) {
                        z33 z33Var = rf0Var.f9540z.f8350a;
                    } else {
                        qt2Var = nf0.f7133d;
                    }
                }
                return qt2Var == null ? nf0.f7133d : qt2Var;
            default:
                v33 v33Var2 = (v33) obj;
                if (v33Var2.m5620a(if0Var3, if0Var2)) {
                    return nf0.f7132c;
                }
                if (!v33Var2.m5620a(if0Var2, if0Var)) {
                    return nf0.f7132c;
                }
                z33 z33Var2 = rf0Var.f9540z.f8350a;
                return nf0.f7132c;
        }
    }
}
