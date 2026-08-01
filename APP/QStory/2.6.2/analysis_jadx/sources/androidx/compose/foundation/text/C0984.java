package androidx.compose.foundation.text;

import android.content.res.Resources;
import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.AbstractC0633;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.layout.AbstractC0658;
import androidx.compose.foundation.layout.C0616;
import androidx.compose.foundation.layout.C0630;
import androidx.compose.foundation.layout.C0638;
import androidx.compose.foundation.layout.C0649;
import androidx.compose.foundation.layout.C0660;
import androidx.compose.foundation.layout.InterfaceC0635;
import androidx.compose.foundation.layout.InterfaceC0659;
import androidx.compose.foundation.layout.InterfaceC0664;
import androidx.compose.foundation.lazy.C0745;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2115;
import androidx.compose.ui.C2116;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.platform.AbstractC1835;
import androidx.compose.ui.text.font.C1988;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3931;
import io.ktor.client.plugins.C3923;
import io.ktor.client.statement.AbstractC3945;
import java.text.SimpleDateFormat;
import kotlin.C5175;
import lin.xposed.BuildConfig;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import p007.AbstractC6136;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p088.C7151;
import p177.AbstractC7742;
import p177.C7745;
import p241.C8139;
import p241.InterfaceC8140;
import p325.AbstractC8753;
import p325.AbstractC8757;
import p392.AbstractC9124;
import p400.InterfaceC9156;
import top.suzhelan.qstory.ui.components.AbstractC5960;
import top.yukonga.miuix.kmp.basic.AbstractC6021;
import top.yukonga.miuix.kmp.basic.AbstractC6026;
import top.yukonga.miuix.kmp.extra.AbstractC6036;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0984 implements InterfaceC6550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2857;

    public /* synthetic */ C0984(int i) {
        this.f2857 = i;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f2857;
        C2125 c2125 = C2125.f6275;
        C5175 c5175 = C5175.f14739;
        switch (i) {
            case 0:
                InterfaceC6553 interfaceC6553 = (InterfaceC6553) obj;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1324) interfaceC1373).m2368(interfaceC6553) ? 4 : 2;
                }
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c1324.m2329();
                } else {
                    interfaceC6553.invoke(c1324, Integer.valueOf(iIntValue & 14));
                }
                break;
            case 1:
                Throwable th = (Throwable) obj3;
                ((C3923) obj).getClass();
                ((C8139) obj2).getClass();
                th.getClass();
                InterfaceC9156 interfaceC9156 = AbstractC3931.f12144;
                Throwable thM1139 = AbstractC0455.m1139(th);
                break;
            case 2:
                AbstractC3945 abstractC3945 = (AbstractC3945) obj3;
                ((C3923) obj).getClass();
                ((InterfaceC8140) obj2).getClass();
                abstractC3945.getClass();
                int i2 = abstractC3945.m8337().f22361;
                break;
            case 3:
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC3056.m6668(-3937829315039987111L);
                ((InterfaceC0664) obj).getClass();
                AbstractC3056.m6668(-3937296215109272999L);
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2333(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c13242.m2329();
                } else {
                    AbstractC5960.m11281(c13242, 0);
                }
                break;
            case 4:
                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC3056.m6668(-3937294909439215015L);
                ((C0745) obj).getClass();
                AbstractC3056.m6668(-3937294819244901799L);
                C1324 c13243 = (C1324) interfaceC13733;
                if (!c13243.m2333(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c13243.m2329();
                } else {
                    InterfaceC2129 interfaceC2129M1428 = AbstractC0628.m1428(c2125, 0.0f, 16.0f, 1);
                    C0649 c0649 = new C0649(16.0f, new C0630());
                    C2116 c2116 = C2119.f6257;
                    AbstractC3056.m6668(-3937281440421774759L);
                    C0638 c0638M1439 = AbstractC0633.m1439(c0649, c2116, c13243, 54);
                    AbstractC3056.m6668(-3937282539933402535L);
                    int iHashCode = Long.hashCode(c13243.f3836);
                    C1253 c1253M2371 = c13243.m2371();
                    InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c13243, interfaceC2129M1428);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC6542 = C1765.f5184;
                    AbstractC3056.m6668(-3937282209220920743L);
                    c13243.m2386();
                    if (c13243.f3837) {
                        c13243.m2370(interfaceC6542);
                    } else {
                        c13243.m2380();
                    }
                    AbstractC1367.m2464(c13243, c0638M1439, C1765.f5180);
                    AbstractC1367.m2464(c13243, c1253M2371, C1765.f5181);
                    AbstractC1367.m2464(c13243, Integer.valueOf(iHashCode), C1765.f5187);
                    AbstractC1367.m2472(c13243, C1765.f5186);
                    AbstractC1367.m2464(c13243, interfaceC2129M3851, C1765.f5182);
                    AbstractC3056.m6668(-3937280912140797351L);
                    AbstractC3056.m6668(-3937294230834382247L);
                    AbstractC5960.m11282(c13243, 0);
                    AbstractC5960.m11280(c13243, 0);
                    c13243.m2367(true);
                }
                break;
            case 5:
                InterfaceC1373 interfaceC13734 = (InterfaceC1373) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC3056.m6668(-3937293973136344487L);
                ((InterfaceC0635) obj).getClass();
                AbstractC3056.m6668(-3937293917301769639L);
                C1324 c13244 = (C1324) interfaceC13734;
                if (!c13244.m2333(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c13244.m2329();
                } else {
                    InterfaceC2129 interfaceC2129M1427 = AbstractC0628.m1427(AbstractC0619.m1374(c2125, 1.0f), 20.0f, 24.0f);
                    C2115 c2115 = C2119.f6260;
                    AbstractC3056.m6668(-3937293311711380903L);
                    C0660 c0660M1450 = AbstractC0658.m1450(AbstractC0628.f1765, c2115, c13244, 48);
                    AbstractC3056.m6668(-3937282539933402535L);
                    int iHashCode2 = Long.hashCode(c13244.f3836);
                    C1253 c1253M23712 = c13244.m2371();
                    InterfaceC2129 interfaceC2129M38512 = AbstractC2120.m3851(c13244, interfaceC2129M1427);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC65422 = C1765.f5184;
                    AbstractC3056.m6668(-3937282209220920743L);
                    c13244.m2386();
                    if (c13244.f3837) {
                        c13244.m2370(interfaceC65422);
                    } else {
                        c13244.m2380();
                    }
                    InterfaceC6553 interfaceC65532 = C1765.f5180;
                    AbstractC1367.m2464(c13244, c0660M1450, interfaceC65532);
                    InterfaceC6553 interfaceC65533 = C1765.f5181;
                    AbstractC1367.m2464(c13244, c1253M23712, interfaceC65533);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    InterfaceC6553 interfaceC65534 = C1765.f5187;
                    AbstractC1367.m2464(c13244, numValueOf, interfaceC65534);
                    InterfaceC6557 interfaceC6557 = C1765.f5186;
                    AbstractC1367.m2472(c13244, interfaceC6557);
                    InterfaceC6553 interfaceC65535 = C1765.f5182;
                    AbstractC1367.m2464(c13244, interfaceC2129M38512, interfaceC65535);
                    AbstractC3056.m6668(-3937292796315305383L);
                    AbstractC3056.m6668(-3937292770545501607L);
                    AbstractC6021.m11322(AbstractC3055.m6638(c13244, R.mipmap.ic_launcher_round), AbstractC0619.m1369(c2125, 64.0f), C1599.f4696, c13244, 3512);
                    InterfaceC2129 interfaceC2129M1425 = AbstractC0628.m1425(c2125, 20.0f, 0.0f, 0.0f, 14);
                    AbstractC3056.m6668(-3937281440421774759L);
                    C0638 c0638M14392 = AbstractC0633.m1439(AbstractC0628.f1763, C2119.f6258, c13244, 0);
                    AbstractC3056.m6668(-3937282539933402535L);
                    int iHashCode3 = Long.hashCode(c13244.f3836);
                    C1253 c1253M23713 = c13244.m2371();
                    InterfaceC2129 interfaceC2129M38513 = AbstractC2120.m3851(c13244, interfaceC2129M1425);
                    AbstractC3056.m6668(-3937282209220920743L);
                    c13244.m2386();
                    if (c13244.f3837) {
                        c13244.m2370(interfaceC65422);
                    } else {
                        c13244.m2380();
                    }
                    AbstractC1367.m2464(c13244, c0638M14392, interfaceC65532);
                    AbstractC1367.m2464(c13244, c1253M23713, interfaceC65533);
                    AbstractC1367.m2464(c13244, Integer.valueOf(iHashCode3), interfaceC65534);
                    AbstractC1367.m2472(c13244, interfaceC6557);
                    AbstractC1367.m2464(c13244, interfaceC2129M38513, interfaceC65535);
                    AbstractC3056.m6668(-3937280912140797351L);
                    AbstractC3056.m6668(-3937292512847463847L);
                    AbstractC6026.m11330(((Resources) c13244.m2373(AbstractC1835.f5334)).getString(R.string.module_name), null, 0L, AbstractC9124.m14670(30), C1988.f5870, 0L, 0L, 0, false, 0, 0, null, null, c13244, 1597440, 0, 262062);
                    AbstractC0628.m1413(c13244, AbstractC0619.m1373(c2125, 5.0f));
                    AbstractC6026.m11330(AbstractC3056.m6668(-3937292104825570727L), null, 0L, AbstractC9124.m14670(14), null, 0L, 0L, 0, false, 0, 0, null, null, c13244, 24582, 0, 262126);
                    AbstractC0628.m1413(c13244, AbstractC0619.m1373(c2125, 5.0f));
                    AbstractC6026.m11330(AbstractC3056.m6668(-3937292006041322919L) + new SimpleDateFormat(AbstractC3056.m6668(-3937640645716608423L)).format(Long.valueOf(BuildConfig.BUILD_TIME)) + ')', null, 0L, AbstractC9124.m14670(14), null, 0L, 0L, 0, false, 0, 0, null, null, c13244, 24576, 0, 262126);
                    c13244.m2367(true);
                    c13244.m2367(true);
                }
                break;
            case 6:
                InterfaceC1373 interfaceC13735 = (InterfaceC1373) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((InterfaceC0659) obj).getClass();
                C1324 c13245 = (C1324) interfaceC13735;
                if (!c13245.m2333(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    c13245.m2329();
                }
                break;
            case 7:
                InterfaceC0659 interfaceC0659 = (InterfaceC0659) obj;
                InterfaceC1373 interfaceC13736 = (InterfaceC1373) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                interfaceC0659.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((C1324) interfaceC13736).m2350(interfaceC0659) ? 4 : 2;
                }
                C1324 c13246 = (C1324) interfaceC13736;
                if (!c13246.m2333(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    c13246.m2329();
                } else {
                    InterfaceC2129 interfaceC2129Mo1356 = interfaceC0659.mo1356(interfaceC0659.mo1357(AbstractC0628.m1425(c2125, 0.0f, 0.0f, 8.0f, 11)), false);
                    C0660 c0660M14502 = AbstractC0658.m1450(AbstractC0628.f1765, C2119.f6261, c13246, 0);
                    int iHashCode4 = Long.hashCode(c13246.f3836);
                    C1253 c1253M23714 = c13246.m2371();
                    InterfaceC2129 interfaceC2129M38514 = AbstractC2120.m3851(c13246, interfaceC2129Mo1356);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC65423 = C1765.f5184;
                    c13246.m2386();
                    if (c13246.f3837) {
                        c13246.m2370(interfaceC65423);
                    } else {
                        c13246.m2380();
                    }
                    AbstractC1367.m2464(c13246, c0660M14502, C1765.f5180);
                    AbstractC1367.m2464(c13246, c1253M23714, C1765.f5181);
                    AbstractC1367.m2483(c13246, Integer.valueOf(iHashCode4), C1765.f5187);
                    AbstractC1367.m2472(c13246, C1765.f5186);
                    AbstractC1367.m2464(c13246, interfaceC2129M38514, C1765.f5182);
                    AbstractC6036.f16514.invoke(C0616.f1718, c13246, 6);
                    c13246.m2367(true);
                    AbstractC6036.m11344(interfaceC0659, c13246, iIntValue6 & 14);
                }
                break;
            case 8:
                C7745 c7745 = (C7745) obj;
                InterfaceC1373 interfaceC13737 = (InterfaceC1373) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((C1324) interfaceC13737).m2350(c7745) ? 4 : 2;
                }
                C1324 c13247 = (C1324) interfaceC13737;
                if (!c13247.m2333(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    c13247.m2329();
                } else {
                    AbstractC0643.m1444(AbstractC1072.m1970(AbstractC0619.m1373(AbstractC0619.m1374(AbstractC0628.m1428(c2125, 0.0f, AbstractC7742.f21013, 1), 1.0f), AbstractC7742.f21006), c7745.f21024, AbstractC1581.f4661), c13247, 0);
                }
                break;
            case 9:
                String str = (String) obj;
                String str2 = (String) obj2;
                C7151 c7151 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str);
                str2.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c7151.getClass();
                AbstractC8753.m14416().putInt(str, str2, AbstractC8757.m14421(c7151, AbstractC3056.m6668(-3937685966211515815L)));
                break;
            case 10:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                C7151 c71512 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str3);
                str4.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c71512.getClass();
                AbstractC8753.m14416().putDouble(str3, str4, AbstractC8757.m14423(c71512, AbstractC3056.m6668(-3937685966211515815L)));
                break;
            case 11:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                C7151 c71513 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str5);
                str6.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c71513.getClass();
                AbstractC8753.m14416().putString(str5, str6, AbstractC3056.m6713(c71513, AbstractC3056.m6668(-3937685966211515815L)));
                break;
            case 12:
                String str7 = (String) obj;
                String str8 = (String) obj2;
                C7151 c71514 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str7);
                str8.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c71514.getClass();
                AbstractC8753.m14416().putLong(str7, str8, AbstractC8757.m14429(c71514, AbstractC3056.m6668(-3937685966211515815L)));
                break;
            case 13:
                String str9 = (String) obj;
                String str10 = (String) obj2;
                C7151 c71515 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str9);
                str10.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c71515.getClass();
                AbstractC8753.m14416().putFloat(str9, str10, AbstractC8757.m14422(c71515, AbstractC3056.m6668(-3937685966211515815L)));
                break;
            case 14:
                String str11 = (String) obj;
                String str12 = (String) obj2;
                C7151 c71516 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str11);
                str12.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c71516.getClass();
                break;
            case 15:
                String str13 = (String) obj;
                String str14 = (String) obj2;
                C7151 c71517 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str13);
                str14.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c71517.getClass();
                QQNTPluginMethod qQNTPluginMethodM14416 = AbstractC8753.m14416();
                Boolean boolM14424 = AbstractC8757.m14424(c71517, AbstractC3056.m6668(-3937803313307977127L));
                break;
            case 16:
                String str15 = (String) obj;
                String str16 = (String) obj2;
                C7151 c71518 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str15);
                str16.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c71518.getClass();
                break;
            case 17:
                String str17 = (String) obj;
                String str18 = (String) obj2;
                C7151 c71519 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str17);
                str18.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c71519.getClass();
                break;
            case 18:
                String str19 = (String) obj;
                String str20 = (String) obj2;
                C7151 c715110 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str19);
                str20.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c715110.getClass();
                break;
            case 19:
                String str21 = (String) obj;
                String str22 = (String) obj2;
                C7151 c715111 = (C7151) obj3;
                AbstractC6136.m11546(-3937800354075510183L, -3937803416387192231L, str21);
                str22.getClass();
                AbstractC3056.m6668(-3937732158584784295L);
                c715111.getClass();
                QQNTPluginMethod qQNTPluginMethodM144162 = AbstractC8753.m14416();
                Boolean boolM144242 = AbstractC8757.m14424(c715111, AbstractC3056.m6668(-3937685966211515815L));
                qQNTPluginMethodM144162.putBoolean(str21, str22, boolM144242 != null ? boolM144242.booleanValue() : false);
                break;
            case 20:
                String str23 = (String) obj;
                String str24 = (String) obj2;
                String str25 = (String) obj3;
                AbstractC6136.m11546(-3937702974282007975L, -3937809077154088359L, str23);
                str24.getClass();
                AbstractC3056.m6668(-3937816627706594727L);
                str25.getClass();
                AbstractC8753.m14416().sendFile(str23, str24, str25);
                break;
            case 21:
                String str26 = (String) obj;
                String str27 = (String) obj2;
                String str28 = (String) obj3;
                AbstractC6136.m11546(-3937702974282007975L, -3937809077154088359L, str26);
                str27.getClass();
                AbstractC3056.m6668(-3937816627706594727L);
                str28.getClass();
                AbstractC8753.m14416().sendVoice(str26, str27, str28);
                break;
            case 22:
                String str29 = (String) obj;
                String str30 = (String) obj2;
                String str31 = (String) obj3;
                AbstractC6136.m11546(-3937702974282007975L, -3937809077154088359L, str29);
                str30.getClass();
                AbstractC3056.m6668(-3937816627706594727L);
                str31.getClass();
                AbstractC8753.m14416().sendPic(str29, str30, str31);
                break;
            case 23:
                String str32 = (String) obj;
                String str33 = (String) obj2;
                String str34 = (String) obj3;
                AbstractC6136.m11546(-3937702974282007975L, -3937809077154088359L, str32);
                str33.getClass();
                AbstractC3056.m6668(-3937565664177554855L);
                str34.getClass();
                AbstractC8753.m14416().sendMsg(str32, str33, str34);
                break;
            case 24:
                String str35 = (String) obj;
                String str36 = (String) obj2;
                String str37 = (String) obj3;
                AbstractC6136.m11546(-3937702974282007975L, -3937809077154088359L, str35);
                str36.getClass();
                AbstractC3056.m6668(-3937808974074873255L);
                str37.getClass();
                AbstractC8753.m14416().sendCard(str35, str36, str37);
                break;
            default:
                String str38 = (String) obj;
                String str39 = (String) obj2;
                String str40 = (String) obj3;
                AbstractC6136.m11546(-3937702974282007975L, -3937809077154088359L, str38);
                str39.getClass();
                AbstractC3056.m6668(-3937816627706594727L);
                str40.getClass();
                AbstractC8753.m14416().sendVideo(str38, str39, str40);
                break;
        }
        return c5175;
    }
}
