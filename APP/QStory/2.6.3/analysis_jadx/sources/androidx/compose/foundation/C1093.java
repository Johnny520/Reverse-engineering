package androidx.compose.foundation;

import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.AbstractC0633;
import androidx.compose.foundation.layout.AbstractC0658;
import androidx.compose.foundation.layout.C0634;
import androidx.compose.foundation.layout.C0638;
import androidx.compose.foundation.layout.C0655;
import androidx.compose.foundation.layout.C0660;
import androidx.compose.foundation.layout.InterfaceC0635;
import androidx.compose.foundation.layout.InterfaceC0664;
import androidx.compose.foundation.lazy.AbstractC0759;
import androidx.compose.material3.AbstractC1168;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2115;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.input.nestedscroll.AbstractC1617;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.platform.InterfaceC1873;
import androidx.profileinstaller.AbstractC2442;
import androidx.recyclerview.widget.AbstractC2501;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.window.area.AbstractC2567;
import androidx.window.area.C2558;
import io.ktor.util.C4207;
import kotlin.C5176;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.C5385;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p273.AbstractC8340;
import p287.AbstractC8405;
import p350.C8855;
import p350.C8856;
import p350.C8858;
import p351.AbstractC8863;
import top.suzhelan.qstory.ui.components.C5968;
import top.yukonga.miuix.kmp.basic.C6026;
import top.yukonga.miuix.kmp.extra.AbstractC6042;
import top.yukonga.miuix.kmp.utils.AbstractC6065;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1093 implements InterfaceC6551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3222;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3223;

    public /* synthetic */ C1093(Object obj, int i) {
        this.f3223 = i;
        this.f3222 = obj;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f3223;
        C1353 c1353 = C1369.f3974;
        int i2 = 18;
        C2125 c2125 = C2125.f6276;
        C5176 c5176 = C5176.f14739;
        Object obj4 = this.f3222;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                C1324 c1324 = (C1324) ((InterfaceC1373) obj2);
                c1324.m2392(-353972293);
                ((InterfaceC1016) obj4).getClass();
                c1324.m2392(1257603829);
                c1324.m2377(false);
                boolean zM2360 = c1324.m2360(C1086.f3213);
                Object objM2345 = c1324.m2345();
                if (zM2360 || objM2345 == c1353) {
                    objM2345 = new C1096();
                    c1324.m2386(objM2345);
                }
                C1096 c1096 = (C1096) objM2345;
                c1324.m2377(false);
                return c1096;
            case 1:
                ((C1067) obj4).invoke((Throwable) obj);
                return c5176;
            case 2:
                C5380 c5380 = (C5380) obj4;
                C5380.f14991.set(c5380, null);
                c5380.m10432(null);
                return c5176;
            case 3:
                ((C5385) obj4).m10438();
                return c5176;
            case 4:
                C6026 c6026 = (C6026) obj4;
                InterfaceC0664 interfaceC0664 = (InterfaceC0664) obj;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC8405.m13972(2969);
                interfaceC0664.getClass();
                AbstractC8405.m13972(2970);
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1324) interfaceC1373).m2360(interfaceC0664) ? 4 : 2;
                }
                C1324 c13242 = (C1324) interfaceC1373;
                if (c13242.m2343(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC2129 interfaceC2129M1438 = AbstractC0628.m1438(AbstractC1617.m2990(AbstractC6065.m11419(AbstractC0619.f1724), c6026.f16453, null), 16.0f, 0.0f, 2);
                    AbstractC8405.m13972(2962);
                    Object objM23452 = c13242.m2345();
                    if (objM23452 == c1353) {
                        objM23452 = new C4207(22);
                        c13242.m2386(objM23452);
                    }
                    AbstractC0759.m1569(((iIntValue << 6) & 896) | 805306368, 506, null, null, null, interfaceC0664, null, c13242, null, interfaceC2129M1438, (InterfaceC6558) objM23452, false);
                } else {
                    c13242.m2339();
                }
                return c5176;
            case 5:
                InterfaceC1873 interfaceC1873 = (InterfaceC1873) obj4;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC8405.m13972(2947);
                ((InterfaceC0635) obj).getClass();
                AbstractC8405.m13972(2976);
                C1324 c13243 = (C1324) interfaceC13732;
                if (c13243.m2343(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strM13972 = AbstractC8405.m13972(2978);
                    AbstractC8405.m13972(2962);
                    boolean zM2378 = c13243.m2378(interfaceC1873);
                    Object objM23453 = c13243.m2345();
                    if (zM2378 || objM23453 == c1353) {
                        objM23453 = new C5968(interfaceC1873, 4);
                        c13243.m2386(objM23453);
                    }
                    AbstractC6042.m11405(strM13972, (InterfaceC6543) objM23453, c13243, 6);
                    String strM139722 = AbstractC8405.m13972(2594);
                    AbstractC8405.m13972(2962);
                    boolean zM23782 = c13243.m2378(interfaceC1873);
                    Object objM23454 = c13243.m2345();
                    if (zM23782 || objM23454 == c1353) {
                        objM23454 = new C5968(interfaceC1873, 0);
                        c13243.m2386(objM23454);
                    }
                    AbstractC6042.m11405(strM139722, (InterfaceC6543) objM23454, c13243, 6);
                    String strM139723 = AbstractC8405.m13972(2979);
                    AbstractC8405.m13972(2962);
                    boolean zM23783 = c13243.m2378(interfaceC1873);
                    Object objM23455 = c13243.m2345();
                    if (zM23783 || objM23455 == c1353) {
                        objM23455 = new C5968(interfaceC1873, 1);
                        c13243.m2386(objM23455);
                    }
                    AbstractC6042.m11405(strM139723, (InterfaceC6543) objM23455, c13243, 6);
                    String strM139724 = AbstractC8405.m13972(1355);
                    AbstractC8405.m13972(2962);
                    Object objM23456 = c13243.m2345();
                    if (objM23456 == c1353) {
                        objM23456 = new C2558(i2);
                        c13243.m2386(objM23456);
                    }
                    AbstractC6042.m11405(strM139724, (InterfaceC6543) objM23456, c13243, 805306374);
                    String strM139725 = AbstractC8405.m13972(1356);
                    AbstractC8405.m13972(2962);
                    Object objM23457 = c13243.m2345();
                    if (objM23457 == c1353) {
                        objM23457 = new C2558(19);
                        c13243.m2386(objM23457);
                    }
                    AbstractC6042.m11405(strM139725, (InterfaceC6543) objM23457, c13243, 805306374);
                    String strM139726 = AbstractC8405.m13972(2980);
                    AbstractC8405.m13972(2962);
                    boolean zM23784 = c13243.m2378(interfaceC1873);
                    Object objM23458 = c13243.m2345();
                    if (zM23784 || objM23458 == c1353) {
                        objM23458 = new C5968(interfaceC1873, 2);
                        c13243.m2386(objM23458);
                    }
                    AbstractC6042.m11405(strM139726, (InterfaceC6543) objM23458, c13243, 6);
                } else {
                    c13243.m2339();
                }
                return c5176;
            case 6:
                C8856 c8856 = (C8856) obj4;
                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC8405.m13972(3011);
                ((C0634) obj).getClass();
                AbstractC8405.m13972(3012);
                C1324 c13244 = (C1324) interfaceC13733;
                if (c13244.m2343(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String groupName = c8856.f24972.getGroupName();
                    AbstractC8405.m13972(1323);
                    groupName.getClass();
                    AbstractC1168.m2025(groupName, AbstractC0628.m1437(c2125, 20.0f, 14.0f), AbstractC8863.m14525(c13244), AbstractC2567.m5080(14), null, 0L, null, 0L, 0, false, 0, 0, null, c13244, 24624, 262120);
                } else {
                    c13244.m2339();
                }
                return c5176;
            case 7:
                C8858 c8858 = (C8858) obj4;
                InterfaceC1373 interfaceC13734 = (InterfaceC1373) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC8405.m13972(3011);
                ((C0634) obj).getClass();
                AbstractC8405.m13972(3014);
                C1324 c13245 = (C1324) interfaceC13734;
                if (c13245.m2343(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    InterfaceC2129 interfaceC2129M1437 = AbstractC0628.m1437(AbstractC0619.m1384(c2125, 1.0f), 20.0f, 16.0f);
                    C2115 c2115 = C2119.f6261;
                    AbstractC8405.m13972(2950);
                    C0660 c0660M1460 = AbstractC0658.m1460(AbstractC0628.f1766, c2115, c13245, 48);
                    AbstractC8405.m13972(2909);
                    int iHashCode = Long.hashCode(c13245.f3837);
                    C1253 c1253M2381 = c13245.m2381();
                    InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c13245, interfaceC2129M1437);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC6543 = C1765.f5185;
                    AbstractC8405.m13972(2910);
                    c13245.m2396();
                    if (c13245.f3838) {
                        c13245.m2380(interfaceC6543);
                    } else {
                        c13245.m2390();
                    }
                    AbstractC1367.m2472(c13245, c0660M1460, C1765.f5181);
                    AbstractC1367.m2472(c13245, c1253M2381, C1765.f5182);
                    AbstractC1367.m2472(c13245, Integer.valueOf(iHashCode), C1765.f5188);
                    AbstractC1367.m2481(c13245, C1765.f5187);
                    AbstractC2442.m4562(c13245, interfaceC2129M3861, C1765.f5183, 2951, 3016);
                    String itemName = c8858.f24976.getItemName();
                    AbstractC8405.m13972(1294);
                    itemName.getClass();
                    AbstractC1168.m2025(itemName, new C0655(1.0f, true), AbstractC8863.m14525(c13245), AbstractC2567.m5080(17), null, 0L, null, 0L, 0, false, 0, 0, null, c13245, 24576, 262120);
                    AbstractC1168.m2025(AbstractC8405.m13973("喵呜喵喵呜呜喵呜"), null, AbstractC8863.m14525(c13245), AbstractC2567.m5080(18), null, 0L, null, 0L, 0, false, 0, 0, null, c13245, 24582, 262122);
                    c13245.m2377(true);
                } else {
                    c13245.m2339();
                }
                return c5176;
            case 8:
                OtherViewItemInfo otherViewItemInfo = ((C8855) obj4).f24970;
                InterfaceC1373 interfaceC13735 = (InterfaceC1373) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC8405.m13972(3011);
                ((C0634) obj).getClass();
                AbstractC8405.m13972(3024);
                C1324 c13246 = (C1324) interfaceC13735;
                if (c13246.m2343(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    InterfaceC2129 interfaceC2129M14372 = AbstractC0628.m1437(AbstractC0619.m1384(c2125, 1.0f), 20.0f, 16.0f);
                    AbstractC8405.m13972(2913);
                    C0638 c0638M1449 = AbstractC0633.m1449(AbstractC0628.f1764, C2119.f6259, c13246, 0);
                    AbstractC8405.m13972(2909);
                    int iHashCode2 = Long.hashCode(c13246.f3837);
                    C1253 c1253M23812 = c13246.m2381();
                    InterfaceC2129 interfaceC2129M38612 = AbstractC2120.m3861(c13246, interfaceC2129M14372);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC65432 = C1765.f5185;
                    AbstractC8405.m13972(2910);
                    c13246.m2396();
                    if (c13246.f3838) {
                        c13246.m2380(interfaceC65432);
                    } else {
                        c13246.m2390();
                    }
                    AbstractC1367.m2472(c13246, c0638M1449, C1765.f5181);
                    AbstractC1367.m2472(c13246, c1253M23812, C1765.f5182);
                    AbstractC1367.m2472(c13246, Integer.valueOf(iHashCode2), C1765.f5188);
                    AbstractC1367.m2481(c13246, C1765.f5187);
                    AbstractC2442.m4562(c13246, interfaceC2129M38612, C1765.f5183, 2914, 3026);
                    String leftText = otherViewItemInfo.getLeftText();
                    AbstractC8405.m13972(3027);
                    leftText.getClass();
                    AbstractC1168.m2025(leftText, null, AbstractC8863.m14525(c13246), AbstractC2567.m5080(17), null, 0L, null, 0L, 0, false, 0, 0, null, c13246, 24576, 262122);
                    String tips = otherViewItemInfo.getTips();
                    if (tips == null || AbstractC5144.m10172(tips)) {
                        c13246.m2392(687715121);
                        c13246.m2377(false);
                    } else {
                        c13246.m2392(687490774);
                        AbstractC8405.m13972(3028);
                        AbstractC1168.m2025(tips, AbstractC0628.m1435(c2125, 0.0f, 2.0f, 0.0f, 13), AbstractC8863.m14524(c13246), AbstractC2567.m5080(13), null, 0L, null, 0L, 0, false, 0, 0, null, c13246, 24624, 262120);
                        c13246.m2377(false);
                    }
                    c13246.m2377(true);
                } else {
                    c13246.m2339();
                }
                return c5176;
            default:
                AbstractC8340 abstractC8340 = (AbstractC8340) obj4;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) obj;
                AbstractC2501 abstractC2501 = (AbstractC2501) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                gridLayoutManager.getClass();
                abstractC2501.getClass();
                int iMo4792 = abstractC8340.mo4792(iIntValue6);
                int iMo4960 = (abstractC8340.f23002.get(iMo4792) == null && abstractC8340.f23001.get(iMo4792) == null) ? abstractC2501.mo4960(iIntValue6) : gridLayoutManager.f7142;
                return Integer.valueOf(iMo4960);
        }
    }

    public /* synthetic */ C1093(Object obj, int i, Object obj2) {
        this.f3223 = i;
        this.f3222 = obj;
    }
}
