package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ScrollingTabContainerView extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ε */
    public p000.RunnableC1149 f637;

    /* JADX INFO: renamed from: ζ */
    public final androidx.appcompat.widget.LinearLayoutCompat f638;

    /* JADX INFO: renamed from: η */
    public androidx.appcompat.widget.AppCompatSpinner f639;

    /* JADX INFO: renamed from: θ */
    public boolean f640;

    /* JADX INFO: renamed from: ι */
    public int f641;

    /* JADX INFO: renamed from: κ */
    public int f642;

    /* JADX INFO: renamed from: λ */
    public int f643;

    /* JADX INFO: renamed from: μ */
    public int f644;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public class TabView extends android.widget.LinearLayout {

        /* JADX INFO: renamed from: ε */
        public final /* synthetic */ androidx.appcompat.widget.ScrollingTabContainerView f645;

        public TabView(androidx.appcompat.widget.ScrollingTabContainerView r3, android.content.Context r4) {
                r2 = this;
                r2.f645 = r3
                r3 = 0
                r0 = 2130968583(0x7f040007, float:1.7545824E38)
                r2.<init>(r4, r3, r0)
                r1 = 16842964(0x10100d4, float:2.3694152E-38)
                int[] r1 = new int[]{r1}
                m6 r4 = p000.C0538m6.m3752(r4, r3, r1, r0)
                java.lang.Object r0 = r4.f6967
                android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
                r1 = 0
                boolean r0 = r0.hasValue(r1)
                if (r0 == 0) goto L26
                android.graphics.drawable.Drawable r0 = r4.m3754(r1)
                r2.setBackgroundDrawable(r0)
            L26:
                r4.m3765()
                r4 = 8388627(0x800013, float:1.175497E-38)
                r2.setGravity(r4)
                throw r3
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
                r0 = this;
                super.onInitializeAccessibilityEvent(r1)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r1.setClassName(r0)
                return
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
                r0 = this;
                super.onInitializeAccessibilityNodeInfo(r1)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r1.setClassName(r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int r2, int r3) {
                r1 = this;
                super.onMeasure(r2, r3)
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r1.f645
                int r0 = r2.f641
                if (r0 <= 0) goto L1a
                int r0 = r1.getMeasuredWidth()
                int r2 = r2.f641
                if (r0 <= r2) goto L1a
                r0 = 1073741824(0x40000000, float:2.0)
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
                super.onMeasure(r2, r3)
            L1a:
                return
        }

        @Override // android.view.View
        public final void setSelected(boolean r2) {
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
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            return
    }

    public ScrollingTabContainerView(android.content.Context r5) {
            r4 = this;
            r4.<init>(r5)
            m00 r0 = new m00
            r1 = 1
            r0.<init>(r1, r4)
            r0 = 0
            r4.setHorizontalScrollBarEnabled(r0)
            ｍ r5 = p000.C1143.m7359(r5)
            int r0 = r5.m7361()
            r4.setContentHeight(r0)
            android.content.Context r5 = r5.f13489
            android.content.res.Resources r5 = r5.getResources()
            r0 = 2131165194(0x7f07000a, float:1.7944598E38)
            int r5 = r5.getDimensionPixelSize(r0)
            r4.f642 = r5
            androidx.appcompat.widget.LinearLayoutCompat r5 = new androidx.appcompat.widget.LinearLayoutCompat
            android.content.Context r0 = r4.getContext()
            r2 = 0
            r3 = 2130968582(0x7f040006, float:1.7545822E38)
            r5.<init>(r0, r2, r3)
            r5.setMeasureWithLargestChildEnabled(r1)
            r0 = 17
            r5.setGravity(r0)
            zr0 r0 = new zr0
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            r5.setLayoutParams(r0)
            r4.f638 = r5
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r2)
            r4.addView(r5, r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            ｓ r0 = r1.f637
            if (r0 == 0) goto La
            r1.post(r0)
        La:
            return
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.content.Context r2 = r1.getContext()
            ｍ r2 = p000.C1143.m7359(r2)
            int r0 = r2.m7361()
            r1.setContentHeight(r0)
            android.content.Context r2 = r2.f13489
            android.content.res.Resources r2 = r2.getResources()
            r0 = 2131165194(0x7f07000a, float:1.7944598E38)
            int r2 = r2.getDimensionPixelSize(r0)
            r1.f642 = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            ｓ r0 = r1.f637
            if (r0 == 0) goto La
            r1.removeCallbacks(r0)
        La:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r2 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r2
            r2.getClass()
            r0 = 0
            throw r0
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r9, int r10) {
            r8 = this;
            int r10 = android.view.View.MeasureSpec.getMode(r9)
            r0 = 0
            r1 = 1
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 != r2) goto Lc
            r3 = r1
            goto Ld
        Lc:
            r3 = r0
        Ld:
            r8.setFillViewport(r3)
            androidx.appcompat.widget.LinearLayoutCompat r4 = r8.f638
            int r5 = r4.getChildCount()
            r6 = -1
            if (r5 <= r1) goto L41
            if (r10 == r2) goto L1f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r1) goto L41
        L1f:
            r10 = 2
            if (r5 <= r10) goto L2f
            int r10 = android.view.View.MeasureSpec.getSize(r9)
            float r10 = (float) r10
            r1 = 1053609165(0x3ecccccd, float:0.4)
            float r10 = r10 * r1
            int r10 = (int) r10
            r8.f641 = r10
            goto L36
        L2f:
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            int r1 = r1 / r10
            r8.f641 = r1
        L36:
            int r10 = r8.f641
            int r1 = r8.f642
            int r10 = java.lang.Math.min(r10, r1)
            r8.f641 = r10
            goto L43
        L41:
            r8.f641 = r6
        L43:
            int r10 = r8.f643
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r2)
            if (r3 != 0) goto Lba
            boolean r1 = r8.f640
            if (r1 == 0) goto Lba
            r4.measure(r0, r10)
            int r0 = r4.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            if (r0 <= r1) goto Lb6
            androidx.appcompat.widget.AppCompatSpinner r0 = r8.f639
            if (r0 == 0) goto L67
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != r8) goto L67
            goto Lbd
        L67:
            androidx.appcompat.widget.AppCompatSpinner r0 = r8.f639
            r1 = -2
            r2 = 0
            if (r0 != 0) goto L86
            androidx.appcompat.widget.AppCompatSpinner r0 = new androidx.appcompat.widget.AppCompatSpinner
            android.content.Context r5 = r8.getContext()
            r7 = 2130968588(0x7f04000c, float:1.7545834E38)
            r0.<init>(r5, r2, r7, r6)
            zr0 r5 = new zr0
            r5.<init>(r1, r6)
            r0.setLayoutParams(r5)
            r0.setOnItemSelectedListener(r8)
            r8.f639 = r0
        L86:
            r8.removeView(r4)
            androidx.appcompat.widget.AppCompatSpinner r0 = r8.f639
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r1, r6)
            r8.addView(r0, r4)
            androidx.appcompat.widget.AppCompatSpinner r0 = r8.f639
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            if (r0 != 0) goto La5
            androidx.appcompat.widget.AppCompatSpinner r0 = r8.f639
            androidx.appcompat.widget.κ r1 = new androidx.appcompat.widget.κ
            r1.<init>(r8)
            r0.setAdapter(r1)
        La5:
            ｓ r0 = r8.f637
            if (r0 == 0) goto Lae
            r8.removeCallbacks(r0)
            r8.f637 = r2
        Lae:
            androidx.appcompat.widget.AppCompatSpinner r0 = r8.f639
            int r1 = r8.f644
            r0.setSelection(r1)
            goto Lbd
        Lb6:
            r8.m278()
            goto Lbd
        Lba:
            r8.m278()
        Lbd:
            int r0 = r8.getMeasuredWidth()
            super.onMeasure(r9, r10)
            int r9 = r8.getMeasuredWidth()
            if (r3 == 0) goto Ld1
            if (r0 == r9) goto Ld1
            int r9 = r8.f644
            r8.setTabSelected(r9)
        Ld1:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView r1) {
            r0 = this;
            return
    }

    public void setAllowCollapse(boolean r1) {
            r0 = this;
            r0.f640 = r1
            return
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.f643 = r1
            r0.requestLayout()
            return
    }

    public void setTabSelected(int r8) {
            r7 = this;
            r7.f644 = r8
            androidx.appcompat.widget.LinearLayoutCompat r0 = r7.f638
            int r1 = r0.getChildCount()
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L33
            android.view.View r4 = r0.getChildAt(r3)
            if (r3 != r8) goto L14
            r5 = 1
            goto L15
        L14:
            r5 = r2
        L15:
            r4.setSelected(r5)
            if (r5 == 0) goto L30
            android.view.View r4 = r0.getChildAt(r8)
            ｓ r5 = r7.f637
            if (r5 == 0) goto L25
            r7.removeCallbacks(r5)
        L25:
            ｓ r5 = new ｓ
            r6 = 6
            r5.<init>(r7, r6, r4)
            r7.f637 = r5
            r7.post(r5)
        L30:
            int r3 = r3 + 1
            goto La
        L33:
            androidx.appcompat.widget.AppCompatSpinner r7 = r7.f639
            if (r7 == 0) goto L3c
            if (r8 < 0) goto L3c
            r7.setSelection(r8)
        L3c:
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m278() {
            r3 = this;
            androidx.appcompat.widget.AppCompatSpinner r0 = r3.f639
            if (r0 == 0) goto L24
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != r3) goto L24
            androidx.appcompat.widget.AppCompatSpinner r0 = r3.f639
            r3.removeView(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.LinearLayoutCompat r1 = r3.f638
            r3.addView(r1, r0)
            androidx.appcompat.widget.AppCompatSpinner r0 = r3.f639
            int r0 = r0.getSelectedItemPosition()
            r3.setTabSelected(r0)
        L24:
            return
    }
}
