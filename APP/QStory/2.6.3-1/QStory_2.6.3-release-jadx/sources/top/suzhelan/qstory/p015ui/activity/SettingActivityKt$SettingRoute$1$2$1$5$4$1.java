package top.suzhelan.qstory.p015ui.activity;

import android.view.View;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import p042.AbstractC7140;
import p042.AbstractC7143;
import p068.InterfaceC7383;
import p303.AbstractC9234;
import p366.C9688;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$4$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public SettingActivityKt$SettingRoute$1$2$1$5$4$1(Object obj) {
        super(2, obj, C9688.class, AbstractC9234.m14531(2883), AbstractC9234.m14531(2884), 0);
    }

    public final void invoke(ItemUiInfo itemUiInfo, View view) {
        View.OnClickListener onClickListenerMo11806;
        AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵呜");
        itemUiInfo.getClass();
        AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵喵");
        view.getClass();
        ((C9688) this.receiver).getClass();
        AbstractC9234.m14531(3250);
        AbstractC9234.m14531(3251);
        AbstractC7143 abstractC7143 = itemUiInfo.item;
        AbstractC7140 abstractC7140 = abstractC7143 instanceof AbstractC7140 ? (AbstractC7140) abstractC7143 : null;
        if (abstractC7140 == null || (onClickListenerMo11806 = abstractC7140.mo11806()) == null) {
            return;
        }
        onClickListenerMo11806.onClick(view);
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ItemUiInfo) obj, (View) obj2);
        return C6008.f15084;
    }
}
