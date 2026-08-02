package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pw implements pn0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [op0.<clinit>():void, rp0.<clinit>():void] */
    public /* synthetic */ pw(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pn0
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                cz2 cz2Var = (cz2) obj;
                ry2 ry2Var = (ry2) obj2;
                xm0 xm0Var = (xm0) obj3;
                px pxVar = (px) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ((go0) pxVar).f(cz2Var) : ((go0) pxVar).h(cz2Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= (iIntValue & 64) == 0 ? ((go0) pxVar).f(ry2Var) : ((go0) pxVar).h(ry2Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= ((go0) pxVar).h(xm0Var) ? 256 : 128;
                }
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
                    go0Var.R();
                } else {
                    k60.c(cz2Var, ry2Var, xm0Var, go0Var, i2 & 1022);
                }
                break;
            case 1:
                cz2 cz2Var2 = (cz2) obj;
                ry2 ry2Var2 = (ry2) obj2;
                xm0 xm0Var2 = (xm0) obj3;
                px pxVar2 = (px) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((go0) pxVar2).f(cz2Var2) : ((go0) pxVar2).h(cz2Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= (iIntValue2 & 64) == 0 ? ((go0) pxVar2).f(ry2Var2) : ((go0) pxVar2).h(ry2Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i3 |= ((go0) pxVar2).h(xm0Var2) ? 256 : 128;
                }
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(i3 & 1, (i3 & 1171) != 1170)) {
                    go0Var2.R();
                } else {
                    k60.c(cz2Var2, ry2Var2, xm0Var2, go0Var2, i3 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((f13) obj5).a;
                String string = ((CharSequence) obj4).subSequence(f13.f(j), f13.e(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return a83Var;
    }
}
