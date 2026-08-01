package top.suzhelan.qstory.ui.activity;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C5267;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p052.InterfaceC6558;
import p287.AbstractC8405;
import p350.C8853;
import p350.C8859;
import top.suzhelan.qstory.ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$2$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public SettingActivityKt$SettingRoute$1$2$1$5$2$1(Object obj) {
        super(1, obj, C8859.class, AbstractC8405.m13972(2879), AbstractC8405.m13972(2880), 0);
    }

    public final void invoke(DirectoryUiInfo directoryUiInfo) {
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵呜");
        directoryUiInfo.getClass();
        C8859 c8859 = (C8859) this.receiver;
        c8859.getClass();
        AbstractC8405.m13972(3249);
        C5267 c5267 = c8859.f24979;
        while (true) {
            Object value = c5267.getValue();
            DirectoryUiInfo directoryUiInfo2 = directoryUiInfo;
            if (c5267.m10312(value, C8853.m14520((C8853) value, directoryUiInfo2, -1, 0, false, SettingPageTransitionDirection.Forward, null, null, null, 473))) {
                return;
            } else {
                directoryUiInfo = directoryUiInfo2;
            }
        }
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DirectoryUiInfo) obj);
        return C5176.f14739;
    }
}
