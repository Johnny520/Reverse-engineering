package yyds;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: yyds.ᲈᛷᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC2694 implements Interpolator {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f13243;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f13243) {
            case 0:
                return f * f * f * f * f;
            case 1:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
