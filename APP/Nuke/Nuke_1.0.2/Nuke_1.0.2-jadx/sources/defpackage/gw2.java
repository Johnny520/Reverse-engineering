package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gw2 extends w51 implements mn0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ hw2 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw2(hw2 hw2Var, int i) {
        super(2);
        this.i = i;
        this.j = hw2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        a83 a83Var = a83.a;
        hw2 hw2Var = this.j;
        switch (i) {
            case 0:
                hw2Var.a().i = (yx) obj2;
                break;
            case 1:
                f71 f71VarA = hw2Var.a();
                ((r61) obj).c0(new b71(f71VarA, (mn0) obj2, f71VarA.w));
                break;
            default:
                r61 r61Var = (r61) obj;
                sz0 sz0Var = hw2Var.a;
                f71 f71Var = r61Var.O;
                if (f71Var == null) {
                    f71Var = new f71(r61Var, sz0Var);
                    r61Var.O = f71Var;
                }
                hw2Var.b = f71Var;
                hw2Var.a().h();
                f71 f71VarA2 = hw2Var.a();
                if (f71VarA2.j != sz0Var) {
                    f71VarA2.j = sz0Var;
                    f71VarA2.i(false);
                    r61.V(f71VarA2.h, false, 7);
                }
                break;
        }
        return a83Var;
    }
}
