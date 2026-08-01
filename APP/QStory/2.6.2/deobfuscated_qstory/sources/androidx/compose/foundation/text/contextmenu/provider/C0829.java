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
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p181.C7755;
import top.yukonga.miuix.kmp.basic.C6007;
import top.yukonga.miuix.kmp.basic.C6023;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0829 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2354;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2355;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f2356;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2358 = 1;

    public /* synthetic */ C0829(C1192 c1192, C1219 c1219, C1166 c1166, C1242 c1242, int i) {
        this.f2357 = c1192;
        this.f2355 = c1219;
        this.f2354 = c1166;
        this.f2356 = c1242;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2358;
        C1353 c1353 = C1369.f3973;
        C1242 c1242 = this.f2356;
        C5175 c5175 = C5175.f14739;
        int i2 = 1;
        Object obj3 = this.f2354;
        Object obj4 = this.f2355;
        Object obj5 = this.f2357;
        int i3 = 0;
        switch (i) {
            case 0:
                InterfaceC2129 interfaceC2129 = (InterfaceC2129) obj5;
                InterfaceC1395 interfaceC1395 = (InterfaceC1395) obj4;
                C0830 c0830 = (C0830) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2329();
                } else {
                    Object objM2335 = c1324.m2335();
                    if (objM2335 == c1353) {
                        objM2335 = new C0828(interfaceC1395, i3);
                        c1324.m2376(objM2335);
                    }
                    InterfaceC2129 interfaceC2129M3095 = AbstractC1670.m3095(interfaceC2129, (InterfaceC6557) objM2335);
                    InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, true);
                    int iHashCode = Long.hashCode(c1324.f3836);
                    C1253 c1253M2371 = c1324.m2371();
                    InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129M3095);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC6542 = C1765.f5184;
                    c1324.m2386();
                    if (c1324.f3837) {
                        c1324.m2370(interfaceC6542);
                    } else {
                        c1324.m2380();
                    }
                    AbstractC1367.m2464(c1324, interfaceC1658M1441, C1765.f5180);
                    AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
                    AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
                    AbstractC1367.m2472(c1324, C1765.f5186);
                    AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
                    c1242.invoke(c1324, 0);
                    Object objM23352 = c1324.m2335();
                    if (objM23352 == c1353) {
                        objM23352 = new C0763(interfaceC1395, i2);
                        c1324.m2376(objM23352);
                    }
                    c0830.m1637((InterfaceC6542) objM23352, c1324, 6);
                    c1324.m2367(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1161.m2013((C1192) obj5, (C1219) obj4, (C1166) obj3, this.f2356, (InterfaceC1373) obj, AbstractC1367.m2460(3073));
                break;
            default:
                InterfaceC2129 interfaceC21292 = (InterfaceC2129) obj5;
                C7755 c7755 = (C7755) obj4;
                C6007 c6007 = (C6007) obj3;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2333(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c13242.m2329();
                } else {
                    Object objM23353 = c13242.m2335();
                    if (objM23353 == c1353) {
                        objM23353 = new C6023(0);
                        c13242.m2376(objM23353);
                    }
                    InterfaceC2129 interfaceC2129M1970 = AbstractC1072.m1970(AbstractC1445.m2577(AbstractC1948.m3639(interfaceC21292, false, (InterfaceC6557) objM23353), c7755), c6007.f16425, AbstractC1581.f4661);
                    InterfaceC1658 interfaceC1658M14412 = AbstractC0643.m1441(C2119.f6271, true);
                    int iHashCode2 = Long.hashCode(c13242.f3836);
                    C1253 c1253M23712 = c13242.m2371();
                    InterfaceC2129 interfaceC2129M38512 = AbstractC2120.m3851(c13242, interfaceC2129M1970);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC65422 = C1765.f5184;
                    c13242.m2386();
                    if (c13242.f3837) {
                        c13242.m2370(interfaceC65422);
                    } else {
                        c13242.m2380();
                    }
                    AbstractC1367.m2464(c13242, interfaceC1658M14412, C1765.f5180);
                    AbstractC1367.m2464(c13242, c1253M23712, C1765.f5181);
                    AbstractC1367.m2483(c13242, Integer.valueOf(iHashCode2), C1765.f5187);
                    AbstractC1367.m2472(c13242, C1765.f5186);
                    AbstractC1367.m2464(c13242, interfaceC2129M38512, C1765.f5182);
                    c1242.invoke(c13242, 0);
                    c13242.m2367(true);
                }
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0829(InterfaceC2129 interfaceC2129, InterfaceC1395 interfaceC1395, C1242 c1242, C0830 c0830) {
        this.f2357 = interfaceC2129;
        this.f2355 = interfaceC1395;
        this.f2356 = c1242;
        this.f2354 = c0830;
    }

    public /* synthetic */ C0829(InterfaceC2129 interfaceC2129, C7755 c7755, C6007 c6007, C1242 c1242) {
        this.f2357 = interfaceC2129;
        this.f2355 = c7755;
        this.f2354 = c6007;
        this.f2356 = c1242;
    }
}
