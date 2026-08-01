package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.lazy.C1604;
import androidx.compose.material3.AbstractC1996;
import androidx.compose.material3.C2001;
import androidx.compose.material3.C2027;
import androidx.compose.material3.C2054;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.semantics.AbstractC2783;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p197.C8585;
import top.yukonga.miuix.kmp.basic.C6843;
import top.yukonga.miuix.kmp.basic.C6859;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1669 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2700;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2701;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2077 f2702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2703;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2704 = 1;

    public /* synthetic */ C1669(C2027 c2027, C2054 c2054, C2001 c2001, C2077 c2077, int i) {
        this.f2703 = c2027;
        this.f2701 = c2054;
        this.f2700 = c2001;
        this.f2702 = c2077;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2704;
        C2188 c2188 = C2204.f4319;
        C2077 c2077 = this.f2702;
        C6008 c6008 = C6008.f15084;
        Object obj3 = this.f2700;
        Object obj4 = this.f2701;
        Object obj5 = this.f2703;
        int i2 = 0;
        switch (i) {
            case 0:
                InterfaceC2962 interfaceC2962 = (InterfaceC2962) obj5;
                InterfaceC2230 interfaceC2230 = (InterfaceC2230) obj4;
                C1670 c1670 = (C1670) obj3;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c2159.m2899();
                } else {
                    Object objM2905 = c2159.m2905();
                    if (objM2905 == c2188) {
                        objM2905 = new C1668(interfaceC2230, i2);
                        c2159.m2946(objM2905);
                    }
                    InterfaceC2962 interfaceC2962M3665 = AbstractC2505.m3665(interfaceC2962, (InterfaceC7387) objM2905);
                    InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, true);
                    int iHashCode = Long.hashCode(c2159.f4182);
                    C2088 c2088M2941 = c2159.m2941();
                    InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962M3665);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC7372 = C2600.f5530;
                    c2159.m2956();
                    if (c2159.f4183) {
                        c2159.m2940(interfaceC7372);
                    } else {
                        c2159.m2950();
                    }
                    AbstractC2202.m3032(c2159, interfaceC2493M2011, C2600.f5526);
                    AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
                    AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
                    AbstractC2202.m3041(c2159, C2600.f5532);
                    AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
                    c2077.invoke(c2159, 0);
                    Object objM29052 = c2159.m2905();
                    if (objM29052 == c2188) {
                        objM29052 = new C1604(interfaceC2230, 1);
                        c2159.m2946(objM29052);
                    }
                    c1670.m2207((InterfaceC7372) objM29052, c2159, 6);
                    c2159.m2937(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1996.m2583((C2027) obj5, (C2054) obj4, (C2001) obj3, this.f2702, (InterfaceC2208) obj, AbstractC2202.m3031(3073));
                break;
            default:
                InterfaceC2962 interfaceC29622 = (InterfaceC2962) obj5;
                C8585 c8585 = (C8585) obj4;
                C6843 c6843 = (C6843) obj3;
                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C2159 c21592 = (C2159) interfaceC22082;
                if (!c21592.m2903(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c21592.m2899();
                } else {
                    Object objM29053 = c21592.m2905();
                    if (objM29053 == c2188) {
                        objM29053 = new C6859(0);
                        c21592.m2946(objM29053);
                    }
                    InterfaceC2962 interfaceC2962M2540 = AbstractC1910.m2540(AbstractC2280.m3147(AbstractC2783.m4209(interfaceC29622, false, (InterfaceC7387) objM29053), c8585), c6843.f16779, AbstractC2416.f5007);
                    InterfaceC2493 interfaceC2493M20112 = AbstractC1484.m2011(C2952.f6617, true);
                    int iHashCode2 = Long.hashCode(c21592.f4182);
                    C2088 c2088M29412 = c21592.m2941();
                    InterfaceC2962 interfaceC2962M44212 = AbstractC2953.m4421(c21592, interfaceC2962M2540);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC73722 = C2600.f5530;
                    c21592.m2956();
                    if (c21592.f4183) {
                        c21592.m2940(interfaceC73722);
                    } else {
                        c21592.m2950();
                    }
                    AbstractC2202.m3032(c21592, interfaceC2493M20112, C2600.f5526);
                    AbstractC2202.m3032(c21592, c2088M29412, C2600.f5527);
                    AbstractC2202.m3053(c21592, Integer.valueOf(iHashCode2), C2600.f5533);
                    AbstractC2202.m3041(c21592, C2600.f5532);
                    AbstractC2202.m3032(c21592, interfaceC2962M44212, C2600.f5528);
                    c2077.invoke(c21592, 0);
                    c21592.m2937(true);
                }
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1669(InterfaceC2962 interfaceC2962, InterfaceC2230 interfaceC2230, C2077 c2077, C1670 c1670) {
        this.f2703 = interfaceC2962;
        this.f2701 = interfaceC2230;
        this.f2702 = c2077;
        this.f2700 = c1670;
    }

    public /* synthetic */ C1669(InterfaceC2962 interfaceC2962, C8585 c8585, C6843 c6843, C2077 c2077) {
        this.f2703 = interfaceC2962;
        this.f2701 = c8585;
        this.f2700 = c6843;
        this.f2702 = c2077;
    }
}
