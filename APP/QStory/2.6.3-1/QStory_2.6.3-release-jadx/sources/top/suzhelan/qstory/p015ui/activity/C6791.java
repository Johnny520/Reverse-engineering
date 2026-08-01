package top.suzhelan.qstory.p015ui.activity;

import android.content.Context;
import androidx.compose.animation.AbstractC1247;
import androidx.compose.animation.C1245;
import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.AbstractC1474;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.layout.C1437;
import androidx.compose.foundation.layout.C1479;
import androidx.compose.foundation.layout.C1496;
import androidx.compose.foundation.lazy.C1604;
import androidx.compose.foundation.text.contextmenu.provider.C1668;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.C2539;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2088;
import androidx.profileinstaller.AbstractC3275;
import com.bumptech.glide.AbstractC3898;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C6008;
import kotlin.reflect.InterfaceC5942;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.BaseItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p026.AbstractC7017;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7381;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p267.AbstractC9004;
import p303.AbstractC9234;
import p366.C9682;
import p366.C9684;
import p366.C9685;
import p366.C9688;
import top.suzhelan.qstory.p015ui.components.AbstractC6799;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6791 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ SettingActivity f16504;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C9688 f16505;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16506 = 1;

    public /* synthetic */ C6791(SettingActivity settingActivity, C9688 c9688, int i) {
        this.f16504 = settingActivity;
        this.f16505 = c9688;
    }

    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        Object obj3;
        ?? r9;
        Object obj4;
        String strM14532;
        InterfaceC2230 interfaceC2230;
        Object obj5;
        C2159 c2159;
        int i3 = this.f16506;
        C6008 c6008 = C6008.f15084;
        final C9688 c9688 = this.f16505;
        final SettingActivity settingActivity = this.f16504;
        InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
        switch (i3) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                AbstractC9234.m14531(2906);
                C2159 c21592 = (C2159) interfaceC2208;
                if (!c21592.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c21592.m2899();
                    return c6008;
                }
                final InterfaceC2230 interfaceC2230M3054 = AbstractC2202.m3054(c9688.f25323, c21592);
                int i4 = 2905;
                AbstractC9234.m14531(2905);
                boolean zM2920 = c21592.m2920(settingActivity);
                Object objM2905 = c21592.m2905();
                C2188 c2188 = C2204.f4319;
                if (zM2920 || objM2905 == c2188) {
                    AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                    settingActivity.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : ItemUiInfoManager.rootContainer) {
                        if (obj6 instanceof ItemUiInfoGroupWrapper) {
                            i2 = i4;
                            StringBuilder sb = new StringBuilder();
                            sb.append(AbstractC9234.m14531(3223));
                            sb.append(arrayList.size());
                            sb.append(SignatureVisitor.SUPER);
                            ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = (ItemUiInfoGroupWrapper) obj6;
                            sb.append(itemUiInfoGroupWrapper.getGroupName());
                            arrayList.add(new C9685(sb.toString(), itemUiInfoGroupWrapper));
                            List<BaseItemUiInfo> directoryUIInfoList = itemUiInfoGroupWrapper.getDirectoryUIInfoList();
                            AbstractC9234.m14531(3224);
                            directoryUIInfoList.getClass();
                            for (BaseItemUiInfo baseItemUiInfo : directoryUIInfoList) {
                                baseItemUiInfo.getClass();
                                AbstractC9004.m14205(arrayList, baseItemUiInfo, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵"));
                            }
                        } else {
                            i2 = i4;
                            if (obj6 instanceof BaseItemUiInfo) {
                                AbstractC9004.m14205(arrayList, (BaseItemUiInfo) obj6, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵"));
                            }
                        }
                        i4 = i2;
                    }
                    i = i4;
                    List<Class<? extends OtherViewItemInfo>> list = OtherViewItemInfo.OTHER_VIEW_ITEM_INFO_LIST;
                    AbstractC9234.m14531(3225);
                    list.getClass();
                    int i5 = 0;
                    for (Object obj7 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            AbstractC7176.m12479();
                            throw null;
                        }
                        Class cls = (Class) obj7;
                        try {
                            OtherViewItemInfo otherViewItemInfo = (OtherViewItemInfo) cls.getConstructor(Context.class).newInstance(settingActivity);
                            String str = AbstractC9234.m14531(3226) + i5 + SignatureVisitor.SUPER + cls.getSimpleName();
                            otherViewItemInfo.getClass();
                            arrayList.add(new C9684(str, otherViewItemInfo));
                        } catch (Exception e) {
                            AbstractC7017.m12165(e);
                        }
                        i5 = i6;
                    }
                    c21592.m2946(arrayList);
                    obj3 = arrayList;
                } else {
                    i = 2905;
                    obj3 = objM2905;
                }
                final List list2 = (List) obj3;
                DirectoryUiInfo directoryUiInfo = ((C9682) interfaceC2230M3054.getValue()).f25310;
                AbstractC9234.m14531(i);
                Object objM29052 = c21592.m2905();
                Object obj8 = objM29052;
                if (objM29052 == c2188) {
                    InterfaceC2230 interfaceC2230M3034 = AbstractC2202.m3034(Boolean.FALSE);
                    c21592.m2946(interfaceC2230M3034);
                    obj8 = interfaceC2230M3034;
                }
                InterfaceC2230 interfaceC22302 = (InterfaceC2230) obj8;
                AbstractC9234.m14531(i);
                Object objM29053 = c21592.m2905();
                Object obj9 = objM29053;
                if (objM29053 == c2188) {
                    HashMap map = new HashMap();
                    c21592.m2946(map);
                    obj9 = map;
                }
                final HashMap map2 = (HashMap) obj9;
                boolean z = directoryUiInfo != null;
                AbstractC9234.m14531(i);
                boolean zM2938 = c21592.m2938(c9688);
                Object objM29054 = c21592.m2905();
                if (zM2938 || objM29054 == c2188) {
                    r9 = 0;
                    final boolean z2 = false ? 1 : 0;
                    InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世哲兰苏
                        @Override // p068.InterfaceC7372
                        public final Object invoke() {
                            int i7 = z2;
                            C6008 c60082 = C6008.f15084;
                            C9688 c96882 = c9688;
                            switch (i7) {
                                case 0:
                                    c96882.m15081();
                                    break;
                                default:
                                    c96882.m15080("");
                                    break;
                            }
                            return c60082;
                        }
                    };
                    c21592.m2946(interfaceC7372);
                    obj4 = interfaceC7372;
                } else {
                    r9 = 0;
                    obj4 = objM29054;
                }
                AbstractC1298.m1721(z, (InterfaceC7372) obj4, c21592, r9);
                C1437 c1437 = AbstractC1460.f2068;
                AbstractC9234.m14531(2908);
                InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, r9);
                AbstractC9234.m14531(2909);
                int iHashCode = Long.hashCode(c21592.f4182);
                C2088 c2088M2941 = c21592.m2941();
                InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21592, c1437);
                InterfaceC2619.f5567.getClass();
                InterfaceC7372 interfaceC73722 = C2600.f5530;
                AbstractC9234.m14531(2910);
                c21592.m2956();
                if (c21592.f4183) {
                    c21592.m2940(interfaceC73722);
                } else {
                    c21592.m2950();
                }
                InterfaceC7383 interfaceC7383 = C2600.f5526;
                AbstractC2202.m3032(c21592, interfaceC2493M2011, interfaceC7383);
                InterfaceC7383 interfaceC73832 = C2600.f5527;
                AbstractC2202.m3032(c21592, c2088M2941, interfaceC73832);
                Integer numValueOf = Integer.valueOf(iHashCode);
                InterfaceC7383 interfaceC73833 = C2600.f5533;
                AbstractC2202.m3032(c21592, numValueOf, interfaceC73833);
                InterfaceC7387 interfaceC7387 = C2600.f5532;
                AbstractC2202.m3041(c21592, interfaceC7387);
                InterfaceC7383 interfaceC73834 = C2600.f5528;
                AbstractC3275.m5122(c21592, interfaceC2962M4421, interfaceC73834, 2911, 2912);
                AbstractC1910.m2543(AbstractC3898.m7407(c21592, C0328R.drawable.bg_setting), c1437, null, C2539.f5321, 0.0f, null, c21592, 25016, 104);
                AbstractC9234.m14531(2913);
                C1479 c1479M2009 = AbstractC1474.m2009(AbstractC1469.f2109, C2952.f6604, c21592, 0);
                AbstractC9234.m14531(2909);
                int iHashCode2 = Long.hashCode(c21592.f4182);
                C2088 c2088M29412 = c21592.m2941();
                InterfaceC2962 interfaceC2962M44212 = AbstractC2953.m4421(c21592, c1437);
                AbstractC9234.m14531(2910);
                c21592.m2956();
                if (c21592.f4183) {
                    c21592.m2940(interfaceC73722);
                } else {
                    c21592.m2950();
                }
                AbstractC2202.m3032(c21592, c1479M2009, interfaceC7383);
                AbstractC2202.m3032(c21592, c2088M29412, interfaceC73832);
                AbstractC2202.m3032(c21592, Integer.valueOf(iHashCode2), interfaceC73833);
                AbstractC2202.m3041(c21592, interfaceC7387);
                AbstractC3275.m5122(c21592, interfaceC2962M44212, interfaceC73834, 2914, 2915);
                DirectoryUiInfo directoryUiInfo2 = ((C9682) interfaceC2230M3054.getValue()).f25310;
                if (directoryUiInfo2 == null || (strM14532 = directoryUiInfo2.getItemName()) == null) {
                    strM14532 = AbstractC9234.m14532("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜");
                }
                String str2 = strM14532;
                String str3 = ((C9682) interfaceC2230M3054.getValue()).f25311;
                AbstractC9234.m14531(i);
                boolean zM29382 = c21592.m2938(c9688) | c21592.m2938(settingActivity);
                Object objM29055 = c21592.m2905();
                Object obj10 = objM29055;
                if (zM29382 || objM29055 == c2188) {
                    InterfaceC7372 interfaceC73723 = new InterfaceC7372() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世兰苏哲
                        @Override // p068.InterfaceC7372
                        public final Object invoke() {
                            if (!c9688.m15081()) {
                                settingActivity.finish();
                            }
                            return C6008.f15084;
                        }
                    };
                    c21592.m2946(interfaceC73723);
                    obj10 = interfaceC73723;
                }
                InterfaceC7372 interfaceC73724 = (InterfaceC7372) obj10;
                AbstractC9234.m14531(i);
                boolean zM29383 = c21592.m2938(c9688);
                Object objM29056 = c21592.m2905();
                Object obj11 = objM29056;
                if (zM29383 || objM29056 == c2188) {
                    SettingActivityKt$SettingRoute$1$2$1$2$1 settingActivityKt$SettingRoute$1$2$1$2$1 = new SettingActivityKt$SettingRoute$1$2$1$2$1(c9688);
                    c21592.m2946(settingActivityKt$SettingRoute$1$2$1$2$1);
                    obj11 = settingActivityKt$SettingRoute$1$2$1$2$1;
                }
                InterfaceC7372 interfaceC73725 = (InterfaceC7372) ((InterfaceC5942) obj11);
                AbstractC9234.m14531(i);
                Object objM29057 = c21592.m2905();
                if (objM29057 == c2188) {
                    interfaceC2230 = interfaceC22302;
                    C1604 c1604 = new C1604(interfaceC2230, 2);
                    c21592.m2946(c1604);
                    obj5 = c1604;
                } else {
                    interfaceC2230 = interfaceC22302;
                    obj5 = objM29057;
                }
                AbstractC6799.m11914(str2, str3, interfaceC73724, interfaceC73725, (InterfaceC7372) obj5, c21592, 24576);
                int i7 = 1;
                C1496 c1496 = new C1496(1.0f, true);
                AbstractC9234.m14531(i);
                boolean zM29202 = c21592.m2920(interfaceC2230M3054);
                Object objM29058 = c21592.m2905();
                Object obj12 = objM29058;
                if (zM29202 || objM29058 == c2188) {
                    C1668 c1668 = new C1668(interfaceC2230M3054, i7);
                    c21592.m2946(c1668);
                    obj12 = c1668;
                }
                AbstractC1247.m1673(directoryUiInfo, c1496, (InterfaceC7387) obj12, null, AbstractC9234.m14531(2916), null, AbstractC2089.m2749(1740757747, new InterfaceC7381() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世兰哲苏
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.runtime.飘花落叶言子世苏楪哲兰, androidx.compose.runtime.飘花落叶言子楪苏哲世兰] */
                    /* JADX WARN: Type inference failed for: r4v13 */
                    /* JADX WARN: Type inference failed for: r4v17 */
                    /* JADX WARN: Type inference failed for: r4v8 */
                    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r8v10 */
                    @Override // p068.InterfaceC7381
                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                        String strM145322;
                        DirectoryUiInfo directoryUiInfo3 = (DirectoryUiInfo) obj14;
                        AbstractC9234.m14531(2902);
                        ((C1245) obj13).getClass();
                        AbstractC9234.m14531(2903);
                        InterfaceC2230 interfaceC22303 = interfaceC2230M3054;
                        int i8 = ((C9682) interfaceC22303.getValue()).f25308;
                        AbstractC9234.m14531(2905);
                        ?? r15 = (C2159) ((InterfaceC2208) obj15);
                        boolean zM29203 = r15.m2920(directoryUiInfo3);
                        ?? arrayList2 = list2;
                        boolean zM29204 = zM29203 | r15.m2920(arrayList2) | r15.m2922(i8);
                        Object objM29059 = r15.m2905();
                        C2188 c21882 = C2204.f4319;
                        ?? r4 = objM29059;
                        if (zM29204 || objM29059 == c21882) {
                            if (directoryUiInfo3 != null) {
                                AbstractC9234.m14531(3227);
                                arrayList2 = new ArrayList();
                                String itemName = directoryUiInfo3.getItemName();
                                List<ItemUiInfoGroupWrapper> list3 = directoryUiInfo3.groupWrapperList;
                                AbstractC9234.m14531(3228);
                                list3.getClass();
                                for (ItemUiInfoGroupWrapper itemUiInfoGroupWrapper2 : list3) {
                                    arrayList2.add(new C9685(AbstractC9234.m14531(3229) + arrayList2.size() + SignatureVisitor.SUPER + itemName + SignatureVisitor.SUPER + itemUiInfoGroupWrapper2.getGroupName(), itemUiInfoGroupWrapper2));
                                    List<BaseItemUiInfo> directoryUIInfoList2 = itemUiInfoGroupWrapper2.getDirectoryUIInfoList();
                                    AbstractC9234.m14531(3224);
                                    directoryUIInfoList2.getClass();
                                    for (BaseItemUiInfo baseItemUiInfo2 : directoryUIInfoList2) {
                                        baseItemUiInfo2.getClass();
                                        AbstractC9004.m14205(arrayList2, baseItemUiInfo2, AbstractC9234.m14531(3230) + itemName);
                                    }
                                }
                                List<BaseItemUiInfo> list4 = directoryUiInfo3.uiInfoList;
                                AbstractC9234.m14531(3231);
                                list4.getClass();
                                for (BaseItemUiInfo baseItemUiInfo3 : list4) {
                                    baseItemUiInfo3.getClass();
                                    AbstractC9004.m14205(arrayList2, baseItemUiInfo3, AbstractC9234.m14531(3230) + itemName);
                                }
                            }
                            r15.m2946(arrayList2);
                            r4 = arrayList2;
                        }
                        List list5 = (List) r4;
                        AbstractC9234.m14531(2905);
                        boolean zM29205 = r15.m2920(directoryUiInfo3);
                        Object objM290510 = r15.m2905();
                        if (zM29205 || objM290510 == c21882) {
                            if (directoryUiInfo3 == null || (strM145322 = directoryUiInfo3.getItemName()) == null) {
                                strM145322 = AbstractC9234.m14532("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜");
                            }
                            objM290510 = strM145322;
                            r15.m2946(objM290510);
                        }
                        String str4 = (String) objM290510;
                        int i9 = ((C9682) interfaceC22303.getValue()).f25309;
                        AbstractC9234.m14531(2905);
                        C9688 c96882 = c9688;
                        boolean zM29384 = r15.m2938(c96882);
                        Object objM290511 = r15.m2905();
                        if (zM29384 || objM290511 == c21882) {
                            objM290511 = new SettingActivityKt$SettingRoute$1$2$1$5$1$1(c96882);
                            r15.m2946(objM290511);
                        }
                        InterfaceC7372 interfaceC73726 = (InterfaceC7372) ((InterfaceC5942) objM290511);
                        AbstractC9234.m14531(2905);
                        boolean zM29385 = r15.m2938(c96882);
                        Object objM290512 = r15.m2905();
                        if (zM29385 || objM290512 == c21882) {
                            objM290512 = new SettingActivityKt$SettingRoute$1$2$1$5$2$1(c96882);
                            r15.m2946(objM290512);
                        }
                        InterfaceC7387 interfaceC73872 = (InterfaceC7387) ((InterfaceC5942) objM290512);
                        AbstractC9234.m14531(2905);
                        boolean zM29386 = r15.m2938(c96882);
                        Object objM290513 = r15.m2905();
                        if (zM29386 || objM290513 == c21882) {
                            objM290513 = new SettingActivityKt$SettingRoute$1$2$1$5$3$1(c96882);
                            r15.m2946(objM290513);
                        }
                        InterfaceC7383 interfaceC73835 = (InterfaceC7383) ((InterfaceC5942) objM290513);
                        AbstractC9234.m14531(2905);
                        boolean zM29387 = r15.m2938(c96882);
                        Object objM290514 = r15.m2905();
                        if (zM29387 || objM290514 == c21882) {
                            objM290514 = new SettingActivityKt$SettingRoute$1$2$1$5$4$1(c96882);
                            r15.m2946(objM290514);
                        }
                        InterfaceC7383 interfaceC73836 = (InterfaceC7383) ((InterfaceC5942) objM290514);
                        AbstractC9234.m14531(2905);
                        boolean zM29388 = r15.m2938(c96882);
                        Object objM290515 = r15.m2905();
                        if (zM29388 || objM290515 == c21882) {
                            objM290515 = new SettingActivityKt$SettingRoute$1$2$1$5$5$1(c96882);
                            r15.m2946(objM290515);
                        }
                        AbstractC6799.m11910(str4, map2, list5, i9, interfaceC73726, interfaceC73872, interfaceC73835, interfaceC73836, (InterfaceC7383) ((InterfaceC5942) objM290515), r15, 0);
                        return C6008.f15084;
                    }
                }, c21592), c21592, 1597440, 40);
                C2159 c21593 = c21592;
                c21593.m2937(true);
                if (((C9682) interfaceC2230M3054.getValue()).f25307) {
                    c21593.m2952(-1598898790);
                    AbstractC9234.m14531(2917);
                    String str4 = ((C9682) interfaceC2230M3054.getValue()).f25313;
                    List list3 = ((C9682) interfaceC2230M3054.getValue()).f25312;
                    List list4 = ((C9682) interfaceC2230M3054.getValue()).f25314;
                    AbstractC9234.m14531(i);
                    boolean zM29384 = c21593.m2938(c9688);
                    Object objM29059 = c21593.m2905();
                    Object obj13 = objM29059;
                    if (zM29384 || objM29059 == c2188) {
                        SettingActivityKt$SettingRoute$1$2$2$1 settingActivityKt$SettingRoute$1$2$2$1 = new SettingActivityKt$SettingRoute$1$2$2$1(c9688);
                        c21593.m2946(settingActivityKt$SettingRoute$1$2$2$1);
                        obj13 = settingActivityKt$SettingRoute$1$2$2$1;
                    }
                    InterfaceC7372 interfaceC73726 = (InterfaceC7372) ((InterfaceC5942) obj13);
                    AbstractC9234.m14531(i);
                    boolean zM29385 = c21593.m2938(c9688);
                    Object objM290510 = c21593.m2905();
                    Object obj14 = objM290510;
                    if (zM29385 || objM290510 == c2188) {
                        SettingActivityKt$SettingRoute$1$2$3$1 settingActivityKt$SettingRoute$1$2$3$1 = new SettingActivityKt$SettingRoute$1$2$3$1(c9688);
                        c21593.m2946(settingActivityKt$SettingRoute$1$2$3$1);
                        obj14 = settingActivityKt$SettingRoute$1$2$3$1;
                    }
                    InterfaceC7387 interfaceC73872 = (InterfaceC7387) ((InterfaceC5942) obj14);
                    AbstractC9234.m14531(i);
                    boolean zM29386 = c21593.m2938(c9688);
                    Object objM290511 = c21593.m2905();
                    Object obj15 = objM290511;
                    if (zM29386 || objM290511 == c2188) {
                        final int i8 = 1;
                        InterfaceC7372 interfaceC73727 = new InterfaceC7372() { // from class: top.suzhelan.qstory.ui.activity.飘花落叶言子楪世哲兰苏
                            @Override // p068.InterfaceC7372
                            public final Object invoke() {
                                int i72 = i8;
                                C6008 c60082 = C6008.f15084;
                                C9688 c96882 = c9688;
                                switch (i72) {
                                    case 0:
                                        c96882.m15081();
                                        break;
                                    default:
                                        c96882.m15080("");
                                        break;
                                }
                                return c60082;
                            }
                        };
                        c21593.m2946(interfaceC73727);
                        obj15 = interfaceC73727;
                    }
                    InterfaceC7372 interfaceC73728 = (InterfaceC7372) obj15;
                    AbstractC9234.m14531(i);
                    boolean zM29387 = c21593.m2938(c9688);
                    Object objM290512 = c21593.m2905();
                    Object obj16 = objM290512;
                    if (zM29387 || objM290512 == c2188) {
                        SettingActivityKt$SettingRoute$1$2$5$1 settingActivityKt$SettingRoute$1$2$5$1 = new SettingActivityKt$SettingRoute$1$2$5$1(c9688);
                        c21593.m2946(settingActivityKt$SettingRoute$1$2$5$1);
                        obj16 = settingActivityKt$SettingRoute$1$2$5$1;
                    }
                    InterfaceC7387 interfaceC73873 = (InterfaceC7387) ((InterfaceC5942) obj16);
                    AbstractC9234.m14531(i);
                    boolean zM29388 = c21593.m2938(c9688);
                    Object objM290513 = c21593.m2905();
                    Object obj17 = objM290513;
                    if (zM29388 || objM290513 == c2188) {
                        SettingActivityKt$SettingRoute$1$2$6$1 settingActivityKt$SettingRoute$1$2$6$1 = new SettingActivityKt$SettingRoute$1$2$6$1(c9688);
                        c21593.m2946(settingActivityKt$SettingRoute$1$2$6$1);
                        obj17 = settingActivityKt$SettingRoute$1$2$6$1;
                    }
                    InterfaceC7372 interfaceC73729 = (InterfaceC7372) ((InterfaceC5942) obj17);
                    AbstractC9234.m14531(i);
                    boolean zM29389 = c21593.m2938(c9688);
                    Object objM290514 = c21593.m2905();
                    Object obj18 = objM290514;
                    if (zM29389 || objM290514 == c2188) {
                        SettingActivityKt$SettingRoute$1$2$7$1 settingActivityKt$SettingRoute$1$2$7$1 = new SettingActivityKt$SettingRoute$1$2$7$1(c9688);
                        c21593.m2946(settingActivityKt$SettingRoute$1$2$7$1);
                        obj18 = settingActivityKt$SettingRoute$1$2$7$1;
                    }
                    AbstractC6799.m11913(str4, list3, list4, interfaceC73726, interfaceC73872, interfaceC73728, interfaceC73873, interfaceC73729, (InterfaceC7387) ((InterfaceC5942) obj18), c21593, 0);
                    C2159 c21594 = c21593;
                    c21594.m2937(false);
                    c2159 = c21594;
                } else {
                    c21593.m2952(-1598294321);
                    c21593.m2937(false);
                    c2159 = c21593;
                }
                if (((Boolean) interfaceC2230.getValue()).booleanValue()) {
                    c2159.m2952(-1598261120);
                    AbstractC9234.m14531(2918);
                    AbstractC9234.m14531(i);
                    Object objM290515 = c2159.m2905();
                    Object obj19 = objM290515;
                    if (objM290515 == c2188) {
                        C1604 c16042 = new C1604(interfaceC2230, 3);
                        c2159.m2946(c16042);
                        obj19 = c16042;
                    }
                    AbstractC6799.m11912((InterfaceC7372) obj19, c2159, 6);
                    c2159.m2937(false);
                } else {
                    c2159.m2952(-1598154449);
                    c2159.m2937(false);
                }
                c2159.m2937(true);
                return c6008;
            default:
                ((Integer) obj2).getClass();
                AbstractC6793.m11896(settingActivity, c9688, interfaceC2208, AbstractC2202.m3031(1));
                return c6008;
        }
    }

    public /* synthetic */ C6791(C9688 c9688, SettingActivity settingActivity) {
        this.f16505 = c9688;
        this.f16504 = settingActivity;
    }
}
