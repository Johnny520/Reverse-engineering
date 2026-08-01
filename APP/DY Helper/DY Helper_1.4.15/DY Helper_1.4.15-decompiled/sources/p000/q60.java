package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q60 extends android.view.animation.AnimationSet implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final android.view.ViewGroup f8885;

    /* JADX INFO: renamed from: ζ */
    public boolean f8886;

    /* JADX INFO: renamed from: η */
    public boolean f8887;

    /* JADX INFO: renamed from: θ */
    public boolean f8888;

    public q60(android.view.animation.Animation r2, android.view.ViewGroup r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = 1
            r1.f8888 = r0
            r1.f8885 = r3
            r1.addAnimation(r2)
            r3.post(r1)
            return
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long r3, android.view.animation.Transformation r5) {
            r2 = this;
            r0 = 1
            r2.f8888 = r0
            boolean r1 = r2.f8886
            if (r1 == 0) goto Lb
            boolean r2 = r2.f8887
            r2 = r2 ^ r0
            return r2
        Lb:
            boolean r3 = super.getTransformation(r3, r5)
            if (r3 != 0) goto L18
            r2.f8886 = r0
            android.view.ViewGroup r3 = r2.f8885
            p000.h51.m2360(r3, r2)
        L18:
            return r0
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long r3, android.view.animation.Transformation r5, float r6) {
            r2 = this;
            r0 = 1
            r2.f8888 = r0
            boolean r1 = r2.f8886
            if (r1 == 0) goto Lb
            boolean r2 = r2.f8887
            r2 = r2 ^ r0
            return r2
        Lb:
            boolean r3 = super.getTransformation(r3, r5, r6)
            if (r3 != 0) goto L18
            r2.f8886 = r0
            android.view.ViewGroup r3 = r2.f8885
            p000.h51.m2360(r3, r2)
        L18:
            return r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            boolean r0 = r2.f8886
            android.view.ViewGroup r1 = r2.f8885
            if (r0 != 0) goto L11
            boolean r0 = r2.f8888
            if (r0 == 0) goto L11
            r0 = 0
            r2.f8888 = r0
            r1.post(r2)
            return
        L11:
            r0 = 0
            r1.endViewTransition(r0)
            r0 = 1
            r2.f8887 = r0
            return
    }
}
