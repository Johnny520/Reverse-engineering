package top.suzhelan.qstory.ui.activity;

import com.bumptech.glide.AbstractC3056;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C5267;
import lin.xposed.hook.loader.config.AbstractC5555;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import p026.AbstractC6311;
import p026.AbstractC6314;
import p052.InterfaceC6554;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import p350.C8853;
import p350.C8859;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$3$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public SettingActivityKt$SettingRoute$1$2$1$5$3$1(Object obj) {
        super(2, obj, C8859.class, AbstractC8405.m13972(2881), AbstractC8405.m13972(2882), 0);
    }

    public final void invoke(ItemUiInfo itemUiInfo, boolean z) {
        Object value;
        C8853 c8853;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵呜");
        itemUiInfo.getClass();
        C8859 c8859 = (C8859) this.receiver;
        c8859.getClass();
        AbstractC8405.m13972(3250);
        AbstractC6314 abstractC6314 = itemUiInfo.item;
        AbstractC6311 abstractC6311 = abstractC6314 instanceof AbstractC6311 ? (AbstractC6311) abstractC6314 : null;
        if (abstractC6311 == null) {
            return;
        }
        C8785 c8785M6708 = AbstractC3056.m6708();
        AbstractC8803 abstractC8803 = abstractC6311 instanceof AbstractC8803 ? (AbstractC8803) abstractC6311 : null;
        if (abstractC8803 == null || abstractC8803.mo11252(c8785M6708)) {
            abstractC6311.f17425 = Boolean.valueOf(z);
            AbstractC5555.m10890(abstractC6311);
            if (z) {
                try {
                    abstractC6311.startLoadHook();
                } catch (Exception e) {
                    abstractC6311.getExceptionCollectionToolInstance().m11832(e);
                }
            }
            C5267 c5267 = c8859.f24979;
            do {
                value = c5267.getValue();
                c8853 = (C8853) value;
            } while (!c5267.m10312(value, C8853.m14520(c8853, null, 0, c8853.f24963 + 1, false, null, null, null, null, 503)));
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ItemUiInfo) obj, ((Boolean) obj2).booleanValue());
        return C5176.f14739;
    }
}
