package top.suzhelan.qstory.ui.activity;

import android.content.Context;
import androidx.compose.animation.AbstractC0401;
import androidx.compose.animation.C0399;
import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.AbstractC0633;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.layout.C0596;
import androidx.compose.foundation.layout.C0638;
import androidx.compose.foundation.layout.C0655;
import androidx.compose.foundation.lazy.C0763;
import androidx.compose.foundation.text.contextmenu.provider.C0828;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.C1704;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C5175;
import kotlin.reflect.InterfaceC5109;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.BaseItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p052.InterfaceC6542;
import p052.InterfaceC6551;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p253.AbstractC8189;
import p316.C8675;
import p354.C8885;
import p354.C8887;
import p354.C8888;
import p354.C8891;
import top.suzhelan.qstory.ui.components.AbstractC5963;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5955 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ SettingActivity f16150;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8891 f16151;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16152 = 1;

    public /* synthetic */ C5955(SettingActivity settingActivity, C8891 c8891, int i) {
        this.f16150 = settingActivity;
        this.f16151 = c8891;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        ?? r10;
        Object obj3;
        String strM6668;
        InterfaceC1395 interfaceC1395;
        Object obj4;
        C1324 c1324;
        int i = this.f16152;
        C5175 c5175 = C5175.f14739;
        final C8891 c8891 = this.f16151;
        final SettingActivity settingActivity = this.f16150;
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                "C114@4310L16,115@4349L56,117@4484L34,118@4544L45,120@4643L43,120@4595L91,124@4692L3781:SettingActivity.kt#itusog";
                C1324 c13242 = (C1324) interfaceC1373;
                if (!c13242.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c13242.m2329();
                    return c5175;
                }
                final InterfaceC1395 interfaceC1395M2484 = AbstractC1367.m2484(c8891.f25054, c13242);
                "CC(remember):SettingActivity.kt#9igjgp";
                boolean zM2350 = c13242.m2350(settingActivity);
                Object objM2335 = c13242.m2335();
                C1353 c1353 = C1369.f3973;
                Object obj5 = objM2335;
                if (zM2350 || objM2335 == c1353) {
                    "context";
                    settingActivity.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : ItemUiInfoManager.rootContainer) {
                        if (obj6 instanceof ItemUiInfoGroupWrapper) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("root-group-");
                            sb.append(arrayList.size());
                            sb.append(SignatureVisitor.SUPER);
                            ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = (ItemUiInfoGroupWrapper) obj6;
                            sb.append(itemUiInfoGroupWrapper.getGroupName());
                            arrayList.add(new C8888(sb.toString(), itemUiInfoGroupWrapper));
                            List<BaseItemUiInfo> directoryUIInfoList = itemUiInfoGroupWrapper.getDirectoryUIInfoList();
                            "getDirectoryUIInfoList(...)";
                            directoryUIInfoList.getClass();
                            for (BaseItemUiInfo baseItemUiInfo : directoryUIInfoList) {
                                baseItemUiInfo.getClass();
                                C8675.m14352(arrayList, baseItemUiInfo, "root");
                            }
                        } else if (obj6 instanceof BaseItemUiInfo) {
                            C8675.m14352(arrayList, (BaseItemUiInfo) obj6, "root");
                        }
                    }
                    List<Class<? extends OtherViewItemInfo>> list = OtherViewItemInfo.OTHER_VIEW_ITEM_INFO_LIST;
                    "OTHER_VIEW_ITEM_INFO_LIST";
                    list.getClass();
                    int i2 = 0;
                    for (Object obj7 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC8189.m13662();
                            throw null;
                        }
                        Class cls = (Class) obj7;
                        try {
                            OtherViewItemInfo otherViewItemInfo = (OtherViewItemInfo) cls.getConstructor(Context.class).newInstance(settingActivity);
                            String str = "root-other-" + i2 + SignatureVisitor.SUPER + cls.getSimpleName();
                            otherViewItemInfo.getClass();
                            arrayList.add(new C8887(str, otherViewItemInfo));
                        } catch (Exception e) {
                            AbstractC6157.m11575(e);
                        }
                        i2 = i3;
                    }
                    c13242.m2376(arrayList);
                    obj5 = arrayList;
                }
                final List list2 = (List) obj5;
                DirectoryUiInfo directoryUiInfo = ((C8885) interfaceC1395M2484.getValue()).f25041;
                "CC(remember):SettingActivity.kt#9igjgp";
                Object objM23352 = c13242.m2335();
                Object obj8 = objM23352;
                if (objM23352 == c1353) {
                    InterfaceC1395 interfaceC1395M2465 = AbstractC1367.m2465(Boolean.FALSE);
                    c13242.m2376(interfaceC1395M2465);
                    obj8 = interfaceC1395M2465;
                }
                InterfaceC1395 interfaceC13952 = (InterfaceC1395) obj8;
                "CC(remember):SettingActivity.kt#9igjgp";
                Object objM23353 = c13242.m2335();
                Object obj9 = objM23353;
                if (objM23353 == c1353) {
                    HashMap map = new HashMap();
                    c13242.m2376(map);
                    obj9 = map;
                }
                final HashMap map2 = (HashMap) obj9;
                boolean z = directoryUiInfo != null;
                "CC(remember):SettingActivity.kt#9igjgp";
                boolean zM2368 = c13242.m2368(c8891);
                Object objM23354 = c13242.m2335();
                if (zM2368 || objM23354 == c1353) {
                    r10 = 0;
                    final boolean z2 = false ? 1 : 0;
                    InterfaceC6542 interfaceC6542 = new InterfaceC6542() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世哲兰苏
                        @Override // p052.InterfaceC6542
                        public final Object invoke() {
                            int i4 = z2;
                            C5175 c51752 = C5175.f14739;
                            C8891 c88912 = c8891;
                            switch (i4) {
                                case 0:
                                    c88912.m14526();
                                    break;
                                default:
                                    c88912.m14525("");
                                    break;
                            }
                            return c51752;
                        }
                    };
                    c13242.m2376(interfaceC6542);
                    obj3 = interfaceC6542;
                } else {
                    r10 = 0;
                    obj3 = objM23354;
                }
                AbstractC0455.m1153(z, (InterfaceC6542) obj3, c13242, r10);
                C0596 c0596 = AbstractC0619.f1722;
                "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo";
                InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, r10);
                "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                int iHashCode = Long.hashCode(c13242.f3836);
                C1253 c1253M2371 = c13242.m2371();
                InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c13242, c0596);
                InterfaceC1784.f5221.getClass();
                InterfaceC6542 interfaceC65422 = C1765.f5184;
                "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                c13242.m2386();
                if (c13242.f3837) {
                    c13242.m2370(interfaceC65422);
                } else {
                    c13242.m2380();
                }
                InterfaceC6553 interfaceC6553 = C1765.f5180;
                AbstractC1367.m2464(c13242, interfaceC1658M1441, interfaceC6553);
                InterfaceC6553 interfaceC65532 = C1765.f5181;
                AbstractC1367.m2464(c13242, c1253M2371, interfaceC65532);
                Integer numValueOf = Integer.valueOf(iHashCode);
                InterfaceC6553 interfaceC65533 = C1765.f5187;
                AbstractC1367.m2464(c13242, numValueOf, interfaceC65533);
                InterfaceC6557 interfaceC6557 = C1765.f5186;
                AbstractC1367.m2472(c13242, interfaceC6557);
                InterfaceC6553 interfaceC65534 = C1765.f5182;
                AbstractC1367.m2464(c13242, interfaceC2129M3851, interfaceC65534);
                "C72@3469L9:Box.kt#2w3rfo";
                "C126@4770L43,125@4741L214,132@4965L2692:SettingActivity.kt#itusog";
                AbstractC1072.m1973(AbstractC3055.m6638(c13242, R.drawable.bg_setting), c0596, null, C1704.f4975, 0.0f, null, c13242, 25016, 104);
                "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo";
                C0638 c0638M1439 = AbstractC0633.m1439(AbstractC0628.f1763, C2119.f6258, c13242, 0);
                "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh";
                int iHashCode2 = Long.hashCode(c13242.f3836);
                C1253 c1253M23712 = c13242.m2371();
                InterfaceC2129 interfaceC2129M38512 = AbstractC2120.m3851(c13242, c0596);
                "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp";
                c13242.m2386();
                if (c13242.f3837) {
                    c13242.m2370(interfaceC65422);
                } else {
                    c13242.m2380();
                }
                AbstractC1367.m2464(c13242, c0638M1439, interfaceC6553);
                AbstractC1367.m2464(c13242, c1253M23712, interfaceC65532);
                AbstractC1367.m2464(c13242, Integer.valueOf(iHashCode2), interfaceC65533);
                AbstractC1367.m2472(c13242, interfaceC6557);
                AbstractC1367.m2464(c13242, interfaceC2129M38512, interfaceC65534);
                "C89@4557L9:Column.kt#2w3rfo";
                "C136@5156L139,141@5329L30,142@5393L25,133@5021L411,149@5643L985,166@6643L1004,145@5446L2201:SettingActivity.kt#itusog";
                DirectoryUiInfo directoryUiInfo2 = ((C8885) interfaceC1395M2484.getValue()).f25041;
                if (directoryUiInfo2 == null || (strM6668 = directoryUiInfo2.getItemName()) == null) {
                    strM6668 = "QStory";
                }
                String str2 = strM6668;
                String str3 = ((C8885) interfaceC1395M2484.getValue()).f25042;
                "CC(remember):SettingActivity.kt#9igjgp";
                boolean zM23682 = c13242.m2368(c8891) | c13242.m2368(settingActivity);
                Object objM23355 = c13242.m2335();
                Object obj10 = objM23355;
                if (zM23682 || objM23355 == c1353) {
                    InterfaceC6542 interfaceC65423 = new InterfaceC6542() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世兰苏哲
                        @Override // p052.InterfaceC6542
                        public final Object invoke() {
                            if (!c8891.m14526()) {
                                settingActivity.finish();
                            }
                            return C5175.f14739;
                        }
                    };
                    c13242.m2376(interfaceC65423);
                    obj10 = interfaceC65423;
                }
                InterfaceC6542 interfaceC65424 = (InterfaceC6542) obj10;
                "CC(remember):SettingActivity.kt#9igjgp";
                boolean zM23683 = c13242.m2368(c8891);
                Object objM23356 = c13242.m2335();
                Object obj11 = objM23356;
                if (zM23683 || objM23356 == c1353) {
                    SettingActivityKt$SettingRoute$1$2$1$2$1 settingActivityKt$SettingRoute$1$2$1$2$1 = new SettingActivityKt$SettingRoute$1$2$1$2$1(c8891);
                    c13242.m2376(settingActivityKt$SettingRoute$1$2$1$2$1);
                    obj11 = settingActivityKt$SettingRoute$1$2$1$2$1;
                }
                InterfaceC6542 interfaceC65425 = (InterfaceC6542) ((InterfaceC5109) obj11);
                "CC(remember):SettingActivity.kt#9igjgp";
                Object objM23357 = c13242.m2335();
                if (objM23357 == c1353) {
                    interfaceC1395 = interfaceC13952;
                    C0763 c0763 = new C0763(interfaceC1395, 2);
                    c13242.m2376(c0763);
                    obj4 = c0763;
                } else {
                    interfaceC1395 = interfaceC13952;
                    obj4 = objM23357;
                }
                AbstractC5963.m11295(str2, str3, interfaceC65424, interfaceC65425, (InterfaceC6542) obj4, c13242, 24576);
                int i4 = 1;
                C0655 c0655 = new C0655(1.0f, true);
                "CC(remember):SettingActivity.kt#9igjgp";
                boolean zM23502 = c13242.m2350(interfaceC1395M2484);
                Object objM23358 = c13242.m2335();
                Object obj12 = objM23358;
                if (zM23502 || objM23358 == c1353) {
                    C0828 c0828 = new C0828(interfaceC1395M2484, i4);
                    c13242.m2376(c0828);
                    obj12 = c0828;
                }
                AbstractC0401.m1112(directoryUiInfo, c0655, (InterfaceC6557) obj12, null, "setting_page_transition", null, AbstractC1254.m2179(1740757747, new InterfaceC6551() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世兰哲苏
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.飘花落叶言子世苏楪哲兰, androidx.compose.runtime.飘花落叶言子楪苏哲世兰] */
                    /* JADX WARN: Type inference failed for: r7v11 */
                    /* JADX WARN: Type inference failed for: r7v3 */
                    /* JADX WARN: Type inference failed for: r7v9 */
                    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
                    @Override // p052.InterfaceC6551
                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                        String strM66682;
                        DirectoryUiInfo directoryUiInfo3 = (DirectoryUiInfo) obj14;
                        "$this$AnimatedContent";
                        ((C0399) obj13).getClass();
                        "CN(directoryUiInfo)168@6721L170,171@6922L115,180@7323L30,181@7394L27,182@7462L27,183@7529L26,184@7592L23,175@7055L578:SettingActivity.kt#itusog";
                        InterfaceC1395 interfaceC13953 = interfaceC1395M2484;
                        int i5 = ((C8885) interfaceC13953.getValue()).f25039;
                        "CC(remember):SettingActivity.kt#9igjgp";
                        ?? r3 = (C1324) ((InterfaceC1373) obj15);
                        boolean zM23503 = r3.m2350(directoryUiInfo3);
                        ?? arrayList2 = list2;
                        boolean zM2352 = r3.m2352(i5) | zM23503 | r3.m2350(arrayList2);
                        Object objM23359 = r3.m2335();
                        C1353 c13532 = C1369.f3973;
                        ?? r7 = objM23359;
                        if (zM2352 || objM23359 == c13532) {
                            if (directoryUiInfo3 != null) {
                                "directoryUiInfo";
                                arrayList2 = new ArrayList();
                                String itemName = directoryUiInfo3.getItemName();
                                List<ItemUiInfoGroupWrapper> list3 = directoryUiInfo3.groupWrapperList;
                                "groupWrapperList";
                                list3.getClass();
                                for (ItemUiInfoGroupWrapper itemUiInfoGroupWrapper2 : list3) {
                                    arrayList2.add(new C8888("directory-group-" + arrayList2.size() + SignatureVisitor.SUPER + itemName + SignatureVisitor.SUPER + itemUiInfoGroupWrapper2.getGroupName(), itemUiInfoGroupWrapper2));
                                    List<BaseItemUiInfo> directoryUIInfoList2 = itemUiInfoGroupWrapper2.getDirectoryUIInfoList();
                                    "getDirectoryUIInfoList(...)";
                                    directoryUIInfoList2.getClass();
                                    for (BaseItemUiInfo baseItemUiInfo2 : directoryUIInfoList2) {
                                        baseItemUiInfo2.getClass();
                                        C8675.m14352(arrayList2, baseItemUiInfo2, AbstractC6136.m11557(-3937343799051945383L, new StringBuilder(), itemName));
                                    }
                                }
                                List<BaseItemUiInfo> list4 = directoryUiInfo3.uiInfoList;
                                "uiInfoList";
                                list4.getClass();
                                for (BaseItemUiInfo baseItemUiInfo3 : list4) {
                                    baseItemUiInfo3.getClass();
                                    C8675.m14352(arrayList2, baseItemUiInfo3, AbstractC6136.m11557(-3937343799051945383L, new StringBuilder(), itemName));
                                }
                            }
                            r3.m2376(arrayList2);
                            r7 = arrayList2;
                        }
                        List list5 = (List) r7;
                        "CC(remember):SettingActivity.kt#9igjgp";
                        boolean zM23504 = r3.m2350(directoryUiInfo3);
                        Object objM233510 = r3.m2335();
                        if (zM23504 || objM233510 == c13532) {
                            if (directoryUiInfo3 == null || (strM66682 = directoryUiInfo3.getItemName()) == null) {
                                strM66682 = "QStory";
                            }
                            objM233510 = strM66682;
                            r3.m2376(objM233510);
                        }
                        String str4 = (String) objM233510;
                        int i6 = ((C8885) interfaceC13953.getValue()).f25040;
                        "CC(remember):SettingActivity.kt#9igjgp";
                        C8891 c88912 = c8891;
                        boolean zM23684 = r3.m2368(c88912);
                        Object objM233511 = r3.m2335();
                        if (zM23684 || objM233511 == c13532) {
                            objM233511 = new SettingActivityKt$SettingRoute$1$2$1$5$1$1(c88912);
                            r3.m2376(objM233511);
                        }
                        InterfaceC6542 interfaceC65426 = (InterfaceC6542) ((InterfaceC5109) objM233511);
                        "CC(remember):SettingActivity.kt#9igjgp";
                        boolean zM23685 = r3.m2368(c88912);
                        Object objM233512 = r3.m2335();
                        if (zM23685 || objM233512 == c13532) {
                            objM233512 = new SettingActivityKt$SettingRoute$1$2$1$5$2$1(c88912);
                            r3.m2376(objM233512);
                        }
                        InterfaceC6557 interfaceC65572 = (InterfaceC6557) ((InterfaceC5109) objM233512);
                        "CC(remember):SettingActivity.kt#9igjgp";
                        boolean zM23686 = r3.m2368(c88912);
                        Object objM233513 = r3.m2335();
                        if (zM23686 || objM233513 == c13532) {
                            objM233513 = new SettingActivityKt$SettingRoute$1$2$1$5$3$1(c88912);
                            r3.m2376(objM233513);
                        }
                        InterfaceC6553 interfaceC65535 = (InterfaceC6553) ((InterfaceC5109) objM233513);
                        "CC(remember):SettingActivity.kt#9igjgp";
                        boolean zM23687 = r3.m2368(c88912);
                        Object objM233514 = r3.m2335();
                        if (zM23687 || objM233514 == c13532) {
                            objM233514 = new SettingActivityKt$SettingRoute$1$2$1$5$4$1(c88912);
                            r3.m2376(objM233514);
                        }
                        InterfaceC6553 interfaceC65536 = (InterfaceC6553) ((InterfaceC5109) objM233514);
                        "CC(remember):SettingActivity.kt#9igjgp";
                        boolean zM23688 = r3.m2368(c88912);
                        Object objM233515 = r3.m2335();
                        if (zM23688 || objM233515 == c13532) {
                            objM233515 = new SettingActivityKt$SettingRoute$1$2$1$5$5$1(c88912);
                            r3.m2376(objM233515);
                        }
                        AbstractC5963.m11291(str4, map2, list5, i6, interfaceC65426, interfaceC65572, interfaceC65535, interfaceC65536, (InterfaceC6553) ((InterfaceC5109) objM233515), r3, 0);
                        return C5175.f14739;
                    }
                }, c13242), c13242, 1597440, 40);
                C1324 c13243 = c13242;
                c13243.m2367(true);
                if (((C8885) interfaceC1395M2484.getValue()).f25038) {
                    c13243.m2382(-1598898790);
                    "194@7914L34,195@7984L33,196@8052L40,197@8130L34,198@8199L33,199@8269L33,190@7711L605";
                    String str4 = ((C8885) interfaceC1395M2484.getValue()).f25044;
                    List list3 = ((C8885) interfaceC1395M2484.getValue()).f25043;
                    List list4 = ((C8885) interfaceC1395M2484.getValue()).f25045;
                    "CC(remember):SettingActivity.kt#9igjgp";
                    boolean zM23684 = c13243.m2368(c8891);
                    Object objM23359 = c13243.m2335();
                    Object obj13 = objM23359;
                    if (zM23684 || objM23359 == c1353) {
                        SettingActivityKt$SettingRoute$1$2$2$1 settingActivityKt$SettingRoute$1$2$2$1 = new SettingActivityKt$SettingRoute$1$2$2$1(c8891);
                        c13243.m2376(settingActivityKt$SettingRoute$1$2$2$1);
                        obj13 = settingActivityKt$SettingRoute$1$2$2$1;
                    }
                    InterfaceC6542 interfaceC65426 = (InterfaceC6542) ((InterfaceC5109) obj13);
                    "CC(remember):SettingActivity.kt#9igjgp";
                    boolean zM23685 = c13243.m2368(c8891);
                    Object objM233510 = c13243.m2335();
                    Object obj14 = objM233510;
                    if (zM23685 || objM233510 == c1353) {
                        SettingActivityKt$SettingRoute$1$2$3$1 settingActivityKt$SettingRoute$1$2$3$1 = new SettingActivityKt$SettingRoute$1$2$3$1(c8891);
                        c13243.m2376(settingActivityKt$SettingRoute$1$2$3$1);
                        obj14 = settingActivityKt$SettingRoute$1$2$3$1;
                    }
                    InterfaceC6557 interfaceC65572 = (InterfaceC6557) ((InterfaceC5109) obj14);
                    "CC(remember):SettingActivity.kt#9igjgp";
                    boolean zM23686 = c13243.m2368(c8891);
                    Object objM233511 = c13243.m2335();
                    Object obj15 = objM233511;
                    if (zM23686 || objM233511 == c1353) {
                        final int i5 = 1;
                        InterfaceC6542 interfaceC65427 = new InterfaceC6542() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世哲兰苏
                            @Override // p052.InterfaceC6542
                            public final Object invoke() {
                                int i42 = i5;
                                C5175 c51752 = C5175.f14739;
                                C8891 c88912 = c8891;
                                switch (i42) {
                                    case 0:
                                        c88912.m14526();
                                        break;
                                    default:
                                        c88912.m14525("");
                                        break;
                                }
                                return c51752;
                            }
                        };
                        c13243.m2376(interfaceC65427);
                        obj15 = interfaceC65427;
                    }
                    InterfaceC6542 interfaceC65428 = (InterfaceC6542) obj15;
                    "CC(remember):SettingActivity.kt#9igjgp";
                    boolean zM23687 = c13243.m2368(c8891);
                    Object objM233512 = c13243.m2335();
                    Object obj16 = objM233512;
                    if (zM23687 || objM233512 == c1353) {
                        SettingActivityKt$SettingRoute$1$2$5$1 settingActivityKt$SettingRoute$1$2$5$1 = new SettingActivityKt$SettingRoute$1$2$5$1(c8891);
                        c13243.m2376(settingActivityKt$SettingRoute$1$2$5$1);
                        obj16 = settingActivityKt$SettingRoute$1$2$5$1;
                    }
                    InterfaceC6557 interfaceC65573 = (InterfaceC6557) ((InterfaceC5109) obj16);
                    "CC(remember):SettingActivity.kt#9igjgp";
                    boolean zM23688 = c13243.m2368(c8891);
                    Object objM233513 = c13243.m2335();
                    Object obj17 = objM233513;
                    if (zM23688 || objM233513 == c1353) {
                        SettingActivityKt$SettingRoute$1$2$6$1 settingActivityKt$SettingRoute$1$2$6$1 = new SettingActivityKt$SettingRoute$1$2$6$1(c8891);
                        c13243.m2376(settingActivityKt$SettingRoute$1$2$6$1);
                        obj17 = settingActivityKt$SettingRoute$1$2$6$1;
                    }
                    InterfaceC6542 interfaceC65429 = (InterfaceC6542) ((InterfaceC5109) obj17);
                    "CC(remember):SettingActivity.kt#9igjgp";
                    boolean zM23689 = c13243.m2368(c8891);
                    Object objM233514 = c13243.m2335();
                    Object obj18 = objM233514;
                    if (zM23689 || objM233514 == c1353) {
                        SettingActivityKt$SettingRoute$1$2$7$1 settingActivityKt$SettingRoute$1$2$7$1 = new SettingActivityKt$SettingRoute$1$2$7$1(c8891);
                        c13243.m2376(settingActivityKt$SettingRoute$1$2$7$1);
                        obj18 = settingActivityKt$SettingRoute$1$2$7$1;
                    }
                    AbstractC5963.m11294(str4, list3, list4, interfaceC65426, interfaceC65572, interfaceC65428, interfaceC65573, interfaceC65429, (InterfaceC6557) ((InterfaceC5109) obj18), c13243, 0);
                    C1324 c13244 = c13243;
                    c13244.m2367(false);
                    c1324 = c13244;
                } else {
                    c13243.m2382(-1598294321);
                    c13243.m2367(false);
                    c1324 = c13243;
                }
                if (((Boolean) interfaceC1395.getValue()).booleanValue()) {
                    c1324.m2382(-1598261120);
                    "205@8417L26,204@8370L87";
                    "CC(remember):SettingActivity.kt#9igjgp";
                    Object objM233515 = c1324.m2335();
                    Object obj19 = objM233515;
                    if (objM233515 == c1353) {
                        C0763 c07632 = new C0763(interfaceC1395, 3);
                        c1324.m2376(c07632);
                        obj19 = c07632;
                    }
                    AbstractC5963.m11293((InterfaceC6542) obj19, c1324, 6);
                    c1324.m2367(false);
                } else {
                    c1324.m2382(-1598154449);
                    c1324.m2367(false);
                }
                c1324.m2367(true);
                return c5175;
            default:
                ((Integer) obj2).getClass();
                AbstractC5957.m11277(settingActivity, c8891, interfaceC1373, AbstractC1367.m2460(1));
                return c5175;
        }
    }

    public /* synthetic */ C5955(C8891 c8891, SettingActivity settingActivity) {
        this.f16151 = c8891;
        this.f16150 = settingActivity;
    }
}
