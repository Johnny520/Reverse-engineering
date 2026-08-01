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
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p205.C7892;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1210 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C1242 f3489;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ float f3490;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1569 f3491;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f3492;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2129 f3493;

    public C1210(InterfaceC2129 interfaceC2129, InterfaceC1569 interfaceC1569, long j, float f, C1242 c1242) {
        this.f3493 = interfaceC2129;
        this.f3491 = interfaceC1569;
        this.f3492 = j;
        this.f3490 = f;
        this.f3489 = c1242;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2129 interfaceC2129M2882;
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2333 = c1324.m2333(iIntValue & 1, (iIntValue & 3) != 2);
        C5175 c5175 = C5175.f14739;
        if (!zM2333) {
            c1324.m2329();
            return c5175;
        }
        C1192 c1192 = (C1192) c1324.m2373(AbstractC1197.f3451);
        boolean zBooleanValue = ((Boolean) c1324.m2373(AbstractC1197.f3450)).booleanValue();
        long jM2889 = c1192.f3440;
        long j = this.f3492;
        if (C1599.m2939(j, jM2889) && zBooleanValue) {
            if (!C7892.m13290(this.f3490, 0.0f)) {
                jM2889 = AbstractC1581.m2889(C1599.m2940(((((float) Math.log(r4 + 1.0f)) * 4.5f) + 2.0f) / 100.0f, c1192.f3429), jM2889);
            }
        } else {
            jM2889 = j;
        }
        float fMo1334 = ((InterfaceC7895) c1324.m2373(AbstractC1902.f5587)).mo1334(0.0f);
        C2125 c2125 = C2125.f6275;
        InterfaceC1569 interfaceC1569 = this.f3491;
        if (fMo1334 > 0.0f) {
            long j2 = C1615.f4726;
            long j3 = AbstractC1579.f4657;
            interfaceC2129M2882 = AbstractC1581.m2882(c2125, 1.0f, fMo1334, j2, interfaceC1569, false, j3, j3);
        } else {
            interfaceC2129M2882 = c2125;
        }
        InterfaceC2129 interfaceC2129M2577 = AbstractC1445.m2577(AbstractC1072.m1970(this.f3493.mo3856(interfaceC2129M2882).mo3856(c2125), jM2889, interfaceC1569), interfaceC1569);
        Object objM2335 = c1324.m2335();
        C1353 c1353 = C1369.f3973;
        if (objM2335 == c1353) {
            objM2335 = new C0995(9);
            c1324.m2376(objM2335);
        }
        InterfaceC2129 interfaceC2129M3639 = AbstractC1948.m3639(interfaceC2129M2577, false, (InterfaceC6557) objM2335);
        Object objM23352 = c1324.m2335();
        if (objM23352 == c1353) {
            objM23352 = C1211.f3494;
            c1324.m2376(objM23352);
        }
        InterfaceC2129 interfaceC2129M2992 = AbstractC1622.m2992(interfaceC2129M3639, c5175, (PointerInputEventHandler) objM23352);
        InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, true);
        int iM2479 = AbstractC1367.m2479(c1324);
        C1253 c1253M2371 = c1324.m2371();
        InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129M2992);
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
        InterfaceC6553 interfaceC6553 = C1765.f5187;
        if (c1324.f3837 || !AbstractC4394.m8917(c1324.m2335(), Integer.valueOf(iM2479))) {
            c1324.m2376(Integer.valueOf(iM2479));
            c1324.m2354(Integer.valueOf(iM2479), interfaceC6553);
        }
        AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
        this.f3489.invoke(c1324, 0);
        c1324.m2367(true);
        return c5175;
    }
}
