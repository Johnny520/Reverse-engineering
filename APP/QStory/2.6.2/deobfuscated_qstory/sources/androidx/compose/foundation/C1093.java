package androidx.compose.foundation;

import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.AbstractC0633;
import androidx.compose.foundation.layout.AbstractC0658;
import androidx.compose.foundation.layout.C0634;
import androidx.compose.foundation.layout.C0638;
import androidx.compose.foundation.layout.C0655;
import androidx.compose.foundation.layout.C0660;
import androidx.compose.foundation.layout.InterfaceC0635;
import androidx.compose.foundation.layout.InterfaceC0664;
import androidx.compose.foundation.lazy.AbstractC0759;
import androidx.compose.material3.AbstractC1168;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2115;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.input.nestedscroll.AbstractC1617;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.platform.InterfaceC1873;
import androidx.recyclerview.widget.AbstractC2501;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.window.area.C2558;
import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4206;
import kotlin.C5175;
import kotlin.text.AbstractC5143;
import kotlinx.coroutines.sync.C5379;
import kotlinx.coroutines.sync.C5384;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p273.AbstractC8339;
import p351.AbstractC8871;
import p354.C8887;
import p354.C8888;
import p354.C8890;
import p392.AbstractC9124;
import top.suzhelan.qstory.ui.components.C5962;
import top.yukonga.miuix.kmp.basic.C6020;
import top.yukonga.miuix.kmp.extra.AbstractC6036;
import top.yukonga.miuix.kmp.utils.AbstractC6059;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1093 implements InterfaceC6550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3221;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3222;

    public /* synthetic */ C1093(Object obj, int i) {
        this.f3222 = i;
        this.f3221 = obj;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f3222;
        int i2 = 2;
        C1353 c1353 = C1369.f3973;
        int i3 = 18;
        C2125 c2125 = C2125.f6275;
        char c = 1;
        C5175 c5175 = C5175.f14739;
        Object obj4 = this.f3221;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                C1324 c1324 = (C1324) ((InterfaceC1373) obj2);
                c1324.m2382(-353972293);
                ((InterfaceC1016) obj4).getClass();
                c1324.m2382(1257603829);
                c1324.m2367(false);
                boolean zM2350 = c1324.m2350(C1086.f3212);
                Object objM2335 = c1324.m2335();
                if (zM2350 || objM2335 == c1353) {
                    objM2335 = new C1096();
                    c1324.m2376(objM2335);
                }
                C1096 c1096 = (C1096) objM2335;
                c1324.m2367(false);
                return c1096;
            case 1:
                ((C1067) obj4).invoke((Throwable) obj);
                return c5175;
            case 2:
                C5379 c5379 = (C5379) obj4;
                C5379.f14991.set(c5379, null);
                c5379.m10428(null);
                return c5175;
            case 3:
                ((C5384) obj4).m10434();
                return c5175;
            case 4:
                C6020 c6020 = (C6020) obj4;
                InterfaceC0664 interfaceC0664 = (InterfaceC0664) obj;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                "innerPadding";
                interfaceC0664.getClass();
                "CN(innerPadding)87@3454L378,80@3172L660:MainScreen.kt#ndgvs9";
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1324) interfaceC1373).m2350(interfaceC0664) ? 4 : 2;
                }
                C1324 c13242 = (C1324) interfaceC1373;
                if (c13242.m2333(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC2129 interfaceC2129M1428 = AbstractC0628.m1428(AbstractC1617.m2980(AbstractC6059.m11359(AbstractC0619.f1723), c6020.f16444, null), 16.0f, 0.0f, 2);
                    "CC(remember):MainScreen.kt#9igjgp";
                    Object objM23352 = c13242.m2335();
                    if (objM23352 == c1353) {
                        objM23352 = new C4206(22);
                        c13242.m2376(objM23352);
                    }
                    AbstractC0759.m1559(((iIntValue << 6) & 896) | 805306368, 506, null, null, null, interfaceC0664, null, c13242, null, interfaceC2129M1428, (InterfaceC6557) objM23352, false);
                } else {
                    c13242.m2329();
                }
                return c5175;
            case 5:
                InterfaceC1873 interfaceC1873 = (InterfaceC1873) obj4;
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                "$this$Card";
                ((InterfaceC0635) obj).getClass();
                "C155@5554L36,153@5480L124,159@5687L36,157@5617L120,163@5821L32,161@5750L117,167@5950L25,165@5880L109,171@6072L28,169@6002L112,175@6197L32,173@6127L116:MainScreen.kt#ndgvs9";
                C1324 c13243 = (C1324) interfaceC13732;
                if (c13243.m2333(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strM6668 = "Telegram";
                    "CC(remember):MainScreen.kt#9igjgp";
                    boolean zM2368 = c13243.m2368(interfaceC1873);
                    Object objM23353 = c13243.m2335();
                    if (zM2368 || objM23353 == c1353) {
                        objM23353 = new C5962(interfaceC1873, i);
                        c13243.m2376(objM23353);
                    }
                    AbstractC6036.m11345(strM6668, (InterfaceC6542) objM23353, c13243, 6);
                    String strM66682 = "\u4e0b\u8f7d\u5730\u5740";
                    "CC(remember):MainScreen.kt#9igjgp";
                    boolean zM23682 = c13243.m2368(interfaceC1873);
                    Object objM23354 = c13243.m2335();
                    if (zM23682 || objM23354 == c1353) {
                        objM23354 = new C5962(interfaceC1873, z ? 1 : 0);
                        c13243.m2376(objM23354);
                    }
                    AbstractC6036.m11345(strM66682, (InterfaceC6542) objM23354, c13243, 6);
                    String strM66683 = "LSP\u4ed3\u5e93";
                    "CC(remember):MainScreen.kt#9igjgp";
                    boolean zM23683 = c13243.m2368(interfaceC1873);
                    Object objM23355 = c13243.m2335();
                    if (zM23683 || objM23355 == c1353) {
                        objM23355 = new C5962(interfaceC1873, c == true ? 1 : 0);
                        c13243.m2376(objM23355);
                    }
                    AbstractC6036.m11345(strM66683, (InterfaceC6542) objM23355, c13243, 6);
                    String strM66684 = "\u5386\u53f2\u516c\u544a";
                    "CC(remember):MainScreen.kt#9igjgp";
                    Object objM23356 = c13243.m2335();
                    if (objM23356 == c1353) {
                        objM23356 = new C2558(i3);
                        c13243.m2376(objM23356);
                    }
                    AbstractC6036.m11345(strM66684, (InterfaceC6542) objM23356, c13243, 805306374);
                    String strM66685 = "\u66f4\u65b0\u65e5\u5fd7";
                    "CC(remember):MainScreen.kt#9igjgp";
                    Object objM23357 = c13243.m2335();
                    if (objM23357 == c1353) {
                        objM23357 = new C2558(19);
                        c13243.m2376(objM23357);
                    }
                    AbstractC6036.m11345(strM66685, (InterfaceC6542) objM23357, c13243, 805306374);
                    String strM66686 = "\u4f7f\u7528\u6559\u7a0b";
                    "CC(remember):MainScreen.kt#9igjgp";
                    boolean zM23684 = c13243.m2368(interfaceC1873);
                    Object objM23358 = c13243.m2335();
                    if (zM23684 || objM23358 == c1353) {
                        objM23358 = new C5962(interfaceC1873, i2);
                        c13243.m2376(objM23358);
                    }
                    AbstractC6036.m11345(strM66686, (InterfaceC6542) objM23358, c13243, 6);
                } else {
                    c13243.m2329();
                }
                return c5175;
            case 6:
                C8888 c8888 = (C8888) obj4;
                InterfaceC1373 interfaceC13733 = (InterfaceC1373) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                "$this$SettingCardContainer";
                ((C0634) obj).getClass();
                "C203@7779L29,201@7712L215:SettingListContent.kt#ndgvs9";
                C1324 c13244 = (C1324) interfaceC13733;
                if (c13244.m2333(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String groupName = c8888.f25048.getGroupName();
                    "getGroupName(...)";
                    groupName.getClass();
                    AbstractC1168.m2015(groupName, AbstractC0628.m1427(c2125, 20.0f, 14.0f), AbstractC8871.m14518(c13244), AbstractC9124.m14670(14), null, 0L, null, 0L, 0, false, 0, 0, null, c13244, 24624, 262120);
                } else {
                    c13244.m2329();
                }
                return c5175;
            case 7:
                C8890 c8890 = (C8890) obj4;
                InterfaceC1373 interfaceC13734 = (InterfaceC1373) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                "$this$SettingCardContainer";
                ((C0634) obj).getClass();
                "C227@8363L597:SettingListContent.kt#ndgvs9";
                C1324 c13245 = (C1324) interfaceC13734;
                if (c13245.m2333(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    InterfaceC2129 interfaceC2129M1427 = AbstractC0628.m1427(AbstractC0619.m1374(c2125, 1.0f), 20.0f, 16.0f);
                    C2115 c2115 = C2119.f6260;
                    "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                    C0660 c0660M1450 = AbstractC0658.m1450(AbstractC0628.f1765, c2115, c13245, 48);
                    "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                    int iHashCode = Long.hashCode(c13245.f3836);
                    C1253 c1253M2371 = c13245.m2371();
                    InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c13245, interfaceC2129M1427);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC6542 = C1765.f5184;
                    "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                    c13245.m2386();
                    if (c13245.f3837) {
                        c13245.m2370(interfaceC6542);
                    } else {
                        c13245.m2380();
                    }
                    AbstractC1367.m2464(c13245, c0660M1450, C1765.f5180);
                    AbstractC1367.m2464(c13245, c1253M2371, C1765.f5181);
                    AbstractC1367.m2464(c13245, Integer.valueOf(iHashCode), C1765.f5187);
                    AbstractC1367.m2472(c13245, C1765.f5186);
                    AbstractC1367.m2464(c13245, interfaceC2129M3851, C1765.f5182);
                    "C101@5233L9:Row.kt#2w3rfo";
                    "C235@8653L29,233@8579L199,241@8873L29,239@8791L159:SettingListContent.kt#ndgvs9";
                    String itemName = c8890.f25052.getItemName();
                    "getItemName(...)";
                    itemName.getClass();
                    AbstractC1168.m2015(itemName, new C0655(1.0f, true), AbstractC8871.m14518(c13245), AbstractC9124.m14670(17), null, 0L, null, 0L, 0, false, 0, 0, null, c13245, 24576, 262120);
                    AbstractC1168.m2015(">", null, AbstractC8871.m14518(c13245), AbstractC9124.m14670(18), null, 0L, null, 0L, 0, false, 0, 0, null, c13245, 24582, 262122);
                    c13245.m2367(true);
                } else {
                    c13245.m2329();
                }
                return c5175;
            case 8:
                OtherViewItemInfo otherViewItemInfo = ((C8887) obj4).f25046;
                InterfaceC1373 interfaceC13735 = (InterfaceC1373) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                "$this$SettingCardContainer";
                ((C0634) obj).getClass();
                "C368@12941L659:SettingListContent.kt#ndgvs9";
                C1324 c13246 = (C1324) interfaceC13735;
                if (c13246.m2333(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    InterfaceC2129 interfaceC2129M14272 = AbstractC0628.m1427(AbstractC0619.m1374(c2125, 1.0f), 20.0f, 16.0f);
                    "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo";
                    C0638 c0638M1439 = AbstractC0633.m1439(AbstractC0628.f1763, C2119.f6258, c13246, 0);
                    "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                    int iHashCode2 = Long.hashCode(c13246.f3836);
                    C1253 c1253M23712 = c13246.m2371();
                    InterfaceC2129 interfaceC2129M38512 = AbstractC2120.m3851(c13246, interfaceC2129M14272);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC65422 = C1765.f5184;
                    "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                    c13246.m2386();
                    if (c13246.f3837) {
                        c13246.m2370(interfaceC65422);
                    } else {
                        c13246.m2380();
                    }
                    AbstractC1367.m2464(c13246, c0638M1439, C1765.f5180);
                    AbstractC1367.m2464(c13246, c1253M23712, C1765.f5181);
                    AbstractC1367.m2464(c13246, Integer.valueOf(iHashCode2), C1765.f5187);
                    AbstractC1367.m2472(c13246, C1765.f5186);
                    AbstractC1367.m2464(c13246, interfaceC2129M38512, C1765.f5182);
                    "C89@4557L9:Column.kt#2w3rfo";
                    "C375@13174L29,373@13100L151:SettingListContent.kt#ndgvs9";
                    String leftText = otherViewItemInfo.getLeftText();
                    "getLeftText(...)";
                    leftText.getClass();
                    AbstractC1168.m2015(leftText, null, AbstractC8871.m14518(c13246), AbstractC9124.m14670(17), null, 0L, null, 0L, 0, false, 0, 0, null, c13246, 24576, 262122);
                    String tips = otherViewItemInfo.getTips();
                    if (tips == null || AbstractC5143.m10164(tips)) {
                        c13246.m2382(687715121);
                        c13246.m2367(false);
                    } else {
                        c13246.m2382(687490774);
                        "383@13428L31,381@13357L219";
                        AbstractC1168.m2015(tips, AbstractC0628.m1425(c2125, 0.0f, 2.0f, 0.0f, 13), AbstractC8871.m14517(c13246), AbstractC9124.m14670(13), null, 0L, null, 0L, 0, false, 0, 0, null, c13246, 24624, 262120);
                        c13246.m2367(false);
                    }
                    c13246.m2367(true);
                } else {
                    c13246.m2329();
                }
                return c5175;
            default:
                AbstractC8339 abstractC8339 = (AbstractC8339) obj4;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) obj;
                AbstractC2501 abstractC2501 = (AbstractC2501) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                gridLayoutManager.getClass();
                abstractC2501.getClass();
                int iMo4782 = abstractC8339.mo4782(iIntValue6);
                int iMo4950 = (abstractC8339.f23003.get(iMo4782) == null && abstractC8339.f23002.get(iMo4782) == null) ? abstractC2501.mo4950(iIntValue6) : gridLayoutManager.f7141;
                return Integer.valueOf(iMo4950);
        }
    }

    public /* synthetic */ C1093(Object obj, int i, Object obj2) {
        this.f3222 = i;
        this.f3221 = obj;
    }
}
