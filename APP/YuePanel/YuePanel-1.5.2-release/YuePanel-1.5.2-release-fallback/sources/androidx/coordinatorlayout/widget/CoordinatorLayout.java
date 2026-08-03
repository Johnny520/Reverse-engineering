package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements Yue.InterfaceC4384, Yue.InterfaceC4385 {
    static final java.lang.Class<?>[] CONSTRUCTOR_PARAMS = null;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final java.lang.String TAG = "CoordinatorLayout";
    static final java.util.Comparator<android.view.View> TOP_SORTED_CHILDREN_COMPARATOR = null;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final java.lang.String WIDGET_PACKAGE_NAME = null;
    static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493>>> sConstructors = null;
    private static final Yue.C4820.InterfaceC4821<android.graphics.Rect> sRectPool = null;
    private Yue.InterfaceC4606 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private android.view.View mBehaviorTouchView;
    private final Yue.C1856<android.view.View> mChildDag;
    private final java.util.List<android.view.View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private Yue.C7065 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final Yue.C4387 mNestedScrollingParentHelper;
    private android.view.View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private androidx.coordinatorlayout.widget.CoordinatorLayout.ViewTreeObserverOnPreDrawListenerC7498 mOnPreDrawListener;
    private android.graphics.Paint mScrimPaint;
    private android.graphics.drawable.Drawable mStatusBarBackground;
    private final java.util.List<android.view.View> mTempDependenciesList;
    private final java.util.List<android.view.View> mTempList1;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ, reason: contains not printable characters */
    public class C7491 implements Yue.InterfaceC4606 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f28942;

        public C7491(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.f28942 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC4606
        public Yue.C7065 onApplyWindowInsets(android.view.View r1, Yue.C7065 r2) {
                r0 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r0.f28942
                Yue.ۥۢۥۦ r1 = r1.setWindowInsets(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC7492 {
        @Yue.InterfaceC4410
        androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493 getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7493<V extends android.view.View> {
        public AbstractC7493() {
                r0 = this;
                r0.<init>()
                return
        }

        public AbstractC7493(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4544
        public static java.lang.Object getTag(@Yue.InterfaceC4410 android.view.View r0) {
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
                java.lang.Object r0 = r0.f28961
                return r0
        }

        public static void setTag(@Yue.InterfaceC4410 android.view.View r0, @Yue.InterfaceC4544 java.lang.Object r1) {
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
                r0.f28961 = r1
                return
        }

        public boolean blocksInteractionBelow(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2) {
                r0 = this;
                float r1 = r0.getScrimOpacity(r1, r2)
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 <= 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                return r1
        }

        public boolean getInsetDodgeRect(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.graphics.Rect r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Yue.InterfaceC1230
        public int getScrimColor(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2) {
                r0 = this;
                r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                return r1
        }

        @Yue.InterfaceC2458(from = 0.0d, to = 1.0d)
        public float getScrimOpacity(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean layoutDependsOn(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Yue.InterfaceC4410
        public Yue.C7065 onApplyWindowInsets(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 Yue.C7065 r3) {
                r0 = this;
                return r3
        }

        public void onAttachedToLayoutParams(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout.C7497 r1) {
                r0 = this;
                return
        }

        public boolean onDependentViewChanged(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onDependentViewRemoved(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3) {
                r0 = this;
                return
        }

        public void onDetachedFromLayoutParams() {
                r0 = this;
                return
        }

        public boolean onInterceptTouchEvent(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onLayoutChild(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onMeasureChild(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onNestedFling(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, float r4, float r5, boolean r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onNestedPreFling(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, float r4, float r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        @java.lang.Deprecated
        public void onNestedPreScroll(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, int r4, int r5, @Yue.InterfaceC4410 int[] r6) {
                r0 = this;
                return
        }

        public void onNestedPreScroll(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, int r4, int r5, @Yue.InterfaceC4410 int[] r6, int r7) {
                r0 = this;
                if (r7 != 0) goto L5
                r0.onNestedPreScroll(r1, r2, r3, r4, r5, r6)
            L5:
                return
        }

        @java.lang.Deprecated
        public void onNestedScroll(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, int r4, int r5, int r6, int r7) {
                r0 = this;
                return
        }

        @java.lang.Deprecated
        public void onNestedScroll(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, int r4, int r5, int r6, int r7, int r8) {
                r0 = this;
                if (r8 != 0) goto L5
                r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            L5:
                return
        }

        public void onNestedScroll(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r3, @Yue.InterfaceC4410 V r4, @Yue.InterfaceC4410 android.view.View r5, int r6, int r7, int r8, int r9, int r10, @Yue.InterfaceC4410 int[] r11) {
                r2 = this;
                r0 = 0
                r1 = r11[r0]
                int r1 = r1 + r8
                r11[r0] = r1
                r0 = 1
                r1 = r11[r0]
                int r1 = r1 + r9
                r11[r0] = r1
                r2.onNestedScroll(r3, r4, r5, r6, r7, r8, r9, r10)
                return
        }

        @java.lang.Deprecated
        public void onNestedScrollAccepted(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.view.View r4, int r5) {
                r0 = this;
                return
        }

        public void onNestedScrollAccepted(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.view.View r4, int r5, int r6) {
                r0 = this;
                if (r6 != 0) goto L5
                r0.onNestedScrollAccepted(r1, r2, r3, r4, r5)
            L5:
                return
        }

        public boolean onRequestChildRectangleOnScreen(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.graphics.Rect r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onRestoreInstanceState(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.os.Parcelable r3) {
                r0 = this;
                return
        }

        @Yue.InterfaceC4544
        public android.os.Parcelable onSaveInstanceState(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2) {
                r0 = this;
                android.view.AbsSavedState r1 = android.view.View.BaseSavedState.EMPTY_STATE
                return r1
        }

        @java.lang.Deprecated
        public boolean onStartNestedScroll(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.view.View r4, int r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean onStartNestedScroll(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.view.View r4, int r5, int r6) {
                r0 = this;
                if (r6 != 0) goto L7
                boolean r1 = r0.onStartNestedScroll(r1, r2, r3, r4, r5)
                return r1
            L7:
                r1 = 0
                return r1
        }

        @java.lang.Deprecated
        public void onStopNestedScroll(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3) {
                r0 = this;
                return
        }

        public void onStopNestedScroll(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.View r3, int r4) {
                r0 = this;
                if (r4 != 0) goto L5
                r0.onStopNestedScroll(r1, r2, r3)
            L5:
                return
        }

        public boolean onTouchEvent(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 V r2, @Yue.InterfaceC4410 android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟, reason: contains not printable characters */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.Deprecated
    public @interface InterfaceC7494 {
        java.lang.Class<? extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493> value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC7495 {
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟۠, reason: contains not printable characters */
    public class ViewGroupOnHierarchyChangeListenerC7496 implements android.view.ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f28943;

        public ViewGroupOnHierarchyChangeListenerC7496(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.f28943 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r2, android.view.View r3) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.f28943
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.mOnHierarchyChangeListener
                if (r0 == 0) goto L9
                r0.onChildViewAdded(r2, r3)
            L9:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r3, android.view.View r4) {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.f28943
                r1 = 2
                r0.onChildViewsChanged(r1)
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.f28943
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.mOnHierarchyChangeListener
                if (r0 == 0) goto Lf
                r0.onChildViewRemoved(r3, r4)
            Lf:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C7497 extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493 f28944;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f28945;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f28946;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f28947;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f28948;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f28949;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f28950;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f28951;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f28952;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f28953;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public android.view.View f28954;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public android.view.View f28955;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f28956;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean f28957;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean f28958;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean f28959;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final android.graphics.Rect f28960;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public java.lang.Object f28961;

        public C7497(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f28945 = r1
                r0.f28946 = r1
                r0.f28947 = r1
                r2 = -1
                r0.f28948 = r2
                r0.f28949 = r2
                r0.f28950 = r1
                r0.f28951 = r1
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f28960 = r1
                return
        }

        public C7497(@Yue.InterfaceC4410 android.content.Context r5, @Yue.InterfaceC4544 android.util.AttributeSet r6) {
                r4 = this;
                r4.<init>(r5, r6)
                r0 = 0
                r4.f28945 = r0
                r4.f28946 = r0
                r4.f28947 = r0
                r1 = -1
                r4.f28948 = r1
                r4.f28949 = r1
                r4.f28950 = r0
                r4.f28951 = r0
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r4.f28960 = r2
                int[] r2 = Yue.C5161.C5171.f19277
                android.content.res.TypedArray r2 = r5.obtainStyledAttributes(r6, r2)
                int r3 = Yue.C5161.C5171.f19278
                int r3 = r2.getInteger(r3, r0)
                r4.f28946 = r3
                int r3 = Yue.C5161.C5171.f19279
                int r3 = r2.getResourceId(r3, r1)
                r4.f28949 = r3
                int r3 = Yue.C5161.C5171.f19280
                int r3 = r2.getInteger(r3, r0)
                r4.f28947 = r3
                int r3 = Yue.C5161.C5171.f19284
                int r1 = r2.getInteger(r3, r1)
                r4.f28948 = r1
                int r1 = Yue.C5161.C5171.f19283
                int r1 = r2.getInt(r1, r0)
                r4.f28950 = r1
                int r1 = Yue.C5161.C5171.f19282
                int r0 = r2.getInt(r1, r0)
                r4.f28951 = r0
                int r0 = Yue.C5161.C5171.f19281
                boolean r0 = r2.hasValue(r0)
                r4.f28945 = r0
                if (r0 == 0) goto L66
                int r0 = Yue.C5161.C5171.f19281
                java.lang.String r0 = r2.getString(r0)
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.parseBehavior(r5, r6, r0)
                r4.f28944 = r5
            L66:
                r2.recycle()
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r5 = r4.f28944
                if (r5 == 0) goto L70
                r5.onAttachedToLayoutParams(r4)
            L70:
                return
        }

        public C7497(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.f28945 = r2
                r1.f28946 = r2
                r1.f28947 = r2
                r0 = -1
                r1.f28948 = r0
                r1.f28949 = r0
                r1.f28950 = r2
                r1.f28951 = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.f28960 = r2
                return
        }

        public C7497(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.f28945 = r2
                r1.f28946 = r2
                r1.f28947 = r2
                r0 = -1
                r1.f28948 = r0
                r1.f28949 = r0
                r1.f28950 = r2
                r1.f28951 = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.f28960 = r2
                return
        }

        public C7497(androidx.coordinatorlayout.widget.CoordinatorLayout.C7497 r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.f28945 = r2
                r1.f28946 = r2
                r1.f28947 = r2
                r0 = -1
                r1.f28948 = r0
                r1.f28949 = r0
                r1.f28950 = r2
                r1.f28951 = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.f28960 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m28781() {
                r2 = this;
                android.view.View r0 = r2.f28954
                if (r0 != 0) goto Lb
                int r0 = r2.f28949
                r1 = -1
                if (r0 == r1) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean m28782(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
                r1 = this;
                android.view.View r0 = r1.f28955
                if (r4 == r0) goto L1b
                int r0 = Yue.C6794.m26140(r2)
                boolean r0 = r1.m28801(r4, r0)
                if (r0 != 0) goto L1b
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r0 = r1.f28944
                if (r0 == 0) goto L19
                boolean r2 = r0.layoutDependsOn(r2, r3, r4)
                if (r2 == 0) goto L19
                goto L1b
            L19:
                r2 = 0
                goto L1c
            L1b:
                r2 = 1
            L1c:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m28783() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r0 = r1.f28944
                if (r0 != 0) goto L7
                r0 = 0
                r1.f28956 = r0
            L7:
                boolean r0 = r1.f28956
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.view.View m28784(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4) {
                r2 = this;
                int r0 = r2.f28949
                r1 = -1
                if (r0 != r1) goto Lb
                r3 = 0
                r2.f28955 = r3
                r2.f28954 = r3
                return r3
            Lb:
                android.view.View r0 = r2.f28954
                if (r0 == 0) goto L15
                boolean r0 = r2.m28802(r4, r3)
                if (r0 != 0) goto L18
            L15:
                r2.m28795(r4, r3)
            L18:
                android.view.View r3 = r2.f28954
                return r3
        }

        @Yue.InterfaceC3214
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m28785() {
                r1 = this;
                int r0 = r1.f28949
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493 m28786() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r0 = r1.f28944
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean m28787() {
                r1 = this;
                boolean r0 = r1.f28959
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public android.graphics.Rect m28788() {
                r1 = this;
                android.graphics.Rect r0 = r1.f28960
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m28789() {
                r1 = this;
                r0 = 0
                r1.f28955 = r0
                r1.f28954 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean m28790(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4) {
                r2 = this;
                boolean r0 = r2.f28956
                if (r0 == 0) goto L6
                r3 = 1
                return r3
            L6:
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r1 = r2.f28944
                if (r1 == 0) goto Lf
                boolean r3 = r1.blocksInteractionBelow(r3, r4)
                goto L10
            Lf:
                r3 = 0
            L10:
                r3 = r3 | r0
                r2.f28956 = r3
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean m28791(int r2) {
                r1 = this;
                if (r2 == 0) goto La
                r0 = 1
                if (r2 == r0) goto L7
                r2 = 0
                return r2
            L7:
                boolean r2 = r1.f28958
                return r2
            La:
                boolean r2 = r1.f28957
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m28792() {
                r1 = this;
                r0 = 0
                r1.f28959 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void m28793(int r2) {
                r1 = this;
                r0 = 0
                r1.m28800(r2, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m28794() {
                r1 = this;
                r0 = 0
                r1.f28956 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m28795(android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6) {
                r4 = this;
                int r0 = r4.f28949
                android.view.View r0 = r6.findViewById(r0)
                r4.f28954 = r0
                r1 = 0
                if (r0 == 0) goto L4c
                if (r0 != r6) goto L20
                boolean r5 = r6.isInEditMode()
                if (r5 == 0) goto L18
                r4.f28955 = r1
                r4.f28954 = r1
                return
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "View can not be anchored to the the parent CoordinatorLayout"
                r5.<init>(r6)
                throw r5
            L20:
                android.view.ViewParent r2 = r0.getParent()
            L24:
                if (r2 == r6) goto L49
                if (r2 == 0) goto L49
                if (r2 != r5) goto L3d
                boolean r5 = r6.isInEditMode()
                if (r5 == 0) goto L35
                r4.f28955 = r1
                r4.f28954 = r1
                return
            L35:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Anchor must not be a descendant of the anchored view"
                r5.<init>(r6)
                throw r5
            L3d:
                boolean r3 = r2 instanceof android.view.View
                if (r3 == 0) goto L44
                r0 = r2
                android.view.View r0 = (android.view.View) r0
            L44:
                android.view.ViewParent r2 = r2.getParent()
                goto L24
            L49:
                r4.f28955 = r0
                return
            L4c:
                boolean r0 = r6.isInEditMode()
                if (r0 == 0) goto L57
                r4.f28955 = r1
                r4.f28954 = r1
                return
            L57:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
                r1.append(r2)
                android.content.res.Resources r6 = r6.getResources()
                int r2 = r4.f28949
                java.lang.String r6 = r6.getResourceName(r2)
                r1.append(r6)
                java.lang.String r6 = " to anchor view "
                r1.append(r6)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public void m28796(@Yue.InterfaceC3214 int r1) {
                r0 = this;
                r0.m28789()
                r0.f28949 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public void m28797(@Yue.InterfaceC4544 androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493 r2) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r0 = r1.f28944
                if (r0 == r2) goto L16
                if (r0 == 0) goto L9
                r0.onDetachedFromLayoutParams()
            L9:
                r1.f28944 = r2
                r0 = 0
                r1.f28961 = r0
                r0 = 1
                r1.f28945 = r0
                if (r2 == 0) goto L16
                r2.onAttachedToLayoutParams(r1)
            L16:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public void m28798(boolean r1) {
                r0 = this;
                r0.f28959 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void m28799(android.graphics.Rect r2) {
                r1 = this;
                android.graphics.Rect r0 = r1.f28960
                r0.set(r2)
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public void m28800(int r2, boolean r3) {
                r1 = this;
                if (r2 == 0) goto L9
                r0 = 1
                if (r2 == r0) goto L6
                goto Lb
            L6:
                r1.f28958 = r3
                goto Lb
            L9:
                r1.f28957 = r3
            Lb:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final boolean m28801(android.view.View r2, int r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r2
                int r2 = r2.f28950
                int r2 = Yue.C2911.m12423(r2, r3)
                if (r2 == 0) goto L19
                int r0 = r1.f28951
                int r3 = Yue.C2911.m12423(r0, r3)
                r3 = r3 & r2
                if (r3 != r2) goto L19
                r2 = 1
                goto L1a
            L19:
                r2 = 0
            L1a:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final boolean m28802(android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6) {
                r4 = this;
                android.view.View r0 = r4.f28954
                int r0 = r0.getId()
                int r1 = r4.f28949
                r2 = 0
                if (r0 == r1) goto Lc
                return r2
            Lc:
                android.view.View r0 = r4.f28954
                android.view.ViewParent r1 = r0.getParent()
            L12:
                if (r1 == r6) goto L2b
                if (r1 == 0) goto L25
                if (r1 != r5) goto L19
                goto L25
            L19:
                boolean r3 = r1 instanceof android.view.View
                if (r3 == 0) goto L20
                r0 = r1
                android.view.View r0 = (android.view.View) r0
            L20:
                android.view.ViewParent r1 = r1.getParent()
                goto L12
            L25:
                r5 = 0
                r4.f28955 = r5
                r4.f28954 = r5
                return r2
            L2b:
                r4.f28955 = r0
                r5 = 1
                return r5
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class ViewTreeObserverOnPreDrawListenerC7498 implements android.view.ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f28962;

        public ViewTreeObserverOnPreDrawListenerC7498(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.f28962 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.f28962
                r1 = 0
                r0.onChildViewsChanged(r1)
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C7499 extends Yue.AbstractC0025 {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.C7499> CREATOR = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public android.util.SparseArray<android.os.Parcelable> f28963;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟$ۥ, reason: contains not printable characters */
        public static class C7500 implements android.os.Parcelable.ClassLoaderCreator<androidx.coordinatorlayout.widget.CoordinatorLayout.C7499> {
            public C7500() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟ r1 = r0.m28803(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout.C7499 createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟ r1 = r0.m28804(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟[] r1 = r0.m28805(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public androidx.coordinatorlayout.widget.CoordinatorLayout.C7499 m28803(android.os.Parcel r3) {
                    r2 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public androidx.coordinatorlayout.widget.CoordinatorLayout.C7499 m28804(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟
                    r0.<init>(r2, r3)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public androidx.coordinatorlayout.widget.CoordinatorLayout.C7499[] m28805(int r1) {
                    r0 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟[] r1 = new androidx.coordinatorlayout.widget.CoordinatorLayout.C7499[r1]
                    return r1
            }
        }

        static {
                androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟$ۥ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟$ۥ
                r0.<init>()
                androidx.coordinatorlayout.widget.CoordinatorLayout.C7499.CREATOR = r0
                return
        }

        public C7499(android.os.Parcel r6, java.lang.ClassLoader r7) {
                r5 = this;
                r5.<init>(r6, r7)
                int r0 = r6.readInt()
                int[] r1 = new int[r0]
                r6.readIntArray(r1)
                android.os.Parcelable[] r6 = r6.readParcelableArray(r7)
                android.util.SparseArray r7 = new android.util.SparseArray
                r7.<init>(r0)
                r5.f28963 = r7
                r7 = 0
            L18:
                if (r7 >= r0) goto L26
                android.util.SparseArray<android.os.Parcelable> r2 = r5.f28963
                r3 = r1[r7]
                r4 = r6[r7]
                r2.append(r3, r4)
                int r7 = r7 + 1
                goto L18
            L26:
                return
        }

        public C7499(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0025, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r6, int r7) {
                r5 = this;
                super.writeToParcel(r6, r7)
                android.util.SparseArray<android.os.Parcelable> r0 = r5.f28963
                r1 = 0
                if (r0 == 0) goto Ld
                int r0 = r0.size()
                goto Le
            Ld:
                r0 = r1
            Le:
                r6.writeInt(r0)
                int[] r2 = new int[r0]
                android.os.Parcelable[] r3 = new android.os.Parcelable[r0]
            L15:
                if (r1 >= r0) goto L2c
                android.util.SparseArray<android.os.Parcelable> r4 = r5.f28963
                int r4 = r4.keyAt(r1)
                r2[r1] = r4
                android.util.SparseArray<android.os.Parcelable> r4 = r5.f28963
                java.lang.Object r4 = r4.valueAt(r1)
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r3[r1] = r4
                int r1 = r1 + 1
                goto L15
            L2c:
                r6.writeIntArray(r2)
                r6.writeParcelableArray(r3, r7)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C7501 implements java.util.Comparator<android.view.View> {
        public C7501() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.view.View r1, android.view.View r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.View r2 = (android.view.View) r2
                int r1 = r0.m28806(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m28806(android.view.View r2, android.view.View r3) {
                r1 = this;
                float r2 = Yue.C6794.m26172(r2)
                float r3 = Yue.C6794.m26172(r3)
                int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r0 <= 0) goto Le
                r2 = -1
                return r2
            Le:
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 >= 0) goto L14
                r2 = 1
                return r2
            L14:
                r2 = 0
                return r2
        }
    }

    static {
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.getName()
            goto Le
        Ld:
            r0 = 0
        Le:
            androidx.coordinatorlayout.widget.CoordinatorLayout.WIDGET_PACKAGE_NAME = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۤ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۤ
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR = r0
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            androidx.coordinatorlayout.widget.CoordinatorLayout.CONSTRUCTOR_PARAMS = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.sConstructors = r0
            Yue.ۥۡۤۤ۠$ۥ۟۟ r0 = new Yue.ۥۡۤۤ۠$ۥ۟۟
            r1 = 12
            r0.<init>(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool = r0
            return
    }

    public CoordinatorLayout(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CoordinatorLayout(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5161.C5162.f19119
            r1.<init>(r2, r3, r0)
            return
    }

    public CoordinatorLayout(@Yue.InterfaceC4410 android.content.Context r10, @Yue.InterfaceC4544 android.util.AttributeSet r11, @Yue.InterfaceC0642 int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mDependencySortedChildren = r0
            Yue.ۥ۠۟ۡۤ r0 = new Yue.ۥ۠۟ۡۤ
            r0.<init>()
            r9.mChildDag = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mTempList1 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mTempDependenciesList = r0
            r0 = 2
            int[] r1 = new int[r0]
            r9.mBehaviorConsumed = r1
            int[] r0 = new int[r0]
            r9.mNestedScrollingV2ConsumedCompat = r0
            Yue.ۥۡۢۢۤ r0 = new Yue.ۥۡۢۢۤ
            r0.<init>(r9)
            r9.mNestedScrollingParentHelper = r0
            r0 = 0
            if (r12 != 0) goto L3b
            int[] r1 = Yue.C5161.C5171.f19274
            int r2 = Yue.C5161.C5170.f19267
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r0, r2)
            goto L41
        L3b:
            int[] r1 = Yue.C5161.C5171.f19274
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r12, r0)
        L41:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L61
            if (r12 != 0) goto L56
            int[] r4 = Yue.C5161.C5171.f19274
            r7 = 0
            int r8 = Yue.C5161.C5170.f19267
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r1
            Yue.C1626.m7895(r2, r3, r4, r5, r6, r7, r8)
            goto L61
        L56:
            int[] r4 = Yue.C5161.C5171.f19274
            r8 = 0
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r1
            r7 = r12
            Yue.C1626.m7895(r2, r3, r4, r5, r6, r7, r8)
        L61:
            int r11 = Yue.C5161.C5171.f19275
            int r11 = r1.getResourceId(r11, r0)
            if (r11 == 0) goto L8a
            android.content.res.Resources r10 = r10.getResources()
            int[] r11 = r10.getIntArray(r11)
            r9.mKeylines = r11
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            int[] r11 = r9.mKeylines
            int r11 = r11.length
        L7c:
            if (r0 >= r11) goto L8a
            int[] r12 = r9.mKeylines
            r2 = r12[r0]
            float r2 = (float) r2
            float r2 = r2 * r10
            int r2 = (int) r2
            r12[r0] = r2
            int r0 = r0 + 1
            goto L7c
        L8a:
            int r10 = Yue.C5161.C5171.f19276
            android.graphics.drawable.Drawable r10 = r1.getDrawable(r10)
            r9.mStatusBarBackground = r10
            r1.recycle()
            r9.m28780()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟۠ r10 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟۠
            r10.<init>(r9)
            super.setOnHierarchyChangeListener(r10)
            int r10 = Yue.C6794.m26135(r9)
            if (r10 != 0) goto Laa
            r10 = 1
            Yue.C6794.m26241(r9, r10)
        Laa:
            return
    }

    public static androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493 parseBehavior(android.content.Context r3, android.util.AttributeSet r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.String r0 = "."
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getPackageName()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            goto L47
        L24:
            r0 = 46
            int r1 = r5.indexOf(r0)
            if (r1 < 0) goto L2d
            goto L47
        L2d:
            java.lang.String r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.WIDGET_PACKAGE_NAME
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
        L47:
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟>>> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.sConstructors     // Catch: java.lang.Exception -> L5a
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Exception -> L5a
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L5a
            if (r1 != 0) goto L5c
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> L5a
            r1.<init>()     // Catch: java.lang.Exception -> L5a
            r0.set(r1)     // Catch: java.lang.Exception -> L5a
            goto L5c
        L5a:
            r3 = move-exception
            goto L85
        L5c:
            java.lang.Object r0 = r1.get(r5)     // Catch: java.lang.Exception -> L5a
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.Exception -> L5a
            if (r0 != 0) goto L7a
            java.lang.ClassLoader r0 = r3.getClassLoader()     // Catch: java.lang.Exception -> L5a
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r5, r2, r0)     // Catch: java.lang.Exception -> L5a
            java.lang.Class<?>[] r2 = androidx.coordinatorlayout.widget.CoordinatorLayout.CONSTRUCTOR_PARAMS     // Catch: java.lang.Exception -> L5a
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L5a
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L5a
            r1.put(r5, r0)     // Catch: java.lang.Exception -> L5a
        L7a:
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch: java.lang.Exception -> L5a
            java.lang.Object r3 = r0.newInstance(r3)     // Catch: java.lang.Exception -> L5a
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493) r3     // Catch: java.lang.Exception -> L5a
            return r3
        L85:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not inflate Behavior subclass "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5, r3)
            throw r4
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.Rect m28759() {
            Yue.ۥۡۤۤ۠$ۥ<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool
            java.lang.Object r0 = r0.acquire()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto Lf
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    private static int m28760(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m28761(@Yue.InterfaceC4410 android.graphics.Rect r1) {
            r1.setEmpty()
            Yue.ۥۡۤۤ۠$ۥ<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool
            r0.release(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m28762(int r0) {
            if (r0 != 0) goto L4
            r0 = 17
        L4:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static int m28763(int r1) {
            r0 = r1 & 7
            if (r0 != 0) goto L8
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r0
        L8:
            r0 = r1 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto Le
            r1 = r1 | 48
        Le:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static int m28764(int r0) {
            if (r0 != 0) goto L5
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L5:
            return r0
    }

    public void addPreDrawListener() {
            r2 = this;
            boolean r0 = r2.mIsAttachedToWindow
            if (r0 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ r0 = r2.mOnPreDrawListener
            if (r0 != 0) goto Lf
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ
            r0.<init>(r2)
            r2.mOnPreDrawListener = r0
        Lf:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ r1 = r2.mOnPreDrawListener
            r0.addOnPreDrawListener(r1)
        L18:
            r0 = 1
            r2.mNeedsPreDrawListener = r0
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C7497
            if (r0 == 0) goto Lc
            boolean r2 = super.checkLayoutParams(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public void dispatchDependentViewsChanged(@Yue.InterfaceC4410 android.view.View r5) {
            r4 = this;
            Yue.ۥ۠۟ۡۤ<android.view.View> r0 = r4.mChildDag
            java.util.List r0 = r0.m8652(r5)
            if (r0 == 0) goto L2d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2d
            r1 = 0
        Lf:
            int r2 = r0.size()
            if (r1 >= r2) goto L2d
            java.lang.Object r2 = r0.get(r1)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r3 = r3.m28786()
            if (r3 == 0) goto L2a
            r3.onDependentViewChanged(r4, r2, r5)
        L2a:
            int r1 = r1 + 1
            goto Lf
        L2d:
            return
    }

    public boolean doViewsOverlap(@Yue.InterfaceC4410 android.view.View r5, @Yue.InterfaceC4410 android.view.View r6) {
            r4 = this;
            int r0 = r5.getVisibility()
            r1 = 0
            if (r0 != 0) goto L58
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L58
            android.graphics.Rect r0 = m28759()
            android.view.ViewParent r2 = r5.getParent()
            r3 = 1
            if (r2 == r4) goto L1a
            r2 = r3
            goto L1b
        L1a:
            r2 = r1
        L1b:
            r4.getChildRect(r5, r2, r0)
            android.graphics.Rect r5 = m28759()
            android.view.ViewParent r2 = r6.getParent()
            if (r2 == r4) goto L2a
            r2 = r3
            goto L2b
        L2a:
            r2 = r1
        L2b:
            r4.getChildRect(r6, r2, r5)
            int r6 = r0.left     // Catch: java.lang.Throwable -> L48
            int r2 = r5.right     // Catch: java.lang.Throwable -> L48
            if (r6 > r2) goto L4a
            int r6 = r0.top     // Catch: java.lang.Throwable -> L48
            int r2 = r5.bottom     // Catch: java.lang.Throwable -> L48
            if (r6 > r2) goto L4a
            int r6 = r0.right     // Catch: java.lang.Throwable -> L48
            int r2 = r5.left     // Catch: java.lang.Throwable -> L48
            if (r6 < r2) goto L4a
            int r6 = r0.bottom     // Catch: java.lang.Throwable -> L48
            int r2 = r5.top     // Catch: java.lang.Throwable -> L48
            if (r6 < r2) goto L4a
            r1 = r3
            goto L4a
        L48:
            r6 = move-exception
            goto L51
        L4a:
            m28761(r0)
            m28761(r5)
            return r1
        L51:
            m28761(r0)
            m28761(r5)
            throw r6
        L58:
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas r9, android.view.View r10, long r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r1 = r0.f28944
            if (r1 == 0) goto L87
            float r1 = r1.getScrimOpacity(r8, r10)
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L87
            android.graphics.Paint r2 = r8.mScrimPaint
            if (r2 != 0) goto L1e
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r8.mScrimPaint = r2
        L1e:
            android.graphics.Paint r2 = r8.mScrimPaint
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r0 = r0.f28944
            int r0 = r0.getScrimColor(r8, r10)
            r2.setColor(r0)
            android.graphics.Paint r0 = r8.mScrimPaint
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            r2 = 0
            r3 = 255(0xff, float:3.57E-43)
            int r1 = m28760(r1, r2, r3)
            r0.setAlpha(r1)
            int r0 = r9.save()
            boolean r1 = r10.isOpaque()
            if (r1 == 0) goto L60
            int r1 = r10.getLeft()
            float r3 = (float) r1
            int r1 = r10.getTop()
            float r4 = (float) r1
            int r1 = r10.getRight()
            float r5 = (float) r1
            int r1 = r10.getBottom()
            float r6 = (float) r1
            android.graphics.Region$Op r7 = android.graphics.Region.Op.DIFFERENCE
            r2 = r9
            r2.clipRect(r3, r4, r5, r6, r7)
        L60:
            int r1 = r8.getPaddingLeft()
            float r3 = (float) r1
            int r1 = r8.getPaddingTop()
            float r4 = (float) r1
            int r1 = r8.getWidth()
            int r2 = r8.getPaddingRight()
            int r1 = r1 - r2
            float r5 = (float) r1
            int r1 = r8.getHeight()
            int r2 = r8.getPaddingBottom()
            int r1 = r1 - r2
            float r6 = (float) r1
            android.graphics.Paint r7 = r8.mScrimPaint
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
            r9.restoreToCount(r0)
        L87:
            boolean r9 = super.drawChild(r9, r10, r11)
            return r9
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            int[] r0 = r3.getDrawableState()
            android.graphics.drawable.Drawable r1 = r3.mStatusBarBackground
            if (r1 == 0) goto L16
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L16
            boolean r0 = r1.setState(r0)
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1c
            r3.invalidate()
        L1c:
            return
    }

    public void ensurePreDrawListener() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L17
            android.view.View r3 = r4.getChildAt(r2)
            boolean r3 = r4.m28770(r3)
            if (r3 == 0) goto L14
            r1 = 1
            goto L17
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            boolean r0 = r4.mNeedsPreDrawListener
            if (r1 == r0) goto L24
            if (r1 == 0) goto L21
            r4.addPreDrawListener()
            goto L24
        L21:
            r4.removePreDrawListener()
        L24:
            return
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.C7497 generateDefaultLayoutParams() {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.C7497 generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.C7497 generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C7497
            if (r0 == 0) goto Lc
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L18:
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ
            r0.<init>(r2)
            return r0
    }

    public void getChildRect(android.view.View r3, boolean r4, android.graphics.Rect r5) {
            r2 = this;
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L29
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lf
            goto L29
        Lf:
            if (r4 == 0) goto L15
            r2.getDescendantRect(r3, r5)
            goto L28
        L15:
            int r4 = r3.getLeft()
            int r0 = r3.getTop()
            int r1 = r3.getRight()
            int r3 = r3.getBottom()
            r5.set(r4, r0, r1, r3)
        L28:
            return
        L29:
            r5.setEmpty()
            return
    }

    @Yue.InterfaceC4410
    public java.util.List<android.view.View> getDependencies(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            Yue.ۥ۠۟ۡۤ<android.view.View> r0 = r1.mChildDag
            java.util.List r2 = r0.m8653(r2)
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.clear()
            if (r2 == 0) goto L12
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.addAll(r2)
        L12:
            java.util.List<android.view.View> r2 = r1.mTempDependenciesList
            return r2
    }

    @Yue.InterfaceC6959
    public final java.util.List<android.view.View> getDependencySortedChildren() {
            r1 = this;
            r1.m28776()
            java.util.List<android.view.View> r0 = r1.mDependencySortedChildren
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Yue.InterfaceC4410
    public java.util.List<android.view.View> getDependents(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            Yue.ۥ۠۟ۡۤ<android.view.View> r0 = r1.mChildDag
            java.util.List r2 = r0.m8652(r2)
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.clear()
            if (r2 == 0) goto L12
            java.util.List<android.view.View> r0 = r1.mTempDependenciesList
            r0.addAll(r2)
        L12:
            java.util.List<android.view.View> r2 = r1.mTempDependenciesList
            return r2
    }

    public void getDescendantRect(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            Yue.C6846.m26535(r0, r1, r2)
            return
    }

    public void getDesiredAnchoredChildRect(android.view.View r12, int r13, android.graphics.Rect r14, android.graphics.Rect r15) {
            r11 = this;
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
            int r9 = r12.getMeasuredWidth()
            int r10 = r12.getMeasuredHeight()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r0
            r7 = r9
            r8 = r10
            r1.m28767(r2, r3, r4, r5, r6, r7, r8)
            r11.m28765(r0, r15, r9, r10)
            return
    }

    public void getLastChildRect(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r1
            android.graphics.Rect r1 = r1.m28788()
            r2.set(r1)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public final Yue.C7065 getLastWindowInsets() {
            r1 = this;
            Yue.ۥۢۥۦ r0 = r1.mLastInsets
            return r0
    }

    @Override // android.view.ViewGroup, Yue.InterfaceC4386
    public int getNestedScrollAxes() {
            r1 = this;
            Yue.ۥۡۢۢۤ r0 = r1.mNestedScrollingParentHelper
            int r0 = r0.m17252()
            return r0
    }

    public androidx.coordinatorlayout.widget.CoordinatorLayout.C7497 getResolvedLayoutParams(android.view.View r7) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
            boolean r1 = r0.f28945
            if (r1 != 0) goto L73
            boolean r1 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC7492
            r2 = 1
            java.lang.String r3 = "CoordinatorLayout"
            if (r1 == 0) goto L24
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟ r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC7492) r7
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r7 = r7.getBehavior()
            if (r7 != 0) goto L1e
            java.lang.String r1 = "Attached behavior class is null"
            android.util.Log.e(r3, r1)
        L1e:
            r0.m28797(r7)
            r0.f28945 = r2
            goto L73
        L24:
            java.lang.Class r7 = r7.getClass()
            r1 = 0
            r4 = r1
        L2a:
            if (r7 == 0) goto L3b
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟> r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC7494.class
            java.lang.annotation.Annotation r4 = r7.getAnnotation(r4)
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC7494) r4
            if (r4 != 0) goto L3b
            java.lang.Class r7 = r7.getSuperclass()
            goto L2a
        L3b:
            if (r4 == 0) goto L71
            java.lang.Class r7 = r4.value()     // Catch: java.lang.Exception -> L4f
            java.lang.reflect.Constructor r7 = r7.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.Object r7 = r7.newInstance(r1)     // Catch: java.lang.Exception -> L4f
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493) r7     // Catch: java.lang.Exception -> L4f
            r0.m28797(r7)     // Catch: java.lang.Exception -> L4f
            goto L71
        L4f:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "Default behavior class "
            r1.append(r5)
            java.lang.Class r4 = r4.value()
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = " could not be instantiated. Did you forget a default constructor?"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1, r7)
        L71:
            r0.f28945 = r2
        L73:
            return r0
    }

    @Yue.InterfaceC4544
    public android.graphics.drawable.Drawable getStatusBarBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mStatusBarBackground
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
            r3 = this;
            int r0 = super.getSuggestedMinimumHeight()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
            r3 = this;
            int r0 = super.getSuggestedMinimumWidth()
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public boolean isPointInChildBounds(@Yue.InterfaceC4410 android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = m28759()
            r1.getDescendantRect(r2, r0)
            boolean r2 = r0.contains(r3, r4)     // Catch: java.lang.Throwable -> Lf
            m28761(r0)
            return r2
        Lf:
            r2 = move-exception
            m28761(r0)
            throw r2
    }

    public void offsetChildToAnchor(android.view.View r17, int r18) {
            r16 = this;
            r8 = r16
            r9 = r17
            android.view.ViewGroup$LayoutParams r0 = r17.getLayoutParams()
            r10 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r10
            android.view.View r0 = r10.f28954
            if (r0 == 0) goto L7a
            android.graphics.Rect r11 = m28759()
            android.graphics.Rect r12 = m28759()
            android.graphics.Rect r13 = m28759()
            android.view.View r0 = r10.f28954
            r8.getDescendantRect(r0, r11)
            r14 = 0
            r8.getChildRect(r9, r14, r12)
            int r15 = r17.getMeasuredWidth()
            int r7 = r17.getMeasuredHeight()
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r11
            r4 = r13
            r5 = r10
            r6 = r15
            r18 = r7
            r0.m28767(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r13.left
            int r1 = r12.left
            if (r0 != r1) goto L4b
            int r0 = r13.top
            int r1 = r12.top
            if (r0 == r1) goto L48
            goto L4b
        L48:
            r0 = r18
            goto L4d
        L4b:
            r14 = 1
            goto L48
        L4d:
            r8.m28765(r10, r13, r15, r0)
            int r0 = r13.left
            int r1 = r12.left
            int r0 = r0 - r1
            int r1 = r13.top
            int r2 = r12.top
            int r1 = r1 - r2
            if (r0 == 0) goto L5f
            Yue.C6794.m26198(r9, r0)
        L5f:
            if (r1 == 0) goto L64
            Yue.C6794.m26199(r9, r1)
        L64:
            if (r14 == 0) goto L71
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r0 = r10.m28786()
            if (r0 == 0) goto L71
            android.view.View r1 = r10.f28954
            r0.onDependentViewChanged(r8, r9, r1)
        L71:
            m28761(r11)
            m28761(r12)
            m28761(r13)
        L7a:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 0
            r2.m28777(r0)
            boolean r0 = r2.mNeedsPreDrawListener
            if (r0 == 0) goto L1f
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ r0 = r2.mOnPreDrawListener
            if (r0 != 0) goto L16
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ
            r0.<init>(r2)
            r2.mOnPreDrawListener = r0
        L16:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ r1 = r2.mOnPreDrawListener
            r0.addOnPreDrawListener(r1)
        L1f:
            Yue.ۥۢۥۦ r0 = r2.mLastInsets
            if (r0 != 0) goto L2c
            boolean r0 = Yue.C6794.m26134(r2)
            if (r0 == 0) goto L2c
            Yue.C6794.m26217(r2)
        L2c:
            r0 = 1
            r2.mIsAttachedToWindow = r0
            return
    }

    public final void onChildViewsChanged(int r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = Yue.C6794.m26140(r17)
            java.util.List<android.view.View> r3 = r0.mDependencySortedChildren
            int r3 = r3.size()
            android.graphics.Rect r4 = m28759()
            android.graphics.Rect r5 = m28759()
            android.graphics.Rect r6 = m28759()
            r7 = 0
            r8 = r7
        L1c:
            if (r8 >= r3) goto L107
            java.util.List<android.view.View> r9 = r0.mDependencySortedChildren
            java.lang.Object r9 = r9.get(r8)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r10
            if (r1 != 0) goto L38
            int r11 = r9.getVisibility()
            r12 = 8
            if (r11 != r12) goto L38
            goto L103
        L38:
            r11 = r7
        L39:
            if (r11 >= r8) goto L4d
            java.util.List<android.view.View> r12 = r0.mDependencySortedChildren
            java.lang.Object r12 = r12.get(r11)
            android.view.View r12 = (android.view.View) r12
            android.view.View r13 = r10.f28955
            if (r13 != r12) goto L4a
            r0.offsetChildToAnchor(r9, r2)
        L4a:
            int r11 = r11 + 1
            goto L39
        L4d:
            r11 = 1
            r0.getChildRect(r9, r11, r5)
            int r12 = r10.f28950
            if (r12 == 0) goto La9
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto La9
            int r12 = r10.f28950
            int r12 = Yue.C2911.m12423(r12, r2)
            r13 = r12 & 112(0x70, float:1.57E-43)
            r14 = 48
            if (r13 == r14) goto L7c
            r14 = 80
            if (r13 == r14) goto L6c
            goto L86
        L6c:
            int r13 = r4.bottom
            int r14 = r17.getHeight()
            int r15 = r5.top
            int r14 = r14 - r15
            int r13 = java.lang.Math.max(r13, r14)
            r4.bottom = r13
            goto L86
        L7c:
            int r13 = r4.top
            int r14 = r5.bottom
            int r13 = java.lang.Math.max(r13, r14)
            r4.top = r13
        L86:
            r12 = r12 & 7
            r13 = 3
            if (r12 == r13) goto L9f
            r13 = 5
            if (r12 == r13) goto L8f
            goto La9
        L8f:
            int r12 = r4.right
            int r13 = r17.getWidth()
            int r14 = r5.left
            int r13 = r13 - r14
            int r12 = java.lang.Math.max(r12, r13)
            r4.right = r12
            goto La9
        L9f:
            int r12 = r4.left
            int r13 = r5.right
            int r12 = java.lang.Math.max(r12, r13)
            r4.left = r12
        La9:
            int r10 = r10.f28951
            if (r10 == 0) goto Lb6
            int r10 = r9.getVisibility()
            if (r10 != 0) goto Lb6
            r0.m28774(r9, r4, r2)
        Lb6:
            r10 = 2
            if (r1 == r10) goto Lc6
            r0.getLastChildRect(r9, r6)
            boolean r12 = r6.equals(r5)
            if (r12 == 0) goto Lc3
            goto L103
        Lc3:
            r0.recordLastChildRect(r9, r5)
        Lc6:
            int r12 = r8 + 1
        Lc8:
            if (r12 >= r3) goto L103
            java.util.List<android.view.View> r13 = r0.mDependencySortedChildren
            java.lang.Object r13 = r13.get(r12)
            android.view.View r13 = (android.view.View) r13
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r14 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r14
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r15 = r14.m28786()
            if (r15 == 0) goto L100
            boolean r16 = r15.layoutDependsOn(r0, r13, r9)
            if (r16 == 0) goto L100
            if (r1 != 0) goto Lf0
            boolean r16 = r14.m28787()
            if (r16 == 0) goto Lf0
            r14.m28792()
            goto L100
        Lf0:
            if (r1 == r10) goto Lf7
            boolean r13 = r15.onDependentViewChanged(r0, r13, r9)
            goto Lfb
        Lf7:
            r15.onDependentViewRemoved(r0, r13, r9)
            r13 = r11
        Lfb:
            if (r1 != r11) goto L100
            r14.m28798(r13)
        L100:
            int r12 = r12 + 1
            goto Lc8
        L103:
            int r8 = r8 + 1
            goto L1c
        L107:
            m28761(r4)
            m28761(r5)
            m28761(r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r3.m28777(r0)
            boolean r1 = r3.mNeedsPreDrawListener
            if (r1 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ r1 = r3.mOnPreDrawListener
            if (r1 == 0) goto L18
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ r2 = r3.mOnPreDrawListener
            r1.removeOnPreDrawListener(r2)
        L18:
            android.view.View r1 = r3.mNestedScrollingTarget
            if (r1 == 0) goto L1f
            r3.onStopNestedScroll(r1)
        L1f:
            r3.mIsAttachedToWindow = r0
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.mDrawStatusBarBackground
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r4.mStatusBarBackground
            if (r0 == 0) goto L26
            Yue.ۥۢۥۦ r0 = r4.mLastInsets
            r1 = 0
            if (r0 == 0) goto L15
            int r0 = r0.m27295()
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 <= 0) goto L26
            android.graphics.drawable.Drawable r2 = r4.mStatusBarBackground
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.mStatusBarBackground
            r0.draw(r5)
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 != 0) goto La
            r3.m28777(r1)
        La:
            r2 = 0
            boolean r4 = r3.m28775(r4, r2)
            if (r0 == r1) goto L14
            r2 = 3
            if (r0 != r2) goto L17
        L14:
            r3.m28777(r1)
        L17:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            int r2 = Yue.C6794.m26140(r1)
            java.util.List<android.view.View> r3 = r1.mDependencySortedChildren
            int r3 = r3.size()
            r4 = 0
        Lb:
            if (r4 >= r3) goto L36
            java.util.List<android.view.View> r5 = r1.mDependencySortedChildren
            java.lang.Object r5 = r5.get(r4)
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            r0 = 8
            if (r6 != r0) goto L1e
            goto L33
        L1e:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r6 = r6.m28786()
            if (r6 == 0) goto L30
            boolean r6 = r6.onLayoutChild(r1, r5, r2)
            if (r6 != 0) goto L33
        L30:
            r1.onLayoutChild(r5, r2)
        L33:
            int r4 = r4 + 1
            goto Lb
        L36:
            return
    }

    public void onLayoutChild(@Yue.InterfaceC4410 android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
            boolean r1 = r0.m28781()
            if (r1 != 0) goto L20
            android.view.View r1 = r0.f28954
            if (r1 == 0) goto L14
            r2.m28772(r3, r1, r4)
            goto L1f
        L14:
            int r0 = r0.f28948
            if (r0 < 0) goto L1c
            r2.m28773(r3, r0, r4)
            goto L1f
        L1c:
            r2.m28771(r3, r4)
        L1f:
            return
        L20:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r3.<init>(r4)
            throw r3
    }

    @Override // android.view.View
    public void onMeasure(int r31, int r32) {
            r30 = this;
            r7 = r30
            r30.m28776()
            r30.ensurePreDrawListener()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = Yue.C6794.m26140(r30)
            r2 = 1
            if (r10 != r2) goto L21
            r12 = r2
            goto L22
        L21:
            r12 = 0
        L22:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            Yue.ۥۢۥۦ r3 = r7.mLastInsets
            if (r3 == 0) goto L4b
            boolean r3 = Yue.C6794.m26134(r30)
            if (r3 == 0) goto L4b
            r19 = r2
            goto L4d
        L4b:
            r19 = 0
        L4d:
            java.util.List<android.view.View> r2 = r7.mDependencySortedChildren
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L57:
            if (r3 >= r6) goto L171
            java.util.List<android.view.View> r0 = r7.mDependencySortedChildren
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L73
            r22 = r3
            r29 = r6
            r28 = r8
            goto L169
        L73:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r1
            int r0 = r1.f28948
            if (r0 < 0) goto Lbc
            if (r13 == 0) goto Lbc
            int r0 = r7.m28768(r0)
            int r11 = r1.f28946
            int r11 = m28764(r11)
            int r11 = Yue.C2911.m12423(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L97
            if (r12 == 0) goto L9c
        L97:
            r2 = 5
            if (r11 != r2) goto La8
            if (r12 == 0) goto La8
        L9c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r11 = r0
            r21 = r2
            goto Lc1
        La8:
            if (r11 != r2) goto Lac
            if (r12 == 0) goto Lb1
        Lac:
            r2 = 3
            if (r11 != r2) goto Lba
            if (r12 == 0) goto Lba
        Lb1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto Lc1
        Lba:
            r11 = 0
            goto Lbf
        Lbc:
            r22 = r2
            goto Lba
        Lbf:
            r21 = r11
        Lc1:
            if (r19 == 0) goto Lf3
            boolean r0 = Yue.C6794.m26134(r20)
            if (r0 != 0) goto Lf3
            Yue.ۥۢۥۦ r0 = r7.mLastInsets
            int r0 = r0.m27293()
            Yue.ۥۢۥۦ r2 = r7.mLastInsets
            int r2 = r2.m27294()
            int r0 = r0 + r2
            Yue.ۥۢۥۦ r2 = r7.mLastInsets
            int r2 = r2.m27295()
            Yue.ۥۢۥۦ r11 = r7.mLastInsets
            int r11 = r11.m27292()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto Lf7
        Lf3:
            r11 = r31
            r23 = r32
        Lf7:
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r0 = r1.m28786()
            if (r0 == 0) goto L11f
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L139
            goto L12c
        L11f:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L12c:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.onMeasureChild(r1, r2, r3, r4, r5)
        L139:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L169:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L57
        L171:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
    }

    public void onMeasureChild(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L36
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L16
            goto L33
        L16:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r4
            boolean r5 = r4.m28791(r1)
            if (r5 != 0) goto L23
            goto L33
        L23:
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r4 = r4.m28786()
            if (r4 == 0) goto L33
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r4 = r4.onNestedFling(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r4
        L33:
            int r2 = r2 + 1
            goto L7
        L36:
            if (r3 == 0) goto L3c
            r12 = 1
            r11.onChildViewsChanged(r12)
        L3c:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L35
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L16
            goto L32
        L16:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r4
            boolean r5 = r4.m28791(r1)
            if (r5 != 0) goto L23
            goto L32
        L23:
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r4 = r4.m28786()
            if (r4 == 0) goto L32
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r4 = r4.onNestedPreFling(r5, r6, r7, r8, r9)
            r3 = r3 | r4
        L32:
            int r2 = r2 + 1
            goto L7
        L35:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
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
    public void onNestedPreScroll(android.view.View r17, int r18, int r19, int[] r20, int r21) {
            r16 = this;
            r8 = r16
            int r9 = r16.getChildCount()
            r10 = 0
            r0 = r10
            r11 = r0
            r12 = r11
            r13 = r12
        Lb:
            r14 = 1
            if (r11 >= r9) goto L70
            android.view.View r2 = r8.getChildAt(r11)
            int r1 = r2.getVisibility()
            r3 = 8
            if (r1 != r3) goto L1d
            r15 = r21
            goto L6d
        L1d:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r1
            r15 = r21
            boolean r3 = r1.m28791(r15)
            if (r3 != 0) goto L2c
            goto L6d
        L2c:
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r1 = r1.m28786()
            if (r1 == 0) goto L6d
            int[] r6 = r8.mBehaviorConsumed
            r6[r10] = r10
            r6[r14] = r10
            r0 = r1
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r7 = r21
            r0.onNestedPreScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.mBehaviorConsumed
            if (r18 <= 0) goto L52
            r0 = r0[r10]
            int r0 = java.lang.Math.max(r12, r0)
        L50:
            r12 = r0
            goto L59
        L52:
            r0 = r0[r10]
            int r0 = java.lang.Math.min(r12, r0)
            goto L50
        L59:
            int[] r0 = r8.mBehaviorConsumed
            if (r19 <= 0) goto L65
            r0 = r0[r14]
            int r0 = java.lang.Math.max(r13, r0)
        L63:
            r13 = r0
            goto L6c
        L65:
            r0 = r0[r14]
            int r0 = java.lang.Math.min(r13, r0)
            goto L63
        L6c:
            r0 = r14
        L6d:
            int r11 = r11 + 1
            goto Lb
        L70:
            r20[r10] = r12
            r20[r14] = r13
            if (r0 == 0) goto L79
            r8.onChildViewsChanged(r14)
        L79:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // Yue.InterfaceC4384
    public void onNestedScroll(android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r6 = 0
            int[] r7 = r8.mNestedScrollingV2ConsumedCompat
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // Yue.InterfaceC4385
    public void onNestedScroll(@Yue.InterfaceC4410 android.view.View r18, int r19, int r20, int r21, int r22, int r23, @Yue.InterfaceC4410 int[] r24) {
            r17 = this;
            r10 = r17
            int r11 = r17.getChildCount()
            r12 = 0
            r0 = r12
            r13 = r0
            r14 = r13
            r15 = r14
        Lb:
            r9 = 1
            if (r13 >= r11) goto L7a
            android.view.View r2 = r10.getChildAt(r13)
            int r1 = r2.getVisibility()
            r3 = 8
            if (r1 != r3) goto L1b
            goto L77
        L1b:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r1
            r8 = r23
            boolean r3 = r1.m28791(r8)
            if (r3 != 0) goto L2a
            goto L77
        L2a:
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r1 = r1.m28786()
            if (r1 == 0) goto L77
            int[] r7 = r10.mBehaviorConsumed
            r7[r12] = r12
            r7[r9] = r12
            r0 = r1
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r16 = r7
            r7 = r22
            r8 = r23
            r9 = r16
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int[] r0 = r10.mBehaviorConsumed
            if (r21 <= 0) goto L58
            r0 = r0[r12]
            int r0 = java.lang.Math.max(r14, r0)
        L56:
            r14 = r0
            goto L5f
        L58:
            r0 = r0[r12]
            int r0 = java.lang.Math.min(r14, r0)
            goto L56
        L5f:
            if (r22 <= 0) goto L6c
            int[] r0 = r10.mBehaviorConsumed
            r1 = 1
            r0 = r0[r1]
            int r0 = java.lang.Math.max(r15, r0)
        L6a:
            r15 = r0
            goto L76
        L6c:
            r1 = 1
            int[] r0 = r10.mBehaviorConsumed
            r0 = r0[r1]
            int r0 = java.lang.Math.min(r15, r0)
            goto L6a
        L76:
            r0 = r1
        L77:
            int r13 = r13 + 1
            goto Lb
        L7a:
            r1 = r9
            r2 = r24[r12]
            int r2 = r2 + r14
            r24[r12] = r2
            r2 = r24[r1]
            int r2 = r2 + r15
            r24[r1] = r2
            if (r0 == 0) goto L8a
            r10.onChildViewsChanged(r1)
        L8a:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.onNestedScrollAccepted(r2, r3, r4, r0)
            return
    }

    @Override // Yue.InterfaceC4384
    public void onNestedScrollAccepted(android.view.View r10, android.view.View r11, int r12, int r13) {
            r9 = this;
            Yue.ۥۡۢۢۤ r0 = r9.mNestedScrollingParentHelper
            r0.m17254(r10, r11, r12, r13)
            r9.mNestedScrollingTarget = r11
            int r0 = r9.getChildCount()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L30
            android.view.View r4 = r9.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r2
            boolean r3 = r2.m28791(r13)
            if (r3 != 0) goto L1f
            goto L2d
        L1f:
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r2 = r2.m28786()
            if (r2 == 0) goto L2d
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r2.onNestedScrollAccepted(r3, r4, r5, r6, r7, r8)
        L2d:
            int r1 = r1 + 1
            goto Lc
        L30:
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r7) {
            r6 = this;
            boolean r0 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C7499
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r7)
            return
        L8:
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟ r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7499) r7
            android.os.Parcelable r0 = r7.getSuperState()
            super.onRestoreInstanceState(r0)
            android.util.SparseArray<android.os.Parcelable> r7 = r7.f28963
            int r0 = r6.getChildCount()
            r1 = 0
        L18:
            if (r1 >= r0) goto L3d
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getId()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r4 = r6.getResolvedLayoutParams(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r4 = r4.m28786()
            r5 = -1
            if (r3 == r5) goto L3a
            if (r4 == 0) goto L3a
            java.lang.Object r3 = r7.get(r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            if (r3 == 0) goto L3a
            r4.onRestoreInstanceState(r6, r2, r3)
        L3a:
            int r1 = r1 + 1
            goto L18
        L3d:
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r8 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r8.getChildCount()
            r3 = 0
        L13:
            if (r3 >= r2) goto L38
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r6 = r6.m28786()
            r7 = -1
            if (r5 == r7) goto L35
            if (r6 == 0) goto L35
            android.os.Parcelable r4 = r6.onSaveInstanceState(r8, r4)
            if (r4 == 0) goto L35
            r1.append(r5, r4)
        L35:
            int r3 = r3 + 1
            goto L13
        L38:
            r0.f28963 = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.onStartNestedScroll(r2, r3, r4, r0)
            return r2
    }

    @Override // Yue.InterfaceC4384
    public boolean onStartNestedScroll(android.view.View r15, android.view.View r16, int r17, int r18) {
            r14 = this;
            r7 = r18
            int r8 = r14.getChildCount()
            r9 = 0
            r10 = r9
            r11 = r10
        L9:
            if (r10 >= r8) goto L3d
            r12 = r14
            android.view.View r2 = r14.getChildAt(r10)
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 != r1) goto L19
            goto L3a
        L19:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r13 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r13 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r13
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r0 = r13.m28786()
            if (r0 == 0) goto L37
            r1 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            boolean r0 = r0.onStartNestedScroll(r1, r2, r3, r4, r5, r6)
            r11 = r11 | r0
            r13.m28800(r7, r0)
            goto L3a
        L37:
            r13.m28800(r7, r9)
        L3a:
            int r10 = r10 + 1
            goto L9
        L3d:
            r12 = r14
            return r11
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC4386
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.onStopNestedScroll(r2, r0)
            return
    }

    @Override // Yue.InterfaceC4384
    public void onStopNestedScroll(android.view.View r6, int r7) {
            r5 = this;
            Yue.ۥۡۢۢۤ r0 = r5.mNestedScrollingParentHelper
            r0.m17256(r6, r7)
            int r0 = r5.getChildCount()
            r1 = 0
        La:
            if (r1 >= r0) goto L2f
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r3
            boolean r4 = r3.m28791(r7)
            if (r4 != 0) goto L1d
            goto L2c
        L1d:
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r4 = r3.m28786()
            if (r4 == 0) goto L26
            r4.onStopNestedScroll(r5, r2, r6, r7)
        L26:
            r3.m28793(r7)
            r3.m28792()
        L2c:
            int r1 = r1 + 1
            goto La
        L2f:
            r6 = 0
            r5.mNestedScrollingTarget = r6
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m28775(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r6 = r6.m28786()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.mBehaviorTouchView
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m28777(r5)
        L57:
            return r6
    }

    public void recordLastChildRect(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r1
            r1.m28799(r2)
            return
    }

    public void removePreDrawListener() {
            r2 = this;
            boolean r0 = r2.mIsAttachedToWindow
            if (r0 == 0) goto L11
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ r0 = r2.mOnPreDrawListener
            if (r0 == 0) goto L11
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ r1 = r2.mOnPreDrawListener
            r0.removeOnPreDrawListener(r1)
        L11:
            r0 = 0
            r2.mNeedsPreDrawListener = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r0 = r0.m28786()
            if (r0 == 0) goto L14
            boolean r0 = r0.onRequestChildRectangleOnScreen(r1, r2, r3, r4)
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            boolean r2 = super.requestChildRectangleOnScreen(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            super.requestDisallowInterceptTouchEvent(r1)
            if (r1 == 0) goto L10
            boolean r1 = r0.mDisallowInterceptReset
            if (r1 != 0) goto L10
            r1 = 0
            r0.m28777(r1)
            r1 = 1
            r0.mDisallowInterceptReset = r1
        L10:
            return
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
            r0 = this;
            super.setFitsSystemWindows(r1)
            r0.m28780()
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r1) {
            r0 = this;
            r0.mOnHierarchyChangeListener = r1
            return
    }

    public void setStatusBarBackground(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mStatusBarBackground
            if (r0 == r3) goto L43
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.mStatusBarBackground = r1
            if (r1 == 0) goto L40
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L23:
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            int r0 = Yue.C6794.m26140(r2)
            Yue.C1995.m9230(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = r1
        L38:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.mStatusBarBackground
            r3.setCallback(r2)
        L40:
            Yue.C6794.m26209(r2)
        L43:
            return
    }

    public void setStatusBarBackgroundColor(@Yue.InterfaceC1230 int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarBackground(r0)
            return
    }

    public void setStatusBarBackgroundResource(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C1584.m7766(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStatusBarBackground(r2)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = r0
        L9:
            android.graphics.drawable.Drawable r1 = r2.mStatusBarBackground
            if (r1 == 0) goto L18
            boolean r1 = r1.isVisible()
            if (r1 == r3) goto L18
            android.graphics.drawable.Drawable r1 = r2.mStatusBarBackground
            r1.setVisible(r3, r0)
        L18:
            return
    }

    public final Yue.C7065 setWindowInsets(Yue.C7065 r4) {
            r3 = this;
            Yue.ۥۢۥۦ r0 = r3.mLastInsets
            boolean r0 = Yue.C4554.m18124(r0, r4)
            if (r0 != 0) goto L2c
            r3.mLastInsets = r4
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L16
            int r2 = r4.m27295()
            if (r2 <= 0) goto L16
            r2 = r1
            goto L17
        L16:
            r2 = r0
        L17:
            r3.mDrawStatusBarBackground = r2
            if (r2 != 0) goto L22
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            if (r2 != 0) goto L22
            r0 = r1
        L22:
            r3.setWillNotDraw(r0)
            Yue.ۥۢۥۦ r4 = r3.m28766(r4)
            r3.requestLayout()
        L2c:
            return r4
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.mStatusBarBackground
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m28765(androidx.coordinatorlayout.widget.CoordinatorLayout.C7497 r6, android.graphics.Rect r7, int r8, int r9) {
            r5 = this;
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingLeft()
            int r3 = r6.leftMargin
            int r2 = r2 + r3
            int r3 = r7.left
            int r4 = r5.getPaddingRight()
            int r0 = r0 - r4
            int r0 = r0 - r8
            int r4 = r6.rightMargin
            int r0 = r0 - r4
            int r0 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r5.getPaddingTop()
            int r3 = r6.topMargin
            int r2 = r2 + r3
            int r3 = r7.top
            int r4 = r5.getPaddingBottom()
            int r1 = r1 - r4
            int r1 = r1 - r9
            int r6 = r6.bottomMargin
            int r1 = r1 - r6
            int r6 = java.lang.Math.min(r3, r1)
            int r6 = java.lang.Math.max(r2, r6)
            int r8 = r8 + r0
            int r9 = r9 + r6
            r7.set(r0, r6, r8, r9)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C7065 m28766(Yue.C7065 r5) {
            r4 = this;
            boolean r0 = r5.m27303()
            if (r0 == 0) goto L7
            return r5
        L7:
            int r0 = r4.getChildCount()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L32
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = Yue.C6794.m26134(r2)
            if (r3 == 0) goto L2f
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r3 = r3.m28786()
            if (r3 == 0) goto L2f
            Yue.ۥۢۥۦ r5 = r3.onApplyWindowInsets(r4, r2, r5)
            boolean r2 = r5.m27303()
            if (r2 == 0) goto L2f
            goto L32
        L2f:
            int r1 = r1 + 1
            goto Lc
        L32:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m28767(android.view.View r6, int r7, android.graphics.Rect r8, android.graphics.Rect r9, androidx.coordinatorlayout.widget.CoordinatorLayout.C7497 r10, int r11, int r12) {
            r5 = this;
            int r6 = r10.f28946
            int r6 = m28762(r6)
            int r6 = Yue.C2911.m12423(r6, r7)
            int r10 = r10.f28947
            int r10 = m28763(r10)
            int r7 = Yue.C2911.m12423(r10, r7)
            r10 = r6 & 7
            r6 = r6 & 112(0x70, float:1.57E-43)
            r0 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r1 = 5
            r2 = 1
            if (r0 == r2) goto L28
            if (r0 == r1) goto L25
            int r0 = r8.left
            goto L31
        L25:
            int r0 = r8.right
            goto L31
        L28:
            int r0 = r8.left
            int r3 = r8.width()
            int r3 = r3 / 2
            int r0 = r0 + r3
        L31:
            r3 = 80
            r4 = 16
            if (r7 == r4) goto L3f
            if (r7 == r3) goto L3c
            int r7 = r8.top
            goto L48
        L3c:
            int r7 = r8.bottom
            goto L48
        L3f:
            int r7 = r8.top
            int r8 = r8.height()
            int r8 = r8 / 2
            int r7 = r7 + r8
        L48:
            if (r10 == r2) goto L4e
            if (r10 == r1) goto L51
            int r0 = r0 - r11
            goto L51
        L4e:
            int r8 = r11 / 2
            int r0 = r0 - r8
        L51:
            if (r6 == r4) goto L57
            if (r6 == r3) goto L5a
            int r7 = r7 - r12
            goto L5a
        L57:
            int r6 = r12 / 2
            int r7 = r7 - r6
        L5a:
            int r11 = r11 + r0
            int r12 = r12 + r7
            r9.set(r0, r7, r11, r12)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m28768(int r5) {
            r4 = this;
            int[] r0 = r4.mKeylines
            r1 = 0
            java.lang.String r2 = "CoordinatorLayout"
            if (r0 != 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "No keylines defined for "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " - attempted index lookup "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r2, r5)
            return r1
        L24:
            if (r5 < 0) goto L2d
            int r3 = r0.length
            if (r5 < r3) goto L2a
            goto L2d
        L2a:
            r5 = r0[r5]
            return r5
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Keyline index "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r5 = " out of range for "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r2, r5)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m28769(java.util.List<android.view.View> r5) {
            r4 = this;
            r5.clear()
            boolean r0 = r4.isChildrenDrawingOrderEnabled()
            int r1 = r4.getChildCount()
            int r2 = r1 + (-1)
        Ld:
            if (r2 < 0) goto L21
            if (r0 == 0) goto L16
            int r3 = r4.getChildDrawingOrder(r1, r2)
            goto L17
        L16:
            r3 = r2
        L17:
            android.view.View r3 = r4.getChildAt(r3)
            r5.add(r3)
            int r2 = r2 + (-1)
            goto Ld
        L21:
            java.util.Comparator<android.view.View> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR
            if (r0 == 0) goto L28
            java.util.Collections.sort(r5, r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m28770(android.view.View r2) {
            r1 = this;
            Yue.ۥ۠۟ۡۤ<android.view.View> r0 = r1.mChildDag
            boolean r2 = r0.m8655(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m28771(android.view.View r10, int r11) {
            r9 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
            android.graphics.Rect r7 = m28759()
            int r1 = r9.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r9.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r9.getWidth()
            int r4 = r9.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r0.rightMargin
            int r3 = r3 - r4
            int r4 = r9.getHeight()
            int r5 = r9.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r0.bottomMargin
            int r4 = r4 - r5
            r7.set(r1, r2, r3, r4)
            Yue.ۥۢۥۦ r1 = r9.mLastInsets
            if (r1 == 0) goto L6f
            boolean r1 = Yue.C6794.m26134(r9)
            if (r1 == 0) goto L6f
            boolean r1 = Yue.C6794.m26134(r10)
            if (r1 != 0) goto L6f
            int r1 = r7.left
            Yue.ۥۢۥۦ r2 = r9.mLastInsets
            int r2 = r2.m27293()
            int r1 = r1 + r2
            r7.left = r1
            int r1 = r7.top
            Yue.ۥۢۥۦ r2 = r9.mLastInsets
            int r2 = r2.m27295()
            int r1 = r1 + r2
            r7.top = r1
            int r1 = r7.right
            Yue.ۥۢۥۦ r2 = r9.mLastInsets
            int r2 = r2.m27294()
            int r1 = r1 - r2
            r7.right = r1
            int r1 = r7.bottom
            Yue.ۥۢۥۦ r2 = r9.mLastInsets
            int r2 = r2.m27292()
            int r1 = r1 - r2
            r7.bottom = r1
        L6f:
            android.graphics.Rect r8 = m28759()
            int r0 = r0.f28946
            int r1 = m28763(r0)
            int r2 = r10.getMeasuredWidth()
            int r3 = r10.getMeasuredHeight()
            r4 = r7
            r5 = r8
            r6 = r11
            Yue.C2911.m12421(r1, r2, r3, r4, r5, r6)
            int r11 = r8.left
            int r0 = r8.top
            int r1 = r8.right
            int r2 = r8.bottom
            r10.layout(r11, r0, r1, r2)
            m28761(r7)
            m28761(r8)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m28772(android.view.View r5, android.view.View r6, int r7) {
            r4 = this;
            android.graphics.Rect r0 = m28759()
            android.graphics.Rect r1 = m28759()
            r4.getDescendantRect(r6, r0)     // Catch: java.lang.Throwable -> L20
            r4.getDesiredAnchoredChildRect(r5, r7, r0, r1)     // Catch: java.lang.Throwable -> L20
            int r6 = r1.left     // Catch: java.lang.Throwable -> L20
            int r7 = r1.top     // Catch: java.lang.Throwable -> L20
            int r2 = r1.right     // Catch: java.lang.Throwable -> L20
            int r3 = r1.bottom     // Catch: java.lang.Throwable -> L20
            r5.layout(r6, r7, r2, r3)     // Catch: java.lang.Throwable -> L20
            m28761(r0)
            m28761(r1)
            return
        L20:
            r5 = move-exception
            m28761(r0)
            m28761(r1)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m28773(android.view.View r9, int r10, int r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
            int r1 = r0.f28946
            int r1 = m28764(r1)
            int r1 = Yue.C2911.m12423(r1, r11)
            r2 = r1 & 7
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            int r5 = r9.getMeasuredWidth()
            int r6 = r9.getMeasuredHeight()
            r7 = 1
            if (r11 != r7) goto L29
            int r10 = r3 - r10
        L29:
            int r10 = r8.m28768(r10)
            int r10 = r10 - r5
            if (r2 == r7) goto L36
            r11 = 5
            if (r2 == r11) goto L34
            goto L39
        L34:
            int r10 = r10 + r5
            goto L39
        L36:
            int r11 = r5 / 2
            int r10 = r10 + r11
        L39:
            r11 = 16
            if (r1 == r11) goto L45
            r11 = 80
            if (r1 == r11) goto L43
            r11 = 0
            goto L47
        L43:
            r11 = r6
            goto L47
        L45:
            int r11 = r6 / 2
        L47:
            int r1 = r8.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r8.getPaddingRight()
            int r3 = r3 - r2
            int r3 = r3 - r5
            int r2 = r0.rightMargin
            int r3 = r3 - r2
            int r10 = java.lang.Math.min(r10, r3)
            int r10 = java.lang.Math.max(r1, r10)
            int r1 = r8.getPaddingTop()
            int r2 = r0.topMargin
            int r1 = r1 + r2
            int r2 = r8.getPaddingBottom()
            int r4 = r4 - r2
            int r4 = r4 - r6
            int r0 = r0.bottomMargin
            int r4 = r4 - r0
            int r11 = java.lang.Math.min(r11, r4)
            int r11 = java.lang.Math.max(r1, r11)
            int r5 = r5 + r10
            int r6 = r6 + r11
            r9.layout(r10, r11, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m28774(android.view.View r9, android.graphics.Rect r10, int r11) {
            r8 = this;
            boolean r0 = Yue.C6794.m26188(r9)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto Lfd
            int r0 = r9.getHeight()
            if (r0 > 0) goto L15
            goto Lfd
        L15:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r1 = r0.m28786()
            android.graphics.Rect r2 = m28759()
            android.graphics.Rect r3 = m28759()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L70
            boolean r1 = r1.getInsetDodgeRect(r8, r9, r2)
            if (r1 == 0) goto L70
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L49
            goto L73
        L49:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.append(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L70:
            r2.set(r3)
        L73:
            m28761(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L80
            m28761(r2)
            return
        L80:
            int r1 = r0.f28951
            int r11 = Yue.C2911.m12423(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto La0
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f28953
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto La0
            int r3 = r3 - r1
            r8.m28779(r9, r3)
            r1 = r4
            goto La1
        La0:
            r1 = r5
        La1:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto Lbd
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.f28953
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto Lbd
            int r3 = r3 - r6
            r8.m28779(r9, r3)
            r1 = r4
        Lbd:
            if (r1 != 0) goto Lc2
            r8.m28779(r9, r5)
        Lc2:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto Ld9
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f28952
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto Ld9
            int r3 = r3 - r1
            r8.m28778(r9, r3)
            r1 = r4
            goto Lda
        Ld9:
            r1 = r5
        Lda:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto Lf4
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.f28952
            int r11 = r11 + r0
            int r10 = r10.right
            if (r11 >= r10) goto Lf4
            int r11 = r11 - r10
            r8.m28778(r9, r11)
            goto Lf5
        Lf4:
            r4 = r1
        Lf5:
            if (r4 != 0) goto Lfa
            r8.m28778(r9, r5)
        Lfa:
            m28761(r2)
        Lfd:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m28775(android.view.MotionEvent r24, int r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r24.getActionMasked()
            java.util.List<android.view.View> r4 = r0.mTempList1
            r0.m28769(r4)
            int r5 = r4.size()
            r6 = 0
            r7 = 0
            r8 = r6
            r9 = r8
            r10 = r9
        L18:
            if (r8 >= r5) goto L81
            java.lang.Object r11 = r4.get(r8)
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r12
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r13 = r12.m28786()
            r14 = 1
            if (r9 != 0) goto L2f
            if (r10 == 0) goto L54
        L2f:
            if (r3 == 0) goto L54
            if (r13 == 0) goto L7e
            if (r7 != 0) goto L47
            long r17 = android.os.SystemClock.uptimeMillis()
            r21 = 0
            r22 = 0
            r19 = 3
            r20 = 0
            r15 = r17
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
        L47:
            if (r2 == 0) goto L50
            if (r2 == r14) goto L4c
            goto L7e
        L4c:
            r13.onTouchEvent(r0, r11, r7)
            goto L7e
        L50:
            r13.onInterceptTouchEvent(r0, r11, r7)
            goto L7e
        L54:
            if (r9 != 0) goto L6a
            if (r13 == 0) goto L6a
            if (r2 == 0) goto L62
            if (r2 == r14) goto L5d
            goto L66
        L5d:
            boolean r9 = r13.onTouchEvent(r0, r11, r1)
            goto L66
        L62:
            boolean r9 = r13.onInterceptTouchEvent(r0, r11, r1)
        L66:
            if (r9 == 0) goto L6a
            r0.mBehaviorTouchView = r11
        L6a:
            boolean r10 = r12.m28783()
            boolean r11 = r12.m28790(r0, r11)
            if (r11 == 0) goto L78
            if (r10 != 0) goto L78
            r10 = r14
            goto L79
        L78:
            r10 = r6
        L79:
            if (r11 == 0) goto L7e
            if (r10 != 0) goto L7e
            goto L81
        L7e:
            int r8 = r8 + 1
            goto L18
        L81:
            r4.clear()
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m28776() {
            r8 = this;
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            r0.clear()
            Yue.ۥ۠۟ۡۤ<android.view.View> r0 = r8.mChildDag
            r0.m8648()
            int r0 = r8.getChildCount()
            r1 = 0
            r2 = r1
        L10:
            if (r2 >= r0) goto L4a
            android.view.View r3 = r8.getChildAt(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r4 = r8.getResolvedLayoutParams(r3)
            r4.m28784(r8, r3)
            Yue.ۥ۠۟ۡۤ<android.view.View> r5 = r8.mChildDag
            r5.m8647(r3)
            r5 = r1
        L23:
            if (r5 >= r0) goto L47
            if (r5 != r2) goto L28
            goto L44
        L28:
            android.view.View r6 = r8.getChildAt(r5)
            boolean r7 = r4.m28782(r8, r3, r6)
            if (r7 == 0) goto L44
            Yue.ۥ۠۟ۡۤ<android.view.View> r7 = r8.mChildDag
            boolean r7 = r7.m8649(r6)
            if (r7 != 0) goto L3f
            Yue.ۥ۠۟ۡۤ<android.view.View> r7 = r8.mChildDag
            r7.m8647(r6)
        L3f:
            Yue.ۥ۠۟ۡۤ<android.view.View> r7 = r8.mChildDag
            r7.m8646(r6, r3)
        L44:
            int r5 = r5 + 1
            goto L23
        L47:
            int r2 = r2 + 1
            goto L10
        L4a:
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            Yue.ۥ۠۟ۡۤ<android.view.View> r1 = r8.mChildDag
            java.util.ArrayList r1 = r1.m8654()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r8.mDependencySortedChildren
            java.util.Collections.reverse(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m28777(boolean r14) {
            r13 = this;
            int r0 = r13.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L34
            android.view.View r3 = r13.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟ r4 = r4.m28786()
            if (r4 == 0) goto L31
            long r7 = android.os.SystemClock.uptimeMillis()
            r11 = 0
            r12 = 0
            r9 = 3
            r10 = 0
            r5 = r7
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
            if (r14 == 0) goto L2b
            r4.onInterceptTouchEvent(r13, r3, r5)
            goto L2e
        L2b:
            r4.onTouchEvent(r13, r3, r5)
        L2e:
            r5.recycle()
        L31:
            int r2 = r2 + 1
            goto L6
        L34:
            r14 = r1
        L35:
            if (r14 >= r0) goto L47
            android.view.View r2 = r13.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r2
            r2.m28794()
            int r14 = r14 + 1
            goto L35
        L47:
            r14 = 0
            r13.mBehaviorTouchView = r14
            r13.mDisallowInterceptReset = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m28778(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
            int r1 = r0.f28952
            if (r1 == r4) goto L11
            int r1 = r4 - r1
            Yue.C6794.m26198(r3, r1)
            r0.f28952 = r4
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m28779(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C7497) r0
            int r1 = r0.f28953
            if (r1 == r4) goto L11
            int r1 = r4 - r1
            Yue.C6794.m26199(r3, r1)
            r0.f28953 = r4
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m28780() {
            r1 = this;
            boolean r0 = Yue.C6794.m26134(r1)
            if (r0 == 0) goto L1c
            Yue.ۥۣۡۡۡ r0 = r1.mApplyWindowInsetsListener
            if (r0 != 0) goto L11
            androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ
            r0.<init>(r1)
            r1.mApplyWindowInsetsListener = r0
        L11:
            Yue.ۥۣۡۡۡ r0 = r1.mApplyWindowInsetsListener
            Yue.C6794.m26252(r1, r0)
            r0 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r0)
            goto L20
        L1c:
            r0 = 0
            Yue.C6794.m26252(r1, r0)
        L20:
            return
    }
}
