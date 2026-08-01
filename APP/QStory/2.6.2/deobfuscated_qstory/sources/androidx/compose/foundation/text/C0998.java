package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0753;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.runtime.InterfaceC1398;
import androidx.compose.ui.text.C2035;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p000.AbstractC6087;
import p112.C7327;
import p116.AbstractC7346;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0998 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4870 f2923 = AbstractC7346.m12513(new C0753(4), new C0995(5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f2924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1397 f2929;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1397 f2928 = AbstractC1367.m2469(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1398 f2927 = AbstractC1367.m2468(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7327 f2926 = C7327.f19541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f2925 = C2035.f6002;

    public C0998(Orientation orientation, float f) {
        this.f2929 = AbstractC1367.m2469(f);
        this.f2924 = AbstractC1367.m2466(orientation, C1353.f3921);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1908(Orientation orientation, C7327 c7327, int i, int i2) {
        float f = i2 - i;
        ((AbstractC1349) this.f2928).m2425(f);
        float f2 = c7327.f19545;
        float f3 = c7327.f19544;
        C7327 c73272 = this.f2926;
        float f4 = c73272.f19545;
        InterfaceC1397 interfaceC1397 = this.f2929;
        if (f2 != f4 || f3 != c73272.f19544) {
            boolean z = orientation == Orientation.Vertical;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? c7327.f19542 : c7327.f19543;
            float fM1909 = m1909();
            float f6 = i;
            float f7 = fM1909 + f6;
            ((AbstractC1349) interfaceC1397).m2425(m1909() + ((f5 <= f7 && (f2 >= fM1909 || f5 - f2 <= f6)) ? (f2 >= fM1909 || f5 - f2 > f6) ? 0.0f : f2 - fM1909 : f5 - f7));
            this.f2926 = c7327;
        }
        ((AbstractC1349) interfaceC1397).m2425(AbstractC6087.m11419(m1909(), 0.0f, f));
        ((AbstractC1346) this.f2927).m2423(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m1909() {
        return ((AbstractC1349) this.f2929).m2424();
    }
}
