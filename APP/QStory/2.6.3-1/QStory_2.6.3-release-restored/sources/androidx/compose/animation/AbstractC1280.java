package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.appcompat.app.C0960;
import androidx.compose.animation.core.C1179;
import androidx.compose.animation.core.InterfaceC1180;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f1743 = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC1180 m1685(InterfaceC2208 interfaceC2208) {
        C2159 c2159 = (C2159) interfaceC2208;
        InterfaceC8725 interfaceC8725 = (InterfaceC8725) c2159.m2943(AbstractC2737.f5933);
        boolean zM2923 = c2159.m2923(interfaceC8725.mo1816());
        Object objM2905 = c2159.m2905();
        if (zM2923 || objM2905 == C2204.f4319) {
            objM2905 = new C1179(new C0960(interfaceC8725));
            c2159.m2946(objM2905);
        }
        return (InterfaceC1180) objM2905;
    }
}
