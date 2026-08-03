package com.google.android.material.floatingactionbutton;

import Yue.C8273;
import Yue.InterfaceC3258;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC1654 {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int DEF_STYLE_RES = C1980R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    private static final int EXTEND = 3;
    private static final int EXTEND_STRATEGY_AUTO = 0;
    private static final int EXTEND_STRATEGY_MATCH_PARENT = 2;
    private static final int EXTEND_STRATEGY_WRAP_CONTENT = 1;
    static final Property<View, Float> HEIGHT;
    private static final int HIDE = 1;
    static final Property<View, Float> PADDING_END;
    static final Property<View, Float> PADDING_START;
    private static final int SHOW = 0;
    private static final int SHRINK = 2;
    static final Property<View, Float> WIDTH;
    private int animState;
    private boolean animateShowBeforeLayout;

    @InterfaceC6391
    private final CoordinatorLayout.AbstractC8792<ExtendedFloatingActionButton> behavior;
    private final AnimatorTracker changeVisibilityTracker;
    private final int collapsedSize;

    @InterfaceC6391
    private final MotionStrategy extendStrategy;
    private final int extendStrategyType;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final MotionStrategy hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    private int originalHeight;

    @InterfaceC6391
    protected ColorStateList originalTextCsl;
    private int originalWidth;
    private final MotionStrategy showStrategy;

    @InterfaceC6391
    private final MotionStrategy shrinkStrategy;

    public class ChangeSizeStrategy extends BaseMotionStrategy {
        private final boolean extending;
        private final Size size;

        public ChangeSizeStrategy(AnimatorTracker animatorTracker, Size size, boolean z) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
            this.size = size;
            this.extending = z;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        @InterfaceC6391
        public AnimatorSet createAnimator() {
            MotionSpec currentMotionSpec = getCurrentMotionSpec();
            if (currentMotionSpec.hasPropertyValues("width")) {
                PropertyValuesHolder[] propertyValues = currentMotionSpec.getPropertyValues("width");
                propertyValues[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.size.getWidth());
                currentMotionSpec.setPropertyValues("width", propertyValues);
            }
            if (currentMotionSpec.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = currentMotionSpec.getPropertyValues("height");
                propertyValues2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.size.getHeight());
                currentMotionSpec.setPropertyValues("height", propertyValues2);
            }
            if (currentMotionSpec.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = currentMotionSpec.getPropertyValues("paddingStart");
                propertyValues3[0].setFloatValues(C8273.m27367(ExtendedFloatingActionButton.this), this.size.getPaddingStart());
                currentMotionSpec.setPropertyValues("paddingStart", propertyValues3);
            }
            if (currentMotionSpec.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = currentMotionSpec.getPropertyValues("paddingEnd");
                propertyValues4[0].setFloatValues(C8273.m27366(ExtendedFloatingActionButton.this), this.size.getPaddingEnd());
                currentMotionSpec.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (currentMotionSpec.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = currentMotionSpec.getPropertyValues("labelOpacity");
                boolean z = this.extending;
                propertyValues5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                currentMotionSpec.setPropertyValues("labelOpacity", propertyValues5);
            }
            return super.createAnimator(currentMotionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return this.extending ? C1980R.animator.mtrl_extended_fab_change_size_expand_motion_spec : C1980R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.isTransforming = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.size.getLayoutParams().width;
            layoutParams.height = this.size.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.isExtended = this.extending;
            ExtendedFloatingActionButton.this.isTransforming = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@InterfaceC6490 OnChangedCallback onChangedCallback) {
            if (onChangedCallback == null) {
                return;
            }
            if (this.extending) {
                onChangedCallback.onExtended(ExtendedFloatingActionButton.this);
            } else {
                onChangedCallback.onShrunken(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.isExtended = this.extending;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.extending) {
                ExtendedFloatingActionButton.this.originalWidth = layoutParams.width;
                ExtendedFloatingActionButton.this.originalHeight = layoutParams.height;
            }
            layoutParams.width = this.size.getLayoutParams().width;
            layoutParams.height = this.size.getLayoutParams().height;
            C8273.m27471(ExtendedFloatingActionButton.this, this.size.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.size.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return this.extending == ExtendedFloatingActionButton.this.isExtended || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC8792<T> {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;

        @InterfaceC6490
        private OnChangedCallback internalAutoHideCallback;

        @InterfaceC6490
        private OnChangedCallback internalAutoShrinkCallback;
        private Rect tmpRect;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ExtendedFloatingActionButtonBehavior() {
            this.autoHideEnabled = false;
            this.autoShrinkEnabled = true;
        }

        private static boolean isBottomSheet(@InterfaceC6391 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C8796) {
                return ((CoordinatorLayout.C8796) layoutParams).m29508() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean shouldUpdateVisibility(@InterfaceC6391 View view, @InterfaceC6391 ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.autoHideEnabled || this.autoShrinkEnabled) && ((CoordinatorLayout.C8796) extendedFloatingActionButton.getLayoutParams()).m29507() == view.getId();
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, @InterfaceC6391 AppBarLayout appBarLayout, @InterfaceC6391 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        private boolean updateFabVisibilityForBottomSheet(@InterfaceC6391 View view, @InterfaceC6391 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C8796) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        public void extendOrShow(@InterfaceC6391 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.autoShrinkEnabled;
            extendedFloatingActionButton.performMotion(z ? 3 : 0, z ? this.internalAutoShrinkCallback : this.internalAutoHideCallback);
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
        }

        public boolean isAutoShrinkEnabled() {
            return this.autoShrinkEnabled;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public void onAttachedToLayoutParams(@InterfaceC6391 CoordinatorLayout.C8796 c8796) {
            if (c8796.f29440 == 0) {
                c8796.f29440 = 80;
            }
        }

        public void setAutoHideEnabled(boolean z) {
            this.autoHideEnabled = z;
        }

        public void setAutoShrinkEnabled(boolean z) {
            this.autoShrinkEnabled = z;
        }

        @InterfaceC8392
        public void setInternalAutoHideCallback(@InterfaceC6490 OnChangedCallback onChangedCallback) {
            this.internalAutoHideCallback = onChangedCallback;
        }

        @InterfaceC8392
        public void setInternalAutoShrinkCallback(@InterfaceC6490 OnChangedCallback onChangedCallback) {
            this.internalAutoShrinkCallback = onChangedCallback;
        }

        public void shrinkOrHide(@InterfaceC6391 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.autoShrinkEnabled;
            extendedFloatingActionButton.performMotion(z ? 2 : 1, z ? this.internalAutoShrinkCallback : this.internalAutoHideCallback);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: getInsetDodgeRect(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean getInsetDodgeRect(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 ExtendedFloatingActionButton extendedFloatingActionButton, @InterfaceC6391 Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onDependentViewChanged(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @InterfaceC6391 ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton);
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onLayoutChild(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.autoHideEnabled = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.autoShrinkEnabled = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class HideStrategy extends BaseMotionStrategy {
        private boolean isCancelled;

        public HideStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return C1980R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
            super.onAnimationCancel();
            this.isCancelled = true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.animState = 0;
            if (this.isCancelled) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.isCancelled = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.animState = 1;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@InterfaceC6490 OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.this.isOrWillBeHidden();
        }
    }

    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    public class ShowStrategy extends BaseMotionStrategy {
        public ShowStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
            return C1980R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.animState = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.animState = 2;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(@InterfaceC6490 OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
            return ExtendedFloatingActionButton.this.isOrWillBeShown();
        }
    }

    public interface Size {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        WIDTH = new Property<View, Float>(cls, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // android.util.Property
            @InterfaceC6391
            public Float get(@InterfaceC6391 View view) {
                return Float.valueOf(view.getLayoutParams().width);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
            @Override // android.util.Property
            public void set(@InterfaceC6391 View view, @InterfaceC6391 Float f) {
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
            }
        };
        HEIGHT = new Property<View, Float>(cls, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // android.util.Property
            @InterfaceC6391
            public Float get(@InterfaceC6391 View view) {
                return Float.valueOf(view.getLayoutParams().height);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
            @Override // android.util.Property
            public void set(@InterfaceC6391 View view, @InterfaceC6391 Float f) {
                view.getLayoutParams().height = f.intValue();
                view.requestLayout();
            }
        };
        PADDING_START = new Property<View, Float>(cls, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // android.util.Property
            @InterfaceC6391
            public Float get(@InterfaceC6391 View view) {
                return Float.valueOf(C8273.m27367(view));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
            @Override // android.util.Property
            public void set(@InterfaceC6391 View view, @InterfaceC6391 Float f) {
                C8273.m27471(view, f.intValue(), view.getPaddingTop(), C8273.m27366(view), view.getPaddingBottom());
            }
        };
        PADDING_END = new Property<View, Float>(cls, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // android.util.Property
            @InterfaceC6391
            public Float get(@InterfaceC6391 View view) {
                return Float.valueOf(C8273.m27366(view));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
            @Override // android.util.Property
            public void set(@InterfaceC6391 View view, @InterfaceC6391 Float f) {
                C8273.m27471(view, C8273.m27367(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExtendedFloatingActionButton(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private Size getSizeFromExtendStrategyType(int i) {
        final Size size = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.2
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return ExtendedFloatingActionButton.this.getMeasuredHeight();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(-2, -2);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.extendedPaddingStart;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.extendedPaddingStart + ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }
        };
        final Size size2 = new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.3
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (ExtendedFloatingActionButton.this.originalHeight != -1) {
                    return (ExtendedFloatingActionButton.this.originalHeight == 0 || ExtendedFloatingActionButton.this.originalHeight == -2) ? size.getHeight() : ExtendedFloatingActionButton.this.originalHeight;
                }
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return size.getHeight();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null || layoutParams.height != -2) {
                    return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
                }
                return size.getHeight();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.originalHeight == 0 ? -2 : ExtendedFloatingActionButton.this.originalHeight);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.extendedPaddingStart;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return size.getWidth();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null || layoutParams.width != -2) {
                    return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
                }
                return size.getWidth();
            }
        };
        return i != 1 ? i != 2 ? new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return ExtendedFloatingActionButton.this.originalHeight == -1 ? size2.getHeight() : (ExtendedFloatingActionButton.this.originalHeight == 0 || ExtendedFloatingActionButton.this.originalHeight == -2) ? size.getHeight() : ExtendedFloatingActionButton.this.originalHeight;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.originalWidth == 0 ? -2 : ExtendedFloatingActionButton.this.originalWidth, ExtendedFloatingActionButton.this.originalHeight != 0 ? ExtendedFloatingActionButton.this.originalHeight : -2);
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.extendedPaddingEnd;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.extendedPaddingStart;
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                return ExtendedFloatingActionButton.this.originalWidth == -1 ? size2.getWidth() : (ExtendedFloatingActionButton.this.originalWidth == 0 || ExtendedFloatingActionButton.this.originalWidth == -2) ? size.getWidth() : ExtendedFloatingActionButton.this.originalWidth;
            }
        } : size2 : size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeHidden() {
        return getVisibility() == 0 ? this.animState == 1 : this.animState != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isOrWillBeShown() {
        return getVisibility() != 0 ? this.animState == 2 : this.animState != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performMotion(int i, @InterfaceC6490 final OnChangedCallback onChangedCallback) {
        final MotionStrategy motionStrategy;
        if (i == 0) {
            motionStrategy = this.showStrategy;
        } else if (i == 1) {
            motionStrategy = this.hideStrategy;
        } else if (i == 2) {
            motionStrategy = this.shrinkStrategy;
        } else {
            if (i != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i);
            }
            motionStrategy = this.extendStrategy;
        }
        if (motionStrategy.shouldCancel()) {
            return;
        }
        if (!shouldAnimateVisibilityChange()) {
            motionStrategy.performNow();
            motionStrategy.onChange(onChangedCallback);
            return;
        }
        if (i == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.originalWidth = layoutParams.width;
                this.originalHeight = layoutParams.height;
            } else {
                this.originalWidth = getWidth();
                this.originalHeight = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetCreateAnimator = motionStrategy.createAnimator();
        animatorSetCreateAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.cancelled = true;
                motionStrategy.onAnimationCancel();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                motionStrategy.onAnimationEnd();
                if (this.cancelled) {
                    return;
                }
                motionStrategy.onChange(onChangedCallback);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                motionStrategy.onAnimationStart(animator);
                this.cancelled = false;
            }
        });
        Iterator<Animator.AnimatorListener> it = motionStrategy.getListeners().iterator();
        while (it.hasNext()) {
            animatorSetCreateAnimator.addListener(it.next());
        }
        animatorSetCreateAnimator.start();
    }

    private void saveOriginalTextCsl() {
        this.originalTextCsl = getTextColors();
    }

    private boolean shouldAnimateVisibilityChange() {
        return (C8273.m27404(this) || (!isOrWillBeShown() && this.animateShowBeforeLayout)) && !isInEditMode();
    }

    public void addOnExtendAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        this.extendStrategy.addAnimationListener(animatorListener);
    }

    public void addOnHideAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        this.hideStrategy.addAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        this.showStrategy.addAnimationListener(animatorListener);
    }

    public void addOnShrinkAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.addAnimationListener(animatorListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void extend() {
        performMotion(3, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1654
    @InterfaceC6391
    public CoordinatorLayout.AbstractC8792<ExtendedFloatingActionButton> getBehavior() {
        return this.behavior;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @InterfaceC8392
    public int getCollapsedSize() {
        int i = this.collapsedSize;
        return i < 0 ? (Math.min(C8273.m27367(this), C8273.m27366(this)) * 2) + getIconSize() : i;
    }

    @InterfaceC6490
    public MotionSpec getExtendMotionSpec() {
        return this.extendStrategy.getMotionSpec();
    }

    @InterfaceC6490
    public MotionSpec getHideMotionSpec() {
        return this.hideStrategy.getMotionSpec();
    }

    @InterfaceC6490
    public MotionSpec getShowMotionSpec() {
        return this.showStrategy.getMotionSpec();
    }

    @InterfaceC6490
    public MotionSpec getShrinkMotionSpec() {
        return this.shrinkStrategy.getMotionSpec();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void hide() {
        performMotion(1, null);
    }

    public final boolean isExtended() {
        return this.isExtended;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isExtended && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.isExtended = false;
            this.shrinkStrategy.performNow();
        }
    }

    public void removeOnExtendAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        this.extendStrategy.removeAnimationListener(animatorListener);
    }

    public void removeOnHideAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        this.hideStrategy.removeAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        this.showStrategy.removeAnimationListener(animatorListener);
    }

    public void removeOnShrinkAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        this.shrinkStrategy.removeAnimationListener(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.animateShowBeforeLayout = z;
    }

    public void setExtendMotionSpec(@InterfaceC6490 MotionSpec motionSpec) {
        this.extendStrategy.setMotionSpec(motionSpec);
    }

    public void setExtendMotionSpecResource(@InterfaceC3258 int i) {
        setExtendMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.isExtended == z) {
            return;
        }
        MotionStrategy motionStrategy = z ? this.extendStrategy : this.shrinkStrategy;
        if (motionStrategy.shouldCancel()) {
            return;
        }
        motionStrategy.performNow();
    }

    public void setHideMotionSpec(@InterfaceC6490 MotionSpec motionSpec) {
        this.hideStrategy.setMotionSpec(motionSpec);
    }

    public void setHideMotionSpecResource(@InterfaceC3258 int i) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = C8273.m27367(this);
        this.extendedPaddingEnd = C8273.m27366(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = i;
        this.extendedPaddingEnd = i3;
    }

    public void setShowMotionSpec(@InterfaceC6490 MotionSpec motionSpec) {
        this.showStrategy.setMotionSpec(motionSpec);
    }

    public void setShowMotionSpecResource(@InterfaceC3258 int i) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setShrinkMotionSpec(@InterfaceC6490 MotionSpec motionSpec) {
        this.shrinkStrategy.setMotionSpec(motionSpec);
    }

    public void setShrinkMotionSpecResource(@InterfaceC3258 int i) {
        setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        saveOriginalTextCsl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void show() {
        performMotion(0, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void shrink() {
        performMotion(2, null);
    }

    public void silentlyUpdateTextColor(@InterfaceC6391 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ExtendedFloatingActionButton(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void extend(@InterfaceC6391 OnChangedCallback onChangedCallback) {
        performMotion(3, onChangedCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void hide(@InterfaceC6391 OnChangedCallback onChangedCallback) {
        performMotion(1, onChangedCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void show(@InterfaceC6391 OnChangedCallback onChangedCallback) {
        performMotion(0, onChangedCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void shrink(@InterfaceC6391 OnChangedCallback onChangedCallback) {
        performMotion(2, onChangedCallback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.animState = 0;
        AnimatorTracker animatorTracker = new AnimatorTracker();
        this.changeVisibilityTracker = animatorTracker;
        ShowStrategy showStrategy = new ShowStrategy(animatorTracker);
        this.showStrategy = showStrategy;
        HideStrategy hideStrategy = new HideStrategy(animatorTracker);
        this.hideStrategy = hideStrategy;
        this.isExtended = true;
        this.isTransforming = false;
        this.animateShowBeforeLayout = false;
        Context context2 = getContext();
        this.behavior = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.ExtendedFloatingActionButton, i, i2, new int[0]);
        MotionSpec motionSpecCreateFromAttribute = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C1980R.styleable.ExtendedFloatingActionButton_showMotionSpec);
        MotionSpec motionSpecCreateFromAttribute2 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C1980R.styleable.ExtendedFloatingActionButton_hideMotionSpec);
        MotionSpec motionSpecCreateFromAttribute3 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C1980R.styleable.ExtendedFloatingActionButton_extendMotionSpec);
        MotionSpec motionSpecCreateFromAttribute4 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C1980R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.collapsedSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.extendStrategyType = i3;
        this.extendedPaddingStart = C8273.m27367(this);
        this.extendedPaddingEnd = C8273.m27366(this);
        AnimatorTracker animatorTracker2 = new AnimatorTracker();
        ChangeSizeStrategy changeSizeStrategy = new ChangeSizeStrategy(animatorTracker2, getSizeFromExtendStrategyType(i3), true);
        this.extendStrategy = changeSizeStrategy;
        ChangeSizeStrategy changeSizeStrategy2 = new ChangeSizeStrategy(animatorTracker2, new Size() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getHeight() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public ViewGroup.LayoutParams getLayoutParams() {
                return new ViewGroup.LayoutParams(getWidth(), getHeight());
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingEnd() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getPaddingStart() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }

            @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
            public int getWidth() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }
        }, false);
        this.shrinkStrategy = changeSizeStrategy2;
        showStrategy.setMotionSpec(motionSpecCreateFromAttribute);
        hideStrategy.setMotionSpec(motionSpecCreateFromAttribute2);
        changeSizeStrategy.setMotionSpec(motionSpecCreateFromAttribute3);
        changeSizeStrategy2.setMotionSpec(motionSpecCreateFromAttribute4);
        typedArrayObtainStyledAttributes.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context2, attributeSet, i, i2, ShapeAppearanceModel.PILL).build());
        saveOriginalTextCsl();
    }

    @Override // android.widget.TextView
    public void setTextColor(@InterfaceC6391 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        saveOriginalTextCsl();
    }
}
