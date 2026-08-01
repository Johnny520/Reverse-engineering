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
import androidx.window.area.AbstractC2567;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p112.C7328;
import p116.AbstractC7347;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0998 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4871 f2924 = AbstractC7347.m12540(new C0753(4), new C0995(5));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f2925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1397 f2930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1397 f2929 = AbstractC1367.m2478(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1398 f2928 = AbstractC1367.m2477(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7328 f2927 = C7328.f19536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f2926 = C2035.f6003;

    public C0998(Orientation orientation, float f) {
        this.f2930 = AbstractC1367.m2478(f);
        this.f2925 = AbstractC1367.m2475(orientation, C1353.f3922);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1918(Orientation orientation, C7328 c7328, int i, int i2) {
        float f = i2 - i;
        ((AbstractC1349) this.f2929).m2435(f);
        float f2 = c7328.f19540;
        float f3 = c7328.f19539;
        C7328 c73282 = this.f2927;
        float f4 = c73282.f19540;
        InterfaceC1397 interfaceC1397 = this.f2930;
        if (f2 != f4 || f3 != c73282.f19539) {
            boolean z = orientation == Orientation.Vertical;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? c7328.f19537 : c7328.f19538;
            float fM1919 = m1919();
            float f6 = i;
            float f7 = fM1919 + f6;
            ((AbstractC1349) interfaceC1397).m2435(m1919() + ((f5 <= f7 && (f2 >= fM1919 || f5 - f2 <= f6)) ? (f2 >= fM1919 || f5 - f2 > f6) ? 0.0f : f2 - fM1919 : f5 - f7));
            this.f2927 = c7328;
        }
        ((AbstractC1349) interfaceC1397).m2435(AbstractC2567.m5071(m1919(), 0.0f, f));
        ((AbstractC1346) this.f2928).m2433(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m1919() {
        return ((AbstractC1349) this.f2930).m2434();
    }
}
