package androidx.compose.foundation.text;

import android.content.res.Resources;
import androidx.compose.foundation.AbstractC1072;
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
import androidx.profileinstaller.AbstractC2442;
import androidx.window.area.AbstractC2567;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3066;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.client.plugins.C3924;
import io.ktor.client.statement.AbstractC3946;
import java.text.SimpleDateFormat;
import kotlin.C5176;
import lin.xposed.BuildConfig;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p088.C7152;
import p177.AbstractC7743;
import p177.C7746;
import p241.C8140;
import p241.InterfaceC8141;
import p251.AbstractC8175;
import p287.AbstractC8405;
import p329.AbstractC8761;
import p329.AbstractC8765;
import p398.InterfaceC9141;
import top.suzhelan.qstory.ui.components.AbstractC5966;
import top.yukonga.miuix.kmp.basic.AbstractC6027;
import top.yukonga.miuix.kmp.basic.AbstractC6032;
import top.yukonga.miuix.kmp.extra.AbstractC6042;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0984 implements InterfaceC6551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2858;

    public /* synthetic */ C0984(int i) {
        this.f2858 = i;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f2858;
        C2125 c2125 = C2125.f6276;
        C5176 c5176 = C5176.f14739;
        switch (i) {
            case 0:
                InterfaceC6554 interfaceC6554 = (InterfaceC6554) obj;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1324) interfaceC1373).m2378(interfaceC6554) ? 4 : 2;
                }
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2343(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c1324.m2339();
                } else {
                    interfaceC6554.invoke(c1324, Integer.valueOf(14 & iIntValue));
                }
                break;
            case 1:
                Throwable th = (Throwable) obj3;
                ((C3924) obj).getClass();
                ((C8140) obj2).getClass();
                th.getClass();
                InterfaceC9141 interfaceC9141 = AbstractC3932.f12149;
                Throwable thM13625 = AbstractC8175.m13625(th);
                break;
            case 2:
                AbstractC3946 abstractC3946 = (AbstractC3946) obj3;
                ((C3924) obj).getClass();
                ((InterfaceC8141) obj2).getClass();
                abstractC3946.getClass();
                int i2 = abstractC3946.m8327().f22359;
                break;
            case 3:
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜"); /* decoded-inline: it */
                ((InterfaceC0664) obj).getClass();
                AbstractC8405.m13972(2939); /* decoded: m13972(2939)=CN(it)61@2689L11:MainScreen.kt#ndgvs9 */
                C1324 c13242 = (C1324) interfaceC13732;
                if (!c13242.m2343(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c13242.m2339();
                } else {
                    AbstractC5966.m11341(c13242, 0);
                }
                break;
            case 4:
                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC8405.m13972(2943); /* decoded: m13972(2943)=$this$item */
                ((C0745) obj).getClass();
                AbstractC8405.m13972(2944); /* decoded: m13972(2944)=C89@3491L317:MainScreen.kt#ndgvs9 */
                C1324 c13243 = (C1324) interfaceC13733;
                if (!c13243.m2343(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c13243.m2339();
                } else {
                    InterfaceC2129 interfaceC2129M1438 = AbstractC0628.m1438(c2125, 0.0f, 16.0f, 1);
                    C0649 c0649 = new C0649(16.0f, new C0630());
                    C2116 c2116 = C2119.f6258;
                    AbstractC8405.m13972(2913); /* decoded: m13972(2913)=CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo */
                    C0638 c0638M1449 = AbstractC0633.m1449(c0649, c2116, c13243, 54);
                    AbstractC8405.m13972(2909); /* decoded: m13972(2909)=CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh */
                    int iHashCode = Long.hashCode(c13243.f3837);
                    C1253 c1253M2381 = c13243.m2381();
                    InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c13243, interfaceC2129M1438);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC6543 = C1765.f5185;
                    AbstractC8405.m13972(2910); /* decoded: m13972(2910)=CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp */
                    c13243.m2396();
                    if (c13243.f3838) {
                        c13243.m2380(interfaceC6543);
                    } else {
                        c13243.m2390();
                    }
                    AbstractC1367.m2472(c13243, c0638M1449, C1765.f5181);
                    AbstractC1367.m2472(c13243, c1253M2381, C1765.f5182);
                    AbstractC1367.m2472(c13243, Integer.valueOf(iHashCode), C1765.f5188);
                    AbstractC1367.m2481(c13243, C1765.f5187);
                    AbstractC2442.m4562(c13243, interfaceC2129M3861, C1765.f5183, 2914, 2946);
                    AbstractC5966.m11342(c13243, 0);
                    AbstractC5966.m11340(c13243, 0);
                    c13243.m2377(true);
                }
                break;
            case 5:
                InterfaceC1373 interfaceC13734 = (InterfaceC1373) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC8405.m13972(2947); /* decoded: m13972(2947)=$this$Card */
                ((InterfaceC0635) obj).getClass();
                AbstractC8405.m13972(2948); /* decoded: m13972(2948)=C111@4136L1162:MainScreen.kt#ndgvs9 */
                C1324 c13244 = (C1324) interfaceC13734;
                if (!c13244.m2343(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c13244.m2339();
                } else {
                    InterfaceC2129 interfaceC2129M1437 = AbstractC0628.m1437(AbstractC0619.m1384(c2125, 1.0f), 20.0f, 24.0f);
                    C2115 c2115 = C2119.f6261;
                    AbstractC8405.m13972(2950); /* decoded: m13972(2950)=CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo */
                    C0660 c0660M1460 = AbstractC0658.m1460(AbstractC0628.f1766, c2115, c13244, 48);
                    AbstractC8405.m13972(2909); /* decoded: m13972(2909)=CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh */
                    int iHashCode2 = Long.hashCode(c13244.f3837);
                    C1253 c1253M23812 = c13244.m2381();
                    InterfaceC2129 interfaceC2129M38612 = AbstractC2120.m3861(c13244, interfaceC2129M1437);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC65432 = C1765.f5185;
                    AbstractC8405.m13972(2910); /* decoded: m13972(2910)=CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp */
                    c13244.m2396();
                    if (c13244.f3838) {
                        c13244.m2380(interfaceC65432);
                    } else {
                        c13244.m2390();
                    }
                    InterfaceC6554 interfaceC65542 = C1765.f5181;
                    AbstractC1367.m2472(c13244, c0660M1460, interfaceC65542);
                    InterfaceC6554 interfaceC65543 = C1765.f5182;
                    AbstractC1367.m2472(c13244, c1253M23812, interfaceC65543);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    InterfaceC6554 interfaceC65544 = C1765.f5188;
                    AbstractC1367.m2472(c13244, numValueOf, interfaceC65544);
                    InterfaceC6558 interfaceC6558 = C1765.f5187;
                    AbstractC1367.m2481(c13244, interfaceC6558);
                    InterfaceC6554 interfaceC65545 = C1765.f5183;
                    AbstractC2442.m4562(c13244, interfaceC2129M38612, interfaceC65545, 2951, 2952);
                    AbstractC6027.m11382(AbstractC3066.m6847(c13244, R.mipmap.ic_launcher_round), AbstractC0619.m1379(c2125, 64.0f), C1599.f4697, c13244, 3512);
                    InterfaceC2129 interfaceC2129M1435 = AbstractC0628.m1435(c2125, 20.0f, 0.0f, 0.0f, 14);
                    AbstractC8405.m13972(2913); /* decoded: m13972(2913)=CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo */
                    C0638 c0638M14492 = AbstractC0633.m1449(AbstractC0628.f1764, C2119.f6259, c13244, 0);
                    AbstractC8405.m13972(2909); /* decoded: m13972(2909)=CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh */
                    int iHashCode3 = Long.hashCode(c13244.f3837);
                    C1253 c1253M23813 = c13244.m2381();
                    InterfaceC2129 interfaceC2129M38613 = AbstractC2120.m3861(c13244, interfaceC2129M1435);
                    AbstractC8405.m13972(2910); /* decoded: m13972(2910)=CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp */
                    c13244.m2396();
                    if (c13244.f3838) {
                        c13244.m2380(interfaceC65432);
                    } else {
                        c13244.m2390();
                    }
                    AbstractC1367.m2472(c13244, c0638M14492, interfaceC65542);
                    AbstractC1367.m2472(c13244, c1253M23813, interfaceC65543);
                    AbstractC1367.m2472(c13244, Integer.valueOf(iHashCode3), interfaceC65544);
                    AbstractC1367.m2481(c13244, interfaceC6558);
                    AbstractC2442.m4562(c13244, interfaceC2129M38613, interfaceC65545, 2914, 2953);
                    AbstractC6032.m11390(((Resources) c13244.m2383(AbstractC1835.f5335)).getString(R.string.module_name), null, 0L, AbstractC2567.m5080(30), C1988.f5871, 0L, 0L, 0, false, 0, 0, null, null, c13244, 1597440, 0, 262062);
                    AbstractC0628.m1423(c13244, AbstractC0619.m1383(c2125, 5.0f));
                    AbstractC6032.m11390(AbstractC8405.m13972(2954), null, 0L, AbstractC2567.m5080(14), null, 0L, 0L, 0, false, 0, 0, null, null, c13244, 24582, 0, 262126); /* decoded: m13972(2954)=QQ 功能性 Xposed 模块 */
                    AbstractC0628.m1423(c13244, AbstractC0619.m1383(c2125, 5.0f));
                    AbstractC6032.m11390(AbstractC8405.m13973("喵呜喵喵喵喵喵呜~喵呜喵呜呜喵呜呜~喵呜喵喵呜呜喵喵~喵呜喵喵喵呜呜喵~喵呜喵呜喵呜呜喵~喵呜喵喵呜呜喵喵~喵呜喵喵呜喵喵呜") + new SimpleDateFormat(AbstractC8405.m13972(736)).format(Long.valueOf(BuildConfig.BUILD_TIME)) + ')', null, 0L, AbstractC2567.m5080(14), null, 0L, 0L, 0, false, 0, 0, null, null, c13244, 24576, 0, 262126); /* decoded: m13972(736)=yyyy-MM-dd HH:mm:ss */ /* decoded-inline: 2.6.3 ( */
                    c13244.m2377(true);
                    c13244.m2377(true);
                }
                break;
            case 6:
                InterfaceC1373 interfaceC13735 = (InterfaceC1373) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((InterfaceC0659) obj).getClass();
                C1324 c13245 = (C1324) interfaceC13735;
                if (!c13245.m2343(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    c13245.m2339();
                }
                break;
            case 7:
                InterfaceC0659 interfaceC0659 = (InterfaceC0659) obj;
                InterfaceC1373 interfaceC13736 = (InterfaceC1373) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                interfaceC0659.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((C1324) interfaceC13736).m2360(interfaceC0659) ? 4 : 2;
                }
                C1324 c13246 = (C1324) interfaceC13736;
                if (!c13246.m2343(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    c13246.m2339();
                } else {
                    InterfaceC2129 interfaceC2129Mo1366 = interfaceC0659.mo1366(interfaceC0659.mo1367(AbstractC0628.m1435(c2125, 0.0f, 0.0f, 8.0f, 11)), false);
                    C0660 c0660M14602 = AbstractC0658.m1460(AbstractC0628.f1766, C2119.f6262, c13246, 0);
                    int iHashCode4 = Long.hashCode(c13246.f3837);
                    C1253 c1253M23814 = c13246.m2381();
                    InterfaceC2129 interfaceC2129M38614 = AbstractC2120.m3861(c13246, interfaceC2129Mo1366);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC65433 = C1765.f5185;
                    c13246.m2396();
                    if (c13246.f3838) {
                        c13246.m2380(interfaceC65433);
                    } else {
                        c13246.m2390();
                    }
                    AbstractC1367.m2472(c13246, c0660M14602, C1765.f5181);
                    AbstractC1367.m2472(c13246, c1253M23814, C1765.f5182);
                    AbstractC1367.m2493(c13246, Integer.valueOf(iHashCode4), C1765.f5188);
                    AbstractC1367.m2481(c13246, C1765.f5187);
                    AbstractC1367.m2472(c13246, interfaceC2129M38614, C1765.f5183);
                    AbstractC6042.f16523.invoke(C0616.f1719, c13246, 6);
                    c13246.m2377(true);
                    AbstractC6042.m11404(interfaceC0659, c13246, 14 & iIntValue6);
                }
                break;
            case 8:
                C7746 c7746 = (C7746) obj;
                InterfaceC1373 interfaceC13737 = (InterfaceC1373) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((C1324) interfaceC13737).m2360(c7746) ? 4 : 2;
                }
                C1324 c13247 = (C1324) interfaceC13737;
                if (!c13247.m2343(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    c13247.m2339();
                } else {
                    AbstractC0643.m1454(AbstractC1072.m1980(AbstractC0619.m1383(AbstractC0619.m1384(AbstractC0628.m1438(c2125, 0.0f, AbstractC7743.f21010, 1), 1.0f), AbstractC7743.f21003), c7746.f21021, AbstractC1581.f4662), c13247, 0);
                }
                break;
            case 9:
                String str = (String) obj;
                String str2 = (String) obj2;
                C7152 c7152 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str2.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c7152.getClass();
                AbstractC8761.m14450().putInt(str, str2, AbstractC8765.m14455(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵"), c7152)); /* decoded-inline: value */
                break;
            case 10:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                C7152 c71522 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str3.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str4.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c71522.getClass();
                AbstractC8761.m14450().putDouble(str3, str4, AbstractC8765.m14457(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵"), c71522)); /* decoded-inline: value */
                break;
            case 11:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                C7152 c71523 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str5.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str6.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c71523.getClass();
                AbstractC8761.m14450().putString(str5, str6, AbstractC2905.m6339(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵"), c71523)); /* decoded-inline: value */
                break;
            case 12:
                String str7 = (String) obj;
                String str8 = (String) obj2;
                C7152 c71524 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str7.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str8.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c71524.getClass();
                AbstractC8761.m14450().putLong(str7, str8, AbstractC8765.m14463(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵"), c71524)); /* decoded-inline: value */
                break;
            case 13:
                String str9 = (String) obj;
                String str10 = (String) obj2;
                C7152 c71525 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str9.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str10.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c71525.getClass();
                AbstractC8761.m14450().putFloat(str9, str10, AbstractC8765.m14456(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵"), c71525)); /* decoded-inline: value */
                break;
            case 14:
                String str11 = (String) obj;
                String str12 = (String) obj2;
                C7152 c71526 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str11.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str12.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c71526.getClass();
                break;
            case 15:
                String str13 = (String) obj;
                String str14 = (String) obj2;
                C7152 c71527 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str13.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str14.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c71527.getClass();
                QQNTPluginMethod qQNTPluginMethodM14450 = AbstractC8761.m14450();
                Boolean boolM14458 = AbstractC8765.m14458(AbstractC8405.m13972(2377), c71527); /* decoded: m13972(2377)=default_value */
                break;
            case 16:
                String str15 = (String) obj;
                String str16 = (String) obj2;
                C7152 c71528 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str15.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str16.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c71528.getClass();
                break;
            case 17:
                String str17 = (String) obj;
                String str18 = (String) obj2;
                C7152 c71529 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str17.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str18.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c71529.getClass();
                break;
            case 18:
                String str19 = (String) obj;
                String str20 = (String) obj2;
                C7152 c715210 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str19.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str20.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c715210.getClass();
                break;
            case 19:
                String str21 = (String) obj;
                String str22 = (String) obj2;
                C7152 c715211 = (C7152) obj3;
                AbstractC8405.m13972(2432); /* decoded: m13972(2432)=configName */
                str21.getClass();
                AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"); /* decoded-inline: key */
                str22.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"); /* decoded-inline: args */
                c715211.getClass();
                QQNTPluginMethod qQNTPluginMethodM144502 = AbstractC8761.m14450();
                Boolean boolM144582 = AbstractC8765.m14458(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵"), c715211); /* decoded-inline: value */
                qQNTPluginMethodM144502.putBoolean(str21, str22, boolM144582 != null ? boolM144582.booleanValue() : false);
                break;
            case 20:
                String str23 = (String) obj;
                String str24 = (String) obj2;
                String str25 = (String) obj3;
                AbstractC8405.m13972(1361); /* decoded: m13972(1361)=groupUin */
                str23.getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"); /* decoded-inline: userUin */
                str24.getClass();
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"); /* decoded-inline: path */
                str25.getClass();
                AbstractC8761.m14450().sendFile(str23, str24, str25);
                break;
            case 21:
                String str26 = (String) obj;
                String str27 = (String) obj2;
                String str28 = (String) obj3;
                AbstractC8405.m13972(1361); /* decoded: m13972(1361)=groupUin */
                str26.getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"); /* decoded-inline: userUin */
                str27.getClass();
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"); /* decoded-inline: path */
                str28.getClass();
                AbstractC8761.m14450().sendVoice(str26, str27, str28);
                break;
            case 22:
                String str29 = (String) obj;
                String str30 = (String) obj2;
                String str31 = (String) obj3;
                AbstractC8405.m13972(1361); /* decoded: m13972(1361)=groupUin */
                str29.getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"); /* decoded-inline: userUin */
                str30.getClass();
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"); /* decoded-inline: path */
                str31.getClass();
                AbstractC8761.m14450().sendPic(str29, str30, str31);
                break;
            case 23:
                String str32 = (String) obj;
                String str33 = (String) obj2;
                String str34 = (String) obj3;
                AbstractC8405.m13972(1361); /* decoded: m13972(1361)=groupUin */
                str32.getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"); /* decoded-inline: userUin */
                str33.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜"); /* decoded-inline: content */
                str34.getClass();
                AbstractC8761.m14450().sendMsg(str32, str33, str34);
                break;
            case 24:
                String str35 = (String) obj;
                String str36 = (String) obj2;
                String str37 = (String) obj3;
                AbstractC8405.m13972(1361); /* decoded: m13972(1361)=groupUin */
                str35.getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"); /* decoded-inline: userUin */
                str36.getClass();
                AbstractC8405.m13972(2577); /* decoded: m13972(2577)=cardText */
                str37.getClass();
                AbstractC8761.m14450().sendCard(str35, str36, str37);
                break;
            default:
                String str38 = (String) obj;
                String str39 = (String) obj2;
                String str40 = (String) obj3;
                AbstractC8405.m13972(1361); /* decoded: m13972(1361)=groupUin */
                str38.getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"); /* decoded-inline: userUin */
                str39.getClass();
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"); /* decoded-inline: path */
                str40.getClass();
                AbstractC8761.m14450().sendVideo(str38, str39, str40);
                break;
        }
        return c5176;
    }
}
