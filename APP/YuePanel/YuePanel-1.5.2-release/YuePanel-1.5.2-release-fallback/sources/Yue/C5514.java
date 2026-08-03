package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5514 extends androidx.recyclerview.widget.RecyclerView.AbstractC7700 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f20411 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f20412 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f20413 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f20414 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f20415 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f20416 = -1;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C6875.AbstractC6885 f20417;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.C6875 f20418;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.recyclerview.widget.RecyclerView f20419;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.recyclerview.widget.LinearLayoutManager f20420;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f20421;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f20422;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C5514.C5515 f20423;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f20424;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f20425;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f20426;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f20427;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f20428;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean f20429;

    /* JADX INFO: renamed from: Yue.ۥۡۧۥ۠$ۥ, reason: contains not printable characters */
    public static final class C5515 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f20430;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public float f20431;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f20432;

        public C5515() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m20764() {
                r1 = this;
                r0 = -1
                r1.f20430 = r0
                r0 = 0
                r1.f20431 = r0
                r0 = 0
                r1.f20432 = r0
                return
        }
    }

    public C5514(@Yue.InterfaceC4410 Yue.C6875 r1) {
            r0 = this;
            r0.<init>()
            r0.f20418 = r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f24096
            r0.f20419 = r1
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r1.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            r0.f20420 = r1
            Yue.ۥۡۧۥ۠$ۥ r1 = new Yue.ۥۡۧۥ۠$ۥ
            r1.<init>()
            r0.f20423 = r1
            r0.m20760()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7700
    public void onScrollStateChanged(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r5, int r6) {
            r4 = this;
            int r5 = r4.f20421
            r0 = 0
            r1 = 1
            if (r5 != r1) goto La
            int r5 = r4.f20422
            if (r5 == r1) goto L10
        La:
            if (r6 != r1) goto L10
            r4.m20762(r0)
            return
        L10:
            boolean r5 = r4.m20755()
            r2 = 2
            if (r5 == 0) goto L23
            if (r6 != r2) goto L23
            boolean r5 = r4.f20427
            if (r5 == 0) goto L22
            r4.m20748(r2)
            r4.f20426 = r1
        L22:
            return
        L23:
            boolean r5 = r4.m20755()
            r1 = -1
            if (r5 == 0) goto L53
            if (r6 != 0) goto L53
            r4.m20763()
            boolean r5 = r4.f20427
            if (r5 != 0) goto L3e
            Yue.ۥۡۧۥ۠$ۥ r5 = r4.f20423
            int r5 = r5.f20430
            if (r5 == r1) goto L4d
            r3 = 0
            r4.m20746(r5, r3, r0)
            goto L4d
        L3e:
            Yue.ۥۡۧۥ۠$ۥ r5 = r4.f20423
            int r3 = r5.f20432
            if (r3 != 0) goto L53
            int r3 = r4.f20424
            int r5 = r5.f20430
            if (r3 == r5) goto L4d
            r4.m20747(r5)
        L4d:
            r4.m20748(r0)
            r4.m20760()
        L53:
            int r5 = r4.f20421
            if (r5 != r2) goto L78
            if (r6 != 0) goto L78
            boolean r5 = r4.f20428
            if (r5 == 0) goto L78
            r4.m20763()
            Yue.ۥۡۧۥ۠$ۥ r5 = r4.f20423
            int r6 = r5.f20432
            if (r6 != 0) goto L78
            int r6 = r4.f20425
            int r5 = r5.f20430
            if (r6 == r5) goto L72
            if (r5 != r1) goto L6f
            r5 = r0
        L6f:
            r4.m20747(r5)
        L72:
            r4.m20748(r0)
            r4.m20760()
        L78:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7700
    public void onScrolled(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
            r3 = this;
            r4 = 1
            r3.f20427 = r4
            r3.m20763()
            boolean r0 = r3.f20426
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f20426 = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            Yue.ۥۢۤۦۢ r6 = r3.f20418
            boolean r6 = r6.m26643()
            if (r5 != r6) goto L29
        L1f:
            Yue.ۥۡۧۥ۠$ۥ r5 = r3.f20423
            int r6 = r5.f20432
            if (r6 == 0) goto L29
            int r5 = r5.f20430
            int r5 = r5 + r4
            goto L2d
        L29:
            Yue.ۥۡۧۥ۠$ۥ r5 = r3.f20423
            int r5 = r5.f20430
        L2d:
            r3.f20425 = r5
            int r6 = r3.f20424
            if (r6 == r5) goto L45
            r3.m20747(r5)
            goto L45
        L37:
            int r5 = r3.f20421
            if (r5 != 0) goto L45
            Yue.ۥۡۧۥ۠$ۥ r5 = r3.f20423
            int r5 = r5.f20430
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.m20747(r5)
        L45:
            Yue.ۥۡۧۥ۠$ۥ r5 = r3.f20423
            int r6 = r5.f20430
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.f20431
            int r5 = r5.f20432
            r3.m20746(r6, r0, r5)
            Yue.ۥۡۧۥ۠$ۥ r5 = r3.f20423
            int r6 = r5.f20430
            int r0 = r3.f20425
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f20432
            if (r5 != 0) goto L6b
            int r5 = r3.f20422
            if (r5 == r4) goto L6b
            r3.m20748(r2)
            r3.m20760()
        L6b:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m20746(int r2, float r3, int r4) {
            r1 = this;
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ r0 = r1.f20417
            if (r0 == 0) goto L7
            r0.onPageScrolled(r2, r3, r4)
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m20747(int r2) {
            r1 = this;
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ r0 = r1.f20417
            if (r0 == 0) goto L7
            r0.onPageSelected(r2)
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m20748(int r3) {
            r2 = this;
            int r0 = r2.f20421
            r1 = 3
            if (r0 != r1) goto La
            int r0 = r2.f20422
            if (r0 != 0) goto La
            return
        La:
            int r0 = r2.f20422
            if (r0 != r3) goto Lf
            return
        Lf:
            r2.f20422 = r3
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ r0 = r2.f20417
            if (r0 == 0) goto L18
            r0.onPageScrollStateChanged(r3)
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m20749() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.f20420
            int r0 = r0.findFirstVisibleItemPosition()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double m20750() {
            r5 = this;
            r5.m20763()
            Yue.ۥۡۧۥ۠$ۥ r0 = r5.f20423
            int r1 = r0.f20430
            double r1 = (double) r1
            float r0 = r0.f20431
            double r3 = (double) r0
            double r1 = r1 + r3
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m20751() {
            r1 = this;
            int r0 = r1.f20422
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m20752() {
            r2 = this;
            int r0 = r2.f20422
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m20753() {
            r1 = this;
            boolean r0 = r1.f20429
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m20754() {
            r1 = this;
            int r0 = r1.f20422
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m20755() {
            r3 = this;
            int r0 = r3.f20421
            r1 = 1
            if (r0 == r1) goto La
            r2 = 4
            if (r0 != r2) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m20756() {
            r1 = this;
            r0 = 4
            r1.f20421 = r0
            r0 = 1
            r1.m20762(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m20757() {
            r1 = this;
            r0 = 1
            r1.f20428 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m20758() {
            r3 = this;
            boolean r0 = r3.m20752()
            if (r0 == 0) goto Lb
            boolean r0 = r3.f20429
            if (r0 != 0) goto Lb
            return
        Lb:
            r0 = 0
            r3.f20429 = r0
            r3.m20763()
            Yue.ۥۡۧۥ۠$ۥ r1 = r3.f20423
            int r2 = r1.f20432
            if (r2 != 0) goto L27
            int r1 = r1.f20430
            int r2 = r3.f20424
            if (r1 == r2) goto L20
            r3.m20747(r1)
        L20:
            r3.m20748(r0)
            r3.m20760()
            goto L2b
        L27:
            r0 = 2
            r3.m20748(r0)
        L2b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m20759(int r3, boolean r4) {
            r2 = this;
            r0 = 2
            if (r4 == 0) goto L5
            r4 = r0
            goto L6
        L5:
            r4 = 3
        L6:
            r2.f20421 = r4
            r4 = 0
            r2.f20429 = r4
            int r1 = r2.f20425
            if (r1 == r3) goto L10
            r4 = 1
        L10:
            r2.f20425 = r3
            r2.m20748(r0)
            if (r4 == 0) goto L1a
            r2.m20747(r3)
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m20760() {
            r2 = this;
            r0 = 0
            r2.f20421 = r0
            r2.f20422 = r0
            Yue.ۥۡۧۥ۠$ۥ r1 = r2.f20423
            r1.m20764()
            r1 = -1
            r2.f20424 = r1
            r2.f20425 = r1
            r2.f20426 = r0
            r2.f20427 = r0
            r2.f20429 = r0
            r2.f20428 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m20761(Yue.C6875.AbstractC6885 r1) {
            r0 = this;
            r0.f20417 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m20762(boolean r3) {
            r2 = this;
            r2.f20429 = r3
            r0 = 1
            if (r3 == 0) goto L7
            r3 = 4
            goto L8
        L7:
            r3 = r0
        L8:
            r2.f20421 = r3
            int r3 = r2.f20425
            r1 = -1
            if (r3 == r1) goto L14
            r2.f20424 = r3
            r2.f20425 = r1
            goto L1e
        L14:
            int r3 = r2.f20424
            if (r3 != r1) goto L1e
            int r3 = r2.m20749()
            r2.f20424 = r3
        L1e:
            r2.m20748(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m20763() {
            r8 = this;
            Yue.ۥۡۧۥ۠$ۥ r0 = r8.f20423
            androidx.recyclerview.widget.LinearLayoutManager r1 = r8.f20420
            int r1 = r1.findFirstVisibleItemPosition()
            r0.f20430 = r1
            r2 = -1
            if (r1 != r2) goto L11
            r0.m20764()
            return
        L11:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r8.f20420
            android.view.View r1 = r2.findViewByPosition(r1)
            if (r1 != 0) goto L1d
            r0.m20764()
            return
        L1d:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r8.f20420
            int r2 = r2.getLeftDecorationWidth(r1)
            androidx.recyclerview.widget.LinearLayoutManager r3 = r8.f20420
            int r3 = r3.getRightDecorationWidth(r1)
            androidx.recyclerview.widget.LinearLayoutManager r4 = r8.f20420
            int r4 = r4.getTopDecorationHeight(r1)
            androidx.recyclerview.widget.LinearLayoutManager r5 = r8.f20420
            int r5 = r5.getBottomDecorationHeight(r1)
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L4b
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r2 = r2 + r7
            int r7 = r6.rightMargin
            int r3 = r3 + r7
            int r7 = r6.topMargin
            int r4 = r4 + r7
            int r6 = r6.bottomMargin
            int r5 = r5 + r6
        L4b:
            int r6 = r1.getHeight()
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r5 = r1.getWidth()
            int r5 = r5 + r2
            int r5 = r5 + r3
            androidx.recyclerview.widget.LinearLayoutManager r3 = r8.f20420
            int r3 = r3.getOrientation()
            if (r3 != 0) goto L76
            int r1 = r1.getLeft()
            int r1 = r1 - r2
            androidx.recyclerview.widget.RecyclerView r2 = r8.f20419
            int r2 = r2.getPaddingLeft()
            int r1 = r1 - r2
            Yue.ۥۢۤۦۢ r2 = r8.f20418
            boolean r2 = r2.m26643()
            if (r2 == 0) goto L74
            int r1 = -r1
        L74:
            r6 = r5
            goto L82
        L76:
            int r1 = r1.getTop()
            int r1 = r1 - r4
            androidx.recyclerview.widget.RecyclerView r2 = r8.f20419
            int r2 = r2.getPaddingTop()
            int r1 = r1 - r2
        L82:
            int r1 = -r1
            r0.f20432 = r1
            if (r1 >= 0) goto Lb4
            Yue.ۥ۟۠ۦ r1 = new Yue.ۥ۟۠ۦ
            androidx.recyclerview.widget.LinearLayoutManager r2 = r8.f20420
            r1.<init>(r2)
            boolean r1 = r1.m1443()
            if (r1 == 0) goto L9c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.US
            int r0 = r0.f20432
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r2, r3, r0)
            r1.<init>(r0)
            throw r1
        Lb4:
            if (r6 != 0) goto Lb8
            r1 = 0
            goto Lbb
        Lb8:
            float r1 = (float) r1
            float r2 = (float) r6
            float r1 = r1 / r2
        Lbb:
            r0.f20431 = r1
            return
    }
}
