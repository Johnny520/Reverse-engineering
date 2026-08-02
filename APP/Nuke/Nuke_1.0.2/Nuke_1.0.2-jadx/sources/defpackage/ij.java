package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ij implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ij(in0 in0Var, boolean z) {
        this.h = 1;
        this.i = z;
        this.j = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        boolean z = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                sw swVar = (sw) obj2;
                swVar.j(z);
                return new kj((pa1) obj, swVar, 0);
            case 1:
                in0 in0Var = (in0) obj2;
                String str = (String) obj;
                str.getClass();
                if (z) {
                    String strReplace = str.replace('\n', ' ');
                    strReplace.getClass();
                    String strReplace2 = strReplace.replace('\r', ' ');
                    strReplace2.getClass();
                    in0Var.j(strReplace2);
                } else {
                    in0Var.j(str);
                }
                return a83.a;
            default:
                yw ywVar = (yw) obj2;
                ywVar.j(z);
                return new kj((pa1) obj, ywVar, 1);
        }
    }

    public /* synthetic */ ij(v3 v3Var, boolean z, int i) {
        this.h = i;
        this.j = v3Var;
        this.i = z;
    }
}
