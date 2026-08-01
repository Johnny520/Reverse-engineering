package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import kotlin.C5176;
import p034.AbstractC6347;
import p052.InterfaceC6554;
import p116.C7341;
import top.yukonga.miuix.kmp.utils.AbstractC6076;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6031 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16462;

    public /* synthetic */ C6031(int i) {
        this.f16462 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16462;
        C5176 c5176 = C5176.f14739;
        switch (i) {
            case 0:
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2339();
                }
                return c5176;
            case 1:
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2343(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c13242.m2339();
                }
                return c5176;
            case 2:
                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C1324 c13243 = (C1324) interfaceC13733;
                if (!c13243.m2343(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c13243.m2339();
                }
                return c5176;
            case 3:
                InterfaceC1373 interfaceC13734 = (InterfaceC1373) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                C1324 c13244 = (C1324) interfaceC13734;
                if (!c13244.m2343(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c13244.m2339();
                }
                return c5176;
            case 4:
                InterfaceC1373 interfaceC13735 = (InterfaceC1373) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                C1324 c13245 = (C1324) interfaceC13735;
                if (!c13245.m2343(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c13245.m2339();
                }
                return c5176;
            case 5:
                InterfaceC1373 interfaceC13736 = (InterfaceC1373) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                C1324 c13246 = (C1324) interfaceC13736;
                if (c13246.m2343(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC6076.f16609.m11427(c13246, 6);
                } else {
                    c13246.m2339();
                }
                return c5176;
            case 6:
                InterfaceC1373 interfaceC13737 = (InterfaceC1373) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                C1324 c13247 = (C1324) interfaceC13737;
                if (!c13247.m2343(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c13247.m2339();
                }
                return c5176;
            default:
                C6034 c6034 = (C6034) obj2;
                ((C7341) obj).getClass();
                c6034.getClass();
                return AbstractC6347.m11931(Float.valueOf(c6034.f16484), Float.valueOf(c6034.m11395()), Float.valueOf(((AbstractC1349) c6034.f16483).m2434()));
        }
    }
}
