package a;

/* JADX INFO: loaded from: classes.dex */
public class I6 extends android.view.ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121a;
    public int b;
    public boolean c;
    public int d;

    public boolean a() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    public int getItemSpacing() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public int getLineSpacing() {
            r1 = this;
            int r0 = r1.f121a
            return r0
    }

    public int getRowCount() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            r10 = 1
            int r12 = r9.getChildCount()
            r14 = 0
            if (r12 != 0) goto Lb
            r9.d = r14
            return
        Lb:
            r9.d = r10
            java.util.WeakHashMap<android.view.View, a.Jg> r12 = a.C0414ug.f721a
            int r12 = r9.getLayoutDirection()
            if (r12 != r10) goto L17
            r12 = r10
            goto L18
        L17:
            r12 = r14
        L18:
            if (r12 == 0) goto L1f
            int r0 = r9.getPaddingRight()
            goto L23
        L1f:
            int r0 = r9.getPaddingLeft()
        L23:
            if (r12 == 0) goto L2a
            int r1 = r9.getPaddingLeft()
            goto L2e
        L2a:
            int r1 = r9.getPaddingRight()
        L2e:
            int r2 = r9.getPaddingTop()
            int r13 = r13 - r11
            int r13 = r13 - r1
            r1 = r14
            r3 = r0
            r11 = r2
        L37:
            int r4 = r9.getChildCount()
            if (r1 >= r4) goto Lb2
            android.view.View r4 = r9.getChildAt(r1)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L54
            int r5 = com.google.android.material.R.id.row_index_key
            r6 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.setTag(r5, r6)
            goto Lb0
        L54:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L67
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r5.getMarginStart()
            int r5 = r5.getMarginEnd()
            goto L69
        L67:
            r5 = r14
            r6 = r5
        L69:
            int r7 = r3 + r6
            int r8 = r4.getMeasuredWidth()
            int r8 = r8 + r7
            boolean r7 = r9.c
            if (r7 != 0) goto L7f
            if (r8 <= r13) goto L7f
            int r11 = r9.f121a
            int r11 = r11 + r2
            int r2 = r9.d
            int r2 = r2 + r10
            r9.d = r2
            r3 = r0
        L7f:
            int r2 = com.google.android.material.R.id.row_index_key
            int r7 = r9.d
            int r7 = r7 - r10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.setTag(r2, r7)
            int r2 = r3 + r6
            int r7 = r4.getMeasuredWidth()
            int r7 = r7 + r2
            int r8 = r4.getMeasuredHeight()
            int r8 = r8 + r11
            if (r12 == 0) goto La2
            int r2 = r13 - r7
            int r7 = r13 - r3
            int r7 = r7 - r6
            r4.layout(r2, r11, r7, r8)
            goto La5
        La2:
            r4.layout(r2, r11, r7, r8)
        La5:
            int r6 = r6 + r5
            int r2 = r4.getMeasuredWidth()
            int r2 = r2 + r6
            int r4 = r9.b
            int r2 = r2 + r4
            int r3 = r3 + r2
            r2 = r8
        Lb0:
            int r1 = r1 + r10
            goto L37
        Lb2:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r20, int r21) {
            r19 = this;
            r0 = r19
            int r1 = android.view.View.MeasureSpec.getSize(r20)
            int r2 = android.view.View.MeasureSpec.getMode(r20)
            int r3 = android.view.View.MeasureSpec.getSize(r21)
            int r4 = android.view.View.MeasureSpec.getMode(r21)
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r6) goto L1f
            if (r2 != r5) goto L1b
            goto L1f
        L1b:
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L20
        L1f:
            r7 = r1
        L20:
            int r8 = r0.getPaddingLeft()
            int r9 = r0.getPaddingTop()
            int r10 = r0.getPaddingRight()
            int r7 = r7 - r10
            r11 = r9
            r12 = 0
            r13 = 0
        L30:
            int r14 = r0.getChildCount()
            if (r12 >= r14) goto La6
            android.view.View r14 = r0.getChildAt(r12)
            int r15 = r14.getVisibility()
            r10 = 8
            if (r15 != r10) goto L47
            r10 = r20
            r15 = r21
            goto L9f
        L47:
            r10 = r20
            r15 = r21
            r0.measureChild(r14, r10, r15)
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L5d
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r5.leftMargin
            int r5 = r5.rightMargin
            goto L5f
        L5d:
            r5 = 0
            r6 = 0
        L5f:
            int r16 = r8 + r6
            int r17 = r14.getMeasuredWidth()
            r18 = r5
            int r5 = r17 + r16
            if (r5 <= r7) goto L79
            boolean r5 = r0.a()
            if (r5 != 0) goto L79
            int r8 = r0.getPaddingLeft()
            int r5 = r0.f121a
            int r11 = r9 + r5
        L79:
            int r5 = r8 + r6
            int r9 = r14.getMeasuredWidth()
            int r9 = r9 + r5
            int r5 = r14.getMeasuredHeight()
            int r5 = r5 + r11
            if (r9 <= r13) goto L88
            r13 = r9
        L88:
            int r6 = r6 + r18
            int r9 = r14.getMeasuredWidth()
            int r9 = r9 + r6
            int r6 = r0.b
            int r9 = r9 + r6
            int r9 = r9 + r8
            int r6 = r0.getChildCount()
            int r6 = r6 + (-1)
            if (r12 != r6) goto L9d
            int r13 = r13 + r18
        L9d:
            r8 = r9
            r9 = r5
        L9f:
            int r12 = r12 + 1
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L30
        La6:
            int r5 = r0.getPaddingRight()
            int r5 = r5 + r13
            int r6 = r0.getPaddingBottom()
            int r6 = r6 + r9
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r7) goto Lba
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 == r8) goto Lc0
            r1 = r5
            goto Lc0
        Lba:
            r8 = 1073741824(0x40000000, float:2.0)
            int r1 = java.lang.Math.min(r5, r1)
        Lc0:
            if (r4 == r7) goto Lc6
            if (r4 == r8) goto Lca
            r3 = r6
            goto Lca
        Lc6:
            int r3 = java.lang.Math.min(r6, r3)
        Lca:
            r0.setMeasuredDimension(r1, r3)
            return
    }

    public void setItemSpacing(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setLineSpacing(int r1) {
            r0 = this;
            r0.f121a = r1
            return
    }

    public void setSingleLine(boolean r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
