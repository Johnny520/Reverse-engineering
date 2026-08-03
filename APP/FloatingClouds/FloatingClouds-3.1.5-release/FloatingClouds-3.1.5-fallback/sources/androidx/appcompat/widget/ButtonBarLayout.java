package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f839a;
    public boolean b;
    public int c;

    public ButtonBarLayout(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r7.<init>(r8, r9)
            r0 = -1
            r7.c = r0
            int[] r0 = androidx.appcompat.R.styleable.ButtonBarLayout
            android.content.res.TypedArray r5 = r8.obtainStyledAttributes(r9, r0)
            int[] r3 = androidx.appcompat.R.styleable.ButtonBarLayout
            r6 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            a.C0414ug.i(r1, r2, r3, r4, r5, r6)
            int r8 = androidx.appcompat.R.styleable.ButtonBarLayout_allowStacking
            r9 = 1
            boolean r8 = r5.getBoolean(r8, r9)
            r1.f839a = r8
            r5.recycle()
            int r8 = r7.getOrientation()
            if (r8 != r9) goto L2c
            boolean r8 = r1.f839a
            r7.setStacked(r8)
        L2c:
            return
    }

    private void setStacked(boolean r2) {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == r2) goto L3d
            if (r2 == 0) goto La
            boolean r0 = r1.f839a
            if (r0 == 0) goto L3d
        La:
            r1.b = r2
            r1.setOrientation(r2)
            if (r2 == 0) goto L15
            r0 = 8388613(0x800005, float:1.175495E-38)
            goto L17
        L15:
            r0 = 80
        L17:
            r1.setGravity(r0)
            int r0 = androidx.appcompat.R.id.spacer
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L2b
            if (r2 == 0) goto L27
            r2 = 8
            goto L28
        L27:
            r2 = 4
        L28:
            r0.setVisibility(r2)
        L2b:
            int r2 = r1.getChildCount()
            int r2 = r2 + (-2)
        L31:
            if (r2 < 0) goto L3d
            android.view.View r0 = r1.getChildAt(r2)
            r1.bringChildToFront(r0)
            int r2 = r2 + (-1)
            goto L31
        L3d:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r7, int r8) {
            r6 = this;
            r0 = 1
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            boolean r2 = r6.f839a
            r3 = 0
            if (r2 == 0) goto L17
            int r2 = r6.c
            if (r1 <= r2) goto L15
            boolean r2 = r6.b
            if (r2 == 0) goto L15
            r6.setStacked(r3)
        L15:
            r6.c = r1
        L17:
            boolean r2 = r6.b
            if (r2 != 0) goto L2b
            int r2 = android.view.View.MeasureSpec.getMode(r7)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r2 != r4) goto L2b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            r2 = r0
            goto L2d
        L2b:
            r1 = r7
            r2 = r3
        L2d:
            super.onMeasure(r1, r8)
            boolean r1 = r6.f839a
            if (r1 == 0) goto L47
            boolean r1 = r6.b
            if (r1 != 0) goto L47
            int r1 = r6.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r4) goto L47
            r6.setStacked(r0)
            r2 = r0
        L47:
            if (r2 == 0) goto L4c
            super.onMeasure(r7, r8)
        L4c:
            int r1 = r6.getChildCount()
            r2 = r3
        L51:
            r4 = -1
            if (r2 >= r1) goto L61
            android.view.View r5 = r6.getChildAt(r2)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L5f
            goto L62
        L5f:
            int r2 = r2 + r0
            goto L51
        L61:
            r2 = r4
        L62:
            if (r2 < 0) goto Lba
            android.view.View r1 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            int r5 = r6.getPaddingTop()
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r5
            int r5 = r3.topMargin
            int r1 = r1 + r5
            int r3 = r3.bottomMargin
            int r1 = r1 + r3
            boolean r3 = r6.b
            if (r3 == 0) goto Lb4
            int r2 = r2 + r0
            int r3 = r6.getChildCount()
        L86:
            if (r2 >= r3) goto L96
            android.view.View r5 = r6.getChildAt(r2)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L94
            r4 = r2
            goto L96
        L94:
            int r2 = r2 + r0
            goto L86
        L96:
            if (r4 < 0) goto Lb2
            android.view.View r0 = r6.getChildAt(r4)
            int r0 = r0.getPaddingTop()
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            int r0 = r0 + r2
            int r0 = r0 + r1
            r3 = r0
            goto Lba
        Lb2:
            r3 = r1
            goto Lba
        Lb4:
            int r0 = r6.getPaddingBottom()
            int r3 = r0 + r1
        Lba:
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            int r0 = r6.getMinimumHeight()
            if (r0 == r3) goto Lca
            r6.setMinimumHeight(r3)
            if (r8 != 0) goto Lca
            super.onMeasure(r7, r8)
        Lca:
            return
    }

    public void setAllowStacking(boolean r2) {
            r1 = this;
            boolean r0 = r1.f839a
            if (r0 == r2) goto L13
            r1.f839a = r2
            if (r2 != 0) goto L10
            boolean r2 = r1.b
            if (r2 == 0) goto L10
            r2 = 0
            r1.setStacked(r2)
        L10:
            r1.requestLayout()
        L13:
            return
    }
}
