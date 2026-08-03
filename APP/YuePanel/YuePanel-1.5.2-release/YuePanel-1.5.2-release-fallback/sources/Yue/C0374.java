package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0374 extends Yue.AbstractC6659 implements Yue.InterfaceC0354 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final java.lang.String f879 = "AnimatedVDCompat";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final java.lang.String f880 = "animated-vector";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String f881 = "target";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final boolean f882 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.C0374.C0377 f883;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.content.Context f884;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.animation.ArgbEvaluator f885;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.C0374.C0378 f886;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public android.animation.Animator.AnimatorListener f887;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.util.ArrayList<Yue.InterfaceC0354.AbstractC0355> f888;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable.Callback f889;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۦ$ۥ, reason: contains not printable characters */
    public class C0375 implements android.graphics.drawable.Drawable.Callback {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0374 f890;

        public C0375(Yue.C0374 r1) {
                r0 = this;
                r0.f890 = r1
                r0.<init>()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                Yue.ۥ۟۠ۦۦ r1 = r0.f890
                r1.invalidateSelf()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
                r0 = this;
                Yue.ۥ۟۠ۦۦ r1 = r0.f890
                r1.scheduleSelf(r2, r3)
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
                r0 = this;
                Yue.ۥ۟۠ۦۦ r1 = r0.f890
                r1.unscheduleSelf(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۦ$ۥ۟, reason: contains not printable characters */
    public class C0376 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0374 f891;

        public C0376(Yue.C0374 r1) {
                r0 = this;
                r0.f891 = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r5) {
                r4 = this;
                java.util.ArrayList r5 = new java.util.ArrayList
                Yue.ۥ۟۠ۦۦ r0 = r4.f891
                java.util.ArrayList<Yue.ۥ۟۠ۥۧ$ۥ> r0 = r0.f888
                r5.<init>(r0)
                int r0 = r5.size()
                r1 = 0
            Le:
                if (r1 >= r0) goto L1e
                java.lang.Object r2 = r5.get(r1)
                Yue.ۥ۟۠ۥۧ$ۥ r2 = (Yue.InterfaceC0354.AbstractC0355) r2
                Yue.ۥ۟۠ۦۦ r3 = r4.f891
                r2.onAnimationEnd(r3)
                int r1 = r1 + 1
                goto Le
            L1e:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r5) {
                r4 = this;
                java.util.ArrayList r5 = new java.util.ArrayList
                Yue.ۥ۟۠ۦۦ r0 = r4.f891
                java.util.ArrayList<Yue.ۥ۟۠ۥۧ$ۥ> r0 = r0.f888
                r5.<init>(r0)
                int r0 = r5.size()
                r1 = 0
            Le:
                if (r1 >= r0) goto L1e
                java.lang.Object r2 = r5.get(r1)
                Yue.ۥ۟۠ۥۧ$ۥ r2 = (Yue.InterfaceC0354.AbstractC0355) r2
                Yue.ۥ۟۠ۦۦ r3 = r4.f891
                r2.onAnimationStart(r3)
                int r1 = r1 + 1
                goto Le
            L1e:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۦ$ۥ۟۟, reason: contains not printable characters */
    public static class C0377 extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f892;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C6660 f893;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.animation.AnimatorSet f894;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public java.util.ArrayList<android.animation.Animator> f895;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C0573<android.animation.Animator, java.lang.String> f896;

        public C0377(android.content.Context r3, Yue.C0374.C0377 r4, android.graphics.drawable.Drawable.Callback r5, android.content.res.Resources r6) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L87
                int r3 = r4.f892
                r2.f892 = r3
                Yue.ۥۣۢۥۣ r3 = r4.f893
                r0 = 0
                if (r3 == 0) goto L42
                android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
                if (r6 == 0) goto L1d
                android.graphics.drawable.Drawable r3 = r3.newDrawable(r6)
                Yue.ۥۣۢۥۣ r3 = (Yue.C6660) r3
                r2.f893 = r3
                goto L25
            L1d:
                android.graphics.drawable.Drawable r3 = r3.newDrawable()
                Yue.ۥۣۢۥۣ r3 = (Yue.C6660) r3
                r2.f893 = r3
            L25:
                Yue.ۥۣۢۥۣ r3 = r2.f893
                android.graphics.drawable.Drawable r3 = r3.mutate()
                Yue.ۥۣۢۥۣ r3 = (Yue.C6660) r3
                r2.f893 = r3
                r3.setCallback(r5)
                Yue.ۥۣۢۥۣ r3 = r2.f893
                Yue.ۥۣۢۥۣ r5 = r4.f893
                android.graphics.Rect r5 = r5.getBounds()
                r3.setBounds(r5)
                Yue.ۥۣۢۥۣ r3 = r2.f893
                r3.m25648(r0)
            L42:
                java.util.ArrayList<android.animation.Animator> r3 = r4.f895
                if (r3 == 0) goto L87
                int r3 = r3.size()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                r2.f895 = r5
                Yue.ۥ۟ۡۨۡ r5 = new Yue.ۥ۟ۡۨۡ
                r5.<init>(r3)
                r2.f896 = r5
            L58:
                if (r0 >= r3) goto L84
                java.util.ArrayList<android.animation.Animator> r5 = r4.f895
                java.lang.Object r5 = r5.get(r0)
                android.animation.Animator r5 = (android.animation.Animator) r5
                android.animation.Animator r6 = r5.clone()
                Yue.ۥ۟ۡۨۡ<android.animation.Animator, java.lang.String> r1 = r4.f896
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                Yue.ۥۣۢۥۣ r1 = r2.f893
                java.lang.Object r1 = r1.m25644(r5)
                r6.setTarget(r1)
                java.util.ArrayList<android.animation.Animator> r1 = r2.f895
                r1.add(r6)
                Yue.ۥ۟ۡۨۡ<android.animation.Animator, java.lang.String> r1 = r2.f896
                r1.put(r6, r5)
                int r0 = r0 + 1
                goto L58
            L84:
                r2.m1492()
            L87:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.f892
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No constant state support for SDK < 24."
                r0.<init>(r1)
                throw r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "No constant state support for SDK < 24."
                r2.<init>(r0)
                throw r2
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m1492() {
                r2 = this;
                android.animation.AnimatorSet r0 = r2.f894
                if (r0 != 0) goto Lb
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                r2.f894 = r0
            Lb:
                android.animation.AnimatorSet r0 = r2.f894
                java.util.ArrayList<android.animation.Animator> r1 = r2.f895
                r0.playTogether(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۦ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C0378 extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.graphics.drawable.Drawable.ConstantState f897;

        public C0378(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.f897 = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f897
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f897
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r3 = this;
                Yue.ۥ۟۠ۦۦ r0 = new Yue.ۥ۟۠ۦۦ
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r3.f897
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                r0.f23215 = r1
                android.graphics.drawable.Drawable$Callback r2 = r0.f889
                r1.setCallback(r2)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                Yue.ۥ۟۠ۦۦ r0 = new Yue.ۥ۟۠ۦۦ
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f897
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                r0.f23215 = r3
                android.graphics.drawable.Drawable$Callback r1 = r0.f889
                r3.setCallback(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                Yue.ۥ۟۠ۦۦ r0 = new Yue.ۥ۟۠ۦۦ
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f897
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
                r0.f23215 = r3
                android.graphics.drawable.Drawable$Callback r4 = r0.f889
                r3.setCallback(r4)
                return r0
        }
    }

    public C0374() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r0)
            return
    }

    public C0374(@Yue.InterfaceC4544 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public C0374(@Yue.InterfaceC4544 android.content.Context r3, @Yue.InterfaceC4544 Yue.C0374.C0377 r4, @Yue.InterfaceC4544 android.content.res.Resources r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f885 = r0
            r2.f887 = r0
            r2.f888 = r0
            Yue.ۥ۟۠ۦۦ$ۥ r0 = new Yue.ۥ۟۠ۦۦ$ۥ
            r0.<init>(r2)
            r2.f889 = r0
            r2.f884 = r3
            if (r4 == 0) goto L18
            r2.f883 = r4
            goto L1f
        L18:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r1 = new Yue.ۥ۟۠ۦۦ$ۥ۟۟
            r1.<init>(r3, r4, r0, r5)
            r2.f883 = r1
        L1f:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m1482(android.graphics.drawable.Drawable r1) {
            boolean r0 = r1 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.drawable.AnimatedVectorDrawable r1 = (android.graphics.drawable.AnimatedVectorDrawable) r1
            r1.clearAnimationCallbacks()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C0374 m1483(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC2004 int r3) {
            Yue.ۥ۟۠ۦۦ r0 = new Yue.ۥ۟۠ۦۦ
            r0.<init>(r2)
            android.content.res.Resources r1 = r2.getResources()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            android.graphics.drawable.Drawable r2 = Yue.C5362.m20228(r1, r3, r2)
            r0.f23215 = r2
            android.graphics.drawable.Drawable$Callback r3 = r0.f889
            r2.setCallback(r3)
            Yue.ۥ۟۠ۦۦ$ۥ۟۟۟ r2 = new Yue.ۥ۟۠ۦۦ$ۥ۟۟۟
            android.graphics.drawable.Drawable r3 = r0.f23215
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            r2.<init>(r3)
            r0.f886 = r2
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C0374 m1484(android.content.Context r1, android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            Yue.ۥ۟۠ۦۦ r0 = new Yue.ۥ۟۠ۦۦ
            r0.<init>(r1)
            r0.inflate(r2, r3, r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m1485(android.graphics.drawable.Drawable r1, Yue.InterfaceC0354.AbstractC0355 r2) {
            if (r1 == 0) goto Lf
            if (r2 != 0) goto L5
            goto Lf
        L5:
            boolean r0 = r1 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto La
            return
        La:
            android.graphics.drawable.AnimatedVectorDrawable r1 = (android.graphics.drawable.AnimatedVectorDrawable) r1
            m1486(r1, r2)
        Lf:
            return
    }

    @Yue.InterfaceC5336(23)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m1486(@Yue.InterfaceC4410 android.graphics.drawable.AnimatedVectorDrawable r0, @Yue.InterfaceC4410 Yue.InterfaceC0354.AbstractC0355 r1) {
            android.graphics.drawable.Animatable2$AnimationCallback r1 = r1.getPlatformCallback()
            r0.registerAnimationCallback(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m1487(android.graphics.drawable.Drawable r2, Yue.InterfaceC0354.AbstractC0355 r3) {
            r0 = 0
            if (r2 == 0) goto L12
            if (r3 != 0) goto L6
            goto L12
        L6:
            boolean r1 = r2 instanceof android.graphics.drawable.Animatable
            if (r1 != 0) goto Lb
            return r0
        Lb:
            android.graphics.drawable.AnimatedVectorDrawable r2 = (android.graphics.drawable.AnimatedVectorDrawable) r2
            boolean r2 = m1488(r2, r3)
            return r2
        L12:
            return r0
    }

    @Yue.InterfaceC5336(23)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m1488(android.graphics.drawable.AnimatedVectorDrawable r0, Yue.InterfaceC0354.AbstractC0355 r1) {
            android.graphics.drawable.Animatable2$AnimationCallback r1 = r1.getPlatformCallback()
            boolean r0 = r0.unregisterAnimationCallback(r1)
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L7
            Yue.C1995.m9218(r0, r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            boolean r0 = Yue.C1995.m9219(r0)
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC0354
    public void clearAnimationCallbacks() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.clearAnimationCallbacks()
            return
        La:
            r1.m1489()
            java.util.ArrayList<Yue.ۥ۟۠ۥۧ$ۥ> r0 = r1.f888
            if (r0 != 0) goto L12
            return
        L12:
            r0.clear()
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
            r0 = this;
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            r0.draw(r2)
            return
        L8:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            r0.draw(r2)
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r2 = r1.f883
            android.animation.AnimatorSet r2 = r2.f894
            boolean r2 = r2.isStarted()
            if (r2 == 0) goto L1c
            r1.invalidateSelf()
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            int r0 = Yue.C1995.m9221(r0)
            return r0
        L9:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f23215
            if (r0 == 0) goto L9
            int r0 = r0.getChangingConfigurations()
            return r0
        L9:
            int r0 = super.getChangingConfigurations()
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r1 = r2.f883
            int r1 = r1.f892
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r0 = Yue.C1995.m9222(r0)
            return r0
        L9:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f23215
            if (r0 == 0) goto L10
            Yue.ۥ۟۠ۦۦ$ۥ۟۟۟ r0 = new Yue.ۥ۟۠ۦۦ$ۥ۟۟۟
            android.graphics.drawable.Drawable r1 = r2.f23215
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicHeight()
            return r0
        L9:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicWidth()
            return r0
        L9:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
            r1 = this;
            int r0 = super.getMinimumHeight()
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
            r1 = this;
            int r0 = super.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            int r0 = r0.getOpacity()
            return r0
        L9:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.getPadding(r1)
            return r1
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
            r1 = this;
            int[] r0 = super.getState()
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.Region r0 = super.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r1 = this;
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r7, org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, android.content.res.Resources.Theme r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f23215
            if (r0 == 0) goto L8
            Yue.C1995.m9224(r0, r7, r8, r9, r10)
            return
        L8:
            int r0 = r8.getEventType()
            int r1 = r8.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            if (r0 == r2) goto L8e
            int r3 = r8.getDepth()
            if (r3 >= r1) goto L1d
            r3 = 3
            if (r0 == r3) goto L8e
        L1d:
            r3 = 2
            if (r0 != r3) goto L89
            java.lang.String r0 = r8.getName()
            java.lang.String r3 = "animated-vector"
            boolean r3 = r3.equals(r0)
            r4 = 0
            if (r3 == 0) goto L57
            int[] r0 = Yue.C0347.f804
            android.content.res.TypedArray r0 = Yue.C6478.m23906(r7, r10, r9, r0)
            int r3 = r0.getResourceId(r4, r4)
            if (r3 == 0) goto L53
            Yue.ۥۣۢۥۣ r3 = Yue.C6660.m25640(r7, r3, r10)
            r3.m25648(r4)
            android.graphics.drawable.Drawable$Callback r4 = r6.f889
            r3.setCallback(r4)
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r4 = r6.f883
            Yue.ۥۣۢۥۣ r4 = r4.f893
            if (r4 == 0) goto L4f
            r5 = 0
            r4.setCallback(r5)
        L4f:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r4 = r6.f883
            r4.f893 = r3
        L53:
            r0.recycle()
            goto L89
        L57:
            java.lang.String r3 = "target"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L89
            int[] r0 = Yue.C0347.f806
            android.content.res.TypedArray r0 = r7.obtainAttributes(r9, r0)
            java.lang.String r3 = r0.getString(r4)
            int r4 = r0.getResourceId(r2, r4)
            if (r4 == 0) goto L86
            android.content.Context r5 = r6.f884
            if (r5 == 0) goto L7b
            android.animation.Animator r4 = Yue.C0393.m1521(r5, r4)
            r6.m1490(r3, r4)
            goto L86
        L7b:
            r0.recycle()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Context can't be null when inflating animators"
            r7.<init>(r8)
            throw r7
        L86:
            r0.recycle()
        L89:
            int r0 = r8.next()
            goto L12
        L8e:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r7 = r6.f883
            r7.m1492()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            boolean r0 = Yue.C1995.m9225(r0)
            return r0
        L9:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto Lb
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            boolean r0 = r0.isRunning()
            return r0
        Lb:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            android.animation.AnimatorSet r0 = r0.f894
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            boolean r0 = r0.isStateful()
            return r0
        L9:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
            r0 = this;
            super.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L7
            r0.mutate()
        L7:
            return r1
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            r0.setBounds(r2)
            return
        L8:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            r0.setBounds(r2)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            boolean r2 = r0.setLevel(r2)
            return r2
        L9:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            boolean r2 = r0.setLevel(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            boolean r2 = r0.setState(r2)
            return r2
        L9:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            boolean r2 = r0.setState(r2)
            return r2
    }

    @Override // Yue.InterfaceC0354
    public void registerAnimationCallback(@Yue.InterfaceC4410 Yue.InterfaceC0354.AbstractC0355 r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            m1486(r0, r2)
            return
        La:
            if (r2 != 0) goto Ld
            return
        Ld:
            java.util.ArrayList<Yue.ۥ۟۠ۥۧ$ۥ> r0 = r1.f888
            if (r0 != 0) goto L18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f888 = r0
        L18:
            java.util.ArrayList<Yue.ۥ۟۠ۥۧ$ۥ> r0 = r1.f888
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L21
            return
        L21:
            java.util.ArrayList<Yue.ۥ۟۠ۥۧ$ۥ> r0 = r1.f888
            r0.add(r2)
            android.animation.Animator$AnimatorListener r2 = r1.f887
            if (r2 != 0) goto L31
            Yue.ۥ۟۠ۦۦ$ۥ۟ r2 = new Yue.ۥ۟۠ۦۦ$ۥ۟
            r2.<init>(r1)
            r1.f887 = r2
        L31:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r2 = r1.f883
            android.animation.AnimatorSet r2 = r2.f894
            android.animation.Animator$AnimatorListener r0 = r1.f887
            r2.addListener(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            Yue.C1995.m9227(r0, r2)
            return
        L8:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            r0.setAutoMirrored(r2)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int r1) {
            r0 = this;
            super.setChangingConfigurations(r1)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = this;
            super.setColorFilter(r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            r0.setColorFilter(r2)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean r1) {
            r0 = this;
            super.setFilterBitmap(r1)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float r1, float r2) {
            r0 = this;
            super.setHotspot(r1, r2)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] r1) {
            r0 = this;
            boolean r1 = super.setState(r1)
            return r1
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            Yue.C1995.m9231(r0, r2)
            return
        L8:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            r0.setTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            Yue.C1995.m9232(r0, r2)
            return
        L8:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            r0.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            Yue.C1995.m9233(r0, r2)
            return
        L8:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            r0.setTintMode(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            boolean r2 = r0.setVisible(r2, r3)
            return r2
        L9:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            r0.setVisible(r2, r3)
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.start()
            return
        La:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            android.animation.AnimatorSet r0 = r0.f894
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L15
            return
        L15:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            android.animation.AnimatorSet r0 = r0.f894
            r0.start()
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto La
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.stop()
            return
        La:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r1.f883
            android.animation.AnimatorSet r0 = r0.f894
            r0.end()
            return
    }

    @Override // Yue.InterfaceC0354
    public boolean unregisterAnimationCallback(@Yue.InterfaceC4410 Yue.InterfaceC0354.AbstractC0355 r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            m1488(r0, r2)
        L9:
            java.util.ArrayList<Yue.ۥ۟۠ۥۧ$ۥ> r0 = r1.f888
            if (r0 == 0) goto L20
            if (r2 != 0) goto L10
            goto L20
        L10:
            boolean r2 = r0.remove(r2)
            java.util.ArrayList<Yue.ۥ۟۠ۥۧ$ۥ> r0 = r1.f888
            int r0 = r0.size()
            if (r0 != 0) goto L1f
            r1.m1489()
        L1f:
            return r2
        L20:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m1489() {
            r2 = this;
            android.animation.Animator$AnimatorListener r0 = r2.f887
            if (r0 == 0) goto Le
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r1 = r2.f883
            android.animation.AnimatorSet r1 = r1.f894
            r1.removeListener(r0)
            r0 = 0
            r2.f887 = r0
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m1490(java.lang.String r3, android.animation.Animator r4) {
            r2 = this;
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r2.f883
            Yue.ۥۣۢۥۣ r0 = r0.f893
            java.lang.Object r0 = r0.m25644(r3)
            r4.setTarget(r0)
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r2.f883
            java.util.ArrayList<android.animation.Animator> r1 = r0.f895
            if (r1 != 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f895 = r1
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r2.f883
            Yue.ۥ۟ۡۨۡ r1 = new Yue.ۥ۟ۡۨۡ
            r1.<init>()
            r0.f896 = r1
        L21:
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r2.f883
            java.util.ArrayList<android.animation.Animator> r0 = r0.f895
            r0.add(r4)
            Yue.ۥ۟۠ۦۦ$ۥ۟۟ r0 = r2.f883
            Yue.ۥ۟ۡۨۡ<android.animation.Animator, java.lang.String> r0 = r0.f896
            r0.put(r4, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m1491(android.animation.Animator r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.animation.AnimatorSet
            if (r0 == 0) goto L20
            r0 = r4
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            java.util.ArrayList r0 = r0.getChildAnimations()
            if (r0 == 0) goto L20
            r1 = 0
        Le:
            int r2 = r0.size()
            if (r1 >= r2) goto L20
            java.lang.Object r2 = r0.get(r1)
            android.animation.Animator r2 = (android.animation.Animator) r2
            r3.m1491(r2)
            int r1 = r1 + 1
            goto Le
        L20:
            boolean r0 = r4 instanceof android.animation.ObjectAnimator
            if (r0 == 0) goto L4a
            android.animation.ObjectAnimator r4 = (android.animation.ObjectAnimator) r4
            java.lang.String r0 = r4.getPropertyName()
            java.lang.String r1 = "fillColor"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3a
            java.lang.String r1 = "strokeColor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4a
        L3a:
            android.animation.ArgbEvaluator r0 = r3.f885
            if (r0 != 0) goto L45
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator
            r0.<init>()
            r3.f885 = r0
        L45:
            android.animation.ArgbEvaluator r0 = r3.f885
            r4.setEvaluator(r0)
        L4a:
            return
    }
}
