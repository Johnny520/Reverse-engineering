package defpackage;

import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y1 implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ List i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ y1(int i, List list) {
        this.h = i;
        this.i = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.h;
        a83 a83Var = a83.a;
        List list = this.i;
        int i2 = 1;
        Object[] objArr = 0;
        px pxVar = (px) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((o71) obj).getClass();
        int i3 = iIntValue & 17;
        switch (i) {
            case 0:
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, i3 != 16)) {
                    go0Var.R();
                } else {
                    eu.n(null, rg3.P(R.string.about_module_project_section, go0Var), xe1.i0(-1353787701, new q1(objArr == true ? 1 : 0, list), go0Var), go0Var, 384, 1);
                }
                break;
            case 1:
                go0 go0Var2 = (go0) pxVar;
                if (!go0Var2.O(iIntValue & 1, i3 != 16)) {
                    go0Var2.R();
                } else {
                    eu.n(null, rg3.P(R.string.about_module_thanks_section, go0Var2), xe1.i0(785052172, new q1(i2, list), go0Var2), go0Var2, 384, 1);
                }
                break;
            default:
                go0 go0Var3 = (go0) pxVar;
                if (!go0Var3.O(iIntValue & 1, i3 != 16)) {
                    go0Var3.R();
                } else {
                    s11.n(list, go0Var3, 0);
                }
                break;
        }
        return a83Var;
    }
}
