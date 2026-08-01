package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.AbstractC1499;
import androidx.compose.foundation.layout.C1457;
import androidx.compose.foundation.layout.C1501;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2232;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$2$1;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6835 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16734;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16735;

    public /* synthetic */ C6835(Object obj, int i) {
        this.f16735 = i;
        this.f16734 = obj;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16735;
        Object obj3 = this.f16734;
        switch (i) {
            case 0:
                return ScrollBarKt$ScrollBar$2$1.C08191.invokeSuspend$lambda$0((InterfaceC2232) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 1:
                return ScrollBarKt$ScrollBar$3$1$2$1.invokeSuspend$lambda$0((InterfaceC2232) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 2:
                return ScrollBarKt$ScrollBar$6$1$1.invokeSuspend$lambda$0((InterfaceC2232) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            default:
                InterfaceC7380 interfaceC7380 = (InterfaceC7380) obj3;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1501 c1501M2020 = AbstractC1499.m2020(AbstractC1469.f2110, C2952.f6606, c2159, 54);
                    int iHashCode = Long.hashCode(c2159.f4182);
                    C2088 c2088M2941 = c2159.m2941();
                    InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, C2958.f6621);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC7372 = C2600.f5530;
                    c2159.m2956();
                    if (c2159.f4183) {
                        c2159.m2940(interfaceC7372);
                    } else {
                        c2159.m2950();
                    }
                    AbstractC2202.m3032(c2159, c1501M2020, C2600.f5526);
                    AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
                    AbstractC2202.m3053(c2159, Integer.valueOf(iHashCode), C2600.f5533);
                    AbstractC2202.m3041(c2159, C2600.f5532);
                    AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
                    interfaceC7380.invoke(C1457.f2064, c2159, 6);
                    c2159.m2937(true);
                } else {
                    c2159.m2899();
                }
                return C6008.f15084;
        }
    }
}
