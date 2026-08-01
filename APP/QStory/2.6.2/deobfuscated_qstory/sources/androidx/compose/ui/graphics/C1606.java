package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1606 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f4705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public RenderEffect f4708;

    public C1606(float f, float f2, int i) {
        this.f4707 = f;
        this.f4706 = f2;
        this.f4705 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1606)) {
            return false;
        }
        C1606 c1606 = (C1606) obj;
        return this.f4707 == c1606.f4707 && this.f4706 == c1606.f4706 && this.f4705 == c1606.f4705;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4705) + AbstractC0053.m144(Float.hashCode(this.f4707) * 31, this.f4706, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f4707 + ", radiusY=" + this.f4706 + ", edgeTreatment=" + ((Object) AbstractC1581.m2867(this.f4705)) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final RenderEffect m2948() {
        RenderEffect renderEffectCreateOffsetEffect = this.f4708;
        if (renderEffectCreateOffsetEffect == null) {
            float f = this.f4707;
            float f2 = this.f4706;
            renderEffectCreateOffsetEffect = (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, AbstractC1581.m2864(this.f4705));
            this.f4708 = renderEffectCreateOffsetEffect;
        }
        return renderEffectCreateOffsetEffect;
    }
}
