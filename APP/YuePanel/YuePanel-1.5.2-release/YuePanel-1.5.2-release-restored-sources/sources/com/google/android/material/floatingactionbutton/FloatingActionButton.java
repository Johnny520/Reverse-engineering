package com.google.android.material.floatingactionbutton;

import Yue.C3304;
import Yue.C3312;
import Yue.C4520;
import Yue.C6740;
import Yue.C8273;
import Yue.InterfaceC3258;
import Yue.InterfaceC3897;
import Yue.InterfaceC4398;
import Yue.InterfaceC4525;
import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7838;
import Yue.InterfaceC7842;
import Yue.InterfaceC8392;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements InterfaceC7838, InterfaceC7842, ExpandableTransformationWidget, Shapeable, CoordinatorLayout.InterfaceC1654 {
    private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Design_FloatingActionButton;
    private static final String EXPANDABLE_WIDGET_HELPER_KEY = "expandableWidgetHelper";
    private static final String LOG_TAG = "FloatingActionButton";
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;

    @InterfaceC6490
    private ColorStateList backgroundTint;

    @InterfaceC6490
    private PorterDuff.Mode backgroundTintMode;
    private int borderWidth;
    boolean compatPadding;
    private int customSize;

    @InterfaceC6391
    private final ExpandableWidgetHelper expandableWidgetHelper;

    @InterfaceC6391
    private final C3312 imageHelper;

    @InterfaceC6490
    private PorterDuff.Mode imageMode;
    private int imagePadding;

    @InterfaceC6490
    private ColorStateList imageTint;
    private FloatingActionButtonImpl impl;
    private int maxImageSize;

    @InterfaceC6490
    private ColorStateList rippleColor;
    final Rect shadowPadding;
    private int size;
    private final Rect touchArea;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC8792<T> {
        private static final boolean AUTO_HIDE_DEFAULT = true;
        private boolean autoHideEnabled;
        private OnVisibilityChangedListener internalAutoHideListener;
        private Rect tmpRect;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BaseBehavior() {
            this.autoHideEnabled = true;
        }

        private static boolean isBottomSheet(@InterfaceC6391 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C8796) {
                return ((CoordinatorLayout.C8796) layoutParams).m29508() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void offsetIfNeeded(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.shadowPadding;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C8796 c8796 = (CoordinatorLayout.C8796) floatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c8796).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c8796).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c8796).bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c8796).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                C8273.m27415(floatingActionButton, i);
            }
            if (i2 != 0) {
                C8273.m27414(floatingActionButton, i2);
            }
        }

        private boolean shouldUpdateVisibility(@InterfaceC6391 View view, @InterfaceC6391 FloatingActionButton floatingActionButton) {
            return this.autoHideEnabled && ((CoordinatorLayout.C8796) floatingActionButton.getLayoutParams()).m29507() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, @InterfaceC6391 AppBarLayout appBarLayout, @InterfaceC6391 FloatingActionButton floatingActionButton) {
            if (!shouldUpdateVisibility(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.hide(this.internalAutoHideListener, false);
                return true;
            }
            floatingActionButton.show(this.internalAutoHideListener, false);
            return true;
        }

        private boolean updateFabVisibilityForBottomSheet(@InterfaceC6391 View view, @InterfaceC6391 FloatingActionButton floatingActionButton) {
            if (!shouldUpdateVisibility(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C8796) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.hide(this.internalAutoHideListener, false);
                return true;
            }
            floatingActionButton.show(this.internalAutoHideListener, false);
            return true;
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
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

        @InterfaceC8392
        public void setInternalAutoHideListener(OnVisibilityChangedListener onVisibilityChangedListener) {
            this.internalAutoHideListener = onVisibilityChangedListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: getInsetDodgeRect(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean getInsetDodgeRect(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 FloatingActionButton floatingActionButton, @InterfaceC6391 Rect rect) {
            Rect rect2 = floatingActionButton.shadowPadding;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onDependentViewChanged(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @InterfaceC6391 FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view, floatingActionButton);
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onLayoutChild(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 FloatingActionButton floatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            offsetIfNeeded(coordinatorLayout, floatingActionButton);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.FloatingActionButton_Behavior_Layout);
            this.autoHideEnabled = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 FloatingActionButton floatingActionButton, @InterfaceC6391 Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean isAutoHideEnabled() {
            return super.isAutoHideEnabled();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(@InterfaceC6391 CoordinatorLayout.C8796 c8796) {
            super.onAttachedToLayoutParams(c8796);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @InterfaceC6391 FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 FloatingActionButton floatingActionButton, int i) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setAutoHideEnabled(boolean z) {
            super.setAutoHideEnabled(z);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @InterfaceC8392
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(OnVisibilityChangedListener onVisibilityChangedListener) {
            super.setInternalAutoHideListener(onVisibilityChangedListener);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class OnVisibilityChangedListener {
        public void onHidden(FloatingActionButton floatingActionButton) {
        }

        public void onShown(FloatingActionButton floatingActionButton) {
        }
    }

    public class ShadowDelegateImpl implements ShadowViewDelegate {
        public ShadowDelegateImpl() {
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public float getRadius() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public boolean isCompatPaddingEnabled() {
            return FloatingActionButton.this.compatPadding;
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public void setShadowPadding(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.shadowPadding.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.imagePadding, i2 + FloatingActionButton.this.imagePadding, i3 + FloatingActionButton.this.imagePadding, i4 + FloatingActionButton.this.imagePadding);
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Size {
    }

    public class TransformationCallbackWrapper<T extends FloatingActionButton> implements FloatingActionButtonImpl.InternalTransformationCallback {

        @InterfaceC6391
        private final TransformationCallback<T> listener;

        public TransformationCallbackWrapper(@InterfaceC6391 TransformationCallback<T> transformationCallback) {
            this.listener = transformationCallback;
        }

        public boolean equals(@InterfaceC6490 Object obj) {
            return (obj instanceof TransformationCallbackWrapper) && ((TransformationCallbackWrapper) obj).listener.equals(this.listener);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public void onScaleChanged() {
            this.listener.onScaleChanged(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public void onTranslationChanged() {
            this.listener.onTranslationChanged(FloatingActionButton.this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FloatingActionButton(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6391
    private FloatingActionButtonImpl createImpl() {
        return new FloatingActionButtonImplLollipop(this, new ShadowDelegateImpl());
    }

    private FloatingActionButtonImpl getImpl() {
        if (this.impl == null) {
            this.impl = createImpl();
        }
        return this.impl;
    }

    private void getTouchTargetRect(@InterfaceC6391 Rect rect) {
        getMeasuredContentRect(rect);
        int i = -this.impl.getTouchTargetPadding();
        rect.inset(i, i);
    }

    private void offsetRectWithShadow(@InterfaceC6391 Rect rect) {
        int i = rect.left;
        Rect rect2 = this.shadowPadding;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void onApplySupportImageTint() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.imageTint;
        if (colorStateList == null) {
            C4520.m13224(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.imageMode;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C3304.m6742(colorForState, mode));
    }

    @InterfaceC6490
    private FloatingActionButtonImpl.InternalVisibilityChangedListener wrapOnVisibilityChangedListener(@InterfaceC6490 final OnVisibilityChangedListener onVisibilityChangedListener) {
        if (onVisibilityChangedListener == null) {
            return null;
        }
        return new FloatingActionButtonImpl.InternalVisibilityChangedListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButton.1
            @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
            public void onHidden() {
                onVisibilityChangedListener.onHidden(FloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener
            public void onShown() {
                onVisibilityChangedListener.onShown(FloatingActionButton.this);
            }
        };
    }

    public void addOnHideAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        getImpl().addOnHideAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        getImpl().addOnShowAnimationListener(animatorListener);
    }

    public void addTransformationCallback(@InterfaceC6391 TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        getImpl().addTransformationCallback(new TransformationCallbackWrapper(transformationCallback));
    }

    public void clearCustomSize() {
        setCustomSize(0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().onDrawableStateChanged(getDrawableState());
    }

    @Override // android.view.View
    @InterfaceC6490
    public ColorStateList getBackgroundTintList() {
        return this.backgroundTint;
    }

    @Override // android.view.View
    @InterfaceC6490
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1654
    @InterfaceC6391
    public CoordinatorLayout.AbstractC8792<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().getHoveredFocusedTranslationZ();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().getPressedTranslationZ();
    }

    @InterfaceC6490
    public Drawable getContentBackground() {
        return getImpl().getContentBackground();
    }

    @Deprecated
    public boolean getContentRect(@InterfaceC6391 Rect rect) {
        if (!C8273.m27404(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        offsetRectWithShadow(rect);
        return true;
    }

    @InterfaceC6844
    public int getCustomSize() {
        return this.customSize;
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public int getExpandedComponentIdHint() {
        return this.expandableWidgetHelper.getExpandedComponentIdHint();
    }

    @InterfaceC6490
    public MotionSpec getHideMotionSpec() {
        return getImpl().getHideMotionSpec();
    }

    public void getMeasuredContentRect(@InterfaceC6391 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        offsetRectWithShadow(rect);
    }

    @InterfaceC3897
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.rippleColor;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @InterfaceC6490
    public ColorStateList getRippleColorStateList() {
        return this.rippleColor;
    }

    @Override // com.google.android.material.shape.Shapeable
    @InterfaceC6391
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return (ShapeAppearanceModel) C6740.m21415(getImpl().getShapeAppearance());
    }

    @InterfaceC6490
    public MotionSpec getShowMotionSpec() {
        return getImpl().getShowMotionSpec();
    }

    public int getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSizeDimension() {
        return getSizeDimension(this.size);
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC6490
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC6490
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // Yue.InterfaceC7842
    @InterfaceC6490
    public ColorStateList getSupportImageTintList() {
        return this.imageTint;
    }

    @Override // Yue.InterfaceC7842
    @InterfaceC6490
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.imageMode;
    }

    public boolean getUseCompatPadding() {
        return this.compatPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void hide() {
        hide(null);
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean isExpanded() {
        return this.expandableWidgetHelper.isExpanded();
    }

    public boolean isOrWillBeHidden() {
        return getImpl().isOrWillBeHidden();
    }

    public boolean isOrWillBeShown() {
        return getImpl().isOrWillBeShown();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().jumpDrawableToCurrentState();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.imagePadding = (sizeDimension - this.maxImageSize) / 2;
        getImpl().updatePadding();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.shadowPadding;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.expandableWidgetHelper.onRestoreInstanceState((Bundle) C6740.m21415(extendableSavedState.extendableStates.get(EXPANDABLE_WIDGET_HELPER_KEY)));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.extendableStates.put(EXPANDABLE_WIDGET_HELPER_KEY, this.expandableWidgetHelper.onSaveInstanceState());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@InterfaceC6391 MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getTouchTargetRect(this.touchArea);
            if (!this.touchArea.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnHideAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        getImpl().removeOnHideAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(@InterfaceC6391 Animator.AnimatorListener animatorListener) {
        getImpl().removeOnShowAnimationListener(animatorListener);
    }

    public void removeTransformationCallback(@InterfaceC6391 TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        getImpl().removeTransformationCallback(new TransformationCallbackWrapper(transformationCallback));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            getImpl().setBackgroundTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            getImpl().setBackgroundTintMode(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().setElevation(f);
    }

    public void setCompatElevationResource(@InterfaceC4398 int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().setHoveredFocusedTranslationZ(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(@InterfaceC4398 int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().setPressedTranslationZ(f);
    }

    public void setCompatPressedTranslationZResource(@InterfaceC4398 int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@InterfaceC6844 int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.customSize) {
            this.customSize = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    @InterfaceC7113(21)
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().updateShapeElevation(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().getEnsureMinTouchTargetSize()) {
            getImpl().setEnsureMinTouchTargetSize(z);
            requestLayout();
        }
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean setExpanded(boolean z) {
        return this.expandableWidgetHelper.setExpanded(z);
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public void setExpandedComponentIdHint(@InterfaceC5411 int i) {
        this.expandableWidgetHelper.setExpandedComponentIdHint(i);
    }

    public void setHideMotionSpec(@InterfaceC6490 MotionSpec motionSpec) {
        getImpl().setHideMotionSpec(motionSpec);
    }

    public void setHideMotionSpecResource(@InterfaceC3258 int i) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@InterfaceC6490 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().updateImageMatrixScale();
            if (this.imageTint != null) {
                onApplySupportImageTint();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@InterfaceC4525 int i) {
        this.imageHelper.m6776(i);
        onApplySupportImageTint();
    }

    public void setMaxImageSize(int i) {
        this.maxImageSize = i;
        getImpl().setMaxImageSize(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRippleColor(@InterfaceC3897 int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().onScaleChanged();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().onScaleChanged();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC8392
    public void setShadowPaddingEnabled(boolean z) {
        getImpl().setShadowPaddingEnabled(z);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().setShapeAppearance(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@InterfaceC6490 MotionSpec motionSpec) {
        getImpl().setShowMotionSpec(motionSpec);
    }

    public void setShowMotionSpecResource(@InterfaceC3258 int i) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setSize(int i) {
        this.customSize = 0;
        if (i != this.size) {
            this.size = i;
            requestLayout();
        }
    }

    @Override // Yue.InterfaceC7838
    public void setSupportBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // Yue.InterfaceC7838
    public void setSupportBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // Yue.InterfaceC7842
    public void setSupportImageTintList(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.imageTint != colorStateList) {
            this.imageTint = colorStateList;
            onApplySupportImageTint();
        }
    }

    @Override // Yue.InterfaceC7842
    public void setSupportImageTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        if (this.imageMode != mode) {
            this.imageMode = mode;
            onApplySupportImageTint();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().onTranslationChanged();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().onTranslationChanged();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().onTranslationChanged();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.compatPadding != z) {
            this.compatPadding = z;
            getImpl().onCompatShadowChanged();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return getImpl().getEnsureMinTouchTargetSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void show() {
        show(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FloatingActionButton(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.floatingActionButtonStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private int getSizeDimension(int i) {
        int i2 = this.customSize;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(C1980R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(C1980R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < AUTO_MINI_LARGEST_SCREEN_WIDTH ? getSizeDimension(1) : getSizeDimension(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void hide(@InterfaceC6490 OnVisibilityChangedListener onVisibilityChangedListener) {
        hide(onVisibilityChangedListener, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setRippleColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            getImpl().setRippleColor(this.rippleColor);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void show(@InterfaceC6490 OnVisibilityChangedListener onVisibilityChangedListener) {
        show(onVisibilityChangedListener, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.shadowPadding = new Rect();
        this.touchArea = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.FloatingActionButton, i, i2, new int[0]);
        this.backgroundTint = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C1980R.styleable.FloatingActionButton_backgroundTint);
        this.backgroundTintMode = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.rippleColor = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C1980R.styleable.FloatingActionButton_rippleColor);
        this.size = typedArrayObtainStyledAttributes.getInt(C1980R.styleable.FloatingActionButton_fabSize, -1);
        this.customSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.FloatingActionButton_fabCustomSize, 0);
        this.borderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.compatPadding = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1980R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.FloatingActionButton_maxImageSize, 0));
        MotionSpec motionSpecCreateFromAttribute = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C1980R.styleable.FloatingActionButton_showMotionSpec);
        MotionSpec motionSpecCreateFromAttribute2 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, C1980R.styleable.FloatingActionButton_hideMotionSpec);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i, i2, ShapeAppearanceModel.PILL).build();
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.FloatingActionButton_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        C3312 c3312 = new C3312(this);
        this.imageHelper = c3312;
        c3312.m6774(attributeSet, i);
        this.expandableWidgetHelper = new ExpandableWidgetHelper(this);
        getImpl().setShapeAppearance(shapeAppearanceModelBuild);
        getImpl().initializeBackgroundDrawable(this.backgroundTint, this.backgroundTintMode, this.rippleColor, this.borderWidth);
        getImpl().setMinTouchTargetSize(dimensionPixelSize);
        getImpl().setElevation(dimension);
        getImpl().setHoveredFocusedTranslationZ(dimension2);
        getImpl().setPressedTranslationZ(dimension3);
        getImpl().setShowMotionSpec(motionSpecCreateFromAttribute);
        getImpl().setHideMotionSpec(motionSpecCreateFromAttribute2);
        getImpl().setEnsureMinTouchTargetSize(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void hide(@InterfaceC6490 OnVisibilityChangedListener onVisibilityChangedListener, boolean z) {
        getImpl().hide(wrapOnVisibilityChangedListener(onVisibilityChangedListener), z);
    }

    public void show(@InterfaceC6490 OnVisibilityChangedListener onVisibilityChangedListener, boolean z) {
        getImpl().show(wrapOnVisibilityChangedListener(onVisibilityChangedListener), z);
    }
}
