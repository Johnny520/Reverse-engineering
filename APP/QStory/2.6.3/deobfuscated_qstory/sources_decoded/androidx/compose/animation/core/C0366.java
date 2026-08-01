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
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import top.suzhelan.qstory.ui.components.AbstractC5969;
import top.yukonga.miuix.kmp.basic.AbstractC6032;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0366 implements InterfaceC6554 {

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

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1257;
        C5176 c5176 = C5176.f14739;
        int i2 = 1;
        Object obj3 = this.f1254;
        Object obj4 = this.f1252;
        Object obj5 = this.f1253;
        Object obj6 = this.f1256;
        Object obj7 = this.f1255;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0330.m1009((C0364) obj7, (C0351) obj6, (Float) obj5, (Float) obj4, (InterfaceC0311) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(1));
                break;
            case 1:
                InterfaceC2129 interfaceC2129 = (InterfaceC2129) obj7;
                InterfaceC1395 interfaceC1395 = (InterfaceC1395) obj6;
                C1242 c1242 = (C1242) obj5;
                C0830 c0830 = (C0830) obj4;
                InterfaceC6543 interfaceC6543 = (InterfaceC6543) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2339();
                } else {
                    Object objM2345 = c1324.m2345();
                    if (objM2345 == C1369.f3974) {
                        objM2345 = new C0803(interfaceC1395, i2);
                        c1324.m2386(objM2345);
                    }
                    InterfaceC2129 interfaceC2129M3105 = AbstractC1670.m3105(interfaceC2129, (InterfaceC6558) objM2345);
                    InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, true);
                    int iHashCode = Long.hashCode(c1324.f3837);
                    C1253 c1253M2381 = c1324.m2381();
                    InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129M3105);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC65432 = C1765.f5185;
                    c1324.m2396();
                    if (c1324.f3838) {
                        c1324.m2380(interfaceC65432);
                    } else {
                        c1324.m2390();
                    }
                    AbstractC1367.m2472(c1324, interfaceC1658M1451, C1765.f5181);
                    AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
                    AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
                    AbstractC1367.m2481(c1324, C1765.f5187);
                    AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
                    c1242.invoke(c1324, 0);
                    c0830.m1647(interfaceC6543, c1324, 6);
                    c1324.m2377(true);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC5969.m11355((String) obj7, (String) obj6, (InterfaceC6543) obj5, (InterfaceC6543) obj4, (InterfaceC6543) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(24577));
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
                if (!c13242.m2343(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c13242.m2339();
                } else {
                    InterfaceC6543 interfaceC65433 = (InterfaceC6543) interfaceC13952.getValue();
                    if (interfaceC65433 == null) {
                        interfaceC65433 = AbstractC6032.f16468;
                    }
                    InterfaceC2129 interfaceC2129M1434 = AbstractC0628.m1434(AbstractC1072.m1987(interfaceC0580, interfaceC1016, (InterfaceC6543) interfaceC13953.getValue(), interfaceC65433), interfaceC0664);
                    C0638 c0638M1449 = AbstractC0633.m1449(AbstractC0628.f1764, C2119.f6259, c13242, 0);
                    int iHashCode2 = Long.hashCode(c13242.f3837);
                    C1253 c1253M23812 = c13242.m2381();
                    InterfaceC2129 interfaceC2129M38612 = AbstractC2120.m3861(c13242, interfaceC2129M1434);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC65434 = C1765.f5185;
                    c13242.m2396();
                    if (c13242.f3838) {
                        c13242.m2380(interfaceC65434);
                    } else {
                        c13242.m2390();
                    }
                    AbstractC1367.m2472(c13242, c0638M1449, C1765.f5181);
                    AbstractC1367.m2472(c13242, c1253M23812, C1765.f5182);
                    AbstractC1367.m2493(c13242, Integer.valueOf(iHashCode2), C1765.f5188);
                    AbstractC1367.m2481(c13242, C1765.f5187);
                    AbstractC1367.m2472(c13242, interfaceC2129M38612, C1765.f5183);
                    AbstractC5969.f16181.invoke(C0636.f1786, c13242, 6);
                    c13242.m2377(true);
                }
                break;
        }
        return c5176;
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
