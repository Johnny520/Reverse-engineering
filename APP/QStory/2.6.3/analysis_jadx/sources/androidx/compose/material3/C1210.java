package androidx.compose.material3;

import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.text.C0995;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.AbstractC1445;
import androidx.compose.ui.graphics.AbstractC1579;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1615;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.input.pointer.AbstractC1622;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.semantics.AbstractC1948;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p205.C7893;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1210 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f3490;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ float f3491;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1569 f3492;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f3493;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f3494;

    public C1210(InterfaceC2129 interfaceC2129, InterfaceC1569 interfaceC1569, long j, float f, C1242 c1242) {
        this.f3494 = interfaceC2129;
        this.f3492 = interfaceC1569;
        this.f3493 = j;
        this.f3491 = f;
        this.f3490 = c1242;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2129 interfaceC2129M2892;
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2343 = c1324.m2343(iIntValue & 1, (iIntValue & 3) != 2);
        C5176 c5176 = C5176.f14739;
        if (!zM2343) {
            c1324.m2339();
            return c5176;
        }
        C1192 c1192 = (C1192) c1324.m2383(AbstractC1197.f3452);
        boolean zBooleanValue = ((Boolean) c1324.m2383(AbstractC1197.f3451)).booleanValue();
        long jM2899 = c1192.f3441;
        long j = this.f3493;
        if (C1599.m2949(j, jM2899) && zBooleanValue) {
            if (!C7893.m13318(this.f3491, 0.0f)) {
                jM2899 = AbstractC1581.m2899(C1599.m2950(((((float) Math.log(r4 + 1.0f)) * 4.5f) + 2.0f) / 100.0f, c1192.f3430), jM2899);
            }
        } else {
            jM2899 = j;
        }
        float fMo1344 = ((InterfaceC7896) c1324.m2383(AbstractC1902.f5588)).mo1344(0.0f);
        C2125 c2125 = C2125.f6276;
        InterfaceC1569 interfaceC1569 = this.f3492;
        if (fMo1344 > 0.0f) {
            long j2 = C1615.f4727;
            long j3 = AbstractC1579.f4658;
            interfaceC2129M2892 = AbstractC1581.m2892(c2125, 1.0f, fMo1344, j2, interfaceC1569, false, j3, j3);
        } else {
            interfaceC2129M2892 = c2125;
        }
        InterfaceC2129 interfaceC2129M2587 = AbstractC1445.m2587(AbstractC1072.m1980(this.f3494.mo3866(interfaceC2129M2892).mo3866(c2125), jM2899, interfaceC1569), interfaceC1569);
        Object objM2345 = c1324.m2345();
        C1353 c1353 = C1369.f3974;
        if (objM2345 == c1353) {
            objM2345 = new C0995(9);
            c1324.m2386(objM2345);
        }
        InterfaceC2129 interfaceC2129M3649 = AbstractC1948.m3649(interfaceC2129M2587, false, (InterfaceC6558) objM2345);
        Object objM23452 = c1324.m2345();
        if (objM23452 == c1353) {
            objM23452 = C1211.f3495;
            c1324.m2386(objM23452);
        }
        InterfaceC2129 interfaceC2129M3002 = AbstractC1622.m3002(interfaceC2129M3649, c5176, (PointerInputEventHandler) objM23452);
        InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, true);
        int iM2488 = AbstractC1367.m2488(c1324);
        C1253 c1253M2381 = c1324.m2381();
        InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129M3002);
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
        InterfaceC6554 interfaceC6554 = C1765.f5188;
        if (c1324.f3838 || !AbstractC4395.m8907(c1324.m2345(), Integer.valueOf(iM2488))) {
            c1324.m2386(Integer.valueOf(iM2488));
            c1324.m2364(Integer.valueOf(iM2488), interfaceC6554);
        }
        AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
        this.f3490.invoke(c1324, 0);
        c1324.m2377(true);
        return c5176;
    }
}
