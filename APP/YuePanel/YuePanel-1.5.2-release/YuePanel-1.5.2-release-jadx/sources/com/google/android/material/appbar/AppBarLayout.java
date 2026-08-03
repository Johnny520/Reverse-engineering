package com.google.android.material.appbar;

import Yue.AbstractC2967;
import Yue.C3024;
import Yue.C3055;
import Yue.C3323;
import Yue.C4520;
import Yue.C6132;
import Yue.C6499;
import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC3897;
import Yue.InterfaceC4399;
import Yue.InterfaceC4525;
import Yue.InterfaceC5411;
import Yue.InterfaceC6365;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6545;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC1654 {
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;
    private Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private final boolean hasLiftOnScrollColor;
    private boolean haveChildWithInterpolator;

    @InterfaceC6490
    private C8472 lastInsets;
    private boolean liftOnScroll;

    @InterfaceC6490
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;

    @InterfaceC6490
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List<LiftOnScrollListener> liftOnScrollListeners;

    @InterfaceC6490
    private WeakReference<View> liftOnScrollTargetView;

    @InterfaceC5411
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<BaseOnOffsetChangedListener> listeners;
    private int pendingAction;

    @InterfaceC6490
    private Drawable statusBarForeground;

    @InterfaceC6490
    private Integer statusBarForegroundOriginalColor;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;

        @InterfaceC6490
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private BaseDragCallback onDragCallback;
        private SavedState savedState;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(@InterfaceC6391 T t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BaseBehavior() {
        }

        private void addAccessibilityDelegateIfNeeded(final CoordinatorLayout coordinatorLayout, @InterfaceC6391 final T t) {
            if (C8273.m27389(coordinatorLayout)) {
                return;
            }
            C8273.m27439(coordinatorLayout, new C3024() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                @Override // Yue.C3024
                public void onInitializeAccessibilityNodeInfo(View view, @InterfaceC6391 C3055 c3055) {
                    View childWithScrollingBehavior;
                    super.onInitializeAccessibilityNodeInfo(view, c3055);
                    c3055.m6057(ScrollView.class.getName());
                    if (t.getTotalScrollRange() == 0 || (childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout)) == null || !BaseBehavior.this.childrenHaveScrollFlags(t)) {
                        return;
                    }
                    if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != (-t.getTotalScrollRange())) {
                        c3055.m119(C3055.C0034.f4520);
                        c3055.m6097(true);
                    }
                    if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                        if (!childWithScrollingBehavior.canScrollVertically(-1)) {
                            c3055.m119(C3055.C0034.f4521);
                            c3055.m6097(true);
                        } else if ((-t.getDownNestedPreScrollRange()) != 0) {
                            c3055.m119(C3055.C0034.f4521);
                            c3055.m6097(true);
                        }
                    }
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // Yue.C3024
                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    if (i == 4096) {
                        t.setExpanded(false);
                        return true;
                    }
                    if (i != 8192) {
                        return super.performAccessibilityAction(view, i, bundle);
                    }
                    if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                        View childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout);
                        if (!childWithScrollingBehavior.canScrollVertically(-1)) {
                            t.setExpanded(true);
                            return true;
                        }
                        int i2 = -t.getDownNestedPreScrollRange();
                        if (i2 != 0) {
                            BaseBehavior.this.onNestedPreScroll(coordinatorLayout, t, childWithScrollingBehavior, 0, i2, new int[]{0, 0}, 1);
                            return true;
                        }
                    }
                    return false;
                }
            });
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, int i, float f) {
            int iAbs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
            float fAbs = Math.abs(f);
            animateOffsetWithDuration(coordinatorLayout, t, i, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f));
        }

        private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final T t, int i, int i2) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i) {
                ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.offsetAnimator.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@InterfaceC6391 ValueAnimator valueAnimator4) {
                        BaseBehavior.this.setHeaderTopBottomOffset(coordinatorLayout, t, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i2, 600));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i);
            this.offsetAnimator.start();
        }

        private int calculateSnapOffset(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        private boolean canScrollChildren(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, @InterfaceC6391 View view) {
            return t.hasScrollableChildren() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private static boolean checkFlag(int i, int i2) {
            return (i & i2) == i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).scrollFlags != 0) {
                    return true;
                }
            }
            return false;
        }

        @InterfaceC6490
        private View findFirstScrollingChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC6365) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @InterfaceC6490
        private static View getAppBarChildOnOffset(@InterfaceC6391 AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(@InterfaceC6391 T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC6490
        public View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.C8796) childAt.getLayoutParams()).m29508() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int interpolateOffset(@InterfaceC6391 T t, int i) {
            int iAbs = Math.abs(i);
            int childCount = t.getChildCount();
            int topInset = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i2++;
                } else if (scrollInterpolator != null) {
                    int scrollFlags = layoutParams.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((scrollFlags & 2) != 0) {
                            topInset -= C8273.m27361(childAt);
                        }
                    }
                    if (C8273.m27350(childAt)) {
                        topInset -= t.getTopInset();
                    }
                    if (topInset > 0) {
                        float f = topInset;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * scrollInterpolator.getInterpolation((iAbs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        private boolean shouldJumpElevationState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t) {
            List<View> dependents = coordinatorLayout.getDependents(t);
            int size = dependents.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC8792 abstractC8792M29508 = ((CoordinatorLayout.C8796) dependents.get(i).getLayoutParams()).m29508();
                if (abstractC8792M29508 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) abstractC8792M29508).getOverlayTop() != 0;
                }
            }
            return false;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - topInset;
            int childIndexOnOffset = getChildIndexOnOffset(t, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t.getChildAt(childIndexOnOffset);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iM27361 = -childAt.getBottom();
                    if (childIndexOnOffset == 0 && C8273.m27350(t) && C8273.m27350(childAt)) {
                        topInset2 -= t.getTopInset();
                    }
                    if (checkFlag(scrollFlags, 2)) {
                        iM27361 += C8273.m27361(childAt);
                    } else if (checkFlag(scrollFlags, 5)) {
                        int iM273612 = C8273.m27361(childAt) + iM27361;
                        if (topBottomOffsetForScrollingSibling < iM273612) {
                            topInset2 = iM273612;
                        } else {
                            iM27361 = iM273612;
                        }
                    }
                    if (checkFlag(scrollFlags, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        iM27361 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, t, C6132.m18838(calculateSnapOffset(topBottomOffsetForScrollingSibling, iM27361, topInset2) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void updateAppBarLayoutDrawableState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, int i, int i2, boolean z) {
            View appBarChildOnOffset = getAppBarChildOnOffset(t, i);
            boolean zShouldLift = false;
            if (appBarChildOnOffset != null) {
                int scrollFlags = ((LayoutParams) appBarChildOnOffset.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int iM27361 = C8273.m27361(appBarChildOnOffset);
                    if (i2 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i) < (appBarChildOnOffset.getBottom() - iM27361) - t.getTopInset()) : (-i) >= (appBarChildOnOffset.getBottom() - iM27361) - t.getTopInset()) {
                        zShouldLift = true;
                    }
                }
            }
            if (t.isLiftOnScroll()) {
                zShouldLift = t.shouldLift(findFirstScrollingChild(coordinatorLayout));
            }
            boolean liftedState = t.setLiftedState(zShouldLift);
            if (z || (liftedState && shouldJumpElevationState(coordinatorLayout, t))) {
                if (t.getBackground() != null) {
                    t.getBackground().jumpToCurrentState();
                }
                if (t.getForeground() != null) {
                    t.getForeground().jumpToCurrentState();
                }
                if (t.getStateListAnimator() != null) {
                    t.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        @InterfaceC8392
        public boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        public void restoreScrollState(@InterfaceC6490 SavedState savedState, boolean z) {
            if (this.savedState == null || z) {
                this.savedState = savedState;
            }
        }

        @InterfaceC6490
        public SavedState saveScrollState(@InterfaceC6490 Parcelable parcelable, @InterfaceC6391 T t) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC2967.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = topAndBottomOffset == 0;
                    savedState.fullyExpanded = z;
                    savedState.fullyScrolled = !z && (-topAndBottomOffset) >= t.getTotalScrollRange();
                    savedState.firstVisibleChildIndex = i;
                    savedState.firstVisibleChildAtMinimumHeight = bottom == C8273.m27361(childAt) + t.getTopInset();
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public void setDragCallback(@InterfaceC6490 BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: canDragView(Landroid/view/View;)Z */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean canDragView(T t) {
            BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(t);
            }
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: getMaxDragOffset(Landroid/view/View;)I */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getMaxDragOffset(@InterfaceC6391 T t) {
            return (-t.getDownNestedScrollRange()) + t.getTopInset();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: getScrollRangeForDragFling(Landroid/view/View;)I */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getScrollRangeForDragFling(@InterfaceC6391 T t) {
            return t.getTotalScrollRange();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onFlingFinished(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public void onFlingFinished(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t) {
            snapToChildIfNeeded(coordinatorLayout, t);
            if (t.isLiftOnScroll()) {
                t.setLiftedState(t.shouldLift(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onLayoutChild(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, int i) {
            boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            SavedState savedState = this.savedState;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            animateOffsetTo(coordinatorLayout, t, i2, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            animateOffsetTo(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                setHeaderTopBottomOffset(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                setHeaderTopBottomOffset(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(savedState.firstVisibleChildIndex);
                setHeaderTopBottomOffset(coordinatorLayout, t, (-childAt.getBottom()) + (this.savedState.firstVisibleChildAtMinimumHeight ? C8273.m27361(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.savedState.firstVisibleChildPercentageShown)));
            }
            t.resetPendingAction();
            this.savedState = null;
            setTopAndBottomOffset(C6132.m18838(getTopAndBottomOffset(), -t.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
            t.onOffsetChanged(getTopAndBottomOffset());
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t);
            return zOnLayoutChild;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onMeasureChild(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onMeasureChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C8796) t.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.onMeasureChild(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onNestedPreScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int downNestedPreScrollRange;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    downNestedPreScrollRange = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i5 = i4;
                int i6 = downNestedPreScrollRange;
                if (i5 != i6) {
                    iArr[1] = scroll(coordinatorLayout, t, i2, i5, i6);
                }
            }
            if (t.isLiftOnScroll()) {
                t.setLiftedState(t.shouldLift(view));
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII[I)V */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = scroll(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                addAccessibilityDelegateIfNeeded(coordinatorLayout, t);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onRestoreInstanceState(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public void onRestoreInstanceState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                restoreScrollState((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, t, this.savedState.getSuperState());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
                this.savedState = null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onSaveInstanceState(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable; */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public Parcelable onSaveInstanceState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t) {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
            SavedState savedStateSaveScrollState = saveScrollState(parcelableOnSaveInstanceState, t);
            return savedStateSaveScrollState == null ? parcelableOnSaveInstanceState : savedStateSaveScrollState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onStartNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onStartNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, @InterfaceC6391 View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.isLiftOnScroll() || canScrollChildren(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i2;
            return z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onStopNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, View view, int i) {
            if (this.lastStartedType == 0 || i == 1) {
                snapToChildIfNeeded(coordinatorLayout, t);
                if (t.isLiftOnScroll()) {
                    t.setLiftedState(t.shouldLift(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: setHeaderTopBottomOffset(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int setHeaderTopBottomOffset(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 T t, int i, int i2, int i3) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i4 = 0;
            if (i2 == 0 || topBottomOffsetForScrollingSibling < i2 || topBottomOffsetForScrollingSibling > i3) {
                this.offsetDelta = 0;
            } else {
                int iM18838 = C6132.m18838(i, i2, i3);
                if (topBottomOffsetForScrollingSibling != iM18838) {
                    int iInterpolateOffset = t.hasChildWithInterpolator() ? interpolateOffset(t, iM18838) : iM18838;
                    boolean topAndBottomOffset = setTopAndBottomOffset(iInterpolateOffset);
                    int i5 = topBottomOffsetForScrollingSibling - iM18838;
                    this.offsetDelta = iM18838 - iInterpolateOffset;
                    if (topAndBottomOffset) {
                        while (i4 < t.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t.getChildAt(i4).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(t, t.getChildAt(i4), getTopAndBottomOffset());
                            }
                            i4++;
                        }
                    }
                    if (!topAndBottomOffset && t.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t);
                    }
                    t.onOffsetChanged(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(coordinatorLayout, t, iM18838, iM18838 < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i4 = i5;
                }
            }
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t);
            return i4;
        }

        public static class SavedState extends AbstractC2967 {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                @InterfaceC6391
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }

                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                @InterfaceC6391
                public SavedState createFromParcel(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                @InterfaceC6490
                public SavedState createFromParcel(@InterfaceC6391 Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            };
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public SavedState(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // Yue.AbstractC2967, android.os.Parcelable
            public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view, @InterfaceC6391 MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @InterfaceC6391 AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @InterfaceC6391 AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 AppBarLayout appBarLayout, @InterfaceC6391 View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @InterfaceC6391 AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view, @InterfaceC6391 MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(@InterfaceC6490 BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(@InterfaceC6391 AppBarLayout appBarLayout, @InterfaceC6391 View view, float f);
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final Rect relativeRect = new Rect();
        private final Rect ghostRect = new Rect();

        private static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(@InterfaceC6391 AppBarLayout appBarLayout, @InterfaceC6391 View view, float f) {
            updateRelativeRect(this.relativeRect, appBarLayout, view);
            float fAbs = this.relativeRect.top - Math.abs(f);
            if (fAbs > 0.0f) {
                C8273.m27451(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fM18837 = 1.0f - C6132.m18837(Math.abs(fAbs / this.relativeRect.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.relativeRect.height() * COMPRESS_DISTANCE_FACTOR) * (1.0f - (fM18837 * fM18837)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.ghostRect);
            this.ghostRect.offset(0, (int) (-fHeight));
            if (fHeight >= this.ghostRect.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            C8273.m27451(view, this.ghostRect);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private ChildScrollEffect scrollEffect;
        int scrollFlags;
        Interpolator scrollInterpolator;

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollEffect {
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.AppBarLayout_Layout);
            this.scrollFlags = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        @InterfaceC6490
        private ChildScrollEffect createScrollEffectFromInt(int i) {
            if (i != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        @InterfaceC6490
        public ChildScrollEffect getScrollEffect() {
            return this.scrollEffect;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        public boolean isCollapsible() {
            int i = this.scrollFlags;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setScrollEffect(@InterfaceC6490 ChildScrollEffect childScrollEffect) {
            this.scrollEffect = childScrollEffect;
        }

        public void setScrollFlags(int i) {
            this.scrollFlags = i;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void setScrollEffect(int i) {
            this.scrollEffect = createScrollEffectFromInt(i);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        @InterfaceC7113(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        @InterfaceC7113(19)
        public LayoutParams(@InterfaceC6391 LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollEffect = layoutParams.scrollEffect;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }
    }

    public interface LiftOnScrollListener {
        void onUpdate(@InterfaceC4399 float f, @InterfaceC3897 int i);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i);
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ScrollingViewBehavior() {
        }

        private static int getAppBarLayoutOffset(@InterfaceC6391 AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC8792 abstractC8792M29508 = ((CoordinatorLayout.C8796) appBarLayout.getLayoutParams()).m29508();
            if (abstractC8792M29508 instanceof BaseBehavior) {
                return ((BaseBehavior) abstractC8792M29508).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        private void offsetChildAsNeeded(@InterfaceC6391 View view, @InterfaceC6391 View view2) {
            CoordinatorLayout.AbstractC8792 abstractC8792M29508 = ((CoordinatorLayout.C8796) view2.getLayoutParams()).m29508();
            if (abstractC8792M29508 instanceof BaseBehavior) {
                C8273.m27415(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC8792M29508).offsetDelta) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @InterfaceC6490
        public /* bridge */ /* synthetic */ View findFirstDependency(@InterfaceC6391 List list) {
            return findFirstDependency((List<View>) list);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float getOverlapRatioForOffset(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int getScrollRange(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.getScrollRange(view);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onDependentViewChanged(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view, @InterfaceC6391 View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public void onDependentViewRemoved(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view, @InterfaceC6391 View view2) {
            if (view2 instanceof AppBarLayout) {
                C8273.m27439(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onRequestChildRectangleOnScreen(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view, @InterfaceC6391 Rect rect, boolean z) {
            AppBarLayout appBarLayoutFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (appBarLayoutFindFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutFindFirstDependency.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @InterfaceC6490
        public AppBarLayout findFirstDependency(@InterfaceC6391 List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AppBarLayout(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    @InterfaceC6490
    private Integer extractStatusBarForegroundColor() {
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            return Integer.valueOf(((MaterialShapeDrawable) drawable).getResolvedTintColor());
        }
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(drawable);
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    @InterfaceC6490
    private View findLiftOnScrollTargetView(@InterfaceC6490 View view) {
        int i;
        if (this.liftOnScrollTargetView == null && (i = this.liftOnScrollTargetViewId) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (viewFindViewById != null) {
                this.liftOnScrollTargetView = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void initializeLiftOnScrollWithColor(final MaterialShapeDrawable materialShapeDrawable, @InterfaceC6391 final ColorStateList colorStateList, @InterfaceC6391 final ColorStateList colorStateList2) {
        final Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), C1980R.attr.colorSurface);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: Yue.ۥ۟۠ۨۤ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f181.lambda$initializeLiftOnScrollWithColor$0(colorStateList, colorStateList2, materialShapeDrawable, colorOrNull, valueAnimator);
            }
        };
        C8273.m27447(this, materialShapeDrawable);
    }

    private void initializeLiftOnScrollWithElevation(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: Yue.ۥ۟۠ۨۥ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f183.lambda$initializeLiftOnScrollWithElevation$1(materialShapeDrawable, valueAnimator);
            }
        };
        C8273.m27447(this, materialShapeDrawable);
    }

    private void invalidateScrollRanges() {
        Behavior behavior = this.behavior;
        BaseBehavior.SavedState savedStateSaveScrollState = (behavior == null || this.totalScrollRange == -1 || this.pendingAction != 0) ? null : behavior.saveScrollState(AbstractC2967.EMPTY_STATE, this);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (savedStateSaveScrollState != null) {
            this.behavior.restoreScrollState(savedStateSaveScrollState, false);
        }
    }

    private boolean isLiftOnScrollCompatibleBackground() {
        return getBackground() instanceof MaterialShapeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithColor$0(ColorStateList colorStateList, ColorStateList colorStateList2, MaterialShapeDrawable materialShapeDrawable, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int iLayer = MaterialColors.layer(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(iLayer));
        if (this.statusBarForeground != null && (num2 = this.statusBarForegroundOriginalColor) != null && num2.equals(num)) {
            C4520.m13235(this.statusBarForeground, iLayer);
        }
        if (this.liftOnScrollListeners.isEmpty()) {
            return;
        }
        for (LiftOnScrollListener liftOnScrollListener : this.liftOnScrollListeners) {
            if (materialShapeDrawable.getFillColor() != null) {
                liftOnScrollListener.onUpdate(0.0f, iLayer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(fFloatValue);
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(fFloatValue);
        }
        Iterator<LiftOnScrollListener> it = this.liftOnScrollListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(fFloatValue, materialShapeDrawable.getResolvedTintColor());
        }
    }

    private boolean setLiftableState(boolean z) {
        if (this.liftable == z) {
            return false;
        }
        this.liftable = z;
        refreshDrawableState();
        return true;
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || C8273.m27350(childAt)) ? false : true;
    }

    private void startLiftOnScrollColorAnimation(float f, float f2) {
        ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.liftOnScrollColorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    public void addLiftOnScrollListener(@InterfaceC6391 LiftOnScrollListener liftOnScrollListener) {
        this.liftOnScrollListeners.add(liftOnScrollListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addOnOffsetChangedListener(@InterfaceC6490 BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.listeners.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.listeners.add(baseOnOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    @Override // android.view.View
    public void draw(@InterfaceC6391 Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1654
    @InterfaceC6391
    public CoordinatorLayout.AbstractC8792<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.behavior = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int iM27361;
        int i = this.downPreScrollRange;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.scrollFlags;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i3 & 8) != 0) {
                        iM27361 = C8273.m27361(childAt);
                    } else if ((i3 & 2) != 0) {
                        iM27361 = measuredHeight - C8273.m27361(childAt);
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && C8273.m27350(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + iM27361;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.downPreScrollRange = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.downScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int iM27361 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i3 = layoutParams.scrollFlags;
                if ((i3 & 1) == 0) {
                    break;
                }
                iM27361 += measuredHeight;
                if ((i3 & 2) != 0) {
                    iM27361 -= C8273.m27361(childAt);
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, iM27361);
        this.downScrollRange = iMax;
        return iMax;
    }

    @InterfaceC5411
    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    @InterfaceC6490
    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iM27361 = C8273.m27361(this);
        if (iM27361 == 0) {
            int childCount = getChildCount();
            iM27361 = childCount >= 1 ? C8273.m27361(getChildAt(childCount - 1)) : 0;
            if (iM27361 == 0) {
                return getHeight() / 3;
            }
        }
        return (iM27361 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.pendingAction;
    }

    @InterfaceC6490
    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @InterfaceC8392
    public final int getTopInset() {
        C8472 c8472 = this.lastInsets;
        if (c8472 != null) {
            return c8472.m28293();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.totalScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int iM27361 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.scrollFlags;
                if ((i3 & 1) == 0) {
                    break;
                }
                iM27361 += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i2 == 0 && C8273.m27350(childAt)) {
                    iM27361 -= getTopInset();
                }
                if ((i3 & 2) != 0) {
                    iM27361 -= C8273.m27361(childAt);
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, iM27361);
        this.totalScrollRange = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isLifted() {
        return this.lifted;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.liftable;
        int i2 = C1980R.attr.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.lifted) ? C1980R.attr.state_lifted : -C1980R.attr.state_lifted;
        int i3 = C1980R.attr.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.lifted) ? C1980R.attr.state_collapsed : -C1980R.attr.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C8273.m27350(this) && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C8273.m27415(getChildAt(childCount), topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.liftableOverride) {
            return;
        }
        if (!this.liftOnScroll && !hasCollapsibleChild()) {
            z2 = false;
        }
        setLiftableState(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C8273.m27350(this) && shouldOffsetFirstChild()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C6132.m18838(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        invalidateScrollRanges();
    }

    public void onOffsetChanged(int i) {
        this.currentOffset = i;
        if (!willNotDraw()) {
            C8273.m27425(this);
        }
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.listeners.get(i2);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i);
                }
            }
        }
    }

    public C8472 onWindowInsetChanged(C8472 c8472) {
        C8472 c84722 = C8273.m27350(this) ? c8472 : null;
        if (!C6499.m2995(this.lastInsets, c84722)) {
            this.lastInsets = c84722;
            updateWillNotDraw();
            requestLayout();
        }
        return c8472;
    }

    public boolean removeLiftOnScrollListener(@InterfaceC6391 LiftOnScrollListener liftOnScrollListener) {
        return this.liftOnScrollListeners.remove(liftOnScrollListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void removeOnOffsetChangedListener(@InterfaceC6490 BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    public void resetPendingAction() {
        this.pendingAction = 0;
    }

    @Override // android.view.View
    @InterfaceC7113(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setExpanded(boolean z) {
        setExpanded(z, C8273.m27404(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.liftOnScroll = z;
    }

    public void setLiftOnScrollTargetView(@InterfaceC6490 View view) {
        this.liftOnScrollTargetViewId = -1;
        if (view == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@InterfaceC5411 int i) {
        this.liftOnScrollTargetViewId = i;
        clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean z) {
        this.liftableOverride = true;
        return setLiftableState(z);
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.liftableOverride = z;
    }

    public boolean setLifted(boolean z) {
        return setLiftedState(z, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean setLiftedState(boolean z) {
        return setLiftedState(z, !this.liftableOverride);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(@InterfaceC6490 Drawable drawable) {
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.statusBarForeground = drawable != null ? drawable.mutate() : null;
            this.statusBarForegroundOriginalColor = extractStatusBarForegroundColor();
            Drawable drawable3 = this.statusBarForeground;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                C4520.m13234(this.statusBarForeground, C8273.m27356(this));
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            C8273.m27425(this);
        }
    }

    public void setStatusBarForegroundColor(@InterfaceC3897 int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@InterfaceC4525 int i) {
        setStatusBarForeground(C3323.m396(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean shouldLift(@InterfaceC6490 View view) {
        View viewFindLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (viewFindLiftOnScrollTargetView != null) {
            view = viewFindLiftOnScrollTargetView;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(@InterfaceC6391 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AppBarLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.appBarLayoutStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setExpanded(boolean z, boolean z2) {
        setExpanded(z, z2, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean setLiftedState(boolean z, boolean z2) {
        if (!z2 || this.lifted == z) {
            return false;
        }
        this.lifted = z;
        refreshDrawableState();
        if (!isLiftOnScrollCompatibleBackground()) {
            return true;
        }
        if (this.hasLiftOnScrollColor) {
            startLiftOnScrollColorAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.liftOnScroll) {
            return true;
        }
        startLiftOnScrollColorAnimation(z ? 0.0f : this.appBarElevation, z ? this.appBarElevation : 0.0f);
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        this.liftOnScrollListeners = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            ViewUtilsLollipop.setBoundsViewOutlineProvider(this);
        }
        ViewUtilsLollipop.setStateListAnimatorFromAttrs(this, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.AppBarLayout, i, i2, new int[0]);
        C8273.m27447(this, typedArrayObtainStyledAttributes.getDrawable(C1980R.styleable.AppBarLayout_android_background));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C1980R.styleable.AppBarLayout_liftOnScrollColor);
        this.hasLiftOnScrollColor = colorStateList != null;
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(getBackground());
        if (colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            if (colorStateList != null) {
                initializeLiftOnScrollWithColor(materialShapeDrawable, colorStateListOrNull, colorStateList);
            } else {
                initializeLiftOnScrollWithElevation(context2, materialShapeDrawable);
            }
        }
        this.liftOnScrollColorDuration = MotionUtils.resolveThemeDuration(context2, C1980R.attr.motionDurationMedium2, getResources().getInteger(C1980R.integer.app_bar_elevation_anim_duration));
        this.liftOnScrollColorInterpolator = MotionUtils.resolveThemeInterpolator(context2, C1980R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.AppBarLayout_expanded)) {
            setExpanded(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.AppBarLayout_expanded, false), false, false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.AppBarLayout_elevation)) {
            ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.AppBarLayout_elevation, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.AppBarLayout_android_keyboardNavigationCluster)) {
            setKeyboardNavigationCluster(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.AppBarLayout_android_keyboardNavigationCluster, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
            setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
        }
        this.appBarElevation = getResources().getDimension(C1980R.dimen.design_appbar_elevation);
        this.liftOnScroll = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.AppBarLayout_liftOnScroll, false);
        this.liftOnScrollTargetViewId = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayObtainStyledAttributes.getDrawable(C1980R.styleable.AppBarLayout_statusBarForeground));
        typedArrayObtainStyledAttributes.recycle();
        C8273.m27468(this, new InterfaceC6545() { // from class: com.google.android.material.appbar.AppBarLayout.1
            @Override // Yue.InterfaceC6545
            public C8472 onApplyWindowInsets(View view, C8472 c8472) {
                return AppBarLayout.this.onWindowInsetChanged(c8472);
            }
        });
    }

    private void setExpanded(boolean z, boolean z2, boolean z3) {
        this.pendingAction = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams; */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/LinearLayout$LayoutParams; */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams; */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
