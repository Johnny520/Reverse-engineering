package com.google.android.material.snackbar;

import Yue.InterfaceC3897;
import Yue.InterfaceC4399;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR;
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS;

    @InterfaceC6490
    private final AccessibilityManager accessibilityManager;

    @InterfaceC6490
    private BaseTransientBottomBar.BaseCallback<Snackbar> callback;
    private boolean hasAction;

    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: onDismissed(Ljava/lang/Object;I)V */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onDismissed(Snackbar snackbar, int i) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: onShown(Ljava/lang/Object;)V */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onShown(Snackbar snackbar) {
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@InterfaceC6490 Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@InterfaceC6490 View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i = C1980R.attr.snackbarButtonStyle;
        SNACKBAR_BUTTON_STYLE_ATTR = new int[]{i};
        SNACKBAR_CONTENT_STYLE_ATTRS = new int[]{i, C1980R.attr.snackbarTextViewStyle};
    }

    private Snackbar(@InterfaceC6391 Context context, @InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6391 ContentViewCallback contentViewCallback) {
        super(context, viewGroup, view, contentViewCallback);
        this.accessibilityManager = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @InterfaceC6490
    private static ViewGroup findSuitableParent(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button getActionView() {
        return getContentLayout().getActionView();
    }

    private SnackbarContentLayout getContentLayout() {
        return (SnackbarContentLayout) this.view.getChildAt(0);
    }

    private TextView getMessageView() {
        return getContentLayout().getMessageView();
    }

    @Deprecated
    public static boolean hasSnackbarButtonStyleAttr(@InterfaceC6391 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_BUTTON_STYLE_ATTR);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    private static boolean hasSnackbarContentStyleAttrs(@InterfaceC6391 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_CONTENT_STYLE_ATTRS);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAction$0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        dispatchDismiss(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static Snackbar make(@InterfaceC6391 View view, @InterfaceC6391 CharSequence charSequence, int i) {
        return makeInternal(null, view, charSequence, i);
    }

    @InterfaceC6391
    private static Snackbar makeInternal(@InterfaceC6490 Context context, @InterfaceC6391 View view, @InterfaceC6391 CharSequence charSequence, int i) {
        ViewGroup viewGroupFindSuitableParent = findSuitableParent(view);
        if (viewGroupFindSuitableParent == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupFindSuitableParent.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(hasSnackbarContentStyleAttrs(context) ? C1980R.layout.mtrl_layout_snackbar_include : C1980R.layout.design_layout_snackbar_include, viewGroupFindSuitableParent, false);
        Snackbar snackbar = new Snackbar(context, viewGroupFindSuitableParent, snackbarContentLayout, snackbarContentLayout);
        snackbar.setText(charSequence);
        snackbar.setDuration(i);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int duration = super.getDuration();
        if (duration == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.accessibilityManager.getRecommendedTimeoutMillis(duration, (this.hasAction ? 4 : 0) | 3);
        }
        if (this.hasAction && this.accessibilityManager.isTouchExplorationEnabled()) {
            return -2;
        }
        return duration;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
        return super.isShown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setAction(@InterfaceC7613 int i, View.OnClickListener onClickListener) {
        return setAction(getContext().getText(i), onClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(ColorStateList colorStateList) {
        getActionView().setTextColor(colorStateList);
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTint(@InterfaceC3897 int i) {
        return setBackgroundTintList(ColorStateList.valueOf(i));
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.view.setBackgroundTintList(colorStateList);
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.view.setBackgroundTintMode(mode);
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    @Deprecated
    public Snackbar setCallback(@InterfaceC6490 Callback callback) {
        BaseTransientBottomBar.BaseCallback<Snackbar> baseCallback = this.callback;
        if (baseCallback != null) {
            removeCallback(baseCallback);
        }
        if (callback != null) {
            addCallback(callback);
        }
        this.callback = callback;
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setMaxInlineActionWidth(@InterfaceC4399 int i) {
        getContentLayout().setMaxInlineActionWidth(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setText(@InterfaceC6391 CharSequence charSequence) {
        getMessageView().setText(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setTextColor(ColorStateList colorStateList) {
        getMessageView().setTextColor(colorStateList);
        return this;
    }

    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setTextMaxLines(int i) {
        getMessageView().setMaxLines(i);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static Snackbar make(@InterfaceC6391 Context context, @InterfaceC6391 View view, @InterfaceC6391 CharSequence charSequence, int i) {
        return makeInternal(context, view, charSequence, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setAction(@InterfaceC6490 CharSequence charSequence, @InterfaceC6490 final View.OnClickListener onClickListener) {
        Button actionView = getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.hasAction = false;
        } else {
            this.hasAction = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View.OnClickListener() { // from class: Yue.ۥۢ۟ۢۡ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22668.lambda$setAction$0(onClickListener, view);
                }
            });
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setActionTextColor(@InterfaceC3897 int i) {
        getActionView().setTextColor(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setText(@InterfaceC7613 int i) {
        return setText(getContext().getText(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    @CanIgnoreReturnValue
    public Snackbar setTextColor(@InterfaceC3897 int i) {
        getMessageView().setTextColor(i);
        return this;
    }

    @InterfaceC6391
    public static Snackbar make(@InterfaceC6391 View view, @InterfaceC7613 int i, int i2) {
        return make(view, view.getResources().getText(i), i2);
    }
}
