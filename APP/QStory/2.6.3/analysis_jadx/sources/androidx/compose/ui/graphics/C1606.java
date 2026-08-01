package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1606 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f4706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4708;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public RenderEffect f4709;

    public C1606(float f, float f2, int i) {
        this.f4708 = f;
        this.f4707 = f2;
        this.f4706 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1606)) {
            return false;
        }
        C1606 c1606 = (C1606) obj;
        return this.f4708 == c1606.f4708 && this.f4707 == c1606.f4707 && this.f4706 == c1606.f4706;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4706) + AbstractC0053.m145(Float.hashCode(this.f4708) * 31, this.f4707, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f4708 + ", radiusY=" + this.f4707 + ", edgeTreatment=" + ((Object) AbstractC1581.m2877(this.f4706)) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final RenderEffect m2958() {
        RenderEffect renderEffectCreateOffsetEffect = this.f4709;
        if (renderEffectCreateOffsetEffect == null) {
            float f = this.f4708;
            float f2 = this.f4707;
            renderEffectCreateOffsetEffect = (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, AbstractC1581.m2874(this.f4706));
            this.f4709 = renderEffectCreateOffsetEffect;
        }
        return renderEffectCreateOffsetEffect;
    }
}
