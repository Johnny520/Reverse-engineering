package androidx.compose.foundation.text;

import android.content.res.Resources;
import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.AbstractC1474;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.layout.AbstractC1499;
import androidx.compose.foundation.layout.C1457;
import androidx.compose.foundation.layout.C1471;
import androidx.compose.foundation.layout.C1479;
import androidx.compose.foundation.layout.C1490;
import androidx.compose.foundation.layout.C1501;
import androidx.compose.foundation.layout.InterfaceC1476;
import androidx.compose.foundation.layout.InterfaceC1500;
import androidx.compose.foundation.layout.InterfaceC1505;
import androidx.compose.foundation.lazy.C1586;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2948;
import androidx.compose.p001ui.C2949;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2088;
import androidx.profileinstaller.AbstractC3275;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3898;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4764;
import io.ktor.client.plugins.C4756;
import io.ktor.client.statement.AbstractC4778;
import java.text.SimpleDateFormat;
import kotlin.C6008;
import lin.xposed.BuildConfig;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p104.C7981;
import p193.AbstractC8572;
import p193.C8575;
import p257.C8969;
import p257.InterfaceC8970;
import p267.AbstractC9004;
import p345.AbstractC9590;
import p345.AbstractC9594;
import p414.InterfaceC9970;
import top.suzhelan.qstory.p015ui.components.AbstractC6796;
import top.yukonga.miuix.kmp.basic.AbstractC6857;
import top.yukonga.miuix.kmp.basic.AbstractC6862;
import top.yukonga.miuix.kmp.extra.AbstractC6872;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1822 implements InterfaceC7380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3203;

    public /* synthetic */ C1822(int i) {
        this.f3203 = i;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f3203;
        C2958 c2958 = C2958.f6621;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                InterfaceC7383 interfaceC7383 = (InterfaceC7383) obj;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C2159) interfaceC2208).m2938(interfaceC7383) ? 4 : 2;
                }
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c2159.m2899();
                } else {
                    interfaceC7383.invoke(c2159, Integer.valueOf(14 & iIntValue));
                }
                break;
            case 1:
                Throwable th = (Throwable) obj3;
                ((C4756) obj).getClass();
                ((C8969) obj2).getClass();
                th.getClass();
                InterfaceC9970 interfaceC9970 = AbstractC4764.f12494;
                Throwable thM14184 = AbstractC9004.m14184(th);
                break;
            case 2:
                AbstractC4778 abstractC4778 = (AbstractC4778) obj3;
                ((C4756) obj).getClass();
                ((InterfaceC8970) obj2).getClass();
                abstractC4778.getClass();
                int i2 = abstractC4778.m8886().f22704;
                break;
            case 3:
                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                "it";
                ((InterfaceC1505) obj).getClass();
                "CN(it)61@2689L11:MainScreen.kt#ndgvs9";
                C2159 c21592 = (C2159) interfaceC22082;
                if (!c21592.m2903(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c21592.m2899();
                } else {
                    AbstractC6796.m11900(c21592, 0);
                }
                break;
            case 4:
                InterfaceC2208 interfaceC22083 = (InterfaceC2208) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                "$this$item";
                ((C1586) obj).getClass();
                "C89@3491L317:MainScreen.kt#ndgvs9";
                C2159 c21593 = (C2159) interfaceC22083;
                if (!c21593.m2903(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c21593.m2899();
                } else {
                    InterfaceC2962 interfaceC2962M1998 = AbstractC1469.m1998(c2958, 0.0f, 16.0f, 1);
                    C1490 c1490 = new C1490(16.0f, new C1471());
                    C2949 c2949 = C2952.f6603;
                    "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo";
                    C1479 c1479M2009 = AbstractC1474.m2009(c1490, c2949, c21593, 54);
                    "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                    int iHashCode = Long.hashCode(c21593.f4182);
                    C2088 c2088M2941 = c21593.m2941();
                    InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21593, interfaceC2962M1998);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC7372 = C2600.f5530;
                    "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                    c21593.m2956();
                    if (c21593.f4183) {
                        c21593.m2940(interfaceC7372);
                    } else {
                        c21593.m2950();
                    }
                    AbstractC2202.m3032(c21593, c1479M2009, C2600.f5526);
                    AbstractC2202.m3032(c21593, c2088M2941, C2600.f5527);
                    AbstractC2202.m3032(c21593, Integer.valueOf(iHashCode), C2600.f5533);
                    AbstractC2202.m3041(c21593, C2600.f5532);
                    AbstractC3275.m5122(c21593, interfaceC2962M4421, C2600.f5528, 2914, 2946);
                    AbstractC6796.m11901(c21593, 0);
                    AbstractC6796.m11899(c21593, 0);
                    c21593.m2937(true);
                }
                break;
            case 5:
                InterfaceC2208 interfaceC22084 = (InterfaceC2208) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                "$this$Card";
                ((InterfaceC1476) obj).getClass();
                "C111@4136L1162:MainScreen.kt#ndgvs9";
                C2159 c21594 = (C2159) interfaceC22084;
                if (!c21594.m2903(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c21594.m2899();
                } else {
                    InterfaceC2962 interfaceC2962M1997 = AbstractC1469.m1997(AbstractC1460.m1944(c2958, 1.0f), 20.0f, 24.0f);
                    C2948 c2948 = C2952.f6606;
                    "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                    C1501 c1501M2020 = AbstractC1499.m2020(AbstractC1469.f2111, c2948, c21594, 48);
                    "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                    int iHashCode2 = Long.hashCode(c21594.f4182);
                    C2088 c2088M29412 = c21594.m2941();
                    InterfaceC2962 interfaceC2962M44212 = AbstractC2953.m4421(c21594, interfaceC2962M1997);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC73722 = C2600.f5530;
                    "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                    c21594.m2956();
                    if (c21594.f4183) {
                        c21594.m2940(interfaceC73722);
                    } else {
                        c21594.m2950();
                    }
                    InterfaceC7383 interfaceC73832 = C2600.f5526;
                    AbstractC2202.m3032(c21594, c1501M2020, interfaceC73832);
                    InterfaceC7383 interfaceC73833 = C2600.f5527;
                    AbstractC2202.m3032(c21594, c2088M29412, interfaceC73833);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    InterfaceC7383 interfaceC73834 = C2600.f5533;
                    AbstractC2202.m3032(c21594, numValueOf, interfaceC73834);
                    InterfaceC7387 interfaceC7387 = C2600.f5532;
                    AbstractC2202.m3041(c21594, interfaceC7387);
                    InterfaceC7383 interfaceC73835 = C2600.f5528;
                    AbstractC3275.m5122(c21594, interfaceC2962M44212, interfaceC73835, 2951, 2952);
                    AbstractC6857.m11941(AbstractC3898.m7407(c21594, C0328R.mipmap.ic_launcher_round), AbstractC1460.m1939(c2958, 64.0f), C2434.f5042, c21594, 3512);
                    InterfaceC2962 interfaceC2962M1995 = AbstractC1469.m1995(c2958, 20.0f, 0.0f, 0.0f, 14);
                    "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo";
                    C1479 c1479M20092 = AbstractC1474.m2009(AbstractC1469.f2109, C2952.f6604, c21594, 0);
                    "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                    int iHashCode3 = Long.hashCode(c21594.f4182);
                    C2088 c2088M29413 = c21594.m2941();
                    InterfaceC2962 interfaceC2962M44213 = AbstractC2953.m4421(c21594, interfaceC2962M1995);
                    "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                    c21594.m2956();
                    if (c21594.f4183) {
                        c21594.m2940(interfaceC73722);
                    } else {
                        c21594.m2950();
                    }
                    AbstractC2202.m3032(c21594, c1479M20092, interfaceC73832);
                    AbstractC2202.m3032(c21594, c2088M29413, interfaceC73833);
                    AbstractC2202.m3032(c21594, Integer.valueOf(iHashCode3), interfaceC73834);
                    AbstractC2202.m3041(c21594, interfaceC7387);
                    AbstractC3275.m5122(c21594, interfaceC2962M44213, interfaceC73835, 2914, 2953);
                    AbstractC6862.m11949(((Resources) c21594.m2943(AbstractC2670.f5680)).getString(C0328R.string.module_name), null, 0L, AbstractC3400.m5640(30), C2822.f6216, 0L, 0L, 0, false, 0, 0, null, null, c21594, 1597440, 0, 262062);
                    AbstractC1469.m1983(c21594, AbstractC1460.m1943(c2958, 5.0f));
                    AbstractC6862.m11949("QQ 功能性 Xposed 模块", null, 0L, AbstractC3400.m5640(14), null, 0L, 0L, 0, false, 0, 0, null, null, c21594, 24582, 0, 262126);
                    AbstractC1469.m1983(c21594, AbstractC1460.m1943(c2958, 5.0f));
                    AbstractC6862.m11949("2.6.3 (" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(BuildConfig.BUILD_TIME)) + ')', null, 0L, AbstractC3400.m5640(14), null, 0L, 0L, 0, false, 0, 0, null, null, c21594, 24576, 0, 262126);
                    c21594.m2937(true);
                    c21594.m2937(true);
                }
                break;
            case 6:
                InterfaceC2208 interfaceC22085 = (InterfaceC2208) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((InterfaceC1500) obj).getClass();
                C2159 c21595 = (C2159) interfaceC22085;
                if (!c21595.m2903(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    c21595.m2899();
                }
                break;
            case 7:
                InterfaceC1500 interfaceC1500 = (InterfaceC1500) obj;
                InterfaceC2208 interfaceC22086 = (InterfaceC2208) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                interfaceC1500.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((C2159) interfaceC22086).m2920(interfaceC1500) ? 4 : 2;
                }
                C2159 c21596 = (C2159) interfaceC22086;
                if (!c21596.m2903(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    c21596.m2899();
                } else {
                    InterfaceC2962 interfaceC2962Mo1926 = interfaceC1500.mo1926(interfaceC1500.mo1927(AbstractC1469.m1995(c2958, 0.0f, 0.0f, 8.0f, 11)), false);
                    C1501 c1501M20202 = AbstractC1499.m2020(AbstractC1469.f2111, C2952.f6607, c21596, 0);
                    int iHashCode4 = Long.hashCode(c21596.f4182);
                    C2088 c2088M29414 = c21596.m2941();
                    InterfaceC2962 interfaceC2962M44214 = AbstractC2953.m4421(c21596, interfaceC2962Mo1926);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC73723 = C2600.f5530;
                    c21596.m2956();
                    if (c21596.f4183) {
                        c21596.m2940(interfaceC73723);
                    } else {
                        c21596.m2950();
                    }
                    AbstractC2202.m3032(c21596, c1501M20202, C2600.f5526);
                    AbstractC2202.m3032(c21596, c2088M29414, C2600.f5527);
                    AbstractC2202.m3053(c21596, Integer.valueOf(iHashCode4), C2600.f5533);
                    AbstractC2202.m3041(c21596, C2600.f5532);
                    AbstractC2202.m3032(c21596, interfaceC2962M44214, C2600.f5528);
                    AbstractC6872.f16868.invoke(C1457.f2064, c21596, 6);
                    c21596.m2937(true);
                    AbstractC6872.m11963(interfaceC1500, c21596, 14 & iIntValue6);
                }
                break;
            case 8:
                C8575 c8575 = (C8575) obj;
                InterfaceC2208 interfaceC22087 = (InterfaceC2208) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((C2159) interfaceC22087).m2920(c8575) ? 4 : 2;
                }
                C2159 c21597 = (C2159) interfaceC22087;
                if (!c21597.m2903(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    c21597.m2899();
                } else {
                    AbstractC1484.m2014(AbstractC1910.m2540(AbstractC1460.m1943(AbstractC1460.m1944(AbstractC1469.m1998(c2958, 0.0f, AbstractC8572.f21355, 1), 1.0f), AbstractC8572.f21348), c8575.f21366, AbstractC2416.f5007), c21597, 0);
                }
                break;
            case 9:
                String str = (String) obj;
                String str2 = (String) obj2;
                C7981 c7981 = (C7981) obj3;
                "configName";
                str.getClass();
                "key";
                str2.getClass();
                "args";
                c7981.getClass();
                AbstractC9590.m15009().putInt(str, str2, AbstractC9594.m15014("value", c7981));
                break;
            case 10:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                C7981 c79812 = (C7981) obj3;
                "configName";
                str3.getClass();
                "key";
                str4.getClass();
                "args";
                c79812.getClass();
                AbstractC9590.m15009().putDouble(str3, str4, AbstractC9594.m15016("value", c79812));
                break;
            case 11:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                C7981 c79813 = (C7981) obj3;
                "configName";
                str5.getClass();
                "key";
                str6.getClass();
                "args";
                c79813.getClass();
                AbstractC9590.m15009().putString(str5, str6, AbstractC3738.m6899("value", c79813));
                break;
            case 12:
                String str7 = (String) obj;
                String str8 = (String) obj2;
                C7981 c79814 = (C7981) obj3;
                "configName";
                str7.getClass();
                "key";
                str8.getClass();
                "args";
                c79814.getClass();
                AbstractC9590.m15009().putLong(str7, str8, AbstractC9594.m15022("value", c79814));
                break;
            case 13:
                String str9 = (String) obj;
                String str10 = (String) obj2;
                C7981 c79815 = (C7981) obj3;
                "configName";
                str9.getClass();
                "key";
                str10.getClass();
                "args";
                c79815.getClass();
                AbstractC9590.m15009().putFloat(str9, str10, AbstractC9594.m15015("value", c79815));
                break;
            case 14:
                String str11 = (String) obj;
                String str12 = (String) obj2;
                C7981 c79816 = (C7981) obj3;
                "configName";
                str11.getClass();
                "key";
                str12.getClass();
                "args";
                c79816.getClass();
                break;
            case 15:
                String str13 = (String) obj;
                String str14 = (String) obj2;
                C7981 c79817 = (C7981) obj3;
                "configName";
                str13.getClass();
                "key";
                str14.getClass();
                "args";
                c79817.getClass();
                QQNTPluginMethod qQNTPluginMethodM15009 = AbstractC9590.m15009();
                Boolean boolM15017 = AbstractC9594.m15017("default_value", c79817);
                break;
            case 16:
                String str15 = (String) obj;
                String str16 = (String) obj2;
                C7981 c79818 = (C7981) obj3;
                "configName";
                str15.getClass();
                "key";
                str16.getClass();
                "args";
                c79818.getClass();
                break;
            case 17:
                String str17 = (String) obj;
                String str18 = (String) obj2;
                C7981 c79819 = (C7981) obj3;
                "configName";
                str17.getClass();
                "key";
                str18.getClass();
                "args";
                c79819.getClass();
                break;
            case 18:
                String str19 = (String) obj;
                String str20 = (String) obj2;
                C7981 c798110 = (C7981) obj3;
                "configName";
                str19.getClass();
                "key";
                str20.getClass();
                "args";
                c798110.getClass();
                break;
            case 19:
                String str21 = (String) obj;
                String str22 = (String) obj2;
                C7981 c798111 = (C7981) obj3;
                "configName";
                str21.getClass();
                "key";
                str22.getClass();
                "args";
                c798111.getClass();
                QQNTPluginMethod qQNTPluginMethodM150092 = AbstractC9590.m15009();
                Boolean boolM150172 = AbstractC9594.m15017("value", c798111);
                qQNTPluginMethodM150092.putBoolean(str21, str22, boolM150172 != null ? boolM150172.booleanValue() : false);
                break;
            case 20:
                String str23 = (String) obj;
                String str24 = (String) obj2;
                String str25 = (String) obj3;
                "groupUin";
                str23.getClass();
                "userUin";
                str24.getClass();
                "path";
                str25.getClass();
                AbstractC9590.m15009().sendFile(str23, str24, str25);
                break;
            case 21:
                String str26 = (String) obj;
                String str27 = (String) obj2;
                String str28 = (String) obj3;
                "groupUin";
                str26.getClass();
                "userUin";
                str27.getClass();
                "path";
                str28.getClass();
                AbstractC9590.m15009().sendVoice(str26, str27, str28);
                break;
            case 22:
                String str29 = (String) obj;
                String str30 = (String) obj2;
                String str31 = (String) obj3;
                "groupUin";
                str29.getClass();
                "userUin";
                str30.getClass();
                "path";
                str31.getClass();
                AbstractC9590.m15009().sendPic(str29, str30, str31);
                break;
            case 23:
                String str32 = (String) obj;
                String str33 = (String) obj2;
                String str34 = (String) obj3;
                "groupUin";
                str32.getClass();
                "userUin";
                str33.getClass();
                "content";
                str34.getClass();
                AbstractC9590.m15009().sendMsg(str32, str33, str34);
                break;
            case 24:
                String str35 = (String) obj;
                String str36 = (String) obj2;
                String str37 = (String) obj3;
                "groupUin";
                str35.getClass();
                "userUin";
                str36.getClass();
                "cardText";
                str37.getClass();
                AbstractC9590.m15009().sendCard(str35, str36, str37);
                break;
            default:
                String str38 = (String) obj;
                String str39 = (String) obj2;
                String str40 = (String) obj3;
                "groupUin";
                str38.getClass();
                "userUin";
                str39.getClass();
                "path";
                str40.getClass();
                AbstractC9590.m15009().sendVideo(str38, str39, str40);
                break;
        }
        return c6008;
    }
}
