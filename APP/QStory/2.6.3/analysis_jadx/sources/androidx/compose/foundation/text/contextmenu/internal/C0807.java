package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.text.C2035;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6545;
import p121.InterfaceC7392;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0807 implements InterfaceC6545 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2305;

    public /* synthetic */ C0807(int i) {
        this.f2305 = i;
    }

    @Override // p052.InterfaceC6545
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f2305;
        C5176 c5176 = C5176.f14739;
        switch (i) {
            case 0:
                InterfaceC7392 interfaceC7392 = (InterfaceC7392) obj;
                InterfaceC0827 interfaceC0827 = (InterfaceC0827) obj2;
                InterfaceC6543 interfaceC6543 = (InterfaceC6543) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ((C1324) interfaceC1373).m2360(interfaceC7392) : ((C1324) interfaceC1373).m2378(interfaceC7392) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= (iIntValue & 64) == 0 ? ((C1324) interfaceC1373).m2360(interfaceC0827) : ((C1324) interfaceC1373).m2378(interfaceC0827) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= ((C1324) interfaceC1373).m2378(interfaceC6543) ? 256 : 128;
                }
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(i2 & 1, (i2 & 1171) != 1170)) {
                    c1324.m2339();
                } else {
                    AbstractC0802.m1628(interfaceC7392, interfaceC0827, interfaceC6543, c1324, i2 & 1022);
                }
                break;
            case 1:
                InterfaceC7392 interfaceC73922 = (InterfaceC7392) obj;
                InterfaceC0827 interfaceC08272 = (InterfaceC0827) obj2;
                InterfaceC6543 interfaceC65432 = (InterfaceC6543) obj3;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((C1324) interfaceC13732).m2360(interfaceC73922) : ((C1324) interfaceC13732).m2378(interfaceC73922) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= (iIntValue2 & 64) == 0 ? ((C1324) interfaceC13732).m2360(interfaceC08272) : ((C1324) interfaceC13732).m2378(interfaceC08272) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i3 |= ((C1324) interfaceC13732).m2378(interfaceC65432) ? 256 : 128;
                }
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2343(i3 & 1, (i3 & 1171) != 1170)) {
                    c13242.m2339();
                } else {
                    AbstractC0802.m1628(interfaceC73922, interfaceC08272, interfaceC65432, c13242, i3 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((C2035) obj5).f6004;
                String string = ((CharSequence) obj4).subSequence(C2035.m3757(j), C2035.m3750(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return c5176;
    }
}
