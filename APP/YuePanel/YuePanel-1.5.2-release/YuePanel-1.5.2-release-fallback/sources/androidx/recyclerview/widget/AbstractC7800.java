package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7800 extends androidx.recyclerview.widget.RecyclerView.AbstractC7698 {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private android.widget.Scroller mGravityScroller;
    androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private final androidx.recyclerview.widget.RecyclerView.AbstractC7700 mScrollListener;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۥ$ۥ, reason: contains not printable characters */
    public class C7801 extends androidx.recyclerview.widget.RecyclerView.AbstractC7700 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean f30072;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.AbstractC7800 f30073;

        public C7801(androidx.recyclerview.widget.AbstractC7800 r1) {
                r0 = this;
                r0.f30073 = r1
                r0.<init>()
                r1 = 0
                r0.f30072 = r1
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7700
        public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                super.onScrollStateChanged(r1, r2)
                if (r2 != 0) goto L11
                boolean r1 = r0.f30072
                if (r1 == 0) goto L11
                r1 = 0
                r0.f30072 = r1
                androidx.recyclerview.widget.ۥ۟۟۠ۥ r1 = r0.f30073
                r1.snapToTargetExistingView()
            L11:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7700
        public void onScrolled(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                if (r2 != 0) goto L4
                if (r3 == 0) goto L7
            L4:
                r1 = 1
                r0.f30072 = r1
            L7:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۥ$ۥ۟, reason: contains not printable characters */
    public class C7802 extends androidx.recyclerview.widget.C7785 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.AbstractC7800 f30074;

        public C7802(androidx.recyclerview.widget.AbstractC7800 r1, android.content.Context r2) {
                r0 = this;
                r0.f30074 = r1
                r0.<init>(r2)
                return
        }

        @Override // androidx.recyclerview.widget.C7785
        public float calculateSpeedPerPixel(android.util.DisplayMetrics r2) {
                r1 = this;
                int r2 = r2.densityDpi
                float r2 = (float) r2
                r0 = 1120403456(0x42c80000, float:100.0)
                float r0 = r0 / r2
                return r0
        }

        @Override // androidx.recyclerview.widget.C7785, androidx.recyclerview.widget.RecyclerView.AbstractC7710
        public void onTargetFound(android.view.View r3, androidx.recyclerview.widget.RecyclerView.C7713 r4, androidx.recyclerview.widget.RecyclerView.AbstractC7710.C7711 r5) {
                r2 = this;
                androidx.recyclerview.widget.ۥ۟۟۠ۥ r4 = r2.f30074
                androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
                if (r0 != 0) goto L7
                return
            L7:
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.getLayoutManager()
                int[] r3 = r4.calculateDistanceToFinalSnap(r0, r3)
                r4 = 0
                r4 = r3[r4]
                r0 = 1
                r3 = r3[r0]
                int r0 = java.lang.Math.abs(r4)
                int r1 = java.lang.Math.abs(r3)
                int r0 = java.lang.Math.max(r0, r1)
                int r0 = r2.calculateTimeForDeceleration(r0)
                if (r0 <= 0) goto L2c
                android.view.animation.DecelerateInterpolator r1 = r2.mDecelerateInterpolator
                r5.m29853(r4, r3, r0, r1)
            L2c:
                return
        }
    }

    public AbstractC7800() {
            r1 = this;
            r1.<init>()
            androidx.recyclerview.widget.ۥ۟۟۠ۥ$ۥ r0 = new androidx.recyclerview.widget.ۥ۟۟۠ۥ$ۥ
            r0.<init>(r1)
            r1.mScrollListener = r0
            return
    }

    public void attachToRecyclerView(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView r3) throws java.lang.IllegalStateException {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            if (r0 != r3) goto L5
            return
        L5:
            if (r0 == 0) goto La
            r2.m30288()
        La:
            r2.mRecyclerView = r3
            if (r3 == 0) goto L26
            r2.m30289()
            android.widget.Scroller r3 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            android.content.Context r0 = r0.getContext()
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r3.<init>(r0, r1)
            r2.mGravityScroller = r3
            r2.snapToTargetExistingView()
        L26:
            return
    }

    @Yue.InterfaceC4544
    public abstract int[] calculateDistanceToFinalSnap(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1, @Yue.InterfaceC4410 android.view.View r2);

    public int[] calculateScrollDistance(int r10, int r11) {
            r9 = this;
            android.widget.Scroller r0 = r9.mGravityScroller
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r3 = r10
            r4 = r11
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.Scroller r10 = r9.mGravityScroller
            int r10 = r10.getFinalX()
            android.widget.Scroller r11 = r9.mGravityScroller
            int r11 = r11.getFinalY()
            int[] r10 = new int[]{r10, r11}
            return r10
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.RecyclerView.AbstractC7710 createScroller(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1) {
            r0 = this;
            androidx.recyclerview.widget.ۥ۟۟۟ۧ r1 = r0.createSnapScroller(r1)
            return r1
    }

    @Yue.InterfaceC4544
    @java.lang.Deprecated
    public androidx.recyclerview.widget.C7785 createSnapScroller(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
            r1 = this;
            boolean r2 = r2 instanceof androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712
            if (r2 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.recyclerview.widget.ۥ۟۟۠ۥ$ۥ۟ r2 = new androidx.recyclerview.widget.ۥ۟۟۠ۥ$ۥ۟
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            android.content.Context r0 = r0.getContext()
            r2.<init>(r1, r0)
            return r2
    }

    @Yue.InterfaceC4544
    public abstract android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1);

    public abstract int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1, int r2, int r3);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7698
    public boolean onFling(int r5, int r6) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.getLayoutManager()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            androidx.recyclerview.widget.RecyclerView r2 = r4.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r2 = r2.getAdapter()
            if (r2 != 0) goto L13
            return r1
        L13:
            androidx.recyclerview.widget.RecyclerView r2 = r4.mRecyclerView
            int r2 = r2.getMinFlingVelocity()
            int r3 = java.lang.Math.abs(r6)
            if (r3 > r2) goto L25
            int r3 = java.lang.Math.abs(r5)
            if (r3 <= r2) goto L2c
        L25:
            boolean r5 = r4.m30290(r0, r5, r6)
            if (r5 == 0) goto L2c
            r1 = 1
        L2c:
            return r1
    }

    public void snapToTargetExistingView() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            if (r0 != 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            return
        Lc:
            android.view.View r1 = r4.findSnapView(r0)
            if (r1 != 0) goto L13
            return
        L13:
            int[] r0 = r4.calculateDistanceToFinalSnap(r0, r1)
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            if (r1 != 0) goto L21
            r3 = r0[r2]
            if (r3 == 0) goto L28
        L21:
            androidx.recyclerview.widget.RecyclerView r3 = r4.mRecyclerView
            r0 = r0[r2]
            r3.smoothScrollBy(r1, r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m30288() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠ r1 = r2.mScrollListener
            r0.removeOnScrollListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r1 = 0
            r0.setOnFlingListener(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m30289() throws java.lang.IllegalStateException {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۡ r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L15
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠ r1 = r2.mScrollListener
            r0.addOnScrollListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.setOnFlingListener(r2)
            return
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "An instance of OnFlingListener already set."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m30290(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r0 = r2.createScroller(r3)
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r4 = r2.findTargetSnapPosition(r3, r4, r5)
            r5 = -1
            if (r4 != r5) goto L15
            return r1
        L15:
            r0.setTargetPosition(r4)
            r3.startSmoothScroll(r0)
            r3 = 1
            return r3
    }
}
