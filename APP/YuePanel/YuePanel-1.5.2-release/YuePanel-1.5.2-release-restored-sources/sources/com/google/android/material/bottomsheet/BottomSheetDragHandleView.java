package com.google.android.material.bottomsheet;

import Yue.C3024;
import Yue.C3055;
import Yue.C3314;
import Yue.C8273;
import Yue.InterfaceC3070;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDragHandleView extends C3314 implements AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Material3_BottomSheet_DragHandle;

    @InterfaceC6490
    private final AccessibilityManager accessibilityManager;
    private boolean accessibilityServiceEnabled;

    @InterfaceC6490
    private BottomSheetBehavior<?> bottomSheetBehavior;
    private final BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    private final String clickFeedback;
    private final String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final String clickToExpandActionLabel;
    private boolean interactable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomSheetDragHandleView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void announceAccessibilityEvent(String str) {
        if (this.accessibilityManager == null) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.getText().add(str);
        this.accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean expandOrCollapseBottomSheetIfPossible() {
        boolean z = false;
        if (!this.interactable) {
            return false;
        }
        announceAccessibilityEvent(this.clickFeedback);
        if (!this.bottomSheetBehavior.isFitToContents() && !this.bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
            z = true;
        }
        int state = this.bottomSheetBehavior.getState();
        int i = 6;
        int i2 = 3;
        if (state == 4) {
            if (!z) {
                i = i2;
            }
        } else if (state != 3) {
            if (!this.clickToExpand) {
                i2 = 4;
            }
            i = i2;
        } else if (!z) {
            i = 4;
        }
        this.bottomSheetBehavior.setState(i);
        return true;
    }

    @InterfaceC6490
    private BottomSheetBehavior<?> findParentBottomSheetBehavior() {
        View parentView = this;
        while (true) {
            parentView = getParentView(parentView);
            if (parentView == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = parentView.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C8796) {
                CoordinatorLayout.AbstractC8792 abstractC8792M29508 = ((CoordinatorLayout.C8796) layoutParams).m29508();
                if (abstractC8792M29508 instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) abstractC8792M29508;
                }
            }
        }
    }

    @InterfaceC6490
    private static View getParentView(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onBottomSheetStateChanged$0(View view, InterfaceC3070.AbstractC0039 abstractC0039) {
        return expandOrCollapseBottomSheetIfPossible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBottomSheetStateChanged(int i) {
        if (i == 4) {
            this.clickToExpand = true;
        } else if (i == 3) {
            this.clickToExpand = false;
        }
        C8273.m27432(this, C3055.C0034.f4512, this.clickToExpand ? this.clickToExpandActionLabel : this.clickToCollapseActionLabel, new InterfaceC3070() { // from class: Yue.ۥۣ۟ۡ۠
            @Override // Yue.InterfaceC3070
            public final boolean perform(View view, InterfaceC3070.AbstractC0039 abstractC0039) {
                return this.f394.lambda$onBottomSheetStateChanged$0(view, abstractC0039);
            }
        });
    }

    private void setBottomSheetBehavior(@InterfaceC6490 BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.bottomSheetCallback);
            this.bottomSheetBehavior.setAccessibilityDelegateView(null);
        }
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setAccessibilityDelegateView(this);
            onBottomSheetStateChanged(this.bottomSheetBehavior.getState());
            this.bottomSheetBehavior.addBottomSheetCallback(this.bottomSheetCallback);
        }
        updateInteractableState();
    }

    private void updateInteractableState() {
        this.interactable = this.accessibilityServiceEnabled && this.bottomSheetBehavior != null;
        C8273.m27457(this, this.bottomSheetBehavior == null ? 2 : 1);
        setClickable(this.interactable);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.accessibilityServiceEnabled = z;
        updateInteractableState();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(findParentBottomSheetBehavior());
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BottomSheetDragHandleView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.clickToExpandActionLabel = getResources().getString(C1980R.string.bottomsheet_action_expand);
        this.clickToCollapseActionLabel = getResources().getString(C1980R.string.bottomsheet_action_collapse);
        this.clickFeedback = getResources().getString(C1980R.string.bottomsheet_drag_handle_clicked);
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(@InterfaceC6391 View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(@InterfaceC6391 View view, int i2) {
                BottomSheetDragHandleView.this.onBottomSheetStateChanged(i2);
            }
        };
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        updateInteractableState();
        C8273.m27439(this, new C3024() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
            @Override // Yue.C3024
            public void onPopulateAccessibilityEvent(View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
                }
            }
        });
    }
}
