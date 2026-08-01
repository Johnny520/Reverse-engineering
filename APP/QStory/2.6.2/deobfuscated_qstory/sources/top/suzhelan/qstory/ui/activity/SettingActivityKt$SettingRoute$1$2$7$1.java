package top.suzhelan.qstory.ui.activity;

import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4210;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C5266;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import p007.C6132;
import p007.C6143;
import p052.InterfaceC6557;
import p354.AbstractC8892;
import p354.C8885;
import p354.C8891;
import top.suzhelan.qstory.ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$7$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public SettingActivityKt$SettingRoute$1$2$7$1(Object obj) {
        super(1, obj, C8891.class, "onSearchResultSelected", "onSearchResultSelected(Llin/xposed/hook/view/main/SearchHelper$SearchResult;)V", 0);
    }

    public final void invoke(C6143 c6143) {
        Object value;
        C8885 c8885M14524;
        "p0";
        c6143.getClass();
        C8891 c8891 = (C8891) this.receiver;
        c8891.getClass();
        "result";
        C6132 c6132 = C6132.f16715;
        String str = c6143.f16743;
        c6132.getClass();
        C6132.m11527(str);
        C5266 c5266 = c8891.f25055;
        do {
            value = c5266.getValue();
            C8885 c8885 = (C8885) value;
            int i = AbstractC8892.f25056[c6143.f16739.ordinal()];
            if (i == 1 || i == 2) {
                Object obj = c6143.f16738;
                DirectoryUiInfo directoryUiInfo = obj instanceof DirectoryUiInfo ? (DirectoryUiInfo) obj : null;
                if (directoryUiInfo == null) {
                    String strM6668 = "";
                    C6132.f16715.getClass();
                    c8885M14524 = C8885.m14524(c8885, null, 0, 0, false, null, strM6668, C6132.m11528(), EmptyList.INSTANCE, 47);
                } else {
                    int i2 = c6143.f16740;
                    DirectoryUiInfo directoryUiInfo2 = c8885.f25041;
                    SettingPageTransitionDirection settingPageTransitionDirection = AbstractC4394.m8917(directoryUiInfo2 != null ? directoryUiInfo2.getItemName() : null, directoryUiInfo.getItemName()) ? c8885.f25037 : SettingPageTransitionDirection.Forward;
                    String strM66682 = "";
                    C6132.f16715.getClass();
                    c8885M14524 = C8885.m14524(c8885, directoryUiInfo, i2, 0, false, settingPageTransitionDirection, strM66682, C6132.m11528(), EmptyList.INSTANCE, 9);
                }
            } else {
                if (i != 3) {
                    C4210.m8621();
                    return;
                }
                int i3 = c6143.f16740;
                SettingPageTransitionDirection settingPageTransitionDirection2 = SettingPageTransitionDirection.Backward;
                String strM66683 = "";
                C6132.f16715.getClass();
                c8885M14524 = C8885.m14524(c8885, null, i3, 0, false, settingPageTransitionDirection2, strM66683, C6132.m11528(), EmptyList.INSTANCE, 9);
            }
        } while (!c5266.m10308(value, c8885M14524));
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C6143) obj);
        return C5175.f14739;
    }
}
