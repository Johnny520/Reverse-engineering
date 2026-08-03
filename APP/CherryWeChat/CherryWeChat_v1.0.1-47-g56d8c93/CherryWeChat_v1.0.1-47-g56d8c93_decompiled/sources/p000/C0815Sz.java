package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: Sz */
/* JADX INFO: loaded from: classes.dex */
public final class C0815Sz extends Animation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2583a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2584b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0987Wz f2585c;

    public C0815Sz(C0987Wz c0987Wz, int i, int i2) {
        this.f2585c = c0987Wz;
        this.f2583a = i;
        this.f2584b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f2585c.f3157z.setAlpha((int) (((this.f2584b - r0) * f) + this.f2583a));
    }
}
