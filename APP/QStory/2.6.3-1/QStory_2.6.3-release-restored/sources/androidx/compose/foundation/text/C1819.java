package androidx.compose.foundation.text;

import androidx.activity.compose.C0851;
import androidx.activity.compose.C0858;
import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.AbstractC1474;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.layout.C1475;
import androidx.compose.foundation.layout.C1479;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.material3.AbstractC1979;
import androidx.compose.material3.AbstractC2003;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2954;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import androidx.profileinstaller.AbstractC3275;
import androidx.window.area.AbstractC3400;
import io.ktor.http.content.AbstractC4819;
import io.ktor.server.cio.C4917;
import io.ktor.server.engine.AbstractC4940;
import io.ktor.server.engine.BaseApplicationResponse$InvalidHeaderForContent;
import io.ktor.server.websocket.C5008;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import kotlin.C6008;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.AbstractC5976;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p197.AbstractC8584;
import p252.AbstractC8944;
import p348.C9614;
import p367.AbstractC9692;
import p367.C9691;
import top.suzhelan.qstory.p015ui.components.AbstractC6799;
import top.suzhelan.qstory.p015ui.components.C6800;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1819 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3175;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3176;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3177;

    public /* synthetic */ C1819(InterfaceC2962 interfaceC2962, C1720 c1720, C2077 c2077, int i) {
        this.f3177 = 0;
        this.f3175 = interfaceC2962;
        this.f3176 = c1720;
        this.f3174 = c2077;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2230 interfaceC2230;
        InterfaceC2230 interfaceC22302;
        InterfaceC7372 interfaceC7372;
        C2188 c2188;
        InterfaceC7383 interfaceC7383;
        InterfaceC7383 interfaceC73832;
        InterfaceC7387 interfaceC7387;
        InterfaceC7383 interfaceC73833;
        float f;
        int i;
        long jM15084;
        long jM15086;
        String strM14531;
        int i2 = this.f3177;
        C6008 c6008 = C6008.f15084;
        Object obj3 = this.f3174;
        Object obj4 = this.f3176;
        Object obj5 = this.f3175;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1821.m2450((InterfaceC2962) obj5, (C1720) obj4, (C2077) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(385));
                return c6008;
            case 1:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj5;
                AbstractC4819 abstractC4819 = (AbstractC4819) obj4;
                AbstractC4940 abstractC4940 = (AbstractC4940) obj3;
                String str = (String) obj;
                List list = (List) obj2;
                str.getClass();
                list.getClass();
                String[] strArr = AbstractC8944.f22758;
                if (!str.equals("Transfer-Encoding")) {
                    if (str.equals("Upgrade")) {
                        if (!(abstractC4819 instanceof C5008)) {
                            throw new BaseApplicationResponse$InvalidHeaderForContent("Upgrade", "non-upgrading response");
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((C4917) abstractC4940).f12760.m849(str, (String) it.next(), false);
                        }
                    }
                    return c6008;
                }
                ref$BooleanRef.element = true;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((C4917) abstractC4940).f12760.m849(str, (String) it2.next(), true);
                }
                return c6008;
            default:
                InterfaceC2230 interfaceC22303 = (InterfaceC2230) obj5;
                InterfaceC7372 interfaceC73722 = (InterfaceC7372) obj4;
                InterfaceC2230 interfaceC22304 = (InterfaceC2230) obj3;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                "C68@2827L26,69@2892L2,64@2676L3399:UserDialog.kt#ndgvs9";
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c2159.m2899();
                    return c6008;
                }
                C2958 c2958 = C2958.f6621;
                InterfaceC2962 interfaceC2962M3147 = AbstractC2280.m3147(AbstractC1460.m1944(c2958, 0.88f), AbstractC8584.m13671(28.0f));
                C9691 c9691 = AbstractC9692.f25349;
                "C(<get-QStoryDialogContainerColor>)163@5089L7:Color.kt#avp4iw";
                C2169 c2169 = AbstractC9692.f25347;
                "CC(<get-current>):CompositionLocal.kt#9igjgp";
                InterfaceC2962 interfaceC2962M2540 = AbstractC1910.m2540(interfaceC2962M3147, ((C9691) c2159.m2943(c2169)).f25344, AbstractC2416.f5007);
                "CC(remember):UserDialog.kt#9igjgp";
                Object objM2905 = c2159.m2905();
                C2188 c21882 = C2204.f4319;
                if (objM2905 == c21882) {
                    objM2905 = new C0858(0);
                    c2159.m2946(objM2905);
                }
                InterfaceC2962 interfaceC2962M1993 = AbstractC1469.m1993(AbstractC1910.m2548(interfaceC2962M2540, false, null, null, (InterfaceC7372) objM2905, 15), 20.0f);
                "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo";
                InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, false);
                "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                int iHashCode = Long.hashCode(c2159.f4182);
                C2088 c2088M2941 = c2159.m2941();
                InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962M1993);
                InterfaceC2619.f5567.getClass();
                InterfaceC7372 interfaceC73723 = C2600.f5530;
                "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                c2159.m2956();
                if (c2159.f4183) {
                    c2159.m2940(interfaceC73723);
                } else {
                    c2159.m2950();
                }
                InterfaceC7383 interfaceC73834 = C2600.f5526;
                AbstractC2202.m3032(c2159, interfaceC2493M2011, interfaceC73834);
                InterfaceC7383 interfaceC73835 = C2600.f5527;
                AbstractC2202.m3032(c2159, c2088M2941, interfaceC73835);
                Integer numValueOf = Integer.valueOf(iHashCode);
                InterfaceC7383 interfaceC73836 = C2600.f5533;
                AbstractC2202.m3032(c2159, numValueOf, interfaceC73836);
                InterfaceC7387 interfaceC73872 = C2600.f5532;
                AbstractC2202.m3041(c2159, interfaceC73872);
                InterfaceC7383 interfaceC73837 = C2600.f5528;
                AbstractC3275.m5122(c2159, interfaceC2962M4421, interfaceC73837, 2911, 3092);
                if (((Boolean) interfaceC22303.getValue()).booleanValue()) {
                    c2159.m2952(18204531);
                    "78@3206L23,73@2988L301";
                    interfaceC7383 = interfaceC73834;
                    interfaceC2230 = interfaceC22303;
                    interfaceC22302 = interfaceC22304;
                    interfaceC7372 = interfaceC73722;
                    c2188 = c21882;
                    interfaceC73832 = interfaceC73835;
                    interfaceC7387 = interfaceC73872;
                    interfaceC73833 = interfaceC73836;
                    f = 20.0f;
                    AbstractC1979.m2580(AbstractC1460.m1939(C1475.m2010(C2952.f6616), 24.0f).mo4426(new C2954()), AbstractC9692.m15085(c2159), 2.5f, 0L, 0, 0.0f, c2159, 384);
                    c2159 = c2159;
                    i = 0;
                    c2159.m2937(false);
                } else {
                    interfaceC2230 = interfaceC22303;
                    interfaceC22302 = interfaceC22304;
                    interfaceC7372 = interfaceC73722;
                    c2188 = c21882;
                    interfaceC7383 = interfaceC73834;
                    interfaceC73832 = interfaceC73835;
                    interfaceC7387 = interfaceC73872;
                    interfaceC73833 = interfaceC73836;
                    f = 20.0f;
                    i = 0;
                    c2159.m2952(18524544);
                    c2159.m2937(false);
                }
                "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo";
                C1479 c1479M2009 = AbstractC1474.m2009(AbstractC1469.f2109, C2952.f6604, c2159, i);
                "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                int iHashCode2 = Long.hashCode(c2159.f4182);
                C2088 c2088M29412 = c2159.m2941();
                InterfaceC2962 interfaceC2962M44212 = AbstractC2953.m4421(c2159, c2958);
                "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                c2159.m2956();
                if (c2159.f4183) {
                    c2159.m2940(interfaceC73723);
                } else {
                    c2159.m2950();
                }
                AbstractC2202.m3032(c2159, c1479M2009, interfaceC7383);
                AbstractC2202.m3032(c2159, c2088M29412, interfaceC73832);
                AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode2), interfaceC73833);
                AbstractC2202.m3041(c2159, interfaceC7387);
                AbstractC3275.m5122(c2159, interfaceC2962M44212, interfaceC73837, 2914, 3094);
                AbstractC6799.m11908((C9614) interfaceC22302.getValue(), c2159, 0);
                String str2 = ((C9614) interfaceC22302.getValue()).f25084;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                Integer num = ((C9614) interfaceC22302.getValue()).f25085;
                if ((num != null ? num.intValue() : 0) >= 1) {
                    c2159.m2952(-87907700);
                    "89@3530L26";
                    "C(<get-QStoryUserVipIdentityColor>)181@5799L7:Color.kt#avp4iw";
                    "CC(<get-current>):CompositionLocal.kt#9igjgp";
                    jM15084 = ((C9691) c2159.m2943(c2169)).f25338;
                    c2159.m2937(false);
                } else {
                    c2159.m2952(-87828247);
                    "91@3610L29";
                    jM15084 = AbstractC9692.m15084(c2159);
                    c2159.m2937(false);
                }
                C2159 c21592 = c2159;
                AbstractC2003.m2585(str3, AbstractC1469.m1995(c2958, 0.0f, 16.0f, 0.0f, 13), jM15084, AbstractC3400.m5640(15), null, 0L, null, 0L, 0, false, 0, 0, null, c21592, 24624, 262120);
                String strM14532 = ((C9614) interfaceC22302.getValue()).f25083;
                if (strM14532 == null || AbstractC5976.m10731(strM14532)) {
                    strM14532 = null;
                }
                if (strM14532 == null) {
                    strM14532 = "无";
                }
                String strConcat = "标签:".concat(strM14532);
                if (strM14532.equals("无")) {
                    c21592.m2952(-87342167);
                    "102@4100L29";
                    jM15086 = AbstractC9692.m15084(c21592);
                    c21592.m2937(false);
                } else {
                    c21592.m2952(-87260110);
                    "104@4183L20";
                    jM15086 = AbstractC9692.m15086(c21592);
                    c21592.m2937(false);
                }
                AbstractC2003.m2585(strConcat, AbstractC1469.m1995(c2958, 0.0f, 8.0f, 0.0f, 13), jM15086, AbstractC3400.m5640(15), null, 0L, null, 0L, 0, false, 0, 0, null, c21592, 24624, 262120);
                String strM145312 = "赞助到期时间:";
                LocalDateTime localDateTime = ((C9614) interfaceC22302.getValue()).f25082;
                if (localDateTime == null) {
                    strM14531 = "未赞助";
                } else {
                    strM14531 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    "format(...)";
                    strM14531.getClass();
                }
                AbstractC2003.m2585(strM145312.concat(strM14531), AbstractC1469.m1995(c2958, 0.0f, 8.0f, 0.0f, 13), AbstractC9692.m15084(c21592), AbstractC3400.m5640(15), null, 0L, null, 0L, 0, false, 0, 0, null, c21592, 24624, 262120);
                String strM145313 = "赞助作者";
                InterfaceC2962 interfaceC2962M1995 = AbstractC1469.m1995(c2958, 0.0f, f, 0.0f, 13);
                "CC(remember):UserDialog.kt#9igjgp";
                InterfaceC7372 interfaceC73724 = interfaceC7372;
                boolean zM2920 = c21592.m2920(interfaceC73724);
                Object objM29052 = c21592.m2905();
                C2188 c21883 = c2188;
                if (zM2920 || objM29052 == c21883) {
                    objM29052 = new C6800(interfaceC73724, 0);
                    c21592.m2946(objM29052);
                }
                AbstractC6799.m11907(strM145313, interfaceC2962M1995, false, (InterfaceC7372) objM29052, c21592, 54, 4);
                String strM145314 = "刷新用户信息";
                InterfaceC2962 interfaceC2962M19952 = AbstractC1469.m1995(c2958, 0.0f, 10.0f, 0.0f, 13);
                boolean z = !((Boolean) interfaceC2230.getValue()).booleanValue();
                "CC(remember):UserDialog.kt#9igjgp";
                Object objM29053 = c21592.m2905();
                if (objM29053 == c21883) {
                    objM29053 = new C0851(interfaceC2230, 11, interfaceC22302);
                    c21592.m2946(objM29053);
                }
                AbstractC6799.m11907(strM145314, interfaceC2962M19952, z, (InterfaceC7372) objM29053, c21592, 3126, 0);
                c21592.m2937(true);
                c21592.m2937(true);
                return c6008;
        }
    }

    public /* synthetic */ C1819(Object obj, Object obj2, Object obj3, int i) {
        this.f3177 = i;
        this.f3175 = obj;
        this.f3176 = obj2;
        this.f3174 = obj3;
    }
}
