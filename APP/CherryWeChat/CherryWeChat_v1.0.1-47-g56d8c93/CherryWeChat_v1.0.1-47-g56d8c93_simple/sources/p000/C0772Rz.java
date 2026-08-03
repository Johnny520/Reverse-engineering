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

    public /* synthetic */ C0772Rz(C0987Wz r1, int r2) {
        this.f2445a = r2;
        this.f2446b = r1;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float r3, Transformation r4) {
        switch(this.f2445a) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        this.f2446b.m1871k(r3);
        return;
    L6:
        C0987Wz r42 = this.f2446b;
        int r0 = r42.f3155x - Math.abs(r42.f3154w);
        r42.setTargetOffsetTopAndBottom((r42.f3153v + ((int) ((r0 - r1) * r3))) - r42.f3151t.getTop());
        C2661w9 r43 = r42.f3157z;
        float r02 = 1.0f - r3;
        C2618v9 r32 = r43.f9207a;
        if (r02 == r32.f9089p) goto L9;
        r32.f9089p = r02;
    L9:
        r43.invalidateSelf();
        return;
    L11:
        this.f2446b.setAnimationProgress(1.0f - r3);
        return;
    L13:
        this.f2446b.setAnimationProgress(r3);
    }
}
