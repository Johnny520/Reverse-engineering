package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC2465 implements Interpolator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7339;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f7339) {
            case 0:
                return f * f * f * f * f;
            case 1:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
