package top.suzhelan.qstory.p015ui.activity;

import io.ktor.util.C5043;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C6099;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p025.C6999;
import p025.C7003;
import p068.InterfaceC7387;
import p303.AbstractC9234;
import p366.AbstractC9689;
import p366.C9682;
import p366.C9688;
import top.suzhelan.qstory.p015ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$7$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public SettingActivityKt$SettingRoute$1$2$7$1(Object obj) {
        super(1, obj, C9688.class, AbstractC9234.m14531(2895), AbstractC9234.m14531(2896), 0);
    }

    public final void invoke(C7003 c7003) {
        Object value;
        C9682 c9682M15079;
        AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵呜");
        c7003.getClass();
        C9688 c9688 = (C9688) this.receiver;
        c9688.getClass();
        AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵");
        C6999 c6999 = C6999.f17312;
        String str = c7003.f17328;
        c6999.getClass();
        C6999.m12124(str);
        C6099 c6099 = c9688.f25324;
        do {
            value = c6099.getValue();
            C9682 c9682 = (C9682) value;
            int i = AbstractC9689.f25325[c7003.f17324.ordinal()];
            if (i == 1 || i == 2) {
                Object obj = c7003.f17323;
                DirectoryUiInfo directoryUiInfo = obj instanceof DirectoryUiInfo ? (DirectoryUiInfo) obj : null;
                if (directoryUiInfo == null) {
                    C6999.f17312.getClass();
                    c9682M15079 = C9682.m15079(c9682, null, 0, 0, false, null, "", C6999.m12125(), EmptyList.INSTANCE, 47);
                } else {
                    int i2 = c7003.f17325;
                    DirectoryUiInfo directoryUiInfo2 = c9682.f25310;
                    SettingPageTransitionDirection settingPageTransitionDirection = AbstractC5227.m9466(directoryUiInfo2 != null ? directoryUiInfo2.getItemName() : null, directoryUiInfo.getItemName()) ? c9682.f25306 : SettingPageTransitionDirection.Forward;
                    C6999.f17312.getClass();
                    c9682M15079 = C9682.m15079(c9682, directoryUiInfo, i2, 0, false, settingPageTransitionDirection, "", C6999.m12125(), EmptyList.INSTANCE, 9);
                }
            } else {
                if (i != 3) {
                    C5043.m9170();
                    return;
                }
                int i3 = c7003.f17325;
                SettingPageTransitionDirection settingPageTransitionDirection2 = SettingPageTransitionDirection.Backward;
                C6999.f17312.getClass();
                c9682M15079 = C9682.m15079(c9682, null, i3, 0, false, settingPageTransitionDirection2, "", C6999.m12125(), EmptyList.INSTANCE, 9);
            }
        } while (!c6099.m10871(value, c9682M15079));
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C7003) obj);
        return C6008.f15084;
    }
}
