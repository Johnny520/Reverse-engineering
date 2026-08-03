package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@android.annotation.SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends android.view.ViewGroup implements Yue.InterfaceC1762, Yue.InterfaceC4386, Yue.InterfaceC4384, Yue.InterfaceC4385 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f25545 = "ActionBarOverlayLayout";

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final int f25546 = 600;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int[] f25547 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final Yue.C7065 f25548 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final android.graphics.Rect f25549 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f25550;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f25551;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public androidx.appcompat.widget.ContentFrameLayout f25552;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public androidx.appcompat.widget.ActionBarContainer f25553;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.InterfaceC1763 f25554;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f25555;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f25556;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f25557;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f25558;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f25559;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f25560;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f25561;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final android.graphics.Rect f25562;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final android.graphics.Rect f25563;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final android.graphics.Rect f25564;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final android.graphics.Rect f25565;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final android.graphics.Rect f25566;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final android.graphics.Rect f25567;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final android.graphics.Rect f25568;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final android.graphics.Rect f25569;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public Yue.C7065 f25570;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public Yue.C7065 f25571;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public Yue.C7065 f25572;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public Yue.C7065 f25573;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC7365 f25574;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public android.widget.OverScroller f25575;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public android.view.ViewPropertyAnimator f25576;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final android.animation.AnimatorListenerAdapter f25577;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final java.lang.Runnable f25578;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final java.lang.Runnable f25579;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.C4387 f25580;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final androidx.appcompat.widget.ActionBarOverlayLayout.C7367 f25581;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ, reason: contains not printable characters */
    public class C7362 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f25582;

        public C7362(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f25582 = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r1.f25582
                r0 = 0
                r2.f25576 = r0
                r0 = 0
                r2.f25559 = r0
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r1.f25582
                r0 = 0
                r2.f25576 = r0
                r0 = 0
                r2.f25559 = r0
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟, reason: contains not printable characters */
    public class RunnableC7363 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f25583;

        public RunnableC7363(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f25583 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f25583
                r0.m28274()
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f25583
                androidx.appcompat.widget.ActionBarContainer r1 = r0.f25553
                android.view.ViewPropertyAnimator r1 = r1.animate()
                r2 = 0
                android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r3.f25583
                android.animation.AnimatorListenerAdapter r2 = r2.f25577
                android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
                r0.f25576 = r1
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC7364 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f25584;

        public RunnableC7364(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f25584 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f25584
                r0.m28274()
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f25584
                androidx.appcompat.widget.ActionBarContainer r1 = r0.f25553
                android.view.ViewPropertyAnimator r1 = r1.animate()
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r3.f25584
                androidx.appcompat.widget.ActionBarContainer r2 = r2.f25553
                int r2 = r2.getHeight()
                int r2 = -r2
                float r2 = (float) r2
                android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r3.f25584
                android.animation.AnimatorListenerAdapter r2 = r2.f25577
                android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
                r0.f25576 = r1
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC7365 {
        /* JADX INFO: renamed from: ۥ */
        void mo28133();

        /* JADX INFO: renamed from: ۥ۟ */
        void mo28134();

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo28135(boolean r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo28136();

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        void mo28137();

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo28138(int r1);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7366 extends android.view.ViewGroup.MarginLayoutParams {
        public C7366(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C7366(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C7366(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public C7366(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C7367 extends android.view.View {
        public C7367(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.setWillNotDraw(r1)
                return
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    static {
            int r0 = Yue.C5058.C5060.f16555
            r1 = 16842841(0x1010059, float:2.3693807E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.ActionBarOverlayLayout.f25547 = r0
            Yue.ۥۢۥۦ$ۥ۟ r0 = new Yue.ۥۢۥۦ$ۥ۟
            r0.<init>()
            r1 = 0
            r2 = 1
            Yue.ۥ۠ۥۣۡ r1 = Yue.C3267.m13726(r1, r2, r1, r2)
            Yue.ۥۢۥۦ$ۥ۟ r0 = r0.m27321(r1)
            Yue.ۥۢۥۦ r0 = r0.m27314()
            androidx.appcompat.widget.ActionBarOverlayLayout.f25548 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.appcompat.widget.ActionBarOverlayLayout.f25549 = r0
            return
    }

    public ActionBarOverlayLayout(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarOverlayLayout(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.f25551 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f25562 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f25563 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f25564 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f25565 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f25566 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f25567 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f25568 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f25569 = r2
            Yue.ۥۢۥۦ r2 = Yue.C7065.f24590
            r0.f25570 = r2
            r0.f25571 = r2
            r0.f25572 = r2
            r0.f25573 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$ۥ
            r2.<init>(r0)
            r0.f25577 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟ r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟
            r2.<init>(r0)
            r0.f25578 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟ r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟
            r2.<init>(r0)
            r0.f25579 = r2
            r0.m28267(r1)
            Yue.ۥۡۢۢۤ r2 = new Yue.ۥۡۢۢۤ
            r2.<init>(r0)
            r0.f25580 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۠ r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۠
            r2.<init>(r1)
            r0.f25581 = r2
            r0.addView(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    private void m28267(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.f25547
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.f25550 = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.f25555 = r3
            if (r3 != 0) goto L1f
            r1 = r2
        L1f:
            r4.setWillNotDraw(r1)
            r0.recycle()
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r5)
            r4.f25575 = r0
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.ActionBarOverlayLayout.C7366
            return r1
    }

    @Override // android.view.View
    public void draw(@Yue.InterfaceC4410 android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.f25555
            if (r0 == 0) goto L39
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f25553
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L23
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f25553
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.f25553
            float r2 = r2.getTranslationY()
            float r0 = r0 + r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r0 = (int) r0
            goto L24
        L23:
            r0 = r1
        L24:
            android.graphics.drawable.Drawable r2 = r5.f25555
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.f25555
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r0 = r5.f25555
            r0.draw(r6)
        L39:
            return
    }

    @Override // android.view.View
    public boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.fitSystemWindows(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟ r0 = r1.m28271()
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟ r1 = r0.m28272(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟ r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟
            r0.<init>(r2)
            return r0
    }

    public int getActionBarHideOffset() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f25553
            if (r0 == 0) goto Lb
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r0 = -r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // android.view.ViewGroup, Yue.InterfaceC4386
    public int getNestedScrollAxes() {
            r1 = this;
            Yue.ۥۡۢۢۤ r0 = r1.f25580
            int r0 = r0.m17252()
            return r0
    }

    @Override // Yue.InterfaceC1762
    public java.lang.CharSequence getTitle() {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.View
    @Yue.InterfaceC5336(21)
    public android.view.WindowInsets onApplyWindowInsets(@Yue.InterfaceC4410 android.view.WindowInsets r8) {
            r7 = this;
            r7.m28279()
            Yue.ۥۢۥۦ r8 = Yue.C7065.m27277(r8, r7)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r0 = r8.m27293()
            int r1 = r8.m27295()
            int r3 = r8.m27294()
            int r4 = r8.m27292()
            r2.<init>(r0, r1, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r7.f25553
            r5 = 0
            r6 = 1
            r3 = 1
            r4 = 1
            r0 = r7
            boolean r0 = r0.m28269(r1, r2, r3, r4, r5, r6)
            android.graphics.Rect r1 = r7.f25562
            Yue.C6794.m26100(r7, r8, r1)
            android.graphics.Rect r1 = r7.f25562
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r1 = r1.bottom
            Yue.ۥۢۥۦ r1 = r8.m27301(r2, r3, r4, r1)
            r7.f25570 = r1
            Yue.ۥۢۥۦ r2 = r7.f25571
            boolean r1 = r2.equals(r1)
            r2 = 1
            if (r1 != 0) goto L4a
            Yue.ۥۢۥۦ r0 = r7.f25570
            r7.f25571 = r0
            r0 = r2
        L4a:
            android.graphics.Rect r1 = r7.f25563
            android.graphics.Rect r3 = r7.f25562
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5c
            android.graphics.Rect r0 = r7.f25563
            android.graphics.Rect r1 = r7.f25562
            r0.set(r1)
            goto L5d
        L5c:
            r2 = r0
        L5d:
            if (r2 == 0) goto L62
            r7.requestLayout()
        L62:
            Yue.ۥۢۥۦ r8 = r8.m27278()
            Yue.ۥۢۥۦ r8 = r8.m27280()
            Yue.ۥۢۥۦ r8 = r8.m27279()
            android.view.WindowInsets r8 = r8.m27312()
            return r8
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            r0.m28267(r1)
            Yue.C6794.m26217(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.m28274()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r6 = r4.getPaddingLeft()
            int r7 = r4.getPaddingTop()
            r8 = 0
        Ld:
            if (r8 >= r5) goto L37
            android.view.View r9 = r4.getChildAt(r8)
            int r0 = r9.getVisibility()
            r1 = 8
            if (r0 == r1) goto L34
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟ r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C7366) r0
            int r1 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            int r3 = r0.leftMargin
            int r3 = r3 + r6
            int r0 = r0.topMargin
            int r0 = r0 + r7
            int r1 = r1 + r3
            int r2 = r2 + r0
            r9.layout(r3, r0, r1, r2)
        L34:
            int r8 = r8 + 1
            goto Ld
        L37:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r12, int r13) {
            r11 = this;
            r11.m28279()
            androidx.appcompat.widget.ActionBarContainer r1 = r11.f25553
            r3 = 0
            r5 = 0
            r0 = r11
            r2 = r12
            r4 = r13
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.f25553
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟ r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C7366) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r11.f25553
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r3 = r11.f25553
            int r3 = r3.getMeasuredHeight()
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r11.f25553
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r3)
            int r4 = Yue.C6794.m26169(r11)
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L4a
            r4 = 1
            goto L4b
        L4a:
            r4 = r2
        L4b:
            if (r4 == 0) goto L5f
            int r5 = r11.f25550
            boolean r6 = r11.f25557
            if (r6 == 0) goto L71
            androidx.appcompat.widget.ActionBarContainer r6 = r11.f25553
            android.view.View r6 = r6.getTabContainer()
            if (r6 == 0) goto L71
            int r6 = r11.f25550
            int r5 = r5 + r6
            goto L71
        L5f:
            androidx.appcompat.widget.ActionBarContainer r5 = r11.f25553
            int r5 = r5.getVisibility()
            r6 = 8
            if (r5 == r6) goto L70
            androidx.appcompat.widget.ActionBarContainer r5 = r11.f25553
            int r5 = r5.getMeasuredHeight()
            goto L71
        L70:
            r5 = r2
        L71:
            android.graphics.Rect r6 = r11.f25564
            android.graphics.Rect r7 = r11.f25562
            r6.set(r7)
            Yue.ۥۢۥۦ r6 = r11.f25570
            r11.f25572 = r6
            boolean r6 = r11.f25556
            if (r6 != 0) goto L9c
            if (r4 != 0) goto L9c
            boolean r4 = r11.m28270()
            if (r4 == 0) goto L9c
            android.graphics.Rect r4 = r11.f25564
            int r6 = r4.top
            int r6 = r6 + r5
            r4.top = r6
            int r6 = r4.bottom
            r4.bottom = r6
            Yue.ۥۢۥۦ r4 = r11.f25572
            Yue.ۥۢۥۦ r2 = r4.m27301(r2, r5, r2, r2)
            r11.f25572 = r2
            goto Lca
        L9c:
            Yue.ۥۢۥۦ r2 = r11.f25572
            int r2 = r2.m27293()
            Yue.ۥۢۥۦ r4 = r11.f25572
            int r4 = r4.m27295()
            int r4 = r4 + r5
            Yue.ۥۢۥۦ r5 = r11.f25572
            int r5 = r5.m27294()
            Yue.ۥۢۥۦ r6 = r11.f25572
            int r6 = r6.m27292()
            Yue.ۥ۠ۥۣۡ r2 = Yue.C3267.m13726(r2, r4, r5, r6)
            Yue.ۥۢۥۦ$ۥ۟ r4 = new Yue.ۥۢۥۦ$ۥ۟
            Yue.ۥۢۥۦ r5 = r11.f25572
            r4.<init>(r5)
            Yue.ۥۢۥۦ$ۥ۟ r2 = r4.m27321(r2)
            Yue.ۥۢۥۦ r2 = r2.m27314()
            r11.f25572 = r2
        Lca:
            androidx.appcompat.widget.ContentFrameLayout r5 = r11.f25552
            android.graphics.Rect r6 = r11.f25564
            r9 = 1
            r10 = 1
            r7 = 1
            r8 = 1
            r4 = r11
            r4.m28269(r5, r6, r7, r8, r9, r10)
            Yue.ۥۢۥۦ r2 = r11.f25573
            Yue.ۥۢۥۦ r4 = r11.f25572
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Le9
            Yue.ۥۢۥۦ r2 = r11.f25572
            r11.f25573 = r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.f25552
            Yue.C6794.m26101(r4, r2)
        Le9:
            androidx.appcompat.widget.ContentFrameLayout r6 = r11.f25552
            r8 = 0
            r10 = 0
            r5 = r11
            r7 = r12
            r9 = r13
            r5.measureChildWithMargins(r6, r7, r8, r9, r10)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.f25552
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟ r2 = (androidx.appcompat.widget.ActionBarOverlayLayout.C7366) r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.f25552
            int r4 = r4.getMeasuredWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r1 = java.lang.Math.max(r1, r4)
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.f25552
            int r4 = r4.getMeasuredHeight()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            int r0 = java.lang.Math.max(r0, r4)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.f25552
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            int r3 = r11.getPaddingLeft()
            int r4 = r11.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            int r3 = r11.getPaddingTop()
            int r4 = r11.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r11.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r11.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            int r12 = android.view.View.resolveSizeAndState(r1, r12, r2)
            int r1 = r2 << 16
            int r13 = android.view.View.resolveSizeAndState(r0, r13, r1)
            r11.setMeasuredDimension(r12, r13)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            boolean r1 = r0.f25558
            if (r1 == 0) goto L18
            if (r4 != 0) goto L7
            goto L18
        L7:
            boolean r1 = r0.m28281(r3)
            if (r1 == 0) goto L11
            r0.m28268()
            goto L14
        L11:
            r0.m28280()
        L14:
            r1 = 1
            r0.f25559 = r1
            return r1
        L18:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC4384
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4, int r5) {
            r0 = this;
            if (r5 != 0) goto L5
            r0.onNestedPreScroll(r1, r2, r3, r4)
        L5:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.f25560
            int r1 = r1 + r3
            r0.f25560 = r1
            r0.setActionBarHideOffset(r1)
            return
    }

    @Override // Yue.InterfaceC4384
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // Yue.InterfaceC4385
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            Yue.ۥۡۢۢۤ r0 = r1.f25580
            r0.m17253(r2, r3, r4)
            int r2 = r1.getActionBarHideOffset()
            r1.f25560 = r2
            r1.m28274()
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟ r2 = r1.f25574
            if (r2 == 0) goto L15
            r2.mo28137()
        L15:
            return
    }

    @Override // Yue.InterfaceC4384
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L10
            androidx.appcompat.widget.ActionBarContainer r1 = r0.f25553
            int r1 = r1.getVisibility()
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            boolean r1 = r0.f25558
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // Yue.InterfaceC4384
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto La
            boolean r1 = r0.onStartNestedScroll(r1, r2, r3)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            boolean r2 = r1.f25558
            if (r2 == 0) goto L19
            boolean r2 = r1.f25559
            if (r2 != 0) goto L19
            int r2 = r1.f25560
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f25553
            int r0 = r0.getHeight()
            if (r2 > r0) goto L16
            r1.m28278()
            goto L19
        L16:
            r1.m28277()
        L19:
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟ r2 = r1.f25574
            if (r2 == 0) goto L20
            r2.mo28134()
        L20:
            return
    }

    @Override // Yue.InterfaceC4384
    public void onStopNestedScroll(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void onWindowSystemUiVisibilityChanged(int r5) {
            r4 = this;
            super.onWindowSystemUiVisibilityChanged(r5)
            r4.m28279()
            int r0 = r4.f25561
            r0 = r0 ^ r5
            r4.f25561 = r5
            r1 = r5 & 4
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = r2
        L14:
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L19
            r2 = r3
        L19:
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟ r5 = r4.f25574
            if (r5 == 0) goto L32
            r3 = r2 ^ 1
            r5.mo28135(r3)
            if (r1 != 0) goto L2d
            if (r2 != 0) goto L27
            goto L2d
        L27:
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟ r5 = r4.f25574
            r5.mo28136()
            goto L32
        L2d:
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟ r5 = r4.f25574
            r5.mo28133()
        L32:
            r5 = r0 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L3d
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟ r5 = r4.f25574
            if (r5 == 0) goto L3d
            Yue.C6794.m26217(r4)
        L3d:
            return
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            r1.f25551 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟ r0 = r1.f25574
            if (r0 == 0) goto Lc
            r0.mo28138(r2)
        Lc:
            return
    }

    public void setActionBarHideOffset(int r3) {
            r2 = this;
            r2.m28274()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f25553
            int r0 = r0.getHeight()
            r1 = 0
            int r3 = java.lang.Math.min(r3, r0)
            int r3 = java.lang.Math.max(r1, r3)
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f25553
            int r3 = -r3
            float r3 = (float) r3
            r0.setTranslationY(r3)
            return
    }

    public void setActionBarVisibilityCallback(androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC7365 r2) {
            r1 = this;
            r1.f25574 = r2
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L19
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟ r2 = r1.f25574
            int r0 = r1.f25551
            r2.mo28138(r0)
            int r2 = r1.f25561
            if (r2 == 0) goto L19
            r1.onWindowSystemUiVisibilityChanged(r2)
            Yue.C6794.m26217(r1)
        L19:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.f25557 = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.f25558
            if (r2 == r0) goto Lf
            r1.f25558 = r2
            if (r2 != 0) goto Lf
            r1.m28274()
            r2 = 0
            r1.setActionBarHideOffset(r2)
        Lf:
            return
    }

    @Override // Yue.InterfaceC1762
    public void setIcon(int r2) {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            r0.setIcon(r2)
            return
    }

    @Override // Yue.InterfaceC1762
    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            r0.setIcon(r2)
            return
    }

    @Override // Yue.InterfaceC1762
    public void setLogo(int r2) {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            r0.setLogo(r2)
            return
    }

    public void setOverlayMode(boolean r1) {
            r0 = this;
            r0.f25556 = r1
            return
    }

    public void setShowingForActionMode(boolean r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC1762
    public void setUiOptions(int r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC1762
    public void setWindowCallback(android.view.Window.Callback r2) {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            r0.setWindowCallback(r2)
            return
    }

    @Override // Yue.InterfaceC1762
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            r0.setWindowTitle(r2)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ */
    public void mo8368(android.view.Menu r2, androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r3) {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            r0.mo8381(r2, r3)
            return
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo8369() {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            boolean r0 = r0.mo8382()
            return r0
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo8370() {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            r0.mo8383()
            return
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo8371() {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            boolean r0 = r0.mo8384()
            return r0
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo8372() {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            boolean r0 = r0.mo8385()
            return r0
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo8373() {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            boolean r0 = r0.mo8386()
            return r0
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo8374() {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            boolean r0 = r0.mo8387()
            return r0
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo8375() {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            boolean r0 = r0.mo8388()
            return r0
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo8376() {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            boolean r0 = r0.mo8389()
            return r0
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo8377(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            r0.mo8401(r2)
            return
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo8378(int r2) {
            r1 = this;
            r1.m28279()
            r0 = 2
            if (r2 == r0) goto L19
            r0 = 5
            if (r2 == r0) goto L13
            r0 = 109(0x6d, float:1.53E-43)
            if (r2 == r0) goto Le
            goto L1e
        Le:
            r2 = 1
            r1.setOverlayMode(r2)
            goto L1e
        L13:
            Yue.ۥ۟ۨۤۨ r2 = r1.f25554
            r2.mo8422()
            goto L1e
        L19:
            Yue.ۥ۟ۨۤۨ r2 = r1.f25554
            r2.mo8420()
        L1e:
            return
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo8379() {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            r0.mo8391()
            return
    }

    @Override // Yue.InterfaceC1762
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo8380(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r1.m28279()
            Yue.ۥ۟ۨۤۨ r0 = r1.f25554
            r0.mo8414(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m28268() {
            r1 = this;
            r1.m28274()
            java.lang.Runnable r0 = r1.f25579
            r0.run()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m28269(@Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟ r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C7366) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m28270() {
            r3 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۠ r0 = r3.f25581
            Yue.ۥۢۥۦ r1 = androidx.appcompat.widget.ActionBarOverlayLayout.f25548
            android.graphics.Rect r2 = r3.f25565
            Yue.C6794.m26100(r0, r1, r2)
            android.graphics.Rect r0 = r3.f25565
            android.graphics.Rect r1 = androidx.appcompat.widget.ActionBarOverlayLayout.f25549
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public androidx.appcompat.widget.ActionBarOverlayLayout.C7366 m28271() {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟ r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public androidx.appcompat.widget.ActionBarOverlayLayout.C7366 m28272(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟ r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Yue.InterfaceC1763 m28273(android.view.View r4) {
            r3 = this;
            boolean r0 = r4 instanceof Yue.InterfaceC1763
            if (r0 == 0) goto L7
            Yue.ۥ۟ۨۤۨ r4 = (Yue.InterfaceC1763) r4
            return r4
        L7:
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L12
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            Yue.ۥ۟ۨۤۨ r4 = r4.getWrapper()
            return r4
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't make a decor toolbar out of "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m28274() {
            r1 = this;
            java.lang.Runnable r0 = r1.f25578
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.f25579
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r0 = r1.f25576
            if (r0 == 0) goto L11
            r0.cancel()
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m28275() {
            r1 = this;
            boolean r0 = r1.f25558
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m28276() {
            r1 = this;
            boolean r0 = r1.f25556
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m28277() {
            r3 = this;
            r3.m28274()
            java.lang.Runnable r0 = r3.f25579
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m28278() {
            r3 = this;
            r3.m28274()
            java.lang.Runnable r0 = r3.f25578
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m28279() {
            r1 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r1.f25552
            if (r0 != 0) goto L24
            int r0 = Yue.C5058.C5065.f17098
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r1.f25552 = r0
            int r0 = Yue.C5058.C5065.f17099
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r1.f25553 = r0
            int r0 = Yue.C5058.C5065.f17097
            android.view.View r0 = r1.findViewById(r0)
            Yue.ۥ۟ۨۤۨ r0 = r1.m28273(r0)
            r1.f25554 = r0
        L24:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m28280() {
            r1 = this;
            r1.m28274()
            java.lang.Runnable r0 = r1.f25578
            r0.run()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final boolean m28281(float r10) {
            r9 = this;
            android.widget.OverScroller r0 = r9.f25575
            int r4 = (int) r10
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r10 = r9.f25575
            int r10 = r10.getFinalY()
            androidx.appcompat.widget.ActionBarContainer r0 = r9.f25553
            int r0 = r0.getHeight()
            if (r10 <= r0) goto L20
            r10 = 1
            goto L21
        L20:
            r10 = 0
        L21:
            return r10
    }
}
