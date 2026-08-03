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

    public C0815Sz(C0987Wz r1, int r2, int r3) {
        this.f2585c = r1;
        this.f2583a = r2;
        this.f2584b = r3;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float r4, Transformation r5) {
        this.f2585c.f3157z.setAlpha((int) (((this.f2584b - r0) * r4) + this.f2583a));
    }
}
