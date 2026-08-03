package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements a.Lb, a.Ib {
    public static final float B = 0.0f;
    public static final androidx.core.widget.NestedScrollView.a C = null;
    public static final int[] D = null;
    public final a.C0224k5 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f885a;
    public long b;
    public final android.graphics.Rect c;
    public final android.widget.OverScroller d;
    public final android.widget.EdgeEffect e;
    public final android.widget.EdgeEffect f;
    public int g;
    public boolean h;
    public boolean i;
    public android.view.View j;
    public boolean k;
    public android.view.VelocityTracker l;
    public boolean m;
    public boolean n;
    public final int o;
    public final int p;
    public final int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public int u;
    public int v;
    public androidx.core.widget.NestedScrollView.e w;
    public final a.Mb x;
    public final a.Jb y;
    public float z;

    public static class a extends a.C {
        @Override // a.C
        public final void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                super.c(r2, r3)
                androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r3.setClassName(r0)
                int r0 = r2.getScrollRange()
                if (r0 <= 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                r3.setScrollable(r0)
                int r0 = r2.getScrollX()
                r3.setScrollX(r0)
                int r0 = r2.getScrollY()
                r3.setScrollY(r0)
                int r0 = r2.getScrollX()
                r3.setMaxScrollX(r0)
                int r2 = r2.getScrollRange()
                r3.setMaxScrollY(r2)
                return
        }

        @Override // a.C
        public final void d(android.view.View r3, a.I r4) {
                r2 = this;
                android.view.View$AccessibilityDelegate r0 = r2.f36a
                android.view.accessibility.AccessibilityNodeInfo r1 = r4.f118a
                r0.onInitializeAccessibilityNodeInfo(r3, r1)
                androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r4.h(r0)
                boolean r0 = r3.isEnabled()
                if (r0 == 0) goto L42
                int r0 = r3.getScrollRange()
                if (r0 <= 0) goto L42
                r1 = 1
                r4.i(r1)
                int r1 = r3.getScrollY()
                if (r1 <= 0) goto L32
                a.I$a r1 = a.I.a.g
                r4.b(r1)
                a.I$a r1 = a.I.a.k
                r4.b(r1)
            L32:
                int r3 = r3.getScrollY()
                if (r3 >= r0) goto L42
                a.I$a r3 = a.I.a.f
                r4.b(r3)
                a.I$a r3 = a.I.a.l
                r4.b(r3)
            L42:
                return
        }

        @Override // a.C
        public final boolean g(android.view.View r5, int r6, android.os.Bundle r7) {
                r4 = this;
                boolean r7 = super.g(r5, r6, r7)
                r0 = 1
                if (r7 == 0) goto L8
                return r0
            L8:
                androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
                boolean r7 = r5.isEnabled()
                r1 = 0
                if (r7 != 0) goto L13
                goto L95
            L13:
                int r7 = r5.getHeight()
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                android.graphics.Matrix r3 = r5.getMatrix()
                boolean r3 = r3.isIdentity()
                if (r3 == 0) goto L30
                boolean r3 = r5.getGlobalVisibleRect(r2)
                if (r3 == 0) goto L30
                int r7 = r2.height()
            L30:
                r2 = 4096(0x1000, float:5.74E-42)
                if (r6 == r2) goto L6a
                r2 = 8192(0x2000, float:1.148E-41)
                if (r6 == r2) goto L43
                r2 = 16908344(0x1020038, float:2.3877386E-38)
                if (r6 == r2) goto L43
                r2 = 16908346(0x102003a, float:2.3877392E-38)
                if (r6 == r2) goto L6a
                goto L95
            L43:
                int r6 = r5.getPaddingBottom()
                int r7 = r7 - r6
                int r6 = r5.getPaddingTop()
                int r7 = r7 - r6
                int r6 = r5.getScrollY()
                int r6 = r6 - r7
                int r6 = java.lang.Math.max(r6, r1)
                int r7 = r5.getScrollY()
                if (r6 == r7) goto L95
                int r7 = r5.getScrollX()
                int r1 = r1 - r7
                int r7 = r5.getScrollY()
                int r6 = r6 - r7
                r5.u(r1, r6, r0)
                return r0
            L6a:
                int r6 = r5.getPaddingBottom()
                int r7 = r7 - r6
                int r6 = r5.getPaddingTop()
                int r7 = r7 - r6
                int r6 = r5.getScrollY()
                int r6 = r6 + r7
                int r7 = r5.getScrollRange()
                int r6 = java.lang.Math.min(r6, r7)
                int r7 = r5.getScrollY()
                if (r6 == r7) goto L95
                int r7 = r5.getScrollX()
                int r1 = r1 - r7
                int r7 = r5.getScrollY()
                int r6 = r6 - r7
                r5.u(r1, r6, r0)
                return r0
            L95:
                return r1
        }
    }

    public static class b {
        public static boolean a(android.view.ViewGroup r0) {
                boolean r0 = r0.getClipToPadding()
                return r0
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.core.widget.NestedScrollView f886a;

        public c(androidx.core.widget.NestedScrollView r1) {
                r0 = this;
                r0.<init>()
                r0.f886a = r1
                return
        }
    }

    public interface d {
    }

    public static class e extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.e> CREATOR = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f887a;

        public class a implements android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.e> {
            @Override // android.os.Parcelable.Creator
            public final androidx.core.widget.NestedScrollView.e createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.core.widget.NestedScrollView$e r0 = new androidx.core.widget.NestedScrollView$e
                    r0.<init>(r2)
                    int r2 = r2.readInt()
                    r0.f887a = r2
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final androidx.core.widget.NestedScrollView.e[] newArray(int r1) {
                    r0 = this;
                    androidx.core.widget.NestedScrollView$e[] r1 = new androidx.core.widget.NestedScrollView.e[r1]
                    return r1
            }
        }

        static {
                androidx.core.widget.NestedScrollView$e$a r0 = new androidx.core.widget.NestedScrollView$e$a
                r0.<init>()
                androidx.core.widget.NestedScrollView.e.CREATOR = r0
                return
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "HorizontalScrollView.SavedState{"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " scrollPosition="
                r0.append(r1)
                int r1 = r2.f887a
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.f887a
                r1.writeInt(r2)
                return
        }
    }

    static {
            r0 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r0 = java.lang.Math.log(r0)
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r0 = (float) r0
            androidx.core.widget.NestedScrollView.B = r0
            androidx.core.widget.NestedScrollView$a r0 = new androidx.core.widget.NestedScrollView$a
            r0.<init>()
            androidx.core.widget.NestedScrollView.C = r0
            r0 = 16843130(0x101017a, float:2.3694617E-38)
            int[] r0 = new int[]{r0}
            androidx.core.widget.NestedScrollView.D = r0
            return
    }

    public NestedScrollView(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            int r0 = androidx.core.R.attr.nestedScrollViewStyle
            r6.<init>(r7, r8, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r6.c = r1
            r1 = 1
            r6.h = r1
            r2 = 0
            r6.i = r2
            r3 = 0
            r6.j = r3
            r6.k = r2
            r6.n = r1
            r3 = -1
            r6.r = r3
            r3 = 2
            int[] r4 = new int[r3]
            r6.s = r4
            int[] r3 = new int[r3]
            r6.t = r3
            androidx.core.widget.NestedScrollView$c r3 = new androidx.core.widget.NestedScrollView$c
            r3.<init>(r6)
            a.k5 r4 = new a.k5
            android.content.Context r5 = r6.getContext()
            r4.<init>(r5, r3)
            r6.A = r4
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L40
            android.widget.EdgeEffect r5 = a.G5.b.a(r7, r8)
            goto L45
        L40:
            android.widget.EdgeEffect r5 = new android.widget.EdgeEffect
            r5.<init>(r7)
        L45:
            r6.e = r5
            if (r3 < r4) goto L4e
            android.widget.EdgeEffect r3 = a.G5.b.a(r7, r8)
            goto L53
        L4e:
            android.widget.EdgeEffect r3 = new android.widget.EdgeEffect
            r3.<init>(r7)
        L53:
            r6.f = r3
            android.content.res.Resources r3 = r7.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 * r4
            r4 = 1136724797(0x43c10b3d, float:386.0878)
            float r3 = r3 * r4
            r4 = 1062668861(0x3f570a3d, float:0.84)
            float r3 = r3 * r4
            r6.f885a = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r4 = r6.getContext()
            r3.<init>(r4)
            r6.d = r3
            r6.setFocusable(r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            r6.setDescendantFocusability(r3)
            r6.setWillNotDraw(r2)
            android.content.Context r3 = r6.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r4 = r3.getScaledTouchSlop()
            r6.o = r4
            int r4 = r3.getScaledMinimumFlingVelocity()
            r6.p = r4
            int r3 = r3.getScaledMaximumFlingVelocity()
            r6.q = r3
            int[] r3 = androidx.core.widget.NestedScrollView.D
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r3, r0, r2)
            boolean r8 = r7.getBoolean(r2, r2)
            r6.setFillViewport(r8)
            r7.recycle()
            a.Mb r7 = new a.Mb
            r7.<init>()
            r6.x = r7
            a.Jb r7 = new a.Jb
            r7.<init>(r6)
            r6.y = r7
            r6.setNestedScrollingEnabled(r1)
            androidx.core.widget.NestedScrollView$a r7 = androidx.core.widget.NestedScrollView.C
            a.C0414ug.j(r6, r7)
            return
    }

    public static boolean g(android.view.View r1, androidx.core.widget.NestedScrollView r2) {
            if (r1 != r2) goto L3
            goto L13
        L3:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L15
            android.view.View r1 = (android.view.View) r1
            boolean r1 = g(r1, r2)
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final boolean a(int r9) {
            r8 = this;
            android.view.View r0 = r8.findFocus()
            if (r0 != r8) goto L7
            r0 = 0
        L7:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r8, r0, r9)
            int r2 = r8.getMaxScrollAmount()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            int r5 = r8.getHeight()
            boolean r5 = r8.h(r1, r2, r5)
            if (r5 == 0) goto L34
            android.graphics.Rect r2 = r8.c
            r1.getDrawingRect(r2)
            r8.offsetDescendantRectToMyCoords(r1, r2)
            int r2 = r8.b(r2)
            r8.s(r2, r3, r4, r4)
            r1.requestFocus(r9)
            goto L7b
        L34:
            r1 = 33
            r5 = 130(0x82, float:1.82E-43)
            if (r9 != r1) goto L45
            int r1 = r8.getScrollY()
            if (r1 >= r2) goto L45
            int r2 = r8.getScrollY()
            goto L71
        L45:
            if (r9 != r5) goto L71
            int r1 = r8.getChildCount()
            if (r1 <= 0) goto L71
            android.view.View r1 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r1 = r1.getBottom()
            int r6 = r6.bottomMargin
            int r1 = r1 + r6
            int r6 = r8.getScrollY()
            int r7 = r8.getHeight()
            int r7 = r7 + r6
            int r6 = r8.getPaddingBottom()
            int r7 = r7 - r6
            int r1 = r1 - r7
            int r2 = java.lang.Math.min(r1, r2)
        L71:
            if (r2 != 0) goto L74
            return r3
        L74:
            if (r9 != r5) goto L77
            goto L78
        L77:
            int r2 = -r2
        L78:
            r8.s(r2, r3, r4, r4)
        L7b:
            if (r0 == 0) goto L9c
            boolean r9 = r0.isFocused()
            if (r9 == 0) goto L9c
            int r9 = r8.getHeight()
            boolean r9 = r8.h(r0, r3, r9)
            if (r9 != 0) goto L9c
            int r9 = r8.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            r8.setDescendantFocusability(r0)
            r8.requestFocus()
            r8.setDescendantFocusability(r9)
        L9c:
            return r4
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "ScrollView can host only one direct child"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3, r4)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    public final int b(android.graphics.Rect r11) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r10.getHeight()
            int r2 = r10.getScrollY()
            int r3 = r2 + r0
            int r4 = r10.getVerticalFadingEdgeLength()
            int r5 = r11.top
            if (r5 <= 0) goto L1b
            int r2 = r2 + r4
        L1b:
            android.view.View r5 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r7 = r11.bottom
            int r8 = r5.getHeight()
            int r9 = r6.topMargin
            int r8 = r8 + r9
            int r9 = r6.bottomMargin
            int r8 = r8 + r9
            if (r7 >= r8) goto L36
            int r4 = r3 - r4
            goto L37
        L36:
            r4 = r3
        L37:
            int r7 = r11.bottom
            if (r7 <= r4) goto L59
            int r8 = r11.top
            if (r8 <= r2) goto L59
            int r1 = r11.height()
            if (r1 <= r0) goto L49
            int r11 = r11.top
            int r11 = r11 - r2
            goto L4c
        L49:
            int r11 = r11.bottom
            int r11 = r11 - r4
        L4c:
            int r0 = r5.getBottom()
            int r1 = r6.bottomMargin
            int r0 = r0 + r1
            int r0 = r0 - r3
            int r11 = java.lang.Math.min(r11, r0)
            return r11
        L59:
            int r3 = r11.top
            if (r3 >= r2) goto L78
            if (r7 >= r4) goto L78
            int r3 = r11.height()
            if (r3 <= r0) goto L6a
            int r11 = r11.bottom
            int r4 = r4 - r11
            int r1 = r1 - r4
            goto L6e
        L6a:
            int r11 = r11.top
            int r2 = r2 - r11
            int r1 = r1 - r2
        L6e:
            int r11 = r10.getScrollY()
            int r11 = -r11
            int r11 = java.lang.Math.max(r1, r11)
            return r11
        L78:
            return r1
    }

    @Override // a.Kb
    public final void c(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = 1
            a.Mb r2 = r0.x
            if (r4 != r1) goto L8
            r2.b = r3
            goto La
        L8:
            r2.f175a = r3
        La:
            r1 = 2
            r0.v(r1, r4)
            return
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
            r1 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
            r1 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
            r1 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public final void computeScroll() {
            r17 = this;
            r0 = r17
            android.widget.OverScroller r1 = r0.d
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto Lb
            return
        Lb:
            android.widget.OverScroller r1 = r0.d
            r1.computeScrollOffset()
            android.widget.OverScroller r1 = r0.d
            int r1 = r1.getCurrY()
            int r2 = r0.v
            int r2 = r1 - r2
            int r3 = r0.getHeight()
            android.widget.EdgeEffect r4 = r0.f
            android.widget.EdgeEffect r5 = r0.e
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 0
            r8 = 1082130432(0x40800000, float:4.0)
            if (r2 <= 0) goto L4a
            float r9 = a.G5.a(r5)
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L4a
            int r7 = -r2
            float r7 = (float) r7
            float r7 = r7 * r8
            float r9 = (float) r3
            float r7 = r7 / r9
            int r3 = -r3
            float r3 = (float) r3
            float r3 = r3 / r8
            float r6 = a.G5.b(r5, r7, r6)
            float r6 = r6 * r3
            int r3 = java.lang.Math.round(r6)
            if (r3 == r2) goto L47
            r5.finish()
        L47:
            int r2 = r2 - r3
        L48:
            r8 = r2
            goto L68
        L4a:
            if (r2 >= 0) goto L48
            float r9 = a.G5.a(r4)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            float r7 = (float) r2
            float r7 = r7 * r8
            float r3 = (float) r3
            float r7 = r7 / r3
            float r3 = r3 / r8
            float r6 = a.G5.b(r4, r7, r6)
            float r6 = r6 * r3
            int r3 = java.lang.Math.round(r6)
            if (r3 == r2) goto L47
            r4.finish()
            goto L47
        L68:
            r0.v = r1
            int[] r9 = r0.t
            r1 = 1
            r2 = 0
            r9[r1] = r2
            r10 = 0
            a.Jb r6 = r0.y
            r7 = 0
            r11 = 1
            r6.c(r7, r8, r9, r10, r11)
            r16 = r9
            r3 = r16[r1]
            int r8 = r8 - r3
            int r3 = r0.getScrollRange()
            if (r8 == 0) goto La6
            int r6 = r0.getScrollY()
            int r7 = r0.getScrollX()
            r0.p(r8, r7, r6, r3)
            int r7 = r0.getScrollY()
            int r11 = r7 - r6
            int r13 = r8 - r11
            r16[r1] = r2
            r10 = 0
            r12 = 0
            a.Jb r9 = r0.y
            int[] r14 = r0.s
            r15 = 1
            r9.d(r10, r11, r12, r13, r14, r15, r16)
            r2 = r16[r1]
            int r8 = r13 - r2
        La6:
            if (r8 == 0) goto Ldd
            int r2 = r0.getOverScrollMode()
            if (r2 == 0) goto Lb2
            if (r2 != r1) goto Ld5
            if (r3 <= 0) goto Ld5
        Lb2:
            if (r8 >= 0) goto Lc5
            boolean r2 = r5.isFinished()
            if (r2 == 0) goto Ld5
            android.widget.OverScroller r2 = r0.d
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r5.onAbsorb(r2)
            goto Ld5
        Lc5:
            boolean r2 = r4.isFinished()
            if (r2 == 0) goto Ld5
            android.widget.OverScroller r2 = r0.d
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r4.onAbsorb(r2)
        Ld5:
            android.widget.OverScroller r2 = r0.d
            r2.abortAnimation()
            r0.x(r1)
        Ldd:
            android.widget.OverScroller r2 = r0.d
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto Le9
            r0.postInvalidateOnAnimation()
            return
        Le9:
            r0.x(r1)
            return
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
            r1 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
            r2 = this;
            r0 = 0
            int r1 = super.computeVerticalScrollOffset()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r1 = r4.getHeight()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            if (r0 != 0) goto L15
            return r1
        L15:
            r0 = 0
            android.view.View r2 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getBottom()
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
            int r3 = r4.getScrollY()
            int r1 = r2 - r1
            int r0 = java.lang.Math.max(r0, r1)
            if (r3 >= 0) goto L35
            int r2 = r2 - r3
            return r2
        L35:
            if (r3 <= r0) goto L3a
            int r3 = r3 - r0
            int r3 = r3 + r2
            return r3
        L3a:
            return r2
    }

    public final boolean d(android.view.KeyEvent r6) {
            r5 = this;
            android.graphics.Rect r0 = r5.c
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto L98
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L98
            int r0 = r6.getAction()
            if (r0 != 0) goto Lc0
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L88
            r3 = 20
            if (r0 == r3) goto L78
            r3 = 62
            if (r0 == r3) goto L6d
            r6 = 92
            if (r0 == r6) goto L68
            r6 = 93
            if (r0 == r6) goto L63
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L5f
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L5b
            goto Lc0
        L5b:
            r5.q(r2)
            return r1
        L5f:
            r5.q(r4)
            return r1
        L63:
            boolean r6 = r5.f(r2)
            return r6
        L68:
            boolean r6 = r5.f(r4)
            return r6
        L6d:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L74
            r2 = r4
        L74:
            r5.q(r2)
            return r1
        L78:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L83
            boolean r6 = r5.f(r2)
            return r6
        L83:
            boolean r6 = r5.a(r2)
            return r6
        L88:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L93
            boolean r6 = r5.f(r4)
            return r6
        L93:
            boolean r6 = r5.a(r4)
            return r6
        L98:
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto Lc0
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto Lc0
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto Lac
            r6 = 0
        Lac:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r2)
            if (r6 == 0) goto Lc0
            if (r6 == r5) goto Lc0
            boolean r6 = r6.requestFocus(r2)
            if (r6 == 0) goto Lc0
            r6 = 1
            return r6
        Lc0:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r2 = r1.d(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            a.Jb r0 = r1.y
            boolean r2 = r0.a(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            a.Jb r0 = r1.y
            boolean r2 = r0.b(r2, r3)
            return r2
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            a.Jb r0 = r6.y
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.c(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            a.Jb r0 = r8.y
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r9 = r0.d(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r11) {
            r10 = this;
            super.draw(r11)
            int r0 = r10.getScrollY()
            android.widget.EdgeEffect r1 = r10.e
            boolean r2 = r1.isFinished()
            r3 = 0
            if (r2 != 0) goto L5f
            int r2 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = java.lang.Math.min(r3, r0)
            boolean r7 = androidx.core.widget.NestedScrollView.b.a(r10)
            if (r7 == 0) goto L35
            int r7 = r10.getPaddingLeft()
            int r8 = r10.getPaddingRight()
            int r8 = r8 + r7
            int r4 = r4 - r8
            int r7 = r10.getPaddingLeft()
            goto L36
        L35:
            r7 = r3
        L36:
            boolean r8 = androidx.core.widget.NestedScrollView.b.a(r10)
            if (r8 == 0) goto L4b
            int r8 = r10.getPaddingTop()
            int r9 = r10.getPaddingBottom()
            int r9 = r9 + r8
            int r5 = r5 - r9
            int r8 = r10.getPaddingTop()
            int r6 = r6 + r8
        L4b:
            float r7 = (float) r7
            float r6 = (float) r6
            r11.translate(r7, r6)
            r1.setSize(r4, r5)
            boolean r1 = r1.draw(r11)
            if (r1 == 0) goto L5c
            r10.postInvalidateOnAnimation()
        L5c:
            r11.restoreToCount(r2)
        L5f:
            android.widget.EdgeEffect r1 = r10.f
            boolean r2 = r1.isFinished()
            if (r2 != 0) goto Lc1
            int r2 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = r10.getScrollRange()
            int r0 = java.lang.Math.max(r6, r0)
            int r0 = r0 + r5
            boolean r6 = androidx.core.widget.NestedScrollView.b.a(r10)
            if (r6 == 0) goto L90
            int r3 = r10.getPaddingLeft()
            int r6 = r10.getPaddingRight()
            int r6 = r6 + r3
            int r4 = r4 - r6
            int r3 = r10.getPaddingLeft()
        L90:
            boolean r6 = androidx.core.widget.NestedScrollView.b.a(r10)
            if (r6 == 0) goto La5
            int r6 = r10.getPaddingTop()
            int r7 = r10.getPaddingBottom()
            int r7 = r7 + r6
            int r5 = r5 - r7
            int r6 = r10.getPaddingBottom()
            int r0 = r0 - r6
        La5:
            int r3 = r3 - r4
            float r3 = (float) r3
            float r0 = (float) r0
            r11.translate(r3, r0)
            float r0 = (float) r4
            r3 = 0
            r6 = 1127481344(0x43340000, float:180.0)
            r11.rotate(r6, r0, r3)
            r1.setSize(r4, r5)
            boolean r0 = r1.draw(r11)
            if (r0 == 0) goto Lbe
            r10.postInvalidateOnAnimation()
        Lbe:
            r11.restoreToCount(r2)
        Lc1:
            return
    }

    public final void e(int r13) {
            r12 = this;
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L2c
            android.widget.OverScroller r1 = r12.d
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r5 = r13
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 2
            r0 = 1
            r12.v(r13, r0)
            int r13 = r12.getScrollY()
            r12.v = r13
            r12.postInvalidateOnAnimation()
        L2c:
            return
    }

    public final boolean f(int r6) {
            r5 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.c
            r4.top = r1
            r4.bottom = r3
            if (r0 == 0) goto L37
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L37
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r1 = r1 + r0
            r4.bottom = r1
            int r1 = r1 - r3
            r4.top = r1
        L37:
            int r0 = r4.top
            int r1 = r4.bottom
            boolean r6 = r5.r(r6, r0, r1)
            return r6
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 0
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r5.getVerticalFadingEdgeLength()
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getScrollY()
            int r0 = r0 - r1
            int r0 = r0 - r3
            if (r0 >= r2) goto L33
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
            return r0
        L33:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public int getMaxScrollAmount() {
            r2 = this;
            int r0 = r2.getHeight()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r2 = this;
            a.Mb r0 = r2.x
            int r1 = r0.f175a
            int r0 = r0.b
            r0 = r0 | r1
            return r0
    }

    public int getScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2f
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L2f:
            return r1
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.getVerticalFadingEdgeLength()
            int r1 = r2.getScrollY()
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
        L16:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public float getVerticalScrollFactorCompat() {
            r5 = this;
            float r0 = r5.z
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L35
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources$Theme r2 = r1.getTheme()
            r3 = 16842829(0x101004d, float:2.3693774E-38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r4)
            if (r2 == 0) goto L2d
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r0 = r0.getDimension(r1)
            r5.z = r0
            goto L35
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected theme to define listPreferredItemHeight."
            r0.<init>(r1)
            throw r0
        L35:
            float r0 = r5.z
            return r0
    }

    public final boolean h(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.graphics.Rect r0 = r2.c
            r3.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r3, r0)
            int r3 = r0.bottom
            int r3 = r3 + r4
            int r1 = r2.getScrollY()
            if (r3 < r1) goto L1d
            int r3 = r0.top
            int r3 = r3 - r4
            int r4 = r2.getScrollY()
            int r4 = r4 + r5
            if (r3 > r4) goto L1d
            r3 = 1
            return r3
        L1d:
            r3 = 0
            return r3
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
            r2 = this;
            a.Jb r0 = r2.y
            r1 = 0
            boolean r0 = r0.f(r1)
            return r0
    }

    @Override // a.Kb
    public final void i(android.view.View r3, int r4) {
            r2 = this;
            a.Mb r3 = r2.x
            r0 = 1
            r1 = 0
            if (r4 != r0) goto L9
            r3.b = r1
            goto Lb
        L9:
            r3.f175a = r1
        Lb:
            r2.x(r4)
            return
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r1 = this;
            a.Jb r0 = r1.y
            boolean r0 = r0.d
            return r0
    }

    @Override // a.Kb
    public final void j(android.view.View r7, int r8, int r9, int[] r10, int r11) {
            r6 = this;
            r4 = 0
            a.Jb r0 = r6.y
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    public final void k(int r11, int r12, int[] r13) {
            r10 = this;
            int r0 = r10.getScrollY()
            r1 = 0
            r10.scrollBy(r1, r11)
            int r1 = r10.getScrollY()
            int r4 = r1 - r0
            if (r13 == 0) goto L16
            r0 = 1
            r1 = r13[r0]
            int r1 = r1 + r4
            r13[r0] = r1
        L16:
            int r6 = r11 - r4
            r7 = 0
            r3 = 0
            a.Jb r2 = r10.y
            r5 = 0
            r8 = r12
            r9 = r13
            r2.d(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public final void l(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.r
            if (r1 != r2) goto L25
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.g = r1
            int r4 = r4.getPointerId(r0)
            r3.r = r4
            android.view.VelocityTracker r4 = r3.l
            if (r4 == 0) goto L25
            r4.clear()
        L25:
            return
    }

    @Override // a.Lb
    public final void m(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.k(r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup
    public final void measureChild(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r1 = r1 + r0
            int r5 = r5.width
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r4, r1, r5)
            r5 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r3.measure(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r0 = r0 + r6
            int r6 = r5.leftMargin
            int r0 = r0 + r6
            int r6 = r5.rightMargin
            int r0 = r0 + r6
            int r0 = r0 + r4
            int r4 = r5.width
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r3, r0, r4)
            int r4 = r5.topMargin
            int r5 = r5.bottomMargin
            int r4 = r4 + r5
            r5 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            r2.measure(r3, r4)
            return
    }

    @Override // a.Kb
    public final void n(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.k(r5, r6, r1)
            return
    }

    @Override // a.Kb
    public final boolean o(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.i = r0
            return
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r30) {
            r29 = this;
            r0 = r29
            r1 = r30
            r3 = 1
            int r4 = r1.getAction()
            r5 = 8
            if (r4 != r5) goto L365
            boolean r4 = r0.k
            if (r4 != 0) goto L365
            int r4 = r1.getSource()
            r5 = 2
            r4 = r4 & r5
            if (r4 != r5) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = 0
        L1c:
            r7 = 0
            r8 = 4194304(0x400000, float:5.877472E-39)
            r9 = 26
            if (r4 == 0) goto L2f
            r4 = 9
            float r10 = r1.getAxisValue(r4)
            float r11 = r1.getX()
            int r11 = (int) r11
            goto L45
        L2f:
            int r4 = r1.getSource()
            r4 = r4 & r8
            if (r4 != r8) goto L42
            float r10 = r1.getAxisValue(r9)
            int r4 = r0.getWidth()
            int r11 = r4 / 2
            r4 = r9
            goto L45
        L42:
            r10 = r7
            r4 = 0
            r11 = 0
        L45:
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L365
            float r12 = r0.getVerticalScrollFactorCompat()
            float r12 = r12 * r10
            int r10 = (int) r12
            int r12 = r1.getSource()
            r13 = 8194(0x2002, float:1.1482E-41)
            r12 = r12 & r13
            if (r12 != r13) goto L5a
            r12 = r3
            goto L5b
        L5a:
            r12 = 0
        L5b:
            int r10 = -r10
            r0.s(r10, r11, r3, r12)
            if (r4 == 0) goto L362
            a.k5 r10 = r0.A
            r10.getClass()
            int r11 = r1.getSource()
            int r12 = r1.getDeviceId()
            int r13 = r10.f
            int[] r14 = r10.h
            r16 = r3
            r3 = 34
            if (r13 != r11) goto L88
            int r13 = r10.g
            if (r13 != r12) goto L88
            int r13 = r10.e
            if (r13 == r4) goto L81
            goto L88
        L81:
            r6 = 0
            r18 = 20
            r20 = 0
            goto L138
        L88:
            android.content.Context r13 = r10.f543a
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r13)
            r18 = 20
            int r2 = r1.getDeviceId()
            int r7 = r1.getSource()
            r20 = 0
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r15 = "android"
            java.lang.String r9 = "dimen"
            r8 = -1
            if (r6 < r3) goto La8
            int r2 = a.C0486yg.b(r5, r2, r4, r7)
            goto Lde
        La8:
            android.view.InputDevice r2 = android.view.InputDevice.getDevice(r2)
            if (r2 == 0) goto Ldb
            android.view.InputDevice$MotionRange r2 = r2.getMotionRange(r4, r7)
            if (r2 == 0) goto Ldb
            android.content.res.Resources r2 = r13.getResources()
            r3 = 4194304(0x400000, float:5.877472E-39)
            if (r7 != r3) goto Lc7
            r3 = 26
            if (r4 != r3) goto Lc7
            java.lang.String r3 = "config_viewMinRotaryEncoderFlingVelocity"
            int r3 = r2.getIdentifier(r3, r9, r15)
            goto Lc8
        Lc7:
            r3 = r8
        Lc8:
            java.util.Objects.requireNonNull(r5)
            if (r3 == r8) goto Ld6
            if (r3 == 0) goto Ldb
            int r2 = r2.getDimensionPixelSize(r3)
            if (r2 >= 0) goto Lde
            goto Ldb
        Ld6:
            int r2 = r5.getScaledMinimumFlingVelocity()
            goto Lde
        Ldb:
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lde:
            r14[r20] = r2
            int r2 = r1.getDeviceId()
            int r3 = r1.getSource()
            r7 = 34
            if (r6 < r7) goto Lf1
            int r2 = a.C0486yg.a(r5, r2, r4, r3)
            goto L12e
        Lf1:
            android.view.InputDevice r2 = android.view.InputDevice.getDevice(r2)
            if (r2 == 0) goto L100
            android.view.InputDevice$MotionRange r2 = r2.getMotionRange(r4, r3)
            if (r2 == 0) goto L100
            r2 = r16
            goto L102
        L100:
            r2 = r20
        L102:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != 0) goto L108
        L106:
            r2 = r6
            goto L12e
        L108:
            android.content.res.Resources r2 = r13.getResources()
            r7 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r7) goto L11b
            r3 = 26
            if (r4 != r3) goto L11b
            java.lang.String r3 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r3 = r2.getIdentifier(r3, r9, r15)
            goto L11c
        L11b:
            r3 = r8
        L11c:
            java.util.Objects.requireNonNull(r5)
            if (r3 == r8) goto L12a
            if (r3 == 0) goto L106
            int r2 = r2.getDimensionPixelSize(r3)
            if (r2 >= 0) goto L12e
            goto L106
        L12a:
            int r2 = r5.getScaledMaximumFlingVelocity()
        L12e:
            r14[r16] = r2
            r10.f = r11
            r10.g = r12
            r10.e = r4
            r6 = r16
        L138:
            r2 = r14[r20]
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L14a
            android.view.VelocityTracker r1 = r10.c
            if (r1 == 0) goto L364
            r1.recycle()
            r1 = 0
            r10.c = r1
            return r16
        L14a:
            android.view.VelocityTracker r2 = r10.c
            if (r2 != 0) goto L154
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r10.c = r2
        L154:
            android.view.VelocityTracker r2 = r10.c
            java.util.Map<android.view.VelocityTracker, a.gg> r3 = a.C0146fg.f475a
            r2.addMovement(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r3 < r7) goto L162
            goto L1c0
        L162:
            int r3 = r1.getSource()
            r7 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r7) goto L1c0
            java.util.Map<android.view.VelocityTracker, a.gg> r3 = a.C0146fg.f475a
            boolean r5 = r3.containsKey(r2)
            if (r5 != 0) goto L17a
            a.gg r5 = new a.gg
            r5.<init>()
            r3.put(r2, r5)
        L17a:
            java.lang.Object r3 = r3.get(r2)
            a.gg r3 = (a.C0164gg) r3
            r3.getClass()
            long r7 = r1.getEventTime()
            int r5 = r3.d
            long[] r9 = r3.b
            if (r5 == 0) goto L1a0
            int r5 = r3.e
            r11 = r9[r5]
            long r11 = r7 - r11
            r23 = 40
            int r5 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r5 <= 0) goto L1a0
            r5 = r20
            r3.d = r5
            r5 = 0
            r3.c = r5
        L1a0:
            int r5 = r3.e
            int r5 = r5 + 1
            int r5 = r5 % 20
            r3.e = r5
            int r11 = r3.d
            r12 = r18
            if (r11 == r12) goto L1b2
            int r11 = r11 + 1
            r3.d = r11
        L1b2:
            r11 = 26
            float r1 = r1.getAxisValue(r11)
            float[] r11 = r3.f487a
            r11[r5] = r1
            int r1 = r3.e
            r9[r1] = r7
        L1c0:
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.computeCurrentVelocity(r1, r3)
            java.util.Map<android.view.VelocityTracker, a.gg> r5 = a.C0146fg.f475a
            java.lang.Object r5 = r5.get(r2)
            a.gg r5 = (a.C0164gg) r5
            if (r5 == 0) goto L2d3
            int r7 = r5.d
            r8 = 2
            if (r7 >= r8) goto L1df
        L1d7:
            r25 = r2
            r30 = r3
            r2 = r1
            r1 = 0
            goto L2ad
        L1df:
            int r8 = r5.e
            r18 = 20
            int r9 = r8 + 20
            int r7 = r7 + (-1)
            int r9 = r9 - r7
            int r9 = r9 % 20
            long[] r7 = r5.b
            r11 = r7[r8]
        L1ee:
            r23 = r7[r9]
            long r25 = r11 - r23
            r27 = 100
            int r8 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r8 <= 0) goto L205
            int r8 = r5.d
            int r8 = r8 + (-1)
            r5.d = r8
            int r9 = r9 + 1
            r18 = 20
            int r9 = r9 % 20
            goto L1ee
        L205:
            r18 = 20
            int r8 = r5.d
            r11 = 2
            if (r8 >= r11) goto L20d
            goto L1d7
        L20d:
            float[] r12 = r5.f487a
            if (r8 != r11) goto L22b
            int r9 = r9 + 1
            int r9 = r9 % 20
            r7 = r7[r9]
            int r11 = (r23 > r7 ? 1 : (r23 == r7 ? 0 : -1))
            if (r11 != 0) goto L21c
            goto L1d7
        L21c:
            r9 = r12[r9]
            long r7 = r7 - r23
            float r7 = (float) r7
            float r7 = r9 / r7
            r25 = r2
            r30 = r3
            r2 = r1
            r1 = r7
            goto L2ad
        L22b:
            r8 = 0
            r11 = 0
            r13 = 0
        L22e:
            int r15 = r5.d
            int r15 = r15 + (-1)
            r17 = 1073741824(0x40000000, float:2.0)
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 >= r15) goto L291
            int r15 = r11 + r9
            r18 = 20
            int r23 = r15 % 20
            r23 = r7[r23]
            int r15 = r15 + 1
            int r15 = r15 % 20
            r25 = r7[r15]
            int r25 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r25 != 0) goto L253
            r25 = r2
            r30 = r3
            r2 = r16
            goto L287
        L253:
            int r13 = r13 + 1
            r19 = 0
            int r25 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r25 >= 0) goto L25d
            r21 = r22
        L25d:
            float r22 = java.lang.Math.abs(r8)
            r30 = r3
            float r3 = r22 * r17
            r25 = r2
            double r1 = (double) r3
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r21 = r21 * r1
            r1 = r12[r15]
            r2 = r7[r15]
            long r2 = r2 - r23
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r1 - r21
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 * r2
            float r1 = r1 + r8
            r2 = r16
            if (r13 != r2) goto L286
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
        L286:
            r8 = r1
        L287:
            int r11 = r11 + r2
            r3 = r30
            r16 = r2
            r2 = r25
            r1 = 1000(0x3e8, float:1.401E-42)
            goto L22e
        L291:
            r25 = r2
            r30 = r3
            r19 = 0
            int r1 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r1 >= 0) goto L29d
            r21 = r22
        L29d:
            float r1 = java.lang.Math.abs(r8)
            float r1 = r1 * r17
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r1 = r1 * r21
            r2 = 1000(0x3e8, float:1.401E-42)
        L2ad:
            float r2 = (float) r2
            float r1 = r1 * r2
            r5.c = r1
            float r2 = java.lang.Math.abs(r30)
            float r2 = -r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L2c2
            float r1 = java.lang.Math.abs(r30)
            float r1 = -r1
            r5.c = r1
            goto L2d5
        L2c2:
            float r1 = r5.c
            float r2 = java.lang.Math.abs(r30)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L2d5
            float r1 = java.lang.Math.abs(r30)
            r5.c = r1
            goto L2d5
        L2d3:
            r25 = r2
        L2d5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r1 < r7) goto L2e2
            r1 = r25
            float r1 = a.C0146fg.a.a(r1, r4)
            goto L306
        L2e2:
            r1 = r25
            if (r4 != 0) goto L2eb
            float r1 = r1.getXVelocity()
            goto L306
        L2eb:
            r2 = 1
            if (r4 != r2) goto L2f3
            float r1 = r1.getYVelocity()
            goto L306
        L2f3:
            java.util.Map<android.view.VelocityTracker, a.gg> r2 = a.C0146fg.f475a
            java.lang.Object r1 = r2.get(r1)
            a.gg r1 = (a.C0164gg) r1
            if (r1 == 0) goto L305
            r3 = 26
            if (r4 == r3) goto L302
            goto L305
        L302:
            float r1 = r1.c
            goto L306
        L305:
            r1 = 0
        L306:
            androidx.core.widget.NestedScrollView$c r2 = r10.b
            androidx.core.widget.NestedScrollView r2 = r2.f886a
            float r3 = r2.getVerticalScrollFactorCompat()
            float r3 = -r3
            float r1 = r1 * r3
            float r3 = java.lang.Math.signum(r1)
            if (r6 != 0) goto L326
            float r4 = r10.d
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L32b
            r19 = 0
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 == 0) goto L32b
        L326:
            android.widget.OverScroller r3 = r2.d
            r3.abortAnimation()
        L32b:
            float r3 = java.lang.Math.abs(r1)
            r20 = 0
            r4 = r14[r20]
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L33b
            r16 = 1
            goto L364
        L33b:
            r16 = 1
            r3 = r14[r16]
            int r4 = -r3
            float r4 = (float) r4
            float r3 = (float) r3
            float r1 = java.lang.Math.min(r1, r3)
            float r1 = java.lang.Math.max(r4, r1)
            r19 = 0
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 != 0) goto L353
            r7 = r19
            goto L35d
        L353:
            android.widget.OverScroller r3 = r2.d
            r3.abortAnimation()
            int r3 = (int) r1
            r2.e(r3)
            r7 = r1
        L35d:
            r10.d = r7
            r16 = 1
            return r16
        L362:
            r16 = r3
        L364:
            return r16
        L365:
            r20 = 0
            return r20
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            boolean r3 = r12.k
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto Laf
            r5 = -1
            if (r0 == r1) goto L83
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto L83
            r1 = 6
            if (r0 == r1) goto L20
            goto L132
        L20:
            r12.l(r13)
            goto L132
        L25:
            int r0 = r12.r
            if (r0 != r5) goto L2b
            goto L132
        L2b:
            int r3 = r13.findPointerIndex(r0)
            if (r3 != r5) goto L4b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r13.<init>(r1)
            r13.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L132
        L4b:
            float r0 = r13.getY(r3)
            int r0 = (int) r0
            int r3 = r12.g
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.o
            if (r3 <= r5) goto L132
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L132
            r12.k = r1
            r12.g = r0
            android.view.VelocityTracker r0 = r12.l
            if (r0 != 0) goto L71
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.l = r0
        L71:
            android.view.VelocityTracker r0 = r12.l
            r0.addMovement(r13)
            r12.u = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L132
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L132
        L83:
            r12.k = r4
            r12.r = r5
            android.view.VelocityTracker r13 = r12.l
            if (r13 == 0) goto L90
            r13.recycle()
            r12.l = r3
        L90:
            android.widget.OverScroller r5 = r12.d
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            int r11 = r12.getScrollRange()
            r8 = 0
            r9 = 0
            r10 = 0
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto Laa
            r12.postInvalidateOnAnimation()
        Laa:
            r12.x(r4)
            goto L132
        Laf:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L117
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r4)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L117
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L117
            int r6 = r7.getLeft()
            if (r5 < r6) goto L117
            int r6 = r7.getRight()
            if (r5 >= r6) goto L117
            r12.g = r0
            int r0 = r13.getPointerId(r4)
            r12.r = r0
            android.view.VelocityTracker r0 = r12.l
            if (r0 != 0) goto Lf4
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.l = r0
            goto Lf7
        Lf4:
            r0.clear()
        Lf7:
            android.view.VelocityTracker r0 = r12.l
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.d
            r0.computeScrollOffset()
            boolean r13 = r12.w(r13)
            if (r13 != 0) goto L111
            android.widget.OverScroller r13 = r12.d
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L110
            goto L111
        L110:
            r1 = r4
        L111:
            r12.k = r1
            r12.v(r2, r4)
            goto L132
        L117:
            boolean r13 = r12.w(r13)
            if (r13 != 0) goto L127
            android.widget.OverScroller r13 = r12.d
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L126
            goto L127
        L126:
            r1 = r4
        L127:
            r12.k = r1
            android.view.VelocityTracker r13 = r12.l
            if (r13 == 0) goto L132
            r13.recycle()
            r12.l = r3
        L132:
            boolean r13 = r12.k
            return r13
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            r3 = r2
            r4 = 0
            r3.h = r4
            android.view.View r6 = r3.j
            if (r6 == 0) goto L24
            boolean r6 = g(r6, r2)
            if (r6 == 0) goto L24
            android.view.View r6 = r3.j
            android.graphics.Rect r0 = r3.c
            r6.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r6, r0)
            int r6 = r2.b(r0)
            if (r6 == 0) goto L24
            r2.scrollBy(r4, r6)
        L24:
            r6 = 0
            r3.j = r6
            boolean r0 = r3.i
            if (r0 != 0) goto L7d
            androidx.core.widget.NestedScrollView$e r0 = r3.w
            if (r0 == 0) goto L3c
            int r0 = r2.getScrollX()
            androidx.core.widget.NestedScrollView$e r1 = r3.w
            int r1 = r1.f887a
            r2.scrollTo(r0, r1)
            r3.w = r6
        L3c:
            int r6 = r2.getChildCount()
            if (r6 <= 0) goto L57
            android.view.View r6 = r2.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r6 = r6.getMeasuredHeight()
            int r1 = r0.topMargin
            int r6 = r6 + r1
            int r0 = r0.bottomMargin
            int r6 = r6 + r0
            goto L58
        L57:
            r6 = r4
        L58:
            int r7 = r7 - r5
            int r5 = r2.getPaddingTop()
            int r7 = r7 - r5
            int r5 = r2.getPaddingBottom()
            int r7 = r7 - r5
            int r5 = r2.getScrollY()
            if (r7 >= r6) goto L74
            if (r5 >= 0) goto L6c
            goto L74
        L6c:
            int r4 = r7 + r5
            if (r4 <= r6) goto L73
            int r4 = r6 - r7
            goto L74
        L73:
            r4 = r5
        L74:
            if (r4 == r5) goto L7d
            int r5 = r2.getScrollX()
            r2.scrollTo(r5, r4)
        L7d:
            int r4 = r2.getScrollX()
            int r5 = r2.getScrollY()
            r2.scrollTo(r4, r5)
            r4 = 1
            r3.i = r4
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.m
            if (r0 != 0) goto L8
            goto L58
        L8:
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            if (r6 != 0) goto Lf
            goto L58
        Lf:
            int r6 = r4.getChildCount()
            if (r6 <= 0) goto L58
            r6 = 0
            android.view.View r6 = r4.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r6.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r0.topMargin
            int r2 = r2 - r3
            int r3 = r0.bottomMargin
            int r2 = r2 - r3
            if (r1 >= r2) goto L58
            int r1 = r4.getPaddingLeft()
            int r3 = r4.getPaddingRight()
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r0 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r3, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r5, r0)
        L58:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto Lc
            r1 = 0
            r2 = 1
            r0.dispatchNestedFling(r1, r3, r2)
            int r1 = (int) r3
            r0.e(r1)
            return r2
        Lc:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            a.Jb r1 = r0.y
            boolean r1 = r1.b(r2, r3)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r4 = 0
            a.Jb r0 = r6.y
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1 = 0
            r2 = 0
            r0.k(r5, r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.c(r2, r3, r4, r0)
            return
    }

    @Override // android.view.View
    public final void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.scrollTo(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r4, android.graphics.Rect r5) {
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L6
            r4 = 130(0x82, float:1.82E-43)
            goto Lb
        L6:
            r0 = 1
            if (r4 != r0) goto Lb
            r4 = 33
        Lb:
            if (r5 != 0) goto L17
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            android.view.View r0 = r0.findNextFocus(r3, r1, r4)
            goto L1f
        L17:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocusFromRect(r3, r5, r4)
        L1f:
            r1 = 0
            if (r0 != 0) goto L23
            goto L2d
        L23:
            int r2 = r3.getHeight()
            boolean r2 = r3.h(r0, r1, r2)
            if (r2 != 0) goto L2e
        L2d:
            return r1
        L2e:
            boolean r4 = r0.requestFocus(r4, r5)
            return r4
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.widget.NestedScrollView.e
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.core.widget.NestedScrollView$e r2 = (androidx.core.widget.NestedScrollView.e) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.w = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.core.widget.NestedScrollView$e r1 = new androidx.core.widget.NestedScrollView$e
            r1.<init>(r0)
            int r0 = r2.getScrollY()
            r1.f887a = r0
            return r1
    }

    @Override // android.view.View
    public final void onScrollChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onScrollChanged(r1, r2, r3, r4)
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L2c
            if (r0 != r1) goto Lc
            goto L2c
        Lc:
            r2 = 0
            boolean r3 = r0.h(r1, r2, r4)
            if (r3 == 0) goto L2c
            android.graphics.Rect r3 = r0.c
            r1.getDrawingRect(r3)
            r0.offsetDescendantRectToMyCoords(r1, r3)
            int r1 = r0.b(r3)
            if (r1 == 0) goto L2c
            boolean r3 = r0.n
            if (r3 == 0) goto L29
            r0.u(r2, r1, r2)
            return
        L29:
            r0.scrollBy(r2, r1)
        L2c:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.o(r2, r3, r4, r0)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.i(r2, r0)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            android.view.VelocityTracker r2 = r0.l
            if (r2 != 0) goto Le
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.l = r2
        Le:
            int r2 = r1.getActionMasked()
            r3 = 0
            if (r2 != 0) goto L17
            r0.u = r3
        L17:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r1)
            int r5 = r0.u
            float r5 = (float) r5
            r6 = 0
            r4.offsetLocation(r6, r5)
            r5 = 1
            r7 = 2
            if (r2 == 0) goto L1eb
            android.widget.EdgeEffect r8 = r0.f
            android.widget.EdgeEffect r9 = r0.e
            r10 = 0
            r11 = -1
            if (r2 == r5) goto L15c
            if (r2 == r7) goto La2
            r6 = 3
            if (r2 == r6) goto L60
            r3 = 5
            if (r2 == r3) goto L4d
            r3 = 6
            if (r2 == r3) goto L3b
            goto L21f
        L3b:
            r19.l(r20)
            int r2 = r0.r
            int r2 = r1.findPointerIndex(r2)
            float r1 = r1.getY(r2)
            int r1 = (int) r1
            r0.g = r1
            goto L21f
        L4d:
            int r2 = r1.getActionIndex()
            float r3 = r1.getY(r2)
            int r3 = (int) r3
            r0.g = r3
            int r1 = r1.getPointerId(r2)
            r0.r = r1
            goto L21f
        L60:
            boolean r1 = r0.k
            if (r1 == 0) goto L86
            int r1 = r0.getChildCount()
            if (r1 <= 0) goto L86
            android.widget.OverScroller r12 = r0.d
            int r13 = r0.getScrollX()
            int r14 = r0.getScrollY()
            int r18 = r0.getScrollRange()
            r15 = 0
            r16 = 0
            r17 = 0
            boolean r1 = r12.springBack(r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L86
            r0.postInvalidateOnAnimation()
        L86:
            r0.r = r11
            r0.k = r3
            android.view.VelocityTracker r1 = r0.l
            if (r1 == 0) goto L93
            r1.recycle()
            r0.l = r10
        L93:
            r0.x(r3)
            android.widget.EdgeEffect r1 = r0.e
            r1.onRelease()
            android.widget.EdgeEffect r1 = r0.f
            r1.onRelease()
            goto L21f
        La2:
            int r2 = r0.r
            int r2 = r1.findPointerIndex(r2)
            if (r2 != r11) goto Lc6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            int r2 = r0.r
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L21f
        Lc6:
            float r7 = r1.getY(r2)
            int r7 = (int) r7
            int r10 = r0.g
            int r10 = r10 - r7
            float r11 = r1.getX(r2)
            int r12 = r0.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            float r12 = (float) r10
            int r13 = r0.getHeight()
            float r13 = (float) r13
            float r12 = r12 / r13
            float r13 = a.G5.a(r9)
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto Lfa
            float r8 = -r12
            float r8 = a.G5.b(r9, r8, r11)
            float r8 = -r8
            float r11 = a.G5.a(r9)
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 != 0) goto Lf8
            r9.onRelease()
        Lf8:
            r6 = r8
            goto L115
        Lfa:
            float r9 = a.G5.a(r8)
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L115
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 - r11
            float r9 = a.G5.b(r8, r12, r9)
            float r11 = a.G5.a(r8)
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 != 0) goto L114
            r8.onRelease()
        L114:
            r6 = r9
        L115:
            int r8 = r0.getHeight()
            float r8 = (float) r8
            float r6 = r6 * r8
            int r6 = java.lang.Math.round(r6)
            if (r6 == 0) goto L124
            r0.invalidate()
        L124:
            int r10 = r10 - r6
            boolean r6 = r0.k
            if (r6 != 0) goto L145
            int r6 = java.lang.Math.abs(r10)
            int r8 = r0.o
            if (r6 <= r8) goto L145
            android.view.ViewParent r6 = r0.getParent()
            if (r6 == 0) goto L13a
            r6.requestDisallowInterceptTouchEvent(r5)
        L13a:
            r0.k = r5
            if (r10 <= 0) goto L142
            int r6 = r0.o
            int r10 = r10 - r6
            goto L145
        L142:
            int r6 = r0.o
            int r10 = r10 + r6
        L145:
            boolean r6 = r0.k
            if (r6 == 0) goto L21f
            float r1 = r1.getX(r2)
            int r1 = (int) r1
            int r1 = r0.s(r10, r1, r3, r3)
            int r7 = r7 - r1
            r0.g = r7
            int r2 = r0.u
            int r2 = r2 + r1
            r0.u = r2
            goto L21f
        L15c:
            android.view.VelocityTracker r1 = r0.l
            int r2 = r0.q
            float r2 = (float) r2
            r7 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r7, r2)
            int r2 = r0.r
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            int r2 = java.lang.Math.abs(r1)
            int r7 = r0.p
            if (r2 < r7) goto L1b4
            float r2 = a.G5.a(r9)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L18c
            boolean r2 = r0.t(r9, r1)
            if (r2 == 0) goto L187
            r9.onAbsorb(r1)
            goto L1d0
        L187:
            int r1 = -r1
            r0.e(r1)
            goto L1d0
        L18c:
            float r2 = a.G5.a(r8)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L1a3
            int r1 = -r1
            boolean r2 = r0.t(r8, r1)
            if (r2 == 0) goto L19f
            r8.onAbsorb(r1)
            goto L1d0
        L19f:
            r0.e(r1)
            goto L1d0
        L1a3:
            int r1 = -r1
            float r2 = (float) r1
            a.Jb r7 = r0.y
            boolean r7 = r7.b(r6, r2)
            if (r7 != 0) goto L1d0
            r0.dispatchNestedFling(r6, r2, r5)
            r0.e(r1)
            goto L1d0
        L1b4:
            android.widget.OverScroller r12 = r0.d
            int r13 = r0.getScrollX()
            int r14 = r0.getScrollY()
            int r18 = r0.getScrollRange()
            r15 = 0
            r16 = 0
            r17 = 0
            boolean r1 = r12.springBack(r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L1d0
            r0.postInvalidateOnAnimation()
        L1d0:
            r0.r = r11
            r0.k = r3
            android.view.VelocityTracker r1 = r0.l
            if (r1 == 0) goto L1dd
            r1.recycle()
            r0.l = r10
        L1dd:
            r0.x(r3)
            android.widget.EdgeEffect r1 = r0.e
            r1.onRelease()
            android.widget.EdgeEffect r1 = r0.f
            r1.onRelease()
            goto L21f
        L1eb:
            int r2 = r0.getChildCount()
            if (r2 != 0) goto L1f2
            return r3
        L1f2:
            boolean r2 = r0.k
            if (r2 == 0) goto L1ff
            android.view.ViewParent r2 = r0.getParent()
            if (r2 == 0) goto L1ff
            r2.requestDisallowInterceptTouchEvent(r5)
        L1ff:
            android.widget.OverScroller r2 = r0.d
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L20f
            android.widget.OverScroller r2 = r0.d
            r2.abortAnimation()
            r0.x(r5)
        L20f:
            float r2 = r1.getY()
            int r2 = (int) r2
            int r1 = r1.getPointerId(r3)
            r0.g = r2
            r0.r = r1
            r0.v(r7, r3)
        L21f:
            android.view.VelocityTracker r1 = r0.l
            if (r1 == 0) goto L226
            r1.addMovement(r4)
        L226:
            r4.recycle()
            return r5
    }

    public final boolean p(int r10, int r11, int r12, int r13) {
            r9 = this;
            int r0 = r9.getOverScrollMode()
            super.computeHorizontalScrollRange()
            super.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            super.computeVerticalScrollExtent()
            r1 = 1
            int r12 = r12 + r10
            r10 = 0
            if (r11 <= 0) goto L18
        L15:
            r3 = r10
            r11 = r1
            goto L1d
        L18:
            if (r11 >= 0) goto L1b
            goto L15
        L1b:
            r3 = r11
            r11 = r10
        L1d:
            if (r12 <= r13) goto L22
            r4 = r13
        L20:
            r12 = r1
            goto L28
        L22:
            if (r12 >= 0) goto L26
            r4 = r10
            goto L20
        L26:
            r4 = r12
            r12 = r10
        L28:
            if (r12 == 0) goto L3e
            a.Jb r13 = r9.y
            boolean r13 = r13.f(r1)
            if (r13 != 0) goto L3e
            android.widget.OverScroller r2 = r9.d
            int r8 = r9.getScrollRange()
            r5 = 0
            r6 = 0
            r7 = 0
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L3e:
            super.scrollTo(r3, r4)
            if (r11 != 0) goto L47
            if (r12 == 0) goto L46
            goto L47
        L46:
            return r10
        L47:
            return r1
    }

    public final void q(int r6) {
            r5 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.c
            if (r0 == 0) goto L3e
            int r0 = r5.getScrollY()
            int r0 = r0 + r3
            r4.top = r0
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L49
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r4.top
            int r0 = r0 + r3
            if (r0 <= r1) goto L49
            int r1 = r1 - r3
            r4.top = r1
            goto L49
        L3e:
            int r0 = r5.getScrollY()
            int r0 = r0 - r3
            r4.top = r0
            if (r0 >= 0) goto L49
            r4.top = r1
        L49:
            int r0 = r4.top
            int r3 = r3 + r0
            r4.bottom = r3
            r5.r(r6, r0, r3)
            return
    }

    public final boolean r(int r18, int r19, int r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.getHeight()
            int r5 = r0.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L82
        L75:
            if (r6 == 0) goto L7b
            int r2 = r2 - r5
        L78:
            r3 = 0
            r4 = 1
            goto L7e
        L7b:
            int r2 = r3 - r4
            goto L78
        L7e:
            r0.s(r2, r3, r4, r4)
            r7 = r4
        L82:
            android.view.View r2 = r0.findFocus()
            if (r11 == r2) goto L8b
            r11.requestFocus(r1)
        L8b:
            return r7
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View r3, android.view.View r4) {
            r2 = this;
            boolean r0 = r2.h
            if (r0 != 0) goto L17
            android.graphics.Rect r0 = r2.c
            r4.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r4, r0)
            int r0 = r2.b(r0)
            if (r0 == 0) goto L19
            r1 = 0
            r2.scrollBy(r1, r0)
            goto L19
        L17:
            r2.j = r4
        L19:
            super.requestChildFocus(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            int r0 = r3.getLeft()
            int r1 = r3.getScrollX()
            int r0 = r0 - r1
            int r1 = r3.getTop()
            int r3 = r3.getScrollY()
            int r1 = r1 - r3
            r4.offset(r0, r1)
            int r3 = r2.b(r4)
            r4 = 0
            if (r3 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = r4
        L1f:
            if (r0 == 0) goto L2a
            if (r5 == 0) goto L27
            r2.scrollBy(r4, r3)
            return r0
        L27:
            r2.u(r4, r3, r4)
        L2a:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.view.VelocityTracker r0 = r1.l
            if (r0 == 0) goto Lc
            r0.recycle()
            r0 = 0
            r1.l = r0
        Lc:
            super.requestDisallowInterceptTouchEvent(r2)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            r0 = 1
            r1.h = r0
            super.requestLayout()
            return
    }

    public final int s(int r19, int r20, int r21, boolean r22) {
            r18 = this;
            r0 = r18
            r1 = r20
            r7 = r21
            r10 = 1
            if (r7 != r10) goto Ld
            r2 = 2
            r0.v(r2, r7)
        Ld:
            int[] r5 = r0.t
            int[] r6 = r0.s
            a.Jb r2 = r0.y
            r3 = 0
            r4 = r19
            boolean r2 = r2.c(r3, r4, r5, r6, r7)
            r11 = 0
            int[] r9 = r0.t
            int[] r12 = r0.s
            if (r2 == 0) goto L2a
            r2 = r9[r10]
            int r2 = r19 - r2
            r3 = r12[r10]
            r13 = r2
            r14 = r3
            goto L2d
        L2a:
            r13 = r19
            r14 = r11
        L2d:
            int r15 = r0.getScrollY()
            int r2 = r0.getScrollRange()
            int r3 = r0.getOverScrollMode()
            if (r3 == 0) goto L43
            if (r3 != r10) goto L48
            int r3 = r0.getScrollRange()
            if (r3 <= 0) goto L48
        L43:
            if (r22 != 0) goto L48
            r16 = r10
            goto L4a
        L48:
            r16 = r11
        L4a:
            boolean r3 = r0.p(r13, r11, r15, r2)
            if (r3 == 0) goto L5b
            a.Jb r3 = r0.y
            boolean r3 = r3.f(r7)
            if (r3 != 0) goto L5b
            r17 = r10
            goto L5d
        L5b:
            r17 = r11
        L5d:
            int r3 = r0.getScrollY()
            int r4 = r3 - r15
            int r6 = r13 - r4
            r9[r10] = r11
            r3 = 0
            r5 = 0
            r8 = r2
            a.Jb r2 = r0.y
            int[] r7 = r0.s
            r11 = r8
            r8 = r21
            r2.d(r3, r4, r5, r6, r7, r8, r9)
            r7 = r8
            r2 = r12[r10]
            int r14 = r14 + r2
            r2 = r9[r10]
            int r13 = r13 - r2
            int r15 = r15 + r13
            android.widget.EdgeEffect r2 = r0.f
            android.widget.EdgeEffect r3 = r0.e
            if (r15 >= 0) goto La0
            if (r16 == 0) goto Lc1
            int r4 = -r13
            float r4 = (float) r4
            int r5 = r0.getHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r1 = (float) r1
            int r5 = r0.getWidth()
            float r5 = (float) r5
            float r1 = r1 / r5
            a.G5.b(r3, r4, r1)
            boolean r1 = r2.isFinished()
            if (r1 != 0) goto Lc1
            r2.onRelease()
            goto Lc1
        La0:
            if (r15 <= r11) goto Lc1
            if (r16 == 0) goto Lc1
            float r4 = (float) r13
            int r5 = r0.getHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r1 = (float) r1
            int r5 = r0.getWidth()
            float r5 = (float) r5
            float r1 = r1 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r1
            a.G5.b(r2, r4, r5)
            boolean r1 = r3.isFinished()
            if (r1 != 0) goto Lc1
            r3.onRelease()
        Lc1:
            boolean r1 = r3.isFinished()
            if (r1 == 0) goto Ld1
            boolean r1 = r2.isFinished()
            if (r1 != 0) goto Lce
            goto Ld1
        Lce:
            r11 = r17
            goto Ld5
        Ld1:
            r0.postInvalidateOnAnimation()
            r11 = 0
        Ld5:
            if (r11 == 0) goto Le0
            if (r7 != 0) goto Le0
            android.view.VelocityTracker r1 = r0.l
            if (r1 == 0) goto Le0
            r1.clear()
        Le0:
            if (r7 != r10) goto Leb
            r0.x(r7)
            r3.onRelease()
            r2.onRelease()
        Leb:
            return r14
    }

    @Override // android.view.View
    public final void scrollTo(int r8, int r9) {
            r7 = this;
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L6a
            r0 = 0
            android.view.View r1 = r7.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r7.getWidth()
            int r4 = r7.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r7.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r1.getWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r5 = r7.getHeight()
            int r6 = r7.getPaddingTop()
            int r5 = r5 - r6
            int r6 = r7.getPaddingBottom()
            int r5 = r5 - r6
            int r1 = r1.getHeight()
            int r6 = r2.topMargin
            int r1 = r1 + r6
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            if (r3 >= r4) goto L4d
            if (r8 >= 0) goto L46
            goto L4d
        L46:
            int r2 = r3 + r8
            if (r2 <= r4) goto L4e
            int r8 = r4 - r3
            goto L4e
        L4d:
            r8 = r0
        L4e:
            if (r5 >= r1) goto L5a
            if (r9 >= 0) goto L53
            goto L5a
        L53:
            int r0 = r5 + r9
            if (r0 <= r1) goto L5b
            int r9 = r1 - r5
            goto L5b
        L5a:
            r9 = r0
        L5b:
            int r0 = r7.getScrollX()
            if (r8 != r0) goto L67
            int r0 = r7.getScrollY()
            if (r9 == r0) goto L6a
        L67:
            super.scrollTo(r8, r9)
        L6a:
            return
    }

    public void setFillViewport(boolean r2) {
            r1 = this;
            boolean r0 = r1.m
            if (r2 == r0) goto L9
            r1.m = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r3) {
            r2 = this;
            a.Jb r0 = r2.y
            boolean r1 = r0.d
            if (r1 == 0) goto Ld
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            android.view.ViewGroup r1 = r0.c
            a.C0414ug.d.z(r1)
        Ld:
            r0.d = r3
            return
    }

    public void setOnScrollChangeListener(androidx.core.widget.NestedScrollView.d r1) {
            r0 = this;
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.n = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
            r2 = this;
            a.Jb r0 = r2.y
            r1 = 0
            boolean r3 = r0.g(r3, r1)
            return r3
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.x(r0)
            return
    }

    public final boolean t(android.widget.EdgeEffect r11, int r12) {
            r10 = this;
            r0 = 1
            if (r12 <= 0) goto L4
            return r0
        L4:
            float r11 = a.G5.a(r11)
            int r1 = r10.getHeight()
            float r1 = (float) r1
            float r11 = r11 * r1
            int r12 = -r12
            int r12 = java.lang.Math.abs(r12)
            float r12 = (float) r12
            r1 = 1051931443(0x3eb33333, float:0.35)
            float r12 = r12 * r1
            float r1 = r10.f885a
            r2 = 1014350479(0x3c75c28f, float:0.015)
            float r1 = r1 * r2
            float r12 = r12 / r1
            double r2 = (double) r12
            double r2 = java.lang.Math.log(r2)
            float r12 = androidx.core.widget.NestedScrollView.B
            double r4 = (double) r12
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r4 - r6
            double r8 = (double) r1
            double r4 = r4 / r6
            double r4 = r4 * r2
            double r1 = java.lang.Math.exp(r4)
            double r1 = r1 * r8
            float r12 = (float) r1
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 >= 0) goto L39
            return r0
        L39:
            r11 = 0
            return r11
    }

    public final void u(int r10, int r11, boolean r12) {
            r9 = this;
            int r0 = r9.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r9.b
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L6c
            r10 = 0
            android.view.View r0 = r9.getChildAt(r10)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r9.getHeight()
            int r3 = r9.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r9.getPaddingBottom()
            int r2 = r2 - r3
            int r5 = r9.getScrollY()
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r10, r0)
            int r11 = r11 + r5
            int r11 = java.lang.Math.min(r11, r0)
            int r10 = java.lang.Math.max(r10, r11)
            int r7 = r10 - r5
            android.widget.OverScroller r3 = r9.d
            int r4 = r9.getScrollX()
            r6 = 0
            r8 = 250(0xfa, float:3.5E-43)
            r3.startScroll(r4, r5, r6, r7, r8)
            if (r12 == 0) goto L5f
            r10 = 2
            r9.v(r10, r1)
            goto L62
        L5f:
            r9.x(r1)
        L62:
            int r10 = r9.getScrollY()
            r9.v = r10
            r9.postInvalidateOnAnimation()
            goto L7f
        L6c:
            android.widget.OverScroller r12 = r9.d
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto L7c
            android.widget.OverScroller r12 = r9.d
            r12.abortAnimation()
            r9.x(r1)
        L7c:
            r9.scrollBy(r10, r11)
        L7f:
            long r10 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r9.b = r10
            return
    }

    public final void v(int r2, int r3) {
            r1 = this;
            r2 = 2
            a.Jb r0 = r1.y
            r0.g(r2, r3)
            return
    }

    public final boolean w(android.view.MotionEvent r6) {
            r5 = this;
            android.widget.EdgeEffect r0 = r5.e
            float r1 = a.G5.a(r0)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            if (r1 == 0) goto L1b
            float r1 = r6.getX()
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r1 = r1 / r4
            a.G5.b(r0, r2, r1)
            r0 = r3
            goto L1c
        L1b:
            r0 = 0
        L1c:
            android.widget.EdgeEffect r1 = r5.f
            float r4 = a.G5.a(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L37
            float r6 = r6.getX()
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r6
            a.G5.b(r1, r2, r0)
            return r3
        L37:
            return r0
    }

    public final void x(int r2) {
            r1 = this;
            a.Jb r0 = r1.y
            r0.h(r2)
            return
    }
}
