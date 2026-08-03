package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7791 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f30057 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f30058 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f30059 = 1;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.recyclerview.widget.RecyclerView.AbstractC7691 f30060;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f30061;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.graphics.Rect f30062;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠۠$ۥ, reason: contains not printable characters */
    public static class C7792 extends androidx.recyclerview.widget.AbstractC7791 {
        public C7792(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public int mo30242(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r3 = r1.getDecoratedRight(r3)
                int r0 = r0.rightMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public int mo30243(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r3 = r1.getDecoratedMeasuredWidth(r3)
                int r1 = r0.leftMargin
                int r3 = r3 + r1
                int r0 = r0.rightMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public int mo30244(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r3 = r1.getDecoratedMeasuredHeight(r3)
                int r1 = r0.topMargin
                int r3 = r3 + r1
                int r0 = r0.bottomMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo30245(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r3 = r1.getDecoratedLeft(r3)
                int r0 = r0.leftMargin
                int r3 = r3 - r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public int mo30246() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                int r0 = r0.getWidth()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public int mo30247() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.f30060
                int r0 = r0.getWidth()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r1 = r1.getPaddingRight()
                int r0 = r0 - r1
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public int mo30248() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                int r0 = r0.getPaddingRight()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public int mo30250() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                int r0 = r0.getWidthMode()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public int mo30251() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                int r0 = r0.getHeightMode()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public int mo30252() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                int r0 = r0.getPaddingLeft()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public int mo30253() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.f30060
                int r0 = r0.getWidth()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r1 = r1.getPaddingLeft()
                int r0 = r0 - r1
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r1 = r1.getPaddingRight()
                int r0 = r0 - r1
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public int mo30255(android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.f30060
                r1 = 1
                android.graphics.Rect r2 = r3.f30062
                r0.getTransformedBoundingBox(r4, r1, r2)
                android.graphics.Rect r4 = r3.f30062
                int r4 = r4.right
                return r4
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public int mo30256(android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.f30060
                r1 = 1
                android.graphics.Rect r2 = r3.f30062
                r0.getTransformedBoundingBox(r4, r1, r2)
                android.graphics.Rect r4 = r3.f30062
                int r4 = r4.left
                return r4
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public void mo30257(android.view.View r1, int r2) {
                r0 = this;
                r1.offsetLeftAndRight(r2)
                return
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public void mo30258(int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                r0.offsetChildrenHorizontal(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠۠$ۥ۟, reason: contains not printable characters */
    public static class C7793 extends androidx.recyclerview.widget.AbstractC7791 {
        public C7793(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public int mo30242(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r3 = r1.getDecoratedBottom(r3)
                int r0 = r0.bottomMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public int mo30243(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r3 = r1.getDecoratedMeasuredHeight(r3)
                int r1 = r0.topMargin
                int r3 = r3 + r1
                int r0 = r0.bottomMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public int mo30244(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r3 = r1.getDecoratedMeasuredWidth(r3)
                int r1 = r0.leftMargin
                int r3 = r3 + r1
                int r0 = r0.rightMargin
                int r3 = r3 + r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo30245(android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r3 = r1.getDecoratedTop(r3)
                int r0 = r0.topMargin
                int r3 = r3 - r0
                return r3
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public int mo30246() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                int r0 = r0.getHeight()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public int mo30247() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.f30060
                int r0 = r0.getHeight()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r1 = r1.getPaddingBottom()
                int r0 = r0 - r1
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public int mo30248() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                int r0 = r0.getPaddingBottom()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public int mo30250() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                int r0 = r0.getHeightMode()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public int mo30251() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                int r0 = r0.getWidthMode()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public int mo30252() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                int r0 = r0.getPaddingTop()
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public int mo30253() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.f30060
                int r0 = r0.getHeight()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r1 = r1.getPaddingTop()
                int r0 = r0 - r1
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f30060
                int r1 = r1.getPaddingBottom()
                int r0 = r0 - r1
                return r0
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public int mo30255(android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.f30060
                r1 = 1
                android.graphics.Rect r2 = r3.f30062
                r0.getTransformedBoundingBox(r4, r1, r2)
                android.graphics.Rect r4 = r3.f30062
                int r4 = r4.bottom
                return r4
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public int mo30256(android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.f30060
                r1 = 1
                android.graphics.Rect r2 = r3.f30062
                r0.getTransformedBoundingBox(r4, r1, r2)
                android.graphics.Rect r4 = r3.f30062
                int r4 = r4.top
                return r4
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public void mo30257(android.view.View r1, int r2) {
                r0 = this;
                r1.offsetTopAndBottom(r2)
                return
        }

        @Override // androidx.recyclerview.widget.AbstractC7791
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public void mo30258(int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
                r0.offsetChildrenVertical(r2)
                return
        }
    }

    public AbstractC7791(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f30061 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f30062 = r0
            r1.f30060 = r2
            return
    }

    public /* synthetic */ AbstractC7791(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1, androidx.recyclerview.widget.AbstractC7791.C7792 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static androidx.recyclerview.widget.AbstractC7791 m30239(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1) {
            androidx.recyclerview.widget.ۥ۟۟۠۠$ۥ r0 = new androidx.recyclerview.widget.ۥ۟۟۠۠$ۥ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static androidx.recyclerview.widget.AbstractC7791 m30240(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1, int r2) {
            if (r2 == 0) goto L12
            r0 = 1
            if (r2 != r0) goto La
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = m30241(r1)
            return r1
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "invalid orientation"
            r1.<init>(r2)
            throw r1
        L12:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = m30239(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static androidx.recyclerview.widget.AbstractC7791 m30241(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1) {
            androidx.recyclerview.widget.ۥ۟۟۠۠$ۥ۟ r0 = new androidx.recyclerview.widget.ۥ۟۟۠۠$ۥ۟
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract int mo30242(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract int mo30243(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract int mo30244(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract int mo30245(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract int mo30246();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract int mo30247();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public abstract int mo30248();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public androidx.recyclerview.widget.RecyclerView.AbstractC7691 m30249() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f30060
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public abstract int mo30250();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public abstract int mo30251();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public abstract int mo30252();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public abstract int mo30253();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m30254() {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.f30061
            if (r0 != r1) goto L8
            r0 = 0
            goto Lf
        L8:
            int r0 = r2.mo30253()
            int r1 = r2.f30061
            int r0 = r0 - r1
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public abstract int mo30255(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract int mo30256(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public abstract void mo30257(android.view.View r1, int r2);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public abstract void mo30258(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m30259() {
            r1 = this;
            int r0 = r1.mo30253()
            r1.f30061 = r0
            return
    }
}
