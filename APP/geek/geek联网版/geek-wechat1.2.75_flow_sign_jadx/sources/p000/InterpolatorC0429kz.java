package p000;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: kz */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC0429kz implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2884a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f2884a) {
        }
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
