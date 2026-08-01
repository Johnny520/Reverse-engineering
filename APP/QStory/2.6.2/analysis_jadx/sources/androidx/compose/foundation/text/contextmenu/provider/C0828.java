package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.animation.AbstractC0387;
import androidx.compose.animation.AbstractC0401;
import androidx.compose.animation.C0407;
import androidx.compose.animation.InterfaceC0418;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.layout.InterfaceC1695;
import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4206;
import kotlin.C5175;
import p052.InterfaceC6557;
import p354.C8885;
import top.suzhelan.qstory.ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0828 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2352;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2353;

    public /* synthetic */ C0828(InterfaceC1395 interfaceC1395, int i) {
        this.f2353 = i;
        this.f2352 = interfaceC1395;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2353;
        InterfaceC1395 interfaceC1395 = this.f2352;
        switch (i) {
            case 0:
                interfaceC1395.setValue((InterfaceC1695) obj);
                return C5175.f14739;
            default:
                AbstractC3056.m6668(-3937285104028878247L);
                ((InterfaceC0418) obj).getClass();
                SettingPageTransitionDirection settingPageTransitionDirection = ((C8885) interfaceC1395.getValue()).f25037;
                SettingPageTransitionDirection settingPageTransitionDirection2 = SettingPageTransitionDirection.Forward;
                C0407 c0407 = new C0407(settingPageTransitionDirection == settingPageTransitionDirection2 ? AbstractC0387.m1086(new C4206(21)).m1098(AbstractC0387.m1079(null, 3)) : AbstractC0387.m1086(new C4206(18)).m1098(AbstractC0387.m1079(null, 3)), ((C8885) interfaceC1395.getValue()).f25037 == settingPageTransitionDirection2 ? AbstractC0387.m1085(new C4206(19)).m1097(AbstractC0387.m1090(null, 3)) : AbstractC0387.m1085(new C4206(20)).m1097(AbstractC0387.m1090(null, 3)));
                c0407.f1351 = AbstractC0401.m1108(2);
                return c0407;
        }
    }
}
