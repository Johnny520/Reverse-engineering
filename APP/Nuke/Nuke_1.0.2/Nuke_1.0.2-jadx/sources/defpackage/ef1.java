package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ef1 implements mn0 {
    public final /* synthetic */ o63 h;
    public final /* synthetic */ kw i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ef1(o63 o63Var, kw kwVar) {
        this.h = o63Var;
        this.i = kwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        px pxVar = (px) obj;
        int iIntValue = ((Number) obj2).intValue();
        go0 go0Var = (go0) pxVar;
        if (go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            v03.a(this.h.j, this.i, go0Var, 0);
        } else {
            go0Var.R();
        }
        return a83.a;
    }
}
