package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
class FragmentAnim {




    static class AnimationOrAnimator {
        public final android.view.animation.Animation animation;
        public final android.animation.Animator animator;

        AnimationOrAnimator(android.animation.Animator r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.animation = r0
                r2.animator = r3
                if (r3 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Animator cannot be null"
                r0.<init>(r1)
                throw r0
        }

        AnimationOrAnimator(android.view.animation.Animation r3) {
                r2 = this;
                r2.<init>()
                r2.animation = r3
                r0 = 0
                r2.animator = r0
                if (r3 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Animation cannot be null"
                r0.<init>(r1)
                throw r0
        }
    }

    static class EndViewTransitionAnimation extends android.view.animation.AnimationSet implements java.lang.Runnable {
        private boolean mAnimating;
        private final android.view.View mChild;
        private boolean mEnded;
        private final android.view.ViewGroup mParent;
        private boolean mTransitionEnded;

        EndViewTransitionAnimation(android.view.animation.Animation r2, android.view.ViewGroup r3, android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.mAnimating = r0
                r1.mParent = r3
                r1.mChild = r4
                r1.addAnimation(r2)
                android.view.ViewGroup r0 = r1.mParent
                r0.post(r1)
                return
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long r4, android.view.animation.Transformation r6) {
                r3 = this;
                r0 = 1
                r3.mAnimating = r0
                boolean r1 = r3.mEnded
                if (r1 == 0) goto Lb
                boolean r1 = r3.mTransitionEnded
                r0 = r0 ^ r1
                return r0
            Lb:
                boolean r1 = super.getTransformation(r4, r6)
                if (r1 != 0) goto L18
                r3.mEnded = r0
                android.view.ViewGroup r2 = r3.mParent
                androidx.core.view.OneShotPreDrawListener.add(r2, r3)
            L18:
                return r0
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long r4, android.view.animation.Transformation r6, float r7) {
                r3 = this;
                r0 = 1
                r3.mAnimating = r0
                boolean r1 = r3.mEnded
                if (r1 == 0) goto Lb
                boolean r1 = r3.mTransitionEnded
                r0 = r0 ^ r1
                return r0
            Lb:
                boolean r1 = super.getTransformation(r4, r6, r7)
                if (r1 != 0) goto L18
                r3.mEnded = r0
                android.view.ViewGroup r2 = r3.mParent
                androidx.core.view.OneShotPreDrawListener.add(r2, r3)
            L18:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.mEnded
                if (r0 != 0) goto L11
                boolean r0 = r2.mAnimating
                if (r0 == 0) goto L11
                r0 = 0
                r2.mAnimating = r0
                android.view.ViewGroup r0 = r2.mParent
                r0.post(r2)
                goto L1b
            L11:
                android.view.ViewGroup r0 = r2.mParent
                android.view.View r1 = r2.mChild
                r0.endViewTransition(r1)
                r0 = 1
                r2.mTransitionEnded = r0
            L1b:
                return
        }
    }

    private FragmentAnim() {
            r0 = this;
            r0.<init>()
            return
    }

    static void animateRemoveFragment(androidx.fragment.app.Fragment r11, androidx.fragment.app.FragmentAnim.AnimationOrAnimator r12, androidx.fragment.app.FragmentTransition.Callback r13) {
            android.view.View r6 = r11.mView
            android.view.ViewGroup r7 = r11.mContainer
            r7.startViewTransition(r6)
            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
            r0.<init>()
            r8 = r0
            androidx.fragment.app.FragmentAnim$1 r0 = new androidx.fragment.app.FragmentAnim$1
            r0.<init>(r11)
            r8.setOnCancelListener(r0)
            r13.onStart(r11, r8)
            android.view.animation.Animation r0 = r12.animation
            if (r0 == 0) goto L36
            androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r0 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
            android.view.animation.Animation r1 = r12.animation
            r0.<init>(r1, r7, r6)
            android.view.View r1 = r11.mView
            r11.setAnimatingAway(r1)
            androidx.fragment.app.FragmentAnim$2 r1 = new androidx.fragment.app.FragmentAnim$2
            r1.<init>(r7, r11, r13, r8)
            r0.setAnimationListener(r1)
            android.view.View r1 = r11.mView
            r1.startAnimation(r0)
            goto L53
        L36:
            android.animation.Animator r9 = r12.animator
            android.animation.Animator r0 = r12.animator
            r11.setAnimator(r0)
            androidx.fragment.app.FragmentAnim$3 r10 = new androidx.fragment.app.FragmentAnim$3
            r0 = r10
            r1 = r7
            r2 = r6
            r3 = r11
            r4 = r13
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r9.addListener(r10)
            android.view.View r0 = r11.mView
            r9.setTarget(r0)
            r9.start()
        L53:
            return
    }

    private static int getNextAnim(androidx.fragment.app.Fragment r1, boolean r2, boolean r3) {
            if (r3 == 0) goto Le
            if (r2 == 0) goto L9
            int r0 = r1.getPopEnterAnim()
            return r0
        L9:
            int r0 = r1.getPopExitAnim()
            return r0
        Le:
            if (r2 == 0) goto L15
            int r0 = r1.getEnterAnim()
            return r0
        L15:
            int r0 = r1.getExitAnim()
            return r0
    }

    static androidx.fragment.app.FragmentAnim.AnimationOrAnimator loadAnimation(android.content.Context r9, androidx.fragment.app.Fragment r10, boolean r11, boolean r12) {
            int r0 = r10.getNextTransition()
            int r1 = getNextAnim(r10, r11, r12)
            r2 = 0
            r10.setAnimations(r2, r2, r2, r2)
            android.view.ViewGroup r2 = r10.mContainer
            r3 = 0
            if (r2 == 0) goto L22
            android.view.ViewGroup r2 = r10.mContainer
            int r4 = androidx.fragment.C0240R.id.visible_removing_fragment_view_tag
            java.lang.Object r2 = r2.getTag(r4)
            if (r2 == 0) goto L22
            android.view.ViewGroup r2 = r10.mContainer
            int r4 = androidx.fragment.C0240R.id.visible_removing_fragment_view_tag
            r2.setTag(r4, r3)
        L22:
            android.view.ViewGroup r2 = r10.mContainer
            if (r2 == 0) goto L2f
            android.view.ViewGroup r2 = r10.mContainer
            android.animation.LayoutTransition r2 = r2.getLayoutTransition()
            if (r2 == 0) goto L2f
            return r3
        L2f:
            android.view.animation.Animation r2 = r10.onCreateAnimation(r0, r11, r1)
            if (r2 == 0) goto L3b
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r3 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r3.<init>(r2)
            return r3
        L3b:
            android.animation.Animator r4 = r10.onCreateAnimator(r0, r11, r1)
            if (r4 == 0) goto L47
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r3 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r3.<init>(r4)
            return r3
        L47:
            if (r1 != 0) goto L4f
            if (r0 == 0) goto L4f
            int r1 = transitToAnimResourceId(r0, r11)
        L4f:
            if (r1 == 0) goto L95
            android.content.res.Resources r5 = r9.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r1)
            java.lang.String r6 = "anim"
            boolean r6 = r6.equals(r5)
            r7 = 0
            if (r6 == 0) goto L75
            android.view.animation.Animation r8 = android.view.animation.AnimationUtils.loadAnimation(r9, r1)     // Catch: java.lang.RuntimeException -> L71 android.content.res.Resources.NotFoundException -> L73
            r2 = r8
            if (r2 == 0) goto L6f
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r8 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: java.lang.RuntimeException -> L71 android.content.res.Resources.NotFoundException -> L73
            r8.<init>(r2)     // Catch: java.lang.RuntimeException -> L71 android.content.res.Resources.NotFoundException -> L73
            return r8
        L6f:
            r7 = 1
            goto L75
        L71:
            r8 = move-exception
            goto L75
        L73:
            r3 = move-exception
            throw r3
        L75:
            if (r7 != 0) goto L95
            android.animation.Animator r8 = android.animation.AnimatorInflater.loadAnimator(r9, r1)     // Catch: java.lang.RuntimeException -> L85
            r4 = r8
            if (r4 == 0) goto L84
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r8 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: java.lang.RuntimeException -> L85
            r8.<init>(r4)     // Catch: java.lang.RuntimeException -> L85
            return r8
        L84:
            goto L95
        L85:
            r8 = move-exception
            if (r6 != 0) goto L94
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r9, r1)
            if (r2 == 0) goto L95
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r3 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r3.<init>(r2)
            return r3
        L94:
            throw r8
        L95:
            return r3
    }

    private static int transitToAnimResourceId(int r2, boolean r3) {
            r0 = -1
            switch(r2) {
                case 4097: goto L17;
                case 4099: goto Le;
                case 8194: goto L5;
                default: goto L4;
            }
        L4:
            goto L20
        L5:
            if (r3 == 0) goto La
            int r1 = androidx.fragment.C0240R.animator.fragment_close_enter
            goto Lc
        La:
            int r1 = androidx.fragment.C0240R.animator.fragment_close_exit
        Lc:
            r0 = r1
            goto L20
        Le:
            if (r3 == 0) goto L13
            int r1 = androidx.fragment.C0240R.animator.fragment_fade_enter
            goto L15
        L13:
            int r1 = androidx.fragment.C0240R.animator.fragment_fade_exit
        L15:
            r0 = r1
            goto L20
        L17:
            if (r3 == 0) goto L1c
            int r1 = androidx.fragment.C0240R.animator.fragment_open_enter
            goto L1e
        L1c:
            int r1 = androidx.fragment.C0240R.animator.fragment_open_exit
        L1e:
            r0 = r1
        L20:
            return r0
    }
}
