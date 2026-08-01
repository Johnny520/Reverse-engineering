package top.suzhelan.qstory.ui.activity;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import p026.AbstractC6293;
import p026.AbstractC6296;
import p052.InterfaceC6553;
import p354.C8891;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$4$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public SettingActivityKt$SettingRoute$1$2$1$5$4$1(Object obj) {
        super(2, obj, C8891.class, "onFunctionClick", "onFunctionClick(Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;Landroid/view/View;)V", 0);
    }

    public final void invoke(ItemUiInfo itemUiInfo, View view) {
        View.OnClickListener onClickListenerMo11193;
        "p0";
        itemUiInfo.getClass();
        "p1";
        view.getClass();
        ((C8891) this.receiver).getClass();
        "itemUiInfo";
        "anchorView";
        AbstractC6296 abstractC6296 = itemUiInfo.item;
        AbstractC6293 abstractC6293 = abstractC6296 instanceof AbstractC6293 ? (AbstractC6293) abstractC6296 : null;
        if (abstractC6293 == null || (onClickListenerMo11193 = abstractC6293.mo11193()) == null) {
            return;
        }
        onClickListenerMo11193.onClick(view);
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ItemUiInfo) obj, (View) obj2);
        return C5175.f14739;
    }
}
