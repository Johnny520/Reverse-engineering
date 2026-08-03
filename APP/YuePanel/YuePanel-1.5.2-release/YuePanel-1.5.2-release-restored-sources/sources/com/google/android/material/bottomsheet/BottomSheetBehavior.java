package com.google.android.material.bottomsheet;

import Yue.AbstractC2967;
import Yue.C3055;
import Yue.C3505;
import Yue.C3913;
import Yue.C5450;
import Yue.C6132;
import Yue.C8273;
import Yue.C8301;
import Yue.C8472;
import Yue.InterfaceC3070;
import Yue.InterfaceC4885;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import Yue.InterfaceC8392;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC8792<V> implements MaterialBackHandler {
    private static final int CORNER_ANIMATION_DURATION = 500;

    @InterfaceC8392
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";

    @InterfaceC8392
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;

    @InterfaceC6490
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;

    @InterfaceC6490
    private ColorStateList backgroundTint;

    @InterfaceC6490
    MaterialBottomContainerBackHelper bottomContainerBackHelper;

    @InterfaceC6391
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final C8301.AbstractC8302 dragCallback;
    private boolean draggable;
    float elevation;

    @InterfaceC8392
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;

    @InterfaceC6490
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;

    @InterfaceC6490
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;

    @InterfaceC6490
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;

    @InterfaceC6490
    private VelocityTracker velocityTracker;

    @InterfaceC6490
    C8301 viewDragHelper;

    @InterfaceC6490
    WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        public void onLayout(@InterfaceC6391 View view) {
        }

        public abstract void onSlide(@InterfaceC6391 View view, float f);

        public abstract void onStateChanged(@InterfaceC6391 View view, int i);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    public static class SavedState extends AbstractC2967 {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
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
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(@InterfaceC6391 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @InterfaceC6391 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    C8301 c8301 = BottomSheetBehavior.this.viewDragHelper;
                    if (c8301 != null && c8301.m27618(true)) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        public void continueSettlingToState(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.targetState = i;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            C8273.m27427(BottomSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new C8301.AbstractC8302() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(@InterfaceC6391 View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2;
            }

            @Override // Yue.C8301.AbstractC8302
            public int clampViewPositionHorizontal(@InterfaceC6391 View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // Yue.C8301.AbstractC8302
            public int clampViewPositionVertical(@InterfaceC6391 View view, int i, int i2) {
                return C6132.m18838(i, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // Yue.C8301.AbstractC8302
            public int getViewVerticalDragRange(@InterfaceC6391 View view) {
                return BottomSheetBehavior.this.canBeHiddenByDragging() ? BottomSheetBehavior.this.parentHeight : BottomSheetBehavior.this.collapsedOffset;
            }

            @Override // Yue.C8301.AbstractC8302
            public void onViewDragStateChanged(int i) {
                if (i == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // Yue.C8301.AbstractC8302
            public void onViewPositionChanged(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.dispatchOnSlide(i2);
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
            @Override // Yue.C8301.AbstractC8302
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onViewReleased(@InterfaceC6391 View view, float f, float f2) {
                int i = 6;
                if (f2 >= 0.0f) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f2)) {
                        if ((Math.abs(f) < Math.abs(f2) && f2 > BottomSheetBehavior.this.significantVelocityThreshold) || releasedLow(view)) {
                            i = 5;
                        } else if (BottomSheetBehavior.this.fitToContents || Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                        }
                    } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.fitToContents) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i2 = bottomSheetBehavior2.halfExpandedOffset;
                            if (top < i2) {
                                if (top >= Math.abs(top - bottomSheetBehavior2.collapsedOffset)) {
                                    if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                    }
                                }
                            } else if (Math.abs(top - i2) >= Math.abs(top - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            }
                        } else if (Math.abs(top - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top - BottomSheetBehavior.this.collapsedOffset)) {
                        }
                    } else if (!BottomSheetBehavior.this.fitToContents) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        }
                    }
                } else if (BottomSheetBehavior.this.fitToContents) {
                    i = 3;
                } else {
                    int top3 = view.getTop();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.viewCapturedMillis;
                    if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        if (!BottomSheetBehavior.this.shouldExpandOnUpwardDrag(jCurrentTimeMillis, (top3 * 100.0f) / r10.parentHeight)) {
                            i = 4;
                        }
                    } else if (top3 <= BottomSheetBehavior.this.halfExpandedOffset) {
                    }
                    i = 3;
                }
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                bottomSheetBehavior3.startSettling(view, i, bottomSheetBehavior3.shouldSkipSmoothAnimation());
            }

            @Override // Yue.C8301.AbstractC8302
            public boolean tryCaptureView(@InterfaceC6391 View view, int i) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i2 = bottomSheetBehavior.state;
                if (i2 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.activePointerId == i) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }

    private int addAccessibilityActionForState(View view, @InterfaceC7613 int i, int i2) {
        return C8273.m27304(view, view.getResources().getString(i), createAccessibilityViewCommandForState(i2));
    }

    private void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - iCalculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - iCalculatePeekHeight;
        }
    }

    @InterfaceC7113(31)
    private float calculateCornerInterpolation(float f, @InterfaceC6490 RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    private float calculateInterpolationWithCornersRemoved() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.materialShapeDrawable == null || (weakReference = this.viewRef) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v = this.viewRef.get();
        if (!isAtTopOfScreen() || (rootWindowInsets = v.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(calculateCornerInterpolation(this.materialShapeDrawable.getTopLeftCornerResolvedSize(), rootWindowInsets.getRoundedCorner(0)), calculateCornerInterpolation(this.materialShapeDrawable.getTopRightCornerResolvedSize(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int calculatePeekHeight() {
        int i;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom : (this.gestureInsetBottomIgnored || this.paddingBottomSystemWindowInsets || (i = this.gestureInsetBottom) <= 0) ? this.peekHeight + this.insetBottom : Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
    }

    private float calculateSlideOffsetWithTop(int i) {
        float f;
        float expandedOffset;
        int i2 = this.collapsedOffset;
        if (i > i2 || i2 == getExpandedOffset()) {
            int i3 = this.collapsedOffset;
            f = i3 - i;
            expandedOffset = this.parentHeight - i3;
        } else {
            int i4 = this.collapsedOffset;
            f = i4 - i;
            expandedOffset = i4 - getExpandedOffset();
        }
        return f / expandedOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        return isHideable() && isHideableWhenDragging();
    }

    private void clearAccessibilityAction(View view, int i) {
        if (view == null) {
            return;
        }
        C8273.m27429(view, 524288);
        C8273.m27429(view, 262144);
        C8273.m27429(view, 1048576);
        int i2 = this.expandHalfwayActionIds.get(i, -1);
        if (i2 != -1) {
            C8273.m27429(view, i2);
            this.expandHalfwayActionIds.delete(i);
        }
    }

    private InterfaceC3070 createAccessibilityViewCommandForState(final int i) {
        return new InterfaceC3070() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // Yue.InterfaceC3070
            public boolean perform(@InterfaceC6391 View view, @InterfaceC6490 InterfaceC3070.AbstractC0039 abstractC0039) {
                BottomSheetBehavior.this.setState(i);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(@InterfaceC6391 Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@InterfaceC6391 ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(fFloatValue);
                }
            }
        });
    }

    @InterfaceC6391
    public static <V extends View> BottomSheetBehavior<V> from(@InterfaceC6391 V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C8796)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.AbstractC8792 abstractC8792M29508 = ((CoordinatorLayout.C8796) layoutParams).m29508();
        if (abstractC8792M29508 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC8792M29508;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    private int getTopOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 4) {
            return this.collapsedOffset;
        }
        if (i == 5) {
            return this.parentHeight;
        }
        if (i == 6) {
            return this.halfExpandedOffset;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isAtTopOfScreen() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.viewRef.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        return this.state == 3 && (this.shouldRemoveExpandedCorners || isAtTopOfScreen());
    }

    private boolean isLayouting(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && C8273.m27397(v);
    }

    private void replaceAccessibilityActionForState(View view, C3055.C0034 c0034, int i) {
        C8273.m27432(view, c0034, null, createAccessibilityViewCommandForState(i));
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(@InterfaceC6391 SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void runAfterLayout(V v, Runnable runnable) {
        if (isLayouting(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(@InterfaceC6391 View view) {
        final boolean z = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z) {
            ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public C8472 onApplyWindowInsets(View view2, C8472 c8472, ViewUtils.RelativePadding relativePadding) {
                    boolean z2;
                    C5450 c5450M28281 = c8472.m28281(C8472.C8483.m28360());
                    C5450 c5450M282812 = c8472.m28281(C8472.C8483.m28357());
                    BottomSheetBehavior.this.insetTop = c5450M28281.f1521;
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                    int paddingBottom = view2.getPaddingBottom();
                    int paddingLeft = view2.getPaddingLeft();
                    int paddingRight = view2.getPaddingRight();
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                        BottomSheetBehavior.this.insetBottom = c8472.m28290();
                        paddingBottom = relativePadding.bottom + BottomSheetBehavior.this.insetBottom;
                    }
                    if (BottomSheetBehavior.this.paddingLeftSystemWindowInsets) {
                        paddingLeft = (zIsLayoutRtl ? relativePadding.end : relativePadding.start) + c5450M28281.f1520;
                    }
                    if (BottomSheetBehavior.this.paddingRightSystemWindowInsets) {
                        paddingRight = (zIsLayoutRtl ? relativePadding.start : relativePadding.end) + c5450M28281.f13399;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                    boolean z3 = true;
                    if (BottomSheetBehavior.this.marginLeftSystemWindowInsets) {
                        int i = marginLayoutParams.leftMargin;
                        int i2 = c5450M28281.f1520;
                        if (i != i2) {
                            marginLayoutParams.leftMargin = i2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (BottomSheetBehavior.this.marginRightSystemWindowInsets) {
                        int i3 = marginLayoutParams.rightMargin;
                        int i4 = c5450M28281.f13399;
                        if (i3 != i4) {
                            marginLayoutParams.rightMargin = i4;
                            z2 = true;
                        }
                    }
                    if (BottomSheetBehavior.this.marginTopSystemWindowInsets) {
                        int i5 = marginLayoutParams.topMargin;
                        int i6 = c5450M28281.f1521;
                        if (i5 != i6) {
                            marginLayoutParams.topMargin = i6;
                        } else {
                            z3 = z2;
                        }
                    }
                    if (z3) {
                        view2.setLayoutParams(marginLayoutParams);
                    }
                    view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                    if (z) {
                        BottomSheetBehavior.this.gestureInsetBottom = c5450M282812.f13400;
                    }
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets || z) {
                        BottomSheetBehavior.this.updatePeekHeight(false);
                    }
                    return c8472;
                }
            });
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i, boolean z) {
        int topOffsetForState = getTopOffsetForState(i);
        C8301 c8301 = this.viewDragHelper;
        if (c8301 == null || (!z ? c8301.m27651(view, view.getLeft(), topOffsetForState) : c8301.m27649(view.getLeft(), topOffsetForState))) {
            setStateInternal(i);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i, true);
        this.stateSettlingTracker.continueSettlingToState(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    private void updateDrawableForTargetState(int i, boolean z) {
        boolean zIsExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i == 2 || this.expandedCornersRemoved == (zIsExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) || this.materialShapeDrawable == null) {
            return;
        }
        this.expandedCornersRemoved = zIsExpandedAndShouldRemoveCorners;
        if (!z || (valueAnimator = this.interpolatorAnimator) == null) {
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            this.materialShapeDrawable.setInterpolation(this.expandedCornersRemoved ? calculateInterpolationWithCornersRemoved() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.interpolatorAnimator.reverse();
        } else {
            this.interpolatorAnimator.setFloatValues(this.materialShapeDrawable.getInterpolation(), zIsExpandedAndShouldRemoveCorners ? calculateInterpolationWithCornersRemoved() : 1.0f);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.viewRef.get()) {
                    if (z) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            C8273.m27457(childAt, 4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        C8273.m27457(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z) {
        V v;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v = this.viewRef.get()) == null) {
                return;
            }
            if (z) {
                setState(4);
            } else {
                v.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(@InterfaceC6391 BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC8392
    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i) {
        V v = this.viewRef.get();
        if (v == null || this.callbacks.isEmpty()) {
            return;
        }
        float fCalculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            this.callbacks.get(i2).onSlide(v, fCalculateSlideOffsetWithTop);
        }
    }

    @InterfaceC8392
    @InterfaceC6490
    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (C8273.m27406(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (viewFindScrollingChild != null) {
                    return viewFindScrollingChild;
                }
            }
        }
        return null;
    }

    @InterfaceC8392
    @InterfaceC6490
    public MaterialBottomContainerBackHelper getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.lastStableState;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    @InterfaceC6844
    public int getMaxHeight() {
        return this.maxHeight;
    }

    @InterfaceC6844
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    @InterfaceC8392
    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        C3505 c3505OnHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        if (c3505OnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(this.hideable ? 5 : 4);
        } else if (this.hideable) {
            this.bottomContainerBackHelper.finishBackProgressNotPersistent(c3505OnHandleBackInvoked, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior.this.setStateInternal(5);
                    WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    BottomSheetBehavior.this.viewRef.get().requestLayout();
                }
            });
        } else {
            this.bottomContainerBackHelper.finishBackProgressPersistent(c3505OnHandleBackInvoked, null);
            setState(4);
        }
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean isHideableWhenDragging() {
        return true;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public void onAttachedToLayoutParams(@InterfaceC6391 CoordinatorLayout.C8796 c8796) {
        super.onAttachedToLayoutParams(c8796);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onInterceptTouchEvent(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 MotionEvent motionEvent) {
        int i;
        C8301 c8301;
        if (!v.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (c8301 = this.viewDragHelper) != null && c8301.m27650(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || (i = this.initialY) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.viewDragHelper.m27632())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, int i) {
        if (C8273.m27350(coordinatorLayout) && !C8273.m27350(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(C1980R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v);
            C8273.m27491(v, new InsetsAnimationCallback(v));
            this.viewRef = new WeakReference<>(v);
            this.bottomContainerBackHelper = new MaterialBottomContainerBackHelper(v);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                C8273.m27447(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float fM27347 = this.elevation;
                if (fM27347 == -1.0f) {
                    fM27347 = C8273.m27347(v);
                }
                materialShapeDrawable2.setElevation(fM27347);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    C8273.m27448(v, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (C8273.m27351(v) == 0) {
                C8273.m27457(v, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = C8301.m27605(coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        int iMin = this.parentHeight;
        int i2 = iMin - height;
        int i3 = this.insetTop;
        if (i2 < i3) {
            if (this.paddingTopSystemWindowInsets) {
                int i4 = this.maxHeight;
                if (i4 != -1) {
                    iMin = Math.min(iMin, i4);
                }
                this.childHeight = iMin;
            } else {
                int iMin2 = iMin - i3;
                int i5 = this.maxHeight;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.childHeight = iMin2;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i6 = this.state;
        if (i6 == 3) {
            C8273.m27415(v, getExpandedOffset());
        } else if (i6 == 6) {
            C8273.m27415(v, this.halfExpandedOffset);
        } else if (this.hideable && i6 == 5) {
            C8273.m27415(v, this.parentHeight);
        } else if (i6 == 4) {
            C8273.m27415(v, this.collapsedOffset);
        } else if (i6 == 1 || i6 == 2) {
            C8273.m27415(v, top - v.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        for (int i7 = 0; i7 < this.callbacks.size(); i7++) {
            this.callbacks.get(i7).onLayout(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onMeasureChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onNestedPreFling(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, float f, float f2) {
        WeakReference<View> weakReference;
        if (isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get()) {
            return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public void onNestedPreScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, int i, int i2, @InterfaceC6391 int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    C8273.m27415(v, -expandedOffset);
                    setStateInternal(3);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i2;
                    C8273.m27415(v, -i2);
                    setStateInternal(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i4 > this.collapsedOffset && !canBeHiddenByDragging()) {
                    int i5 = top - this.collapsedOffset;
                    iArr[1] = i5;
                    C8273.m27415(v, -i5);
                    setStateInternal(4);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i2;
                    C8273.m27415(v, -i2);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v.getTop());
            this.lastNestedScrollDy = i2;
            this.nestedScrolled = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public void onNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, int i, int i2, int i3, int i4, int i5, @InterfaceC6391 int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public void onRestoreInstanceState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            this.state = i;
            this.lastStableState = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    @InterfaceC6391
    public Parcelable onSaveInstanceState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onStartNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStopNestedScroll(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 View view, int i) {
        WeakReference<View> weakReference;
        int i2 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (!isNestedScrollingCheckEnabled() || ((weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get() && this.nestedScrolled)) {
            if (this.lastNestedScrollDy > 0) {
                if (!this.fitToContents && v.getTop() > this.halfExpandedOffset) {
                    i2 = 6;
                }
            } else if (this.hideable && shouldHide(v, getYVelocity())) {
                i2 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top = v.getTop();
                if (!this.fitToContents) {
                    int i3 = this.halfExpandedOffset;
                    if (top < i3) {
                        if (top >= Math.abs(top - this.collapsedOffset)) {
                            if (shouldSkipHalfExpandedStateWhenDragging()) {
                            }
                        }
                    } else if (Math.abs(top - i3) < Math.abs(top - this.collapsedOffset)) {
                    }
                } else if (Math.abs(top - this.fitToContentsOffset) >= Math.abs(top - this.collapsedOffset)) {
                    i2 = 4;
                }
            } else {
                if (!this.fitToContents) {
                    int top2 = v.getTop();
                    if (Math.abs(top2 - this.halfExpandedOffset) < Math.abs(top2 - this.collapsedOffset)) {
                    }
                }
                i2 = 4;
            }
            startSettling(v, i2, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onTouchEvent(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.m27640(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.m27632()) {
            this.viewDragHelper.m27607(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(@InterfaceC6391 BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    public void setAccessibilityDelegateView(@InterfaceC6490 View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.accessibilityDelegateViewRef) == null) {
            this.accessibilityDelegateViewRef = new WeakReference<>(view);
            updateAccessibilityActions(view, 1);
        } else {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
        }
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setExpandedOffset(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i;
        updateDrawableForTargetState(this.state, true);
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public void setHalfExpandedRatio(@InterfaceC4885(from = 0.0d, fromInclusive = false, m1796to = Contrast.RATIO_MIN, toInclusive = false) float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideFriction(float f) {
        this.hideFriction = f;
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void setHideableInternal(boolean z) {
        this.hideable = z;
    }

    public void setMaxHeight(@InterfaceC6844 int i) {
        this.maxHeight = i;
    }

    public void setMaxWidth(@InterfaceC6844 int i) {
        this.maxWidth = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setShouldRemoveExpandedCorners(boolean z) {
        if (this.shouldRemoveExpandedCorners != z) {
            this.shouldRemoveExpandedCorners = z;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i) {
        this.significantVelocityThreshold = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.hideable && i == 5) {
            Log.w(TAG, "Cannot set state: " + i);
            return;
        }
        final int i2 = (i == 6 && this.fitToContents && getTopOffsetForState(i) <= this.fitToContentsOffset) ? 3 : i;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
        } else {
            final V v = this.viewRef.get();
            runAfterLayout(v, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.startSettling(v, i2, false);
                }
            });
        }
    }

    public void setStateInternal(int i) {
        V v;
        if (this.state == i) {
            return;
        }
        this.state = i;
        if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
            this.lastStableState = i;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i, true);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            this.callbacks.get(i2).onStateChanged(v, i);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long j, @InterfaceC4885(from = 0.0d, m1796to = C3913.f572) float f) {
        return false;
    }

    public boolean shouldHide(@InterfaceC6391 View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (isHideableWhenDragging() && view.getTop() >= this.collapsedOffset) {
            return Math.abs((((float) view.getTop()) + (f * this.hideFriction)) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
        }
        return false;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@InterfaceC6391 C3505 c3505) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(c3505);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@InterfaceC6391 C3505 c3505) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(c3505);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void setPeekHeight(int i, boolean z) {
        if (i == -1) {
            if (this.peekHeightAuto) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
        }
        updatePeekHeight(z);
    }

    private void updateAccessibilityActions(View view, int i) {
        if (view == null) {
            return;
        }
        clearAccessibilityAction(view, i);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i, addAccessibilityActionForState(view, C1980R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view, C3055.C0034.f4528, 5);
        }
        int i2 = this.state;
        if (i2 == 3) {
            replaceAccessibilityActionForState(view, C3055.C0034.f4527, this.fitToContents ? 4 : 6);
            return;
        }
        if (i2 == 4) {
            replaceAccessibilityActionForState(view, C3055.C0034.f4526, this.fitToContents ? 3 : 6);
        } else {
            if (i2 != 6) {
                return;
            }
            replaceAccessibilityActionForState(view, C3055.C0034.f4527, 4);
            replaceAccessibilityActionForState(view, C3055.C0034.f4526, 3);
        }
    }

    public BottomSheetBehavior(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new C8301.AbstractC8302() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(@InterfaceC6391 View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2;
            }

            @Override // Yue.C8301.AbstractC8302
            public int clampViewPositionHorizontal(@InterfaceC6391 View view, int i2, int i22) {
                return view.getLeft();
            }

            @Override // Yue.C8301.AbstractC8302
            public int clampViewPositionVertical(@InterfaceC6391 View view, int i2, int i22) {
                return C6132.m18838(i2, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // Yue.C8301.AbstractC8302
            public int getViewVerticalDragRange(@InterfaceC6391 View view) {
                return BottomSheetBehavior.this.canBeHiddenByDragging() ? BottomSheetBehavior.this.parentHeight : BottomSheetBehavior.this.collapsedOffset;
            }

            @Override // Yue.C8301.AbstractC8302
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // Yue.C8301.AbstractC8302
            public void onViewPositionChanged(@InterfaceC6391 View view, int i2, int i22, int i3, int i4) {
                BottomSheetBehavior.this.dispatchOnSlide(i22);
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
            @Override // Yue.C8301.AbstractC8302
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onViewReleased(@InterfaceC6391 View view, float f, float f2) {
                int i2 = 6;
                if (f2 >= 0.0f) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f2)) {
                        if ((Math.abs(f) < Math.abs(f2) && f2 > BottomSheetBehavior.this.significantVelocityThreshold) || releasedLow(view)) {
                            i2 = 5;
                        } else if (BottomSheetBehavior.this.fitToContents || Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                        }
                    } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.fitToContents) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i22 = bottomSheetBehavior2.halfExpandedOffset;
                            if (top < i22) {
                                if (top >= Math.abs(top - bottomSheetBehavior2.collapsedOffset)) {
                                    if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                    }
                                }
                            } else if (Math.abs(top - i22) >= Math.abs(top - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            }
                        } else if (Math.abs(top - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top - BottomSheetBehavior.this.collapsedOffset)) {
                        }
                    } else if (!BottomSheetBehavior.this.fitToContents) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        }
                    }
                } else if (BottomSheetBehavior.this.fitToContents) {
                    i2 = 3;
                } else {
                    int top3 = view.getTop();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.viewCapturedMillis;
                    if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        if (!BottomSheetBehavior.this.shouldExpandOnUpwardDrag(jCurrentTimeMillis, (top3 * 100.0f) / r10.parentHeight)) {
                            i2 = 4;
                        }
                    } else if (top3 <= BottomSheetBehavior.this.halfExpandedOffset) {
                    }
                    i2 = 3;
                }
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                bottomSheetBehavior3.startSettling(view, i2, bottomSheetBehavior3.shouldSkipSmoothAnimation());
            }

            @Override // Yue.C8301.AbstractC8302
            public boolean tryCaptureView(@InterfaceC6391 View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i22 = bottomSheetBehavior.state;
                if (i22 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i22 == 3 && bottomSheetBehavior.activePointerId == i2) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, C1980R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(C1980R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(C1980R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(C1980R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            setExpandedOffset(typedValuePeekValue2.data);
        } else {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        setSignificantVelocityThreshold(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.paddingBottomSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.shouldRemoveExpandedCorners = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
