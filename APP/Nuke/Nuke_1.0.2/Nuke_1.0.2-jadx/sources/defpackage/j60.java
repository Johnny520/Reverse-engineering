package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j60 implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j60(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj4 = this.i;
        switch (i) {
            case 0:
                long j = ((ju) obj).a;
                px pxVar = (px) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) pxVar).e(j) ? 4 : 2;
                }
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    go0Var.R();
                } else {
                    k60.b(((xy2) obj4).c, j, go0Var, (iIntValue << 3) & 112);
                }
                break;
            case 1:
                long j2 = ((ju) obj).a;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.R();
                } else {
                    gd3.L.a((Drawable) obj4, go0Var2, 48);
                }
                break;
            default:
                long j3 = ((ju) obj).a;
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.R();
                } else {
                    gd3.L.e(((RemoteAction) obj4).getIcon(), go0Var3, 48);
                }
                break;
        }
        return a83Var;
    }
}
