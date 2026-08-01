package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p001ui.graphics.ViewOnAttachStateChangeListenerC2427;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C3114;
import androidx.profileinstaller.AbstractC3275;
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p050.AbstractC7176;
import p217.AbstractC8705;
import p332.AccessibilityManagerTouchExplorationStateChangeListenerC9498;
import p332.InterfaceC9497;
import p333.AbstractC9501;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC8705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public TimeInterpolator f10329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public TimeInterpolator f10330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f10331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f10332;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public AccessibilityManagerTouchExplorationStateChangeListenerC9498 f10335;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AccessibilityManager f10336;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ViewPropertyAnimator f10337;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashSet f10333 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10328 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f10339 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10340 = 2;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f10338 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f10334 = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    public void addOnScrollStateChangedListener(InterfaceC9497 interfaceC9497) {
        this.f10333.add(interfaceC9497);
    }

    public void removeOnScrollStateChangedListener(InterfaceC9497 interfaceC9497) {
        this.f10333.remove(interfaceC9497);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7561(View view, int i) {
        this.f10340 = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f10338 = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f10334 = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f10338);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f10334);
            }
        }
        Iterator it = this.f10333.iterator();
        if (it.hasNext()) {
            throw AbstractC3275.m5138(it);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7562(View view) {
        int i = 2;
        if (this.f10340 == 2) {
            return;
        }
        m7561(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f10337;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f10337 = view.animate().translationY(0.0f).setInterpolator(this.f10330).setDuration(this.f10332).setListener(new C3114(this, i, view));
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public boolean mo7549(View view, int i, int i2) {
        return i == 2;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo7552(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f10328 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f10332 = AbstractC7176.m12481(view.getContext(), C0328R.attr.motionDurationLong2, Opcodes.SHR_INT_LIT8);
        this.f10331 = AbstractC7176.m12481(view.getContext(), C0328R.attr.motionDurationMedium4, 175);
        this.f10330 = AbstractC7176.m12482(view.getContext(), C0328R.attr.motionEasingEmphasizedInterpolator, AbstractC9501.f24810);
        this.f10329 = AbstractC7176.m12482(view.getContext(), C0328R.attr.motionEasingEmphasizedInterpolator, AbstractC9501.f24811);
        if (this.f10336 == null) {
            this.f10336 = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f10336;
        if (accessibilityManager != null && this.f10335 == null) {
            AccessibilityManagerTouchExplorationStateChangeListenerC9498 accessibilityManagerTouchExplorationStateChangeListenerC9498 = new AccessibilityManagerTouchExplorationStateChangeListenerC9498(this, view, 0);
            this.f10335 = accessibilityManagerTouchExplorationStateChangeListenerC9498;
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC9498);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2427(this, 5));
        }
        return false;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7553(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                m7562(view);
            }
        } else {
            if (this.f10340 == 1) {
                return;
            }
            if (this.f10339 && (accessibilityManager = this.f10336) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f10337;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m7561(view, 1);
            this.f10337 = view.animate().translationY(this.f10328).setInterpolator(this.f10329).setDuration(this.f10331).setListener(new C3114(this, 2, view));
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
