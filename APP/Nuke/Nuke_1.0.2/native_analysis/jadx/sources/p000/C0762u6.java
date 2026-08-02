package p000;

/* JADX INFO: renamed from: u6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0762u6 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11113i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ o72 f11114j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0762u6(o72 o72Var, int i) {
        super(1);
        this.f11113i = i;
        this.f11114j = o72Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        boolean z;
        int i = this.f11113i;
        o72 o72Var = this.f11114j;
        switch (i) {
            case 0:
                o72Var.f7574i = (pl0) obj;
                return Boolean.TRUE;
            case 1:
                wu0 wu0Var = (wu0) obj;
                Object obj2 = o72Var.f7574i;
                if (obj2 == null && wu0Var.f12651x) {
                    o72Var.f7574i = wu0Var;
                } else if (obj2 != null) {
                    wu0Var.getClass();
                }
                return Boolean.TRUE;
            default:
                Object obj3 = (d43) obj;
                if (((th1) obj3).f10757h.f10770u) {
                    o72Var.f7574i = obj3;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
