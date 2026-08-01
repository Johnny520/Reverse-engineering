package top.suzhelan.qstory.p015ui.components;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.activity.compose.C0851;
import androidx.appcompat.app.C0955;
import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.C1428;
import androidx.compose.foundation.layout.InterfaceC1476;
import androidx.compose.material3.AbstractC2003;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2881;
import androidx.compose.p001ui.text.font.AbstractC2827;
import androidx.compose.p001ui.text.font.C2803;
import androidx.compose.p001ui.text.font.C2821;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import androidx.compose.p001ui.text.font.C2828;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.window.area.AbstractC3400;
import com.android.p002dx.p005io.Opcodes;
import java.util.List;
import kotlin.C6008;
import kotlin.InterfaceC6000;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p193.C8573;
import p193.C8575;
import p197.AbstractC8584;
import p209.C8650;
import p209.C8651;
import p212.C8668;
import p303.AbstractC9234;
import p360.AbstractC9659;
import p360.C9662;
import p367.AbstractC9692;
import p367.C9691;
import top.yukonga.miuix.kmp.basic.AbstractC6862;
import top.yukonga.miuix.kmp.basic.C6845;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6807 implements InterfaceC7380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16563;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f16564;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16565;

    public /* synthetic */ C6807(String str, C6845 c6845, C6845 c68452) {
        this.f16565 = 1;
        this.f16563 = str;
        this.f16564 = c6845;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.f16565;
        Object obj4 = C2204.f4319;
        C6008 c6008 = C6008.f15084;
        Object obj5 = this.f16564;
        Object obj6 = this.f16563;
        switch (i) {
            case 0:
                List<String> list = (List) obj6;
                Object obj7 = (InterfaceC7387) obj5;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC9234.m14531(3051);
                ((C1428) obj).getClass();
                AbstractC9234.m14531(3052);
                C2159 c2159 = (C2159) interfaceC2208;
                if (c2159.m2903(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (String str : list) {
                        C9691 c9691 = AbstractC9692.f25349;
                        AbstractC9234.m14531(3181);
                        AbstractC2225 abstractC2225 = AbstractC9692.f25347;
                        AbstractC9234.m14531(2961);
                        long j = ((C9691) c2159.m2943(abstractC2225)).f25335;
                        int i2 = 10;
                        long jM5640 = AbstractC3400.m5640(10);
                        InterfaceC2962 interfaceC2962M2540 = AbstractC1910.m2540(AbstractC2280.m3147(C2958.f6621, AbstractC8584.m13671(12.0f)), AbstractC9692.m15086(c2159), AbstractC2416.f5007);
                        AbstractC9234.m14531(3032);
                        boolean zM2920 = c2159.m2920(obj7) | c2159.m2920(str);
                        Object objM2905 = c2159.m2905();
                        if (zM2920 || objM2905 == obj4) {
                            objM2905 = new C0851(obj7, i2, str);
                            c2159.m2946(objM2905);
                        }
                        AbstractC2003.m2585(str, AbstractC1469.m1997(AbstractC1910.m2548(interfaceC2962M2540, false, null, null, (InterfaceC7372) objM2905, 15), 16.0f, 8.0f), j, jM5640, null, 0L, null, 0L, 0, false, 0, 0, null, c2159, 24576, 262120);
                    }
                } else {
                    c2159.m2899();
                }
                break;
            case 1:
                String str2 = (String) obj6;
                C6845 c6845 = (C6845) obj5;
                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((InterfaceC1476) obj).getClass();
                C2159 c21592 = (C2159) interfaceC22082;
                if (c21592.m2903(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c21592.m2952(-1158033922);
                    AbstractC6862.m11949(str2, null, c6845.f16782, ((C2865) ((AbstractC2182) ((C9662) c21592.m2943(AbstractC9659.f25261)).f25274).getValue()).f6329.f6402, C2822.f6217, 0L, 0L, 0, false, 0, 0, null, null, c21592, 1572864, 0, 262058);
                    c21592.m2937(false);
                    c21592.m2952(-1157594249);
                    c21592.m2937(false);
                } else {
                    c21592.m2899();
                }
                break;
            case 2:
                InterfaceC7387 interfaceC7387 = (InterfaceC7387) obj5;
                C8575 c8575 = (C8575) obj6;
                InterfaceC2208 interfaceC22083 = (InterfaceC2208) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                C2159 c21593 = (C2159) interfaceC22083;
                if (c21593.m2903(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    Object objM29052 = c21593.m2905();
                    if (objM29052 == obj4) {
                        objM29052 = new C8573();
                        c21593.m2946(objM29052);
                    }
                    C8573 c8573 = (C8573) objM29052;
                    c8573.f21359.clear();
                    interfaceC7387.invoke(c8573);
                    c8573.m13663(c8575, c21593, 0);
                } else {
                    c21593.m2899();
                }
                break;
            default:
                Spannable spannable = (Spannable) obj6;
                C8651 c8651 = (C8651) obj5;
                C2881 c2881 = (C2881) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC2827 abstractC2827 = c2881.f6398;
                C2822 c2822 = c2881.f6401;
                if (c2822 == null) {
                    c2822 = C2822.f6221;
                }
                C2824 c2824 = c2881.f6400;
                int i3 = c2824 != null ? c2824.f6225 : 0;
                C2821 c2821 = c2881.f6399;
                int i4 = c2821 != null ? c2821.f6215 : Opcodes.MAX_VALUE;
                C8650 c8650 = c8651.f21705;
                C2803 c2803M4263 = ((C2828) c8650.f21696).m4263(abstractC2827, c2822, i3, i4);
                if (c2803M4263 instanceof C2803) {
                    Object obj8 = c2803M4263.f6197;
                    obj8.getClass();
                    typeface = (Typeface) obj8;
                } else {
                    C0955 c0955 = new C0955(c2803M4263, c8650.f21695);
                    c8650.f21695 = c0955;
                    Object obj9 = c0955.f663;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                }
                spannable.setSpan(new C8668(typeface, 1), iIntValue4, iIntValue5, 33);
                break;
        }
        return c6008;
    }

    public /* synthetic */ C6807(Object obj, InterfaceC6000 interfaceC6000, int i) {
        this.f16565 = i;
        this.f16563 = obj;
        this.f16564 = interfaceC6000;
    }

    public /* synthetic */ C6807(InterfaceC7387 interfaceC7387, C8575 c8575) {
        this.f16565 = 2;
        this.f16564 = interfaceC7387;
        this.f16563 = c8575;
    }
}
