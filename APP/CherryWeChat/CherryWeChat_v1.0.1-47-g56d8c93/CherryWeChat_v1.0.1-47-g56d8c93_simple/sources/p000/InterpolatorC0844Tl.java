package p000;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: Tl */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC0844Tl implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2690a;

    public /* synthetic */ InterpolatorC0844Tl(int r1) {
        this.f2690a = r1;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r3) {
        switch(this.f2690a) {
            case 0: goto L7;
            case 1: goto L4;
            case 2: goto L4;
            case 3: goto L4;
            default: goto L4;
        };
    L4:
        float r32 = r3 - 1.0f;
        return ((((r32 * r32) * r32) * r32) * r32) + 1.0f;
    L7:
        return (((r3 * r3) * r3) * r3) * r3;
    }
}
