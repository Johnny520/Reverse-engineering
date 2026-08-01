package top.suzhelan.qstory.ui.activity;

import android.view.View;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import p026.AbstractC6311;
import p026.AbstractC6314;
import p052.InterfaceC6554;
import p287.AbstractC8405;
import p350.C8859;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$4$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public SettingActivityKt$SettingRoute$1$2$1$5$4$1(Object obj) {
        super(2, obj, C8859.class, AbstractC8405.m13972(2883), AbstractC8405.m13972(2884), 0);
    }

    public final void invoke(ItemUiInfo itemUiInfo, View view) {
        View.OnClickListener onClickListenerMo11247;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵呜");
        itemUiInfo.getClass();
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵喵");
        view.getClass();
        ((C8859) this.receiver).getClass();
        AbstractC8405.m13972(3250);
        AbstractC8405.m13972(3251);
        AbstractC6314 abstractC6314 = itemUiInfo.item;
        AbstractC6311 abstractC6311 = abstractC6314 instanceof AbstractC6311 ? (AbstractC6311) abstractC6314 : null;
        if (abstractC6311 == null || (onClickListenerMo11247 = abstractC6311.mo11247()) == null) {
            return;
        }
        onClickListenerMo11247.onClick(view);
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ItemUiInfo) obj, (View) obj2);
        return C5176.f14739;
    }
}
