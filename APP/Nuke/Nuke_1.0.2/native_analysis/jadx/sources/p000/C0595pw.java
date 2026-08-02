package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: renamed from: pw */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0595pw implements pn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8620h;

    public /* synthetic */ C0595pw(int i) {
        this.f8620h = i;
    }

    @Override // p000.pn0
    /* JADX INFO: renamed from: k */
    public final Object mo2749k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f8620h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                cz2 cz2Var = (cz2) obj;
                ry2 ry2Var = (ry2) obj2;
                xm0 xm0Var = (xm0) obj3;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ((go0) interfaceC0596px).m1980f(cz2Var) : ((go0) interfaceC0596px).m1984h(cz2Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= (iIntValue & 64) == 0 ? ((go0) interfaceC0596px).m1980f(ry2Var) : ((go0) interfaceC0596px).m1984h(ry2Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= ((go0) interfaceC0596px).m1984h(xm0Var) ? 256 : 128;
                }
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
                    go0Var.m1961R();
                } else {
                    k60.m2608c(cz2Var, ry2Var, xm0Var, go0Var, i2 & 1022);
                }
                break;
            case 1:
                cz2 cz2Var2 = (cz2) obj;
                ry2 ry2Var2 = (ry2) obj2;
                xm0 xm0Var2 = (xm0) obj3;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((go0) interfaceC0596px2).m1980f(cz2Var2) : ((go0) interfaceC0596px2).m1984h(cz2Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= (iIntValue2 & 64) == 0 ? ((go0) interfaceC0596px2).m1980f(ry2Var2) : ((go0) interfaceC0596px2).m1984h(ry2Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i3 |= ((go0) interfaceC0596px2).m1984h(xm0Var2) ? 256 : 128;
                }
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(i3 & 1, (i3 & 1171) != 1170)) {
                    go0Var2.m1961R();
                } else {
                    k60.m2608c(cz2Var2, ry2Var2, xm0Var2, go0Var2, i3 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((f13) obj5).f2739a;
                String string = ((CharSequence) obj4).subSequence(f13.m1497f(j), f13.m1496e(j)).toString();
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
