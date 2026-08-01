package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.appcompat.app.C0113;
import kotlin.jvm.internal.AbstractC4394;
import p112.C7325;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1574 extends AbstractC1598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f4653 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0113 f4654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract Shader mo2858(long j);

    @Override // androidx.compose.ui.graphics.AbstractC1598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2841(float f, long j, C1609 c1609) {
        Paint paint = (Paint) c1609.f4715;
        C0113 c0113 = this.f4654;
        if (c0113 == null || !C7325.m12488(this.f4653, j)) {
            if (C7325.m12486(j)) {
                this.f4654 = null;
                this.f4653 = 9205357640488583168L;
                c0113 = null;
            } else {
                c0113 = this.f4654;
                if (c0113 == null) {
                    c0113 = new C0113(20, false);
                    this.f4654 = c0113;
                }
                c0113.f357 = mo2858(j);
                this.f4654 = c0113;
                this.f4653 = j;
            }
        }
        long jM2872 = AbstractC1581.m2872(paint.getColor());
        long j2 = C1599.f4695;
        if (!C1599.m2939(jM2872, j2)) {
            c1609.m2959(j2);
        }
        if (!AbstractC4394.m8917((Shader) c1609.f4714, c0113 != null ? (Shader) c0113.f357 : null)) {
            c1609.m2962(c0113 != null ? (Shader) c0113.f357 : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        c1609.m2949(f);
    }
}
