package p169;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC7717 implements Interpolator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7716 f20958;

    public InterpolatorC7717(C7716 c7716) {
        this.f20958 = c7716;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f20958.f20944.getInterpolation(f);
    }
}
