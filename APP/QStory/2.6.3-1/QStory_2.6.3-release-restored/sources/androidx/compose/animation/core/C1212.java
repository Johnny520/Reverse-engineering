package androidx.compose.animation.core;

import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.InterfaceC1854;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.AbstractC1474;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.layout.C1477;
import androidx.compose.foundation.layout.C1479;
import androidx.compose.foundation.layout.InterfaceC1505;
import androidx.compose.foundation.text.contextmenu.internal.C1643;
import androidx.compose.foundation.text.contextmenu.provider.C1670;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import top.suzhelan.qstory.p015ui.components.AbstractC6799;
import top.yukonga.miuix.kmp.basic.AbstractC6862;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1212 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1597;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1598;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1600;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1601;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1602;

    public /* synthetic */ C1212(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1602 = i;
        this.f1600 = obj;
        this.f1601 = obj2;
        this.f1598 = obj3;
        this.f1597 = obj4;
        this.f1599 = obj5;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1602;
        C6008 c6008 = C6008.f15084;
        int i2 = 1;
        Object obj3 = this.f1599;
        Object obj4 = this.f1597;
        Object obj5 = this.f1598;
        Object obj6 = this.f1601;
        Object obj7 = this.f1600;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1176.m1569((C1210) obj7, (C1197) obj6, (Float) obj5, (Float) obj4, (InterfaceC1157) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                break;
            case 1:
                InterfaceC2962 interfaceC2962 = (InterfaceC2962) obj7;
                InterfaceC2230 interfaceC2230 = (InterfaceC2230) obj6;
                C2077 c2077 = (C2077) obj5;
                C1670 c1670 = (C1670) obj4;
                InterfaceC7372 interfaceC7372 = (InterfaceC7372) obj3;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c2159.m2899();
                } else {
                    Object objM2905 = c2159.m2905();
                    if (objM2905 == C2204.f4319) {
                        objM2905 = new C1643(interfaceC2230, i2);
                        c2159.m2946(objM2905);
                    }
                    InterfaceC2962 interfaceC2962M3665 = AbstractC2505.m3665(interfaceC2962, (InterfaceC7387) objM2905);
                    InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, true);
                    int iHashCode = Long.hashCode(c2159.f4182);
                    C2088 c2088M2941 = c2159.m2941();
                    InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962M3665);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC73722 = C2600.f5530;
                    c2159.m2956();
                    if (c2159.f4183) {
                        c2159.m2940(interfaceC73722);
                    } else {
                        c2159.m2950();
                    }
                    AbstractC2202.m3032(c2159, interfaceC2493M2011, C2600.f5526);
                    AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
                    AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
                    AbstractC2202.m3041(c2159, C2600.f5532);
                    AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
                    c2077.invoke(c2159, 0);
                    c1670.m2207(interfaceC7372, c2159, 6);
                    c2159.m2937(true);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC6799.m11914((String) obj7, (String) obj6, (InterfaceC7372) obj5, (InterfaceC7372) obj4, (InterfaceC7372) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(24577));
                break;
            default:
                InterfaceC1421 interfaceC1421 = (InterfaceC1421) obj7;
                InterfaceC1854 interfaceC1854 = (InterfaceC1854) obj6;
                InterfaceC1505 interfaceC1505 = (InterfaceC1505) obj5;
                InterfaceC2230 interfaceC22302 = (InterfaceC2230) obj4;
                InterfaceC2230 interfaceC22303 = (InterfaceC2230) obj3;
                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C2159 c21592 = (C2159) interfaceC22082;
                if (!c21592.m2903(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c21592.m2899();
                } else {
                    InterfaceC7372 interfaceC73723 = (InterfaceC7372) interfaceC22302.getValue();
                    if (interfaceC73723 == null) {
                        interfaceC73723 = AbstractC6862.f16813;
                    }
                    InterfaceC2962 interfaceC2962M1994 = AbstractC1469.m1994(AbstractC1910.m2547(interfaceC1421, interfaceC1854, (InterfaceC7372) interfaceC22303.getValue(), interfaceC73723), interfaceC1505);
                    C1479 c1479M2009 = AbstractC1474.m2009(AbstractC1469.f2109, C2952.f6604, c21592, 0);
                    int iHashCode2 = Long.hashCode(c21592.f4182);
                    C2088 c2088M29412 = c21592.m2941();
                    InterfaceC2962 interfaceC2962M44212 = AbstractC2953.m4421(c21592, interfaceC2962M1994);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC73724 = C2600.f5530;
                    c21592.m2956();
                    if (c21592.f4183) {
                        c21592.m2940(interfaceC73724);
                    } else {
                        c21592.m2950();
                    }
                    AbstractC2202.m3032(c21592, c1479M2009, C2600.f5526);
                    AbstractC2202.m3032(c21592, c2088M29412, C2600.f5527);
                    AbstractC2202.m3053(c21592, Integer.valueOf(iHashCode2), C2600.f5533);
                    AbstractC2202.m3041(c21592, C2600.f5532);
                    AbstractC2202.m3032(c21592, interfaceC2962M44212, C2600.f5528);
                    AbstractC6799.f16526.invoke(C1477.f2131, c21592, 6);
                    c21592.m2937(true);
                }
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1212(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.f1602 = i2;
        this.f1600 = obj;
        this.f1601 = obj2;
        this.f1598 = obj3;
        this.f1597 = obj4;
        this.f1599 = obj5;
    }
}
