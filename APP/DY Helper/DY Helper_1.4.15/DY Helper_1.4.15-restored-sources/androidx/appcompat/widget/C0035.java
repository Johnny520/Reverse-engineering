package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.θ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C0035 implements p000.ew1 {

    /* JADX INFO: renamed from: Α */
    public final android.os.Handler f827;

    /* JADX INFO: renamed from: Β */
    public final android.graphics.Rect f828;

    /* JADX INFO: renamed from: Γ */
    public android.graphics.Rect f829;

    /* JADX INFO: renamed from: Δ */
    public boolean f830;

    /* JADX INFO: renamed from: Ε */
    public final p000.C0537m5 f831;

    /* JADX INFO: renamed from: ε */
    public final android.content.Context f832;

    /* JADX INFO: renamed from: ζ */
    public android.widget.ListAdapter f833;

    /* JADX INFO: renamed from: η */
    public androidx.appcompat.widget.DropDownListView f834;

    /* JADX INFO: renamed from: θ */
    public final int f835;

    /* JADX INFO: renamed from: ι */
    public int f836;

    /* JADX INFO: renamed from: κ */
    public int f837;

    /* JADX INFO: renamed from: λ */
    public int f838;

    /* JADX INFO: renamed from: μ */
    public final int f839;

    /* JADX INFO: renamed from: ν */
    public boolean f840;

    /* JADX INFO: renamed from: ξ */
    public boolean f841;

    /* JADX INFO: renamed from: ο */
    public boolean f842;

    /* JADX INFO: renamed from: π */
    public int f843;

    /* JADX INFO: renamed from: ρ */
    public final int f844;

    /* JADX INFO: renamed from: σ */
    public p000.C0770rq f845;

    /* JADX INFO: renamed from: τ */
    public android.view.View f846;

    /* JADX INFO: renamed from: υ */
    public android.widget.AdapterView.OnItemClickListener f847;

    /* JADX INFO: renamed from: φ */
    public final p000.RunnableC0196d1 f848;

    /* JADX INFO: renamed from: χ */
    public final p000.gu0 f849;

    /* JADX INFO: renamed from: ψ */
    public final p000.fu0 f850;

    /* JADX INFO: renamed from: ω */
    public final androidx.appcompat.widget.RunnableC0032 f851;

    public C0035(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r7 = -2
            r3.f835 = r7
            r3.f836 = r7
            r7 = 1002(0x3ea, float:1.404E-42)
            r3.f839 = r7
            r7 = 0
            r3.f843 = r7
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.f844 = r0
            d1 r0 = new d1
            r1 = 7
            r0.<init>(r1, r3)
            r3.f848 = r0
            gu0 r0 = new gu0
            r0.<init>(r3)
            r3.f849 = r0
            fu0 r0 = new fu0
            r0.<init>(r3)
            r3.f850 = r0
            androidx.appcompat.widget.ε r0 = new androidx.appcompat.widget.ε
            r1 = 1
            r0.<init>(r1, r3)
            r3.f851 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f828 = r0
            r3.f832 = r4
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = r4.getMainLooper()
            r0.<init>(r2)
            r3.f827 = r0
            int[] r0 = p000.kk1.f5982
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r6, r7)
            int r2 = r0.getDimensionPixelOffset(r7, r7)
            r3.f837 = r2
            int r2 = r0.getDimensionPixelOffset(r1, r7)
            r3.f838 = r2
            if (r2 == 0) goto L5c
            r3.f840 = r1
        L5c:
            r0.recycle()
            m5 r0 = new m5
            r0.<init>(r4, r5, r6, r7)
            int[] r2 = p000.kk1.f5986
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r2, r6, r7)
            r6 = 2
            boolean r2 = r5.hasValue(r6)
            if (r2 == 0) goto L78
            boolean r6 = r5.getBoolean(r6, r7)
            r0.setOverlapAnchor(r6)
        L78:
            boolean r6 = r5.hasValue(r7)
            if (r6 == 0) goto L89
            int r6 = r5.getResourceId(r7, r7)
            if (r6 == 0) goto L89
            android.graphics.drawable.Drawable r4 = p000.ln0.m3603(r4, r6)
            goto L8d
        L89:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r7)
        L8d:
            r0.setBackgroundDrawable(r4)
            r5.recycle()
            r3.f831 = r0
            r0.setInputMethodMode(r1)
            return
    }

    @Override // p000.ew1
    public final void dismiss() {
            r2 = this;
            m5 r0 = r2.f831
            r0.dismiss()
            r1 = 0
            r0.setContentView(r1)
            r2.f834 = r1
            android.os.Handler r0 = r2.f827
            d1 r2 = r2.f848
            r0.removeCallbacks(r2)
            return
    }

    /* JADX INFO: renamed from: α */
    public androidx.appcompat.widget.DropDownListView mo339(android.content.Context r1, boolean r2) {
            r0 = this;
            androidx.appcompat.widget.DropDownListView r0 = new androidx.appcompat.widget.DropDownListView
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p000.ew1
    /* JADX INFO: renamed from: β */
    public final boolean mo340() {
            r0 = this;
            m5 r0 = r0.f831
            boolean r0 = r0.isShowing()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final int m341() {
            r0 = this;
            int r0 = r0.f837
            return r0
    }

    @Override // p000.ew1
    /* JADX INFO: renamed from: δ */
    public final void mo342() {
            r13 = this;
            androidx.appcompat.widget.DropDownListView r0 = r13.f834
            android.content.Context r1 = r13.f832
            r2 = 1
            m5 r3 = r13.f831
            if (r0 != 0) goto L3f
            boolean r0 = r13.f830
            r0 = r0 ^ r2
            androidx.appcompat.widget.DropDownListView r0 = r13.mo339(r1, r0)
            r13.f834 = r0
            android.widget.ListAdapter r4 = r13.f833
            r0.setAdapter(r4)
            androidx.appcompat.widget.DropDownListView r0 = r13.f834
            android.widget.AdapterView$OnItemClickListener r4 = r13.f847
            r0.setOnItemClickListener(r4)
            androidx.appcompat.widget.DropDownListView r0 = r13.f834
            r0.setFocusable(r2)
            androidx.appcompat.widget.DropDownListView r0 = r13.f834
            r0.setFocusableInTouchMode(r2)
            androidx.appcompat.widget.DropDownListView r0 = r13.f834
            androidx.appcompat.widget.η r4 = new androidx.appcompat.widget.η
            r4.<init>(r13)
            r0.setOnItemSelectedListener(r4)
            androidx.appcompat.widget.DropDownListView r0 = r13.f834
            fu0 r4 = r13.f850
            r0.setOnScrollListener(r4)
            androidx.appcompat.widget.DropDownListView r0 = r13.f834
            r3.setContentView(r0)
            goto L45
        L3f:
            android.view.View r0 = r3.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L45:
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            android.graphics.Rect r4 = r13.f828
            r5 = 0
            if (r0 == 0) goto L5e
            r0.getPadding(r4)
            int r0 = r4.top
            int r6 = r4.bottom
            int r6 = r6 + r0
            boolean r7 = r13.f840
            if (r7 != 0) goto L62
            int r0 = -r0
            r13.f838 = r0
            goto L62
        L5e:
            r4.setEmpty()
            r6 = r5
        L62:
            int r0 = r3.getInputMethodMode()
            r7 = 2
            if (r0 != r7) goto L6b
            r0 = r2
            goto L6c
        L6b:
            r0 = r5
        L6c:
            android.view.View r8 = r13.f846
            int r9 = r13.f838
            int r0 = p000.du0.m1801(r3, r8, r9, r0)
            int r8 = r13.f835
            r9 = -2
            r10 = -1
            if (r8 != r10) goto L7c
            int r0 = r0 + r6
            goto Lcd
        L7c:
            int r11 = r13.f836
            if (r11 == r9) goto L9e
            r12 = 1073741824(0x40000000, float:2.0)
            if (r11 == r10) goto L89
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            goto Lb4
        L89:
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r11 = r4.left
            int r4 = r4.right
            int r11 = r11 + r4
            int r1 = r1 - r11
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r12)
            goto Lb4
        L9e:
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r11 = r4.left
            int r4 = r4.right
            int r11 = r11 + r4
            int r1 = r1 - r11
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r4)
        Lb4:
            androidx.appcompat.widget.DropDownListView r4 = r13.f834
            int r0 = r4.m273(r1, r0)
            if (r0 <= 0) goto Lcb
            androidx.appcompat.widget.DropDownListView r1 = r13.f834
            int r1 = r1.getPaddingTop()
            androidx.appcompat.widget.DropDownListView r4 = r13.f834
            int r4 = r4.getPaddingBottom()
            int r4 = r4 + r1
            int r4 = r4 + r6
            goto Lcc
        Lcb:
            r4 = r5
        Lcc:
            int r0 = r0 + r4
        Lcd:
            int r1 = r3.getInputMethodMode()
            if (r1 != r7) goto Ld5
            r1 = r2
            goto Ld6
        Ld5:
            r1 = r5
        Ld6:
            int r4 = r13.f839
            r3.setWindowLayoutType(r4)
            boolean r4 = r3.isShowing()
            if (r4 == 0) goto L133
            android.view.View r4 = r13.f846
            boolean r4 = r4.isAttachedToWindow()
            if (r4 != 0) goto Leb
            goto L198
        Leb:
            int r4 = r13.f836
            if (r4 != r10) goto Lf1
            r4 = r10
            goto Lf9
        Lf1:
            if (r4 != r9) goto Lf9
            android.view.View r4 = r13.f846
            int r4 = r4.getWidth()
        Lf9:
            if (r8 != r10) goto L11a
            if (r1 == 0) goto Lff
            r8 = r0
            goto L100
        Lff:
            r8 = r10
        L100:
            int r0 = r13.f836
            if (r1 == 0) goto L110
            if (r0 != r10) goto L108
            r0 = r10
            goto L109
        L108:
            r0 = r5
        L109:
            r3.setWidth(r0)
            r3.setHeight(r5)
            goto L11d
        L110:
            if (r0 != r10) goto L113
            r5 = r10
        L113:
            r3.setWidth(r5)
            r3.setHeight(r10)
            goto L11d
        L11a:
            if (r8 != r9) goto L11d
            r8 = r0
        L11d:
            r3.setOutsideTouchable(r2)
            r0 = r4
            android.view.View r4 = r13.f846
            int r5 = r13.f837
            int r6 = r13.f838
            if (r0 >= 0) goto L12b
            r7 = r10
            goto L12c
        L12b:
            r7 = r0
        L12c:
            if (r8 >= 0) goto L12f
            r8 = r10
        L12f:
            r3.update(r4, r5, r6, r7, r8)
            return
        L133:
            int r1 = r13.f836
            if (r1 != r10) goto L139
            r1 = r10
            goto L141
        L139:
            if (r1 != r9) goto L141
            android.view.View r1 = r13.f846
            int r1 = r1.getWidth()
        L141:
            if (r8 != r10) goto L145
            r8 = r10
            goto L148
        L145:
            if (r8 != r9) goto L148
            r8 = r0
        L148:
            r3.setWidth(r1)
            r3.setHeight(r8)
            p000.eu0.m1962(r3, r2)
            r3.setOutsideTouchable(r2)
            gu0 r0 = r13.f849
            r3.setTouchInterceptor(r0)
            boolean r0 = r13.f842
            if (r0 == 0) goto L162
            boolean r0 = r13.f841
            r3.setOverlapAnchor(r0)
        L162:
            android.graphics.Rect r0 = r13.f829
            p000.eu0.m1961(r3, r0)
            android.view.View r0 = r13.f846
            int r1 = r13.f837
            int r4 = r13.f838
            int r5 = r13.f843
            r3.showAsDropDown(r0, r1, r4, r5)
            androidx.appcompat.widget.DropDownListView r0 = r13.f834
            r0.setSelection(r10)
            boolean r0 = r13.f830
            if (r0 == 0) goto L183
            androidx.appcompat.widget.DropDownListView r0 = r13.f834
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L18d
        L183:
            androidx.appcompat.widget.DropDownListView r0 = r13.f834
            if (r0 == 0) goto L18d
            r0.setListSelectionHidden(r2)
            r0.requestLayout()
        L18d:
            boolean r0 = r13.f830
            if (r0 != 0) goto L198
            android.os.Handler r0 = r13.f827
            androidx.appcompat.widget.ε r13 = r13.f851
            r0.post(r13)
        L198:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final android.graphics.drawable.Drawable m343() {
            r0 = this;
            m5 r0 = r0.f831
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    @Override // p000.ew1
    /* JADX INFO: renamed from: θ */
    public final android.widget.ListView mo344() {
            r0 = this;
            androidx.appcompat.widget.DropDownListView r0 = r0.f834
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public final void m345(android.graphics.drawable.Drawable r1) {
            r0 = this;
            m5 r0 = r0.f831
            r0.setBackgroundDrawable(r1)
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m346(int r1) {
            r0 = this;
            r0.f838 = r1
            r1 = 1
            r0.f840 = r1
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m347(int r1) {
            r0 = this;
            r0.f837 = r1
            return
    }

    /* JADX INFO: renamed from: ο */
    public final int m348() {
            r1 = this;
            boolean r0 = r1.f840
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            int r1 = r1.f838
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public void mo336(android.widget.ListAdapter r3) {
            r2 = this;
            rq r0 = r2.f845
            if (r0 != 0) goto Ld
            rq r0 = new rq
            r1 = 1
            r0.<init>(r1, r2)
            r2.f845 = r0
            goto L14
        Ld:
            android.widget.ListAdapter r1 = r2.f833
            if (r1 == 0) goto L14
            r1.unregisterDataSetObserver(r0)
        L14:
            r2.f833 = r3
            if (r3 == 0) goto L1d
            rq r0 = r2.f845
            r3.registerDataSetObserver(r0)
        L1d:
            androidx.appcompat.widget.DropDownListView r3 = r2.f834
            if (r3 == 0) goto L26
            android.widget.ListAdapter r2 = r2.f833
            r3.setAdapter(r2)
        L26:
            return
    }

    /* JADX INFO: renamed from: σ */
    public final void m349(int r3) {
            r2 = this;
            m5 r0 = r2.f831
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L16
            android.graphics.Rect r1 = r2.f828
            r0.getPadding(r1)
            int r0 = r1.left
            int r1 = r1.right
            int r0 = r0 + r1
            int r0 = r0 + r3
            r2.f836 = r0
            return
        L16:
            r2.f836 = r3
            return
    }
}
