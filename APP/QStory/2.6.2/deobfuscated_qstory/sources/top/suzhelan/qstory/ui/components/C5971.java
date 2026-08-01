package top.suzhelan.qstory.ui.components;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.activity.compose.C0004;
import androidx.appcompat.app.C0108;
import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.C0587;
import androidx.compose.foundation.layout.InterfaceC0635;
import androidx.compose.material3.AbstractC1168;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.AbstractC1445;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.C2047;
import androidx.compose.ui.text.font.AbstractC1993;
import androidx.compose.ui.text.font.C1969;
import androidx.compose.ui.text.font.C1987;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.C1990;
import androidx.compose.ui.text.font.C1994;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3056;
import java.util.List;
import kotlin.C5175;
import kotlin.InterfaceC5167;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p177.C7743;
import p177.C7745;
import p181.AbstractC7754;
import p193.C7820;
import p193.C7821;
import p196.C7838;
import p345.AbstractC8844;
import p345.C8847;
import p351.AbstractC8871;
import p351.C8870;
import p392.AbstractC9124;
import top.yukonga.miuix.kmp.basic.AbstractC6026;
import top.yukonga.miuix.kmp.basic.C6009;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5971 implements InterfaceC6550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16209;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f16210;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16211;

    public /* synthetic */ C5971(String str, C6009 c6009, C6009 c60092) {
        this.f16211 = 1;
        this.f16209 = str;
        this.f16210 = c6009;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.f16211;
        Object obj4 = C1369.f3973;
        C5175 c5175 = C5175.f14739;
        Object obj5 = this.f16210;
        Object obj6 = this.f16209;
        switch (i) {
            case 0:
                List<String> list = (List) obj6;
                Object obj7 = (InterfaceC6557) obj5;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                "$this$FlowRow";
                ((C0587) obj).getClass();
                "C*172@6977L38,176@7220L20,177@7285L37,170@6884L542:SettingSearchDialog.kt#ndgvs9";
                C1324 c1324 = (C1324) interfaceC1373;
                if (c1324.m2333(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (String str : list) {
                        C8870 c8870 = AbstractC8871.f25006;
                        "C(<get-QStorySettingSearchHistoryTagTextColor>)169@5350L7:Color.kt#avp4iw";
                        AbstractC1390 abstractC1390 = AbstractC8871.f25004;
                        "CC(<get-current>):CompositionLocal.kt#9igjgp";
                        long j = ((C8870) c1324.m2373(abstractC1390)).f24992;
                        int i2 = 10;
                        long jM14670 = AbstractC9124.m14670(10);
                        InterfaceC2129 interfaceC2129M1970 = AbstractC1072.m1970(AbstractC1445.m2577(C2125.f6275, AbstractC7754.m13084(12.0f)), AbstractC8871.m14520(c1324), AbstractC1581.f4661);
                        "CC(remember):SettingSearchDialog.kt#9igjgp";
                        boolean zM2350 = c1324.m2350(obj7) | c1324.m2350(str);
                        Object objM2335 = c1324.m2335();
                        if (zM2350 || objM2335 == obj4) {
                            objM2335 = new C0004(obj7, i2, str);
                            c1324.m2376(objM2335);
                        }
                        AbstractC1168.m2015(str, AbstractC0628.m1427(AbstractC1072.m1978(interfaceC2129M1970, false, null, null, (InterfaceC6542) objM2335, 15), 16.0f, 8.0f), j, jM14670, null, 0L, null, 0L, 0, false, 0, 0, null, c1324, 24576, 262120);
                    }
                } else {
                    c1324.m2329();
                }
                break;
            case 1:
                String str2 = (String) obj6;
                C6009 c6009 = (C6009) obj5;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((InterfaceC0635) obj).getClass();
                C1324 c13242 = (C1324) interfaceC13732;
                if (c13242.m2333(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c13242.m2382(-1158033922);
                    AbstractC6026.m11330(str2, null, c6009.f16428, ((C2031) ((AbstractC1347) ((C8847) c13242.m2373(AbstractC8844.f24933)).f24946).getValue()).f5983.f6056, C1988.f5871, 0L, 0L, 0, false, 0, 0, null, null, c13242, 1572864, 0, 262058);
                    c13242.m2367(false);
                    c13242.m2382(-1157594249);
                    c13242.m2367(false);
                } else {
                    c13242.m2329();
                }
                break;
            case 2:
                InterfaceC6557 interfaceC6557 = (InterfaceC6557) obj5;
                C7745 c7745 = (C7745) obj6;
                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                C1324 c13243 = (C1324) interfaceC13733;
                if (c13243.m2333(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    Object objM23352 = c13243.m2335();
                    if (objM23352 == obj4) {
                        objM23352 = new C7743();
                        c13243.m2376(objM23352);
                    }
                    C7743 c7743 = (C7743) objM23352;
                    c7743.f21017.clear();
                    interfaceC6557.invoke(c7743);
                    c7743.m13076(c7745, c13243, 0);
                } else {
                    c13243.m2329();
                }
                break;
            default:
                Spannable spannable = (Spannable) obj6;
                C7821 c7821 = (C7821) obj5;
                C2047 c2047 = (C2047) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC1993 abstractC1993 = c2047.f6052;
                C1988 c1988 = c2047.f6055;
                if (c1988 == null) {
                    c1988 = C1988.f5875;
                }
                C1990 c1990 = c2047.f6054;
                int i3 = c1990 != null ? c1990.f5879 : 0;
                C1987 c1987 = c2047.f6053;
                int i4 = c1987 != null ? c1987.f5869 : Opcodes.MAX_VALUE;
                C7820 c7820 = c7821.f21363;
                C1969 c1969M3693 = ((C1994) c7820.f21354).m3693(abstractC1993, c1988, i3, i4);
                if (c1969M3693 instanceof C1969) {
                    Object obj8 = c1969M3693.f5851;
                    obj8.getClass();
                    typeface = (Typeface) obj8;
                } else {
                    C0108 c0108 = new C0108(c1969M3693, c7820.f21353);
                    c7820.f21353 = c0108;
                    Object obj9 = c0108.f318;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                }
                spannable.setSpan(new C7838(typeface, 1), iIntValue4, iIntValue5, 33);
                break;
        }
        return c5175;
    }

    public /* synthetic */ C5971(Object obj, InterfaceC5167 interfaceC5167, int i) {
        this.f16211 = i;
        this.f16209 = obj;
        this.f16210 = interfaceC5167;
    }

    public /* synthetic */ C5971(InterfaceC6557 interfaceC6557, C7745 c7745) {
        this.f16211 = 2;
        this.f16210 = interfaceC6557;
        this.f16209 = c7745;
    }
}
