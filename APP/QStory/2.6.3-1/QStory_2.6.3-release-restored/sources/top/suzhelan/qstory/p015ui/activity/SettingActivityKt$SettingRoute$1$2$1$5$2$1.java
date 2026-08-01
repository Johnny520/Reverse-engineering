package top.suzhelan.qstory.p015ui.activity;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C6099;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p068.InterfaceC7387;
import p366.C9682;
import p366.C9688;
import top.suzhelan.qstory.p015ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$2$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public SettingActivityKt$SettingRoute$1$2$1$5$2$1(Object obj) {
        super(1, obj, C9688.class, "onDirectoryClick", "onDirectoryClick(Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;)V", 0);
    }

    public final void invoke(DirectoryUiInfo directoryUiInfo) {
        "p0";
        directoryUiInfo.getClass();
        C9688 c9688 = (C9688) this.receiver;
        c9688.getClass();
        "targetDirectory";
        C6099 c6099 = c9688.f25324;
        while (true) {
            Object value = c6099.getValue();
            DirectoryUiInfo directoryUiInfo2 = directoryUiInfo;
            if (c6099.m10871(value, C9682.m15079((C9682) value, directoryUiInfo2, -1, 0, false, SettingPageTransitionDirection.Forward, null, null, null, 473))) {
                return;
            } else {
                directoryUiInfo = directoryUiInfo2;
            }
        }
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DirectoryUiInfo) obj);
        return C6008.f15084;
    }
}
