package androidx.compose.foundation;

import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.AbstractC1474;
import androidx.compose.foundation.layout.AbstractC1499;
import androidx.compose.foundation.layout.C1475;
import androidx.compose.foundation.layout.C1479;
import androidx.compose.foundation.layout.C1496;
import androidx.compose.foundation.layout.C1501;
import androidx.compose.foundation.layout.InterfaceC1476;
import androidx.compose.foundation.layout.InterfaceC1505;
import androidx.compose.foundation.lazy.AbstractC1600;
import androidx.compose.material3.AbstractC2003;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2948;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.input.nestedscroll.AbstractC2452;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.platform.InterfaceC2708;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2088;
import androidx.profileinstaller.AbstractC3275;
import androidx.recyclerview.widget.AbstractC3334;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.window.area.AbstractC3400;
import androidx.window.area.C3391;
import io.ktor.util.C5039;
import kotlin.C6008;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.C6217;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p289.AbstractC9169;
import p303.AbstractC9234;
import p366.C9684;
import p366.C9685;
import p366.C9687;
import p367.AbstractC9692;
import top.suzhelan.qstory.p015ui.components.C6798;
import top.yukonga.miuix.kmp.basic.C6856;
import top.yukonga.miuix.kmp.extra.AbstractC6872;
import top.yukonga.miuix.kmp.utils.AbstractC6894;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1931 implements InterfaceC7380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3567;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3568;

    public /* synthetic */ C1931(Object obj, int i) {
        this.f3568 = i;
        this.f3567 = obj;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f3568;
        C2188 c2188 = C2204.f4319;
        int i2 = 18;
        C2958 c2958 = C2958.f6621;
        C6008 c6008 = C6008.f15084;
        Object obj4 = this.f3567;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                C2159 c2159 = (C2159) ((InterfaceC2208) obj2);
                c2159.m2952(-353972293);
                ((InterfaceC1854) obj4).getClass();
                c2159.m2952(1257603829);
                c2159.m2937(false);
                boolean zM2920 = c2159.m2920(C1924.f3558);
                Object objM2905 = c2159.m2905();
                if (zM2920 || objM2905 == c2188) {
                    objM2905 = new C1934();
                    c2159.m2946(objM2905);
                }
                C1934 c1934 = (C1934) objM2905;
                c2159.m2937(false);
                return c1934;
            case 1:
                ((C1905) obj4).invoke((Throwable) obj);
                return c6008;
            case 2:
                C6212 c6212 = (C6212) obj4;
                C6212.f15336.set(c6212, null);
                c6212.m10991(null);
                return c6008;
            case 3:
                ((C6217) obj4).m10997();
                return c6008;
            case 4:
                C6856 c6856 = (C6856) obj4;
                InterfaceC1505 interfaceC1505 = (InterfaceC1505) obj;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC9234.m14531(2969);
                interfaceC1505.getClass();
                AbstractC9234.m14531(2970);
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C2159) interfaceC2208).m2920(interfaceC1505) ? 4 : 2;
                }
                C2159 c21592 = (C2159) interfaceC2208;
                if (c21592.m2903(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC2962 interfaceC2962M1998 = AbstractC1469.m1998(AbstractC2452.m3550(AbstractC6894.m11978(AbstractC1460.f2069), c6856.f16798, null), 16.0f, 0.0f, 2);
                    AbstractC9234.m14531(2962);
                    Object objM29052 = c21592.m2905();
                    if (objM29052 == c2188) {
                        objM29052 = new C5039(22);
                        c21592.m2946(objM29052);
                    }
                    AbstractC1600.m2129(((iIntValue << 6) & 896) | 805306368, 506, null, null, null, interfaceC1505, null, c21592, null, interfaceC2962M1998, (InterfaceC7387) objM29052, false);
                } else {
                    c21592.m2899();
                }
                return c6008;
            case 5:
                InterfaceC2708 interfaceC2708 = (InterfaceC2708) obj4;
                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC9234.m14531(2947);
                ((InterfaceC1476) obj).getClass();
                AbstractC9234.m14531(2976);
                C2159 c21593 = (C2159) interfaceC22082;
                if (c21593.m2903(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strM14531 = AbstractC9234.m14531(2978);
                    AbstractC9234.m14531(2962);
                    boolean zM2938 = c21593.m2938(interfaceC2708);
                    Object objM29053 = c21593.m2905();
                    if (zM2938 || objM29053 == c2188) {
                        objM29053 = new C6798(interfaceC2708, 4);
                        c21593.m2946(objM29053);
                    }
                    AbstractC6872.m11964(strM14531, (InterfaceC7372) objM29053, c21593, 6);
                    String strM145312 = AbstractC9234.m14531(2594);
                    AbstractC9234.m14531(2962);
                    boolean zM29382 = c21593.m2938(interfaceC2708);
                    Object objM29054 = c21593.m2905();
                    if (zM29382 || objM29054 == c2188) {
                        objM29054 = new C6798(interfaceC2708, 0);
                        c21593.m2946(objM29054);
                    }
                    AbstractC6872.m11964(strM145312, (InterfaceC7372) objM29054, c21593, 6);
                    String strM145313 = AbstractC9234.m14531(2979);
                    AbstractC9234.m14531(2962);
                    boolean zM29383 = c21593.m2938(interfaceC2708);
                    Object objM29055 = c21593.m2905();
                    if (zM29383 || objM29055 == c2188) {
                        objM29055 = new C6798(interfaceC2708, 1);
                        c21593.m2946(objM29055);
                    }
                    AbstractC6872.m11964(strM145313, (InterfaceC7372) objM29055, c21593, 6);
                    String strM145314 = AbstractC9234.m14531(1355);
                    AbstractC9234.m14531(2962);
                    Object objM29056 = c21593.m2905();
                    if (objM29056 == c2188) {
                        objM29056 = new C3391(i2);
                        c21593.m2946(objM29056);
                    }
                    AbstractC6872.m11964(strM145314, (InterfaceC7372) objM29056, c21593, 805306374);
                    String strM145315 = AbstractC9234.m14531(1356);
                    AbstractC9234.m14531(2962);
                    Object objM29057 = c21593.m2905();
                    if (objM29057 == c2188) {
                        objM29057 = new C3391(19);
                        c21593.m2946(objM29057);
                    }
                    AbstractC6872.m11964(strM145315, (InterfaceC7372) objM29057, c21593, 805306374);
                    String strM145316 = AbstractC9234.m14531(2980);
                    AbstractC9234.m14531(2962);
                    boolean zM29384 = c21593.m2938(interfaceC2708);
                    Object objM29058 = c21593.m2905();
                    if (zM29384 || objM29058 == c2188) {
                        objM29058 = new C6798(interfaceC2708, 2);
                        c21593.m2946(objM29058);
                    }
                    AbstractC6872.m11964(strM145316, (InterfaceC7372) objM29058, c21593, 6);
                } else {
                    c21593.m2899();
                }
                return c6008;
            case 6:
                C9685 c9685 = (C9685) obj4;
                InterfaceC2208 interfaceC22083 = (InterfaceC2208) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC9234.m14531(3011);
                ((C1475) obj).getClass();
                AbstractC9234.m14531(3012);
                C2159 c21594 = (C2159) interfaceC22083;
                if (c21594.m2903(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String groupName = c9685.f25317.getGroupName();
                    AbstractC9234.m14531(1323);
                    groupName.getClass();
                    AbstractC2003.m2585(groupName, AbstractC1469.m1997(c2958, 20.0f, 14.0f), AbstractC9692.m15084(c21594), AbstractC3400.m5640(14), null, 0L, null, 0L, 0, false, 0, 0, null, c21594, 24624, 262120);
                } else {
                    c21594.m2899();
                }
                return c6008;
            case 7:
                C9687 c9687 = (C9687) obj4;
                InterfaceC2208 interfaceC22084 = (InterfaceC2208) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC9234.m14531(3011);
                ((C1475) obj).getClass();
                AbstractC9234.m14531(3014);
                C2159 c21595 = (C2159) interfaceC22084;
                if (c21595.m2903(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    InterfaceC2962 interfaceC2962M1997 = AbstractC1469.m1997(AbstractC1460.m1944(c2958, 1.0f), 20.0f, 16.0f);
                    C2948 c2948 = C2952.f6606;
                    AbstractC9234.m14531(2950);
                    C1501 c1501M2020 = AbstractC1499.m2020(AbstractC1469.f2111, c2948, c21595, 48);
                    AbstractC9234.m14531(2909);
                    int iHashCode = Long.hashCode(c21595.f4182);
                    C2088 c2088M2941 = c21595.m2941();
                    InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21595, interfaceC2962M1997);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC7372 = C2600.f5530;
                    AbstractC9234.m14531(2910);
                    c21595.m2956();
                    if (c21595.f4183) {
                        c21595.m2940(interfaceC7372);
                    } else {
                        c21595.m2950();
                    }
                    AbstractC2202.m3032(c21595, c1501M2020, C2600.f5526);
                    AbstractC2202.m3032(c21595, c2088M2941, C2600.f5527);
                    AbstractC2202.m3032(c21595, Integer.valueOf(iHashCode), C2600.f5533);
                    AbstractC2202.m3041(c21595, C2600.f5532);
                    AbstractC3275.m5122(c21595, interfaceC2962M4421, C2600.f5528, 2951, 3016);
                    String itemName = c9687.f25321.getItemName();
                    AbstractC9234.m14531(1294);
                    itemName.getClass();
                    AbstractC2003.m2585(itemName, new C1496(1.0f, true), AbstractC9692.m15084(c21595), AbstractC3400.m5640(17), null, 0L, null, 0L, 0, false, 0, 0, null, c21595, 24576, 262120);
                    AbstractC2003.m2585(AbstractC9234.m14532("喵呜喵喵呜呜喵呜"), null, AbstractC9692.m15084(c21595), AbstractC3400.m5640(18), null, 0L, null, 0L, 0, false, 0, 0, null, c21595, 24582, 262122);
                    c21595.m2937(true);
                } else {
                    c21595.m2899();
                }
                return c6008;
            case 8:
                OtherViewItemInfo otherViewItemInfo = ((C9684) obj4).f25315;
                InterfaceC2208 interfaceC22085 = (InterfaceC2208) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC9234.m14531(3011);
                ((C1475) obj).getClass();
                AbstractC9234.m14531(3024);
                C2159 c21596 = (C2159) interfaceC22085;
                if (c21596.m2903(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    InterfaceC2962 interfaceC2962M19972 = AbstractC1469.m1997(AbstractC1460.m1944(c2958, 1.0f), 20.0f, 16.0f);
                    AbstractC9234.m14531(2913);
                    C1479 c1479M2009 = AbstractC1474.m2009(AbstractC1469.f2109, C2952.f6604, c21596, 0);
                    AbstractC9234.m14531(2909);
                    int iHashCode2 = Long.hashCode(c21596.f4182);
                    C2088 c2088M29412 = c21596.m2941();
                    InterfaceC2962 interfaceC2962M44212 = AbstractC2953.m4421(c21596, interfaceC2962M19972);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC73722 = C2600.f5530;
                    AbstractC9234.m14531(2910);
                    c21596.m2956();
                    if (c21596.f4183) {
                        c21596.m2940(interfaceC73722);
                    } else {
                        c21596.m2950();
                    }
                    AbstractC2202.m3032(c21596, c1479M2009, C2600.f5526);
                    AbstractC2202.m3032(c21596, c2088M29412, C2600.f5527);
                    AbstractC2202.m3032(c21596, Integer.valueOf(iHashCode2), C2600.f5533);
                    AbstractC2202.m3041(c21596, C2600.f5532);
                    AbstractC3275.m5122(c21596, interfaceC2962M44212, C2600.f5528, 2914, 3026);
                    String leftText = otherViewItemInfo.getLeftText();
                    AbstractC9234.m14531(3027);
                    leftText.getClass();
                    AbstractC2003.m2585(leftText, null, AbstractC9692.m15084(c21596), AbstractC3400.m5640(17), null, 0L, null, 0L, 0, false, 0, 0, null, c21596, 24576, 262122);
                    String tips = otherViewItemInfo.getTips();
                    if (tips == null || AbstractC5976.m10731(tips)) {
                        c21596.m2952(687715121);
                        c21596.m2937(false);
                    } else {
                        c21596.m2952(687490774);
                        AbstractC9234.m14531(3028);
                        AbstractC2003.m2585(tips, AbstractC1469.m1995(c2958, 0.0f, 2.0f, 0.0f, 13), AbstractC9692.m15083(c21596), AbstractC3400.m5640(13), null, 0L, null, 0L, 0, false, 0, 0, null, c21596, 24624, 262120);
                        c21596.m2937(false);
                    }
                    c21596.m2937(true);
                } else {
                    c21596.m2899();
                }
                return c6008;
            default:
                AbstractC9169 abstractC9169 = (AbstractC9169) obj4;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) obj;
                AbstractC3334 abstractC3334 = (AbstractC3334) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                gridLayoutManager.getClass();
                abstractC3334.getClass();
                int iMo5352 = abstractC9169.mo5352(iIntValue6);
                int iMo5520 = (abstractC9169.f23347.get(iMo5352) == null && abstractC9169.f23346.get(iMo5352) == null) ? abstractC3334.mo5520(iIntValue6) : gridLayoutManager.f7487;
                return Integer.valueOf(iMo5520);
        }
    }

    public /* synthetic */ C1931(Object obj, int i, Object obj2) {
        this.f3568 = i;
        this.f3567 = obj;
    }
}
