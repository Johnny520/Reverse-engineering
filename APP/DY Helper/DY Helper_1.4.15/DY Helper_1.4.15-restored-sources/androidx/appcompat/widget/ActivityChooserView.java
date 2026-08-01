package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ε */
    public final p000.C0267f f529;

    /* JADX INFO: renamed from: ζ */
    public final p000.ViewOnClickListenerC0304g f530;

    /* JADX INFO: renamed from: η */
    public final android.view.View f531;

    /* JADX INFO: renamed from: θ */
    public final android.widget.FrameLayout f532;

    /* JADX INFO: renamed from: ι */
    public final android.widget.ImageView f533;

    /* JADX INFO: renamed from: κ */
    public final android.widget.FrameLayout f534;

    /* JADX INFO: renamed from: λ */
    public p000.AbstractC1154 f535;

    /* JADX INFO: renamed from: μ */
    public final p000.ViewTreeObserverOnGlobalLayoutListenerC0194d f536;

    /* JADX INFO: renamed from: ν */
    public androidx.appcompat.widget.C0035 f537;

    /* JADX INFO: renamed from: ξ */
    public android.widget.PopupWindow.OnDismissListener f538;

    /* JADX INFO: renamed from: ο */
    public boolean f539;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static class InnerLayout extends android.widget.LinearLayout {

        /* JADX INFO: renamed from: ε */
        public static final int[] f540 = null;

        static {
                r0 = 16842964(0x10100d4, float:2.3694152E-38)
                int[] r0 = new int[]{r0}
                androidx.appcompat.widget.ActivityChooserView.InnerLayout.f540 = r0
                return
        }

        public InnerLayout(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                int[] r0 = androidx.appcompat.widget.ActivityChooserView.InnerLayout.f540
                android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
                r0 = 0
                boolean r1 = r4.hasValue(r0)
                if (r1 == 0) goto L1b
                int r1 = r4.getResourceId(r0, r0)
                if (r1 == 0) goto L1b
                android.graphics.drawable.Drawable r3 = p000.ln0.m3603(r3, r1)
                goto L1f
            L1b:
                android.graphics.drawable.Drawable r3 = r4.getDrawable(r0)
            L1f:
                r2.setBackgroundDrawable(r3)
                r4.recycle()
                return
        }
    }

    public ActivityChooserView(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public ActivityChooserView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActivityChooserView(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            c r0 = new c
            r1 = 0
            r0.<init>(r9, r1)
            d r0 = new d
            r0.<init>(r1, r9)
            r9.f536 = r0
            int[] r4 = p000.kk1.f5971
            android.content.res.TypedArray r6 = r10.obtainStyledAttributes(r11, r4, r12, r1)
            java.util.WeakHashMap r0 = p000.b92.f1572
            r8 = 0
            r2 = r9
            r3 = r10
            r5 = r11
            r7 = r12
            p000.y82.m6840(r2, r3, r4, r5, r6, r7, r8)
            r9 = 1
            r10 = 4
            r6.getInt(r9, r10)
            android.graphics.drawable.Drawable r10 = r6.getDrawable(r1)
            r6.recycle()
            android.content.Context r11 = r2.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            r12 = 2131492870(0x7f0c0006, float:1.8609204E38)
            r11.inflate(r12, r2, r9)
            g r11 = new g
            r11.<init>(r2)
            r2.f530 = r11
            r12 = 2131296313(0x7f090039, float:1.821054E38)
            android.view.View r12 = r2.findViewById(r12)
            r2.f531 = r12
            r12.getBackground()
            r12 = 2131296508(0x7f0900fc, float:1.8210935E38)
            android.view.View r12 = r2.findViewById(r12)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r2.f534 = r12
            r12.setOnClickListener(r11)
            r12.setOnLongClickListener(r11)
            r0 = 2131296732(0x7f0901dc, float:1.8211389E38)
            android.view.View r12 = r12.findViewById(r0)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r12 = 2131296580(0x7f090144, float:1.821108E38)
            android.view.View r12 = r2.findViewById(r12)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r12.setOnClickListener(r11)
            e r11 = new e
            r11.<init>()
            r12.setAccessibilityDelegate(r11)
            ｏ r11 = new ｏ
            r11.<init>(r2, r12)
            r12.setOnTouchListener(r11)
            r2.f532 = r12
            android.view.View r11 = r12.findViewById(r0)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r2.f533 = r11
            r11.setImageDrawable(r10)
            f r10 = new f
            r10.<init>(r2)
            r2.f529 = r10
            c r11 = new c
            r11.<init>(r2, r9)
            r10.registerDataSetObserver(r11)
            android.content.res.Resources r9 = r3.getResources()
            android.util.DisplayMetrics r10 = r9.getDisplayMetrics()
            int r10 = r10.widthPixels
            int r10 = r10 / 2
            r11 = 2131165207(0x7f070017, float:1.7944625E38)
            int r9 = r9.getDimensionPixelSize(r11)
            java.lang.Math.max(r10, r9)
            return
    }

    public p000.AbstractC0059b getDataModel() {
            r0 = this;
            f r0 = r0.f529
            r0.getClass()
            r0 = 0
            return r0
    }

    public androidx.appcompat.widget.C0035 getListPopupWindow() {
            r5 = this;
            androidx.appcompat.widget.θ r0 = r5.f537
            if (r0 != 0) goto L30
            androidx.appcompat.widget.θ r0 = new androidx.appcompat.widget.θ
            android.content.Context r1 = r5.getContext()
            r2 = 2130968764(0x7f0400bc, float:1.754619E38)
            r3 = 0
            r4 = 0
            r0.<init>(r1, r4, r2, r3)
            r5.f537 = r0
            f r1 = r5.f529
            r0.mo336(r1)
            androidx.appcompat.widget.θ r0 = r5.f537
            r0.f846 = r5
            r1 = 1
            r0.f830 = r1
            m5 r0 = r0.f831
            r0.setFocusable(r1)
            androidx.appcompat.widget.θ r0 = r5.f537
            g r1 = r5.f530
            r0.f847 = r1
            m5 r0 = r0.f831
            r0.setOnDismissListener(r1)
        L30:
            androidx.appcompat.widget.θ r5 = r5.f537
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            f r0 = r1.f529
            r0.getClass()
            r0 = 1
            r1.f539 = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            f r0 = r2.f529
            r0.getClass()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 == 0) goto L17
            d r1 = r2.f536
            r0.removeGlobalOnLayoutListener(r1)
        L17:
            boolean r0 = r2.m268()
            if (r0 == 0) goto L20
            r2.m267()
        L20:
            r0 = 0
            r2.f539 = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r4 = r4 - r2
            int r5 = r5 - r3
            android.view.View r1 = r0.f531
            r2 = 0
            r1.layout(r2, r2, r4, r5)
            boolean r1 = r0.m268()
            if (r1 != 0) goto L11
            r0.m267()
        L11:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r2, int r3) {
            r1 = this;
            android.widget.FrameLayout r0 = r1.f534
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L12
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
        L12:
            android.view.View r0 = r1.f531
            r1.measureChild(r0, r2, r3)
            int r2 = r0.getMeasuredWidth()
            int r3 = r0.getMeasuredHeight()
            r1.setMeasuredDimension(r2, r3)
            return
    }

    public void setActivityChooserModel(p000.AbstractC0059b r2) {
            r1 = this;
            f r2 = r1.f529
            androidx.appcompat.widget.ActivityChooserView r0 = r2.f3699
            f r0 = r0.f529
            r0.getClass()
            r2.notifyDataSetChanged()
            boolean r0 = r1.m268()
            if (r0 == 0) goto L28
            r1.m267()
            boolean r0 = r1.m268()
            if (r0 != 0) goto L28
            boolean r1 = r1.f539
            if (r1 != 0) goto L20
            goto L28
        L20:
            r2.getClass()
            java.lang.String r1 = "No data model. Did you call #setDataModel?"
            p000.C1080.m7279(r1)
        L28:
            return
    }

    public void setDefaultActionButtonContentDescription(int r1) {
            r0 = this;
            return
    }

    public void setExpandActivityOverflowButtonContentDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.String r2 = r0.getString(r2)
            android.widget.ImageView r1 = r1.f533
            r1.setContentDescription(r2)
            return
    }

    public void setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.widget.ImageView r0 = r0.f533
            r0.setImageDrawable(r1)
            return
    }

    public void setInitialActivityCount(int r1) {
            r0 = this;
            return
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f538 = r1
            return
    }

    public void setProvider(p000.AbstractC1154 r1) {
            r0 = this;
            r0.f535 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m267() {
            r2 = this;
            boolean r0 = r2.m268()
            if (r0 == 0) goto L1c
            androidx.appcompat.widget.θ r0 = r2.getListPopupWindow()
            r0.dismiss()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 == 0) goto L1c
            d r2 = r2.f536
            r0.removeGlobalOnLayoutListener(r2)
        L1c:
            return
    }

    /* JADX INFO: renamed from: β */
    public final boolean m268() {
            r0 = this;
            androidx.appcompat.widget.θ r0 = r0.getListPopupWindow()
            m5 r0 = r0.f831
            boolean r0 = r0.isShowing()
            return r0
    }
}
