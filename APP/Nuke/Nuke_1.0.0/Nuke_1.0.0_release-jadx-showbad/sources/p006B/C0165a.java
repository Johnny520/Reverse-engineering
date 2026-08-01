package p006B;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import me.dartcv.nuke.BuildConfig;
import p018D.InterfaceC0258g;
import p028F.AbstractC0355p;
import p040H.InterfaceC0546d;
import p056K2.C0891q;
import p092S0.C1259L;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1606h;

/* JADX INFO: renamed from: B.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0165a implements InterfaceC1606h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f594d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1606h
    /* JADX INFO: renamed from: j */
    public final Object mo244j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i5;
        int i6;
        switch (this.f594d) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j5 = ((C1259L) obj5).f4538a;
                String string = ((CharSequence) obj4).subSequence(C1259L.m2338f(j5), C1259L.m2337e(j5)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC0258g interfaceC0258g = (InterfaceC0258g) obj;
                InterfaceC0546d interfaceC0546d = (InterfaceC0546d) obj2;
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) obj3;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i5 = ((iIntValue & 8) == 0 ? ((C1383r) interfaceC1373m).m2582f(interfaceC0258g) : ((C1383r) interfaceC1373m).m2586h(interfaceC0258g) ? 4 : 2) | iIntValue;
                } else {
                    i5 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i5 |= (iIntValue & 64) == 0 ? ((C1383r) interfaceC1373m).m2582f(interfaceC0546d) : ((C1383r) interfaceC1373m).m2586h(interfaceC0546d) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i5 |= ((C1383r) interfaceC1373m).m2586h(interfaceC1599a) ? 256 : 128;
                }
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(i5 & 1, (i5 & 1171) != 1170)) {
                    AbstractC0355p.m565c(interfaceC0258g, interfaceC0546d, interfaceC1599a, c1383r, i5 & 1022);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                InterfaceC0258g interfaceC0258g2 = (InterfaceC0258g) obj;
                InterfaceC0546d interfaceC0546d2 = (InterfaceC0546d) obj2;
                InterfaceC1599a interfaceC1599a2 = (InterfaceC1599a) obj3;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i6 = ((iIntValue2 & 8) == 0 ? ((C1383r) interfaceC1373m2).m2582f(interfaceC0258g2) : ((C1383r) interfaceC1373m2).m2586h(interfaceC0258g2) ? 4 : 2) | iIntValue2;
                } else {
                    i6 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i6 |= (iIntValue2 & 64) == 0 ? ((C1383r) interfaceC1373m2).m2582f(interfaceC0546d2) : ((C1383r) interfaceC1373m2).m2586h(interfaceC0546d2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i6 |= ((C1383r) interfaceC1373m2).m2586h(interfaceC1599a2) ? 256 : 128;
                }
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(i6 & 1, (i6 & 1171) != 1170)) {
                    AbstractC0355p.m565c(interfaceC0258g2, interfaceC0546d2, interfaceC1599a2, c1383r2, i6 & 1022);
                } else {
                    c1383r2.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
