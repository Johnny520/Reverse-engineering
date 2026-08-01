package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.appcompat.app.C0113;
import kotlin.jvm.internal.AbstractC4395;
import p112.C7326;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1574 extends AbstractC1598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f4654 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0113 f4655;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract Shader mo2868(long j);

    @Override // androidx.compose.ui.graphics.AbstractC1598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2851(float f, long j, C1609 c1609) {
        Paint paint = (Paint) c1609.f4716;
        C0113 c0113 = this.f4655;
        if (c0113 == null || !C7326.m12515(this.f4654, j)) {
            if (C7326.m12513(j)) {
                this.f4655 = null;
                this.f4654 = 9205357640488583168L;
                c0113 = null;
            } else {
                c0113 = this.f4655;
                if (c0113 == null) {
                    c0113 = new C0113(20, false);
                    this.f4655 = c0113;
                }
                c0113.f357 = mo2868(j);
                this.f4655 = c0113;
                this.f4654 = j;
            }
        }
        long jM2882 = AbstractC1581.m2882(paint.getColor());
        long j2 = C1599.f4696;
        if (!C1599.m2949(jM2882, j2)) {
            c1609.m2969(j2);
        }
        if (!AbstractC4395.m8907((Shader) c1609.f4715, c0113 != null ? (Shader) c0113.f357 : null)) {
            c1609.m2972(c0113 != null ? (Shader) c0113.f357 : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        c1609.m2959(f);
    }
}
