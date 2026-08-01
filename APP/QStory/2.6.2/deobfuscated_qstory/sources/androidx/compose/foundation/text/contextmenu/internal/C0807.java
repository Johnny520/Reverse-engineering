package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.text.C2035;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6544;
import p121.InterfaceC7391;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0807 implements InterfaceC6544 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2304;

    public /* synthetic */ C0807(int i) {
        this.f2304 = i;
    }

    @Override // p052.InterfaceC6544
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f2304;
        C5175 c5175 = C5175.f14739;
        switch (i) {
            case 0:
                InterfaceC7391 interfaceC7391 = (InterfaceC7391) obj;
                InterfaceC0827 interfaceC0827 = (InterfaceC0827) obj2;
                InterfaceC6542 interfaceC6542 = (InterfaceC6542) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ((C1324) interfaceC1373).m2350(interfaceC7391) : ((C1324) interfaceC1373).m2368(interfaceC7391) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= (iIntValue & 64) == 0 ? ((C1324) interfaceC1373).m2350(interfaceC0827) : ((C1324) interfaceC1373).m2368(interfaceC0827) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= ((C1324) interfaceC1373).m2368(interfaceC6542) ? 256 : 128;
                }
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(i2 & 1, (i2 & 1171) != 1170)) {
                    c1324.m2329();
                } else {
                    AbstractC0802.m1618(interfaceC7391, interfaceC0827, interfaceC6542, c1324, i2 & 1022);
                }
                break;
            case 1:
                InterfaceC7391 interfaceC73912 = (InterfaceC7391) obj;
                InterfaceC0827 interfaceC08272 = (InterfaceC0827) obj2;
                InterfaceC6542 interfaceC65422 = (InterfaceC6542) obj3;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((C1324) interfaceC13732).m2350(interfaceC73912) : ((C1324) interfaceC13732).m2368(interfaceC73912) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= (iIntValue2 & 64) == 0 ? ((C1324) interfaceC13732).m2350(interfaceC08272) : ((C1324) interfaceC13732).m2368(interfaceC08272) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i3 |= ((C1324) interfaceC13732).m2368(interfaceC65422) ? 256 : 128;
                }
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2333(i3 & 1, (i3 & 1171) != 1170)) {
                    c13242.m2329();
                } else {
                    AbstractC0802.m1618(interfaceC73912, interfaceC08272, interfaceC65422, c13242, i3 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((C2035) obj5).f6003;
                String string = ((CharSequence) obj4).subSequence(C2035.m3747(j), C2035.m3740(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return c5175;
    }
}
