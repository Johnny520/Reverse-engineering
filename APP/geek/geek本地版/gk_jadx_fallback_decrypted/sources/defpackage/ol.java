package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ol extends android.view.animation.AnimationSet implements java.lang.Runnable {
    public final android.view.ViewGroup a;
    public final android.view.View b;
    public boolean c;
    public boolean d;
    public boolean e;

    public ol(android.view.animation.Animation r2, android.view.ViewGroup r3, android.view.View r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = 1
            r1.e = r0
            r1.a = r3
            r1.b = r4
            r1.addAnimation(r2)
            r3.post(r1)
            return
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long r3, android.view.animation.Transformation r5) {
            r2 = this;
            r0 = 1
            r2.e = r0
            boolean r1 = r2.c
            if (r1 == 0) goto Lb
            boolean r3 = r2.d
            r3 = r3 ^ r0
            return r3
        Lb:
            boolean r3 = super.getTransformation(r3, r5)
            if (r3 != 0) goto L18
            r2.c = r0
            android.view.ViewGroup r3 = r2.a
            defpackage.cx.a(r3, r2)
        L18:
            return r0
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long r3, android.view.animation.Transformation r5, float r6) {
            r2 = this;
            r0 = 1
            r2.e = r0
            boolean r1 = r2.c
            if (r1 == 0) goto Lb
            boolean r3 = r2.d
            r3 = r3 ^ r0
            return r3
        Lb:
            boolean r3 = super.getTransformation(r3, r5, r6)
            if (r3 != 0) goto L18
            r2.c = r0
            android.view.ViewGroup r3 = r2.a
            defpackage.cx.a(r3, r2)
        L18:
            return r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            boolean r0 = r2.c
            android.view.ViewGroup r1 = r2.a
            if (r0 != 0) goto L11
            boolean r0 = r2.e
            if (r0 == 0) goto L11
            r0 = 0
            r2.e = r0
            r1.post(r2)
            return
        L11:
            android.view.View r0 = r2.b
            r1.endViewTransition(r0)
            r0 = 1
            r2.d = r0
            return
    }
}
