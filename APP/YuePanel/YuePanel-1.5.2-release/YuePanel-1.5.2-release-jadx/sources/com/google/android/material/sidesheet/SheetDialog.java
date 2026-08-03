package com.google.android.material.sidesheet;

import Yue.C3024;
import Yue.C3055;
import Yue.C5194;
import Yue.C8273;
import Yue.DialogC3302;
import Yue.InterfaceC3451;
import Yue.InterfaceC5195;
import Yue.InterfaceC5411;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7651;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.sidesheet.SheetCallback;

/* JADX INFO: loaded from: classes.dex */
abstract class SheetDialog<C extends SheetCallback> extends DialogC3302 {
    private static final int COORDINATOR_LAYOUT_ID = C1980R.id.coordinator;
    private static final int TOUCH_OUTSIDE_ID = C1980R.id.touch_outside;

    @InterfaceC6490
    private MaterialBackOrchestrator backOrchestrator;

    @InterfaceC6490
    private Sheet<C> behavior;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;

    @InterfaceC6490
    private FrameLayout container;
    boolean dismissWithAnimation;

    @InterfaceC6490
    private FrameLayout sheet;

    public SheetDialog(@InterfaceC6391 Context context, @InterfaceC7651 int i, @InterfaceC3451 int i2, @InterfaceC7651 int i3) {
        super(context, getThemeResId(context, i, i2, i3));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        supportRequestWindowFeature(1);
    }

    private void ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), getLayoutResId(), null);
            this.container = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(getDialogId());
            this.sheet = frameLayout2;
            Sheet<C> behaviorFromSheet = getBehaviorFromSheet(frameLayout2);
            this.behavior = behaviorFromSheet;
            addSheetCancelOnHideCallback(behaviorFromSheet);
            this.backOrchestrator = new MaterialBackOrchestrator(this.behavior, this.sheet);
        }
    }

    @InterfaceC6391
    private FrameLayout getContainer() {
        if (this.container == null) {
            ensureContainerAndBehavior();
        }
        return this.container;
    }

    @InterfaceC6391
    private FrameLayout getSheet() {
        if (this.sheet == null) {
            ensureContainerAndBehavior();
        }
        return this.sheet;
    }

    private static int getThemeResId(@InterfaceC6391 Context context, @InterfaceC7651 int i, @InterfaceC3451 int i2, @InterfaceC7651 int i3) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i2, typedValue, true) ? typedValue.resourceId : i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wrapInSheet$0(View view) {
        if (this.cancelable && isShowing() && shouldWindowCloseOnTouchOutside()) {
            cancel();
        }
    }

    private void maybeUpdateWindowAnimationsBasedOnLayoutDirection() {
        FrameLayout frameLayout;
        Window window = getWindow();
        if (window == null || (frameLayout = this.sheet) == null || !(frameLayout.getLayoutParams() instanceof CoordinatorLayout.C8796)) {
            return;
        }
        window.setWindowAnimations(C5194.m15901(((CoordinatorLayout.C8796) this.sheet.getLayoutParams()).f29435, C8273.m27356(this.sheet)) == 3 ? C1980R.style.Animation_Material3_SideSheetDialog_Left : C1980R.style.Animation_Material3_SideSheetDialog_Right);
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    private void updateListeningForBackCallbacks() {
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.cancelable) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private View wrapInSheet(int i, @InterfaceC6490 View view, @InterfaceC6490 ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getContainer().findViewById(COORDINATOR_LAYOUT_ID);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout sheet = getSheet();
        sheet.removeAllViews();
        if (layoutParams == null) {
            sheet.addView(view);
        } else {
            sheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(TOUCH_OUTSIDE_ID).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.ۥ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f30418.lambda$wrapInSheet$0(view2);
            }
        });
        C8273.m27439(getSheet(), new C3024() { // from class: com.google.android.material.sidesheet.SheetDialog.1
            @Override // Yue.C3024
            public void onInitializeAccessibilityNodeInfo(View view2, @InterfaceC6391 C3055 c3055) {
                super.onInitializeAccessibilityNodeInfo(view2, c3055);
                if (!SheetDialog.this.cancelable) {
                    c3055.m6065(false);
                } else {
                    c3055.m118(1048576);
                    c3055.m6065(true);
                }
            }

            @Override // Yue.C3024
            public boolean performAccessibilityAction(View view2, int i2, Bundle bundle) {
                if (i2 == 1048576) {
                    SheetDialog sheetDialog = SheetDialog.this;
                    if (sheetDialog.cancelable) {
                        sheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        return this.container;
    }

    public abstract void addSheetCancelOnHideCallback(Sheet<C> sheet);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Sheet<C> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    @InterfaceC6391
    public Sheet<C> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    @InterfaceC6391
    public abstract Sheet<C> getBehaviorFromSheet(@InterfaceC6391 FrameLayout frameLayout);

    @InterfaceC5411
    public abstract int getDialogId();

    @InterfaceC5683
    public abstract int getLayoutResId();

    public abstract int getStateOnStart();

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.dismissWithAnimation;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        updateListeningForBackCallbacks();
    }

    @Override // Yue.DialogC3302, Yue.DialogC4065, android.app.Dialog
    public void onCreate(@InterfaceC6490 Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // Yue.DialogC4065, android.app.Dialog
    public void onStart() {
        super.onStart();
        Sheet<C> sheet = this.behavior;
        if (sheet == null || sheet.getState() != 5) {
            return;
        }
        this.behavior.setState(getStateOnStart());
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
        }
        if (getWindow() != null) {
            updateListeningForBackCallbacks();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.DialogC3302, Yue.DialogC4065, android.app.Dialog
    public void setContentView(@InterfaceC5683 int i) {
        super.setContentView(wrapInSheet(i, null, null));
    }

    public void setDismissWithSheetAnimationEnabled(boolean z) {
        this.dismissWithAnimation = z;
    }

    public void setSheetEdge(@InterfaceC5195 int i) {
        FrameLayout frameLayout = this.sheet;
        if (frameLayout == null) {
            throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        }
        if (C8273.m27404(frameLayout)) {
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        ViewGroup.LayoutParams layoutParams = this.sheet.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C8796) {
            ((CoordinatorLayout.C8796) layoutParams).f29435 = i;
            maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.DialogC3302, Yue.DialogC4065, android.app.Dialog
    public void setContentView(@InterfaceC6490 View view) {
        super.setContentView(wrapInSheet(0, view, null));
    }

    @Override // Yue.DialogC3302, Yue.DialogC4065, android.app.Dialog
    public void setContentView(@InterfaceC6490 View view, @InterfaceC6490 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInSheet(0, view, layoutParams));
    }
}
