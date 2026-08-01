package p169;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC7718 implements Interpolator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7717 f20953;

    public InterpolatorC7718(C7717 c7717) {
        this.f20953 = c7717;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f20953.f20939.getInterpolation(f);
    }
}
