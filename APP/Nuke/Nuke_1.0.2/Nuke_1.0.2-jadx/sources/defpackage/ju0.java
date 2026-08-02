package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ju0 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ kw i;
    public final /* synthetic */ o72 j;
    public final /* synthetic */ ViewGroup k;
    public final /* synthetic */ y62 l;
    public final /* synthetic */ l80 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ju0(kw kwVar, o72 o72Var, ViewGroup viewGroup, y62 y62Var, l80 l80Var, int i) {
        this.h = i;
        this.i = kwVar;
        this.j = o72Var;
        this.k = viewGroup;
        this.l = y62Var;
        this.m = l80Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        px pxVar = (px) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    pp0.d(xe1.i0(341640236, new ju0(this.i, this.j, this.k, this.l, this.m, 1), go0Var), go0Var, 48);
                }
                break;
            default:
                go0 go0Var2 = (go0) pxVar;
                if (!go0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var2.R();
                } else {
                    this.i.e(new lu0(this.j, this.k, this.l, this.m), go0Var2, 0);
                }
                break;
        }
        return a83Var;
    }
}
