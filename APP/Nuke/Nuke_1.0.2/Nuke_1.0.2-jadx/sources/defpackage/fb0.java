package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fb0 extends w51 implements in0 {
    public final /* synthetic */ int i = 0;
    public final /* synthetic */ y62 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(n4 n4Var, gb0 gb0Var, y62 y62Var) {
        super(1);
        this.j = y62Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        c43 c43Var = c43.h;
        y62 y62Var = this.j;
        switch (i) {
            case 0:
                gb0 gb0Var = (gb0) obj;
                if (!gb0Var.u) {
                    return c43.i;
                }
                if (gb0Var.w != null) {
                    kz0.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                gb0Var.w = null;
                y62Var.h = y62Var.h;
                return c43Var;
            default:
                if (!((wu0) obj).x) {
                    return c43Var;
                }
                y62Var.h = false;
                return c43.j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(y62 y62Var) {
        super(1);
        this.j = y62Var;
    }
}
