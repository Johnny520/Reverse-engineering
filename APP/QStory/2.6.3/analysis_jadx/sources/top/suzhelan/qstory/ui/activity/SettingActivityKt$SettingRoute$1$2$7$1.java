package top.suzhelan.qstory.ui.activity;

import io.ktor.util.C4211;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C5267;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p009.C6170;
import p009.C6174;
import p052.InterfaceC6558;
import p287.AbstractC8405;
import p350.AbstractC8860;
import p350.C8853;
import p350.C8859;
import top.suzhelan.qstory.ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$7$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public SettingActivityKt$SettingRoute$1$2$7$1(Object obj) {
        super(1, obj, C8859.class, AbstractC8405.m13972(2895), AbstractC8405.m13972(2896), 0);
    }

    public final void invoke(C6174 c6174) {
        Object value;
        C8853 c8853M14520;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵呜");
        c6174.getClass();
        C8859 c8859 = (C8859) this.receiver;
        c8859.getClass();
        AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵");
        C6170 c6170 = C6170.f16967;
        String str = c6174.f16983;
        c6170.getClass();
        C6170.m11565(str);
        C5267 c5267 = c8859.f24979;
        do {
            value = c5267.getValue();
            C8853 c8853 = (C8853) value;
            int i = AbstractC8860.f24980[c6174.f16979.ordinal()];
            if (i == 1 || i == 2) {
                Object obj = c6174.f16978;
                DirectoryUiInfo directoryUiInfo = obj instanceof DirectoryUiInfo ? (DirectoryUiInfo) obj : null;
                if (directoryUiInfo == null) {
                    C6170.f16967.getClass();
                    c8853M14520 = C8853.m14520(c8853, null, 0, 0, false, null, "", C6170.m11566(), EmptyList.INSTANCE, 47);
                } else {
                    int i2 = c6174.f16980;
                    DirectoryUiInfo directoryUiInfo2 = c8853.f24965;
                    SettingPageTransitionDirection settingPageTransitionDirection = AbstractC4395.m8907(directoryUiInfo2 != null ? directoryUiInfo2.getItemName() : null, directoryUiInfo.getItemName()) ? c8853.f24961 : SettingPageTransitionDirection.Forward;
                    C6170.f16967.getClass();
                    c8853M14520 = C8853.m14520(c8853, directoryUiInfo, i2, 0, false, settingPageTransitionDirection, "", C6170.m11566(), EmptyList.INSTANCE, 9);
                }
            } else {
                if (i != 3) {
                    C4211.m8611();
                    return;
                }
                int i3 = c6174.f16980;
                SettingPageTransitionDirection settingPageTransitionDirection2 = SettingPageTransitionDirection.Backward;
                C6170.f16967.getClass();
                c8853M14520 = C8853.m14520(c8853, null, i3, 0, false, settingPageTransitionDirection2, "", C6170.m11566(), EmptyList.INSTANCE, 9);
            }
        } while (!c5267.m10312(value, c8853M14520));
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C6174) obj);
        return C5176.f14739;
    }
}
