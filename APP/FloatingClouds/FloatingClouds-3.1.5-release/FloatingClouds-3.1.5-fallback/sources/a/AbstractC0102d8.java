package a;

/* JADX INFO: renamed from: a.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0102d8 extends a.Hg<android.view.View> {
    public final android.graphics.Rect c;
    public final android.graphics.Rect d;
    public int e;
    public int f;

    public AbstractC0102d8() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.c = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.d = r0
            r0 = 0
            r1.e = r0
            return
    }

    public AbstractC0102d8(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.c = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.d = r1
            r1 = 0
            r0.e = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8, int r9, int r10) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            r1 = -1
            if (r0 == r1) goto Lc
            r2 = -2
            if (r0 != r2) goto L61
        Lc:
            java.util.ArrayList r2 = r6.e(r7)
            com.google.android.material.appbar.AppBarLayout r2 = r5.v(r2)
            if (r2 == 0) goto L61
            int r10 = android.view.View.MeasureSpec.getSize(r10)
            if (r10 <= 0) goto L35
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            boolean r3 = r2.getFitsSystemWindows()
            if (r3 == 0) goto L39
            a.nh r3 = r6.getLastWindowInsets()
            if (r3 == 0) goto L39
            int r4 = r3.d()
            int r3 = r3.a()
            int r3 = r3 + r4
            int r10 = r10 + r3
            goto L39
        L35:
            int r10 = r6.getHeight()
        L39:
            int r3 = r5.x(r2)
            int r3 = r3 + r10
            int r10 = r2.getMeasuredHeight()
            boolean r2 = r5 instanceof com.google.android.material.search.SearchBar.ScrollingViewBehavior
            if (r2 == 0) goto L4c
            int r10 = -r10
            float r10 = (float) r10
            r7.setTranslationY(r10)
            goto L51
        L4c:
            r2 = 0
            r7.setTranslationY(r2)
            int r3 = r3 - r10
        L51:
            if (r0 != r1) goto L56
            r10 = 1073741824(0x40000000, float:2.0)
            goto L58
        L56:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L58:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r10)
            r6.r(r7, r8, r9, r10)
            r6 = 1
            return r6
        L61:
            r6 = 0
            return r6
    }

    @Override // a.Hg
    public final void u(androidx.coordinatorlayout.widget.CoordinatorLayout r15, android.view.View r16, int r17) {
            r14 = this;
            java.util.ArrayList r0 = r15.e(r16)
            com.google.android.material.appbar.AppBarLayout r0 = r14.v(r0)
            r1 = 0
            if (r0 == 0) goto La9
            android.view.ViewGroup$LayoutParams r2 = r16.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r2
            int r3 = r15.getPaddingLeft()
            int r4 = r2.leftMargin
            int r3 = r3 + r4
            int r4 = r0.getBottom()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r5 = r15.getWidth()
            int r6 = r15.getPaddingRight()
            int r5 = r5 - r6
            int r6 = r2.rightMargin
            int r5 = r5 - r6
            int r6 = r15.getHeight()
            int r7 = r0.getBottom()
            int r7 = r7 + r6
            int r6 = r15.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r2.bottomMargin
            int r7 = r7 - r6
            android.graphics.Rect r11 = r14.c
            r11.set(r3, r4, r5, r7)
            a.nh r3 = r15.getLastWindowInsets()
            if (r3 == 0) goto L67
            java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
            boolean r15 = r15.getFitsSystemWindows()
            if (r15 == 0) goto L67
            boolean r15 = r16.getFitsSystemWindows()
            if (r15 != 0) goto L67
            int r15 = r11.left
            int r4 = r3.b()
            int r4 = r4 + r15
            r11.left = r4
            int r15 = r11.right
            int r3 = r3.c()
            int r15 = r15 - r3
            r11.right = r15
        L67:
            int r15 = r2.c
            if (r15 != 0) goto L6e
            r15 = 8388659(0x800033, float:1.1755015E-38)
        L6e:
            r8 = r15
            int r9 = r16.getMeasuredWidth()
            int r10 = r16.getMeasuredHeight()
            android.graphics.Rect r12 = r14.d
            r13 = r17
            android.view.Gravity.apply(r8, r9, r10, r11, r12, r13)
            int r15 = r14.f
            if (r15 != 0) goto L83
            goto L90
        L83:
            float r15 = r14.w(r0)
            int r2 = r14.f
            float r3 = (float) r2
            float r15 = r15 * r3
            int r15 = (int) r15
            int r1 = a.C0282n9.j(r15, r1, r2)
        L90:
            int r15 = r12.left
            int r2 = r12.top
            int r2 = r2 - r1
            int r3 = r12.right
            int r4 = r12.bottom
            int r4 = r4 - r1
            r5 = r16
            r5.layout(r15, r2, r3, r4)
            int r15 = r12.top
            int r0 = r0.getBottom()
            int r15 = r15 - r0
            r14.e = r15
            return
        La9:
            r5 = r16
            r15.q(r16, r17)
            r14.e = r1
            return
    }

    public abstract com.google.android.material.appbar.AppBarLayout v(java.util.ArrayList r1);

    public float w(android.view.View r1) {
            r0 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
    }

    public int x(android.view.View r1) {
            r0 = this;
            int r1 = r1.getMeasuredHeight()
            return r1
    }
}
