package androidx.coordinatorlayout.widget;

import Yue.AbstractC2967;
import Yue.C4187;
import Yue.C4404;
import Yue.C4520;
import Yue.C5194;
import Yue.C6370;
import Yue.C6499;
import Yue.C6702;
import Yue.C6980;
import Yue.C8273;
import Yue.C8312;
import Yue.C8472;
import Yue.InterfaceC3451;
import Yue.InterfaceC3897;
import Yue.InterfaceC4525;
import Yue.InterfaceC4885;
import Yue.InterfaceC5411;
import Yue.InterfaceC6367;
import Yue.InterfaceC6368;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6545;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.material.color.utilities.Contrast;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC6367, InterfaceC6368 {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<AbstractC8792>>> sConstructors;
    private static final C6702.InterfaceC1067<Rect> sRectPool;
    private InterfaceC6545 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final C4404<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private C8472 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final C6370 mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private ViewTreeObserverOnPreDrawListenerC8797 mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ */
    public class C1653 implements InterfaceC6545 {
        public C1653() {
        }

        @Override // Yue.InterfaceC6545
        public C8472 onApplyWindowInsets(View view, C8472 c8472) {
            return CoordinatorLayout.this.setWindowInsets(c8472);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟ */
    public interface InterfaceC1654 {
        @InterfaceC6391
        AbstractC8792 getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC8792<V extends View> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC8792() {
        }

        @InterfaceC6490
        public static Object getTag(@InterfaceC6391 View view) {
            return ((C8796) view.getLayoutParams()).f29450;
        }

        public static void setTag(@InterfaceC6391 View view, @InterfaceC6490 Object obj) {
            ((C8796) view.getLayoutParams()).f29450 = obj;
        }

        public boolean blocksInteractionBelow(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public boolean getInsetDodgeRect(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 Rect rect) {
            return false;
        }

        @InterfaceC3897
        public int getScrimColor(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v) {
            return C8273.f24692;
        }

        @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
        public float getScrimOpacity(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view) {
            return false;
        }

        @InterfaceC6391
        public C8472 onApplyWindowInsets(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 C8472 c8472) {
            return c8472;
        }

        public void onAttachedToLayoutParams(@InterfaceC6391 C8796 c8796) {
        }

        public boolean onDependentViewChanged(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view) {
            return false;
        }

        public void onDependentViewRemoved(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, int i) {
            return false;
        }

        public boolean onMeasureChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, float f, float f2) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public void onNestedPreScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, int i, int i2, @InterfaceC6391 int[] iArr) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public void onNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public void onNestedScrollAccepted(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 Parcelable parcelable) {
        }

        @InterfaceC6490
        public Parcelable onSaveInstanceState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public boolean onStartNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public void onStopNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view) {
        }

        public boolean onTouchEvent(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 MotionEvent motionEvent) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC8792(Context context, AttributeSet attributeSet) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void onNestedPreScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, int i, int i2, @InterfaceC6391 int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Deprecated
        public void onNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void onNestedScrollAccepted(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public boolean onStartNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void onStopNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, int i, int i2, int i3, int i4, int i5, @InterfaceC6391 int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟, reason: contains not printable characters */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface InterfaceC8793 {
        Class<? extends AbstractC8792> value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8794 {
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟۠, reason: contains not printable characters */
    public class ViewGroupOnHierarchyChangeListenerC8795 implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC8795() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class ViewTreeObserverOnPreDrawListenerC8797 implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC8797() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C8799 implements Comparator<View> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM27388 = C8273.m27388(view);
            float fM273882 = C8273.m27388(view2);
            if (fM27388 > fM273882) {
                return -1;
            }
            return fM27388 < fM273882 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new C8799();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new C6702.C6703(12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CoordinatorLayout(@InterfaceC6391 Context context) {
        this(context, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC8792 parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC8792>>> threadLocal = sConstructors;
            Map<String, Constructor<AbstractC8792>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<AbstractC8792> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static Rect m4737() {
        Rect rectAcquire = sRectPool.acquire();
        return rectAcquire == null ? new Rect() : rectAcquire;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    private static int m4738(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m29485(@InterfaceC6391 Rect rect) {
        rect.setEmpty();
        sRectPool.release(rect);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m29486(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static int m29487(int i) {
        if ((i & 7) == 0) {
            i |= C5194.f1338;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static int m29488(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC8797();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C8796) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(@InterfaceC6391 View view) {
        List listM12750 = this.mChildDag.m12750(view);
        if (listM12750 == null || listM12750.isEmpty()) {
            return;
        }
        for (int i = 0; i < listM12750.size(); i++) {
            View view2 = (View) listM12750.get(i);
            AbstractC8792 abstractC8792M29508 = ((C8796) view2.getLayoutParams()).m29508();
            if (abstractC8792M29508 != null) {
                abstractC8792M29508.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(@InterfaceC6391 View view, @InterfaceC6391 View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectM4737 = m4737();
        getChildRect(view, view.getParent() != this, rectM4737);
        Rect rectM47372 = m4737();
        getChildRect(view2, view2.getParent() != this, rectM47372);
        try {
            if (rectM4737.left <= rectM47372.right && rectM4737.top <= rectM47372.bottom && rectM4737.right >= rectM47372.left) {
                if (rectM4737.bottom >= rectM47372.top) {
                    z = true;
                }
            }
            return z;
        } finally {
            m29485(rectM4737);
            m29485(rectM47372);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C8796 c8796 = (C8796) view.getLayoutParams();
        AbstractC8792 abstractC8792 = c8796.f3748;
        if (abstractC8792 != null) {
            float scrimOpacity = abstractC8792.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(c8796.f3748.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(m4738(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (m29494(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    public void getChildRect(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @InterfaceC6391
    public List<View> getDependencies(@InterfaceC6391 View view) {
        List<View> listM12751 = this.mChildDag.m12751(view);
        this.mTempDependenciesList.clear();
        if (listM12751 != null) {
            this.mTempDependenciesList.addAll(listM12751);
        }
        return this.mTempDependenciesList;
    }

    @InterfaceC8392
    public final List<View> getDependencySortedChildren() {
        m29500();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    @InterfaceC6391
    public List<View> getDependents(@InterfaceC6391 View view) {
        List listM12750 = this.mChildDag.m12750(view);
        this.mTempDependenciesList.clear();
        if (listM12750 != null) {
            this.mTempDependenciesList.addAll(listM12750);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        C8312.m4297(this, view, rect);
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        C8796 c8796 = (C8796) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m29491(view, i, rect, rect2, c8796, measuredWidth, measuredHeight);
        m29489(c8796, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((C8796) view.getLayoutParams()).m29510());
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public final C8472 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup, Yue.InterfaceC6369
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.m2825();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public C8796 getResolvedLayoutParams(View view) {
        C8796 c8796 = (C8796) view.getLayoutParams();
        if (!c8796.f3749) {
            if (view instanceof InterfaceC1654) {
                AbstractC8792 behavior = ((InterfaceC1654) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                c8796.m29519(behavior);
                c8796.f3749 = true;
            } else {
                InterfaceC8793 interfaceC8793 = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC8793 = (InterfaceC8793) superclass.getAnnotation(InterfaceC8793.class);
                    if (interfaceC8793 != null) {
                        break;
                    }
                }
                if (interfaceC8793 != null) {
                    try {
                        c8796.m29519(interfaceC8793.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e) {
                        Log.e(TAG, "Default behavior class " + interfaceC8793.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                c8796.f3749 = true;
            }
        }
        return c8796;
    }

    @InterfaceC6490
    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public boolean isPointInChildBounds(@InterfaceC6391 View view, int i, int i2) {
        Rect rectM4737 = m4737();
        getDescendantRect(view, rectM4737);
        try {
            return rectM4737.contains(i, i2);
        } finally {
            m29485(rectM4737);
        }
    }

    public void offsetChildToAnchor(View view, int i) {
        AbstractC8792 abstractC8792M29508;
        C8796 c8796 = (C8796) view.getLayoutParams();
        if (c8796.f29443 != null) {
            Rect rectM4737 = m4737();
            Rect rectM47372 = m4737();
            Rect rectM47373 = m4737();
            getDescendantRect(c8796.f29443, rectM4737);
            getChildRect(view, false, rectM47372);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m29491(view, i, rectM4737, rectM47373, c8796, measuredWidth, measuredHeight);
            boolean z = (rectM47373.left == rectM47372.left && rectM47373.top == rectM47372.top) ? false : true;
            m29489(c8796, rectM47373, measuredWidth, measuredHeight);
            int i2 = rectM47373.left - rectM47372.left;
            int i3 = rectM47373.top - rectM47372.top;
            if (i2 != 0) {
                C8273.m27414(view, i2);
            }
            if (i3 != 0) {
                C8273.m27415(view, i3);
            }
            if (z && (abstractC8792M29508 = c8796.m29508()) != null) {
                abstractC8792M29508.onDependentViewChanged(this, view, c8796.f29443);
            }
            m29485(rectM4737);
            m29485(rectM47372);
            m29485(rectM47373);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m29501(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC8797();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && C8273.m27350(this)) {
            C8273.m27433(this);
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onChildViewsChanged(int i) {
        int i2;
        boolean zOnDependentViewChanged;
        int iM27356 = C8273.m27356(this);
        int size = this.mDependencySortedChildren.size();
        Rect rectM4737 = m4737();
        Rect rectM47372 = m4737();
        Rect rectM47373 = m4737();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.mDependencySortedChildren.get(i3);
            C8796 c8796 = (C8796) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (c8796.f29444 == this.mDependencySortedChildren.get(i4)) {
                        offsetChildToAnchor(view, iM27356);
                    }
                }
                getChildRect(view, true, rectM47372);
                if (c8796.f29439 != 0 && !rectM47372.isEmpty()) {
                    int iM15901 = C5194.m15901(c8796.f29439, iM27356);
                    int i5 = iM15901 & 112;
                    if (i5 == 48) {
                        rectM4737.top = Math.max(rectM4737.top, rectM47372.bottom);
                    } else if (i5 == 80) {
                        rectM4737.bottom = Math.max(rectM4737.bottom, getHeight() - rectM47372.top);
                    }
                    int i6 = iM15901 & 7;
                    if (i6 == 3) {
                        rectM4737.left = Math.max(rectM4737.left, rectM47372.right);
                    } else if (i6 == 5) {
                        rectM4737.right = Math.max(rectM4737.right, getWidth() - rectM47372.left);
                    }
                }
                if (c8796.f29440 != 0 && view.getVisibility() == 0) {
                    m29498(view, rectM4737, iM27356);
                }
                if (i != 2) {
                    getLastChildRect(view, rectM47373);
                    if (!rectM47373.equals(rectM47372)) {
                        recordLastChildRect(view, rectM47372);
                        for (i2 = i3 + 1; i2 < size; i2++) {
                            View view2 = this.mDependencySortedChildren.get(i2);
                            C8796 c87962 = (C8796) view2.getLayoutParams();
                            AbstractC8792 abstractC8792M29508 = c87962.m29508();
                            if (abstractC8792M29508 != null && abstractC8792M29508.layoutDependsOn(this, view2, view)) {
                                if (i == 0 && c87962.m29509()) {
                                    c87962.m29514();
                                } else {
                                    if (i != 2) {
                                        zOnDependentViewChanged = abstractC8792M29508.onDependentViewChanged(this, view2, view);
                                    } else {
                                        abstractC8792M29508.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    }
                                    if (i == 1) {
                                        c87962.m29520(zOnDependentViewChanged);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                    }
                }
            }
        }
        m29485(rectM4737);
        m29485(rectM47372);
        m29485(rectM47373);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m29501(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        C8472 c8472 = this.mLastInsets;
        int iM28293 = c8472 != null ? c8472.m28293() : 0;
        if (iM28293 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iM28293);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m29501(true);
        }
        boolean zM29499 = m29499(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m29501(true);
        }
        return zM29499;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC8792 abstractC8792M29508;
        int iM27356 = C8273.m27356(this);
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((abstractC8792M29508 = ((C8796) view.getLayoutParams()).m29508()) == null || !abstractC8792M29508.onLayoutChild(this, view, iM27356))) {
                onLayoutChild(view, iM27356);
            }
        }
    }

    public void onLayoutChild(@InterfaceC6391 View view, int i) {
        C8796 c8796 = (C8796) view.getLayoutParams();
        if (c8796.m4739()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c8796.f29443;
        if (view2 != null) {
            m29496(view, view2, i);
            return;
        }
        int i2 = c8796.f29437;
        if (i2 >= 0) {
            m29497(view, i2, i);
        } else {
            m29495(view, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC8792 abstractC8792M29508;
        C8796 c8796;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        m29500();
        ensurePreDrawListener();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int iM27356 = C8273.m27356(this);
        boolean z = iM27356 == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i10 = paddingLeft + paddingRight;
        int i11 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z2 = this.mLastInsets != null && C8273.m27350(this);
        int size3 = this.mDependencySortedChildren.size();
        int i12 = suggestedMinimumWidth;
        int i13 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i14 = 0;
        while (i14 < size3) {
            View view = this.mDependencySortedChildren.get(i14);
            if (view.getVisibility() == 8) {
                i8 = i14;
                i5 = size3;
                i6 = paddingLeft;
            } else {
                C8796 c87962 = (C8796) view.getLayoutParams();
                int i15 = c87962.f29437;
                if (i15 < 0 || mode == 0) {
                    i3 = iCombineMeasuredStates;
                } else {
                    int iM29492 = m29492(i15);
                    int iM15901 = C5194.m15901(m29488(c87962.f29435), iM27356) & 7;
                    i3 = iCombineMeasuredStates;
                    if ((iM15901 == 3 && !z) || (iM15901 == 5 && z)) {
                        iMax = Math.max(0, (size - paddingRight) - iM29492);
                    } else if ((iM15901 == 5 && !z) || (iM15901 == 3 && z)) {
                        iMax = Math.max(0, iM29492 - paddingLeft);
                    }
                    if (z2 || C8273.m27350(view)) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        int iM28291 = this.mLastInsets.m28291() + this.mLastInsets.m28292();
                        int iM28293 = this.mLastInsets.m28293() + this.mLastInsets.m28290();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM28291, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM28293, mode2);
                    }
                    abstractC8792M29508 = c87962.m29508();
                    if (abstractC8792M29508 == null) {
                        c8796 = c87962;
                        i7 = i3;
                        i8 = i14;
                        i4 = i13;
                        i6 = paddingLeft;
                        i9 = i12;
                        i5 = size3;
                        if (!abstractC8792M29508.onMeasureChild(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                        }
                        C8796 c87963 = c8796;
                        int iMax2 = Math.max(i9, i10 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c87963).leftMargin + ((ViewGroup.MarginLayoutParams) c87963).rightMargin);
                        int iMax3 = Math.max(i4, i11 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c87963).topMargin + ((ViewGroup.MarginLayoutParams) c87963).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i7, view.getMeasuredState());
                        i12 = iMax2;
                        i13 = iMax3;
                    } else {
                        c8796 = c87962;
                        i4 = i13;
                        i5 = size3;
                        i6 = paddingLeft;
                        i7 = i3;
                        i8 = i14;
                        i9 = i12;
                    }
                    onMeasureChild(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    C8796 c879632 = c8796;
                    int iMax22 = Math.max(i9, i10 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c879632).leftMargin + ((ViewGroup.MarginLayoutParams) c879632).rightMargin);
                    int iMax32 = Math.max(i4, i11 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c879632).topMargin + ((ViewGroup.MarginLayoutParams) c879632).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i7, view.getMeasuredState());
                    i12 = iMax22;
                    i13 = iMax32;
                }
                iMax = 0;
                if (z2) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                    abstractC8792M29508 = c87962.m29508();
                    if (abstractC8792M29508 == null) {
                    }
                    onMeasureChild(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    C8796 c8796322 = c8796;
                    int iMax222 = Math.max(i9, i10 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c8796322).leftMargin + ((ViewGroup.MarginLayoutParams) c8796322).rightMargin);
                    int iMax322 = Math.max(i4, i11 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c8796322).topMargin + ((ViewGroup.MarginLayoutParams) c8796322).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i7, view.getMeasuredState());
                    i12 = iMax222;
                    i13 = iMax322;
                }
            }
            i14 = i8 + 1;
            paddingLeft = i6;
            size3 = i5;
        }
        int i16 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i12, i, (-16777216) & i16), View.resolveSizeAndState(i13, i2, i16 << 16));
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC8792 abstractC8792M29508;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C8796 c8796 = (C8796) childAt.getLayoutParams();
                if (c8796.m29513(0) && (abstractC8792M29508 = c8796.m29508()) != null) {
                    zOnNestedFling |= abstractC8792M29508.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (zOnNestedFling) {
            onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC8792 abstractC8792M29508;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C8796 c8796 = (C8796) childAt.getLayoutParams();
                if (c8796.m29513(0) && (abstractC8792M29508 = c8796.m29508()) != null) {
                    zOnNestedPreFling |= abstractC8792M29508.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return zOnNestedPreFling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C8798)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8798 c8798 = (C8798) parcelable;
        super.onRestoreInstanceState(c8798.getSuperState());
        SparseArray<Parcelable> sparseArray = c8798.f29452;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC8792 abstractC8792M29508 = getResolvedLayoutParams(childAt).m29508();
            if (id != -1 && abstractC8792M29508 != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC8792M29508.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        C8798 c8798 = new C8798(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC8792 abstractC8792M29508 = ((C8796) childAt.getLayoutParams()).m29508();
            if (id != -1 && abstractC8792M29508 != null && (parcelableOnSaveInstanceState = abstractC8792M29508.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        c8798.f29452 = sparseArray;
        return c8798;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM29499;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zM29499 = m29499(motionEvent, 1);
            if (!zM29499) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView != null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zM29499) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m29501(false);
            }
            return zOnTouchEvent;
        }
        zM29499 = false;
        AbstractC8792 abstractC8792M29508 = ((C8796) this.mBehaviorTouchView.getLayoutParams()).m29508();
        if (abstractC8792M29508 != null) {
            zOnTouchEvent = abstractC8792M29508.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked != 1) {
            m29501(false);
        }
        return zOnTouchEvent;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((C8796) view.getLayoutParams()).m29521(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC8792 abstractC8792M29508 = ((C8796) view.getLayoutParams()).m29508();
        if (abstractC8792M29508 == null || !abstractC8792M29508.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        m29501(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m29504();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@InterfaceC6490 Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                C4520.m13234(this.mStatusBarBackground, C8273.m27356(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            C8273.m27425(this);
        }
    }

    public void setStatusBarBackgroundColor(@InterfaceC3897 int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@InterfaceC4525 int i) {
        setStatusBarBackground(i != 0 ? C4187.m12065(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.mStatusBarBackground.setVisible(z, false);
    }

    public final C8472 setWindowInsets(C8472 c8472) {
        if (C6499.m2995(this.mLastInsets, c8472)) {
            return c8472;
        }
        this.mLastInsets = c8472;
        boolean z = false;
        boolean z2 = c8472 != null && c8472.m28293() > 0;
        this.mDrawStatusBarBackground = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        C8472 c8472M29490 = m29490(c8472);
        requestLayout();
        return c8472M29490;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29489(C8796 c8796, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c8796).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c8796).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c8796).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c8796).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C8472 m29490(C8472 c8472) {
        AbstractC8792 abstractC8792M29508;
        if (c8472.m28301()) {
            return c8472;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C8273.m27350(childAt) && (abstractC8792M29508 = ((C8796) childAt.getLayoutParams()).m29508()) != null) {
                c8472 = abstractC8792M29508.onApplyWindowInsets(this, childAt, c8472);
                if (c8472.m28301()) {
                    break;
                }
            }
        }
        return c8472;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m29491(View view, int i, Rect rect, Rect rect2, C8796 c8796, int i2, int i3) {
        int iM15901 = C5194.m15901(m29486(c8796.f29435), i);
        int iM159012 = C5194.m15901(m29487(c8796.f29436), i);
        int i4 = iM15901 & 7;
        int i5 = iM15901 & 112;
        int i6 = iM159012 & 7;
        int i7 = iM159012 & 112;
        int iWidth = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m29492(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e(TAG, "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m29493(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m29494(View view) {
        return this.mChildDag.m12753(view);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m29495(View view, int i) {
        C8796 c8796 = (C8796) view.getLayoutParams();
        Rect rectM4737 = m4737();
        rectM4737.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c8796).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c8796).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c8796).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c8796).bottomMargin);
        if (this.mLastInsets != null && C8273.m27350(this) && !C8273.m27350(view)) {
            rectM4737.left += this.mLastInsets.m28291();
            rectM4737.top += this.mLastInsets.m28293();
            rectM4737.right -= this.mLastInsets.m28292();
            rectM4737.bottom -= this.mLastInsets.m28290();
        }
        Rect rectM47372 = m4737();
        C5194.m1974(m29487(c8796.f29435), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM4737, rectM47372, i);
        view.layout(rectM47372.left, rectM47372.top, rectM47372.right, rectM47372.bottom);
        m29485(rectM4737);
        m29485(rectM47372);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m29496(View view, View view2, int i) {
        Rect rectM4737 = m4737();
        Rect rectM47372 = m4737();
        try {
            getDescendantRect(view2, rectM4737);
            getDesiredAnchoredChildRect(view, i, rectM4737, rectM47372);
            view.layout(rectM47372.left, rectM47372.top, rectM47372.right, rectM47372.bottom);
        } finally {
            m29485(rectM4737);
            m29485(rectM47372);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m29497(View view, int i, int i2) {
        C8796 c8796 = (C8796) view.getLayoutParams();
        int iM15901 = C5194.m15901(m29488(c8796.f29435), i2);
        int i3 = iM15901 & 7;
        int i4 = iM15901 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int iM29492 = m29492(i) - measuredWidth;
        if (i3 == 1) {
            iM29492 += measuredWidth / 2;
        } else if (i3 == 5) {
            iM29492 += measuredWidth;
        }
        int i5 = i4 != 16 ? i4 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c8796).leftMargin, Math.min(iM29492, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c8796).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c8796).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c8796).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m29498(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C8273.m27404(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C8796 c8796 = (C8796) view.getLayoutParams();
            AbstractC8792 abstractC8792M29508 = c8796.m29508();
            Rect rectM4737 = m4737();
            Rect rectM47372 = m4737();
            rectM47372.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC8792M29508 == null || !abstractC8792M29508.getInsetDodgeRect(this, view, rectM4737)) {
                rectM4737.set(rectM47372);
            } else if (!rectM47372.contains(rectM4737)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM4737.toShortString() + " | Bounds:" + rectM47372.toShortString());
            }
            m29485(rectM47372);
            if (rectM4737.isEmpty()) {
                m29485(rectM4737);
                return;
            }
            int iM15901 = C5194.m15901(c8796.f29440, i);
            boolean z3 = true;
            if ((iM15901 & 48) != 48 || (i6 = (rectM4737.top - ((ViewGroup.MarginLayoutParams) c8796).topMargin) - c8796.f29442) >= (i7 = rect.top)) {
                z = false;
            } else {
                m29503(view, i7 - i6);
                z = true;
            }
            if ((iM15901 & 80) == 80 && (height = ((getHeight() - rectM4737.bottom) - ((ViewGroup.MarginLayoutParams) c8796).bottomMargin) + c8796.f29442) < (i5 = rect.bottom)) {
                m29503(view, height - i5);
                z = true;
            }
            if (!z) {
                m29503(view, 0);
            }
            if ((iM15901 & 3) != 3 || (i3 = (rectM4737.left - ((ViewGroup.MarginLayoutParams) c8796).leftMargin) - c8796.f29441) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m29502(view, i4 - i3);
                z2 = true;
            }
            if ((iM15901 & 5) != 5 || (width = ((getWidth() - rectM4737.right) - ((ViewGroup.MarginLayoutParams) c8796).rightMargin) + c8796.f29441) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m29502(view, width - i2);
            }
            if (!z3) {
                m29502(view, 0);
            }
            m29485(rectM4737);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m29499(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        m29493(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C8796 c8796 = (C8796) view.getLayoutParams();
            AbstractC8792 abstractC8792M29508 = c8796.m29508();
            if (!(zOnInterceptTouchEvent || z) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && abstractC8792M29508 != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = abstractC8792M29508.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = abstractC8792M29508.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean zM29505 = c8796.m29505();
                boolean zM29512 = c8796.m29512(this, view);
                z = zM29512 && !zM29505;
                if (zM29512 && !z) {
                    break;
                }
            } else if (abstractC8792M29508 != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC8792M29508.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC8792M29508.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m29500() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.m12746();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C8796 resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.m29506(this, childAt);
            this.mChildDag.m1353(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (resolvedLayoutParams.m4740(this, childAt, childAt2)) {
                        if (!this.mChildDag.m12747(childAt2)) {
                            this.mChildDag.m1353(childAt2);
                        }
                        this.mChildDag.m1352(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.m12752());
        Collections.reverse(this.mDependencySortedChildren);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m29501(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC8792 abstractC8792M29508 = ((C8796) childAt.getLayoutParams()).m29508();
            if (abstractC8792M29508 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC8792M29508.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    abstractC8792M29508.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C8796) getChildAt(i2).getLayoutParams()).m29516();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m29502(View view, int i) {
        C8796 c8796 = (C8796) view.getLayoutParams();
        int i2 = c8796.f29441;
        if (i2 != i) {
            C8273.m27414(view, i - i2);
            c8796.f29441 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m29503(View view, int i) {
        C8796 c8796 = (C8796) view.getLayoutParams();
        int i2 = c8796.f29442;
        if (i2 != i) {
            C8273.m27415(view, i - i2);
            c8796.f29442 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m29504() {
        if (!C8273.m27350(this)) {
            C8273.m27468(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new C1653();
        }
        C8273.m27468(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CoordinatorLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6980.C1130.f2588);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C8796 generateDefaultLayoutParams() {
        return new C8796(-2, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6367
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC8792 abstractC8792M29508;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C8796 c8796 = (C8796) childAt.getLayoutParams();
                if (c8796.m29513(i3) && (abstractC8792M29508 = c8796.m29508()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC8792M29508.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6367
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6367
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        AbstractC8792 abstractC8792M29508;
        this.mNestedScrollingParentHelper.m19889(view, view2, i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C8796 c8796 = (C8796) childAt.getLayoutParams();
            if (c8796.m29513(i2) && (abstractC8792M29508 = c8796.m29508()) != null) {
                abstractC8792M29508.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6367
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C8796 c8796 = (C8796) childAt.getLayoutParams();
                AbstractC8792 abstractC8792M29508 = c8796.m29508();
                if (abstractC8792M29508 != null) {
                    boolean zOnStartNestedScroll = abstractC8792M29508.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= zOnStartNestedScroll;
                    c8796.m29522(i2, zOnStartNestedScroll);
                } else {
                    c8796.m29522(i2, false);
                }
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6367
    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.m19891(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C8796 c8796 = (C8796) childAt.getLayoutParams();
            if (c8796.m29513(i)) {
                AbstractC8792 abstractC8792M29508 = c8796.m29508();
                if (abstractC8792M29508 != null) {
                    abstractC8792M29508.onStopNestedScroll(this, childAt, view, i);
                }
                c8796.m29515(i);
                c8796.m29514();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new C4404<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new C6370(this);
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6980.C6988.f20907, 0, C6980.C6987.f20902);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6980.C6988.f20907, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C6980.C6988.f20907, attributeSet, typedArrayObtainStyledAttributes, 0, C6980.C6987.f20902);
            } else {
                saveAttributeDataForStyleable(context, C6980.C6988.f20907, attributeSet, typedArrayObtainStyledAttributes, i, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C6980.C6988.f20908, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.mKeylines[i2] = (int) (r12[i2] * f);
            }
        }
        this.mStatusBarBackground = typedArrayObtainStyledAttributes.getDrawable(C6980.C6988.f20909);
        typedArrayObtainStyledAttributes.recycle();
        m29504();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC8795());
        if (C8273.m27351(this) == 0) {
            C8273.m27457(this, 1);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C8796 generateLayoutParams(AttributeSet attributeSet) {
        return new C8796(getContext(), attributeSet);
    }

    @Override // Yue.InterfaceC6368
    public void onNestedScroll(@InterfaceC6391 View view, int i, int i2, int i3, int i4, int i5, @InterfaceC6391 int[] iArr) {
        AbstractC8792 abstractC8792M29508;
        boolean z;
        int iMin;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C8796 c8796 = (C8796) childAt.getLayoutParams();
                if (c8796.m29513(i5) && (abstractC8792M29508 = c8796.m29508()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC8792M29508.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        iMin = Math.max(i6, this.mBehaviorConsumed[1]);
                    } else {
                        z = true;
                        iMin = Math.min(i6, this.mBehaviorConsumed[1]);
                    }
                    i6 = iMin;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C8796 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C8796) {
            return new C8796((C8796) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C8796((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C8796(layoutParams);
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C8798 extends AbstractC2967 {
        public static final Parcelable.Creator<C8798> CREATOR = new C1655();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public SparseArray<Parcelable> f29452;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥۣ۟۟۟$ۥ */
        public static class C1655 implements Parcelable.ClassLoaderCreator<C8798> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8798 createFromParcel(Parcel parcel) {
                return new C8798(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8798 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C8798(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public C8798[] newArray(int i) {
                return new C8798[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8798(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f29452 = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f29452.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f29452;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f29452.keyAt(i2);
                parcelableArr[i2] = this.f29452.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public C8798(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C8796 extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: ۥ */
        public AbstractC8792 f3748;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f3749;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29435;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29436;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29437;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29438;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f29439;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f29440;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f29441;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f29442;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public View f29443;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public View f29444;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f29445;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean f29446;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean f29447;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean f29448;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final Rect f29449;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public Object f29450;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8796(int i, int i2) {
            super(i, i2);
            this.f3749 = false;
            this.f29435 = 0;
            this.f29436 = 0;
            this.f29437 = -1;
            this.f29438 = -1;
            this.f29439 = 0;
            this.f29440 = 0;
            this.f29449 = new Rect();
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m4739() {
            return this.f29443 == null && this.f29438 != -1;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4740(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC8792 abstractC8792;
            return view2 == this.f29444 || m29523(view2, C8273.m27356(coordinatorLayout)) || ((abstractC8792 = this.f3748) != null && abstractC8792.layoutDependsOn(coordinatorLayout, view, view2));
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m29505() {
            if (this.f3748 == null) {
                this.f29445 = false;
            }
            return this.f29445;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public View m29506(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f29438 == -1) {
                this.f29444 = null;
                this.f29443 = null;
                return null;
            }
            if (this.f29443 == null || !m29524(view, coordinatorLayout)) {
                m29517(view, coordinatorLayout);
            }
            return this.f29443;
        }

        @InterfaceC5411
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m29507() {
            return this.f29438;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public AbstractC8792 m29508() {
            return this.f3748;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean m29509() {
            return this.f29448;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Rect m29510() {
            return this.f29449;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m29511() {
            this.f29444 = null;
            this.f29443 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean m29512(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f29445;
            if (z) {
                return true;
            }
            AbstractC8792 abstractC8792 = this.f3748;
            boolean zBlocksInteractionBelow = (abstractC8792 != null ? abstractC8792.blocksInteractionBelow(coordinatorLayout, view) : false) | z;
            this.f29445 = zBlocksInteractionBelow;
            return zBlocksInteractionBelow;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean m29513(int i) {
            if (i == 0) {
                return this.f29446;
            }
            if (i != 1) {
                return false;
            }
            return this.f29447;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m29514() {
            this.f29448 = false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void m29515(int i) {
            m29522(i, false);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m29516() {
            this.f29445 = false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m29517(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f29438);
            this.f29443 = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f29444 = null;
                    this.f29443 = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f29438) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f29444 = null;
                this.f29443 = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f29444 = null;
                    this.f29443 = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f29444 = viewFindViewById;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public void m29518(@InterfaceC5411 int i) {
            m29511();
            this.f29438 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public void m29519(@InterfaceC6490 AbstractC8792 abstractC8792) {
            AbstractC8792 abstractC87922 = this.f3748;
            if (abstractC87922 != abstractC8792) {
                if (abstractC87922 != null) {
                    abstractC87922.onDetachedFromLayoutParams();
                }
                this.f3748 = abstractC8792;
                this.f29450 = null;
                this.f3749 = true;
                if (abstractC8792 != null) {
                    abstractC8792.onAttachedToLayoutParams(this);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public void m29520(boolean z) {
            this.f29448 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void m29521(Rect rect) {
            this.f29449.set(rect);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public void m29522(int i, boolean z) {
            if (i == 0) {
                this.f29446 = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.f29447 = z;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final boolean m29523(View view, int i) {
            int iM15901 = C5194.m15901(((C8796) view.getLayoutParams()).f29439, i);
            return iM15901 != 0 && (C5194.m15901(this.f29440, i) & iM15901) == iM15901;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final boolean m29524(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f29443.getId() != this.f29438) {
                return false;
            }
            View view2 = this.f29443;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f29444 = null;
                    this.f29443 = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f29444 = view2;
            return true;
        }

        public C8796(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3749 = false;
            this.f29435 = 0;
            this.f29436 = 0;
            this.f29437 = -1;
            this.f29438 = -1;
            this.f29439 = 0;
            this.f29440 = 0;
            this.f29449 = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6980.C6988.f20910);
            this.f29435 = typedArrayObtainStyledAttributes.getInteger(C6980.C6988.f20911, 0);
            this.f29438 = typedArrayObtainStyledAttributes.getResourceId(C6980.C6988.f20912, -1);
            this.f29436 = typedArrayObtainStyledAttributes.getInteger(C6980.C6988.f20913, 0);
            this.f29437 = typedArrayObtainStyledAttributes.getInteger(C6980.C6988.f20917, -1);
            this.f29439 = typedArrayObtainStyledAttributes.getInt(C6980.C6988.f20916, 0);
            this.f29440 = typedArrayObtainStyledAttributes.getInt(C6980.C6988.f20915, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(C6980.C6988.f20914);
            this.f3749 = zHasValue;
            if (zHasValue) {
                this.f3748 = CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(C6980.C6988.f20914));
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC8792 abstractC8792 = this.f3748;
            if (abstractC8792 != null) {
                abstractC8792.onAttachedToLayoutParams(this);
            }
        }

        public C8796(C8796 c8796) {
            super((ViewGroup.MarginLayoutParams) c8796);
            this.f3749 = false;
            this.f29435 = 0;
            this.f29436 = 0;
            this.f29437 = -1;
            this.f29438 = -1;
            this.f29439 = 0;
            this.f29440 = 0;
            this.f29449 = new Rect();
        }

        public C8796(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3749 = false;
            this.f29435 = 0;
            this.f29436 = 0;
            this.f29437 = -1;
            this.f29438 = -1;
            this.f29439 = 0;
            this.f29440 = 0;
            this.f29449 = new Rect();
        }

        public C8796(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3749 = false;
            this.f29435 = 0;
            this.f29436 = 0;
            this.f29437 = -1;
            this.f29438 = -1;
            this.f29439 = 0;
            this.f29440 = 0;
            this.f29449 = new Rect();
        }
    }
}
