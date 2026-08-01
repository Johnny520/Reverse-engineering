package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewPropertyAnimatorCompat {
    static final int LISTENER_TAG_ID = 2113929216;
    java.lang.Runnable mEndAction;
    int mOldLayerType;
    java.lang.Runnable mStartAction;
    private final java.lang.ref.WeakReference<android.view.View> mView;


    static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.ViewPropertyAnimator withEndAction(android.view.ViewPropertyAnimator r1, java.lang.Runnable r2) {
                android.view.ViewPropertyAnimator r0 = r1.withEndAction(r2)
                return r0
        }

        static android.view.ViewPropertyAnimator withLayer(android.view.ViewPropertyAnimator r1) {
                android.view.ViewPropertyAnimator r0 = r1.withLayer()
                return r0
        }

        static android.view.ViewPropertyAnimator withStartAction(android.view.ViewPropertyAnimator r1, java.lang.Runnable r2) {
                android.view.ViewPropertyAnimator r0 = r1.withStartAction(r2)
                return r0
        }
    }

    static class Api18Impl {
        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.animation.Interpolator getInterpolator(android.view.ViewPropertyAnimator r1) {
                android.animation.TimeInterpolator r0 = r1.getInterpolator()
                android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
                return r0
        }
    }

    static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.ViewPropertyAnimator setUpdateListener(android.view.ViewPropertyAnimator r1, android.animation.ValueAnimator.AnimatorUpdateListener r2) {
                android.view.ViewPropertyAnimator r0 = r1.setUpdateListener(r2)
                return r0
        }
    }

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.ViewPropertyAnimator translationZ(android.view.ViewPropertyAnimator r1, float r2) {
                android.view.ViewPropertyAnimator r0 = r1.translationZ(r2)
                return r0
        }

        static android.view.ViewPropertyAnimator translationZBy(android.view.ViewPropertyAnimator r1, float r2) {
                android.view.ViewPropertyAnimator r0 = r1.translationZBy(r2)
                return r0
        }

        /* JADX INFO: renamed from: z */
        static android.view.ViewPropertyAnimator m43z(android.view.ViewPropertyAnimator r1, float r2) {
                android.view.ViewPropertyAnimator r0 = r1.z(r2)
                return r0
        }

        static android.view.ViewPropertyAnimator zBy(android.view.ViewPropertyAnimator r1, float r2) {
                android.view.ViewPropertyAnimator r0 = r1.zBy(r2)
                return r0
        }
    }

    static class ViewPropertyAnimatorListenerApi14 implements androidx.core.view.ViewPropertyAnimatorListener {
        boolean mAnimEndCalled;
        androidx.core.view.ViewPropertyAnimatorCompat mVpa;

        ViewPropertyAnimatorListenerApi14(androidx.core.view.ViewPropertyAnimatorCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mVpa = r1
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(android.view.View r4) {
                r3 = this;
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                r1 = 0
                boolean r2 = r0 instanceof androidx.core.view.ViewPropertyAnimatorListener
                if (r2 == 0) goto Le
                r1 = r0
                androidx.core.view.ViewPropertyAnimatorListener r1 = (androidx.core.view.ViewPropertyAnimatorListener) r1
            Le:
                if (r1 == 0) goto L13
                r1.onAnimationCancel(r4)
            L13:
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View r4) {
                r3 = this;
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                int r0 = r0.mOldLayerType
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L13
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                int r0 = r0.mOldLayerType
                r4.setLayerType(r0, r1)
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                r0.mOldLayerType = r2
            L13:
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                java.lang.Runnable r0 = r0.mEndAction
                if (r0 == 0) goto L25
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                java.lang.Runnable r0 = r0.mEndAction
                androidx.core.view.ViewPropertyAnimatorCompat r2 = r3.mVpa
                r2.mEndAction = r1
                r0.run()
            L25:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                r1 = 0
                boolean r2 = r0 instanceof androidx.core.view.ViewPropertyAnimatorListener
                if (r2 == 0) goto L33
                r1 = r0
                androidx.core.view.ViewPropertyAnimatorListener r1 = (androidx.core.view.ViewPropertyAnimatorListener) r1
            L33:
                if (r1 == 0) goto L38
                r1.onAnimationEnd(r4)
            L38:
                r2 = 1
                r3.mAnimEndCalled = r2
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(android.view.View r4) {
                r3 = this;
                r0 = 0
                r3.mAnimEndCalled = r0
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                int r0 = r0.mOldLayerType
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto Lf
                r0 = 2
                r4.setLayerType(r0, r2)
            Lf:
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                java.lang.Runnable r0 = r0.mStartAction
                if (r0 == 0) goto L20
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                java.lang.Runnable r0 = r0.mStartAction
                androidx.core.view.ViewPropertyAnimatorCompat r1 = r3.mVpa
                r1.mStartAction = r2
                r0.run()
            L20:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                r1 = 0
                boolean r2 = r0 instanceof androidx.core.view.ViewPropertyAnimatorListener
                if (r2 == 0) goto L2e
                r1 = r0
                androidx.core.view.ViewPropertyAnimatorListener r1 = (androidx.core.view.ViewPropertyAnimatorListener) r1
            L2e:
                if (r1 == 0) goto L33
                r1.onAnimationStart(r4)
            L33:
                return
        }
    }

    ViewPropertyAnimatorCompat(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mStartAction = r0
            r1.mEndAction = r0
            r0 = -1
            r1.mOldLayerType = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mView = r0
            return
    }

    static /* synthetic */ void lambda$setUpdateListener$0(androidx.core.view.ViewPropertyAnimatorUpdateListener r0, android.view.View r1, android.animation.ValueAnimator r2) {
            r0.onAnimationUpdate(r1)
            return
    }

    private void setListenerInternal(android.view.View r3, androidx.core.view.ViewPropertyAnimatorListener r4) {
            r2 = this;
            if (r4 == 0) goto Lf
            android.view.ViewPropertyAnimator r0 = r3.animate()
            androidx.core.view.ViewPropertyAnimatorCompat$1 r1 = new androidx.core.view.ViewPropertyAnimatorCompat$1
            r1.<init>(r2, r4, r3)
            r0.setListener(r1)
            goto L17
        Lf:
            android.view.ViewPropertyAnimator r0 = r3.animate()
            r1 = 0
            r0.setListener(r1)
        L17:
            return
    }

    public androidx.core.view.ViewPropertyAnimatorCompat alpha(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.alpha(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat alphaBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.alphaBy(r3)
        L12:
            return r2
    }

    public void cancel() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.cancel()
        L12:
            return
    }

    public long getDuration() {
            r4 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r4.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L14
            android.view.ViewPropertyAnimator r0 = r1.animate()
            long r2 = r0.getDuration()
            return r2
        L14:
            r2 = 0
            return r2
    }

    public android.view.animation.Interpolator getInterpolator() {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L15
        Lc:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            android.view.animation.Interpolator r2 = androidx.core.view.ViewPropertyAnimatorCompat.Api18Impl.getInterpolator(r0)
            return r2
        L15:
            r0 = 0
            return r0
    }

    public long getStartDelay() {
            r4 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r4.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L14
            android.view.ViewPropertyAnimator r0 = r1.animate()
            long r2 = r0.getStartDelay()
            return r2
        L14:
            r2 = 0
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotation(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.rotation(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.rotationBy(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationX(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.rotationX(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationXBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.rotationXBy(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationY(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.rotationY(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationYBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.rotationYBy(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleX(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.scaleX(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleXBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.scaleXBy(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleY(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.scaleY(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleYBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.scaleYBy(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setDuration(long r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.setDuration(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setInterpolator(android.view.animation.Interpolator r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.setInterpolator(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setListener(androidx.core.view.ViewPropertyAnimatorListener r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto Lf
        Lc:
            r2.setListenerInternal(r1, r3)
        Lf:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setStartDelay(long r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.setStartDelay(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setUpdateListener(androidx.core.view.ViewPropertyAnimatorUpdateListener r4) {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L1c
        Lc:
            r0 = 0
            if (r4 == 0) goto L15
            androidx.core.view.ViewPropertyAnimatorCompat$$ExternalSyntheticLambda0 r2 = new androidx.core.view.ViewPropertyAnimatorCompat$$ExternalSyntheticLambda0
            r2.<init>(r4, r1)
            r0 = r2
        L15:
            android.view.ViewPropertyAnimator r2 = r1.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api19Impl.setUpdateListener(r2, r0)
        L1c:
            return r3
    }

    public void start() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.start()
        L12:
            return
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationX(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.translationX(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationXBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.translationXBy(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationY(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.translationY(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationYBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.translationYBy(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationZ(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L13
        Lc:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.translationZ(r0, r3)
        L13:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationZBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L13
        Lc:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.translationZBy(r0, r3)
        L13:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withEndAction(java.lang.Runnable r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L14
        Lc:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api16Impl.withEndAction(r0, r3)
        L14:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withLayer() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L14
        Lc:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api16Impl.withLayer(r0)
        L14:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withStartAction(java.lang.Runnable r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L14
        Lc:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api16Impl.withStartAction(r0, r3)
        L14:
            return r2
    }

    /* JADX INFO: renamed from: x */
    public androidx.core.view.ViewPropertyAnimatorCompat m40x(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.x(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat xBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.xBy(r3)
        L12:
            return r2
    }

    /* JADX INFO: renamed from: y */
    public androidx.core.view.ViewPropertyAnimatorCompat m41y(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.y(r3)
        L12:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat yBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L12
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.yBy(r3)
        L12:
            return r2
    }

    /* JADX INFO: renamed from: z */
    public androidx.core.view.ViewPropertyAnimatorCompat m42z(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L13
        Lc:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.m43z(r0, r3)
        L13:
            return r2
    }

    public androidx.core.view.ViewPropertyAnimatorCompat zBy(float r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = r0
            if (r0 == 0) goto L13
        Lc:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            androidx.core.view.ViewPropertyAnimatorCompat.Api21Impl.zBy(r0, r3)
        L13:
            return r2
    }
}
