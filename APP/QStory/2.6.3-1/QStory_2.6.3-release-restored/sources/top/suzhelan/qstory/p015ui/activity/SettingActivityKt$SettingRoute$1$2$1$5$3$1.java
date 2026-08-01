package top.suzhelan.qstory.p015ui.activity;

import com.bumptech.glide.AbstractC3888;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C6099;
import lin.xposed.hook.loader.config.AbstractC6386;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import p042.AbstractC7140;
import p042.AbstractC7143;
import p068.InterfaceC7383;
import p348.C9614;
import p353.AbstractC9632;
import p366.C9682;
import p366.C9688;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$3$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public SettingActivityKt$SettingRoute$1$2$1$5$3$1(Object obj) {
        super(2, obj, C9688.class, "onFunctionToggle", "onFunctionToggle(Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;Z)V", 0);
    }

    public final void invoke(ItemUiInfo itemUiInfo, boolean z) {
        Object value;
        C9682 c9682;
        "p0";
        itemUiInfo.getClass();
        C9688 c9688 = (C9688) this.receiver;
        c9688.getClass();
        "itemUiInfo";
        AbstractC7143 abstractC7143 = itemUiInfo.item;
        AbstractC7140 abstractC7140 = abstractC7143 instanceof AbstractC7140 ? (AbstractC7140) abstractC7143 : null;
        if (abstractC7140 == null) {
            return;
        }
        C9614 c9614M7268 = AbstractC3888.m7268();
        AbstractC9632 abstractC9632 = abstractC7140 instanceof AbstractC9632 ? (AbstractC9632) abstractC7140 : null;
        if (abstractC9632 == null || abstractC9632.mo11811(c9614M7268)) {
            abstractC7140.f17770 = Boolean.valueOf(z);
            AbstractC6386.m11449(abstractC7140);
            if (z) {
                try {
                    abstractC7140.startLoadHook();
                } catch (Exception e) {
                    abstractC7140.getExceptionCollectionToolInstance().m12391(e);
                }
            }
            C6099 c6099 = c9688.f25324;
            do {
                value = c6099.getValue();
                c9682 = (C9682) value;
            } while (!c6099.m10871(value, C9682.m15079(c9682, null, 0, c9682.f25308 + 1, false, null, null, null, null, 503)));
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ItemUiInfo) obj, ((Boolean) obj2).booleanValue());
        return C6008.f15084;
    }
}
