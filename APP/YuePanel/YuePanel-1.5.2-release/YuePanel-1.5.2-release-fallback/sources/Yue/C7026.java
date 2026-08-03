package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۣۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7026 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean f24552 = false;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f24553 = "WindowInsetsAnimCompat";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C7026.C7037 f24554;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ, reason: contains not printable characters */
    public static final class C7027 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C3267 f24555;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C3267 f24556;

        public C7027(@Yue.InterfaceC4410 Yue.C3267 r1, @Yue.InterfaceC4410 Yue.C3267 r2) {
                r0 = this;
                r0.<init>()
                r0.f24555 = r1
                r0.f24556 = r2
                return
        }

        @Yue.InterfaceC5336(30)
        public C7027(@Yue.InterfaceC4410 android.view.WindowInsetsAnimation.Bounds r2) {
                r1 = this;
                r1.<init>()
                Yue.ۥ۠ۥۣۡ r0 = Yue.C7026.C7035.m27217(r2)
                r1.f24555 = r0
                Yue.ۥ۠ۥۣۡ r2 = Yue.C7026.C7035.m27216(r2)
                r1.f24556 = r2
                return
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC5336(30)
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static Yue.C7026.C7027 m27198(@Yue.InterfaceC4410 android.view.WindowInsetsAnimation.Bounds r1) {
                Yue.ۥۢۥۣۥ$ۥ r0 = new Yue.ۥۢۥۣۥ$ۥ
                r0.<init>(r1)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Bounds{lower="
                r0.append(r1)
                Yue.ۥ۠ۥۣۡ r1 = r2.f24555
                r0.append(r1)
                java.lang.String r1 = " upper="
                r0.append(r1)
                Yue.ۥ۠ۥۣۡ r1 = r2.f24556
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C3267 m27199() {
                r1 = this;
                Yue.ۥ۠ۥۣۡ r0 = r1.f24555
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C3267 m27200() {
                r1 = this;
                Yue.ۥ۠ۥۣۡ r0 = r1.f24556
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C7026.C7027 m27201(@Yue.InterfaceC4410 Yue.C3267 r7) {
                r6 = this;
                Yue.ۥۢۥۣۥ$ۥ r0 = new Yue.ۥۢۥۣۥ$ۥ
                Yue.ۥ۠ۥۣۡ r1 = r6.f24555
                int r2 = r7.f10681
                int r3 = r7.f10682
                int r4 = r7.f10683
                int r5 = r7.f10684
                Yue.ۥ۠ۥۣۡ r1 = Yue.C7065.m27275(r1, r2, r3, r4, r5)
                Yue.ۥ۠ۥۣۡ r2 = r6.f24556
                int r3 = r7.f10681
                int r4 = r7.f10682
                int r5 = r7.f10683
                int r7 = r7.f10684
                Yue.ۥ۠ۥۣۡ r7 = Yue.C7065.m27275(r2, r3, r4, r5, r7)
                r0.<init>(r1, r7)
                return r0
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC5336(30)
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.view.WindowInsetsAnimation.Bounds m27202() {
                r1 = this;
                android.view.WindowInsetsAnimation$Bounds r0 = Yue.C7026.C7035.m27215(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟, reason: contains not printable characters */
    public static abstract class AbstractC7028 {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        android.view.WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InterfaceC7029 {
        }

        public AbstractC7028(int r1) {
                r0 = this;
                r0.<init>()
                r0.mDispatchMode = r1
                return
        }

        public final int getDispatchMode() {
                r1 = this;
                int r0 = r1.mDispatchMode
                return r0
        }

        public void onEnd(@Yue.InterfaceC4410 Yue.C7026 r1) {
                r0 = this;
                return
        }

        public void onPrepare(@Yue.InterfaceC4410 Yue.C7026 r1) {
                r0 = this;
                return
        }

        @Yue.InterfaceC4410
        public abstract Yue.C7065 onProgress(@Yue.InterfaceC4410 Yue.C7065 r1, @Yue.InterfaceC4410 java.util.List<Yue.C7026> r2);

        @Yue.InterfaceC4410
        public Yue.C7026.C7027 onStart(@Yue.InterfaceC4410 Yue.C7026 r1, @Yue.InterfaceC4410 Yue.C7026.C7027 r2) {
                r0 = this;
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C7030 extends Yue.C7026.C7037 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final android.view.animation.Interpolator f24557 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final android.view.animation.Interpolator f24558 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final android.view.animation.Interpolator f24559 = null;

        /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5336(21)
        public static class ViewOnApplyWindowInsetsListenerC7031 implements android.view.View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static final int f24560 = 160;

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final Yue.C7026.AbstractC7028 f24561;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public Yue.C7065 f24562;

            /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ, reason: contains not printable characters */
            public class C7032 implements android.animation.ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
                public final /* synthetic */ Yue.C7026 f24563;

                /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
                public final /* synthetic */ Yue.C7065 f24564;

                /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
                public final /* synthetic */ Yue.C7065 f24565;

                /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
                public final /* synthetic */ int f24566;

                /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
                public final /* synthetic */ android.view.View f24567;

                /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
                public final /* synthetic */ Yue.C7026.C7030.ViewOnApplyWindowInsetsListenerC7031 f24568;

                public C7032(Yue.C7026.C7030.ViewOnApplyWindowInsetsListenerC7031 r1, Yue.C7026 r2, Yue.C7065 r3, Yue.C7065 r4, int r5, android.view.View r6) {
                        r0 = this;
                        r0.f24568 = r1
                        r0.f24563 = r2
                        r0.f24564 = r3
                        r0.f24565 = r4
                        r0.f24566 = r5
                        r0.f24567 = r6
                        r0.<init>()
                        return
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator r4) {
                        r3 = this;
                        Yue.ۥۢۥۣۥ r0 = r3.f24563
                        float r4 = r4.getAnimatedFraction()
                        r0.m27197(r4)
                        Yue.ۥۢۥۦ r4 = r3.f24564
                        Yue.ۥۢۥۦ r0 = r3.f24565
                        Yue.ۥۢۥۣۥ r1 = r3.f24563
                        float r1 = r1.m27193()
                        int r2 = r3.f24566
                        Yue.ۥۢۥۦ r4 = Yue.C7026.C7030.m27213(r4, r0, r1, r2)
                        Yue.ۥۢۥۣۥ r0 = r3.f24563
                        java.util.List r0 = java.util.Collections.singletonList(r0)
                        android.view.View r1 = r3.f24567
                        Yue.C7026.C7030.m27209(r1, r4, r0)
                        return
                }
            }

            /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟, reason: contains not printable characters */
            public class C7033 extends android.animation.AnimatorListenerAdapter {

                /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
                public final /* synthetic */ Yue.C7026 f24569;

                /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
                public final /* synthetic */ android.view.View f24570;

                /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
                public final /* synthetic */ Yue.C7026.C7030.ViewOnApplyWindowInsetsListenerC7031 f24571;

                public C7033(Yue.C7026.C7030.ViewOnApplyWindowInsetsListenerC7031 r1, Yue.C7026 r2, android.view.View r3) {
                        r0 = this;
                        r0.f24571 = r1
                        r0.f24569 = r2
                        r0.f24570 = r3
                        r0.<init>()
                        return
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator r2) {
                        r1 = this;
                        Yue.ۥۢۥۣۥ r2 = r1.f24569
                        r0 = 1065353216(0x3f800000, float:1.0)
                        r2.m27197(r0)
                        android.view.View r2 = r1.f24570
                        Yue.ۥۢۥۣۥ r0 = r1.f24569
                        Yue.C7026.C7030.m27207(r2, r0)
                        return
                }
            }

            /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟۟, reason: contains not printable characters */
            public class RunnableC7034 implements java.lang.Runnable {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public final /* synthetic */ android.view.View f24572;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public final /* synthetic */ Yue.C7026 f24573;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public final /* synthetic */ Yue.C7026.C7027 f24574;

                /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
                public final /* synthetic */ android.animation.ValueAnimator f24575;

                /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
                public final /* synthetic */ Yue.C7026.C7030.ViewOnApplyWindowInsetsListenerC7031 f24576;

                public RunnableC7034(Yue.C7026.C7030.ViewOnApplyWindowInsetsListenerC7031 r1, android.view.View r2, Yue.C7026 r3, Yue.C7026.C7027 r4, android.animation.ValueAnimator r5) {
                        r0 = this;
                        r0.f24576 = r1
                        r0.f24572 = r2
                        r0.f24573 = r3
                        r0.f24574 = r4
                        r0.f24575 = r5
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r3 = this;
                        android.view.View r0 = r3.f24572
                        Yue.ۥۢۥۣۥ r1 = r3.f24573
                        Yue.ۥۢۥۣۥ$ۥ r2 = r3.f24574
                        Yue.C7026.C7030.m27210(r0, r1, r2)
                        android.animation.ValueAnimator r0 = r3.f24575
                        r0.start()
                        return
                }
            }

            public ViewOnApplyWindowInsetsListenerC7031(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 Yue.C7026.AbstractC7028 r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f24561 = r2
                    Yue.ۥۢۥۦ r1 = Yue.C6794.m26155(r1)
                    if (r1 == 0) goto L15
                    Yue.ۥۢۥۦ$ۥ۟ r2 = new Yue.ۥۢۥۦ$ۥ۟
                    r2.<init>(r1)
                    Yue.ۥۢۥۦ r1 = r2.m27314()
                    goto L16
                L15:
                    r1 = 0
                L16:
                    r0.f24562 = r1
                    return
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public android.view.WindowInsets onApplyWindowInsets(android.view.View r16, android.view.WindowInsets r17) {
                    r15 = this;
                    r7 = r15
                    r8 = r16
                    r9 = r17
                    boolean r0 = r16.isLaidOut()
                    if (r0 != 0) goto L16
                    Yue.ۥۢۥۦ r0 = Yue.C7065.m27277(r9, r8)
                    r7.f24562 = r0
                    android.view.WindowInsets r0 = Yue.C7026.C7030.m27211(r16, r17)
                    return r0
                L16:
                    Yue.ۥۢۥۦ r10 = Yue.C7065.m27277(r9, r8)
                    Yue.ۥۢۥۦ r0 = r7.f24562
                    if (r0 != 0) goto L24
                    Yue.ۥۢۥۦ r0 = Yue.C6794.m26155(r16)
                    r7.f24562 = r0
                L24:
                    Yue.ۥۢۥۦ r0 = r7.f24562
                    if (r0 != 0) goto L2f
                    r7.f24562 = r10
                    android.view.WindowInsets r0 = Yue.C7026.C7030.m27211(r16, r17)
                    return r0
                L2f:
                    Yue.ۥۢۥۣۥ$ۥ۟ r0 = Yue.C7026.C7030.m27212(r16)
                    if (r0 == 0) goto L42
                    android.view.WindowInsets r0 = r0.mDispachedInsets
                    boolean r0 = java.util.Objects.equals(r0, r9)
                    if (r0 == 0) goto L42
                    android.view.WindowInsets r0 = Yue.C7026.C7030.m27211(r16, r17)
                    return r0
                L42:
                    Yue.ۥۢۥۦ r0 = r7.f24562
                    int r5 = Yue.C7026.C7030.m27203(r10, r0)
                    if (r5 != 0) goto L4f
                    android.view.WindowInsets r0 = Yue.C7026.C7030.m27211(r16, r17)
                    return r0
                L4f:
                    Yue.ۥۢۥۦ r4 = r7.f24562
                    android.view.animation.Interpolator r0 = Yue.C7026.C7030.m27205(r5, r10, r4)
                    Yue.ۥۢۥۣۥ r11 = new Yue.ۥۢۥۣۥ
                    r1 = 160(0xa0, double:7.9E-322)
                    r11.<init>(r5, r0, r1)
                    r0 = 0
                    r11.m27197(r0)
                    r0 = 2
                    float[] r0 = new float[r0]
                    r0 = {x00a6: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                    android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
                    long r1 = r11.m27191()
                    android.animation.ValueAnimator r12 = r0.setDuration(r1)
                    Yue.ۥۢۥۣۥ$ۥ r13 = Yue.C7026.C7030.m27204(r10, r4, r5)
                    r0 = 0
                    Yue.C7026.C7030.m27208(r8, r11, r9, r0)
                    Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ r14 = new Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ
                    r0 = r14
                    r1 = r15
                    r2 = r11
                    r3 = r10
                    r6 = r16
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    r12.addUpdateListener(r14)
                    Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟ r0 = new Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟
                    r0.<init>(r15, r11, r8)
                    r12.addListener(r0)
                    Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟۟ r6 = new Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟۟
                    r0 = r6
                    r2 = r16
                    r3 = r11
                    r4 = r13
                    r5 = r12
                    r0.<init>(r1, r2, r3, r4, r5)
                    Yue.ViewTreeObserverOnPreDrawListenerC4630.m18451(r8, r6)
                    r7.f24562 = r10
                    android.view.WindowInsets r0 = Yue.C7026.C7030.m27211(r16, r17)
                    return r0
            }
        }

        static {
                android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
                r1 = 1066192077(0x3f8ccccd, float:1.1)
                r2 = 1065353216(0x3f800000, float:1.0)
                r3 = 0
                r0.<init>(r3, r1, r3, r2)
                Yue.C7026.C7030.f24557 = r0
                Yue.ۥ۠ۡۦۤ r0 = new Yue.ۥ۠ۡۦۤ
                r0.<init>()
                Yue.C7026.C7030.f24558 = r0
                android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
                r0.<init>()
                Yue.C7026.C7030.f24559 = r0
                return
        }

        public C7030(int r1, @Yue.InterfaceC4544 android.view.animation.Interpolator r2, long r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static int m27203(@Yue.InterfaceC4410 Yue.C7065 r4, @Yue.InterfaceC4410 Yue.C7065 r5) {
                r0 = 0
                r1 = 1
            L2:
                r2 = 256(0x100, float:3.59E-43)
                if (r1 > r2) goto L18
                Yue.ۥ۠ۥۣۡ r2 = r4.m27283(r1)
                Yue.ۥ۠ۥۣۡ r3 = r5.m27283(r1)
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L15
                r0 = r0 | r1
            L15:
                int r1 = r1 << 1
                goto L2
            L18:
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static Yue.C7026.C7027 m27204(@Yue.InterfaceC4410 Yue.C7065 r4, @Yue.InterfaceC4410 Yue.C7065 r5, int r6) {
                Yue.ۥ۠ۥۣۡ r4 = r4.m27283(r6)
                Yue.ۥ۠ۥۣۡ r5 = r5.m27283(r6)
                int r6 = r4.f10681
                int r0 = r5.f10681
                int r6 = java.lang.Math.min(r6, r0)
                int r0 = r4.f10682
                int r1 = r5.f10682
                int r0 = java.lang.Math.min(r0, r1)
                int r1 = r4.f10683
                int r2 = r5.f10683
                int r1 = java.lang.Math.min(r1, r2)
                int r2 = r4.f10684
                int r3 = r5.f10684
                int r2 = java.lang.Math.min(r2, r3)
                Yue.ۥ۠ۥۣۡ r6 = Yue.C3267.m13726(r6, r0, r1, r2)
                int r0 = r4.f10681
                int r1 = r5.f10681
                int r0 = java.lang.Math.max(r0, r1)
                int r1 = r4.f10682
                int r2 = r5.f10682
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r4.f10683
                int r3 = r5.f10683
                int r2 = java.lang.Math.max(r2, r3)
                int r4 = r4.f10684
                int r5 = r5.f10684
                int r4 = java.lang.Math.max(r4, r5)
                Yue.ۥ۠ۥۣۡ r4 = Yue.C3267.m13726(r0, r1, r2, r4)
                Yue.ۥۢۥۣۥ$ۥ r5 = new Yue.ۥۢۥۣۥ$ۥ
                r5.<init>(r6, r4)
                return r5
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static android.view.animation.Interpolator m27205(int r0, Yue.C7065 r1, Yue.C7065 r2) {
                r0 = r0 & 8
                if (r0 == 0) goto L20
                int r0 = Yue.C7065.C7078.m27366()
                Yue.ۥ۠ۥۣۡ r0 = r1.m27283(r0)
                int r0 = r0.f10684
                int r1 = Yue.C7065.C7078.m27366()
                Yue.ۥ۠ۥۣۡ r1 = r2.m27283(r1)
                int r1 = r1.f10684
                if (r0 <= r1) goto L1d
                android.view.animation.Interpolator r0 = Yue.C7026.C7030.f24557
                return r0
            L1d:
                android.view.animation.Interpolator r0 = Yue.C7026.C7030.f24558
                return r0
            L20:
                android.view.animation.Interpolator r0 = Yue.C7026.C7030.f24559
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static android.view.View.OnApplyWindowInsetsListener m27206(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 Yue.C7026.AbstractC7028 r2) {
                Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ r0 = new Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ
                r0.<init>(r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static void m27207(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 Yue.C7026 r3) {
                Yue.ۥۢۥۣۥ$ۥ۟ r0 = m27212(r2)
                if (r0 == 0) goto L10
                r0.onEnd(r3)
                int r0 = r0.getDispatchMode()
                if (r0 != 0) goto L10
                return
            L10:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L27
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
            L17:
                int r1 = r2.getChildCount()
                if (r0 >= r1) goto L27
                android.view.View r1 = r2.getChildAt(r0)
                m27207(r1, r3)
                int r0 = r0 + 1
                goto L17
            L27:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static void m27208(android.view.View r2, Yue.C7026 r3, android.view.WindowInsets r4, boolean r5) {
                Yue.ۥۢۥۣۥ$ۥ۟ r0 = m27212(r2)
                r1 = 0
                if (r0 == 0) goto L17
                r0.mDispachedInsets = r4
                if (r5 != 0) goto L17
                r0.onPrepare(r3)
                int r5 = r0.getDispatchMode()
                if (r5 != 0) goto L16
                r5 = 1
                goto L17
            L16:
                r5 = r1
            L17:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L2d
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            L1d:
                int r0 = r2.getChildCount()
                if (r1 >= r0) goto L2d
                android.view.View r0 = r2.getChildAt(r1)
                m27208(r0, r3, r4, r5)
                int r1 = r1 + 1
                goto L1d
            L2d:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static void m27209(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 Yue.C7065 r3, @Yue.InterfaceC4410 java.util.List<Yue.C7026> r4) {
                Yue.ۥۢۥۣۥ$ۥ۟ r0 = m27212(r2)
                if (r0 == 0) goto L11
                Yue.ۥۢۥۦ r3 = r0.onProgress(r3, r4)
                int r0 = r0.getDispatchMode()
                if (r0 != 0) goto L11
                return
            L11:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L28
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
            L18:
                int r1 = r2.getChildCount()
                if (r0 >= r1) goto L28
                android.view.View r1 = r2.getChildAt(r0)
                m27209(r1, r3, r4)
                int r0 = r0 + 1
                goto L18
            L28:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static void m27210(android.view.View r2, Yue.C7026 r3, Yue.C7026.C7027 r4) {
                Yue.ۥۢۥۣۥ$ۥ۟ r0 = m27212(r2)
                if (r0 == 0) goto L10
                r0.onStart(r3, r4)
                int r0 = r0.getDispatchMode()
                if (r0 != 0) goto L10
                return
            L10:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L27
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
            L17:
                int r1 = r2.getChildCount()
                if (r0 >= r1) goto L27
                android.view.View r1 = r2.getChildAt(r0)
                m27210(r1, r3, r4)
                int r0 = r0 + 1
                goto L17
            L27:
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static android.view.WindowInsets m27211(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 android.view.WindowInsets r2) {
                int r0 = Yue.C5172.C5177.f19445
                java.lang.Object r0 = r1.getTag(r0)
                if (r0 == 0) goto L9
                return r2
            L9:
                android.view.WindowInsets r1 = r1.onApplyWindowInsets(r2)
                return r1
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static Yue.C7026.AbstractC7028 m27212(android.view.View r1) {
                int r0 = Yue.C5172.C5177.f19453
                java.lang.Object r1 = r1.getTag(r0)
                boolean r0 = r1 instanceof Yue.C7026.C7030.ViewOnApplyWindowInsetsListenerC7031
                if (r0 == 0) goto Lf
                Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ r1 = (Yue.C7026.C7030.ViewOnApplyWindowInsetsListenerC7031) r1
                Yue.ۥۢۥۣۥ$ۥ۟ r1 = r1.f24561
                goto L10
            Lf:
                r1 = 0
            L10:
                return r1
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static Yue.C7065 m27213(Yue.C7065 r12, Yue.C7065 r13, float r14, int r15) {
                Yue.ۥۢۥۦ$ۥ۟ r0 = new Yue.ۥۢۥۦ$ۥ۟
                r0.<init>(r12)
                r1 = 1
            L6:
                r2 = 256(0x100, float:3.59E-43)
                if (r1 > r2) goto L55
                r2 = r15 & r1
                if (r2 != 0) goto L16
                Yue.ۥ۠ۥۣۡ r2 = r12.m27283(r1)
                r0.m27316(r1, r2)
                goto L52
            L16:
                Yue.ۥ۠ۥۣۡ r2 = r12.m27283(r1)
                Yue.ۥ۠ۥۣۡ r3 = r13.m27283(r1)
                int r4 = r2.f10681
                int r5 = r3.f10681
                int r4 = r4 - r5
                float r4 = (float) r4
                r5 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 - r14
                float r4 = r4 * r5
                double r6 = (double) r4
                r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r6 = r6 + r8
                int r4 = (int) r6
                int r6 = r2.f10682
                int r7 = r3.f10682
                int r6 = r6 - r7
                float r6 = (float) r6
                float r6 = r6 * r5
                double r6 = (double) r6
                double r6 = r6 + r8
                int r6 = (int) r6
                int r7 = r2.f10683
                int r10 = r3.f10683
                int r7 = r7 - r10
                float r7 = (float) r7
                float r7 = r7 * r5
                double r10 = (double) r7
                double r10 = r10 + r8
                int r7 = (int) r10
                int r10 = r2.f10684
                int r3 = r3.f10684
                int r10 = r10 - r3
                float r3 = (float) r10
                float r3 = r3 * r5
                double r10 = (double) r3
                double r10 = r10 + r8
                int r3 = (int) r10
                Yue.ۥ۠ۥۣۡ r2 = Yue.C7065.m27275(r2, r4, r6, r7, r3)
                r0.m27316(r1, r2)
            L52:
                int r1 = r1 << 1
                goto L6
            L55:
                Yue.ۥۢۥۦ r12 = r0.m27314()
                return r12
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static void m27214(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 Yue.C7026.AbstractC7028 r3) {
                int r0 = Yue.C5172.C5177.f19445
                java.lang.Object r0 = r2.getTag(r0)
                if (r3 != 0) goto L14
                int r3 = Yue.C5172.C5177.f19453
                r1 = 0
                r2.setTag(r3, r1)
                if (r0 != 0) goto L22
                r2.setOnApplyWindowInsetsListener(r1)
                goto L22
            L14:
                android.view.View$OnApplyWindowInsetsListener r3 = m27206(r2, r3)
                int r1 = Yue.C5172.C5177.f19453
                r2.setTag(r1, r3)
                if (r0 != 0) goto L22
                r2.setOnApplyWindowInsetsListener(r3)
            L22:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C7035 extends Yue.C7026.C7037 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.view.WindowInsetsAnimation f24577;

        /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5336(30)
        public static class C7036 extends android.view.WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final Yue.C7026.AbstractC7028 f24578;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public java.util.List<Yue.C7026> f24579;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public java.util.ArrayList<Yue.C7026> f24580;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final java.util.HashMap<android.view.WindowInsetsAnimation, Yue.C7026> f24581;

            public C7036(@Yue.InterfaceC4410 Yue.C7026.AbstractC7028 r2) {
                    r1 = this;
                    int r0 = r2.getDispatchMode()
                    r1.<init>(r0)
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    r1.f24581 = r0
                    r1.f24578 = r2
                    return
            }

            public void onEnd(@Yue.InterfaceC4410 android.view.WindowInsetsAnimation r3) {
                    r2 = this;
                    Yue.ۥۢۥۣۥ$ۥ۟ r0 = r2.f24578
                    Yue.ۥۢۥۣۥ r1 = r2.m27225(r3)
                    r0.onEnd(r1)
                    java.util.HashMap<android.view.WindowInsetsAnimation, Yue.ۥۢۥۣۥ> r0 = r2.f24581
                    r0.remove(r3)
                    return
            }

            public void onPrepare(@Yue.InterfaceC4410 android.view.WindowInsetsAnimation r2) {
                    r1 = this;
                    Yue.ۥۢۥۣۥ$ۥ۟ r0 = r1.f24578
                    Yue.ۥۢۥۣۥ r2 = r1.m27225(r2)
                    r0.onPrepare(r2)
                    return
            }

            @Yue.InterfaceC4410
            public android.view.WindowInsets onProgress(@Yue.InterfaceC4410 android.view.WindowInsets r4, @Yue.InterfaceC4410 java.util.List<android.view.WindowInsetsAnimation> r5) {
                    r3 = this;
                    java.util.ArrayList<Yue.ۥۢۥۣۥ> r0 = r3.f24580
                    if (r0 != 0) goto L16
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r5.size()
                    r0.<init>(r1)
                    r3.f24580 = r0
                    java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                    r3.f24579 = r0
                    goto L19
                L16:
                    r0.clear()
                L19:
                    int r0 = r5.size()
                    int r0 = r0 + (-1)
                L1f:
                    if (r0 < 0) goto L3c
                    java.lang.Object r1 = r5.get(r0)
                    android.view.WindowInsetsAnimation r1 = Yue.C7050.m27240(r1)
                    Yue.ۥۢۥۣۥ r2 = r3.m27225(r1)
                    float r1 = Yue.C7044.m27234(r1)
                    r2.m27197(r1)
                    java.util.ArrayList<Yue.ۥۢۥۣۥ> r1 = r3.f24580
                    r1.add(r2)
                    int r0 = r0 + (-1)
                    goto L1f
                L3c:
                    Yue.ۥۢۥۣۥ$ۥ۟ r5 = r3.f24578
                    Yue.ۥۢۥۦ r4 = Yue.C7065.m27276(r4)
                    java.util.List<Yue.ۥۢۥۣۥ> r0 = r3.f24579
                    Yue.ۥۢۥۦ r4 = r5.onProgress(r4, r0)
                    android.view.WindowInsets r4 = r4.m27312()
                    return r4
            }

            @Yue.InterfaceC4410
            public android.view.WindowInsetsAnimation.Bounds onStart(@Yue.InterfaceC4410 android.view.WindowInsetsAnimation r2, @Yue.InterfaceC4410 android.view.WindowInsetsAnimation.Bounds r3) {
                    r1 = this;
                    Yue.ۥۢۥۣۥ$ۥ۟ r0 = r1.f24578
                    Yue.ۥۢۥۣۥ r2 = r1.m27225(r2)
                    Yue.ۥۢۥۣۥ$ۥ r3 = Yue.C7026.C7027.m27198(r3)
                    Yue.ۥۢۥۣۥ$ۥ r2 = r0.onStart(r2, r3)
                    android.view.WindowInsetsAnimation$Bounds r2 = r2.m27202()
                    return r2
            }

            @Yue.InterfaceC4410
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final Yue.C7026 m27225(@Yue.InterfaceC4410 android.view.WindowInsetsAnimation r3) {
                    r2 = this;
                    java.util.HashMap<android.view.WindowInsetsAnimation, Yue.ۥۢۥۣۥ> r0 = r2.f24581
                    java.lang.Object r0 = r0.get(r3)
                    Yue.ۥۢۥۣۥ r0 = (Yue.C7026) r0
                    if (r0 != 0) goto L13
                    Yue.ۥۢۥۣۥ r0 = Yue.C7026.m27189(r3)
                    java.util.HashMap<android.view.WindowInsetsAnimation, Yue.ۥۢۥۣۥ> r1 = r2.f24581
                    r1.put(r3, r0)
                L13:
                    return r0
            }
        }

        public C7035(int r1, android.view.animation.Interpolator r2, long r3) {
                r0 = this;
                android.view.WindowInsetsAnimation r1 = Yue.C7049.m27239(r1, r2, r3)
                r0.<init>(r1)
                return
        }

        public C7035(@Yue.InterfaceC4410 android.view.WindowInsetsAnimation r5) {
                r4 = this;
                r0 = 0
                r1 = 0
                r3 = 0
                r4.<init>(r3, r0, r1)
                r4.f24577 = r5
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static android.view.WindowInsetsAnimation.Bounds m27215(@Yue.InterfaceC4410 Yue.C7026.C7027 r1) {
                Yue.C7040.m27230()
                Yue.ۥ۠ۥۣۡ r0 = r1.m27199()
                android.graphics.Insets r0 = r0.m13731()
                Yue.ۥ۠ۥۣۡ r1 = r1.m27200()
                android.graphics.Insets r1 = r1.m13731()
                android.view.WindowInsetsAnimation$Bounds r1 = Yue.C7039.m27229(r0, r1)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static Yue.C3267 m27216(@Yue.InterfaceC4410 android.view.WindowInsetsAnimation.Bounds r0) {
                android.graphics.Insets r0 = Yue.C7046.m27236(r0)
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13729(r0)
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static Yue.C3267 m27217(@Yue.InterfaceC4410 android.view.WindowInsetsAnimation.Bounds r0) {
                android.graphics.Insets r0 = Yue.C7047.m27237(r0)
                Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13729(r0)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static void m27218(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4544 Yue.C7026.AbstractC7028 r2) {
                if (r2 == 0) goto L8
                Yue.ۥۢۥۣۥ$ۥ۟۟۟$ۥ r0 = new Yue.ۥۢۥۣۥ$ۥ۟۟۟$ۥ
                r0.<init>(r2)
                goto L9
            L8:
                r0 = 0
            L9:
                Yue.C7048.m27238(r1, r0)
                return
        }

        @Override // Yue.C7026.C7037
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public long mo27219() {
                r2 = this;
                android.view.WindowInsetsAnimation r0 = r2.f24577
                long r0 = Yue.C7038.m27228(r0)
                return r0
        }

        @Override // Yue.C7026.C7037
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float mo27220() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.f24577
                float r0 = Yue.C7044.m27234(r0)
                return r0
        }

        @Override // Yue.C7026.C7037
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float mo27221() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.f24577
                float r0 = Yue.C7045.m27235(r0)
                return r0
        }

        @Override // Yue.C7026.C7037
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.view.animation.Interpolator mo27222() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.f24577
                android.view.animation.Interpolator r0 = Yue.C7042.m27232(r0)
                return r0
        }

        @Override // Yue.C7026.C7037
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int mo27223() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.f24577
                int r0 = Yue.C7041.m27231(r0)
                return r0
        }

        @Override // Yue.C7026.C7037
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo27224(float r2) {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.f24577
                Yue.C7043.m27233(r0, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7037 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f24582;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public float f24583;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public final android.view.animation.Interpolator f24584;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long f24585;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f24586;

        public C7037(int r1, @Yue.InterfaceC4544 android.view.animation.Interpolator r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.f24582 = r1
                r0.f24584 = r2
                r0.f24585 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public float m27226() {
                r1 = this;
                float r0 = r1.f24586
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public long mo27219() {
                r2 = this;
                long r0 = r2.f24585
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public float mo27220() {
                r1 = this;
                float r0 = r1.f24583
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public float mo27221() {
                r2 = this;
                android.view.animation.Interpolator r0 = r2.f24584
                if (r0 == 0) goto Lb
                float r1 = r2.f24583
                float r0 = r0.getInterpolation(r1)
                return r0
            Lb:
                float r0 = r2.f24583
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public android.view.animation.Interpolator mo27222() {
                r1 = this;
                android.view.animation.Interpolator r0 = r1.f24584
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public int mo27223() {
                r1 = this;
                int r0 = r1.f24582
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m27227(float r1) {
                r0 = this;
                r0.f24586 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo27224(float r1) {
                r0 = this;
                r0.f24583 = r1
                return
        }
    }

    public C7026(int r3, @Yue.InterfaceC4544 android.view.animation.Interpolator r4, long r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            Yue.ۥۢۥۣۥ$ۥ۟۟۟ r0 = new Yue.ۥۢۥۣۥ$ۥ۟۟۟
            r0.<init>(r3, r4, r5)
            r2.f24554 = r0
            goto L18
        L11:
            Yue.ۥۢۥۣۥ$ۥ۟۟ r0 = new Yue.ۥۢۥۣۥ$ۥ۟۟
            r0.<init>(r3, r4, r5)
            r2.f24554 = r0
        L18:
            return
    }

    @Yue.InterfaceC5336(30)
    public C7026(@Yue.InterfaceC4410 android.view.WindowInsetsAnimation r5) {
            r4 = this;
            r0 = 0
            r1 = 0
            r3 = 0
            r4.<init>(r3, r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L14
            Yue.ۥۢۥۣۥ$ۥ۟۟۟ r0 = new Yue.ۥۢۥۣۥ$ۥ۟۟۟
            r0.<init>(r5)
            r4.f24554 = r0
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m27188(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 Yue.C7026.AbstractC7028 r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            Yue.C7026.C7035.m27218(r2, r3)
            goto Ld
        La:
            Yue.C7026.C7030.m27214(r2, r3)
        Ld:
            return
    }

    @Yue.InterfaceC5336(30)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Yue.C7026 m27189(android.view.WindowInsetsAnimation r1) {
            Yue.ۥۢۥۣۥ r0 = new Yue.ۥۢۥۣۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = 1.0d)
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float m27190() {
            r1 = this;
            Yue.ۥۢۥۣۥ$ۥ۟۟۟۟ r0 = r1.f24554
            float r0 = r0.m27226()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public long m27191() {
            r2 = this;
            Yue.ۥۢۥۣۥ$ۥ۟۟۟۟ r0 = r2.f24554
            long r0 = r0.mo27219()
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = 1.0d)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m27192() {
            r1 = this;
            Yue.ۥۢۥۣۥ$ۥ۟۟۟۟ r0 = r1.f24554
            float r0 = r0.mo27220()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m27193() {
            r1 = this;
            Yue.ۥۢۥۣۥ$ۥ۟۟۟۟ r0 = r1.f24554
            float r0 = r0.mo27221()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.view.animation.Interpolator m27194() {
            r1 = this;
            Yue.ۥۢۥۣۥ$ۥ۟۟۟۟ r0 = r1.f24554
            android.view.animation.Interpolator r0 = r0.mo27222()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m27195() {
            r1 = this;
            Yue.ۥۢۥۣۥ$ۥ۟۟۟۟ r0 = r1.f24554
            int r0 = r0.mo27223()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m27196(@Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            Yue.ۥۢۥۣۥ$ۥ۟۟۟۟ r0 = r1.f24554
            r0.m27227(r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m27197(@Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            Yue.ۥۢۥۣۥ$ۥ۟۟۟۟ r0 = r1.f24554
            r0.mo27224(r2)
            return
    }
}
