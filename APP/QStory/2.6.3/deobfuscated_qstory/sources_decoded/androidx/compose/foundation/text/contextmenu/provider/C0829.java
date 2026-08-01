package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.lazy.C0763;
import androidx.compose.material3.AbstractC1161;
import androidx.compose.material3.C1166;
import androidx.compose.material3.C1192;
import androidx.compose.material3.C1219;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.AbstractC1445;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.semantics.AbstractC1948;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p181.C7756;
import top.yukonga.miuix.kmp.basic.C6013;
import top.yukonga.miuix.kmp.basic.C6029;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0829 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2355;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2356;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f2357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2358;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2359 = 1;

    public /* synthetic */ C0829(C1192 c1192, C1219 c1219, C1166 c1166, C1242 c1242, int i) {
        this.f2358 = c1192;
        this.f2356 = c1219;
        this.f2355 = c1166;
        this.f2357 = c1242;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2359;
        C1353 c1353 = C1369.f3974;
        C1242 c1242 = this.f2357;
        C5176 c5176 = C5176.f14739;
        Object obj3 = this.f2355;
        Object obj4 = this.f2356;
        Object obj5 = this.f2358;
        int i2 = 0;
        switch (i) {
            case 0:
                InterfaceC2129 interfaceC2129 = (InterfaceC2129) obj5;
                InterfaceC1395 interfaceC1395 = (InterfaceC1395) obj4;
                C0830 c0830 = (C0830) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2339();
                } else {
                    Object objM2345 = c1324.m2345();
                    if (objM2345 == c1353) {
                        objM2345 = new C0828(interfaceC1395, i2);
                        c1324.m2386(objM2345);
                    }
                    InterfaceC2129 interfaceC2129M3105 = AbstractC1670.m3105(interfaceC2129, (InterfaceC6558) objM2345);
                    InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, true);
                    int iHashCode = Long.hashCode(c1324.f3837);
                    C1253 c1253M2381 = c1324.m2381();
                    InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129M3105);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC6543 = C1765.f5185;
                    c1324.m2396();
                    if (c1324.f3838) {
                        c1324.m2380(interfaceC6543);
                    } else {
                        c1324.m2390();
                    }
                    AbstractC1367.m2472(c1324, interfaceC1658M1451, C1765.f5181);
                    AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
                    AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
                    AbstractC1367.m2481(c1324, C1765.f5187);
                    AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
                    c1242.invoke(c1324, 0);
                    Object objM23452 = c1324.m2345();
                    if (objM23452 == c1353) {
                        objM23452 = new C0763(interfaceC1395, 1);
                        c1324.m2386(objM23452);
                    }
                    c0830.m1647((InterfaceC6543) objM23452, c1324, 6);
                    c1324.m2377(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1161.m2023((C1192) obj5, (C1219) obj4, (C1166) obj3, this.f2357, (InterfaceC1373) obj, AbstractC1367.m2471(3073));
                break;
            default:
                InterfaceC2129 interfaceC21292 = (InterfaceC2129) obj5;
                C7756 c7756 = (C7756) obj4;
                C6013 c6013 = (C6013) obj3;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2343(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c13242.m2339();
                } else {
                    Object objM23453 = c13242.m2345();
                    if (objM23453 == c1353) {
                        objM23453 = new C6029(0);
                        c13242.m2386(objM23453);
                    }
                    InterfaceC2129 interfaceC2129M1980 = AbstractC1072.m1980(AbstractC1445.m2587(AbstractC1948.m3649(interfaceC21292, false, (InterfaceC6558) objM23453), c7756), c6013.f16434, AbstractC1581.f4662);
                    InterfaceC1658 interfaceC1658M14512 = AbstractC0643.m1451(C2119.f6272, true);
                    int iHashCode2 = Long.hashCode(c13242.f3837);
                    C1253 c1253M23812 = c13242.m2381();
                    InterfaceC2129 interfaceC2129M38612 = AbstractC2120.m3861(c13242, interfaceC2129M1980);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC65432 = C1765.f5185;
                    c13242.m2396();
                    if (c13242.f3838) {
                        c13242.m2380(interfaceC65432);
                    } else {
                        c13242.m2390();
                    }
                    AbstractC1367.m2472(c13242, interfaceC1658M14512, C1765.f5181);
                    AbstractC1367.m2472(c13242, c1253M23812, C1765.f5182);
                    AbstractC1367.m2493(c13242, Integer.valueOf(iHashCode2), C1765.f5188);
                    AbstractC1367.m2481(c13242, C1765.f5187);
                    AbstractC1367.m2472(c13242, interfaceC2129M38612, C1765.f5183);
                    c1242.invoke(c13242, 0);
                    c13242.m2377(true);
                }
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0829(InterfaceC2129 interfaceC2129, InterfaceC1395 interfaceC1395, C1242 c1242, C0830 c0830) {
        this.f2358 = interfaceC2129;
        this.f2356 = interfaceC1395;
        this.f2357 = c1242;
        this.f2355 = c0830;
    }

    public /* synthetic */ C0829(InterfaceC2129 interfaceC2129, C7756 c7756, C6013 c6013, C1242 c1242) {
        this.f2358 = interfaceC2129;
        this.f2356 = c7756;
        this.f2355 = c6013;
        this.f2357 = c1242;
    }
}
