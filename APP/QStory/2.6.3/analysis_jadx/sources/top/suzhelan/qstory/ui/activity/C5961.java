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
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3066;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C5176;
import kotlin.reflect.InterfaceC5110;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.BaseItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p010.AbstractC6188;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p052.InterfaceC6552;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p251.AbstractC8175;
import p287.AbstractC8405;
import p350.C8853;
import p350.C8855;
import p350.C8856;
import p350.C8859;
import top.suzhelan.qstory.ui.components.AbstractC5969;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5961 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ SettingActivity f16159;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8859 f16160;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16161 = 1;

    public /* synthetic */ C5961(SettingActivity settingActivity, C8859 c8859, int i) {
        this.f16159 = settingActivity;
        this.f16160 = c8859;
    }

    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        Object obj3;
        ?? r9;
        Object obj4;
        String strM13973;
        InterfaceC1395 interfaceC1395;
        Object obj5;
        C1324 c1324;
        int i3 = this.f16161;
        C5176 c5176 = C5176.f14739;
        final C8859 c8859 = this.f16160;
        final SettingActivity settingActivity = this.f16159;
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
        switch (i3) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                AbstractC8405.m13972(2906);
                C1324 c13242 = (C1324) interfaceC1373;
                if (!c13242.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c13242.m2339();
                    return c5176;
                }
                final InterfaceC1395 interfaceC1395M2494 = AbstractC1367.m2494(c8859.f24978, c13242);
                int i4 = 2905;
                AbstractC8405.m13972(2905);
                boolean zM2360 = c13242.m2360(settingActivity);
                Object objM2345 = c13242.m2345();
                C1353 c1353 = C1369.f3974;
                if (zM2360 || objM2345 == c1353) {
                    AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                    settingActivity.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : ItemUiInfoManager.rootContainer) {
                        if (obj6 instanceof ItemUiInfoGroupWrapper) {
                            i2 = i4;
                            StringBuilder sb = new StringBuilder();
                            sb.append(AbstractC8405.m13972(3223));
                            sb.append(arrayList.size());
                            sb.append(SignatureVisitor.SUPER);
                            ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = (ItemUiInfoGroupWrapper) obj6;
                            sb.append(itemUiInfoGroupWrapper.getGroupName());
                            arrayList.add(new C8856(sb.toString(), itemUiInfoGroupWrapper));
                            List<BaseItemUiInfo> directoryUIInfoList = itemUiInfoGroupWrapper.getDirectoryUIInfoList();
                            AbstractC8405.m13972(3224);
                            directoryUIInfoList.getClass();
                            for (BaseItemUiInfo baseItemUiInfo : directoryUIInfoList) {
                                baseItemUiInfo.getClass();
                                AbstractC8175.m13646(arrayList, baseItemUiInfo, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵"));
                            }
                        } else {
                            i2 = i4;
                            if (obj6 instanceof BaseItemUiInfo) {
                                AbstractC8175.m13646(arrayList, (BaseItemUiInfo) obj6, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵"));
                            }
                        }
                        i4 = i2;
                    }
                    i = i4;
                    List<Class<? extends OtherViewItemInfo>> list = OtherViewItemInfo.OTHER_VIEW_ITEM_INFO_LIST;
                    AbstractC8405.m13972(3225);
                    list.getClass();
                    int i5 = 0;
                    for (Object obj7 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            AbstractC6347.m11920();
                            throw null;
                        }
                        Class cls = (Class) obj7;
                        try {
                            OtherViewItemInfo otherViewItemInfo = (OtherViewItemInfo) cls.getConstructor(Context.class).newInstance(settingActivity);
                            String str = AbstractC8405.m13972(3226) + i5 + SignatureVisitor.SUPER + cls.getSimpleName();
                            otherViewItemInfo.getClass();
                            arrayList.add(new C8855(str, otherViewItemInfo));
                        } catch (Exception e) {
                            AbstractC6188.m11606(e);
                        }
                        i5 = i6;
                    }
                    c13242.m2386(arrayList);
                    obj3 = arrayList;
                } else {
                    i = 2905;
                    obj3 = objM2345;
                }
                final List list2 = (List) obj3;
                DirectoryUiInfo directoryUiInfo = ((C8853) interfaceC1395M2494.getValue()).f24965;
                AbstractC8405.m13972(i);
                Object objM23452 = c13242.m2345();
                Object obj8 = objM23452;
                if (objM23452 == c1353) {
                    InterfaceC1395 interfaceC1395M2474 = AbstractC1367.m2474(Boolean.FALSE);
                    c13242.m2386(interfaceC1395M2474);
                    obj8 = interfaceC1395M2474;
                }
                InterfaceC1395 interfaceC13952 = (InterfaceC1395) obj8;
                AbstractC8405.m13972(i);
                Object objM23453 = c13242.m2345();
                Object obj9 = objM23453;
                if (objM23453 == c1353) {
                    HashMap map = new HashMap();
                    c13242.m2386(map);
                    obj9 = map;
                }
                final HashMap map2 = (HashMap) obj9;
                boolean z = directoryUiInfo != null;
                AbstractC8405.m13972(i);
                boolean zM2378 = c13242.m2378(c8859);
                Object objM23454 = c13242.m2345();
                if (zM2378 || objM23454 == c1353) {
                    r9 = 0;
                    final boolean z2 = false ? 1 : 0;
                    InterfaceC6543 interfaceC6543 = new InterfaceC6543() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世哲兰苏
                        @Override // p052.InterfaceC6543
                        public final Object invoke() {
                            int i7 = z2;
                            C5176 c51762 = C5176.f14739;
                            C8859 c88592 = c8859;
                            switch (i7) {
                                case 0:
                                    c88592.m14522();
                                    break;
                                default:
                                    c88592.m14521("");
                                    break;
                            }
                            return c51762;
                        }
                    };
                    c13242.m2386(interfaceC6543);
                    obj4 = interfaceC6543;
                } else {
                    r9 = 0;
                    obj4 = objM23454;
                }
                AbstractC0455.m1161(z, (InterfaceC6543) obj4, c13242, r9);
                C0596 c0596 = AbstractC0619.f1723;
                AbstractC8405.m13972(2908);
                InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, r9);
                AbstractC8405.m13972(2909);
                int iHashCode = Long.hashCode(c13242.f3837);
                C1253 c1253M2381 = c13242.m2381();
                InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c13242, c0596);
                InterfaceC1784.f5222.getClass();
                InterfaceC6543 interfaceC65432 = C1765.f5185;
                AbstractC8405.m13972(2910);
                c13242.m2396();
                if (c13242.f3838) {
                    c13242.m2380(interfaceC65432);
                } else {
                    c13242.m2390();
                }
                InterfaceC6554 interfaceC6554 = C1765.f5181;
                AbstractC1367.m2472(c13242, interfaceC1658M1451, interfaceC6554);
                InterfaceC6554 interfaceC65542 = C1765.f5182;
                AbstractC1367.m2472(c13242, c1253M2381, interfaceC65542);
                Integer numValueOf = Integer.valueOf(iHashCode);
                InterfaceC6554 interfaceC65543 = C1765.f5188;
                AbstractC1367.m2472(c13242, numValueOf, interfaceC65543);
                InterfaceC6558 interfaceC6558 = C1765.f5187;
                AbstractC1367.m2481(c13242, interfaceC6558);
                InterfaceC6554 interfaceC65544 = C1765.f5183;
                AbstractC2442.m4562(c13242, interfaceC2129M3861, interfaceC65544, 2911, 2912);
                AbstractC1072.m1983(AbstractC3066.m6847(c13242, R.drawable.bg_setting), c0596, null, C1704.f4976, 0.0f, null, c13242, 25016, 104);
                AbstractC8405.m13972(2913);
                C0638 c0638M1449 = AbstractC0633.m1449(AbstractC0628.f1764, C2119.f6259, c13242, 0);
                AbstractC8405.m13972(2909);
                int iHashCode2 = Long.hashCode(c13242.f3837);
                C1253 c1253M23812 = c13242.m2381();
                InterfaceC2129 interfaceC2129M38612 = AbstractC2120.m3861(c13242, c0596);
                AbstractC8405.m13972(2910);
                c13242.m2396();
                if (c13242.f3838) {
                    c13242.m2380(interfaceC65432);
                } else {
                    c13242.m2390();
                }
                AbstractC1367.m2472(c13242, c0638M1449, interfaceC6554);
                AbstractC1367.m2472(c13242, c1253M23812, interfaceC65542);
                AbstractC1367.m2472(c13242, Integer.valueOf(iHashCode2), interfaceC65543);
                AbstractC1367.m2481(c13242, interfaceC6558);
                AbstractC2442.m4562(c13242, interfaceC2129M38612, interfaceC65544, 2914, 2915);
                DirectoryUiInfo directoryUiInfo2 = ((C8853) interfaceC1395M2494.getValue()).f24965;
                if (directoryUiInfo2 == null || (strM13973 = directoryUiInfo2.getItemName()) == null) {
                    strM13973 = AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜");
                }
                String str2 = strM13973;
                String str3 = ((C8853) interfaceC1395M2494.getValue()).f24966;
                AbstractC8405.m13972(i);
                boolean zM23782 = c13242.m2378(c8859) | c13242.m2378(settingActivity);
                Object objM23455 = c13242.m2345();
                Object obj10 = objM23455;
                if (zM23782 || objM23455 == c1353) {
                    InterfaceC6543 interfaceC65433 = new InterfaceC6543() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世兰苏哲
                        @Override // p052.InterfaceC6543
                        public final Object invoke() {
                            if (!c8859.m14522()) {
                                settingActivity.finish();
                            }
                            return C5176.f14739;
                        }
                    };
                    c13242.m2386(interfaceC65433);
                    obj10 = interfaceC65433;
                }
                InterfaceC6543 interfaceC65434 = (InterfaceC6543) obj10;
                AbstractC8405.m13972(i);
                boolean zM23783 = c13242.m2378(c8859);
                Object objM23456 = c13242.m2345();
                Object obj11 = objM23456;
                if (zM23783 || objM23456 == c1353) {
                    SettingActivityKt$SettingRoute$1$2$1$2$1 settingActivityKt$SettingRoute$1$2$1$2$1 = new SettingActivityKt$SettingRoute$1$2$1$2$1(c8859);
                    c13242.m2386(settingActivityKt$SettingRoute$1$2$1$2$1);
                    obj11 = settingActivityKt$SettingRoute$1$2$1$2$1;
                }
                InterfaceC6543 interfaceC65435 = (InterfaceC6543) ((InterfaceC5110) obj11);
                AbstractC8405.m13972(i);
                Object objM23457 = c13242.m2345();
                if (objM23457 == c1353) {
                    interfaceC1395 = interfaceC13952;
                    C0763 c0763 = new C0763(interfaceC1395, 2);
                    c13242.m2386(c0763);
                    obj5 = c0763;
                } else {
                    interfaceC1395 = interfaceC13952;
                    obj5 = objM23457;
                }
                AbstractC5969.m11355(str2, str3, interfaceC65434, interfaceC65435, (InterfaceC6543) obj5, c13242, 24576);
                int i7 = 1;
                C0655 c0655 = new C0655(1.0f, true);
                AbstractC8405.m13972(i);
                boolean zM23602 = c13242.m2360(interfaceC1395M2494);
                Object objM23458 = c13242.m2345();
                Object obj12 = objM23458;
                if (zM23602 || objM23458 == c1353) {
                    C0828 c0828 = new C0828(interfaceC1395M2494, i7);
                    c13242.m2386(c0828);
                    obj12 = c0828;
                }
                AbstractC0401.m1113(directoryUiInfo, c0655, (InterfaceC6558) obj12, null, AbstractC8405.m13972(2916), null, AbstractC1254.m2189(1740757747, new InterfaceC6552() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世兰哲苏
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.runtime.飘花落叶言子世苏楪哲兰, androidx.compose.runtime.飘花落叶言子楪苏哲世兰] */
                    /* JADX WARN: Type inference failed for: r4v13 */
                    /* JADX WARN: Type inference failed for: r4v17 */
                    /* JADX WARN: Type inference failed for: r4v8 */
                    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r8v10 */
                    @Override // p052.InterfaceC6552
                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                        String strM139732;
                        DirectoryUiInfo directoryUiInfo3 = (DirectoryUiInfo) obj14;
                        AbstractC8405.m13972(2902);
                        ((C0399) obj13).getClass();
                        AbstractC8405.m13972(2903);
                        InterfaceC1395 interfaceC13953 = interfaceC1395M2494;
                        int i8 = ((C8853) interfaceC13953.getValue()).f24963;
                        AbstractC8405.m13972(2905);
                        ?? r15 = (C1324) ((InterfaceC1373) obj15);
                        boolean zM23603 = r15.m2360(directoryUiInfo3);
                        ?? arrayList2 = list2;
                        boolean zM23604 = zM23603 | r15.m2360(arrayList2) | r15.m2362(i8);
                        Object objM23459 = r15.m2345();
                        C1353 c13532 = C1369.f3974;
                        ?? r4 = objM23459;
                        if (zM23604 || objM23459 == c13532) {
                            if (directoryUiInfo3 != null) {
                                AbstractC8405.m13972(3227);
                                arrayList2 = new ArrayList();
                                String itemName = directoryUiInfo3.getItemName();
                                List<ItemUiInfoGroupWrapper> list3 = directoryUiInfo3.groupWrapperList;
                                AbstractC8405.m13972(3228);
                                list3.getClass();
                                for (ItemUiInfoGroupWrapper itemUiInfoGroupWrapper2 : list3) {
                                    arrayList2.add(new C8856(AbstractC8405.m13972(3229) + arrayList2.size() + SignatureVisitor.SUPER + itemName + SignatureVisitor.SUPER + itemUiInfoGroupWrapper2.getGroupName(), itemUiInfoGroupWrapper2));
                                    List<BaseItemUiInfo> directoryUIInfoList2 = itemUiInfoGroupWrapper2.getDirectoryUIInfoList();
                                    AbstractC8405.m13972(3224);
                                    directoryUIInfoList2.getClass();
                                    for (BaseItemUiInfo baseItemUiInfo2 : directoryUIInfoList2) {
                                        baseItemUiInfo2.getClass();
                                        AbstractC8175.m13646(arrayList2, baseItemUiInfo2, AbstractC8405.m13972(3230) + itemName);
                                    }
                                }
                                List<BaseItemUiInfo> list4 = directoryUiInfo3.uiInfoList;
                                AbstractC8405.m13972(3231);
                                list4.getClass();
                                for (BaseItemUiInfo baseItemUiInfo3 : list4) {
                                    baseItemUiInfo3.getClass();
                                    AbstractC8175.m13646(arrayList2, baseItemUiInfo3, AbstractC8405.m13972(3230) + itemName);
                                }
                            }
                            r15.m2386(arrayList2);
                            r4 = arrayList2;
                        }
                        List list5 = (List) r4;
                        AbstractC8405.m13972(2905);
                        boolean zM23605 = r15.m2360(directoryUiInfo3);
                        Object objM234510 = r15.m2345();
                        if (zM23605 || objM234510 == c13532) {
                            if (directoryUiInfo3 == null || (strM139732 = directoryUiInfo3.getItemName()) == null) {
                                strM139732 = AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜");
                            }
                            objM234510 = strM139732;
                            r15.m2386(objM234510);
                        }
                        String str4 = (String) objM234510;
                        int i9 = ((C8853) interfaceC13953.getValue()).f24964;
                        AbstractC8405.m13972(2905);
                        C8859 c88592 = c8859;
                        boolean zM23784 = r15.m2378(c88592);
                        Object objM234511 = r15.m2345();
                        if (zM23784 || objM234511 == c13532) {
                            objM234511 = new SettingActivityKt$SettingRoute$1$2$1$5$1$1(c88592);
                            r15.m2386(objM234511);
                        }
                        InterfaceC6543 interfaceC65436 = (InterfaceC6543) ((InterfaceC5110) objM234511);
                        AbstractC8405.m13972(2905);
                        boolean zM23785 = r15.m2378(c88592);
                        Object objM234512 = r15.m2345();
                        if (zM23785 || objM234512 == c13532) {
                            objM234512 = new SettingActivityKt$SettingRoute$1$2$1$5$2$1(c88592);
                            r15.m2386(objM234512);
                        }
                        InterfaceC6558 interfaceC65582 = (InterfaceC6558) ((InterfaceC5110) objM234512);
                        AbstractC8405.m13972(2905);
                        boolean zM23786 = r15.m2378(c88592);
                        Object objM234513 = r15.m2345();
                        if (zM23786 || objM234513 == c13532) {
                            objM234513 = new SettingActivityKt$SettingRoute$1$2$1$5$3$1(c88592);
                            r15.m2386(objM234513);
                        }
                        InterfaceC6554 interfaceC65545 = (InterfaceC6554) ((InterfaceC5110) objM234513);
                        AbstractC8405.m13972(2905);
                        boolean zM23787 = r15.m2378(c88592);
                        Object objM234514 = r15.m2345();
                        if (zM23787 || objM234514 == c13532) {
                            objM234514 = new SettingActivityKt$SettingRoute$1$2$1$5$4$1(c88592);
                            r15.m2386(objM234514);
                        }
                        InterfaceC6554 interfaceC65546 = (InterfaceC6554) ((InterfaceC5110) objM234514);
                        AbstractC8405.m13972(2905);
                        boolean zM23788 = r15.m2378(c88592);
                        Object objM234515 = r15.m2345();
                        if (zM23788 || objM234515 == c13532) {
                            objM234515 = new SettingActivityKt$SettingRoute$1$2$1$5$5$1(c88592);
                            r15.m2386(objM234515);
                        }
                        AbstractC5969.m11351(str4, map2, list5, i9, interfaceC65436, interfaceC65582, interfaceC65545, interfaceC65546, (InterfaceC6554) ((InterfaceC5110) objM234515), r15, 0);
                        return C5176.f14739;
                    }
                }, c13242), c13242, 1597440, 40);
                C1324 c13243 = c13242;
                c13243.m2377(true);
                if (((C8853) interfaceC1395M2494.getValue()).f24962) {
                    c13243.m2392(-1598898790);
                    AbstractC8405.m13972(2917);
                    String str4 = ((C8853) interfaceC1395M2494.getValue()).f24968;
                    List list3 = ((C8853) interfaceC1395M2494.getValue()).f24967;
                    List list4 = ((C8853) interfaceC1395M2494.getValue()).f24969;
                    AbstractC8405.m13972(i);
                    boolean zM23784 = c13243.m2378(c8859);
                    Object objM23459 = c13243.m2345();
                    Object obj13 = objM23459;
                    if (zM23784 || objM23459 == c1353) {
                        SettingActivityKt$SettingRoute$1$2$2$1 settingActivityKt$SettingRoute$1$2$2$1 = new SettingActivityKt$SettingRoute$1$2$2$1(c8859);
                        c13243.m2386(settingActivityKt$SettingRoute$1$2$2$1);
                        obj13 = settingActivityKt$SettingRoute$1$2$2$1;
                    }
                    InterfaceC6543 interfaceC65436 = (InterfaceC6543) ((InterfaceC5110) obj13);
                    AbstractC8405.m13972(i);
                    boolean zM23785 = c13243.m2378(c8859);
                    Object objM234510 = c13243.m2345();
                    Object obj14 = objM234510;
                    if (zM23785 || objM234510 == c1353) {
                        SettingActivityKt$SettingRoute$1$2$3$1 settingActivityKt$SettingRoute$1$2$3$1 = new SettingActivityKt$SettingRoute$1$2$3$1(c8859);
                        c13243.m2386(settingActivityKt$SettingRoute$1$2$3$1);
                        obj14 = settingActivityKt$SettingRoute$1$2$3$1;
                    }
                    InterfaceC6558 interfaceC65582 = (InterfaceC6558) ((InterfaceC5110) obj14);
                    AbstractC8405.m13972(i);
                    boolean zM23786 = c13243.m2378(c8859);
                    Object objM234511 = c13243.m2345();
                    Object obj15 = objM234511;
                    if (zM23786 || objM234511 == c1353) {
                        final int i8 = 1;
                        InterfaceC6543 interfaceC65437 = new InterfaceC6543() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世哲兰苏
                            @Override // p052.InterfaceC6543
                            public final Object invoke() {
                                int i72 = i8;
                                C5176 c51762 = C5176.f14739;
                                C8859 c88592 = c8859;
                                switch (i72) {
                                    case 0:
                                        c88592.m14522();
                                        break;
                                    default:
                                        c88592.m14521("");
                                        break;
                                }
                                return c51762;
                            }
                        };
                        c13243.m2386(interfaceC65437);
                        obj15 = interfaceC65437;
                    }
                    InterfaceC6543 interfaceC65438 = (InterfaceC6543) obj15;
                    AbstractC8405.m13972(i);
                    boolean zM23787 = c13243.m2378(c8859);
                    Object objM234512 = c13243.m2345();
                    Object obj16 = objM234512;
                    if (zM23787 || objM234512 == c1353) {
                        SettingActivityKt$SettingRoute$1$2$5$1 settingActivityKt$SettingRoute$1$2$5$1 = new SettingActivityKt$SettingRoute$1$2$5$1(c8859);
                        c13243.m2386(settingActivityKt$SettingRoute$1$2$5$1);
                        obj16 = settingActivityKt$SettingRoute$1$2$5$1;
                    }
                    InterfaceC6558 interfaceC65583 = (InterfaceC6558) ((InterfaceC5110) obj16);
                    AbstractC8405.m13972(i);
                    boolean zM23788 = c13243.m2378(c8859);
                    Object objM234513 = c13243.m2345();
                    Object obj17 = objM234513;
                    if (zM23788 || objM234513 == c1353) {
                        SettingActivityKt$SettingRoute$1$2$6$1 settingActivityKt$SettingRoute$1$2$6$1 = new SettingActivityKt$SettingRoute$1$2$6$1(c8859);
                        c13243.m2386(settingActivityKt$SettingRoute$1$2$6$1);
                        obj17 = settingActivityKt$SettingRoute$1$2$6$1;
                    }
                    InterfaceC6543 interfaceC65439 = (InterfaceC6543) ((InterfaceC5110) obj17);
                    AbstractC8405.m13972(i);
                    boolean zM23789 = c13243.m2378(c8859);
                    Object objM234514 = c13243.m2345();
                    Object obj18 = objM234514;
                    if (zM23789 || objM234514 == c1353) {
                        SettingActivityKt$SettingRoute$1$2$7$1 settingActivityKt$SettingRoute$1$2$7$1 = new SettingActivityKt$SettingRoute$1$2$7$1(c8859);
                        c13243.m2386(settingActivityKt$SettingRoute$1$2$7$1);
                        obj18 = settingActivityKt$SettingRoute$1$2$7$1;
                    }
                    AbstractC5969.m11354(str4, list3, list4, interfaceC65436, interfaceC65582, interfaceC65438, interfaceC65583, interfaceC65439, (InterfaceC6558) ((InterfaceC5110) obj18), c13243, 0);
                    C1324 c13244 = c13243;
                    c13244.m2377(false);
                    c1324 = c13244;
                } else {
                    c13243.m2392(-1598294321);
                    c13243.m2377(false);
                    c1324 = c13243;
                }
                if (((Boolean) interfaceC1395.getValue()).booleanValue()) {
                    c1324.m2392(-1598261120);
                    AbstractC8405.m13972(2918);
                    AbstractC8405.m13972(i);
                    Object objM234515 = c1324.m2345();
                    Object obj19 = objM234515;
                    if (objM234515 == c1353) {
                        C0763 c07632 = new C0763(interfaceC1395, 3);
                        c1324.m2386(c07632);
                        obj19 = c07632;
                    }
                    AbstractC5969.m11353((InterfaceC6543) obj19, c1324, 6);
                    c1324.m2377(false);
                } else {
                    c1324.m2392(-1598154449);
                    c1324.m2377(false);
                }
                c1324.m2377(true);
                return c5176;
            default:
                ((Integer) obj2).getClass();
                AbstractC5963.m11337(settingActivity, c8859, interfaceC1373, AbstractC1367.m2471(1));
                return c5176;
        }
    }

    public /* synthetic */ C5961(C8859 c8859, SettingActivity settingActivity) {
        this.f16160 = c8859;
        this.f16159 = settingActivity;
    }
}
