package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C7435 extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f25821 = "ScrollingTabContainerView";

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final android.view.animation.Interpolator f25822 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f25823 = 200;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.Runnable f25824;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public androidx.appcompat.widget.C7435.ViewOnClickListenerC7438 f25825;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public androidx.appcompat.widget.C7431 f25826;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.widget.Spinner f25827;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f25828;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f25829;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f25830;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f25831;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f25832;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public android.view.ViewPropertyAnimator f25833;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final androidx.appcompat.widget.C7435.C7440 f25834;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟$ۥ, reason: contains not printable characters */
    public class RunnableC7436 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f25835;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.C7435 f25836;

        public RunnableC7436(androidx.appcompat.widget.C7435 r1, android.view.View r2) {
                r0 = this;
                r0.f25836 = r1
                r0.f25835 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.view.View r0 = r3.f25835
                int r0 = r0.getLeft()
                androidx.appcompat.widget.ۥ۟۟۟۟ r1 = r3.f25836
                int r1 = r1.getWidth()
                android.view.View r2 = r3.f25835
                int r2 = r2.getWidth()
                int r1 = r1 - r2
                int r1 = r1 / 2
                int r0 = r0 - r1
                androidx.appcompat.widget.ۥ۟۟۟۟ r1 = r3.f25836
                r2 = 0
                r1.smoothScrollTo(r0, r2)
                androidx.appcompat.widget.ۥ۟۟۟۟ r0 = r3.f25836
                r1 = 0
                r0.f25824 = r1
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟, reason: contains not printable characters */
    public class C7437 extends android.widget.BaseAdapter {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.C7435 f25837;

        public C7437(androidx.appcompat.widget.C7435 r1) {
                r0 = this;
                r0.f25837 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                androidx.appcompat.widget.ۥ۟۟۟۟ r0 = r1.f25837
                androidx.appcompat.widget.ۥ۟۟۟ r0 = r0.f25826
                int r0 = r0.getChildCount()
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                androidx.appcompat.widget.ۥ۟۟۟۟ r0 = r1.f25837
                androidx.appcompat.widget.ۥ۟۟۟ r0 = r0.f25826
                android.view.View r2 = r0.getChildAt(r2)
                androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟ r2 = (androidx.appcompat.widget.C7435.C7439) r2
                androidx.appcompat.app.ۥ$ۥ۟۟۟۠ r2 = r2.m28479()
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                if (r2 != 0) goto L10
                androidx.appcompat.widget.ۥ۟۟۟۟ r2 = r0.f25837
                java.lang.Object r1 = r0.getItem(r1)
                androidx.appcompat.app.ۥ$ۥ۟۟۟۠ r1 = (androidx.appcompat.app.AbstractC7267.AbstractC7273) r1
                r3 = 1
                androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟ r2 = r2.m28471(r1, r3)
                goto L1c
            L10:
                r3 = r2
                androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟ r3 = (androidx.appcompat.widget.C7435.C7439) r3
                java.lang.Object r1 = r0.getItem(r1)
                androidx.appcompat.app.ۥ$ۥ۟۟۟۠ r1 = (androidx.appcompat.app.AbstractC7267.AbstractC7273) r1
                r3.m28478(r1)
            L1c:
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public class ViewOnClickListenerC7438 implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.C7435 f25838;

        public ViewOnClickListenerC7438(androidx.appcompat.widget.C7435 r1) {
                r0 = this;
                r0.f25838 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r6) {
                r5 = this;
                r0 = r6
                androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟ r0 = (androidx.appcompat.widget.C7435.C7439) r0
                androidx.appcompat.app.ۥ$ۥ۟۟۟۠ r0 = r0.m28479()
                r0.mo27905()
                androidx.appcompat.widget.ۥ۟۟۟۟ r0 = r5.f25838
                androidx.appcompat.widget.ۥ۟۟۟ r0 = r0.f25826
                int r0 = r0.getChildCount()
                r1 = 0
                r2 = r1
            L14:
                if (r2 >= r0) goto L29
                androidx.appcompat.widget.ۥ۟۟۟۟ r3 = r5.f25838
                androidx.appcompat.widget.ۥ۟۟۟ r3 = r3.f25826
                android.view.View r3 = r3.getChildAt(r2)
                if (r3 != r6) goto L22
                r4 = 1
                goto L23
            L22:
                r4 = r1
            L23:
                r3.setSelected(r4)
                int r2 = r2 + 1
                goto L14
            L29:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public class C7439 extends android.widget.LinearLayout {

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static final java.lang.String f25839 = "androidx.appcompat.app.ActionBar$Tab";

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int[] f25840;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public androidx.appcompat.app.AbstractC7267.AbstractC7273 f25841;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public android.widget.TextView f25842;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public android.widget.ImageView f25843;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public android.view.View f25844;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.C7435 f25845;

        public C7439(androidx.appcompat.widget.C7435 r3, android.content.Context r4, androidx.appcompat.app.AbstractC7267.AbstractC7273 r5, boolean r6) {
                r2 = this;
                r2.f25845 = r3
                int r3 = Yue.C5058.C5060.f16559
                r0 = 0
                r2.<init>(r4, r0, r3)
                r3 = 16842964(0x10100d4, float:2.3694152E-38)
                int[] r3 = new int[]{r3}
                r2.f25840 = r3
                r2.f25841 = r5
                int r5 = Yue.C5058.C5060.f16559
                r1 = 0
                Yue.ۥۢۡۥۦ r3 = Yue.C6264.m23339(r4, r0, r3, r5, r1)
                boolean r4 = r3.m23368(r1)
                if (r4 == 0) goto L27
                android.graphics.drawable.Drawable r4 = r3.m23347(r1)
                r2.setBackgroundDrawable(r4)
            L27:
                r3.m23371()
                if (r6 == 0) goto L32
                r3 = 8388627(0x800013, float:1.175497E-38)
                r2.setGravity(r3)
            L32:
                r2.m28480()
                return
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r2.setClassName(r0)
                return
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
                r1 = this;
                super.onInitializeAccessibilityNodeInfo(r2)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r2.setClassName(r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r2, int r3) {
                r1 = this;
                super.onMeasure(r2, r3)
                androidx.appcompat.widget.ۥ۟۟۟۟ r2 = r1.f25845
                int r2 = r2.f25829
                if (r2 <= 0) goto L1c
                int r2 = r1.getMeasuredWidth()
                androidx.appcompat.widget.ۥ۟۟۟۟ r0 = r1.f25845
                int r0 = r0.f25829
                if (r2 <= r0) goto L1c
                r2 = 1073741824(0x40000000, float:2.0)
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
                super.onMeasure(r2, r3)
            L1c:
                return
        }

        @Override // android.view.View
        public void setSelected(boolean r2) {
                r1 = this;
                boolean r0 = r1.isSelected()
                if (r0 == r2) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                super.setSelected(r2)
                if (r0 == 0) goto L14
                if (r2 == 0) goto L14
                r2 = 4
                r1.sendAccessibilityEvent(r2)
            L14:
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m28478(androidx.appcompat.app.AbstractC7267.AbstractC7273 r1) {
                r0 = this;
                r0.f25841 = r1
                r0.m28480()
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.appcompat.app.AbstractC7267.AbstractC7273 m28479() {
                r1 = this;
                androidx.appcompat.app.ۥ$ۥ۟۟۟۠ r0 = r1.f25841
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m28480() {
                r10 = this;
                androidx.appcompat.app.ۥ$ۥ۟۟۟۠ r0 = r10.f25841
                android.view.View r1 = r0.mo27900()
                r2 = 8
                r3 = 0
                if (r1 == 0) goto L32
                android.view.ViewParent r0 = r1.getParent()
                if (r0 == r10) goto L1b
                if (r0 == 0) goto L18
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r0.removeView(r1)
            L18:
                r10.addView(r1)
            L1b:
                r10.f25844 = r1
                android.widget.TextView r0 = r10.f25842
                if (r0 == 0) goto L24
                r0.setVisibility(r2)
            L24:
                android.widget.ImageView r0 = r10.f25843
                if (r0 == 0) goto Ld3
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r10.f25843
                r0.setImageDrawable(r3)
                goto Ld3
            L32:
                android.view.View r1 = r10.f25844
                if (r1 == 0) goto L3b
                r10.removeView(r1)
                r10.f25844 = r3
            L3b:
                android.graphics.drawable.Drawable r1 = r0.mo27901()
                java.lang.CharSequence r4 = r0.mo27904()
                r5 = 16
                r6 = 0
                r7 = -2
                if (r1 == 0) goto L70
                android.widget.ImageView r8 = r10.f25843
                if (r8 != 0) goto L65
                Yue.ۥ۟ۡۢۢ r8 = new Yue.ۥ۟ۡۢۢ
                android.content.Context r9 = r10.getContext()
                r8.<init>(r9)
                android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
                r9.<init>(r7, r7)
                r9.gravity = r5
                r8.setLayoutParams(r9)
                r10.addView(r8, r6)
                r10.f25843 = r8
            L65:
                android.widget.ImageView r8 = r10.f25843
                r8.setImageDrawable(r1)
                android.widget.ImageView r1 = r10.f25843
                r1.setVisibility(r6)
                goto L7c
            L70:
                android.widget.ImageView r1 = r10.f25843
                if (r1 == 0) goto L7c
                r1.setVisibility(r2)
                android.widget.ImageView r1 = r10.f25843
                r1.setImageDrawable(r3)
            L7c:
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                r1 = r1 ^ 1
                if (r1 == 0) goto Lb2
                android.widget.TextView r2 = r10.f25842
                if (r2 != 0) goto La7
                Yue.ۥ۟ۡۤ r2 = new Yue.ۥ۟ۡۤ
                android.content.Context r8 = r10.getContext()
                int r9 = Yue.C5058.C5060.f16560
                r2.<init>(r8, r3, r9)
                android.text.TextUtils$TruncateAt r8 = android.text.TextUtils.TruncateAt.END
                r2.setEllipsize(r8)
                android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
                r8.<init>(r7, r7)
                r8.gravity = r5
                r2.setLayoutParams(r8)
                r10.addView(r2)
                r10.f25842 = r2
            La7:
                android.widget.TextView r2 = r10.f25842
                r2.setText(r4)
                android.widget.TextView r2 = r10.f25842
                r2.setVisibility(r6)
                goto Lbe
            Lb2:
                android.widget.TextView r4 = r10.f25842
                if (r4 == 0) goto Lbe
                r4.setVisibility(r2)
                android.widget.TextView r2 = r10.f25842
                r2.setText(r3)
            Lbe:
                android.widget.ImageView r2 = r10.f25843
                if (r2 == 0) goto Lc9
                java.lang.CharSequence r4 = r0.mo27899()
                r2.setContentDescription(r4)
            Lc9:
                if (r1 == 0) goto Lcc
                goto Ld0
            Lcc:
                java.lang.CharSequence r3 = r0.mo27899()
            Ld0:
                Yue.C6374.m23531(r10, r3)
            Ld3:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C7440 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean f25846;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f25847;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.C7435 f25848;

        public C7440(androidx.appcompat.widget.C7435 r1) {
                r0 = this;
                r0.f25848 = r1
                r0.<init>()
                r1 = 0
                r0.f25846 = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f25846 = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.f25846
                if (r2 == 0) goto L5
                return
            L5:
                androidx.appcompat.widget.ۥ۟۟۟۟ r2 = r1.f25848
                r0 = 0
                r2.f25833 = r0
                int r0 = r1.f25847
                r2.setVisibility(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                androidx.appcompat.widget.ۥ۟۟۟۟ r2 = r1.f25848
                r0 = 0
                r2.setVisibility(r0)
                r1.f25846 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.appcompat.widget.C7435.C7440 m28481(android.view.ViewPropertyAnimator r1, int r2) {
                r0 = this;
                r0.f25847 = r2
                androidx.appcompat.widget.ۥ۟۟۟۟ r2 = r0.f25848
                r2.f25833 = r1
                return r0
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            androidx.appcompat.widget.C7435.f25822 = r0
            return
    }

    public C7435(@Yue.InterfaceC4410 android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟۟ r0 = new androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟۟
            r0.<init>(r3)
            r3.f25834 = r0
            r0 = 0
            r3.setHorizontalScrollBarEnabled(r0)
            Yue.ۥ۟۟ۦۨ r4 = Yue.C0179.m983(r4)
            int r0 = r4.m988()
            r3.setContentHeight(r0)
            int r4 = r4.m987()
            r3.f25830 = r4
            androidx.appcompat.widget.ۥ۟۟۟ r4 = r3.m28470()
            r3.f25826 = r4
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            r3.addView(r4, r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.Runnable r0 = r1.f25824
            if (r0 == 0) goto La
            r1.post(r0)
        La:
            return
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.content.Context r2 = r1.getContext()
            Yue.ۥ۟۟ۦۨ r2 = Yue.C0179.m983(r2)
            int r0 = r2.m988()
            r1.setContentHeight(r0)
            int r2 = r2.m987()
            r1.f25830 = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.f25824
            if (r0 == 0) goto La
            r1.removeCallbacks(r0)
        La:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟ r2 = (androidx.appcompat.widget.C7435.C7439) r2
            androidx.appcompat.app.ۥ$ۥ۟۟۟۠ r1 = r2.m28479()
            r1.mo27905()
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int r6, int r7) {
            r5 = this;
            int r7 = android.view.View.MeasureSpec.getMode(r6)
            r0 = 0
            r1 = 1
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 != r2) goto Lc
            r3 = r1
            goto Ld
        Lc:
            r3 = r0
        Ld:
            r5.setFillViewport(r3)
            androidx.appcompat.widget.ۥ۟۟۟ r4 = r5.f25826
            int r4 = r4.getChildCount()
            if (r4 <= r1) goto L40
            if (r7 == r2) goto L1e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r1) goto L40
        L1e:
            r7 = 2
            if (r4 <= r7) goto L2e
            int r7 = android.view.View.MeasureSpec.getSize(r6)
            float r7 = (float) r7
            r1 = 1053609165(0x3ecccccd, float:0.4)
            float r7 = r7 * r1
            int r7 = (int) r7
            r5.f25829 = r7
            goto L35
        L2e:
            int r1 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = r1 / r7
            r5.f25829 = r1
        L35:
            int r7 = r5.f25829
            int r1 = r5.f25830
            int r7 = java.lang.Math.min(r7, r1)
            r5.f25829 = r7
            goto L43
        L40:
            r7 = -1
            r5.f25829 = r7
        L43:
            int r7 = r5.f25831
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2)
            if (r3 != 0) goto L68
            boolean r1 = r5.f25828
            if (r1 == 0) goto L68
            androidx.appcompat.widget.ۥ۟۟۟ r1 = r5.f25826
            r1.measure(r0, r7)
            androidx.appcompat.widget.ۥ۟۟۟ r0 = r5.f25826
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r6)
            if (r0 <= r1) goto L64
            r5.m28473()
            goto L6b
        L64:
            r5.m28474()
            goto L6b
        L68:
            r5.m28474()
        L6b:
            int r0 = r5.getMeasuredWidth()
            super.onMeasure(r6, r7)
            int r6 = r5.getMeasuredWidth()
            if (r3 == 0) goto L7f
            if (r0 == r6) goto L7f
            int r6 = r5.f25832
            r5.setTabSelected(r6)
        L7f:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }

    public void setAllowCollapse(boolean r1) {
            r0 = this;
            r0.f25828 = r1
            return
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.f25831 = r1
            r0.requestLayout()
            return
    }

    public void setTabSelected(int r6) {
            r5 = this;
            r5.f25832 = r6
            androidx.appcompat.widget.ۥ۟۟۟ r0 = r5.f25826
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L22
            androidx.appcompat.widget.ۥ۟۟۟ r3 = r5.f25826
            android.view.View r3 = r3.getChildAt(r2)
            if (r2 != r6) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = r1
        L17:
            r3.setSelected(r4)
            if (r4 == 0) goto L1f
            r5.m28467(r6)
        L1f:
            int r2 = r2 + 1
            goto La
        L22:
            android.widget.Spinner r0 = r5.f25827
            if (r0 == 0) goto L2b
            if (r6 < 0) goto L2b
            r0.setSelection(r6)
        L2b:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m28465(androidx.appcompat.app.AbstractC7267.AbstractC7273 r6, int r7, boolean r8) {
            r5 = this;
            r0 = 0
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟ r6 = r5.m28471(r6, r0)
            androidx.appcompat.widget.ۥ۟۟۟ r1 = r5.f25826
            androidx.appcompat.widget.ۥ۟۟۟$ۥ۟ r2 = new androidx.appcompat.widget.ۥ۟۟۟$ۥ۟
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r0, r3, r4)
            r1.addView(r6, r7, r2)
            android.widget.Spinner r7 = r5.f25827
            if (r7 == 0) goto L1f
            android.widget.SpinnerAdapter r7 = r7.getAdapter()
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟ r7 = (androidx.appcompat.widget.C7435.C7437) r7
            r7.notifyDataSetChanged()
        L1f:
            if (r8 == 0) goto L25
            r7 = 1
            r6.setSelected(r7)
        L25:
            boolean r6 = r5.f25828
            if (r6 == 0) goto L2c
            r5.requestLayout()
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m28466(androidx.appcompat.app.AbstractC7267.AbstractC7273 r6, boolean r7) {
            r5 = this;
            r0 = 0
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟ r6 = r5.m28471(r6, r0)
            androidx.appcompat.widget.ۥ۟۟۟ r1 = r5.f25826
            androidx.appcompat.widget.ۥ۟۟۟$ۥ۟ r2 = new androidx.appcompat.widget.ۥ۟۟۟$ۥ۟
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r0, r3, r4)
            r1.addView(r6, r2)
            android.widget.Spinner r0 = r5.f25827
            if (r0 == 0) goto L1f
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟ r0 = (androidx.appcompat.widget.C7435.C7437) r0
            r0.notifyDataSetChanged()
        L1f:
            if (r7 == 0) goto L25
            r7 = 1
            r6.setSelected(r7)
        L25:
            boolean r6 = r5.f25828
            if (r6 == 0) goto L2c
            r5.requestLayout()
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m28467(int r2) {
            r1 = this;
            androidx.appcompat.widget.ۥ۟۟۟ r0 = r1.f25826
            android.view.View r2 = r0.getChildAt(r2)
            java.lang.Runnable r0 = r1.f25824
            if (r0 == 0) goto Ld
            r1.removeCallbacks(r0)
        Ld:
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ r0 = new androidx.appcompat.widget.ۥ۟۟۟۟$ۥ
            r0.<init>(r1, r2)
            r1.f25824 = r0
            r1.post(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m28468(int r5) {
            r4 = this;
            android.view.ViewPropertyAnimator r0 = r4.f25833
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 200(0xc8, double:9.9E-322)
            r2 = 0
            if (r5 != 0) goto L34
            int r3 = r4.getVisibility()
            if (r3 == 0) goto L15
            r4.setAlpha(r2)
        L15:
            android.view.ViewPropertyAnimator r2 = r4.animate()
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            r2.setDuration(r0)
            android.view.animation.Interpolator r0 = androidx.appcompat.widget.C7435.f25822
            r2.setInterpolator(r0)
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟۟ r0 = r4.f25834
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟۟ r5 = r0.m28481(r2, r5)
            r2.setListener(r5)
            r2.start()
            goto L50
        L34:
            android.view.ViewPropertyAnimator r3 = r4.animate()
            android.view.ViewPropertyAnimator r2 = r3.alpha(r2)
            r2.setDuration(r0)
            android.view.animation.Interpolator r0 = androidx.appcompat.widget.C7435.f25822
            r2.setInterpolator(r0)
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟۟ r0 = r4.f25834
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟۟ r5 = r0.m28481(r2, r5)
            r2.setListener(r5)
            r2.start()
        L50:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.widget.Spinner m28469() {
            r4 = this;
            Yue.ۥۣ۟ۡۤ r0 = new Yue.ۥۣ۟ۡۤ
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = Yue.C5058.C5060.f16564
            r0.<init>(r1, r2, r3)
            androidx.appcompat.widget.ۥ۟۟۟$ۥ۟ r1 = new androidx.appcompat.widget.ۥ۟۟۟$ۥ۟
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r0.setOnItemSelectedListener(r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final androidx.appcompat.widget.C7431 m28470() {
            r4 = this;
            androidx.appcompat.widget.ۥ۟۟۟ r0 = new androidx.appcompat.widget.ۥ۟۟۟
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = Yue.C5058.C5060.f16558
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.setMeasureWithLargestChildEnabled(r1)
            r1 = 17
            r0.setGravity(r1)
            androidx.appcompat.widget.ۥ۟۟۟$ۥ۟ r1 = new androidx.appcompat.widget.ۥ۟۟۟$ۥ۟
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public androidx.appcompat.widget.C7435.C7439 m28471(androidx.appcompat.app.AbstractC7267.AbstractC7273 r3, boolean r4) {
            r2 = this;
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟ r0 = new androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟
            android.content.Context r1 = r2.getContext()
            r0.<init>(r2, r1, r3, r4)
            if (r4 == 0) goto L1b
            r3 = 0
            r0.setBackgroundDrawable(r3)
            android.widget.AbsListView$LayoutParams r3 = new android.widget.AbsListView$LayoutParams
            r4 = -1
            int r1 = r2.f25831
            r3.<init>(r4, r1)
            r0.setLayoutParams(r3)
            goto L2f
        L1b:
            r3 = 1
            r0.setFocusable(r3)
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟ r3 = r2.f25825
            if (r3 != 0) goto L2a
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟ r3 = new androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟
            r3.<init>(r2)
            r2.f25825 = r3
        L2a:
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟ r3 = r2.f25825
            r0.setOnClickListener(r3)
        L2f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m28472() {
            r1 = this;
            android.widget.Spinner r0 = r1.f25827
            if (r0 == 0) goto Lc
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m28473() {
            r4 = this;
            boolean r0 = r4.m28472()
            if (r0 == 0) goto L7
            return
        L7:
            android.widget.Spinner r0 = r4.f25827
            if (r0 != 0) goto L11
            android.widget.Spinner r0 = r4.m28469()
            r4.f25827 = r0
        L11:
            androidx.appcompat.widget.ۥ۟۟۟ r0 = r4.f25826
            r4.removeView(r0)
            android.widget.Spinner r0 = r4.f25827
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r4.addView(r0, r1)
            android.widget.Spinner r0 = r4.f25827
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            if (r0 != 0) goto L34
            android.widget.Spinner r0 = r4.f25827
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟ r1 = new androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟
            r1.<init>(r4)
            r0.setAdapter(r1)
        L34:
            java.lang.Runnable r0 = r4.f25824
            if (r0 == 0) goto L3e
            r4.removeCallbacks(r0)
            r0 = 0
            r4.f25824 = r0
        L3e:
            android.widget.Spinner r0 = r4.f25827
            int r1 = r4.f25832
            r0.setSelection(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m28474() {
            r5 = this;
            boolean r0 = r5.m28472()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.widget.Spinner r0 = r5.f25827
            r5.removeView(r0)
            androidx.appcompat.widget.ۥ۟۟۟ r0 = r5.f25826
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r2.<init>(r3, r4)
            r5.addView(r0, r2)
            android.widget.Spinner r0 = r5.f25827
            int r0 = r0.getSelectedItemPosition()
            r5.setTabSelected(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m28475() {
            r1 = this;
            androidx.appcompat.widget.ۥ۟۟۟ r0 = r1.f25826
            r0.removeAllViews()
            android.widget.Spinner r0 = r1.f25827
            if (r0 == 0) goto L12
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟ r0 = (androidx.appcompat.widget.C7435.C7437) r0
            r0.notifyDataSetChanged()
        L12:
            boolean r0 = r1.f25828
            if (r0 == 0) goto L19
            r1.requestLayout()
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m28476(int r2) {
            r1 = this;
            androidx.appcompat.widget.ۥ۟۟۟ r0 = r1.f25826
            r0.removeViewAt(r2)
            android.widget.Spinner r2 = r1.f25827
            if (r2 == 0) goto L12
            android.widget.SpinnerAdapter r2 = r2.getAdapter()
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟ r2 = (androidx.appcompat.widget.C7435.C7437) r2
            r2.notifyDataSetChanged()
        L12:
            boolean r2 = r1.f25828
            if (r2 == 0) goto L19
            r1.requestLayout()
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m28477(int r2) {
            r1 = this;
            androidx.appcompat.widget.ۥ۟۟۟ r0 = r1.f25826
            android.view.View r2 = r0.getChildAt(r2)
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟۟۟ r2 = (androidx.appcompat.widget.C7435.C7439) r2
            r2.m28480()
            android.widget.Spinner r2 = r1.f25827
            if (r2 == 0) goto L18
            android.widget.SpinnerAdapter r2 = r2.getAdapter()
            androidx.appcompat.widget.ۥ۟۟۟۟$ۥ۟ r2 = (androidx.appcompat.widget.C7435.C7437) r2
            r2.notifyDataSetChanged()
        L18:
            boolean r2 = r1.f25828
            if (r2 == 0) goto L1f
            r1.requestLayout()
        L1f:
            return
    }
}
