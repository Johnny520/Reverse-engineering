package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7794 extends androidx.recyclerview.widget.AbstractC7800 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f30063 = 100;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.AbstractC7791 f30064;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.AbstractC7791 f30065;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۡ$ۥ, reason: contains not printable characters */
    public class C7795 extends androidx.recyclerview.widget.C7785 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7794 f30066;

        public C7795(androidx.recyclerview.widget.C7794 r1, android.content.Context r2) {
                r0 = this;
                r0.f30066 = r1
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

        @Override // androidx.recyclerview.widget.C7785
        public int calculateTimeForScrolling(int r2) {
                r1 = this;
                r0 = 100
                int r2 = super.calculateTimeForScrolling(r2)
                int r2 = java.lang.Math.min(r0, r2)
                return r2
        }

        @Override // androidx.recyclerview.widget.C7785, androidx.recyclerview.widget.RecyclerView.AbstractC7710
        public void onTargetFound(android.view.View r3, androidx.recyclerview.widget.RecyclerView.C7713 r4, androidx.recyclerview.widget.RecyclerView.AbstractC7710.C7711 r5) {
                r2 = this;
                androidx.recyclerview.widget.ۥ۟۟۠ۡ r4 = r2.f30066
                androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
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
                if (r0 <= 0) goto L29
                android.view.animation.DecelerateInterpolator r1 = r2.mDecelerateInterpolator
                r5.m29853(r4, r3, r0, r1)
            L29:
                return
        }
    }

    public C7794() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    private int m30260(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1, @Yue.InterfaceC4410 android.view.View r2, androidx.recyclerview.widget.AbstractC7791 r3) {
            r0 = this;
            int r1 = r3.mo30245(r2)
            int r2 = r3.mo30243(r2)
            int r2 = r2 / 2
            int r1 = r1 + r2
            int r2 = r3.mo30252()
            int r3 = r3.mo30253()
            int r3 = r3 / 2
            int r2 = r2 + r3
            int r1 = r1 - r2
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    private android.view.View m30261(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r9, androidx.recyclerview.widget.AbstractC7791 r10) {
            r8 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r10.mo30252()
            int r3 = r10.mo30253()
            int r3 = r3 / 2
            int r2 = r2 + r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
        L17:
            if (r4 >= r0) goto L34
            android.view.View r5 = r9.getChildAt(r4)
            int r6 = r10.mo30245(r5)
            int r7 = r10.mo30243(r5)
            int r7 = r7 / 2
            int r6 = r6 + r7
            int r6 = r6 - r2
            int r6 = java.lang.Math.abs(r6)
            if (r6 >= r3) goto L31
            r1 = r5
            r3 = r6
        L31:
            int r4 = r4 + 1
            goto L17
        L34:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private androidx.recyclerview.widget.AbstractC7791 m30262(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.f30065
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.f30060
            if (r0 == r2) goto Le
        L8:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = androidx.recyclerview.widget.AbstractC7791.m30239(r2)
            r1.f30065 = r2
        Le:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r1.f30065
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    private androidx.recyclerview.widget.AbstractC7791 m30263(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.f30064
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.f30060
            if (r0 == r2) goto Le
        L8:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = androidx.recyclerview.widget.AbstractC7791.m30241(r2)
            r1.f30064 = r2
        Le:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r1.f30064
            return r2
    }

    @Override // androidx.recyclerview.widget.AbstractC7800
    @Yue.InterfaceC4544
    public int[] calculateDistanceToFinalSnap(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r5, @Yue.InterfaceC4410 android.view.View r6) {
            r4 = this;
            r0 = 2
            int[] r0 = new int[r0]
            boolean r1 = r5.canScrollHorizontally()
            r2 = 0
            if (r1 == 0) goto L15
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r4.m30262(r5)
            int r1 = r4.m30260(r5, r6, r1)
            r0[r2] = r1
            goto L17
        L15:
            r0[r2] = r2
        L17:
            boolean r1 = r5.canScrollVertically()
            r3 = 1
            if (r1 == 0) goto L29
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r4.m30263(r5)
            int r5 = r4.m30260(r5, r6, r1)
            r0[r3] = r5
            goto L2b
        L29:
            r0[r3] = r2
        L2b:
            return r0
    }

    @Override // androidx.recyclerview.widget.AbstractC7800
    public androidx.recyclerview.widget.C7785 createSnapScroller(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
            r1 = this;
            boolean r2 = r2 instanceof androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712
            if (r2 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.recyclerview.widget.ۥ۟۟۠ۡ$ۥ r2 = new androidx.recyclerview.widget.ۥ۟۟۠ۡ$ۥ
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            android.content.Context r0 = r0.getContext()
            r2.<init>(r1, r0)
            return r2
    }

    @Override // androidx.recyclerview.widget.AbstractC7800
    @Yue.InterfaceC4544
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
            r1 = this;
            boolean r0 = r2.canScrollVertically()
            if (r0 == 0) goto Lf
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.m30263(r2)
            android.view.View r2 = r1.m30261(r2, r0)
            return r2
        Lf:
            boolean r0 = r2.canScrollHorizontally()
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.m30262(r2)
            android.view.View r2 = r1.m30261(r2, r0)
            return r2
        L1e:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.AbstractC7800
    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r12, int r13, int r14) {
            r11 = this;
            int r0 = r12.getItemCount()
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r11.m30264(r12)
            if (r2 != 0) goto Lf
            return r1
        Lf:
            int r3 = r12.getChildCount()
            r4 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
        L1e:
            if (r8 >= r3) goto L3a
            android.view.View r9 = r12.getChildAt(r8)
            if (r9 != 0) goto L27
            goto L37
        L27:
            int r10 = r11.m30260(r12, r9, r2)
            if (r10 > 0) goto L31
            if (r10 <= r6) goto L31
            r5 = r9
            r6 = r10
        L31:
            if (r10 < 0) goto L37
            if (r10 >= r7) goto L37
            r4 = r9
            r7 = r10
        L37:
            int r8 = r8 + 1
            goto L1e
        L3a:
            boolean r13 = r11.isForwardFling(r12, r13, r14)
            if (r13 == 0) goto L47
            if (r4 == 0) goto L47
            int r12 = r12.getPosition(r4)
            return r12
        L47:
            if (r13 != 0) goto L50
            if (r5 == 0) goto L50
            int r12 = r12.getPosition(r5)
            return r12
        L50:
            if (r13 == 0) goto L53
            r4 = r5
        L53:
            if (r4 != 0) goto L56
            return r1
        L56:
            int r14 = r12.getPosition(r4)
            boolean r12 = r11.isReverseLayout(r12)
            if (r12 != r13) goto L62
            r12 = r1
            goto L63
        L62:
            r12 = 1
        L63:
            int r14 = r14 + r12
            if (r14 < 0) goto L6a
            if (r14 < r0) goto L69
            goto L6a
        L69:
            return r14
        L6a:
            return r1
    }

    public final boolean isForwardFling(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r3, int r4, int r5) {
            r2 = this;
            boolean r3 = r3.canScrollHorizontally()
            r0 = 0
            r1 = 1
            if (r3 == 0) goto Lc
            if (r4 <= 0) goto Lb
            r0 = r1
        Lb:
            return r0
        Lc:
            if (r5 <= 0) goto Lf
            r0 = r1
        Lf:
            return r0
    }

    public final boolean isReverseLayout(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r5) {
            r4 = this;
            int r0 = r5.getItemCount()
            boolean r1 = r5 instanceof androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712
            r2 = 0
            if (r1 == 0) goto L21
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ۟ r5 = (androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712) r5
            r1 = 1
            int r0 = r0 - r1
            android.graphics.PointF r5 = r5.computeScrollVectorForPosition(r0)
            if (r5 == 0) goto L21
            float r0 = r5.x
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L20
            float r5 = r5.y
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L21
        L20:
            r2 = r1
        L21:
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final androidx.recyclerview.widget.AbstractC7791 m30264(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
            r1 = this;
            boolean r0 = r2.canScrollVertically()
            if (r0 == 0) goto Lb
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r1.m30263(r2)
            return r2
        Lb:
            boolean r0 = r2.canScrollHorizontally()
            if (r0 == 0) goto L16
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r1.m30262(r2)
            return r2
        L16:
            r2 = 0
            return r2
    }
}
