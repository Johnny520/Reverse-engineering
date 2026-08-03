package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: Rz */
/* JADX INFO: loaded from: classes.dex */
public final class C0772Rz extends Animation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2445a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0987Wz f2446b;

    public /* synthetic */ C0772Rz(C0987Wz c0987Wz, int i) {
        this.f2445a = i;
        this.f2446b = c0987Wz;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.f2445a) {
            case 0:
                this.f2446b.setAnimationProgress(f);
                break;
            case 1:
                this.f2446b.setAnimationProgress(1.0f - f);
                break;
            case 2:
                C0987Wz c0987Wz = this.f2446b;
                int iAbs = c0987Wz.f3155x - Math.abs(c0987Wz.f3154w);
                c0987Wz.setTargetOffsetTopAndBottom((c0987Wz.f3153v + ((int) ((iAbs - r1) * f))) - c0987Wz.f3151t.getTop());
                C2661w9 c2661w9 = c0987Wz.f3157z;
                float f2 = 1.0f - f;
                C2618v9 c2618v9 = c2661w9.f9207a;
                if (f2 != c2618v9.f9089p) {
                    c2618v9.f9089p = f2;
                }
                c2661w9.invalidateSelf();
                break;
            default:
                this.f2446b.m1871k(f);
                break;
        }
    }
}
