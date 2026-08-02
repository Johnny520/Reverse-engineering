package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lj implements aa0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.aa0
    public final void a() throws Exception {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((gj) obj2).b((sw) obj);
                break;
            case 1:
                ((cz0) obj2).a.j((az0) obj);
                break;
            case 2:
                ((g91) obj2).j.k(obj);
                break;
            case 3:
                ((gj) obj2).b((yw) obj);
                break;
            case 4:
                ((y33) obj2).j.remove((y33) obj);
                break;
            case 5:
                y33 y33Var = (y33) obj2;
                t33 t33Var = (t33) ((u33) obj).b.getValue();
                if (t33Var != null) {
                    y33Var.i.remove(t33Var.h);
                }
                break;
            default:
                ff3 ff3Var = (ff3) obj2;
                View view = (View) obj;
                int i2 = ff3Var.t - 1;
                ff3Var.t = i2;
                if (i2 == 0) {
                    int i3 = wa3.a;
                    ra3.b(view, null);
                    wa3.b(view, null);
                    view.removeOnAttachStateChangeListener(ff3Var.u);
                }
                break;
        }
    }
}
