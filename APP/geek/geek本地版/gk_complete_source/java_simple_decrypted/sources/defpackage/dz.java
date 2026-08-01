package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class dz implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ dz(int r1) {
        this.a = r1;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r3) {
        switch(this.a) {
            case 0: goto L4;
            default: goto L4;
        };
    L4:
        float r32 = r3 - 1.0f;
        return ((((r32 * r32) * r32) * r32) * r32) + 1.0f;
    }
}
