package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fb0 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f2892i = 0;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ y62 f2893j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(C0485n4 c0485n4, gb0 gb0Var, y62 y62Var) {
        super(1);
        this.f2893j = y62Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f2892i;
        c43 c43Var = c43.f1146h;
        y62 y62Var = this.f2893j;
        switch (i) {
            case 0:
                gb0 gb0Var = (gb0) obj;
                if (!gb0Var.f10770u) {
                    return c43.f1147i;
                }
                if (gb0Var.f3383w != null) {
                    kz0.m2764b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                gb0Var.f3383w = null;
                y62Var.f13324h = y62Var.f13324h;
                return c43Var;
            default:
                if (!((wu0) obj).f12651x) {
                    return c43Var;
                }
                y62Var.f13324h = false;
                return c43.f1148j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(y62 y62Var) {
        super(1);
        this.f2893j = y62Var;
    }
}
