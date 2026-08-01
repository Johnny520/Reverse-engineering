package androidx.compose.p001ui.graphics;

import android.graphics.RenderEffect;
import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2441 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f5051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f5052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f5053;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public RenderEffect f5054;

    public C2441(float f, float f2, int i) {
        this.f5053 = f;
        this.f5052 = f2;
        this.f5051 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2441)) {
            return false;
        }
        C2441 c2441 = (C2441) obj;
        return this.f5053 == c2441.f5053 && this.f5052 == c2441.f5052 && this.f5051 == c2441.f5051;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5051) + AbstractC0900.m705(Float.hashCode(this.f5053) * 31, this.f5052, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f5053 + ", radiusY=" + this.f5052 + ", edgeTreatment=" + ((Object) AbstractC2416.m3437(this.f5051)) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final RenderEffect m3518() {
        RenderEffect renderEffectCreateOffsetEffect = this.f5054;
        if (renderEffectCreateOffsetEffect == null) {
            float f = this.f5053;
            float f2 = this.f5052;
            renderEffectCreateOffsetEffect = (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, AbstractC2416.m3434(this.f5051));
            this.f5054 = renderEffectCreateOffsetEffect;
        }
        return renderEffectCreateOffsetEffect;
    }
}
