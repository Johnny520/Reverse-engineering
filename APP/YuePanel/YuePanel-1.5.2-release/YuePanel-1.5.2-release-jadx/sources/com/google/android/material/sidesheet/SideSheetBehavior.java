package com.google.android.material.sidesheet;

import Yue.AbstractC2967;
import Yue.C3055;
import Yue.C3505;
import Yue.C5194;
import Yue.C6132;
import Yue.C8273;
import Yue.C8301;
import Yue.InterfaceC3070;
import Yue.InterfaceC5195;
import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
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
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC8792<V> implements Sheet<SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = C1980R.string.side_sheet_accessibility_pane_title;
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Material3_SideSheet;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;

    @InterfaceC6490
    private ColorStateList backgroundTint;

    @InterfaceC6391
    private final Set<SideSheetCallback> callbacks;
    private int childWidth;

    @InterfaceC5411
    private int coplanarSiblingViewId;

    @InterfaceC6490
    private WeakReference<View> coplanarSiblingViewRef;
    private final C8301.AbstractC8302 dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;

    @InterfaceC6490
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    private SheetDelegate sheetDelegate;

    @InterfaceC6490
    private MaterialSideContainerBackHelper sideContainerBackHelper;
    private int state;
    private final SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;

    @InterfaceC6490
    private VelocityTracker velocityTracker;

    @InterfaceC6490
    private C8301 viewDragHelper;

    @InterfaceC6490
    private WeakReference<V> viewRef;

    public static class SavedState extends AbstractC2967 {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
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
        final int state;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(@InterfaceC6391 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @InterfaceC6391 SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.state = ((SideSheetBehavior) sideSheetBehavior).state;
        }
    }

    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.sidesheet.ۥ۟
            @Override // java.lang.Runnable
            public final void run() {
                this.f30419.lambda$new$0();
            }
        };
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        public StateSettlingTracker() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            this.isContinueSettlingRunnablePosted = false;
            if (SideSheetBehavior.this.viewDragHelper != null && SideSheetBehavior.this.viewDragHelper.m27618(true)) {
                continueSettlingToState(this.targetState);
            } else if (SideSheetBehavior.this.state == 2) {
                SideSheetBehavior.this.setStateInternal(this.targetState);
            }
        }

        public void continueSettlingToState(int i) {
            if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            this.targetState = i;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            C8273.m27427((View) SideSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SideSheetBehavior() {
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new C8301.AbstractC8302() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // Yue.C8301.AbstractC8302
            public int clampViewPositionHorizontal(@InterfaceC6391 View view, int i, int i2) {
                return C6132.m18838(i, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // Yue.C8301.AbstractC8302
            public int clampViewPositionVertical(@InterfaceC6391 View view, int i, int i2) {
                return view.getTop();
            }

            @Override // Yue.C8301.AbstractC8302
            public int getViewHorizontalDragRange(@InterfaceC6391 View view) {
                return SideSheetBehavior.this.childWidth + SideSheetBehavior.this.getInnerMargin();
            }

            @Override // Yue.C8301.AbstractC8302
            public void onViewDragStateChanged(int i) {
                if (i == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // Yue.C8301.AbstractC8302
            public void onViewPositionChanged(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i);
            }

            @Override // Yue.C8301.AbstractC8302
            public void onViewReleased(@InterfaceC6391 View view, float f, float f2) {
                int iCalculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f, f2);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, iCalculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // Yue.C8301.AbstractC8302
            public boolean tryCaptureView(@InterfaceC6391 View view, int i) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }
        };
    }

    private int calculateCurrentOffset(int i, V v) {
        int i2 = this.state;
        if (i2 == 1 || i2 == 2) {
            return i - this.sheetDelegate.getOuterEdge(v);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        throw new IllegalStateException("Unexpected value: " + this.state);
    }

    private float calculateDragDistance(float f, float f2) {
        return Math.abs(f - f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateTargetStateOnViewReleased(@InterfaceC6391 View view, float f, float f2) {
        if (isExpandingOutwards(f)) {
            return 3;
        }
        if (shouldHide(view, f)) {
            if (!this.sheetDelegate.isSwipeSignificant(f, f2) && !this.sheetDelegate.isReleasedCloseToInnerEdge(view)) {
                return 3;
            }
        } else if (f == 0.0f || !SheetUtils.isSwipeMostlyHorizontal(f, f2)) {
            int left = view.getLeft();
            if (Math.abs(left - getExpandedOffset()) < Math.abs(left - this.sheetDelegate.getHiddenOffset())) {
                return 3;
            }
        }
        return 5;
    }

    private void clearCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    private InterfaceC3070 createAccessibilityViewCommandForState(final int i) {
        return new InterfaceC3070() { // from class: Yue.ۥۢ۟۠ۧ
            @Override // Yue.InterfaceC3070
            public final boolean perform(View view, InterfaceC3070.AbstractC0039 abstractC0039) {
                return this.f2902.lambda$createAccessibilityViewCommandForState$2(i, view, abstractC0039);
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(@InterfaceC6391 Context context) {
        if (this.shapeAppearanceModel == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(@InterfaceC6391 View view, int i) {
        if (this.callbacks.isEmpty()) {
            return;
        }
        float fCalculateSlideOffset = this.sheetDelegate.calculateSlideOffset(i);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onSlide(view, fCalculateSlideOffset);
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
        if (C8273.m27337(view) == null) {
            C8273.m27442(view, view.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    @InterfaceC6391
    public static <V extends View> SideSheetBehavior<V> from(@InterfaceC6391 V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C8796)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.AbstractC8792 abstractC8792M29508 = ((CoordinatorLayout.C8796) layoutParams).m29508();
        if (abstractC8792M29508 instanceof SideSheetBehavior) {
            return (SideSheetBehavior) abstractC8792M29508;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
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

    @InterfaceC6490
    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        final int coplanarSiblingAdjacentMargin = this.sheetDelegate.getCoplanarSiblingAdjacentMargin(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: Yue.ۥۢ۟۠ۨ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f2904.lambda$getCoplanarFinishAnimatorUpdateListener$1(marginLayoutParams, coplanarSiblingAdjacentMargin, coplanarSiblingView, valueAnimator);
            }
        };
    }

    @InterfaceC5195
    private int getGravityFromSheetEdge() {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        return (sheetDelegate == null || sheetDelegate.getSheetEdge() == 0) ? 5 : 3;
    }

    @InterfaceC6490
    private CoordinatorLayout.C8796 getViewLayoutParams() {
        V v;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null || !(v.getLayoutParams() instanceof CoordinatorLayout.C8796)) {
            return null;
        }
        return (CoordinatorLayout.C8796) v.getLayoutParams();
    }

    private boolean hasLeftMargin() {
        CoordinatorLayout.C8796 viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).leftMargin > 0;
    }

    private boolean hasRightMargin() {
        CoordinatorLayout.C8796 viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).rightMargin > 0;
    }

    private boolean isDraggedFarEnough(@InterfaceC6391 MotionEvent motionEvent) {
        return shouldHandleDraggingWithHelper() && calculateDragDistance((float) this.initialX, motionEvent.getX()) > ((float) this.viewDragHelper.m27632());
    }

    private boolean isExpandingOutwards(float f) {
        return this.sheetDelegate.isExpandingOutwards(f);
    }

    private boolean isLayingOut(@InterfaceC6391 V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && C8273.m27397(v);
    }

    private boolean isSettling(View view, int i, boolean z) {
        int outerEdgeOffsetForState = getOuterEdgeOffsetForState(i);
        C8301 viewDragHelper = getViewDragHelper();
        return viewDragHelper != null && (!z ? !viewDragHelper.m27651(view, outerEdgeOffsetForState, view.getTop()) : !viewDragHelper.m27649(outerEdgeOffsetForState, view.getTop()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$2(int i, View view, InterfaceC3070.AbstractC0039 abstractC0039) {
        setState(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCoplanarFinishAnimatorUpdateListener$1(ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, ValueAnimator valueAnimator) {
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, AnimationUtils.lerp(i, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setState$0(int i) {
        V v = this.viewRef.get();
        if (v != null) {
            startSettling(v, i, false);
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(@InterfaceC6391 CoordinatorLayout coordinatorLayout) {
        int i;
        View viewFindViewById;
        if (this.coplanarSiblingViewRef != null || (i = this.coplanarSiblingViewId) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(viewFindViewById);
    }

    private void replaceAccessibilityActionForState(V v, C3055.C0034 c0034, int i) {
        C8273.m27432(v, c0034, null, createAccessibilityViewCommandForState(i));
    }

    private void resetVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void runAfterLayout(@InterfaceC6391 V v, Runnable runnable) {
        if (isLayingOut(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setSheetEdge(@InterfaceC6391 V v, int i) {
        setSheetEdge(C5194.m15901(((CoordinatorLayout.C8796) v.getLayoutParams()).f29435, i) == 3 ? 1 : 0);
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    private boolean shouldInterceptTouchEvent(@InterfaceC6391 V v) {
        return (v.isShown() || C8273.m27337(v) != null) && this.draggable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i, boolean z) {
        if (!isSettling(view, i, z)) {
            setStateInternal(i);
        } else {
            setStateInternal(2);
            this.stateSettlingTracker.continueSettlingToState(i);
        }
    }

    private void updateAccessibilityActions() {
        V v;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C8273.m27429(v, 262144);
        C8273.m27429(v, 1048576);
        if (this.state != 5) {
            replaceAccessibilityActionForState(v, C3055.C0034.f4528, 5);
        }
        if (this.state != 3) {
            replaceAccessibilityActionForState(v, C3055.C0034.f4526, 3);
        }
    }

    private void updateCoplanarSiblingBackProgress() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v = this.viewRef.get();
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, (int) ((this.childWidth * v.getScaleX()) + this.innerMargin));
        coplanarSiblingView.requestLayout();
    }

    private void updateMaterialShapeDrawable(@InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    private void updateSheetVisibility(@InterfaceC6391 View view) {
        int i = this.state == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    public void expand() {
        setState(3);
    }

    @InterfaceC8392
    @InterfaceC6490
    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public int getChildWidth() {
        return this.childWidth;
    }

    @InterfaceC6490
    public View getCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.getExpandedOffset();
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public float getHideThreshold() {
        return 0.5f;
    }

    public int getInnerMargin() {
        return this.innerMargin;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.lastStableState;
    }

    public int getOuterEdgeOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
    }

    public int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    public int getParentWidth() {
        return this.parentWidth;
    }

    public int getSignificantVelocityThreshold() {
        return 500;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.state;
    }

    @InterfaceC6490
    public C8301 getViewDragHelper() {
        return this.viewDragHelper;
    }

    public float getXVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        C3505 c3505OnHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (c3505OnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
        } else {
            this.sideContainerBackHelper.finishBackProgress(c3505OnHandleBackInvoked, getGravityFromSheetEdge(), new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SideSheetBehavior.this.setStateInternal(5);
                    if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                        return;
                    }
                    ((View) SideSheetBehavior.this.viewRef.get()).requestLayout();
                }
            }, getCoplanarFinishAnimatorUpdateListener());
        }
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public void onAttachedToLayoutParams(@InterfaceC6391 CoordinatorLayout.C8796 c8796) {
        super.onAttachedToLayoutParams(c8796);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onInterceptTouchEvent(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 MotionEvent motionEvent) {
        C8301 c8301;
        if (!shouldInterceptTouchEvent(v)) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.initialX = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
            this.ignoreEvents = false;
            return false;
        }
        return (this.ignoreEvents || (c8301 = this.viewDragHelper) == null || !c8301.m27650(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, int i) {
        if (C8273.m27350(coordinatorLayout) && !C8273.m27350(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.viewRef = new WeakReference<>(v);
            this.sideContainerBackHelper = new MaterialSideContainerBackHelper(v);
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
            updateSheetVisibility(v);
            updateAccessibilityActions();
            if (C8273.m27351(v) == 0) {
                C8273.m27457(v, 1);
            }
            ensureAccessibilityPaneTitleIsSet(v);
        }
        setSheetEdge(v, i);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = C8301.m27605(coordinatorLayout, this.dragCallback);
        }
        int outerEdge = this.sheetDelegate.getOuterEdge(v);
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentInnerEdge = this.sheetDelegate.getParentInnerEdge(coordinatorLayout);
        this.childWidth = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        this.innerMargin = marginLayoutParams != null ? this.sheetDelegate.calculateInnerMargin(marginLayoutParams) : 0;
        C8273.m27414(v, calculateCurrentOffset(outerEdge, v));
        maybeAssignCoplanarSiblingViewBasedId(coordinatorLayout);
        for (SideSheetCallback sideSheetCallback : this.callbacks) {
            if (sideSheetCallback instanceof SideSheetCallback) {
                sideSheetCallback.onLayout(v);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onMeasureChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), getChildMeasureSpec(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public void onRestoreInstanceState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        }
        int i = savedState.state;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.state = i;
        this.lastStableState = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    @InterfaceC6391
    public Parcelable onSaveInstanceState(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (SideSheetBehavior<?>) this);
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
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
            this.viewDragHelper.m27607(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void setCoplanarSiblingView(@InterfaceC6490 View view) {
        this.coplanarSiblingViewId = -1;
        if (view == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(view);
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v = weakReference.get();
            if (C8273.m27404(v)) {
                v.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(@InterfaceC5411 int i) {
        this.coplanarSiblingViewId = i;
        clearCoplanarSiblingView();
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v = weakReference.get();
            if (i == -1 || !C8273.m27404(v)) {
                return;
            }
            v.requestLayout();
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setHideFriction(float f) {
        this.hideFriction = f;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
        } else {
            runAfterLayout(this.viewRef.get(), new Runnable() { // from class: Yue.ۥۢ۟۠ۦ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22608.lambda$setState$0(i);
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
        if (i == 3 || i == 5) {
            this.lastStableState = i;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        updateSheetVisibility(v);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v, i);
        }
        updateAccessibilityActions();
    }

    public boolean shouldHide(@InterfaceC6391 View view, float f) {
        return this.sheetDelegate.shouldHide(view, f);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@InterfaceC6391 C3505 c3505) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(c3505);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@InterfaceC6391 C3505 c3505) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.updateBackProgress(c3505, getGravityFromSheetEdge());
        updateCoplanarSiblingBackProgress();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: addCallback(Lcom/google/android/material/sidesheet/SheetCallback;)V */
    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(@InterfaceC6391 SideSheetCallback sideSheetCallback) {
        this.callbacks.add(sideSheetCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: removeCallback(Lcom/google/android/material/sidesheet/SheetCallback;)V */
    @Override // com.google.android.material.sidesheet.Sheet
    public void removeCallback(@InterfaceC6391 SideSheetCallback sideSheetCallback) {
        this.callbacks.remove(sideSheetCallback);
    }

    private void setSheetEdge(int i) {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null || sheetDelegate.getSheetEdge() != i) {
            if (i == 0) {
                this.sheetDelegate = new RightSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasRightMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                updateMaterialShapeDrawable(builder.build());
                return;
            }
            if (i == 1) {
                this.sheetDelegate = new LeftSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasLeftMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder2 = this.shapeAppearanceModel.toBuilder();
                builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                updateMaterialShapeDrawable(builder2.build());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0 or 1.");
        }
    }

    public SideSheetBehavior(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new C8301.AbstractC8302() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // Yue.C8301.AbstractC8302
            public int clampViewPositionHorizontal(@InterfaceC6391 View view, int i, int i2) {
                return C6132.m18838(i, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // Yue.C8301.AbstractC8302
            public int clampViewPositionVertical(@InterfaceC6391 View view, int i, int i2) {
                return view.getTop();
            }

            @Override // Yue.C8301.AbstractC8302
            public int getViewHorizontalDragRange(@InterfaceC6391 View view) {
                return SideSheetBehavior.this.childWidth + SideSheetBehavior.this.getInnerMargin();
            }

            @Override // Yue.C8301.AbstractC8302
            public void onViewDragStateChanged(int i) {
                if (i == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // Yue.C8301.AbstractC8302
            public void onViewPositionChanged(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i);
            }

            @Override // Yue.C8301.AbstractC8302
            public void onViewReleased(@InterfaceC6391 View view, float f, float f2) {
                int iCalculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f, f2);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, iCalculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // Yue.C8301.AbstractC8302
            public boolean tryCaptureView(@InterfaceC6391 View view, int i) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1980R.styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attributeSet, 0, DEF_STYLE_RES).build();
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            setCoplanarSiblingViewId(typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
