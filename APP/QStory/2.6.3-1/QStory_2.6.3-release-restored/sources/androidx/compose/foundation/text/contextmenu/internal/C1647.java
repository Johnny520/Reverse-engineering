package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7374;
import p137.InterfaceC8221;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1647 implements InterfaceC7374 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2650;

    public /* synthetic */ C1647(int i) {
        this.f2650 = i;
    }

    @Override // p068.InterfaceC7374
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f2650;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                InterfaceC8221 interfaceC8221 = (InterfaceC8221) obj;
                InterfaceC1667 interfaceC1667 = (InterfaceC1667) obj2;
                InterfaceC7372 interfaceC7372 = (InterfaceC7372) obj3;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ((C2159) interfaceC2208).m2920(interfaceC8221) : ((C2159) interfaceC2208).m2938(interfaceC8221) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= (iIntValue & 64) == 0 ? ((C2159) interfaceC2208).m2920(interfaceC1667) : ((C2159) interfaceC2208).m2938(interfaceC1667) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= ((C2159) interfaceC2208).m2938(interfaceC7372) ? 256 : 128;
                }
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(i2 & 1, (i2 & 1171) != 1170)) {
                    c2159.m2899();
                } else {
                    AbstractC1642.m2188(interfaceC8221, interfaceC1667, interfaceC7372, c2159, i2 & 1022);
                }
                break;
            case 1:
                InterfaceC8221 interfaceC82212 = (InterfaceC8221) obj;
                InterfaceC1667 interfaceC16672 = (InterfaceC1667) obj2;
                InterfaceC7372 interfaceC73722 = (InterfaceC7372) obj3;
                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((C2159) interfaceC22082).m2920(interfaceC82212) : ((C2159) interfaceC22082).m2938(interfaceC82212) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= (iIntValue2 & 64) == 0 ? ((C2159) interfaceC22082).m2920(interfaceC16672) : ((C2159) interfaceC22082).m2938(interfaceC16672) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i3 |= ((C2159) interfaceC22082).m2938(interfaceC73722) ? 256 : 128;
                }
                C2159 c21592 = (C2159) interfaceC22082;
                if (!c21592.m2903(i3 & 1, (i3 & 1171) != 1170)) {
                    c21592.m2899();
                } else {
                    AbstractC1642.m2188(interfaceC82212, interfaceC16672, interfaceC73722, c21592, i3 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((C2869) obj5).f6349;
                String string = ((CharSequence) obj4).subSequence(C2869.m4317(j), C2869.m4310(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return c6008;
    }
}
