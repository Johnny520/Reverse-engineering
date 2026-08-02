package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zm implements in0 {
    public final /* synthetic */ int h;
    public Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zm(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                ((np) this.i).cancel();
                break;
            case 1:
                ((s52) this.i).cancel();
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                u12 u12Var = (u12) this.i;
                if (u12Var != null) {
                    u12Var.c = zBooleanValue;
                }
                break;
            default:
                float[] fArr = ((hf1) obj).a;
                c61 c61Var = (c61) this.i;
                if (c61Var.w()) {
                    s11.J(c61Var).H(c61Var, fArr);
                }
                break;
        }
        return a83Var;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ic.<init>(android.content.Context, eo0, int, tm1, android.view.View, zv1):void] */
    public /* synthetic */ zm() {
        this.h = 2;
    }
}
