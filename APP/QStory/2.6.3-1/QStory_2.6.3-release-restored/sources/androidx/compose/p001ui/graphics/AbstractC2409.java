package androidx.compose.p001ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.appcompat.app.C0960;
import kotlin.jvm.internal.AbstractC5227;
import p128.C8155;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2409 extends AbstractC2433 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f4999 = 9205357640488583168L;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0960 f5000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract Shader mo3428(long j);

    @Override // androidx.compose.p001ui.graphics.AbstractC2433
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3411(float f, long j, C2444 c2444) {
        Paint paint = (Paint) c2444.f5061;
        C0960 c0960 = this.f5000;
        if (c0960 == null || !C8155.m13074(this.f4999, j)) {
            if (C8155.m13072(j)) {
                this.f5000 = null;
                this.f4999 = 9205357640488583168L;
                c0960 = null;
            } else {
                c0960 = this.f5000;
                if (c0960 == null) {
                    c0960 = new C0960(20, false);
                    this.f5000 = c0960;
                }
                c0960.f702 = mo3428(j);
                this.f5000 = c0960;
                this.f4999 = j;
            }
        }
        long jM3442 = AbstractC2416.m3442(paint.getColor());
        long j2 = C2434.f5041;
        if (!C2434.m3509(jM3442, j2)) {
            c2444.m3529(j2);
        }
        if (!AbstractC5227.m9466((Shader) c2444.f5060, c0960 != null ? (Shader) c0960.f702 : null)) {
            c2444.m3532(c0960 != null ? (Shader) c0960.f702 : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        c2444.m3519(f);
    }
}
