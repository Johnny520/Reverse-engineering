package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6904 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.ref.WeakReference<android.view.View> f24146;

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۦ$ۥ, reason: contains not printable characters */
    public class C6905 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC6909 f24147;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f24148;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6904 f24149;

        public C6905(Yue.C6904 r1, Yue.InterfaceC6909 r2, android.view.View r3) {
                r0 = this;
                r0.f24149 = r1
                r0.f24147 = r2
                r0.f24148 = r3
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                Yue.ۥۢۤۦۨ r2 = r1.f24147
                android.view.View r0 = r1.f24148
                r2.mo299(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                Yue.ۥۢۤۦۨ r2 = r1.f24147
                android.view.View r0 = r1.f24148
                r2.mo300(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                Yue.ۥۢۤۦۨ r2 = r1.f24147
                android.view.View r0 = r1.f24148
                r2.mo301(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۦ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C6906 {
        public C6906() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.view.ViewPropertyAnimator m26755(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.translationZ(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.view.ViewPropertyAnimator m26756(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.translationZBy(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.view.ViewPropertyAnimator m26757(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.z(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static android.view.ViewPropertyAnimator m26758(android.view.ViewPropertyAnimator r0, float r1) {
                android.view.ViewPropertyAnimator r0 = r0.zBy(r1)
                return r0
        }
    }

    public C6904(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f24146 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m26715(Yue.InterfaceC6911 r0, android.view.View r1, android.animation.ValueAnimator r2) {
            m26716(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m26716(Yue.InterfaceC6911 r0, android.view.View r1, android.animation.ValueAnimator r2) {
            r0.mo26768(r1)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C6904 m26717(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C6904 m26718(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alphaBy(r2)
        L11:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m26719() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public long m26720() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r0 = r0.getDuration()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.view.animation.Interpolator m26721() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L15
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
            return r0
        L15:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public long m26722() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r0 = r0.getStartDelay()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Yue.C6904 m26723(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotation(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.C6904 m26724(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationBy(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Yue.C6904 m26725(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationX(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Yue.C6904 m26726(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationXBy(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Yue.C6904 m26727(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationY(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Yue.C6904 m26728(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationYBy(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Yue.C6904 m26729(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleX(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Yue.C6904 m26730(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleXBy(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C6904 m26731(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleY(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Yue.C6904 m26732(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleYBy(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Yue.C6904 m26733(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C6904 m26734(@Yue.InterfaceC4544 android.view.animation.Interpolator r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setInterpolator(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.C6904 m26735(@Yue.InterfaceC4544 Yue.InterfaceC6909 r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Ld
            r1.m26736(r0, r2)
        Ld:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m26736(android.view.View r3, Yue.InterfaceC6909 r4) {
            r2 = this;
            if (r4 == 0) goto Lf
            android.view.ViewPropertyAnimator r0 = r3.animate()
            Yue.ۥۢۤۦۦ$ۥ r1 = new Yue.ۥۢۤۦۦ$ۥ
            r1.<init>(r2, r4, r3)
            r0.setListener(r1)
            goto L17
        Lf:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r4 = 0
            r3.setListener(r4)
        L17:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Yue.C6904 m26737(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setStartDelay(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.C6904 m26738(@Yue.InterfaceC4544 Yue.InterfaceC6911 r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1a
            if (r3 == 0) goto L12
            Yue.ۥۢۤۦۥ r1 = new Yue.ۥۢۤۦۥ
            r1.<init>(r3, r0)
            goto L13
        L12:
            r1 = 0
        L13:
            android.view.ViewPropertyAnimator r3 = r0.animate()
            r3.setUpdateListener(r1)
        L1a:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m26739() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.start()
        L11:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Yue.C6904 m26740(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationX(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Yue.C6904 m26741(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationXBy(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public Yue.C6904 m26742(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Yue.C6904 m26743(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationYBy(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public Yue.C6904 m26744(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            Yue.C6904.C6906.m26755(r0, r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Yue.C6904 m26745(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            Yue.C6904.C6906.m26756(r0, r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Yue.C6904 m26746(@Yue.InterfaceC4410 java.lang.Runnable r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.withEndAction(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    @android.annotation.SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public Yue.C6904 m26747() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.withLayer()
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public Yue.C6904 m26748(@Yue.InterfaceC4410 java.lang.Runnable r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.withStartAction(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public Yue.C6904 m26749(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.x(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public Yue.C6904 m26750(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.xBy(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public Yue.C6904 m26751(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.y(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public Yue.C6904 m26752(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.yBy(r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public Yue.C6904 m26753(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            Yue.C6904.C6906.m26757(r0, r2)
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public Yue.C6904 m26754(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f24146
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            Yue.C6904.C6906.m26758(r0, r2)
        L11:
            return r1
    }
}
