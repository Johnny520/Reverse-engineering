package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.animation.Animation f910a;
        public final android.animation.AnimatorSet b;

        public a(android.animation.Animator r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f910a = r0
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                r1.b = r0
                r0.play(r2)
                return
        }

        public a(android.view.animation.Animation r1) {
                r0 = this;
                r0.<init>()
                r0.f910a = r1
                r1 = 0
                r0.b = r1
                return
        }
    }

    public static class b extends android.view.animation.AnimationSet implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.ViewGroup f911a;
        public final android.view.View b;
        public boolean c;
        public boolean d;
        public boolean e;

        public b(android.view.animation.Animation r2, android.view.ViewGroup r3, android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.e = r0
                r1.f911a = r3
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
                android.view.ViewGroup r3 = r2.f911a
                a.ViewTreeObserverOnPreDrawListenerC0178hc.a(r3, r2)
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
                android.view.ViewGroup r3 = r2.f911a
                a.ViewTreeObserverOnPreDrawListenerC0178hc.a(r3, r2)
            L18:
                return r0
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                boolean r0 = r2.c
                android.view.ViewGroup r1 = r2.f911a
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

    public static int a(android.content.Context r1, int r2) {
            r0 = 16973825(0x1030001, float:2.4060903E-38)
            int[] r2 = new int[]{r2}
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0, r2)
            r2 = 0
            r0 = -1
            int r2 = r1.getResourceId(r2, r0)
            r1.recycle()
            return r2
    }
}
