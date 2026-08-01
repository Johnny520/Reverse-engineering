package top.suzhelan.qstory.ui.activity;

import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C5266;
import lin.xposed.hook.loader.config.AbstractC5554;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import p026.AbstractC6293;
import p026.AbstractC6296;
import p052.InterfaceC6553;
import p331.C8799;
import p336.AbstractC8805;
import p342.C8821;
import p354.C8885;
import p354.C8891;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$3$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public SettingActivityKt$SettingRoute$1$2$1$5$3$1(Object obj) {
        super(2, obj, C8891.class, "onFunctionToggle", "onFunctionToggle(Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;Z)V", 0);
    }

    public final void invoke(ItemUiInfo itemUiInfo, boolean z) {
        Object value;
        C8885 c8885;
        "p0";
        itemUiInfo.getClass();
        C8891 c8891 = (C8891) this.receiver;
        c8891.getClass();
        "itemUiInfo";
        AbstractC6296 abstractC6296 = itemUiInfo.item;
        AbstractC6293 abstractC6293 = abstractC6296 instanceof AbstractC6293 ? (AbstractC6293) abstractC6296 : null;
        if (abstractC6293 == null) {
            return;
        }
        C8799 c8799 = new C8799();
        c8799.f24761 = "0";
        c8799.f24760 = "\u672a\u540c\u6b65";
        c8799.f24759 = 0;
        c8799.f24758 = "\u672a\u540c\u6b65";
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, "user_info");
        if (c87992 != null) {
            c8799 = c87992;
        }
        AbstractC8805 abstractC8805 = abstractC6293 instanceof AbstractC8805 ? (AbstractC8805) abstractC6293 : null;
        if (abstractC8805 == null || abstractC8805.mo11257(c8799)) {
            abstractC6293.f17376 = Boolean.valueOf(z);
            AbstractC5554.m10833(abstractC6293);
            if (z) {
                try {
                    abstractC6293.startLoadHook();
                } catch (Exception e) {
                    abstractC6293.getExceptionCollectionToolInstance().m11804(e);
                }
            }
            C5266 c5266 = c8891.f25055;
            do {
                value = c5266.getValue();
                c8885 = (C8885) value;
            } while (!c5266.m10308(value, C8885.m14524(c8885, null, 0, c8885.f25039 + 1, false, null, null, null, null, 503)));
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ItemUiInfo) obj, ((Boolean) obj2).booleanValue());
        return C5175.f14739;
    }
}
