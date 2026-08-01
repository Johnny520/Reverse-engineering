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
import androidx.window.area.AbstractC2567;
import com.android.dx.io.Opcodes;
import java.util.List;
import kotlin.C5176;
import kotlin.InterfaceC5168;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p177.C7744;
import p177.C7746;
import p181.AbstractC7755;
import p193.C7821;
import p193.C7822;
import p196.C7839;
import p287.AbstractC8405;
import p344.AbstractC8830;
import p344.C8833;
import p351.AbstractC8863;
import p351.C8862;
import top.yukonga.miuix.kmp.basic.AbstractC6032;
import top.yukonga.miuix.kmp.basic.C6015;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5977 implements InterfaceC6551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16218;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f16219;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16220;

    public /* synthetic */ C5977(String str, C6015 c6015, C6015 c60152) {
        this.f16220 = 1;
        this.f16218 = str;
        this.f16219 = c6015;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.f16220;
        Object obj4 = C1369.f3974;
        C5176 c5176 = C5176.f14739;
        Object obj5 = this.f16219;
        Object obj6 = this.f16218;
        switch (i) {
            case 0:
                List<String> list = (List) obj6;
                Object obj7 = (InterfaceC6558) obj5;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC8405.m13972(3051);
                ((C0587) obj).getClass();
                AbstractC8405.m13972(3052);
                C1324 c1324 = (C1324) interfaceC1373;
                if (c1324.m2343(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (String str : list) {
                        C8862 c8862 = AbstractC8863.f25004;
                        AbstractC8405.m13972(3181);
                        AbstractC1390 abstractC1390 = AbstractC8863.f25002;
                        AbstractC8405.m13972(2961);
                        long j = ((C8862) c1324.m2383(abstractC1390)).f24990;
                        int i2 = 10;
                        long jM5080 = AbstractC2567.m5080(10);
                        InterfaceC2129 interfaceC2129M1980 = AbstractC1072.m1980(AbstractC1445.m2587(C2125.f6276, AbstractC7755.m13112(12.0f)), AbstractC8863.m14527(c1324), AbstractC1581.f4662);
                        AbstractC8405.m13972(3032);
                        boolean zM2360 = c1324.m2360(obj7) | c1324.m2360(str);
                        Object objM2345 = c1324.m2345();
                        if (zM2360 || objM2345 == obj4) {
                            objM2345 = new C0004(obj7, i2, str);
                            c1324.m2386(objM2345);
                        }
                        AbstractC1168.m2025(str, AbstractC0628.m1437(AbstractC1072.m1988(interfaceC2129M1980, false, null, null, (InterfaceC6543) objM2345, 15), 16.0f, 8.0f), j, jM5080, null, 0L, null, 0L, 0, false, 0, 0, null, c1324, 24576, 262120);
                    }
                } else {
                    c1324.m2339();
                }
                break;
            case 1:
                String str2 = (String) obj6;
                C6015 c6015 = (C6015) obj5;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((InterfaceC0635) obj).getClass();
                C1324 c13242 = (C1324) interfaceC13732;
                if (c13242.m2343(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c13242.m2392(-1158033922);
                    AbstractC6032.m11390(str2, null, c6015.f16437, ((C2031) ((AbstractC1347) ((C8833) c13242.m2383(AbstractC8830.f24916)).f24929).getValue()).f5984.f6057, C1988.f5872, 0L, 0L, 0, false, 0, 0, null, null, c13242, 1572864, 0, 262058);
                    c13242.m2377(false);
                    c13242.m2392(-1157594249);
                    c13242.m2377(false);
                } else {
                    c13242.m2339();
                }
                break;
            case 2:
                InterfaceC6558 interfaceC6558 = (InterfaceC6558) obj5;
                C7746 c7746 = (C7746) obj6;
                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                C1324 c13243 = (C1324) interfaceC13733;
                if (c13243.m2343(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    Object objM23452 = c13243.m2345();
                    if (objM23452 == obj4) {
                        objM23452 = new C7744();
                        c13243.m2386(objM23452);
                    }
                    C7744 c7744 = (C7744) objM23452;
                    c7744.f21014.clear();
                    interfaceC6558.invoke(c7744);
                    c7744.m13104(c7746, c13243, 0);
                } else {
                    c13243.m2339();
                }
                break;
            default:
                Spannable spannable = (Spannable) obj6;
                C7822 c7822 = (C7822) obj5;
                C2047 c2047 = (C2047) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC1993 abstractC1993 = c2047.f6053;
                C1988 c1988 = c2047.f6056;
                if (c1988 == null) {
                    c1988 = C1988.f5876;
                }
                C1990 c1990 = c2047.f6055;
                int i3 = c1990 != null ? c1990.f5880 : 0;
                C1987 c1987 = c2047.f6054;
                int i4 = c1987 != null ? c1987.f5870 : Opcodes.MAX_VALUE;
                C7821 c7821 = c7822.f21360;
                C1969 c1969M3703 = ((C1994) c7821.f21351).m3703(abstractC1993, c1988, i3, i4);
                if (c1969M3703 instanceof C1969) {
                    Object obj8 = c1969M3703.f5852;
                    obj8.getClass();
                    typeface = (Typeface) obj8;
                } else {
                    C0108 c0108 = new C0108(c1969M3703, c7821.f21350);
                    c7821.f21350 = c0108;
                    Object obj9 = c0108.f318;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                }
                spannable.setSpan(new C7839(typeface, 1), iIntValue4, iIntValue5, 33);
                break;
        }
        return c5176;
    }

    public /* synthetic */ C5977(Object obj, InterfaceC5168 interfaceC5168, int i) {
        this.f16220 = i;
        this.f16218 = obj;
        this.f16219 = interfaceC5168;
    }

    public /* synthetic */ C5977(InterfaceC6558 interfaceC6558, C7746 c7746) {
        this.f16220 = 2;
        this.f16219 = interfaceC6558;
        this.f16218 = c7746;
    }
}
