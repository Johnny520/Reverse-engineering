package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements Yue.InterfaceC4385, Yue.InterfaceC4381, Yue.InterfaceC5517 {
    private static final androidx.core.widget.NestedScrollView.C7511 ACCESSIBILITY_DELEGATE = null;
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final float DECELERATION_RATE = 0.0f;
    private static final int DEFAULT_SMOOTH_SCROLL_DURATION = 250;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final int[] SCROLLVIEW_STYLEABLE = null;
    private static final float SCROLL_FRICTION = 0.015f;
    private static final java.lang.String TAG = "NestedScrollView";
    private int mActivePointerId;
    private final Yue.C4383 mChildHelper;
    private android.view.View mChildToScrollTo;

    @Yue.InterfaceC6959
    Yue.C1844 mDifferentialMotionFlingController;

    @Yue.InterfaceC6959
    final androidx.core.widget.NestedScrollView.C7513 mDifferentialMotionFlingTarget;

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC6959
    public android.widget.EdgeEffect mEdgeGlowBottom;

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC6959
    public android.widget.EdgeEffect mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private androidx.core.widget.NestedScrollView.InterfaceC7514 mOnScrollChangeListener;
    private final Yue.C4387 mParentHelper;
    private final float mPhysicalCoeff;
    private androidx.core.widget.NestedScrollView.C7515 mSavedState;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private android.widget.OverScroller mScroller;
    private boolean mSmoothScrollingEnabled;
    private final android.graphics.Rect mTempRect;
    private int mTouchSlop;
    private android.view.VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ, reason: contains not printable characters */
    public static class C7511 extends Yue.C0104 {
        public C7511() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C0104
        public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2, r3)
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
                Yue.C0158.m870(r3, r0)
                int r2 = r2.getScrollRange()
                Yue.C0158.m871(r3, r2)
                return
        }

        @Override // Yue.C0104
        public void onInitializeAccessibilityNodeInfo(android.view.View r3, Yue.C0140 r4) {
                r2 = this;
                super.onInitializeAccessibilityNodeInfo(r3, r4)
                androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r4.m733(r0)
                boolean r0 = r3.isEnabled()
                if (r0 == 0) goto L3e
                int r0 = r3.getScrollRange()
                if (r0 <= 0) goto L3e
                r1 = 1
                r4.m773(r1)
                int r1 = r3.getScrollY()
                if (r1 <= 0) goto L2e
                Yue.ۥ۟۟ۥۧ$ۥ r1 = Yue.C0140.C0141.f329
                r4.m627(r1)
                Yue.ۥ۟۟ۥۧ$ۥ r1 = Yue.C0140.C0141.f340
                r4.m627(r1)
            L2e:
                int r3 = r3.getScrollY()
                if (r3 >= r0) goto L3e
                Yue.ۥ۟۟ۥۧ$ۥ r3 = Yue.C0140.C0141.f328
                r4.m627(r3)
                Yue.ۥ۟۟ۥۧ$ۥ r3 = Yue.C0140.C0141.f342
                r4.m627(r3)
            L3e:
                return
        }

        @Override // Yue.C0104
        public boolean performAccessibilityAction(android.view.View r5, int r6, android.os.Bundle r7) {
                r4 = this;
                boolean r7 = super.performAccessibilityAction(r5, r6, r7)
                r0 = 1
                if (r7 == 0) goto L8
                return r0
            L8:
                androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
                boolean r7 = r5.isEnabled()
                r1 = 0
                if (r7 != 0) goto L12
                return r1
            L12:
                int r7 = r5.getHeight()
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                android.graphics.Matrix r3 = r5.getMatrix()
                boolean r3 = r3.isIdentity()
                if (r3 == 0) goto L2f
                boolean r3 = r5.getGlobalVisibleRect(r2)
                if (r3 == 0) goto L2f
                int r7 = r2.height()
            L2f:
                r2 = 4096(0x1000, float:5.74E-42)
                if (r6 == r2) goto L60
                r2 = 8192(0x2000, float:1.148E-41)
                if (r6 == r2) goto L42
                r2 = 16908344(0x1020038, float:2.3877386E-38)
                if (r6 == r2) goto L42
                r2 = 16908346(0x102003a, float:2.3877392E-38)
                if (r6 == r2) goto L60
                return r1
            L42:
                int r6 = r5.getPaddingBottom()
                int r7 = r7 - r6
                int r6 = r5.getPaddingTop()
                int r7 = r7 - r6
                int r6 = r5.getScrollY()
                int r6 = r6 - r7
                int r6 = java.lang.Math.max(r6, r1)
                int r7 = r5.getScrollY()
                if (r6 == r7) goto L5f
                r5.smoothScrollTo(r1, r6, r0)
                return r0
            L5f:
                return r1
            L60:
                int r6 = r5.getPaddingBottom()
                int r7 = r7 - r6
                int r6 = r5.getPaddingTop()
                int r7 = r7 - r6
                int r6 = r5.getScrollY()
                int r6 = r6 + r7
                int r7 = r5.getScrollRange()
                int r6 = java.lang.Math.min(r6, r7)
                int r7 = r5.getScrollY()
                if (r6 == r7) goto L81
                r5.smoothScrollTo(r1, r6, r0)
                return r0
            L81:
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C7512 {
        public C7512() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m28909(android.view.ViewGroup r0) {
                boolean r0 = r0.getClipToPadding()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ۟۟, reason: contains not printable characters */
    public class C7513 implements Yue.InterfaceC1847 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.core.widget.NestedScrollView f29003;

        public C7513(androidx.core.widget.NestedScrollView r1) {
                r0 = this;
                r0.f29003 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC1847
        /* JADX INFO: renamed from: ۥ */
        public boolean mo8610(float r2) {
                r1 = this;
                r0 = 0
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 != 0) goto L7
                r2 = 0
                return r2
            L7:
                r1.mo8612()
                androidx.core.widget.NestedScrollView r0 = r1.f29003
                int r2 = (int) r2
                r0.fling(r2)
                r2 = 1
                return r2
        }

        @Override // Yue.InterfaceC1847
        /* JADX INFO: renamed from: ۥ۟ */
        public float mo8611() {
                r1 = this;
                androidx.core.widget.NestedScrollView r0 = r1.f29003
                float r0 = r0.getVerticalScrollFactorCompat()
                float r0 = -r0
                return r0
        }

        @Override // Yue.InterfaceC1847
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo8612() {
                r1 = this;
                androidx.core.widget.NestedScrollView r0 = r1.f29003
                android.widget.OverScroller r0 = androidx.core.widget.NestedScrollView.access$000(r0)
                r0.abortAnimation()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC7514 {
        /* JADX INFO: renamed from: ۥ */
        void mo23574(@Yue.InterfaceC4410 androidx.core.widget.NestedScrollView r1, int r2, int r3, int r4, int r5);
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7515 extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.C7515> CREATOR = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f29004;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ۟۟۟۟$ۥ, reason: contains not printable characters */
        public class C7516 implements android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.C7515> {
            public C7516() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.core.widget.NestedScrollView.C7515 createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.core.widget.NestedScrollView$ۥ۟۟۟۟ r1 = r0.m28910(r1)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.core.widget.NestedScrollView.C7515[] newArray(int r1) {
                    r0 = this;
                    androidx.core.widget.NestedScrollView$ۥ۟۟۟۟[] r1 = r0.m28911(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public androidx.core.widget.NestedScrollView.C7515 m28910(android.os.Parcel r2) {
                    r1 = this;
                    androidx.core.widget.NestedScrollView$ۥ۟۟۟۟ r0 = new androidx.core.widget.NestedScrollView$ۥ۟۟۟۟
                    r0.<init>(r2)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public androidx.core.widget.NestedScrollView.C7515[] m28911(int r1) {
                    r0 = this;
                    androidx.core.widget.NestedScrollView$ۥ۟۟۟۟[] r1 = new androidx.core.widget.NestedScrollView.C7515[r1]
                    return r1
            }
        }

        static {
                androidx.core.widget.NestedScrollView$ۥ۟۟۟۟$ۥ r0 = new androidx.core.widget.NestedScrollView$ۥ۟۟۟۟$ۥ
                r0.<init>()
                androidx.core.widget.NestedScrollView.C7515.CREATOR = r0
                return
        }

        public C7515(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r1.readInt()
                r0.f29004 = r1
                return
        }

        public C7515(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Yue.InterfaceC4410
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "HorizontalScrollView.SavedState{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " scrollPosition="
                r0.append(r1)
                int r1 = r2.f29004
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.f29004
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
            androidx.core.widget.NestedScrollView.DECELERATION_RATE = r0
            androidx.core.widget.NestedScrollView$ۥ r0 = new androidx.core.widget.NestedScrollView$ۥ
            r0.<init>()
            androidx.core.widget.NestedScrollView.ACCESSIBILITY_DELEGATE = r0
            r0 = 16843130(0x101017a, float:2.3694617E-38)
            int[] r0 = new int[]{r0}
            androidx.core.widget.NestedScrollView.SCROLLVIEW_STYLEABLE = r0
            return
    }

    public NestedScrollView(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NestedScrollView(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5172.C5173.f19333
            r1.<init>(r2, r3, r0)
            return
    }

    public NestedScrollView(@Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC4544 android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.mTempRect = r0
            r0 = 1
            r5.mIsLayoutDirty = r0
            r1 = 0
            r5.mIsLaidOut = r1
            r2 = 0
            r5.mChildToScrollTo = r2
            r5.mIsBeingDragged = r1
            r5.mSmoothScrollingEnabled = r0
            r2 = -1
            r5.mActivePointerId = r2
            r2 = 2
            int[] r3 = new int[r2]
            r5.mScrollOffset = r3
            int[] r2 = new int[r2]
            r5.mScrollConsumed = r2
            androidx.core.widget.NestedScrollView$ۥ۟۟ r2 = new androidx.core.widget.NestedScrollView$ۥ۟۟
            r2.<init>(r5)
            r5.mDifferentialMotionFlingTarget = r2
            Yue.ۥ۠۟۠ۧ r3 = new Yue.ۥ۠۟۠ۧ
            android.content.Context r4 = r5.getContext()
            r3.<init>(r4, r2)
            r5.mDifferentialMotionFlingController = r3
            android.widget.EdgeEffect r2 = Yue.C2083.m9731(r6, r7)
            r5.mEdgeGlowTop = r2
            android.widget.EdgeEffect r2 = Yue.C2083.m9731(r6, r7)
            r5.mEdgeGlowBottom = r2
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 * r3
            r3 = 1136724797(0x43c10b3d, float:386.0878)
            float r2 = r2 * r3
            r3 = 1062668861(0x3f570a3d, float:0.84)
            float r2 = r2 * r3
            r5.mPhysicalCoeff = r2
            r5.m28892()
            int[] r2 = androidx.core.widget.NestedScrollView.SCROLLVIEW_STYLEABLE
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r2, r8, r1)
            boolean r7 = r6.getBoolean(r1, r1)
            r5.setFillViewport(r7)
            r6.recycle()
            Yue.ۥۡۢۢۤ r6 = new Yue.ۥۡۢۢۤ
            r6.<init>(r5)
            r5.mParentHelper = r6
            Yue.ۥۡۢۢ۠ r6 = new Yue.ۥۡۢۢ۠
            r6.<init>(r5)
            r5.mChildHelper = r6
            r5.setNestedScrollingEnabled(r0)
            androidx.core.widget.NestedScrollView$ۥ r6 = androidx.core.widget.NestedScrollView.ACCESSIBILITY_DELEGATE
            Yue.C6794.m26223(r5, r6)
            return
    }

    public static /* synthetic */ android.widget.OverScroller access$000(androidx.core.widget.NestedScrollView r0) {
            android.widget.OverScroller r0 = r0.mScroller
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    private static int m28880(int r1, int r2, int r3) {
            if (r2 >= r3) goto Lc
            if (r1 >= 0) goto L5
            goto Lc
        L5:
            int r0 = r2 + r1
            if (r0 <= r3) goto Lb
            int r3 = r3 - r2
            return r3
        Lb:
            return r1
        Lc:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m28881(android.view.View r2, android.view.View r3) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.ViewGroup
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            boolean r2 = m28881(r2, r3)
            if (r2 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Override // android.view.ViewGroup
    public void addView(@Yue.InterfaceC4410 android.view.View r2) {
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
    public void addView(android.view.View r2, int r3) {
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
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
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
    public void addView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
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

    public boolean arrowScroll(int r9) {
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
            if (r1 == 0) goto L38
            int r5 = r8.getHeight()
            boolean r5 = r8.m28896(r1, r2, r5)
            if (r5 == 0) goto L38
            android.graphics.Rect r2 = r8.mTempRect
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r8.mTempRect
            r8.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r2 = r8.mTempRect
            int r2 = r8.computeScrollDeltaToGetChildRectOnScreen(r2)
            r8.m28903(r2, r3, r4, r4)
            r1.requestFocus(r9)
            goto L7f
        L38:
            r1 = 33
            r5 = 130(0x82, float:1.82E-43)
            if (r9 != r1) goto L49
            int r1 = r8.getScrollY()
            if (r1 >= r2) goto L49
            int r2 = r8.getScrollY()
            goto L75
        L49:
            if (r9 != r5) goto L75
            int r1 = r8.getChildCount()
            if (r1 <= 0) goto L75
            android.view.View r1 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r1 = r1.getBottom()
            int r6 = r6.bottomMargin
            int r1 = r1 + r6
            int r6 = r8.getScrollY()
            int r7 = r8.getHeight()
            int r6 = r6 + r7
            int r7 = r8.getPaddingBottom()
            int r6 = r6 - r7
            int r1 = r1 - r6
            int r2 = java.lang.Math.min(r1, r2)
        L75:
            if (r2 != 0) goto L78
            return r3
        L78:
            if (r9 != r5) goto L7b
            goto L7c
        L7b:
            int r2 = -r2
        L7c:
            r8.m28903(r2, r3, r4, r4)
        L7f:
            if (r0 == 0) goto L9c
            boolean r9 = r0.isFocused()
            if (r9 == 0) goto L9c
            boolean r9 = r8.m28895(r0)
            if (r9 == 0) goto L9c
            int r9 = r8.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            r8.setDescendantFocusability(r0)
            r8.requestFocus()
            r8.setDescendantFocusability(r9)
        L9c:
            return r4
    }

    @Override // android.view.View, Yue.InterfaceC5517
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int computeHorizontalScrollExtent() {
            r1 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View, Yue.InterfaceC5517
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int computeHorizontalScrollOffset() {
            r1 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View, Yue.InterfaceC5517
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int computeHorizontalScrollRange() {
            r1 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public void computeScroll() {
            r16 = this;
            r10 = r16
            android.widget.OverScroller r0 = r10.mScroller
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto Lb
            return
        Lb:
            android.widget.OverScroller r0 = r10.mScroller
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r10.mScroller
            int r0 = r0.getCurrY()
            int r1 = r10.mLastScrollerY
            int r1 = r0 - r1
            int r6 = r10.consumeFlingInVerticalStretch(r1)
            r10.mLastScrollerY = r0
            int[] r3 = r10.mScrollConsumed
            r11 = 1
            r12 = 0
            r3[r11] = r12
            r4 = 0
            r5 = 1
            r1 = 0
            r0 = r16
            r2 = r6
            r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            int[] r0 = r10.mScrollConsumed
            r0 = r0[r11]
            int r13 = r6 - r0
            int r14 = r16.getScrollRange()
            if (r13 == 0) goto L6a
            int r15 = r16.getScrollY()
            int r3 = r16.getScrollX()
            r8 = 0
            r9 = 0
            r1 = 0
            r5 = 0
            r7 = 0
            r0 = r16
            r2 = r13
            r4 = r15
            r6 = r14
            r0.overScrollByCompat(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r16.getScrollY()
            int r2 = r0 - r15
            int r13 = r13 - r2
            int[] r7 = r10.mScrollConsumed
            r7[r11] = r12
            int[] r5 = r10.mScrollOffset
            r6 = 1
            r3 = 0
            r0 = r16
            r4 = r13
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r10.mScrollConsumed
            r0 = r0[r11]
            int r13 = r13 - r0
        L6a:
            if (r13 == 0) goto La4
            int r0 = r16.getOverScrollMode()
            if (r0 == 0) goto L76
            if (r0 != r11) goto La1
            if (r14 <= 0) goto La1
        L76:
            if (r13 >= 0) goto L8d
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto La1
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            android.widget.OverScroller r1 = r10.mScroller
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
            goto La1
        L8d:
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto La1
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            android.widget.OverScroller r1 = r10.mScroller
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
        La1:
            r16.m28882()
        La4:
            android.widget.OverScroller r0 = r10.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto Lb0
            r16.postInvalidateOnAnimation()
            goto Lb3
        Lb0:
            r10.stopNestedScroll(r11)
        Lb3:
            return
    }

    public int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect r11) {
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
            int r1 = java.lang.Math.min(r11, r0)
            goto L77
        L59:
            int r3 = r11.top
            if (r3 >= r2) goto L77
            if (r7 >= r4) goto L77
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
            int r1 = java.lang.Math.max(r1, r11)
        L77:
            return r1
    }

    @Override // android.view.View, Yue.InterfaceC5517
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int computeVerticalScrollExtent() {
            r1 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View, Yue.InterfaceC5517
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int computeVerticalScrollOffset() {
            r2 = this;
            r0 = 0
            int r1 = super.computeVerticalScrollOffset()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View, Yue.InterfaceC5517
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public int computeVerticalScrollRange() {
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
            goto L39
        L35:
            if (r3 <= r0) goto L39
            int r3 = r3 - r0
            int r2 = r2 + r3
        L39:
            return r2
    }

    public int consumeFlingInVerticalStretch(int r6) {
            r5 = this;
            int r0 = r5.getHeight()
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r3 = 1082130432(0x40800000, float:4.0)
            if (r6 <= 0) goto L31
            android.widget.EdgeEffect r4 = r5.mEdgeGlowTop
            float r4 = Yue.C2083.m9732(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L31
            int r2 = -r6
            float r2 = (float) r2
            float r2 = r2 * r3
            float r4 = (float) r0
            float r2 = r2 / r4
            int r0 = -r0
            float r0 = (float) r0
            float r0 = r0 / r3
            android.widget.EdgeEffect r3 = r5.mEdgeGlowTop
            float r1 = Yue.C2083.m9734(r3, r2, r1)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            if (r0 == r6) goto L2f
            android.widget.EdgeEffect r1 = r5.mEdgeGlowTop
            r1.finish()
        L2f:
            int r6 = r6 - r0
            return r6
        L31:
            if (r6 >= 0) goto L55
            android.widget.EdgeEffect r4 = r5.mEdgeGlowBottom
            float r4 = Yue.C2083.m9732(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L55
            float r2 = (float) r6
            float r2 = r2 * r3
            float r0 = (float) r0
            float r2 = r2 / r0
            float r0 = r0 / r3
            android.widget.EdgeEffect r3 = r5.mEdgeGlowBottom
            float r1 = Yue.C2083.m9734(r3, r2, r1)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            if (r0 == r6) goto L54
            android.widget.EdgeEffect r1 = r5.mEdgeGlowBottom
            r1.finish()
        L54:
            int r6 = r6 - r0
        L55:
            return r6
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r2 = r1.executeKeyEvent(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.mChildHelper
            boolean r2 = r0.m17231(r2, r3, r4)
            return r2
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.mChildHelper
            boolean r2 = r0.m17232(r2, r3)
            return r2
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean dispatchNestedPreScroll(int r7, int r8, @Yue.InterfaceC4544 int[] r9, @Yue.InterfaceC4544 int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // Yue.InterfaceC4380
    public boolean dispatchNestedPreScroll(int r7, int r8, @Yue.InterfaceC4544 int[] r9, @Yue.InterfaceC4544 int[] r10, int r11) {
            r6 = this;
            Yue.ۥۡۢۢ۠ r0 = r6.mChildHelper
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m17234(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // Yue.InterfaceC4381
    public void dispatchNestedScroll(int r9, int r10, int r11, int r12, @Yue.InterfaceC4544 int[] r13, int r14, @Yue.InterfaceC4410 int[] r15) {
            r8 = this;
            Yue.ۥۡۢۢ۠ r0 = r8.mChildHelper
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.m17235(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, @Yue.InterfaceC4544 int[] r11) {
            r6 = this;
            Yue.ۥۡۢۢ۠ r0 = r6.mChildHelper
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m17236(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // Yue.InterfaceC4380
    public boolean dispatchNestedScroll(int r8, int r9, int r10, int r11, @Yue.InterfaceC4544 int[] r12, int r13) {
            r7 = this;
            Yue.ۥۡۢۢ۠ r0 = r7.mChildHelper
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.m17237(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // android.view.View
    public void draw(@Yue.InterfaceC4410 android.graphics.Canvas r10) {
            r9 = this;
            super.draw(r10)
            int r0 = r9.getScrollY()
            android.widget.EdgeEffect r1 = r9.mEdgeGlowTop
            boolean r1 = r1.isFinished()
            r2 = 0
            if (r1 != 0) goto L63
            int r1 = r10.save()
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            int r5 = java.lang.Math.min(r2, r0)
            boolean r6 = androidx.core.widget.NestedScrollView.C7512.m28909(r9)
            if (r6 == 0) goto L35
            int r6 = r9.getPaddingLeft()
            int r7 = r9.getPaddingRight()
            int r6 = r6 + r7
            int r3 = r3 - r6
            int r6 = r9.getPaddingLeft()
            goto L36
        L35:
            r6 = r2
        L36:
            boolean r7 = androidx.core.widget.NestedScrollView.C7512.m28909(r9)
            if (r7 == 0) goto L4b
            int r7 = r9.getPaddingTop()
            int r8 = r9.getPaddingBottom()
            int r7 = r7 + r8
            int r4 = r4 - r7
            int r7 = r9.getPaddingTop()
            int r5 = r5 + r7
        L4b:
            float r6 = (float) r6
            float r5 = (float) r5
            r10.translate(r6, r5)
            android.widget.EdgeEffect r5 = r9.mEdgeGlowTop
            r5.setSize(r3, r4)
            android.widget.EdgeEffect r3 = r9.mEdgeGlowTop
            boolean r3 = r3.draw(r10)
            if (r3 == 0) goto L60
            r9.postInvalidateOnAnimation()
        L60:
            r10.restoreToCount(r1)
        L63:
            android.widget.EdgeEffect r1 = r9.mEdgeGlowBottom
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lc9
            int r1 = r10.save()
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            int r5 = r9.getScrollRange()
            int r0 = java.lang.Math.max(r5, r0)
            int r0 = r0 + r4
            boolean r5 = androidx.core.widget.NestedScrollView.C7512.m28909(r9)
            if (r5 == 0) goto L94
            int r2 = r9.getPaddingLeft()
            int r5 = r9.getPaddingRight()
            int r2 = r2 + r5
            int r3 = r3 - r2
            int r2 = r9.getPaddingLeft()
        L94:
            boolean r5 = androidx.core.widget.NestedScrollView.C7512.m28909(r9)
            if (r5 == 0) goto La9
            int r5 = r9.getPaddingTop()
            int r6 = r9.getPaddingBottom()
            int r5 = r5 + r6
            int r4 = r4 - r5
            int r5 = r9.getPaddingBottom()
            int r0 = r0 - r5
        La9:
            int r2 = r2 - r3
            float r2 = (float) r2
            float r0 = (float) r0
            r10.translate(r2, r0)
            float r0 = (float) r3
            r2 = 0
            r5 = 1127481344(0x43340000, float:180.0)
            r10.rotate(r5, r0, r2)
            android.widget.EdgeEffect r0 = r9.mEdgeGlowBottom
            r0.setSize(r3, r4)
            android.widget.EdgeEffect r0 = r9.mEdgeGlowBottom
            boolean r0 = r0.draw(r10)
            if (r0 == 0) goto Lc6
            r9.postInvalidateOnAnimation()
        Lc6:
            r10.restoreToCount(r1)
        Lc9:
            return
    }

    public boolean executeKeyEvent(@Yue.InterfaceC4410 android.view.KeyEvent r6) {
            r5 = this;
            android.graphics.Rect r0 = r5.mTempRect
            r0.setEmpty()
            boolean r0 = r5.m28884()
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L36
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L35
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L35
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L22
            r6 = 0
        L22:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r2)
            if (r6 == 0) goto L35
            if (r6 == r5) goto L35
            boolean r6 = r6.requestFocus(r2)
            if (r6 == 0) goto L35
            r1 = 1
        L35:
            return r1
        L36:
            int r0 = r6.getAction()
            if (r0 != 0) goto L9b
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L8c
            r3 = 20
            if (r0 == r3) goto L7c
            r3 = 62
            if (r0 == r3) goto L71
            r6 = 92
            if (r0 == r6) goto L6c
            r6 = 93
            if (r0 == r6) goto L67
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L63
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L5f
            goto L9b
        L5f:
            r5.pageScroll(r2)
            goto L9b
        L63:
            r5.pageScroll(r4)
            goto L9b
        L67:
            boolean r1 = r5.fullScroll(r2)
            goto L9b
        L6c:
            boolean r1 = r5.fullScroll(r4)
            goto L9b
        L71:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L78
            r2 = r4
        L78:
            r5.pageScroll(r2)
            goto L9b
        L7c:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L87
            boolean r1 = r5.fullScroll(r2)
            goto L9b
        L87:
            boolean r1 = r5.arrowScroll(r2)
            goto L9b
        L8c:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L97
            boolean r1 = r5.fullScroll(r4)
            goto L9b
        L97:
            boolean r1 = r5.arrowScroll(r4)
        L9b:
            return r1
    }

    public void fling(int r13) {
            r12 = this;
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L22
            android.widget.OverScroller r1 = r12.mScroller
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            r10 = 0
            r11 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5 = r13
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 1
            r12.m28901(r13)
        L22:
            return
    }

    public boolean fullScroll(int r6) {
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
            android.graphics.Rect r4 = r5.mTempRect
            r4.top = r1
            r4.bottom = r3
            if (r0 == 0) goto L3d
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L3d
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.graphics.Rect r2 = r5.mTempRect
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            r2.bottom = r0
            android.graphics.Rect r0 = r5.mTempRect
            int r1 = r0.bottom
            int r1 = r1 - r3
            r0.top = r1
        L3d:
            android.graphics.Rect r0 = r5.mTempRect
            int r1 = r0.top
            int r0 = r0.bottom
            boolean r6 = r5.m28902(r6, r1, r0)
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

    @Override // android.view.ViewGroup, Yue.InterfaceC4386
    public int getNestedScrollAxes() {
            r1 = this;
            Yue.ۥۡۢۢۤ r0 = r1.mParentHelper
            int r0 = r0.m17252()
            return r0
    }

    public int getScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2e
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
            int r1 = java.lang.Math.max(r1, r0)
        L2e:
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

    @Yue.InterfaceC6959
    public float getVerticalScrollFactorCompat() {
            r5 = this;
            float r0 = r5.mVerticalScrollFactor
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
            r5.mVerticalScrollFactor = r0
            goto L35
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected theme to define listPreferredItemHeight."
            r0.<init>(r1)
            throw r0
        L35:
            float r0 = r5.mVerticalScrollFactor
            return r0
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.hasNestedScrollingParent(r0)
            return r0
    }

    @Override // Yue.InterfaceC4380
    public boolean hasNestedScrollingParent(int r2) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.mChildHelper
            boolean r2 = r0.m17242(r2)
            return r2
    }

    public boolean isFillViewport() {
            r1 = this;
            boolean r0 = r1.mFillViewport
            return r0
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.mChildHelper
            boolean r0 = r0.m17243()
            return r0
    }

    public boolean isSmoothScrollingEnabled() {
            r1 = this;
            boolean r0 = r1.mSmoothScrollingEnabled
            return r0
    }

    @Override // android.view.ViewGroup
    public void measureChild(@Yue.InterfaceC4410 android.view.View r3, int r4, int r5) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r0 = r0 + r1
            int r5 = r5.width
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r4, r0, r5)
            r5 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r3.measure(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r6 = r6 + r0
            int r0 = r5.leftMargin
            int r6 = r6 + r0
            int r0 = r5.rightMargin
            int r6 = r6 + r0
            int r6 = r6 + r4
            int r4 = r5.width
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r3, r6, r4)
            int r4 = r5.topMargin
            int r5 = r5.bottomMargin
            int r4 = r4 + r5
            r5 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            r2.measure(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.mIsLaidOut = r0
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@Yue.InterfaceC4410 android.view.MotionEvent r8) {
            r7 = this;
            int r0 = r8.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L5a
            boolean r0 = r7.mIsBeingDragged
            if (r0 != 0) goto L5a
            r0 = 2
            boolean r1 = Yue.C4270.m16629(r8, r0)
            r3 = 0
            if (r1 == 0) goto L21
            r0 = 9
            float r1 = r8.getAxisValue(r0)
            float r4 = r8.getX()
            int r4 = (int) r4
            goto L3d
        L21:
            r1 = 4194304(0x400000, float:5.877472E-39)
            boolean r1 = Yue.C4270.m16629(r8, r1)
            if (r1 == 0) goto L3a
            r1 = 26
            float r4 = r8.getAxisValue(r1)
            int r5 = r7.getWidth()
            int r0 = r5 / 2
            r6 = r4
            r4 = r0
            r0 = r1
            r1 = r6
            goto L3d
        L3a:
            r0 = r2
            r4 = r0
            r1 = r3
        L3d:
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L5a
            float r2 = r7.getVerticalScrollFactorCompat()
            float r1 = r1 * r2
            int r1 = (int) r1
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = Yue.C4270.m16629(r8, r2)
            int r1 = -r1
            r3 = 1
            r7.m28903(r1, r4, r3, r2)
            if (r0 == 0) goto L59
            Yue.ۥ۠۟۠ۧ r1 = r7.mDifferentialMotionFlingController
            r1.m8609(r8, r0)
        L59:
            return r3
        L5a:
            return r2
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Yue.InterfaceC4410 android.view.MotionEvent r12) {
            r11 = this;
            int r0 = r12.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            boolean r3 = r11.mIsBeingDragged
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto La3
            r4 = -1
            if (r0 == r1) goto L7e
            if (r0 == r2) goto L24
            r1 = 3
            if (r0 == r1) goto L7e
            r1 = 6
            if (r0 == r1) goto L1f
            goto Lf3
        L1f:
            r11.m28898(r12)
            goto Lf3
        L24:
            int r0 = r11.mActivePointerId
            if (r0 != r4) goto L2a
            goto Lf3
        L2a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L4d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto Lf3
        L4d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.mLastMotionY
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.mTouchSlop
            if (r4 <= r5) goto Lf3
            int r4 = r11.getNestedScrollAxes()
            r2 = r2 & r4
            if (r2 != 0) goto Lf3
            r11.mIsBeingDragged = r1
            r11.mLastMotionY = r0
            r11.m28893()
            android.view.VelocityTracker r0 = r11.mVelocityTracker
            r0.addMovement(r12)
            r11.mNestedYOffset = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto Lf3
            r12.requestDisallowInterceptTouchEvent(r1)
            goto Lf3
        L7e:
            r11.mIsBeingDragged = r3
            r11.mActivePointerId = r4
            r11.m28899()
            android.widget.OverScroller r4 = r11.mScroller
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r9 = 0
            int r10 = r11.getScrollRange()
            r7 = 0
            r8 = 0
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L9f
            r11.postInvalidateOnAnimation()
        L9f:
            r11.stopNestedScroll(r3)
            goto Lf3
        La3:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            boolean r4 = r11.m28890(r4, r0)
            if (r4 != 0) goto Lc9
            boolean r12 = r11.m28908(r12)
            if (r12 != 0) goto Lc3
            android.widget.OverScroller r12 = r11.mScroller
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto Lc2
            goto Lc3
        Lc2:
            r1 = r3
        Lc3:
            r11.mIsBeingDragged = r1
            r11.m28899()
            goto Lf3
        Lc9:
            r11.mLastMotionY = r0
            int r0 = r12.getPointerId(r3)
            r11.mActivePointerId = r0
            r11.m28891()
            android.view.VelocityTracker r0 = r11.mVelocityTracker
            r0.addMovement(r12)
            android.widget.OverScroller r0 = r11.mScroller
            r0.computeScrollOffset()
            boolean r12 = r11.m28908(r12)
            if (r12 != 0) goto Lee
            android.widget.OverScroller r12 = r11.mScroller
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto Led
            goto Lee
        Led:
            r1 = r3
        Lee:
            r11.mIsBeingDragged = r1
            r11.startNestedScroll(r2, r3)
        Lf3:
            boolean r12 = r11.mIsBeingDragged
            return r12
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = 0
            r1.mIsLayoutDirty = r2
            android.view.View r3 = r1.mChildToScrollTo
            if (r3 == 0) goto L15
            boolean r3 = m28881(r3, r1)
            if (r3 == 0) goto L15
            android.view.View r3 = r1.mChildToScrollTo
            r1.m28904(r3)
        L15:
            r3 = 0
            r1.mChildToScrollTo = r3
            boolean r5 = r1.mIsLaidOut
            if (r5 != 0) goto L63
            androidx.core.widget.NestedScrollView$ۥ۟۟۟۟ r5 = r1.mSavedState
            if (r5 == 0) goto L2d
            int r5 = r1.getScrollX()
            androidx.core.widget.NestedScrollView$ۥ۟۟۟۟ r0 = r1.mSavedState
            int r0 = r0.f29004
            r1.scrollTo(r5, r0)
            r1.mSavedState = r3
        L2d:
            int r3 = r1.getChildCount()
            if (r3 <= 0) goto L47
            android.view.View r2 = r1.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getMeasuredHeight()
            int r5 = r3.topMargin
            int r2 = r2 + r5
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
        L47:
            int r6 = r6 - r4
            int r3 = r1.getPaddingTop()
            int r6 = r6 - r3
            int r3 = r1.getPaddingBottom()
            int r6 = r6 - r3
            int r3 = r1.getScrollY()
            int r2 = m28880(r3, r6, r2)
            if (r2 == r3) goto L63
            int r3 = r1.getScrollX()
            r1.scrollTo(r3, r2)
        L63:
            int r2 = r1.getScrollX()
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
            r2 = 1
            r1.mIsLaidOut = r2
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.mFillViewport
            if (r0 != 0) goto L8
            return
        L8:
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            if (r6 != 0) goto Lf
            return
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
            int r1 = r1 + r3
            int r3 = r0.leftMargin
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            int r1 = r1 + r3
            int r0 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r1, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r5, r0)
        L58:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public boolean onNestedFling(@Yue.InterfaceC4410 android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto Lc
            r1 = 0
            r2 = 1
            r0.dispatchNestedFling(r1, r3, r2)
            int r1 = (int) r3
            r0.fling(r1)
            return r2
        Lc:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public boolean onNestedPreFling(@Yue.InterfaceC4410 android.view.View r1, float r2, float r3) {
            r0 = this;
            boolean r1 = r0.dispatchNestedPreFling(r2, r3)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onNestedPreScroll(@Yue.InterfaceC4410 android.view.View r7, int r8, int r9, @Yue.InterfaceC4410 int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.onNestedPreScroll(r1, r2, r3, r4, r5)
            return
    }

    @Override // Yue.InterfaceC4384
    public void onNestedPreScroll(@Yue.InterfaceC4410 android.view.View r7, int r8, int r9, @Yue.InterfaceC4410 int[] r10, int r11) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onNestedScroll(@Yue.InterfaceC4410 android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1 = 0
            r2 = 0
            r0.m28897(r5, r1, r2)
            return
    }

    @Override // Yue.InterfaceC4384
    public void onNestedScroll(@Yue.InterfaceC4410 android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.m28897(r5, r6, r1)
            return
    }

    @Override // Yue.InterfaceC4385
    public void onNestedScroll(@Yue.InterfaceC4410 android.view.View r1, int r2, int r3, int r4, int r5, int r6, @Yue.InterfaceC4410 int[] r7) {
            r0 = this;
            r0.m28897(r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onNestedScrollAccepted(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.onNestedScrollAccepted(r2, r3, r4, r0)
            return
    }

    @Override // Yue.InterfaceC4384
    public void onNestedScrollAccepted(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.View r3, int r4, int r5) {
            r1 = this;
            Yue.ۥۡۢۢۤ r0 = r1.mParentHelper
            r0.m17254(r2, r3, r4, r5)
            r2 = 2
            r1.startNestedScroll(r2, r5)
            return
    }

    @Override // android.view.View
    public void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.scrollTo(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int r4, android.graphics.Rect r5) {
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
            return r1
        L23:
            boolean r2 = r3.m28895(r0)
            if (r2 == 0) goto L2a
            return r1
        L2a:
            boolean r4 = r0.requestFocus(r4, r5)
            return r4
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.widget.NestedScrollView.C7515
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.core.widget.NestedScrollView$ۥ۟۟۟۟ r2 = (androidx.core.widget.NestedScrollView.C7515) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.mSavedState = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    @Yue.InterfaceC4410
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.core.widget.NestedScrollView$ۥ۟۟۟۟ r1 = new androidx.core.widget.NestedScrollView$ۥ۟۟۟۟
            r1.<init>(r0)
            int r0 = r2.getScrollY()
            r1.f29004 = r0
            return r1
    }

    @Override // android.view.View
    public void onScrollChanged(int r7, int r8, int r9, int r10) {
            r6 = this;
            super.onScrollChanged(r7, r8, r9, r10)
            androidx.core.widget.NestedScrollView$ۥ۟۟۟ r0 = r6.mOnScrollChangeListener
            if (r0 == 0) goto Lf
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.mo23574(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L26
            if (r0 != r1) goto Lc
            goto L26
        Lc:
            r2 = 0
            boolean r2 = r0.m28896(r1, r2, r4)
            if (r2 == 0) goto L26
            android.graphics.Rect r2 = r0.mTempRect
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r0.mTempRect
            r0.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r1 = r0.mTempRect
            int r1 = r0.computeScrollDeltaToGetChildRectOnScreen(r1)
            r0.m28885(r1)
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public boolean onStartNestedScroll(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.onStartNestedScroll(r2, r3, r4, r0)
            return r2
    }

    @Override // Yue.InterfaceC4384
    public boolean onStartNestedScroll(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onStopNestedScroll(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.onStopNestedScroll(r2, r0)
            return
    }

    @Override // Yue.InterfaceC4384
    public void onStopNestedScroll(@Yue.InterfaceC4410 android.view.View r2, int r3) {
            r1 = this;
            Yue.ۥۡۢۢۤ r0 = r1.mParentHelper
            r0.m17256(r2, r3)
            r1.stopNestedScroll(r3)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Yue.InterfaceC4410 android.view.MotionEvent r13) {
            r12 = this;
            r12.m28893()
            int r0 = r13.getActionMasked()
            r1 = 0
            if (r0 != 0) goto Lc
            r12.mNestedYOffset = r1
        Lc:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r13)
            int r3 = r12.mNestedYOffset
            float r3 = (float) r3
            r4 = 0
            r2.offsetLocation(r4, r3)
            r3 = 1
            if (r0 == 0) goto L134
            if (r0 == r3) goto Le8
            r4 = 2
            if (r0 == r4) goto L78
            r1 = 3
            if (r0 == r1) goto L4f
            r1 = 5
            if (r0 == r1) goto L3c
            r1 = 6
            if (r0 == r1) goto L2a
            goto L15f
        L2a:
            r12.m28898(r13)
            int r0 = r12.mActivePointerId
            int r0 = r13.findPointerIndex(r0)
            float r13 = r13.getY(r0)
            int r13 = (int) r13
            r12.mLastMotionY = r13
            goto L15f
        L3c:
            int r0 = r13.getActionIndex()
            float r1 = r13.getY(r0)
            int r1 = (int) r1
            r12.mLastMotionY = r1
            int r13 = r13.getPointerId(r0)
            r12.mActivePointerId = r13
            goto L15f
        L4f:
            boolean r13 = r12.mIsBeingDragged
            if (r13 == 0) goto L73
            int r13 = r12.getChildCount()
            if (r13 <= 0) goto L73
            android.widget.OverScroller r4 = r12.mScroller
            int r5 = r12.getScrollX()
            int r6 = r12.getScrollY()
            r9 = 0
            int r10 = r12.getScrollRange()
            r7 = 0
            r8 = 0
            boolean r13 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r13 == 0) goto L73
            r12.postInvalidateOnAnimation()
        L73:
            r12.m28887()
            goto L15f
        L78:
            int r0 = r12.mActivePointerId
            int r0 = r13.findPointerIndex(r0)
            r4 = -1
            if (r0 != r4) goto La0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Invalid pointerId="
            r13.append(r0)
            int r0 = r12.mActivePointerId
            r13.append(r0)
            java.lang.String r0 = " in onTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L15f
        La0:
            float r4 = r13.getY(r0)
            int r4 = (int) r4
            int r5 = r12.mLastMotionY
            int r5 = r5 - r4
            float r6 = r13.getX(r0)
            int r6 = r12.m28900(r5, r6)
            int r5 = r5 - r6
            boolean r6 = r12.mIsBeingDragged
            if (r6 != 0) goto Ld1
            int r6 = java.lang.Math.abs(r5)
            int r7 = r12.mTouchSlop
            if (r6 <= r7) goto Ld1
            android.view.ViewParent r6 = r12.getParent()
            if (r6 == 0) goto Lc6
            r6.requestDisallowInterceptTouchEvent(r3)
        Lc6:
            r12.mIsBeingDragged = r3
            if (r5 <= 0) goto Lce
            int r6 = r12.mTouchSlop
            int r5 = r5 - r6
            goto Ld1
        Lce:
            int r6 = r12.mTouchSlop
            int r5 = r5 + r6
        Ld1:
            boolean r6 = r12.mIsBeingDragged
            if (r6 == 0) goto L15f
            float r13 = r13.getX(r0)
            int r13 = (int) r13
            int r13 = r12.m28903(r5, r13, r1, r1)
            int r4 = r4 - r13
            r12.mLastMotionY = r4
            int r0 = r12.mNestedYOffset
            int r0 = r0 + r13
            r12.mNestedYOffset = r0
            goto L15f
        Le8:
            android.view.VelocityTracker r13 = r12.mVelocityTracker
            int r0 = r12.mMaximumVelocity
            float r0 = (float) r0
            r1 = 1000(0x3e8, float:1.401E-42)
            r13.computeCurrentVelocity(r1, r0)
            int r0 = r12.mActivePointerId
            float r13 = r13.getYVelocity(r0)
            int r13 = (int) r13
            int r0 = java.lang.Math.abs(r13)
            int r1 = r12.mMinimumVelocity
            if (r0 < r1) goto L116
            boolean r0 = r12.m28886(r13)
            if (r0 != 0) goto L130
            int r13 = -r13
            float r0 = (float) r13
            boolean r1 = r12.dispatchNestedPreFling(r4, r0)
            if (r1 != 0) goto L130
            r12.dispatchNestedFling(r4, r0, r3)
            r12.fling(r13)
            goto L130
        L116:
            android.widget.OverScroller r5 = r12.mScroller
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r10 = 0
            int r11 = r12.getScrollRange()
            r8 = 0
            r9 = 0
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L130
            r12.postInvalidateOnAnimation()
        L130:
            r12.m28887()
            goto L15f
        L134:
            int r0 = r12.getChildCount()
            if (r0 != 0) goto L13b
            return r1
        L13b:
            boolean r0 = r12.mIsBeingDragged
            if (r0 == 0) goto L148
            android.view.ViewParent r0 = r12.getParent()
            if (r0 == 0) goto L148
            r0.requestDisallowInterceptTouchEvent(r3)
        L148:
            android.widget.OverScroller r0 = r12.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L153
            r12.m28882()
        L153:
            float r0 = r13.getY()
            int r0 = (int) r0
            int r13 = r13.getPointerId(r1)
            r12.m28894(r0, r13)
        L15f:
            android.view.VelocityTracker r13 = r12.mVelocityTracker
            if (r13 == 0) goto L166
            r13.addMovement(r2)
        L166:
            r2.recycle()
            return r3
    }

    public boolean overScrollByCompat(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = r5
            goto L14
        L13:
            r2 = r4
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = r5
            goto L21
        L20:
            r3 = r4
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = r4
            goto L2b
        L2a:
            r2 = r5
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = r4
            goto L35
        L34:
            r1 = r5
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = r4
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = r4
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
            r2 = r5
            goto L56
        L50:
            if (r3 >= r7) goto L55
            r2 = r5
            r3 = r7
            goto L56
        L55:
            r2 = r4
        L56:
            if (r6 <= r1) goto L5b
            r6 = r1
            r1 = r5
            goto L61
        L5b:
            if (r6 >= r8) goto L60
            r1 = r5
            r6 = r8
            goto L61
        L60:
            r1 = r4
        L61:
            if (r1 == 0) goto L80
            boolean r7 = r12.hasNestedScrollingParent(r5)
            if (r7 != 0) goto L80
            android.widget.OverScroller r7 = r0.mScroller
            r8 = 0
            int r9 = r12.getScrollRange()
            r10 = 0
            r11 = 0
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r10
            r17 = r11
            r18 = r8
            r19 = r9
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L80:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L87
            if (r1 == 0) goto L88
        L87:
            r4 = r5
        L88:
            return r4
    }

    public boolean pageScroll(int r5) {
            r4 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            r2 = 1
            if (r5 != r0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r3 = r4.getHeight()
            if (r0 == 0) goto L40
            android.graphics.Rect r0 = r4.mTempRect
            int r1 = r4.getScrollY()
            int r1 = r1 + r3
            r0.top = r1
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L51
            int r0 = r0 - r2
            android.view.View r0 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r4.getPaddingBottom()
            int r0 = r0 + r1
            android.graphics.Rect r1 = r4.mTempRect
            int r2 = r1.top
            int r2 = r2 + r3
            if (r2 <= r0) goto L51
            int r0 = r0 - r3
            r1.top = r0
            goto L51
        L40:
            android.graphics.Rect r0 = r4.mTempRect
            int r2 = r4.getScrollY()
            int r2 = r2 - r3
            r0.top = r2
            android.graphics.Rect r0 = r4.mTempRect
            int r2 = r0.top
            if (r2 >= 0) goto L51
            r0.top = r1
        L51:
            android.graphics.Rect r0 = r4.mTempRect
            int r1 = r0.top
            int r3 = r3 + r1
            r0.bottom = r3
            boolean r5 = r4.m28902(r5, r1, r3)
            return r5
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r1.mIsLayoutDirty
            if (r0 != 0) goto L8
            r1.m28904(r3)
            goto La
        L8:
            r1.mChildToScrollTo = r3
        La:
            super.requestChildFocus(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@Yue.InterfaceC4410 android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            int r0 = r3.getLeft()
            int r1 = r3.getScrollX()
            int r0 = r0 - r1
            int r1 = r3.getTop()
            int r3 = r3.getScrollY()
            int r1 = r1 - r3
            r4.offset(r0, r1)
            boolean r3 = r2.m28905(r4, r5)
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.m28899()
        L5:
            super.requestDisallowInterceptTouchEvent(r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            r0 = 1
            r1.mIsLayoutDirty = r0
            super.requestLayout()
            return
    }

    @Override // android.view.View
    public void scrollTo(int r7, int r8) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L58
            r0 = 0
            android.view.View r0 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r6.getWidth()
            int r3 = r6.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r6.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r0.getWidth()
            int r4 = r1.leftMargin
            int r3 = r3 + r4
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            int r0 = r0.getHeight()
            int r5 = r1.topMargin
            int r0 = r0 + r5
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r7 = m28880(r7, r2, r3)
            int r8 = m28880(r8, r4, r0)
            int r0 = r6.getScrollX()
            if (r7 != r0) goto L55
            int r0 = r6.getScrollY()
            if (r8 == r0) goto L58
        L55:
            super.scrollTo(r7, r8)
        L58:
            return
    }

    public void setFillViewport(boolean r2) {
            r1 = this;
            boolean r0 = r1.mFillViewport
            if (r2 == r0) goto L9
            r1.mFillViewport = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.mChildHelper
            r0.m17246(r2)
            return
    }

    public void setOnScrollChangeListener(@Yue.InterfaceC4544 androidx.core.widget.NestedScrollView.InterfaceC7514 r1) {
            r0 = this;
            r0.mOnScrollChangeListener = r1
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.mSmoothScrollingEnabled = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void smoothScrollBy(int r3, int r4) {
            r2 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1 = 0
            r2.m28907(r3, r4, r0, r1)
            return
    }

    public final void smoothScrollBy(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.m28907(r2, r3, r4, r0)
            return
    }

    public final void smoothScrollTo(int r3, int r4) {
            r2 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1 = 0
            r2.smoothScrollTo(r3, r4, r0, r1)
            return
    }

    public final void smoothScrollTo(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.smoothScrollTo(r2, r3, r4, r0)
            return
    }

    public void smoothScrollTo(int r2, int r3, int r4, boolean r5) {
            r1 = this;
            int r0 = r1.getScrollX()
            int r2 = r2 - r0
            int r0 = r1.getScrollY()
            int r3 = r3 - r0
            r1.m28907(r2, r3, r4, r5)
            return
    }

    public void smoothScrollTo(int r2, int r3, boolean r4) {
            r1 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1.smoothScrollTo(r2, r3, r0, r4)
            return
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean startNestedScroll(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.startNestedScroll(r2, r0)
            return r2
    }

    @Override // Yue.InterfaceC4380
    public boolean startNestedScroll(int r2, int r3) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.mChildHelper
            boolean r2 = r0.m17249(r2, r3)
            return r2
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.stopNestedScroll(r0)
            return
    }

    @Override // Yue.InterfaceC4380
    public void stopNestedScroll(int r2) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.mChildHelper
            r0.m17251(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m28882() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            r0.abortAnimation()
            r0 = 1
            r1.stopNestedScroll(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m28883() {
            r2 = this;
            int r0 = r2.getOverScrollMode()
            r1 = 1
            if (r0 == 0) goto L11
            if (r0 != r1) goto L10
            int r0 = r2.getScrollRange()
            if (r0 <= 0) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m28884() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2c
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
            if (r0 <= r2) goto L2c
            r1 = 1
        L2c:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m28885(int r3) {
            r2 = this;
            if (r3 == 0) goto Le
            boolean r0 = r2.mSmoothScrollingEnabled
            r1 = 0
            if (r0 == 0) goto Lb
            r2.smoothScrollBy(r1, r3)
            goto Le
        Lb:
            r2.scrollBy(r1, r3)
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m28886(int r3) {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.mEdgeGlowTop
            float r0 = Yue.C2083.m9732(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1e
            android.widget.EdgeEffect r0 = r2.mEdgeGlowTop
            boolean r0 = r2.m28906(r0, r3)
            if (r0 == 0) goto L19
            android.widget.EdgeEffect r0 = r2.mEdgeGlowTop
            r0.onAbsorb(r3)
            goto L3a
        L19:
            int r3 = -r3
            r2.fling(r3)
            goto L3a
        L1e:
            android.widget.EdgeEffect r0 = r2.mEdgeGlowBottom
            float r0 = Yue.C2083.m9732(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L3c
            android.widget.EdgeEffect r0 = r2.mEdgeGlowBottom
            int r3 = -r3
            boolean r0 = r2.m28906(r0, r3)
            if (r0 == 0) goto L37
            android.widget.EdgeEffect r0 = r2.mEdgeGlowBottom
            r0.onAbsorb(r3)
            goto L3a
        L37:
            r2.fling(r3)
        L3a:
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m28887() {
            r1 = this;
            r0 = -1
            r1.mActivePointerId = r0
            r0 = 0
            r1.mIsBeingDragged = r0
            r1.m28899()
            r1.stopNestedScroll(r0)
            android.widget.EdgeEffect r0 = r1.mEdgeGlowTop
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.mEdgeGlowBottom
            r0.onRelease()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final android.view.View m28888(boolean r13, int r14, int r15) {
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final float m28889(int r9) {
            r8 = this;
            int r9 = java.lang.Math.abs(r9)
            float r9 = (float) r9
            r0 = 1051931443(0x3eb33333, float:0.35)
            float r9 = r9 * r0
            float r0 = r8.mPhysicalCoeff
            r1 = 1014350479(0x3c75c28f, float:0.015)
            float r0 = r0 * r1
            float r9 = r9 / r0
            double r2 = (double) r9
            double r2 = java.lang.Math.log(r2)
            float r9 = androidx.core.widget.NestedScrollView.DECELERATION_RATE
            double r4 = (double) r9
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r6
            float r0 = r8.mPhysicalCoeff
            float r0 = r0 * r1
            double r0 = (double) r0
            double r6 = (double) r9
            double r6 = r6 / r4
            double r6 = r6 * r2
            double r2 = java.lang.Math.exp(r6)
            double r0 = r0 * r2
            float r9 = (float) r0
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m28890(int r5, int r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2a
            int r0 = r4.getScrollY()
            android.view.View r2 = r4.getChildAt(r1)
            int r3 = r2.getTop()
            int r3 = r3 - r0
            if (r6 < r3) goto L2a
            int r3 = r2.getBottom()
            int r3 = r3 - r0
            if (r6 >= r3) goto L2a
            int r6 = r2.getLeft()
            if (r5 < r6) goto L2a
            int r6 = r2.getRight()
            if (r5 >= r6) goto L2a
            r1 = 1
        L2a:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m28891() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 != 0) goto Lb
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
            goto Le
        Lb:
            r0.clear()
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m28892() {
            r2 = this;
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mScroller = r0
            r0 = 1
            r2.setFocusable(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r2.setDescendantFocusability(r0)
            r0 = 0
            r2.setWillNotDraw(r0)
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r1 = r0.getScaledTouchSlop()
            r2.mTouchSlop = r1
            int r1 = r0.getScaledMinimumFlingVelocity()
            r2.mMinimumVelocity = r1
            int r0 = r0.getScaledMaximumFlingVelocity()
            r2.mMaximumVelocity = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m28893() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
        La:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m28894(int r1, int r2) {
            r0 = this;
            r0.mLastMotionY = r1
            r0.mActivePointerId = r2
            r1 = 2
            r2 = 0
            r0.startNestedScroll(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m28895(android.view.View r3) {
            r2 = this;
            r0 = 0
            int r1 = r2.getHeight()
            boolean r3 = r2.m28896(r3, r0, r1)
            r3 = r3 ^ 1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m28896(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = r1.mTempRect
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.mTempRect
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.mTempRect
            int r2 = r2.bottom
            int r2 = r2 + r3
            int r0 = r1.getScrollY()
            if (r2 < r0) goto L23
            android.graphics.Rect r2 = r1.mTempRect
            int r2 = r2.top
            int r2 = r2 - r3
            int r3 = r1.getScrollY()
            int r3 = r3 + r4
            if (r2 > r3) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m28897(int r11, int r12, @Yue.InterfaceC4544 int[] r13) {
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
            Yue.ۥۡۢۢ۠ r2 = r10.mChildHelper
            r5 = 0
            r7 = 0
            r3 = 0
            r8 = r12
            r9 = r13
            r2.m17235(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m28898(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.mActivePointerId
            if (r1 != r2) goto L25
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.mLastMotionY = r1
            int r4 = r4.getPointerId(r0)
            r3.mActivePointerId = r4
            android.view.VelocityTracker r4 = r3.mVelocityTracker
            if (r4 == 0) goto L25
            r4.clear()
        L25:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m28899() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        La:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int m28900(int r4, float r5) {
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            float r0 = Yue.C2083.m9732(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            float r4 = -r4
            float r4 = Yue.C2083.m9734(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.mEdgeGlowTop
            float r5 = Yue.C2083.m9732(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.mEdgeGlowTop
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            float r0 = Yue.C2083.m9732(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = Yue.C2083.m9734(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.mEdgeGlowBottom
            float r5 = Yue.C2083.m9732(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.mEdgeGlowBottom
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m28901(boolean r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto L8
            r2 = 2
            r1.startNestedScroll(r2, r0)
            goto Lb
        L8:
            r1.stopNestedScroll(r0)
        Lb:
            int r2 = r1.getScrollY()
            r1.mLastScrollerY = r2
            r1.postInvalidateOnAnimation()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean m28902(int r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.getHeight()
            int r1 = r6.getScrollY()
            int r0 = r0 + r1
            r2 = 33
            r3 = 0
            r4 = 1
            if (r7 != r2) goto L11
            r2 = r4
            goto L12
        L11:
            r2 = r3
        L12:
            android.view.View r5 = r6.m28888(r2, r8, r9)
            if (r5 != 0) goto L19
            r5 = r6
        L19:
            if (r8 < r1) goto L1e
            if (r9 > r0) goto L1e
            goto L28
        L1e:
            if (r2 == 0) goto L22
            int r8 = r8 - r1
            goto L24
        L22:
            int r8 = r9 - r0
        L24:
            r6.m28903(r8, r3, r4, r4)
            r3 = r4
        L28:
            android.view.View r8 = r6.findFocus()
            if (r5 == r8) goto L31
            r5.requestFocus(r7)
        L31:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int m28903(int r22, int r23, int r24, boolean r25) {
            r21 = this;
            r10 = r21
            r11 = r23
            r12 = r24
            r13 = 1
            if (r12 != r13) goto Ld
            r0 = 2
            r10.startNestedScroll(r0, r12)
        Ld:
            int[] r3 = r10.mScrollConsumed
            int[] r4 = r10.mScrollOffset
            r1 = 0
            r0 = r21
            r2 = r22
            r5 = r24
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            r14 = 0
            if (r0 == 0) goto L2d
            int[] r0 = r10.mScrollConsumed
            r0 = r0[r13]
            int r0 = r22 - r0
            int[] r1 = r10.mScrollOffset
            r1 = r1[r13]
            r15 = r0
            r16 = r1
            goto L31
        L2d:
            r15 = r22
            r16 = r14
        L31:
            int r17 = r21.getScrollY()
            int r9 = r21.getScrollRange()
            boolean r0 = r21.m28883()
            if (r0 == 0) goto L44
            if (r25 != 0) goto L44
            r18 = r13
            goto L46
        L44:
            r18 = r14
        L46:
            r8 = 0
            r19 = 1
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r0 = r21
            r2 = r15
            r4 = r17
            r6 = r9
            r20 = r9
            r9 = r19
            boolean r0 = r0.overScrollByCompat(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L65
            boolean r0 = r10.hasNestedScrollingParent(r12)
            if (r0 != 0) goto L65
            r8 = r13
            goto L66
        L65:
            r8 = r14
        L66:
            int r0 = r21.getScrollY()
            int r2 = r0 - r17
            int r4 = r15 - r2
            int[] r7 = r10.mScrollConsumed
            r7[r13] = r14
            r3 = 0
            int[] r5 = r10.mScrollOffset
            r1 = 0
            r0 = r21
            r6 = r24
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r10.mScrollOffset
            r0 = r0[r13]
            int r16 = r16 + r0
            int[] r0 = r10.mScrollConsumed
            r0 = r0[r13]
            int r15 = r15 - r0
            int r0 = r17 + r15
            if (r0 >= 0) goto Lb0
            if (r18 == 0) goto Ld9
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            int r1 = -r15
            float r1 = (float) r1
            int r2 = r21.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r11
            int r3 = r21.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            Yue.C2083.m9734(r0, r1, r2)
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto Ld9
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            r0.onRelease()
            goto Ld9
        Lb0:
            r1 = r20
            if (r0 <= r1) goto Ld9
            if (r18 == 0) goto Ld9
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            float r1 = (float) r15
            int r2 = r21.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r11
            int r3 = r21.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r2
            Yue.C2083.m9734(r0, r1, r3)
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto Ld9
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            r0.onRelease()
        Ld9:
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto Lec
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto Lea
            goto Lec
        Lea:
            r14 = r8
            goto Lef
        Lec:
            r21.postInvalidateOnAnimation()
        Lef:
            if (r14 == 0) goto Lfa
            if (r12 != 0) goto Lfa
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            if (r0 == 0) goto Lfa
            r0.clear()
        Lfa:
            if (r12 != r13) goto L109
            r10.stopNestedScroll(r12)
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            r0.onRelease()
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            r0.onRelease()
        L109:
            return r16
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m28904(android.view.View r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.mTempRect
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.mTempRect
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.mTempRect
            int r2 = r1.computeScrollDeltaToGetChildRectOnScreen(r2)
            if (r2 == 0) goto L16
            r0 = 0
            r1.scrollBy(r0, r2)
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean m28905(android.graphics.Rect r3, boolean r4) {
            r2 = this;
            int r3 = r2.computeScrollDeltaToGetChildRectOnScreen(r3)
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r0
        La:
            if (r1 == 0) goto L15
            if (r4 == 0) goto L12
            r2.scrollBy(r0, r3)
            goto L15
        L12:
            r2.smoothScrollBy(r0, r3)
        L15:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean m28906(@Yue.InterfaceC4410 android.widget.EdgeEffect r3, int r4) {
            r2 = this;
            r0 = 1
            if (r4 <= 0) goto L4
            return r0
        L4:
            float r3 = Yue.C2083.m9732(r3)
            int r1 = r2.getHeight()
            float r1 = (float) r1
            float r3 = r3 * r1
            int r4 = -r4
            float r4 = r2.m28889(r4)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m28907(int r9, int r10, int r11, boolean r12) {
            r8 = this;
            int r0 = r8.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r8.mLastScroll
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5a
            r9 = 0
            android.view.View r0 = r8.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getHeight()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r8.getHeight()
            int r2 = r8.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r8.getPaddingBottom()
            int r1 = r1 - r2
            int r4 = r8.getScrollY()
            int r0 = r0 - r1
            int r0 = java.lang.Math.max(r9, r0)
            int r10 = r10 + r4
            int r10 = java.lang.Math.min(r10, r0)
            int r9 = java.lang.Math.max(r9, r10)
            int r6 = r9 - r4
            android.widget.OverScroller r2 = r8.mScroller
            int r3 = r8.getScrollX()
            r5 = 0
            r7 = r11
            r2.startScroll(r3, r4, r5, r6, r7)
            r8.m28901(r12)
            goto L68
        L5a:
            android.widget.OverScroller r11 = r8.mScroller
            boolean r11 = r11.isFinished()
            if (r11 != 0) goto L65
            r8.m28882()
        L65:
            r8.scrollBy(r9, r10)
        L68:
            long r9 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r8.mLastScroll = r9
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final boolean m28908(android.view.MotionEvent r6) {
            r5 = this;
            android.widget.EdgeEffect r0 = r5.mEdgeGlowTop
            float r0 = Yue.C2083.m9732(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L1d
            android.widget.EdgeEffect r0 = r5.mEdgeGlowTop
            float r3 = r6.getX()
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            Yue.C2083.m9734(r0, r1, r3)
            r0 = r2
            goto L1e
        L1d:
            r0 = 0
        L1e:
            android.widget.EdgeEffect r3 = r5.mEdgeGlowBottom
            float r3 = Yue.C2083.m9732(r3)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L3b
            android.widget.EdgeEffect r0 = r5.mEdgeGlowBottom
            float r6 = r6.getX()
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r6 = r6 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r6
            Yue.C2083.m9734(r0, r1, r3)
            goto L3c
        L3b:
            r2 = r0
        L3c:
            return r2
    }
}
