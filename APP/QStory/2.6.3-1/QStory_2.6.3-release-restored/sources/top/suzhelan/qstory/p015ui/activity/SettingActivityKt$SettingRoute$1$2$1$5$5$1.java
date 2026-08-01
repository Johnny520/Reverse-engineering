package top.suzhelan.qstory.p015ui.activity;

import android.view.View;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p068.InterfaceC7383;
import p366.C9688;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$5$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public SettingActivityKt$SettingRoute$1$2$1$5$5$1(Object obj) {
        super(2, obj, C9688.class, "onOtherClick", "onOtherClick(Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;Landroid/view/View;)V", 0);
    }

    public final void invoke(OtherViewItemInfo otherViewItemInfo, View view) {
        "p0";
        otherViewItemInfo.getClass();
        "p1";
        view.getClass();
        ((C9688) this.receiver).getClass();
        "otherViewItemInfo";
        "anchorView";
        otherViewItemInfo.getOnClick().onClick(view);
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((OtherViewItemInfo) obj, (View) obj2);
        return C6008.f15084;
    }
}
