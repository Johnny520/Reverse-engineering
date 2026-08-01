package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C1594;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import androidx.compose.runtime.InterfaceC2233;
import androidx.window.area.AbstractC3400;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p128.C8157;
import p132.AbstractC8176;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5703 f3269 = AbstractC8176.m13099(new C1594(4), new C1833(5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2230 f3270;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2232 f3275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2232 f3274 = AbstractC2202.m3038(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2233 f3273 = AbstractC2202.m3037(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8157 f3272 = C8157.f19881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f3271 = C2869.f6348;

    public C1836(Orientation orientation, float f) {
        this.f3275 = AbstractC2202.m3038(f);
        this.f3270 = AbstractC2202.m3035(orientation, C2188.f4267);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2478(Orientation orientation, C8157 c8157, int i, int i2) {
        float f = i2 - i;
        ((AbstractC2184) this.f3274).m2995(f);
        float f2 = c8157.f19885;
        float f3 = c8157.f19884;
        C8157 c81572 = this.f3272;
        float f4 = c81572.f19885;
        InterfaceC2232 interfaceC2232 = this.f3275;
        if (f2 != f4 || f3 != c81572.f19884) {
            boolean z = orientation == Orientation.Vertical;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? c8157.f19882 : c8157.f19883;
            float fM2479 = m2479();
            float f6 = i;
            float f7 = fM2479 + f6;
            ((AbstractC2184) interfaceC2232).m2995(m2479() + ((f5 <= f7 && (f2 >= fM2479 || f5 - f2 <= f6)) ? (f2 >= fM2479 || f5 - f2 > f6) ? 0.0f : f2 - fM2479 : f5 - f7));
            this.f3272 = c8157;
        }
        ((AbstractC2184) interfaceC2232).m2995(AbstractC3400.m5631(m2479(), 0.0f, f));
        ((AbstractC2181) this.f3273).m2993(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m2479() {
        return ((AbstractC2184) this.f3275).m2994();
    }
}
