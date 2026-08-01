package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.animation.AbstractC1233;
import androidx.compose.animation.AbstractC1247;
import androidx.compose.animation.C1253;
import androidx.compose.animation.InterfaceC1264;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.runtime.InterfaceC2230;
import io.ktor.util.C5039;
import kotlin.C6008;
import p068.InterfaceC7387;
import p303.AbstractC9234;
import p366.C9682;
import top.suzhelan.qstory.p015ui.viewmodel.SettingPageTransitionDirection;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1668 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2230 f2698;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2699;

    public /* synthetic */ C1668(InterfaceC2230 interfaceC2230, int i) {
        this.f2699 = i;
        this.f2698 = interfaceC2230;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2699;
        InterfaceC2230 interfaceC2230 = this.f2698;
        switch (i) {
            case 0:
                interfaceC2230.setValue((InterfaceC2530) obj);
                return C6008.f15084;
            default:
                AbstractC9234.m14531(2902);
                ((InterfaceC1264) obj).getClass();
                SettingPageTransitionDirection settingPageTransitionDirection = ((C9682) interfaceC2230.getValue()).f25306;
                SettingPageTransitionDirection settingPageTransitionDirection2 = SettingPageTransitionDirection.Forward;
                C1253 c1253 = new C1253(settingPageTransitionDirection == settingPageTransitionDirection2 ? AbstractC1233.m1647(new C5039(18)).m1659(AbstractC1233.m1640(null, 3)) : AbstractC1233.m1647(new C5039(19)).m1659(AbstractC1233.m1640(null, 3)), ((C9682) interfaceC2230.getValue()).f25306 == settingPageTransitionDirection2 ? AbstractC1233.m1646(new C5039(20)).m1658(AbstractC1233.m1651(null, 3)) : AbstractC1233.m1646(new C5039(21)).m1658(AbstractC1233.m1651(null, 3)));
                c1253.f1696 = AbstractC1247.m1669(2);
                return c1253;
        }
    }
}
