package top.suzhelan.qstory.ui.activity;

import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C5266;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p052.InterfaceC6557;
import p354.C8885;
import p354.C8891;
import top.suzhelan.qstory.ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$2$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public SettingActivityKt$SettingRoute$1$2$1$5$2$1(Object obj) {
        super(1, obj, C8891.class, AbstractC3056.m6668(-3937272171882349991L), AbstractC3056.m6668(-3937272107457840551L), 0);
    }

    public final void invoke(DirectoryUiInfo directoryUiInfo) {
        AbstractC3056.m6668(-3937677187298362791L);
        directoryUiInfo.getClass();
        C8891 c8891 = (C8891) this.receiver;
        c8891.getClass();
        AbstractC3056.m6668(-3937342368827835815L);
        C5266 c5266 = c8891.f25055;
        while (true) {
            Object value = c5266.getValue();
            DirectoryUiInfo directoryUiInfo2 = directoryUiInfo;
            if (c5266.m10308(value, C8885.m14524((C8885) value, directoryUiInfo2, -1, 0, false, SettingPageTransitionDirection.Forward, null, null, null, 473))) {
                return;
            } else {
                directoryUiInfo = directoryUiInfo2;
            }
        }
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DirectoryUiInfo) obj);
        return C5175.f14739;
    }
}
