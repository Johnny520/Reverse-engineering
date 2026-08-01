package androidx.compose.foundation.text;

import androidx.activity.compose.C0004;
import androidx.activity.compose.C0011;
import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.AbstractC0633;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.layout.C0634;
import androidx.compose.foundation.layout.C0638;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.material3.AbstractC1144;
import androidx.compose.material3.AbstractC1168;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2121;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.AbstractC1445;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.profileinstaller.AbstractC2442;
import androidx.window.area.AbstractC2567;
import io.ktor.http.content.AbstractC3987;
import io.ktor.server.cio.C4085;
import io.ktor.server.engine.AbstractC4108;
import io.ktor.server.engine.BaseApplicationResponse$InvalidHeaderForContent;
import io.ktor.server.websocket.C4176;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import kotlin.C5176;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.AbstractC5144;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p181.AbstractC7755;
import p236.AbstractC8115;
import p287.AbstractC8405;
import p332.C8785;
import p351.AbstractC8863;
import p351.C8862;
import top.suzhelan.qstory.ui.components.AbstractC5969;
import top.suzhelan.qstory.ui.components.C5970;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0981 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2829;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2830;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2831;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2832;

    public /* synthetic */ C0981(InterfaceC2129 interfaceC2129, C0882 c0882, C1242 c1242, int i) {
        this.f2832 = 0;
        this.f2830 = interfaceC2129;
        this.f2831 = c0882;
        this.f2829 = c1242;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1395 interfaceC1395;
        InterfaceC1395 interfaceC13952;
        InterfaceC6543 interfaceC6543;
        C1353 c1353;
        InterfaceC6554 interfaceC6554;
        InterfaceC6554 interfaceC65542;
        InterfaceC6558 interfaceC6558;
        InterfaceC6554 interfaceC65543;
        float f;
        int i;
        long jM14525;
        long jM14527;
        String strM13972;
        int i2 = this.f2832;
        C5176 c5176 = C5176.f14739;
        Object obj3 = this.f2829;
        Object obj4 = this.f2831;
        Object obj5 = this.f2830;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0983.m1890((InterfaceC2129) obj5, (C0882) obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(385));
                return c5176;
            case 1:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj5;
                AbstractC3987 abstractC3987 = (AbstractC3987) obj4;
                AbstractC4108 abstractC4108 = (AbstractC4108) obj3;
                String str = (String) obj;
                List list = (List) obj2;
                str.getClass();
                list.getClass();
                String[] strArr = AbstractC8115.f22413;
                if (!str.equals("Transfer-Encoding")) {
                    if (str.equals("Upgrade")) {
                        if (!(abstractC3987 instanceof C4176)) {
                            throw new BaseApplicationResponse$InvalidHeaderForContent("Upgrade", "non-upgrading response");
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((C4085) abstractC4108).f12415.m289(str, (String) it.next(), false);
                        }
                    }
                    return c5176;
                }
                ref$BooleanRef.element = true;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((C4085) abstractC4108).f12415.m289(str, (String) it2.next(), true);
                }
                return c5176;
            default:
                InterfaceC1395 interfaceC13953 = (InterfaceC1395) obj5;
                InterfaceC6543 interfaceC65432 = (InterfaceC6543) obj4;
                InterfaceC1395 interfaceC13954 = (InterfaceC1395) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                AbstractC8405.m13972(3090);
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2339();
                    return c5176;
                }
                C2125 c2125 = C2125.f6276;
                InterfaceC2129 interfaceC2129M2587 = AbstractC1445.m2587(AbstractC0619.m1384(c2125, 0.88f), AbstractC7755.m13112(28.0f));
                C8862 c8862 = AbstractC8863.f25004;
                AbstractC8405.m13972(3177);
                C1334 c1334 = AbstractC8863.f25002;
                AbstractC8405.m13972(2961);
                InterfaceC2129 interfaceC2129M1980 = AbstractC1072.m1980(interfaceC2129M2587, ((C8862) c1324.m2383(c1334)).f24999, AbstractC1581.f4662);
                AbstractC8405.m13972(3077);
                Object objM2345 = c1324.m2345();
                C1353 c13532 = C1369.f3974;
                if (objM2345 == c13532) {
                    objM2345 = new C0011(0);
                    c1324.m2386(objM2345);
                }
                InterfaceC2129 interfaceC2129M1433 = AbstractC0628.m1433(AbstractC1072.m1988(interfaceC2129M1980, false, null, null, (InterfaceC6543) objM2345, 15), 20.0f);
                AbstractC8405.m13972(2908);
                InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, false);
                AbstractC8405.m13972(2909);
                int iHashCode = Long.hashCode(c1324.f3837);
                C1253 c1253M2381 = c1324.m2381();
                InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129M1433);
                InterfaceC1784.f5222.getClass();
                InterfaceC6543 interfaceC65433 = C1765.f5185;
                AbstractC8405.m13972(2910);
                c1324.m2396();
                if (c1324.f3838) {
                    c1324.m2380(interfaceC65433);
                } else {
                    c1324.m2390();
                }
                InterfaceC6554 interfaceC65544 = C1765.f5181;
                AbstractC1367.m2472(c1324, interfaceC1658M1451, interfaceC65544);
                InterfaceC6554 interfaceC65545 = C1765.f5182;
                AbstractC1367.m2472(c1324, c1253M2381, interfaceC65545);
                Integer numValueOf = Integer.valueOf(iHashCode);
                InterfaceC6554 interfaceC65546 = C1765.f5188;
                AbstractC1367.m2472(c1324, numValueOf, interfaceC65546);
                InterfaceC6558 interfaceC65582 = C1765.f5187;
                AbstractC1367.m2481(c1324, interfaceC65582);
                InterfaceC6554 interfaceC65547 = C1765.f5183;
                AbstractC2442.m4562(c1324, interfaceC2129M3861, interfaceC65547, 2911, 3092);
                if (((Boolean) interfaceC13953.getValue()).booleanValue()) {
                    c1324.m2392(18204531);
                    AbstractC8405.m13972(3093);
                    interfaceC6554 = interfaceC65544;
                    interfaceC1395 = interfaceC13953;
                    interfaceC13952 = interfaceC13954;
                    interfaceC6543 = interfaceC65432;
                    c1353 = c13532;
                    interfaceC65542 = interfaceC65545;
                    interfaceC6558 = interfaceC65582;
                    interfaceC65543 = interfaceC65546;
                    f = 20.0f;
                    AbstractC1144.m2020(AbstractC0619.m1379(C0634.m1450(C2119.f6271), 24.0f).mo3866(new C2121()), AbstractC8863.m14526(c1324), 2.5f, 0L, 0, 0.0f, c1324, 384);
                    c1324 = c1324;
                    i = 0;
                    c1324.m2377(false);
                } else {
                    interfaceC1395 = interfaceC13953;
                    interfaceC13952 = interfaceC13954;
                    interfaceC6543 = interfaceC65432;
                    c1353 = c13532;
                    interfaceC6554 = interfaceC65544;
                    interfaceC65542 = interfaceC65545;
                    interfaceC6558 = interfaceC65582;
                    interfaceC65543 = interfaceC65546;
                    f = 20.0f;
                    i = 0;
                    c1324.m2392(18524544);
                    c1324.m2377(false);
                }
                AbstractC8405.m13972(2913);
                C0638 c0638M1449 = AbstractC0633.m1449(AbstractC0628.f1764, C2119.f6259, c1324, i);
                AbstractC8405.m13972(2909);
                int iHashCode2 = Long.hashCode(c1324.f3837);
                C1253 c1253M23812 = c1324.m2381();
                InterfaceC2129 interfaceC2129M38612 = AbstractC2120.m3861(c1324, c2125);
                AbstractC8405.m13972(2910);
                c1324.m2396();
                if (c1324.f3838) {
                    c1324.m2380(interfaceC65433);
                } else {
                    c1324.m2390();
                }
                AbstractC1367.m2472(c1324, c0638M1449, interfaceC6554);
                AbstractC1367.m2472(c1324, c1253M23812, interfaceC65542);
                AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode2), interfaceC65543);
                AbstractC1367.m2481(c1324, interfaceC6558);
                AbstractC2442.m4562(c1324, interfaceC2129M38612, interfaceC65547, 2914, 3094);
                AbstractC5969.m11349((C8785) interfaceC13952.getValue(), c1324, 0);
                String str2 = ((C8785) interfaceC13952.getValue()).f24739;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                Integer num = ((C8785) interfaceC13952.getValue()).f24740;
                if ((num != null ? num.intValue() : 0) >= 1) {
                    c1324.m2392(-87907700);
                    AbstractC8405.m13972(3095);
                    AbstractC8405.m13972(3189);
                    AbstractC8405.m13972(2961);
                    jM14525 = ((C8862) c1324.m2383(c1334)).f24993;
                    c1324.m2377(false);
                } else {
                    c1324.m2392(-87828247);
                    AbstractC8405.m13972(3096);
                    jM14525 = AbstractC8863.m14525(c1324);
                    c1324.m2377(false);
                }
                C1324 c13242 = c1324;
                AbstractC1168.m2025(str3, AbstractC0628.m1435(c2125, 0.0f, 16.0f, 0.0f, 13), jM14525, AbstractC2567.m5080(15), null, 0L, null, 0L, 0, false, 0, 0, null, c13242, 24624, 262120);
                String strM13973 = ((C8785) interfaceC13952.getValue()).f24738;
                if (strM13973 == null || AbstractC5144.m10172(strM13973)) {
                    strM13973 = null;
                }
                if (strM13973 == null) {
                    strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵喵喵呜喵~呜呜喵呜呜喵呜喵");
                }
                String strConcat = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜喵喵喵呜呜呜呜~呜呜喵喵呜喵喵喵~呜呜喵呜喵喵呜喵~喵呜喵呜呜喵呜呜").concat(strM13973);
                if (strM13973.equals(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵喵喵呜喵~呜呜喵呜呜喵呜喵"))) {
                    c13242.m2392(-87342167);
                    AbstractC8405.m13972(3097);
                    jM14527 = AbstractC8863.m14525(c13242);
                    c13242.m2377(false);
                } else {
                    c13242.m2392(-87260110);
                    AbstractC8405.m13972(3098);
                    jM14527 = AbstractC8863.m14527(c13242);
                    c13242.m2377(false);
                }
                AbstractC1168.m2025(strConcat, AbstractC0628.m1435(c2125, 0.0f, 8.0f, 0.0f, 13), jM14527, AbstractC2567.m5080(15), null, 0L, null, 0L, 0, false, 0, 0, null, c13242, 24624, 262120);
                String strM139722 = AbstractC8405.m13972(1283);
                LocalDateTime localDateTime = ((C8785) interfaceC13952.getValue()).f24737;
                if (localDateTime == null) {
                    strM13972 = AbstractC8405.m13972(1289);
                } else {
                    strM13972 = localDateTime.format(DateTimeFormatter.ofPattern(AbstractC8405.m13972(1168)));
                    AbstractC8405.m13972(1290);
                    strM13972.getClass();
                }
                AbstractC1168.m2025(strM139722.concat(strM13972), AbstractC0628.m1435(c2125, 0.0f, 8.0f, 0.0f, 13), AbstractC8863.m14525(c13242), AbstractC2567.m5080(15), null, 0L, null, 0L, 0, false, 0, 0, null, c13242, 24624, 262120);
                String strM139723 = AbstractC8405.m13972(1485);
                InterfaceC2129 interfaceC2129M1435 = AbstractC0628.m1435(c2125, 0.0f, f, 0.0f, 13);
                AbstractC8405.m13972(3077);
                InterfaceC6543 interfaceC65434 = interfaceC6543;
                boolean zM2360 = c13242.m2360(interfaceC65434);
                Object objM23452 = c13242.m2345();
                C1353 c13533 = c1353;
                if (zM2360 || objM23452 == c13533) {
                    objM23452 = new C5970(interfaceC65434, 0);
                    c13242.m2386(objM23452);
                }
                AbstractC5969.m11348(strM139723, interfaceC2129M1435, false, (InterfaceC6543) objM23452, c13242, 54, 4);
                String strM139724 = AbstractC8405.m13972(1486);
                InterfaceC2129 interfaceC2129M14352 = AbstractC0628.m1435(c2125, 0.0f, 10.0f, 0.0f, 13);
                boolean z = !((Boolean) interfaceC1395.getValue()).booleanValue();
                AbstractC8405.m13972(3077);
                Object objM23453 = c13242.m2345();
                if (objM23453 == c13533) {
                    objM23453 = new C0004(interfaceC1395, 11, interfaceC13952);
                    c13242.m2386(objM23453);
                }
                AbstractC5969.m11348(strM139724, interfaceC2129M14352, z, (InterfaceC6543) objM23453, c13242, 3126, 0);
                c13242.m2377(true);
                c13242.m2377(true);
                return c5176;
        }
    }

    public /* synthetic */ C0981(Object obj, Object obj2, Object obj3, int i) {
        this.f2832 = i;
        this.f2830 = obj;
        this.f2831 = obj2;
        this.f2829 = obj3;
    }
}
