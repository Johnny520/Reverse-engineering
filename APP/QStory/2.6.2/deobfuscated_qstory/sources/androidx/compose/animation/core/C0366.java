package androidx.compose.animation.core;

import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.InterfaceC1016;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.AbstractC0633;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.layout.C0636;
import androidx.compose.foundation.layout.C0638;
import androidx.compose.foundation.layout.InterfaceC0664;
import androidx.compose.foundation.text.contextmenu.internal.C0803;
import androidx.compose.foundation.text.contextmenu.provider.C0830;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import top.suzhelan.qstory.ui.components.AbstractC5963;
import top.yukonga.miuix.kmp.basic.AbstractC6026;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0366 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1252;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1253;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1254;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1255;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1256;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1257;

    public /* synthetic */ C0366(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1257 = i;
        this.f1255 = obj;
        this.f1256 = obj2;
        this.f1253 = obj3;
        this.f1252 = obj4;
        this.f1254 = obj5;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1257;
        C5175 c5175 = C5175.f14739;
        int i2 = 1;
        Object obj3 = this.f1254;
        Object obj4 = this.f1252;
        Object obj5 = this.f1253;
        Object obj6 = this.f1256;
        Object obj7 = this.f1255;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0330.m1008((C0364) obj7, (C0351) obj6, (Float) obj5, (Float) obj4, (InterfaceC0311) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(1));
                break;
            case 1:
                InterfaceC2129 interfaceC2129 = (InterfaceC2129) obj7;
                InterfaceC1395 interfaceC1395 = (InterfaceC1395) obj6;
                C1242 c1242 = (C1242) obj5;
                C0830 c0830 = (C0830) obj4;
                InterfaceC6542 interfaceC6542 = (InterfaceC6542) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2329();
                } else {
                    Object objM2335 = c1324.m2335();
                    if (objM2335 == C1369.f3973) {
                        objM2335 = new C0803(interfaceC1395, i2);
                        c1324.m2376(objM2335);
                    }
                    InterfaceC2129 interfaceC2129M3095 = AbstractC1670.m3095(interfaceC2129, (InterfaceC6557) objM2335);
                    InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, true);
                    int iHashCode = Long.hashCode(c1324.f3836);
                    C1253 c1253M2371 = c1324.m2371();
                    InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129M3095);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC65422 = C1765.f5184;
                    c1324.m2386();
                    if (c1324.f3837) {
                        c1324.m2370(interfaceC65422);
                    } else {
                        c1324.m2380();
                    }
                    AbstractC1367.m2464(c1324, interfaceC1658M1441, C1765.f5180);
                    AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
                    AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
                    AbstractC1367.m2472(c1324, C1765.f5186);
                    AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
                    c1242.invoke(c1324, 0);
                    c0830.m1637(interfaceC6542, c1324, 6);
                    c1324.m2367(true);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC5963.m11295((String) obj7, (String) obj6, (InterfaceC6542) obj5, (InterfaceC6542) obj4, (InterfaceC6542) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(24577));
                break;
            default:
                InterfaceC0580 interfaceC0580 = (InterfaceC0580) obj7;
                InterfaceC1016 interfaceC1016 = (InterfaceC1016) obj6;
                InterfaceC0664 interfaceC0664 = (InterfaceC0664) obj5;
                InterfaceC1395 interfaceC13952 = (InterfaceC1395) obj4;
                InterfaceC1395 interfaceC13953 = (InterfaceC1395) obj3;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2333(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c13242.m2329();
                } else {
                    InterfaceC6542 interfaceC65423 = (InterfaceC6542) interfaceC13952.getValue();
                    if (interfaceC65423 == null) {
                        interfaceC65423 = AbstractC6026.f16459;
                    }
                    InterfaceC2129 interfaceC2129M1424 = AbstractC0628.m1424(AbstractC1072.m1977(interfaceC0580, interfaceC1016, (InterfaceC6542) interfaceC13953.getValue(), interfaceC65423), interfaceC0664);
                    C0638 c0638M1439 = AbstractC0633.m1439(AbstractC0628.f1763, C2119.f6258, c13242, 0);
                    int iHashCode2 = Long.hashCode(c13242.f3836);
                    C1253 c1253M23712 = c13242.m2371();
                    InterfaceC2129 interfaceC2129M38512 = AbstractC2120.m3851(c13242, interfaceC2129M1424);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC65424 = C1765.f5184;
                    c13242.m2386();
                    if (c13242.f3837) {
                        c13242.m2370(interfaceC65424);
                    } else {
                        c13242.m2380();
                    }
                    AbstractC1367.m2464(c13242, c0638M1439, C1765.f5180);
                    AbstractC1367.m2464(c13242, c1253M23712, C1765.f5181);
                    AbstractC1367.m2483(c13242, Integer.valueOf(iHashCode2), C1765.f5187);
                    AbstractC1367.m2472(c13242, C1765.f5186);
                    AbstractC1367.m2464(c13242, interfaceC2129M38512, C1765.f5182);
                    AbstractC5963.f16172.invoke(C0636.f1785, c13242, 6);
                    c13242.m2367(true);
                }
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0366(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.f1257 = i2;
        this.f1255 = obj;
        this.f1256 = obj2;
        this.f1253 = obj3;
        this.f1252 = obj4;
        this.f1254 = obj5;
    }
}
