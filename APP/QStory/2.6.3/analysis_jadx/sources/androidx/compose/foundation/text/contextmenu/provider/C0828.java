package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.animation.AbstractC0387;
import androidx.compose.animation.AbstractC0401;
import androidx.compose.animation.C0407;
import androidx.compose.animation.InterfaceC0418;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.layout.InterfaceC1695;
import io.ktor.util.C4207;
import kotlin.C5176;
import p052.InterfaceC6558;
import p287.AbstractC8405;
import p350.C8853;
import top.suzhelan.qstory.ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0828 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2353;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2354;

    public /* synthetic */ C0828(InterfaceC1395 interfaceC1395, int i) {
        this.f2354 = i;
        this.f2353 = interfaceC1395;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2354;
        InterfaceC1395 interfaceC1395 = this.f2353;
        switch (i) {
            case 0:
                interfaceC1395.setValue((InterfaceC1695) obj);
                return C5176.f14739;
            default:
                AbstractC8405.m13972(2902);
                ((InterfaceC0418) obj).getClass();
                SettingPageTransitionDirection settingPageTransitionDirection = ((C8853) interfaceC1395.getValue()).f24961;
                SettingPageTransitionDirection settingPageTransitionDirection2 = SettingPageTransitionDirection.Forward;
                C0407 c0407 = new C0407(settingPageTransitionDirection == settingPageTransitionDirection2 ? AbstractC0387.m1087(new C4207(18)).m1099(AbstractC0387.m1080(null, 3)) : AbstractC0387.m1087(new C4207(19)).m1099(AbstractC0387.m1080(null, 3)), ((C8853) interfaceC1395.getValue()).f24961 == settingPageTransitionDirection2 ? AbstractC0387.m1086(new C4207(20)).m1098(AbstractC0387.m1091(null, 3)) : AbstractC0387.m1086(new C4207(21)).m1098(AbstractC0387.m1091(null, 3)));
                c0407.f1351 = AbstractC0401.m1109(2);
                return c0407;
        }
    }
}
