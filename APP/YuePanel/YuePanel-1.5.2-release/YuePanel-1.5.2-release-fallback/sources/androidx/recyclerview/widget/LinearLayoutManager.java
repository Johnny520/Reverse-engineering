package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends androidx.recyclerview.widget.RecyclerView.AbstractC7691 implements androidx.recyclerview.widget.C7770.InterfaceC7783, androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final java.lang.String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final androidx.recyclerview.widget.LinearLayoutManager.C7667 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final androidx.recyclerview.widget.LinearLayoutManager.C7668 mLayoutChunkResult;
    private androidx.recyclerview.widget.LinearLayoutManager.C7669 mLayoutState;
    int mOrientation;
    androidx.recyclerview.widget.AbstractC7791 mOrientationHelper;
    androidx.recyclerview.widget.LinearLayoutManager.C7670 mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$ۥ, reason: contains not printable characters */
    public static class C7667 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.recyclerview.widget.AbstractC7791 f29551;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29552;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29553;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29554;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f29555;

        public C7667() {
                r0 = this;
                r0.<init>()
                r0.m29648()
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AnchorInfo{mPosition="
                r0.append(r1)
                int r1 = r2.f29552
                r0.append(r1)
                java.lang.String r1 = ", mCoordinate="
                r0.append(r1)
                int r1 = r2.f29553
                r0.append(r1)
                java.lang.String r1 = ", mLayoutFromEnd="
                r0.append(r1)
                boolean r1 = r2.f29554
                r0.append(r1)
                java.lang.String r1 = ", mValid="
                r0.append(r1)
                boolean r1 = r2.f29555
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m29644() {
                r1 = this;
                boolean r0 = r1.f29554
                if (r0 == 0) goto Lb
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.f29551
                int r0 = r0.mo30247()
                goto L11
            Lb:
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.f29551
                int r0 = r0.mo30252()
            L11:
                r1.f29553 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m29645(android.view.View r2, int r3) {
                r1 = this;
                boolean r0 = r1.f29554
                if (r0 == 0) goto L14
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.f29551
                int r2 = r0.mo30242(r2)
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.f29551
                int r0 = r0.m30254()
                int r2 = r2 + r0
                r1.f29553 = r2
                goto L1c
            L14:
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.f29551
                int r2 = r0.mo30245(r2)
                r1.f29553 = r2
            L1c:
                r1.f29552 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29646(android.view.View r5, int r6) {
                r4 = this;
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r4.f29551
                int r0 = r0.m30254()
                if (r0 < 0) goto Lc
                r4.m29645(r5, r6)
                return
            Lc:
                r4.f29552 = r6
                boolean r6 = r4.f29554
                r1 = 0
                if (r6 == 0) goto L55
                androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r4.f29551
                int r6 = r6.mo30247()
                int r6 = r6 - r0
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r4.f29551
                int r0 = r0.mo30242(r5)
                int r6 = r6 - r0
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r4.f29551
                int r0 = r0.mo30247()
                int r0 = r0 - r6
                r4.f29553 = r0
                if (r6 <= 0) goto L94
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r4.f29551
                int r0 = r0.mo30243(r5)
                int r2 = r4.f29553
                int r2 = r2 - r0
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r4.f29551
                int r0 = r0.mo30252()
                androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.f29551
                int r5 = r3.mo30245(r5)
                int r5 = r5 - r0
                int r5 = java.lang.Math.min(r5, r1)
                int r0 = r0 + r5
                int r2 = r2 - r0
                if (r2 >= 0) goto L94
                int r5 = r4.f29553
                int r0 = -r2
                int r6 = java.lang.Math.min(r6, r0)
                int r5 = r5 + r6
                r4.f29553 = r5
                goto L94
            L55:
                androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r4.f29551
                int r6 = r6.mo30245(r5)
                androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.f29551
                int r2 = r2.mo30252()
                int r2 = r6 - r2
                r4.f29553 = r6
                if (r2 <= 0) goto L94
                androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.f29551
                int r3 = r3.mo30243(r5)
                int r6 = r6 + r3
                androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.f29551
                int r3 = r3.mo30247()
                int r3 = r3 - r0
                androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r4.f29551
                int r5 = r0.mo30242(r5)
                int r3 = r3 - r5
                androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r4.f29551
                int r5 = r5.mo30247()
                int r0 = java.lang.Math.min(r1, r3)
                int r5 = r5 - r0
                int r5 = r5 - r6
                if (r5 >= 0) goto L94
                int r6 = r4.f29553
                int r5 = -r5
                int r5 = java.lang.Math.min(r2, r5)
                int r6 = r6 - r5
                r4.f29553 = r6
            L94:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m29647(android.view.View r2, androidx.recyclerview.widget.RecyclerView.C7713 r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r2 = (androidx.recyclerview.widget.RecyclerView.C7696) r2
                boolean r0 = r2.m29775()
                if (r0 != 0) goto L1e
                int r0 = r2.m29772()
                if (r0 < 0) goto L1e
                int r2 = r2.m29772()
                int r3 = r3.m29858()
                if (r2 >= r3) goto L1e
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m29648() {
                r1 = this;
                r0 = -1
                r1.f29552 = r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.f29553 = r0
                r0 = 0
                r1.f29554 = r0
                r1.f29555 = r0
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$ۥ۟, reason: contains not printable characters */
    public static class C7668 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f29556;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f29557;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f29558;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29559;

        public C7668() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m29649() {
                r1 = this;
                r0 = 0
                r1.f29556 = r0
                r1.f29557 = r0
                r1.f29558 = r0
                r1.f29559 = r0
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟, reason: contains not printable characters */
    public static class C7669 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final java.lang.String f29560 = "LLM#LayoutState";

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final int f29561 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final int f29562 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f29563 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f29564 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final int f29565 = 1;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final int f29566 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean f29567;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29568;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29569;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29570;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29571;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29572;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f29573;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f29574;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f29575;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean f29576;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int f29577;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public java.util.List<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29578;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f29579;

        public C7669() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f29567 = r0
                r0 = 0
                r1.f29574 = r0
                r1.f29575 = r0
                r1.f29576 = r0
                r0 = 0
                r1.f29578 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m29650() {
                r1 = this;
                r0 = 0
                r1.m29651(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m29651(android.view.View r1) {
                r0 = this;
                android.view.View r1 = r0.m29656(r1)
                if (r1 != 0) goto La
                r1 = -1
                r0.f29570 = r1
                goto L16
            La:
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r1 = (androidx.recyclerview.widget.RecyclerView.C7696) r1
                int r1 = r1.m29772()
                r0.f29570 = r1
            L16:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m29652(androidx.recyclerview.widget.RecyclerView.C7713 r2) {
                r1 = this;
                int r0 = r1.f29570
                if (r0 < 0) goto Lc
                int r2 = r2.m29858()
                if (r0 >= r2) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29653() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "avail:"
                r0.append(r1)
                int r1 = r2.f29569
                r0.append(r1)
                java.lang.String r1 = ", ind:"
                r0.append(r1)
                int r1 = r2.f29570
                r0.append(r1)
                java.lang.String r1 = ", dir:"
                r0.append(r1)
                int r1 = r2.f29571
                r0.append(r1)
                java.lang.String r1 = ", offset:"
                r0.append(r1)
                int r1 = r2.f29568
                r0.append(r1)
                java.lang.String r1 = ", layoutDir:"
                r0.append(r1)
                int r1 = r2.f29572
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "LLM#LayoutState"
                android.util.Log.d(r1, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.view.View m29654(androidx.recyclerview.widget.RecyclerView.C7704 r3) {
                r2 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r2.f29578
                if (r0 == 0) goto L9
                android.view.View r3 = r2.m29655()
                return r3
            L9:
                int r0 = r2.f29570
                android.view.View r3 = r3.m29811(r0)
                int r0 = r2.f29570
                int r1 = r2.f29571
                int r0 = r0 + r1
                r2.f29570 = r0
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final android.view.View m29655() {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r5.f29578
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L2f
                java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r5.f29578
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r2
                android.view.View r2 = r2.itemView
                android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r3 = (androidx.recyclerview.widget.RecyclerView.C7696) r3
                boolean r4 = r3.m29775()
                if (r4 == 0) goto L20
                goto L2c
            L20:
                int r4 = r5.f29570
                int r3 = r3.m29772()
                if (r4 != r3) goto L2c
                r5.m29651(r2)
                return r2
            L2c:
                int r1 = r1 + 1
                goto L7
            L2f:
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public android.view.View m29656(android.view.View r8) {
                r7 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29578
                int r0 = r0.size()
                r1 = 0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
            Lb:
                if (r3 >= r0) goto L3d
                java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r4 = r7.f29578
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r4
                android.view.View r4 = r4.itemView
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r5 = (androidx.recyclerview.widget.RecyclerView.C7696) r5
                if (r4 == r8) goto L3a
                boolean r6 = r5.m29775()
                if (r6 == 0) goto L26
                goto L3a
            L26:
                int r5 = r5.m29772()
                int r6 = r7.f29570
                int r5 = r5 - r6
                int r6 = r7.f29571
                int r5 = r5 * r6
                if (r5 >= 0) goto L33
                goto L3a
            L33:
                if (r5 >= r2) goto L3a
                r1 = r4
                if (r5 != 0) goto L39
                goto L3d
            L39:
                r2 = r5
            L3a:
                int r3 = r3 + 1
                goto Lb
            L3d:
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static class C7670 implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.C7670> CREATOR = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f29580;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f29581;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f29582;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟$ۥ, reason: contains not printable characters */
        public static class C7671 implements android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.C7670> {
            public C7671() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager.C7670 createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r1 = r0.m29659(r1)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager.C7670[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟[] r1 = r0.m29660(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public androidx.recyclerview.widget.LinearLayoutManager.C7670 m29659(android.os.Parcel r2) {
                    r1 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = new androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟
                    r0.<init>(r2)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public androidx.recyclerview.widget.LinearLayoutManager.C7670[] m29660(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟[] r1 = new androidx.recyclerview.widget.LinearLayoutManager.C7670[r1]
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟$ۥ r0 = new androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟$ۥ
                r0.<init>()
                androidx.recyclerview.widget.LinearLayoutManager.C7670.CREATOR = r0
                return
        }

        public C7670() {
                r0 = this;
                r0.<init>()
                return
        }

        public C7670(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.f29580 = r0
                int r0 = r2.readInt()
                r1.f29581 = r0
                int r2 = r2.readInt()
                r0 = 1
                if (r2 != r0) goto L17
                goto L18
            L17:
                r0 = 0
            L18:
                r1.f29582 = r0
                return
        }

        public C7670(androidx.recyclerview.widget.LinearLayoutManager.C7670 r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.f29580
                r1.f29580 = r0
                int r0 = r2.f29581
                r1.f29581 = r0
                boolean r2 = r2.f29582
                r1.f29582 = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.f29580
                r1.writeInt(r2)
                int r2 = r0.f29581
                r1.writeInt(r2)
                boolean r2 = r0.f29582
                r1.writeInt(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m29657() {
                r1 = this;
                int r0 = r1.f29580
                if (r0 < 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m29658() {
                r1 = this;
                r0 = -1
                r1.f29580 = r0
                return
        }
    }

    public LinearLayoutManager(android.content.Context r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public LinearLayoutManager(android.content.Context r2, int r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r2 = 1
            r1.mOrientation = r2
            r0 = 0
            r1.mReverseLayout = r0
            r1.mShouldReverseLayout = r0
            r1.mStackFromEnd = r0
            r1.mSmoothScrollbarEnabled = r2
            r2 = -1
            r1.mPendingScrollPosition = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mPendingScrollPositionOffset = r2
            r2 = 0
            r1.mPendingSavedState = r2
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r2 = new androidx.recyclerview.widget.LinearLayoutManager$ۥ
            r2.<init>()
            r1.mAnchorInfo = r2
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟ r2 = new androidx.recyclerview.widget.LinearLayoutManager$ۥ۟
            r2.<init>()
            r1.mLayoutChunkResult = r2
            r2 = 2
            r1.mInitialPrefetchItemCount = r2
            int[] r2 = new int[r2]
            r1.mReusableIntPair = r2
            r1.setOrientation(r3)
            r1.setReverseLayout(r4)
            return
    }

    public LinearLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mOrientation = r0
            r1 = 0
            r2.mReverseLayout = r1
            r2.mShouldReverseLayout = r1
            r2.mStackFromEnd = r1
            r2.mSmoothScrollbarEnabled = r0
            r0 = -1
            r2.mPendingScrollPosition = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mPendingScrollPositionOffset = r0
            r0 = 0
            r2.mPendingSavedState = r0
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r0 = new androidx.recyclerview.widget.LinearLayoutManager$ۥ
            r0.<init>()
            r2.mAnchorInfo = r0
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟ r0 = new androidx.recyclerview.widget.LinearLayoutManager$ۥ۟
            r0.<init>()
            r2.mLayoutChunkResult = r0
            r0 = 2
            r2.mInitialPrefetchItemCount = r0
            int[] r0 = new int[r0]
            r2.mReusableIntPair = r0
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟۟۟ r3 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.getProperties(r3, r4, r5, r6)
            int r4 = r3.f29611
            r2.setOrientation(r4)
            boolean r4 = r3.f29613
            r2.setReverseLayout(r4)
            boolean r3 = r3.f29614
            r2.setStackFromEnd(r3)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void assertNotInLayoutOrScroll(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = r1.mPendingSavedState
            if (r0 != 0) goto L7
            super.assertNotInLayoutOrScroll(r2)
        L7:
            return
    }

    public void calculateExtraLayoutSpace(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r4, @Yue.InterfaceC4410 int[] r5) {
            r3 = this;
            int r4 = r3.getExtraLayoutSpace(r4)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r3.mLayoutState
            int r0 = r0.f29572
            r1 = -1
            r2 = 0
            if (r0 != r1) goto Le
            r0 = r2
            goto L10
        Le:
            r0 = r4
            r4 = r2
        L10:
            r5[r2] = r4
            r4 = 1
            r5[r4] = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public boolean canScrollHorizontally() {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public boolean canScrollVertically() {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void collectAdjacentPrefetchPositions(int r2, int r3, androidx.recyclerview.widget.RecyclerView.C7713 r4, androidx.recyclerview.widget.RecyclerView.AbstractC7691.InterfaceC7694 r5) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L5
            goto L6
        L5:
            r2 = r3
        L6:
            int r3 = r1.getChildCount()
            if (r3 == 0) goto L24
            if (r2 != 0) goto Lf
            goto L24
        Lf:
            r1.ensureLayoutState()
            r3 = 1
            if (r2 <= 0) goto L17
            r0 = r3
            goto L18
        L17:
            r0 = -1
        L18:
            int r2 = java.lang.Math.abs(r2)
            r1.m29639(r0, r2, r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r2 = r1.mLayoutState
            r1.collectPrefetchPositionsForLayoutState(r4, r2, r5)
        L24:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void collectInitialPrefetchPositions(int r6, androidx.recyclerview.widget.RecyclerView.AbstractC7691.InterfaceC7694 r7) {
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = r5.mPendingSavedState
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L13
            boolean r0 = r0.m29657()
            if (r0 == 0) goto L13
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = r5.mPendingSavedState
            boolean r3 = r0.f29582
            int r0 = r0.f29580
            goto L22
        L13:
            r5.m29635()
            boolean r3 = r5.mShouldReverseLayout
            int r0 = r5.mPendingScrollPosition
            if (r0 != r1) goto L22
            if (r3 == 0) goto L21
            int r0 = r6 + (-1)
            goto L22
        L21:
            r0 = r2
        L22:
            if (r3 == 0) goto L25
            goto L26
        L25:
            r1 = 1
        L26:
            r3 = r2
        L27:
            int r4 = r5.mInitialPrefetchItemCount
            if (r3 >= r4) goto L36
            if (r0 < 0) goto L36
            if (r0 >= r6) goto L36
            r7.mo29770(r0, r2)
            int r0 = r0 + r1
            int r3 = r3 + 1
            goto L27
        L36:
            return
    }

    public void collectPrefetchPositionsForLayoutState(androidx.recyclerview.widget.RecyclerView.C7713 r2, androidx.recyclerview.widget.LinearLayoutManager.C7669 r3, androidx.recyclerview.widget.RecyclerView.AbstractC7691.InterfaceC7694 r4) {
            r1 = this;
            int r0 = r3.f29570
            if (r0 < 0) goto L14
            int r2 = r2.m29858()
            if (r0 >= r2) goto L14
            r2 = 0
            int r3 = r3.f29573
            int r2 = java.lang.Math.max(r2, r3)
            r4.mo29770(r0, r2)
        L14:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.RecyclerView.C7713 r1) {
            r0 = this;
            int r1 = r0.m29616(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.C7713 r1) {
            r0 = this;
            int r1 = r0.m29617(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.C7713 r1) {
            r0 = this;
            int r1 = r0.m29618(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712
    public android.graphics.PointF computeScrollVectorForPosition(int r4) {
            r3 = this;
            int r0 = r3.getChildCount()
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            r0 = 0
            android.view.View r1 = r3.getChildAt(r0)
            int r1 = r3.getPosition(r1)
            r2 = 1
            if (r4 >= r1) goto L15
            r0 = r2
        L15:
            boolean r4 = r3.mShouldReverseLayout
            if (r0 == r4) goto L1a
            r2 = -1
        L1a:
            int r4 = r3.mOrientation
            r0 = 0
            if (r4 != 0) goto L26
            android.graphics.PointF r4 = new android.graphics.PointF
            float r1 = (float) r2
            r4.<init>(r1, r0)
            return r4
        L26:
            android.graphics.PointF r4 = new android.graphics.PointF
            float r1 = (float) r2
            r4.<init>(r0, r1)
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.RecyclerView.C7713 r1) {
            r0 = this;
            int r1 = r0.m29616(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.C7713 r1) {
            r0 = this;
            int r1 = r0.m29617(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.C7713 r1) {
            r0 = this;
            int r1 = r0.m29618(r1)
            return r1
    }

    public int convertFocusDirectionToLayoutDirection(int r5) {
            r4 = this;
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L43
            r2 = 2
            if (r5 == r2) goto L36
            r2 = 17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L2f
            r2 = 33
            if (r5 == r2) goto L28
            r0 = 66
            if (r5 == r0) goto L21
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L1a
            return r3
        L1a:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L1f
            goto L20
        L1f:
            r1 = r3
        L20:
            return r1
        L21:
            int r5 = r4.mOrientation
            if (r5 != 0) goto L26
            goto L27
        L26:
            r1 = r3
        L27:
            return r1
        L28:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L2d
            goto L2e
        L2d:
            r0 = r3
        L2e:
            return r0
        L2f:
            int r5 = r4.mOrientation
            if (r5 != 0) goto L34
            goto L35
        L34:
            r0 = r3
        L35:
            return r0
        L36:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L3b
            return r1
        L3b:
            boolean r5 = r4.isLayoutRTL()
            if (r5 == 0) goto L42
            return r0
        L42:
            return r1
        L43:
            int r5 = r4.mOrientation
            if (r5 != r1) goto L48
            return r0
        L48:
            boolean r5 = r4.isLayoutRTL()
            if (r5 == 0) goto L4f
            return r1
        L4f:
            return r0
    }

    public androidx.recyclerview.widget.LinearLayoutManager.C7669 createLayoutState() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = new androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟
            r0.<init>()
            return r0
    }

    public void ensureLayoutState() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r1.mLayoutState
            if (r0 != 0) goto La
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r1.createLayoutState()
            r1.mLayoutState = r0
        La:
            return
    }

    public int fill(androidx.recyclerview.widget.RecyclerView.C7704 r8, androidx.recyclerview.widget.LinearLayoutManager.C7669 r9, androidx.recyclerview.widget.RecyclerView.C7713 r10, boolean r11) {
            r7 = this;
            int r0 = r9.f29569
            int r1 = r9.f29573
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L10
            if (r0 >= 0) goto Ld
            int r1 = r1 + r0
            r9.f29573 = r1
        Ld:
            r7.m29631(r8, r9)
        L10:
            int r1 = r9.f29569
            int r3 = r9.f29574
            int r1 = r1 + r3
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟ r3 = r7.mLayoutChunkResult
        L17:
            boolean r4 = r9.f29579
            if (r4 != 0) goto L1d
            if (r1 <= 0) goto L67
        L1d:
            boolean r4 = r9.m29652(r10)
            if (r4 == 0) goto L67
            r3.m29649()
            r7.layoutChunk(r8, r10, r9, r3)
            boolean r4 = r3.f29557
            if (r4 == 0) goto L2e
            goto L67
        L2e:
            int r4 = r9.f29568
            int r5 = r3.f29556
            int r6 = r9.f29572
            int r5 = r5 * r6
            int r4 = r4 + r5
            r9.f29568 = r4
            boolean r4 = r3.f29558
            if (r4 == 0) goto L46
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r4 = r9.f29578
            if (r4 != 0) goto L46
            boolean r4 = r10.m29864()
            if (r4 != 0) goto L4e
        L46:
            int r4 = r9.f29569
            int r5 = r3.f29556
            int r4 = r4 - r5
            r9.f29569 = r4
            int r1 = r1 - r5
        L4e:
            int r4 = r9.f29573
            if (r4 == r2) goto L61
            int r5 = r3.f29556
            int r4 = r4 + r5
            r9.f29573 = r4
            int r5 = r9.f29569
            if (r5 >= 0) goto L5e
            int r4 = r4 + r5
            r9.f29573 = r4
        L5e:
            r7.m29631(r8, r9)
        L61:
            if (r11 == 0) goto L17
            boolean r4 = r3.f29559
            if (r4 == 0) goto L17
        L67:
            int r8 = r9.f29569
            int r0 = r0 - r8
            return r0
    }

    public int findFirstCompletelyVisibleItemPosition() {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 1
            r2 = 0
            android.view.View r0 = r3.findOneVisibleChild(r2, r0, r1, r2)
            if (r0 != 0) goto Le
            r0 = -1
            goto L12
        Le:
            int r0 = r3.getPosition(r0)
        L12:
            return r0
    }

    public android.view.View findFirstVisibleChildClosestToEnd(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.mShouldReverseLayout
            if (r0 == 0) goto Le
            r0 = 0
            int r1 = r2.getChildCount()
            android.view.View r3 = r2.findOneVisibleChild(r0, r1, r3, r4)
            return r3
        Le:
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r3 = r2.findOneVisibleChild(r0, r1, r3, r4)
            return r3
    }

    public android.view.View findFirstVisibleChildClosestToStart(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.mShouldReverseLayout
            if (r0 == 0) goto L10
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r3 = r2.findOneVisibleChild(r0, r1, r3, r4)
            return r3
        L10:
            r0 = 0
            int r1 = r2.getChildCount()
            android.view.View r3 = r2.findOneVisibleChild(r0, r1, r3, r4)
            return r3
    }

    public int findFirstVisibleItemPosition() {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 1
            r2 = 0
            android.view.View r0 = r3.findOneVisibleChild(r2, r0, r2, r1)
            if (r0 != 0) goto Le
            r0 = -1
            goto L12
        Le:
            int r0 = r3.getPosition(r0)
        L12:
            return r0
    }

    public int findLastCompletelyVisibleItemPosition() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = -1
            android.view.View r0 = r4.findOneVisibleChild(r0, r3, r1, r2)
            if (r0 != 0) goto Lf
            goto L13
        Lf:
            int r3 = r4.getPosition(r0)
        L13:
            return r3
    }

    public int findLastVisibleItemPosition() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = -1
            android.view.View r0 = r4.findOneVisibleChild(r0, r3, r2, r1)
            if (r0 != 0) goto Lf
            goto L13
        Lf:
            int r3 = r4.getPosition(r0)
        L13:
            return r3
    }

    public android.view.View findOnePartiallyOrCompletelyInvisibleChild(int r4, int r5) {
            r3 = this;
            r3.ensureLayoutState()
            if (r5 <= r4) goto L6
            goto L8
        L6:
            if (r5 >= r4) goto L35
        L8:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r3.mOrientationHelper
            android.view.View r1 = r3.getChildAt(r4)
            int r0 = r0.mo30245(r1)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r3.mOrientationHelper
            int r1 = r1.mo30252()
            if (r0 >= r1) goto L1f
            r0 = 16644(0x4104, float:2.3323E-41)
            r1 = 16388(0x4004, float:2.2964E-41)
            goto L23
        L1f:
            r0 = 4161(0x1041, float:5.831E-42)
            r1 = 4097(0x1001, float:5.741E-42)
        L23:
            int r2 = r3.mOrientation
            if (r2 != 0) goto L2e
            androidx.recyclerview.widget.ۥ۟۟۠ۨ r2 = r3.mHorizontalBoundCheck
            android.view.View r4 = r2.m30328(r4, r5, r0, r1)
            goto L34
        L2e:
            androidx.recyclerview.widget.ۥ۟۟۠ۨ r2 = r3.mVerticalBoundCheck
            android.view.View r4 = r2.m30328(r4, r5, r0, r1)
        L34:
            return r4
        L35:
            android.view.View r4 = r3.getChildAt(r4)
            return r4
    }

    public android.view.View findOneVisibleChild(int r2, int r3, boolean r4, boolean r5) {
            r1 = this;
            r1.ensureLayoutState()
            r0 = 320(0x140, float:4.48E-43)
            if (r4 == 0) goto La
            r4 = 24579(0x6003, float:3.4443E-41)
            goto Lb
        La:
            r4 = r0
        Lb:
            if (r5 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            int r5 = r1.mOrientation
            if (r5 != 0) goto L1a
            androidx.recyclerview.widget.ۥ۟۟۠ۨ r5 = r1.mHorizontalBoundCheck
            android.view.View r2 = r5.m30328(r2, r3, r4, r0)
            goto L20
        L1a:
            androidx.recyclerview.widget.ۥ۟۟۠ۨ r5 = r1.mVerticalBoundCheck
            android.view.View r2 = r5.m30328(r2, r3, r4, r0)
        L20:
            return r2
    }

    public android.view.View findReferenceChild(androidx.recyclerview.widget.RecyclerView.C7704 r6, androidx.recyclerview.widget.RecyclerView.C7713 r7, int r8, int r9, int r10) {
            r5 = this;
            r5.ensureLayoutState()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r5.mOrientationHelper
            int r6 = r6.mo30252()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r7 = r5.mOrientationHelper
            int r7 = r7.mo30247()
            if (r9 <= r8) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = -1
        L14:
            r1 = 0
            r2 = r1
        L16:
            if (r8 == r9) goto L4b
            android.view.View r3 = r5.getChildAt(r8)
            int r4 = r5.getPosition(r3)
            if (r4 < 0) goto L49
            if (r4 >= r10) goto L49
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r4 = (androidx.recyclerview.widget.RecyclerView.C7696) r4
            boolean r4 = r4.m29775()
            if (r4 == 0) goto L34
            if (r2 != 0) goto L49
            r2 = r3
            goto L49
        L34:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r5.mOrientationHelper
            int r4 = r4.mo30245(r3)
            if (r4 >= r7) goto L46
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r5.mOrientationHelper
            int r4 = r4.mo30242(r3)
            if (r4 >= r6) goto L45
            goto L46
        L45:
            return r3
        L46:
            if (r1 != 0) goto L49
            r1 = r3
        L49:
            int r8 = r8 + r0
            goto L16
        L4b:
            if (r1 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r2
        L4f:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public android.view.View findViewByPosition(int r3) {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r1 = 0
            android.view.View r1 = r2.getChildAt(r1)
            int r1 = r2.getPosition(r1)
            int r1 = r3 - r1
            if (r1 < 0) goto L22
            if (r1 >= r0) goto L22
            android.view.View r0 = r2.getChildAt(r1)
            int r1 = r2.getPosition(r0)
            if (r1 != r3) goto L22
            return r0
        L22:
            android.view.View r3 = super.findViewByPosition(r3)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public androidx.recyclerview.widget.RecyclerView.C7696 generateDefaultLayoutParams() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    public final android.view.View getChildClosestToEnd() {
            r1 = this;
            boolean r0 = r1.mShouldReverseLayout
            if (r0 == 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r0 = r1.getChildCount()
            int r0 = r0 + (-1)
        Lc:
            android.view.View r0 = r1.getChildAt(r0)
            return r0
    }

    public final android.view.View getChildClosestToStart() {
            r1 = this;
            boolean r0 = r1.mShouldReverseLayout
            if (r0 == 0) goto Lb
            int r0 = r1.getChildCount()
            int r0 = r0 + (-1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r0 = r1.getChildAt(r0)
            return r0
    }

    @java.lang.Deprecated
    public int getExtraLayoutSpace(androidx.recyclerview.widget.RecyclerView.C7713 r1) {
            r0 = this;
            boolean r1 = r1.m29862()
            if (r1 == 0) goto Ld
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r0.mOrientationHelper
            int r1 = r1.mo30253()
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public int getInitialPrefetchItemCount() {
            r1 = this;
            int r0 = r1.mInitialPrefetchItemCount
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public boolean getRecycleChildrenOnDetach() {
            r1 = this;
            boolean r0 = r1.mRecycleChildrenOnDetach
            return r0
    }

    public boolean getReverseLayout() {
            r1 = this;
            boolean r0 = r1.mReverseLayout
            return r0
    }

    public boolean getStackFromEnd() {
            r1 = this;
            boolean r0 = r1.mStackFromEnd
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public boolean isAutoMeasureEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isLayoutRTL() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean isSmoothScrollbarEnabled() {
            r1 = this;
            boolean r0 = r1.mSmoothScrollbarEnabled
            return r0
    }

    public void layoutChunk(androidx.recyclerview.widget.RecyclerView.C7704 r8, androidx.recyclerview.widget.RecyclerView.C7713 r9, androidx.recyclerview.widget.LinearLayoutManager.C7669 r10, androidx.recyclerview.widget.LinearLayoutManager.C7668 r11) {
            r7 = this;
            android.view.View r8 = r10.m29654(r8)
            r9 = 1
            if (r8 != 0) goto La
            r11.f29557 = r9
            return
        La:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r6 = r0
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r6 = (androidx.recyclerview.widget.RecyclerView.C7696) r6
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r10.f29578
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L2a
            boolean r0 = r7.mShouldReverseLayout
            int r3 = r10.f29572
            if (r3 != r1) goto L1f
            r3 = r9
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r0 != r3) goto L26
            r7.addView(r8)
            goto L3c
        L26:
            r7.addView(r8, r2)
            goto L3c
        L2a:
            boolean r0 = r7.mShouldReverseLayout
            int r3 = r10.f29572
            if (r3 != r1) goto L32
            r3 = r9
            goto L33
        L32:
            r3 = r2
        L33:
            if (r0 != r3) goto L39
            r7.addDisappearingView(r8)
            goto L3c
        L39:
            r7.addDisappearingView(r8, r2)
        L3c:
            r7.measureChildWithMargins(r8, r2, r2)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r7.mOrientationHelper
            int r0 = r0.mo30243(r8)
            r11.f29556 = r0
            int r0 = r7.mOrientation
            if (r0 != r9) goto L85
            boolean r0 = r7.isLayoutRTL()
            if (r0 == 0) goto L63
            int r0 = r7.getWidth()
            int r2 = r7.getPaddingRight()
            int r0 = r0 - r2
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r7.mOrientationHelper
            int r2 = r2.mo30244(r8)
            int r2 = r0 - r2
            goto L6e
        L63:
            int r2 = r7.getPaddingLeft()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r7.mOrientationHelper
            int r0 = r0.mo30244(r8)
            int r0 = r0 + r2
        L6e:
            int r3 = r10.f29572
            if (r3 != r1) goto L7c
            int r10 = r10.f29568
            int r1 = r11.f29556
            int r1 = r10 - r1
            r5 = r10
            r4 = r0
            r3 = r1
            goto La8
        L7c:
            int r10 = r10.f29568
            int r1 = r11.f29556
            int r1 = r1 + r10
            r3 = r10
            r4 = r0
            r5 = r1
            goto La8
        L85:
            int r0 = r7.getPaddingTop()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r7.mOrientationHelper
            int r2 = r2.mo30244(r8)
            int r2 = r2 + r0
            int r3 = r10.f29572
            if (r3 != r1) goto L9f
            int r10 = r10.f29568
            int r1 = r11.f29556
            int r1 = r10 - r1
            r4 = r10
            r3 = r0
            r5 = r2
            r2 = r1
            goto La8
        L9f:
            int r10 = r10.f29568
            int r1 = r11.f29556
            int r1 = r1 + r10
            r3 = r0
            r4 = r1
            r5 = r2
            r2 = r10
        La8:
            r0 = r7
            r1 = r8
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            boolean r10 = r6.m29775()
            if (r10 != 0) goto Lb9
            boolean r10 = r6.m29774()
            if (r10 == 0) goto Lbb
        Lb9:
            r11.f29558 = r9
        Lbb:
            boolean r8 = r8.hasFocusable()
            r11.f29559 = r8
            return
    }

    public void onAnchorReady(androidx.recyclerview.widget.RecyclerView.C7704 r1, androidx.recyclerview.widget.RecyclerView.C7713 r2, androidx.recyclerview.widget.LinearLayoutManager.C7667 r3, int r4) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.C7704 r2) {
            r0 = this;
            super.onDetachedFromWindow(r1, r2)
            boolean r1 = r0.mRecycleChildrenOnDetach
            if (r1 == 0) goto Ld
            r0.removeAndRecycleAllViews(r2)
            r2.m29799()
        Ld:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public android.view.View onFocusSearchFailed(android.view.View r4, int r5, androidx.recyclerview.widget.RecyclerView.C7704 r6, androidx.recyclerview.widget.RecyclerView.C7713 r7) {
            r3 = this;
            r3.m29635()
            int r4 = r3.getChildCount()
            r0 = 0
            if (r4 != 0) goto Lb
            return r0
        Lb:
            int r4 = r3.convertFocusDirectionToLayoutDirection(r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r5) goto L14
            return r0
        L14:
            r3.ensureLayoutState()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r3.mOrientationHelper
            int r1 = r1.mo30253()
            float r1 = (float) r1
            r2 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r2
            int r1 = (int) r1
            r2 = 0
            r3.m29639(r4, r1, r2, r7)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r3.mLayoutState
            r1.f29573 = r5
            r1.f29567 = r2
            r5 = 1
            r3.fill(r6, r1, r7, r5)
            r5 = -1
            if (r4 != r5) goto L39
            android.view.View r6 = r3.m29624()
            goto L3d
        L39:
            android.view.View r6 = r3.m29623()
        L3d:
            if (r4 != r5) goto L44
            android.view.View r4 = r3.getChildClosestToStart()
            goto L48
        L44:
            android.view.View r4 = r3.getChildClosestToEnd()
        L48:
            boolean r5 = r4.hasFocusable()
            if (r5 == 0) goto L52
            if (r6 != 0) goto L51
            return r0
        L51:
            return r4
        L52:
            return r6
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L17
            int r0 = r1.findFirstVisibleItemPosition()
            r2.setFromIndex(r0)
            int r0 = r1.findLastVisibleItemPosition()
            r2.setToIndex(r0)
        L17:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.C7704 r9, androidx.recyclerview.widget.RecyclerView.C7713 r10) {
            r8 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = r8.mPendingSavedState
            r1 = -1
            if (r0 != 0) goto L9
            int r0 = r8.mPendingScrollPosition
            if (r0 == r1) goto L13
        L9:
            int r0 = r10.m29858()
            if (r0 != 0) goto L13
            r8.removeAndRecycleAllViews(r9)
            return
        L13:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = r8.mPendingSavedState
            if (r0 == 0) goto L23
            boolean r0 = r0.m29657()
            if (r0 == 0) goto L23
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = r8.mPendingSavedState
            int r0 = r0.f29580
            r8.mPendingScrollPosition = r0
        L23:
            r8.ensureLayoutState()
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r8.mLayoutState
            r2 = 0
            r0.f29567 = r2
            r8.m29635()
            android.view.View r0 = r8.getFocusedChild()
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r3 = r8.mAnchorInfo
            boolean r4 = r3.f29555
            r5 = 1
            if (r4 == 0) goto L6a
            int r4 = r8.mPendingScrollPosition
            if (r4 != r1) goto L6a
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r4 = r8.mPendingSavedState
            if (r4 == 0) goto L42
            goto L6a
        L42:
            if (r0 == 0) goto L7d
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r8.mOrientationHelper
            int r3 = r3.mo30245(r0)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r8.mOrientationHelper
            int r4 = r4.mo30247()
            if (r3 >= r4) goto L60
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r8.mOrientationHelper
            int r3 = r3.mo30242(r0)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r8.mOrientationHelper
            int r4 = r4.mo30252()
            if (r3 > r4) goto L7d
        L60:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r3 = r8.mAnchorInfo
            int r4 = r8.getPosition(r0)
            r3.m29646(r0, r4)
            goto L7d
        L6a:
            r3.m29648()
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r0 = r8.mAnchorInfo
            boolean r3 = r8.mShouldReverseLayout
            boolean r4 = r8.mStackFromEnd
            r3 = r3 ^ r4
            r0.f29554 = r3
            r8.m29638(r9, r10, r0)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r0 = r8.mAnchorInfo
            r0.f29555 = r5
        L7d:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r8.mLayoutState
            int r3 = r0.f29577
            if (r3 < 0) goto L85
            r3 = r5
            goto L86
        L85:
            r3 = r1
        L86:
            r0.f29572 = r3
            int[] r0 = r8.mReusableIntPair
            r0[r2] = r2
            r0[r5] = r2
            r8.calculateExtraLayoutSpace(r10, r0)
            int[] r0 = r8.mReusableIntPair
            r0 = r0[r2]
            int r0 = java.lang.Math.max(r2, r0)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r8.mOrientationHelper
            int r3 = r3.mo30252()
            int r0 = r0 + r3
            int[] r3 = r8.mReusableIntPair
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r2, r3)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r8.mOrientationHelper
            int r4 = r4.mo30248()
            int r3 = r3 + r4
            boolean r4 = r10.m29864()
            if (r4 == 0) goto Lef
            int r4 = r8.mPendingScrollPosition
            if (r4 == r1) goto Lef
            int r6 = r8.mPendingScrollPositionOffset
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r7) goto Lef
            android.view.View r4 = r8.findViewByPosition(r4)
            if (r4 == 0) goto Lef
            boolean r6 = r8.mShouldReverseLayout
            if (r6 == 0) goto Lda
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r8.mOrientationHelper
            int r6 = r6.mo30247()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r7 = r8.mOrientationHelper
            int r4 = r7.mo30242(r4)
            int r6 = r6 - r4
            int r4 = r8.mPendingScrollPositionOffset
        Ld8:
            int r6 = r6 - r4
            goto Lea
        Lda:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r8.mOrientationHelper
            int r4 = r6.mo30245(r4)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r8.mOrientationHelper
            int r6 = r6.mo30252()
            int r4 = r4 - r6
            int r6 = r8.mPendingScrollPositionOffset
            goto Ld8
        Lea:
            if (r6 <= 0) goto Lee
            int r0 = r0 + r6
            goto Lef
        Lee:
            int r3 = r3 - r6
        Lef:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r4 = r8.mAnchorInfo
            boolean r6 = r4.f29554
            if (r6 == 0) goto Lfb
            boolean r6 = r8.mShouldReverseLayout
            if (r6 == 0) goto Lff
        Lf9:
            r1 = r5
            goto Lff
        Lfb:
            boolean r6 = r8.mShouldReverseLayout
            if (r6 == 0) goto Lf9
        Lff:
            r8.onAnchorReady(r9, r10, r4, r1)
            r8.detachAndScrapAttachedViews(r9)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r8.mLayoutState
            boolean r4 = r8.resolveIsInfinite()
            r1.f29579 = r4
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r8.mLayoutState
            boolean r4 = r10.m29864()
            r1.f29576 = r4
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r8.mLayoutState
            r1.f29575 = r2
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r1 = r8.mAnchorInfo
            boolean r4 = r1.f29554
            if (r4 == 0) goto L15e
            r8.m29643(r1)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r8.mLayoutState
            r1.f29574 = r0
            r8.fill(r9, r1, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r8.mLayoutState
            int r1 = r0.f29568
            int r4 = r0.f29570
            int r0 = r0.f29569
            if (r0 <= 0) goto L134
            int r3 = r3 + r0
        L134:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r0 = r8.mAnchorInfo
            r8.m29641(r0)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r8.mLayoutState
            r0.f29574 = r3
            int r3 = r0.f29570
            int r6 = r0.f29571
            int r3 = r3 + r6
            r0.f29570 = r3
            r8.fill(r9, r0, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r8.mLayoutState
            int r3 = r0.f29568
            int r0 = r0.f29569
            if (r0 <= 0) goto L19c
            r8.m29642(r4, r1)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r8.mLayoutState
            r1.f29574 = r0
            r8.fill(r9, r1, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r8.mLayoutState
            int r1 = r0.f29568
            goto L19c
        L15e:
            r8.m29641(r1)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r8.mLayoutState
            r1.f29574 = r3
            r8.fill(r9, r1, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r8.mLayoutState
            int r3 = r1.f29568
            int r4 = r1.f29570
            int r1 = r1.f29569
            if (r1 <= 0) goto L173
            int r0 = r0 + r1
        L173:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r1 = r8.mAnchorInfo
            r8.m29643(r1)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r8.mLayoutState
            r1.f29574 = r0
            int r0 = r1.f29570
            int r6 = r1.f29571
            int r0 = r0 + r6
            r1.f29570 = r0
            r8.fill(r9, r1, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r8.mLayoutState
            int r1 = r0.f29568
            int r0 = r0.f29569
            if (r0 <= 0) goto L19c
            r8.m29640(r4, r3)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r3 = r8.mLayoutState
            r3.f29574 = r0
            r8.fill(r9, r3, r10, r2)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r8.mLayoutState
            int r3 = r0.f29568
        L19c:
            int r0 = r8.getChildCount()
            if (r0 <= 0) goto L1c1
            boolean r0 = r8.mShouldReverseLayout
            boolean r4 = r8.mStackFromEnd
            r0 = r0 ^ r4
            if (r0 == 0) goto L1b6
            int r0 = r8.m29627(r3, r9, r10, r5)
            int r1 = r1 + r0
            int r3 = r3 + r0
            int r0 = r8.m29628(r1, r9, r10, r2)
        L1b3:
            int r1 = r1 + r0
            int r3 = r3 + r0
            goto L1c1
        L1b6:
            int r0 = r8.m29628(r1, r9, r10, r5)
            int r1 = r1 + r0
            int r3 = r3 + r0
            int r0 = r8.m29627(r3, r9, r10, r2)
            goto L1b3
        L1c1:
            r8.m29629(r9, r10, r1, r3)
            boolean r9 = r10.m29864()
            if (r9 != 0) goto L1d0
            androidx.recyclerview.widget.ۥ۟۟۠۠ r9 = r8.mOrientationHelper
            r9.m30259()
            goto L1d5
        L1d0:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r9 = r8.mAnchorInfo
            r9.m29648()
        L1d5:
            boolean r9 = r8.mStackFromEnd
            r8.mLastStackFromEnd = r9
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.C7713 r1) {
            r0 = this;
            super.onLayoutCompleted(r1)
            r1 = 0
            r0.mPendingSavedState = r1
            r1 = -1
            r0.mPendingScrollPosition = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.mPendingScrollPositionOffset = r1
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r1 = r0.mAnchorInfo
            r1.m29648()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager.C7670
            if (r0 == 0) goto Lb
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r2 = (androidx.recyclerview.widget.LinearLayoutManager.C7670) r2
            r1.mPendingSavedState = r2
            r1.requestLayout()
        Lb:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public android.os.Parcelable onSaveInstanceState() {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = r4.mPendingSavedState
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = new androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r1 = r4.mPendingSavedState
            r0.<init>(r1)
            return r0
        Lc:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = new androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟
            r0.<init>()
            int r1 = r4.getChildCount()
            if (r1 <= 0) goto L57
            r4.ensureLayoutState()
            boolean r1 = r4.mLastStackFromEnd
            boolean r2 = r4.mShouldReverseLayout
            r1 = r1 ^ r2
            r0.f29582 = r1
            if (r1 == 0) goto L3d
            android.view.View r1 = r4.getChildClosestToEnd()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.mOrientationHelper
            int r2 = r2.mo30247()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.mOrientationHelper
            int r3 = r3.mo30242(r1)
            int r2 = r2 - r3
            r0.f29581 = r2
            int r1 = r4.getPosition(r1)
            r0.f29580 = r1
            goto L5a
        L3d:
            android.view.View r1 = r4.getChildClosestToStart()
            int r2 = r4.getPosition(r1)
            r0.f29580 = r2
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.mOrientationHelper
            int r1 = r2.mo30245(r1)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.mOrientationHelper
            int r2 = r2.mo30252()
            int r1 = r1 - r2
            r0.f29581 = r1
            goto L5a
        L57:
            r0.m29658()
        L5a:
            return r0
    }

    @Override // androidx.recyclerview.widget.C7770.InterfaceC7783
    public void prepareForDrop(@Yue.InterfaceC4410 android.view.View r4, @Yue.InterfaceC4410 android.view.View r5, int r6, int r7) {
            r3 = this;
            java.lang.String r6 = "Cannot drop a view during a scroll or layout calculation"
            r3.assertNotInLayoutOrScroll(r6)
            r3.ensureLayoutState()
            r3.m29635()
            int r6 = r3.getPosition(r4)
            int r7 = r3.getPosition(r5)
            r0 = -1
            r1 = 1
            if (r6 >= r7) goto L19
            r6 = r1
            goto L1a
        L19:
            r6 = r0
        L1a:
            boolean r2 = r3.mShouldReverseLayout
            if (r2 == 0) goto L49
            if (r6 != r1) goto L38
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r3.mOrientationHelper
            int r6 = r6.mo30247()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r3.mOrientationHelper
            int r5 = r0.mo30245(r5)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r3.mOrientationHelper
            int r4 = r0.mo30243(r4)
            int r5 = r5 + r4
            int r6 = r6 - r5
            r3.scrollToPositionWithOffset(r7, r6)
            goto L65
        L38:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r3.mOrientationHelper
            int r4 = r4.mo30247()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r3.mOrientationHelper
            int r5 = r6.mo30242(r5)
            int r4 = r4 - r5
            r3.scrollToPositionWithOffset(r7, r4)
            goto L65
        L49:
            if (r6 != r0) goto L55
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r3.mOrientationHelper
            int r4 = r4.mo30245(r5)
            r3.scrollToPositionWithOffset(r7, r4)
            goto L65
        L55:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r3.mOrientationHelper
            int r5 = r6.mo30242(r5)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r3.mOrientationHelper
            int r4 = r6.mo30243(r4)
            int r5 = r5 - r4
            r3.scrollToPositionWithOffset(r7, r5)
        L65:
            return
    }

    public boolean resolveIsInfinite() {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.mOrientationHelper
            int r0 = r0.mo30250()
            if (r0 != 0) goto L12
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.mOrientationHelper
            int r0 = r0.mo30246()
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public int scrollBy(int r6, androidx.recyclerview.widget.RecyclerView.C7704 r7, androidx.recyclerview.widget.RecyclerView.C7713 r8) {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
            if (r0 == 0) goto L39
            if (r6 != 0) goto La
            goto L39
        La:
            r5.ensureLayoutState()
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r5.mLayoutState
            r2 = 1
            r0.f29567 = r2
            if (r6 <= 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = -1
        L17:
            int r3 = java.lang.Math.abs(r6)
            r5.m29639(r0, r3, r2, r8)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r2 = r5.mLayoutState
            int r4 = r2.f29573
            int r7 = r5.fill(r7, r2, r8, r1)
            int r4 = r4 + r7
            if (r4 >= 0) goto L2a
            return r1
        L2a:
            if (r3 <= r4) goto L2e
            int r6 = r0 * r4
        L2e:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r7 = r5.mOrientationHelper
            int r8 = -r6
            r7.mo30258(r8)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r7 = r5.mLayoutState
            r7.f29577 = r6
            return r6
        L39:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int scrollHorizontallyBy(int r3, androidx.recyclerview.widget.RecyclerView.C7704 r4, androidx.recyclerview.widget.RecyclerView.C7713 r5) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L7
            r3 = 0
            return r3
        L7:
            int r3 = r2.scrollBy(r3, r4, r5)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void scrollToPosition(int r1) {
            r0 = this;
            r0.mPendingScrollPosition = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.mPendingScrollPositionOffset = r1
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r1 = r0.mPendingSavedState
            if (r1 == 0) goto Ld
            r1.m29658()
        Ld:
            r0.requestLayout()
            return
    }

    public void scrollToPositionWithOffset(int r1, int r2) {
            r0 = this;
            r0.mPendingScrollPosition = r1
            r0.mPendingScrollPositionOffset = r2
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r1 = r0.mPendingSavedState
            if (r1 == 0) goto Lb
            r1.m29658()
        Lb:
            r0.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public int scrollVerticallyBy(int r2, androidx.recyclerview.widget.RecyclerView.C7704 r3, androidx.recyclerview.widget.RecyclerView.C7713 r4) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r1.scrollBy(r2, r3, r4)
            return r2
    }

    public void setInitialPrefetchItemCount(int r1) {
            r0 = this;
            r0.mInitialPrefetchItemCount = r1
            return
    }

    public void setOrientation(int r4) {
            r3 = this;
            if (r4 == 0) goto L1d
            r0 = 1
            if (r4 != r0) goto L6
            goto L1d
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid orientation:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L1d:
            r0 = 0
            r3.assertNotInLayoutOrScroll(r0)
            int r0 = r3.mOrientation
            if (r4 != r0) goto L29
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r3.mOrientationHelper
            if (r0 != 0) goto L38
        L29:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = androidx.recyclerview.widget.AbstractC7791.m30240(r3, r4)
            r3.mOrientationHelper = r0
            androidx.recyclerview.widget.LinearLayoutManager$ۥ r1 = r3.mAnchorInfo
            r1.f29551 = r0
            r3.mOrientation = r4
            r3.requestLayout()
        L38:
            return
    }

    public void setRecycleChildrenOnDetach(boolean r1) {
            r0 = this;
            r0.mRecycleChildrenOnDetach = r1
            return
    }

    public void setReverseLayout(boolean r2) {
            r1 = this;
            r0 = 0
            r1.assertNotInLayoutOrScroll(r0)
            boolean r0 = r1.mReverseLayout
            if (r2 != r0) goto L9
            return
        L9:
            r1.mReverseLayout = r2
            r1.requestLayout()
            return
    }

    public void setSmoothScrollbarEnabled(boolean r1) {
            r0 = this;
            r0.mSmoothScrollbarEnabled = r1
            return
    }

    public void setStackFromEnd(boolean r2) {
            r1 = this;
            r0 = 0
            r1.assertNotInLayoutOrScroll(r0)
            boolean r0 = r1.mStackFromEnd
            if (r0 != r2) goto L9
            return
        L9:
            r1.mStackFromEnd = r2
            r1.requestLayout()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public boolean shouldMeasureTwice() {
            r2 = this;
            int r0 = r2.getHeightMode()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L16
            int r0 = r2.getWidthMode()
            if (r0 == r1) goto L16
            boolean r0 = r2.hasFlexibleChildInBothOrientations()
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.C7713 r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.ۥ۟۟۟ۧ r2 = new androidx.recyclerview.widget.ۥ۟۟۟ۧ
            android.content.Context r1 = r1.getContext()
            r2.<init>(r1)
            r2.setTargetPosition(r3)
            r0.startSmoothScroll(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
    public boolean supportsPredictiveItemAnimations() {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r0 = r2.mPendingSavedState
            if (r0 != 0) goto Lc
            boolean r0 = r2.mLastStackFromEnd
            boolean r1 = r2.mStackFromEnd
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void validateChildOrder() {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "validating child count "
            r0.append(r1)
            int r1 = r10.getChildCount()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LinearLayoutManager"
            android.util.Log.d(r1, r0)
            int r0 = r10.getChildCount()
            r1 = 1
            if (r0 >= r1) goto L22
            return
        L22:
            r0 = 0
            android.view.View r2 = r10.getChildAt(r0)
            int r2 = r10.getPosition(r2)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r10.mOrientationHelper
            android.view.View r4 = r10.getChildAt(r0)
            int r3 = r3.mo30245(r4)
            boolean r4 = r10.mShouldReverseLayout
            java.lang.String r5 = "detected invalid location"
            java.lang.String r6 = "detected invalid position. loc invalid? "
            if (r4 == 0) goto L7e
            r4 = r1
        L3e:
            int r7 = r10.getChildCount()
            if (r4 >= r7) goto Lbf
            android.view.View r7 = r10.getChildAt(r4)
            int r8 = r10.getPosition(r7)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r9 = r10.mOrientationHelper
            int r7 = r9.mo30245(r7)
            if (r8 >= r2) goto L70
            r10.m29630()
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            if (r7 >= r3) goto L64
            goto L65
        L64:
            r1 = r0
        L65:
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        L70:
            if (r7 > r3) goto L75
            int r4 = r4 + 1
            goto L3e
        L75:
            r10.m29630()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        L7e:
            r4 = r1
        L7f:
            int r7 = r10.getChildCount()
            if (r4 >= r7) goto Lbf
            android.view.View r7 = r10.getChildAt(r4)
            int r8 = r10.getPosition(r7)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r9 = r10.mOrientationHelper
            int r7 = r9.mo30245(r7)
            if (r8 >= r2) goto Lb1
            r10.m29630()
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            if (r7 >= r3) goto La5
            goto La6
        La5:
            r1 = r0
        La6:
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        Lb1:
            if (r7 < r3) goto Lb6
            int r4 = r4 + 1
            goto L7f
        Lb6:
            r10.m29630()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        Lbf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m29616(androidx.recyclerview.widget.RecyclerView.C7713 r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r6.ensureLayoutState()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r6.mOrientationHelper
            boolean r0 = r6.mSmoothScrollbarEnabled
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r3 = r6.findFirstVisibleChildClosestToStart(r0, r2)
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ r2
            android.view.View r4 = r6.findFirstVisibleChildClosestToEnd(r0, r2)
            boolean r5 = r6.mSmoothScrollbarEnabled
            r0 = r7
            r2 = r3
            r3 = r4
            r4 = r6
            int r7 = androidx.recyclerview.widget.C7798.m30267(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m29617(androidx.recyclerview.widget.RecyclerView.C7713 r8) {
            r7 = this;
            int r0 = r7.getChildCount()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            r7.ensureLayoutState()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r7.mOrientationHelper
            boolean r0 = r7.mSmoothScrollbarEnabled
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r3 = r7.findFirstVisibleChildClosestToStart(r0, r2)
            boolean r0 = r7.mSmoothScrollbarEnabled
            r0 = r0 ^ r2
            android.view.View r4 = r7.findFirstVisibleChildClosestToEnd(r0, r2)
            boolean r5 = r7.mSmoothScrollbarEnabled
            boolean r6 = r7.mShouldReverseLayout
            r0 = r8
            r2 = r3
            r3 = r4
            r4 = r7
            int r8 = androidx.recyclerview.widget.C7798.m30268(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m29618(androidx.recyclerview.widget.RecyclerView.C7713 r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r6.ensureLayoutState()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r6.mOrientationHelper
            boolean r0 = r6.mSmoothScrollbarEnabled
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r3 = r6.findFirstVisibleChildClosestToStart(r0, r2)
            boolean r0 = r6.mSmoothScrollbarEnabled
            r0 = r0 ^ r2
            android.view.View r4 = r6.findFirstVisibleChildClosestToEnd(r0, r2)
            boolean r5 = r6.mSmoothScrollbarEnabled
            r0 = r7
            r2 = r3
            r3 = r4
            r4 = r6
            int r7 = androidx.recyclerview.widget.C7798.m30269(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final android.view.View m29619() {
            r2 = this;
            r0 = 0
            int r1 = r2.getChildCount()
            android.view.View r0 = r2.findOnePartiallyOrCompletelyInvisibleChild(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final android.view.View m29620(androidx.recyclerview.widget.RecyclerView.C7704 r7, androidx.recyclerview.widget.RecyclerView.C7713 r8) {
            r6 = this;
            int r4 = r6.getChildCount()
            int r5 = r8.m29858()
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            android.view.View r7 = r0.findReferenceChild(r1, r2, r3, r4, r5)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final android.view.View m29621() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r0 = r2.findOnePartiallyOrCompletelyInvisibleChild(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final android.view.View m29622(androidx.recyclerview.widget.RecyclerView.C7704 r8, androidx.recyclerview.widget.RecyclerView.C7713 r9) {
            r7 = this;
            int r0 = r7.getChildCount()
            int r4 = r0 + (-1)
            int r6 = r9.m29858()
            r5 = -1
            r1 = r7
            r2 = r8
            r3 = r9
            android.view.View r8 = r1.findReferenceChild(r2, r3, r4, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final android.view.View m29623() {
            r1 = this;
            boolean r0 = r1.mShouldReverseLayout
            if (r0 == 0) goto L9
            android.view.View r0 = r1.m29619()
            goto Ld
        L9:
            android.view.View r0 = r1.m29621()
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final android.view.View m29624() {
            r1 = this;
            boolean r0 = r1.mShouldReverseLayout
            if (r0 == 0) goto L9
            android.view.View r0 = r1.m29621()
            goto Ld
        L9:
            android.view.View r0 = r1.m29619()
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final android.view.View m29625(androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3) {
            r1 = this;
            boolean r0 = r1.mShouldReverseLayout
            if (r0 == 0) goto L9
            android.view.View r2 = r1.m29620(r2, r3)
            goto Ld
        L9:
            android.view.View r2 = r1.m29622(r2, r3)
        Ld:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final android.view.View m29626(androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3) {
            r1 = this;
            boolean r0 = r1.mShouldReverseLayout
            if (r0 == 0) goto L9
            android.view.View r2 = r1.m29622(r2, r3)
            goto Ld
        L9:
            android.view.View r2 = r1.m29620(r2, r3)
        Ld:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m29627(int r2, androidx.recyclerview.widget.RecyclerView.C7704 r3, androidx.recyclerview.widget.RecyclerView.C7713 r4, boolean r5) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.mOrientationHelper
            int r0 = r0.mo30247()
            int r0 = r0 - r2
            if (r0 <= 0) goto L23
            int r0 = -r0
            int r3 = r1.scrollBy(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r1.mOrientationHelper
            int r4 = r4.mo30247()
            int r4 = r4 - r2
            if (r4 <= 0) goto L22
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r1.mOrientationHelper
            r2.mo30258(r4)
            int r4 = r4 + r3
            return r4
        L22:
            return r3
        L23:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final int m29628(int r2, androidx.recyclerview.widget.RecyclerView.C7704 r3, androidx.recyclerview.widget.RecyclerView.C7713 r4, boolean r5) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.mOrientationHelper
            int r0 = r0.mo30252()
            int r0 = r2 - r0
            if (r0 <= 0) goto L23
            int r3 = r1.scrollBy(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r1.mOrientationHelper
            int r4 = r4.mo30252()
            int r2 = r2 - r4
            if (r2 <= 0) goto L22
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r1.mOrientationHelper
            int r5 = -r2
            r4.mo30258(r5)
            int r3 = r3 - r2
        L22:
            return r3
        L23:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m29629(androidx.recyclerview.widget.RecyclerView.C7704 r11, androidx.recyclerview.widget.RecyclerView.C7713 r12, int r13, int r14) {
            r10 = this;
            boolean r0 = r12.m29868()
            if (r0 == 0) goto L9f
            int r0 = r10.getChildCount()
            if (r0 == 0) goto L9f
            boolean r0 = r12.m29864()
            if (r0 != 0) goto L9f
            boolean r0 = r10.supportsPredictiveItemAnimations()
            if (r0 != 0) goto L1a
            goto L9f
        L1a:
            java.util.List r0 = r11.m29807()
            int r1 = r0.size()
            r2 = 0
            android.view.View r3 = r10.getChildAt(r2)
            int r3 = r10.getPosition(r3)
            r4 = r2
            r5 = r4
            r6 = r5
        L2e:
            if (r4 >= r1) goto L60
            java.lang.Object r7 = r0.get(r4)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r7 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r7
            boolean r8 = r7.isRemoved()
            if (r8 == 0) goto L3d
            goto L5d
        L3d:
            int r8 = r7.getLayoutPosition()
            if (r8 >= r3) goto L45
            r8 = 1
            goto L46
        L45:
            r8 = r2
        L46:
            boolean r9 = r10.mShouldReverseLayout
            if (r8 == r9) goto L54
            androidx.recyclerview.widget.ۥ۟۟۠۠ r8 = r10.mOrientationHelper
            android.view.View r7 = r7.itemView
            int r7 = r8.mo30243(r7)
            int r5 = r5 + r7
            goto L5d
        L54:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r8 = r10.mOrientationHelper
            android.view.View r7 = r7.itemView
            int r7 = r8.mo30243(r7)
            int r6 = r6 + r7
        L5d:
            int r4 = r4 + 1
            goto L2e
        L60:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r10.mLayoutState
            r1.f29578 = r0
            if (r5 <= 0) goto L7f
            android.view.View r0 = r10.getChildClosestToStart()
            int r0 = r10.getPosition(r0)
            r10.m29642(r0, r13)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r13 = r10.mLayoutState
            r13.f29574 = r5
            r13.f29569 = r2
            r13.m29650()
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r13 = r10.mLayoutState
            r10.fill(r11, r13, r12, r2)
        L7f:
            if (r6 <= 0) goto L9a
            android.view.View r13 = r10.getChildClosestToEnd()
            int r13 = r10.getPosition(r13)
            r10.m29640(r13, r14)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r13 = r10.mLayoutState
            r13.f29574 = r6
            r13.f29569 = r2
            r13.m29650()
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r13 = r10.mLayoutState
            r10.fill(r11, r13, r12, r2)
        L9a:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r11 = r10.mLayoutState
            r12 = 0
            r11.f29578 = r12
        L9f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m29630() {
            r5 = this;
            java.lang.String r0 = "internal representation of views on the screen"
            java.lang.String r1 = "LinearLayoutManager"
            android.util.Log.d(r1, r0)
            r0 = 0
        L8:
            int r2 = r5.getChildCount()
            if (r0 >= r2) goto L3b
            android.view.View r2 = r5.getChildAt(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "item "
            r3.append(r4)
            int r4 = r5.getPosition(r2)
            r3.append(r4)
            java.lang.String r4 = ", coord:"
            r3.append(r4)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r4 = r5.mOrientationHelper
            int r2 = r4.mo30245(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r1, r2)
            int r0 = r0 + 1
            goto L8
        L3b:
            java.lang.String r0 = "=============="
            android.util.Log.d(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m29631(androidx.recyclerview.widget.RecyclerView.C7704 r4, androidx.recyclerview.widget.LinearLayoutManager.C7669 r5) {
            r3 = this;
            boolean r0 = r5.f29567
            if (r0 == 0) goto L19
            boolean r0 = r5.f29579
            if (r0 == 0) goto L9
            goto L19
        L9:
            int r0 = r5.f29573
            int r1 = r5.f29575
            int r5 = r5.f29572
            r2 = -1
            if (r5 != r2) goto L16
            r3.m29633(r4, r0, r1)
            goto L19
        L16:
            r3.m29634(r4, r0, r1)
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m29632(androidx.recyclerview.widget.RecyclerView.C7704 r1, int r2, int r3) {
            r0 = this;
            if (r2 != r3) goto L3
            return
        L3:
            if (r3 <= r2) goto Lf
            int r3 = r3 + (-1)
        L7:
            if (r3 < r2) goto L17
            r0.removeAndRecycleViewAt(r3, r1)
            int r3 = r3 + (-1)
            goto L7
        Lf:
            if (r2 <= r3) goto L17
            r0.removeAndRecycleViewAt(r2, r1)
            int r2 = r2 + (-1)
            goto Lf
        L17:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m29633(androidx.recyclerview.widget.RecyclerView.C7704 r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.getChildCount()
            if (r6 >= 0) goto L7
            return
        L7:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r4.mOrientationHelper
            int r1 = r1.mo30246()
            int r1 = r1 - r6
            int r1 = r1 + r7
            boolean r6 = r4.mShouldReverseLayout
            if (r6 == 0) goto L33
            r6 = 0
            r7 = r6
        L15:
            if (r7 >= r0) goto L53
            android.view.View r2 = r4.getChildAt(r7)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.mOrientationHelper
            int r3 = r3.mo30245(r2)
            if (r3 < r1) goto L2f
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.mOrientationHelper
            int r2 = r3.mo30256(r2)
            if (r2 >= r1) goto L2c
            goto L2f
        L2c:
            int r7 = r7 + 1
            goto L15
        L2f:
            r4.m29632(r5, r6, r7)
            return
        L33:
            int r0 = r0 + (-1)
            r6 = r0
        L36:
            if (r6 < 0) goto L53
            android.view.View r7 = r4.getChildAt(r6)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.mOrientationHelper
            int r2 = r2.mo30245(r7)
            if (r2 < r1) goto L50
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.mOrientationHelper
            int r7 = r2.mo30256(r7)
            if (r7 >= r1) goto L4d
            goto L50
        L4d:
            int r6 = r6 + (-1)
            goto L36
        L50:
            r4.m29632(r5, r0, r6)
        L53:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m29634(androidx.recyclerview.widget.RecyclerView.C7704 r5, int r6, int r7) {
            r4 = this;
            if (r6 >= 0) goto L3
            return
        L3:
            int r6 = r6 - r7
            int r7 = r4.getChildCount()
            boolean r0 = r4.mShouldReverseLayout
            if (r0 == 0) goto L2d
            int r7 = r7 + (-1)
            r0 = r7
        Lf:
            if (r0 < 0) goto L4c
            android.view.View r1 = r4.getChildAt(r0)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.mOrientationHelper
            int r2 = r2.mo30242(r1)
            if (r2 > r6) goto L29
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.mOrientationHelper
            int r1 = r2.mo30255(r1)
            if (r1 <= r6) goto L26
            goto L29
        L26:
            int r0 = r0 + (-1)
            goto Lf
        L29:
            r4.m29632(r5, r7, r0)
            return
        L2d:
            r0 = 0
            r1 = r0
        L2f:
            if (r1 >= r7) goto L4c
            android.view.View r2 = r4.getChildAt(r1)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.mOrientationHelper
            int r3 = r3.mo30242(r2)
            if (r3 > r6) goto L49
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.mOrientationHelper
            int r2 = r3.mo30255(r2)
            if (r2 <= r6) goto L46
            goto L49
        L46:
            int r1 = r1 + 1
            goto L2f
        L49:
            r4.m29632(r5, r0, r1)
        L4c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m29635() {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.isLayoutRTL()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.mReverseLayout
            r0 = r0 ^ r1
            r2.mShouldReverseLayout = r0
            goto L16
        L12:
            boolean r0 = r2.mReverseLayout
            r2.mShouldReverseLayout = r0
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean m29636(androidx.recyclerview.widget.RecyclerView.C7704 r5, androidx.recyclerview.widget.RecyclerView.C7713 r6, androidx.recyclerview.widget.LinearLayoutManager.C7667 r7) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r0 = r4.getFocusedChild()
            r2 = 1
            if (r0 == 0) goto L1d
            boolean r3 = r7.m29647(r0, r6)
            if (r3 == 0) goto L1d
            int r5 = r4.getPosition(r0)
            r7.m29646(r0, r5)
            return r2
        L1d:
            boolean r0 = r4.mLastStackFromEnd
            boolean r3 = r4.mStackFromEnd
            if (r0 == r3) goto L24
            return r1
        L24:
            boolean r0 = r7.f29554
            if (r0 == 0) goto L2d
            android.view.View r5 = r4.m29625(r5, r6)
            goto L31
        L2d:
            android.view.View r5 = r4.m29626(r5, r6)
        L31:
            if (r5 == 0) goto L76
            int r0 = r4.getPosition(r5)
            r7.m29645(r5, r0)
            boolean r6 = r6.m29864()
            if (r6 != 0) goto L75
            boolean r6 = r4.supportsPredictiveItemAnimations()
            if (r6 == 0) goto L75
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r4.mOrientationHelper
            int r6 = r6.mo30245(r5)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r4.mOrientationHelper
            int r0 = r0.mo30247()
            if (r6 >= r0) goto L62
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r4.mOrientationHelper
            int r5 = r6.mo30242(r5)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r6 = r4.mOrientationHelper
            int r6 = r6.mo30252()
            if (r5 >= r6) goto L75
        L62:
            boolean r5 = r7.f29554
            if (r5 == 0) goto L6d
            androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r4.mOrientationHelper
            int r5 = r5.mo30247()
            goto L73
        L6d:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r4.mOrientationHelper
            int r5 = r5.mo30252()
        L73:
            r7.f29553 = r5
        L75:
            return r2
        L76:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final boolean m29637(androidx.recyclerview.widget.RecyclerView.C7713 r5, androidx.recyclerview.widget.LinearLayoutManager.C7667 r6) {
            r4 = this;
            boolean r0 = r5.m29864()
            r1 = 0
            if (r0 != 0) goto Lfc
            int r0 = r4.mPendingScrollPosition
            r2 = -1
            if (r0 != r2) goto Le
            goto Lfc
        Le:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 < 0) goto Lf8
            int r5 = r5.m29858()
            if (r0 < r5) goto L1a
            goto Lf8
        L1a:
            int r5 = r4.mPendingScrollPosition
            r6.f29552 = r5
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r5 = r4.mPendingSavedState
            r0 = 1
            if (r5 == 0) goto L4d
            boolean r5 = r5.m29657()
            if (r5 == 0) goto L4d
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r5 = r4.mPendingSavedState
            boolean r5 = r5.f29582
            r6.f29554 = r5
            if (r5 == 0) goto L3f
            androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r4.mOrientationHelper
            int r5 = r5.mo30247()
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r1 = r4.mPendingSavedState
            int r1 = r1.f29581
            int r5 = r5 - r1
            r6.f29553 = r5
            goto L4c
        L3f:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r4.mOrientationHelper
            int r5 = r5.mo30252()
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟۟ r1 = r4.mPendingSavedState
            int r1 = r1.f29581
            int r5 = r5 + r1
            r6.f29553 = r5
        L4c:
            return r0
        L4d:
            int r5 = r4.mPendingScrollPositionOffset
            if (r5 != r3) goto Lda
            int r5 = r4.mPendingScrollPosition
            android.view.View r5 = r4.findViewByPosition(r5)
            if (r5 == 0) goto Lba
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.mOrientationHelper
            int r2 = r2.mo30243(r5)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.mOrientationHelper
            int r3 = r3.mo30253()
            if (r2 <= r3) goto L6b
            r6.m29644()
            return r0
        L6b:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.mOrientationHelper
            int r2 = r2.mo30245(r5)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.mOrientationHelper
            int r3 = r3.mo30252()
            int r2 = r2 - r3
            if (r2 >= 0) goto L85
            androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r4.mOrientationHelper
            int r5 = r5.mo30252()
            r6.f29553 = r5
            r6.f29554 = r1
            return r0
        L85:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r4.mOrientationHelper
            int r1 = r1.mo30247()
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r4.mOrientationHelper
            int r2 = r2.mo30242(r5)
            int r1 = r1 - r2
            if (r1 >= 0) goto L9f
            androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r4.mOrientationHelper
            int r5 = r5.mo30247()
            r6.f29553 = r5
            r6.f29554 = r0
            return r0
        L9f:
            boolean r1 = r6.f29554
            if (r1 == 0) goto Lb1
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r4.mOrientationHelper
            int r5 = r1.mo30242(r5)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r4.mOrientationHelper
            int r1 = r1.m30254()
            int r5 = r5 + r1
            goto Lb7
        Lb1:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r4.mOrientationHelper
            int r5 = r1.mo30245(r5)
        Lb7:
            r6.f29553 = r5
            goto Ld9
        Lba:
            int r5 = r4.getChildCount()
            if (r5 <= 0) goto Ld6
            android.view.View r5 = r4.getChildAt(r1)
            int r5 = r4.getPosition(r5)
            int r2 = r4.mPendingScrollPosition
            if (r2 >= r5) goto Lce
            r5 = r0
            goto Lcf
        Lce:
            r5 = r1
        Lcf:
            boolean r2 = r4.mShouldReverseLayout
            if (r5 != r2) goto Ld4
            r1 = r0
        Ld4:
            r6.f29554 = r1
        Ld6:
            r6.m29644()
        Ld9:
            return r0
        Lda:
            boolean r5 = r4.mShouldReverseLayout
            r6.f29554 = r5
            if (r5 == 0) goto Lec
            androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r4.mOrientationHelper
            int r5 = r5.mo30247()
            int r1 = r4.mPendingScrollPositionOffset
            int r5 = r5 - r1
            r6.f29553 = r5
            goto Lf7
        Lec:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r4.mOrientationHelper
            int r5 = r5.mo30252()
            int r1 = r4.mPendingScrollPositionOffset
            int r5 = r5 + r1
            r6.f29553 = r5
        Lf7:
            return r0
        Lf8:
            r4.mPendingScrollPosition = r2
            r4.mPendingScrollPositionOffset = r3
        Lfc:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m29638(androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3, androidx.recyclerview.widget.LinearLayoutManager.C7667 r4) {
            r1 = this;
            boolean r0 = r1.m29637(r3, r4)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r2 = r1.m29636(r2, r3, r4)
            if (r2 == 0) goto Le
            return
        Le:
            r4.m29644()
            boolean r2 = r1.mStackFromEnd
            if (r2 == 0) goto L1c
            int r2 = r3.m29858()
            int r2 = r2 + (-1)
            goto L1d
        L1c:
            r2 = 0
        L1d:
            r4.f29552 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m29639(int r5, int r6, boolean r7, androidx.recyclerview.widget.RecyclerView.C7713 r8) {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r4.mLayoutState
            boolean r1 = r4.resolveIsInfinite()
            r0.f29579 = r1
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r4.mLayoutState
            r0.f29572 = r5
            int[] r0 = r4.mReusableIntPair
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r4.calculateExtraLayoutSpace(r8, r0)
            int[] r8 = r4.mReusableIntPair
            r8 = r8[r1]
            int r8 = java.lang.Math.max(r1, r8)
            int[] r0 = r4.mReusableIntPair
            r0 = r0[r2]
            int r0 = java.lang.Math.max(r1, r0)
            if (r5 != r2) goto L2a
            r1 = r2
        L2a:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r5 = r4.mLayoutState
            if (r1 == 0) goto L30
            r3 = r0
            goto L31
        L30:
            r3 = r8
        L31:
            r5.f29574 = r3
            if (r1 == 0) goto L36
            goto L37
        L36:
            r8 = r0
        L37:
            r5.f29575 = r8
            r8 = -1
            if (r1 == 0) goto L73
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r4.mOrientationHelper
            int r0 = r0.mo30248()
            int r3 = r3 + r0
            r5.f29574 = r3
            android.view.View r5 = r4.getChildClosestToEnd()
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r4.mLayoutState
            boolean r1 = r4.mShouldReverseLayout
            if (r1 == 0) goto L50
            r2 = r8
        L50:
            r0.f29571 = r2
            int r8 = r4.getPosition(r5)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r4.mLayoutState
            int r2 = r1.f29571
            int r8 = r8 + r2
            r0.f29570 = r8
            androidx.recyclerview.widget.ۥ۟۟۠۠ r8 = r4.mOrientationHelper
            int r8 = r8.mo30242(r5)
            r1.f29568 = r8
            androidx.recyclerview.widget.ۥ۟۟۠۠ r8 = r4.mOrientationHelper
            int r5 = r8.mo30242(r5)
            androidx.recyclerview.widget.ۥ۟۟۠۠ r8 = r4.mOrientationHelper
            int r8 = r8.mo30247()
            int r5 = r5 - r8
            goto Laf
        L73:
            android.view.View r5 = r4.getChildClosestToStart()
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r4.mLayoutState
            int r1 = r0.f29574
            androidx.recyclerview.widget.ۥ۟۟۠۠ r3 = r4.mOrientationHelper
            int r3 = r3.mo30252()
            int r1 = r1 + r3
            r0.f29574 = r1
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r4.mLayoutState
            boolean r1 = r4.mShouldReverseLayout
            if (r1 == 0) goto L8b
            goto L8c
        L8b:
            r2 = r8
        L8c:
            r0.f29571 = r2
            int r8 = r4.getPosition(r5)
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r1 = r4.mLayoutState
            int r2 = r1.f29571
            int r8 = r8 + r2
            r0.f29570 = r8
            androidx.recyclerview.widget.ۥ۟۟۠۠ r8 = r4.mOrientationHelper
            int r8 = r8.mo30245(r5)
            r1.f29568 = r8
            androidx.recyclerview.widget.ۥ۟۟۠۠ r8 = r4.mOrientationHelper
            int r5 = r8.mo30245(r5)
            int r5 = -r5
            androidx.recyclerview.widget.ۥ۟۟۠۠ r8 = r4.mOrientationHelper
            int r8 = r8.mo30252()
            int r5 = r5 + r8
        Laf:
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r8 = r4.mLayoutState
            r8.f29569 = r6
            if (r7 == 0) goto Lb8
            int r6 = r6 - r5
            r8.f29569 = r6
        Lb8:
            r8.f29573 = r5
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m29640(int r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r3.mLayoutState
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r3.mOrientationHelper
            int r1 = r1.mo30247()
            int r1 = r1 - r5
            r0.f29569 = r1
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r3.mLayoutState
            boolean r1 = r3.mShouldReverseLayout
            r2 = 1
            if (r1 == 0) goto L14
            r1 = -1
            goto L15
        L14:
            r1 = r2
        L15:
            r0.f29571 = r1
            r0.f29570 = r4
            r0.f29572 = r2
            r0.f29568 = r5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f29573 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m29641(androidx.recyclerview.widget.LinearLayoutManager.C7667 r2) {
            r1 = this;
            int r0 = r2.f29552
            int r2 = r2.f29553
            r1.m29640(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m29642(int r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r2.mLayoutState
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r2.mOrientationHelper
            int r1 = r1.mo30252()
            int r1 = r4 - r1
            r0.f29569 = r1
            androidx.recyclerview.widget.LinearLayoutManager$ۥ۟۟ r0 = r2.mLayoutState
            r0.f29570 = r3
            boolean r3 = r2.mShouldReverseLayout
            r1 = -1
            if (r3 == 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = r1
        L18:
            r0.f29571 = r3
            r0.f29572 = r1
            r0.f29568 = r4
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f29573 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m29643(androidx.recyclerview.widget.LinearLayoutManager.C7667 r2) {
            r1 = this;
            int r0 = r2.f29552
            int r2 = r2.f29553
            r1.m29642(r0, r2)
            return
    }
}
