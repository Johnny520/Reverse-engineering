package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.graphics.ViewOnAttachStateChangeListenerC1592;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2281;
import androidx.profileinstaller.AbstractC2442;
import com.android.dx.io.Opcodes;
import com.davemorrissey.labs.subscaleview.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p175.AbstractC7738;
import p201.AbstractC7875;
import p316.AccessibilityManagerTouchExplorationStateChangeListenerC8677;
import p316.InterfaceC8676;
import p317.AbstractC8680;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC7875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public TimeInterpolator f9979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public TimeInterpolator f9980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f9981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f9982;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public AccessibilityManagerTouchExplorationStateChangeListenerC8677 f9985;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AccessibilityManager f9986;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ViewPropertyAnimator f9987;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashSet f9983 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f9978 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f9989 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f9990 = 2;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f9988 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f9984 = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    public void addOnScrollStateChangedListener(InterfaceC8676 interfaceC8676) {
        this.f9983.add(interfaceC8676);
    }

    public void removeOnScrollStateChangedListener(InterfaceC8676 interfaceC8676) {
        this.f9983.remove(interfaceC8676);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7015(View view, int i) {
        this.f9990 = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f9988 = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f9984 = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f9988);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f9984);
            }
        }
        Iterator it = this.f9983.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4568(it);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7016(View view) {
        int i = 2;
        if (this.f9990 == 2) {
            return;
        }
        m7015(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f9987;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f9987 = view.animate().translationY(0.0f).setInterpolator(this.f9980).setDuration(this.f9982).setListener(new C2281(this, i, view));
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public boolean mo7003(View view, int i, int i2) {
        return i == 2;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo7006(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f9978 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f9982 = AbstractC7738.m13024(view.getContext(), R.attr.motionDurationLong2, Opcodes.SHR_INT_LIT8);
        this.f9981 = AbstractC7738.m13024(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f9980 = AbstractC7738.m13027(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC8680.f24473);
        this.f9979 = AbstractC7738.m13027(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC8680.f24474);
        if (this.f9986 == null) {
            this.f9986 = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f9986;
        if (accessibilityManager != null && this.f9985 == null) {
            AccessibilityManagerTouchExplorationStateChangeListenerC8677 accessibilityManagerTouchExplorationStateChangeListenerC8677 = new AccessibilityManagerTouchExplorationStateChangeListenerC8677(this, view, 0);
            this.f9985 = accessibilityManagerTouchExplorationStateChangeListenerC8677;
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC8677);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1592(this, 5));
        }
        return false;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7007(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                m7016(view);
            }
        } else {
            if (this.f9990 == 1) {
                return;
            }
            if (this.f9989 && (accessibilityManager = this.f9986) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f9987;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m7015(view, 1);
            this.f9987 = view.animate().translationY(this.f9978).setInterpolator(this.f9979).setDuration(this.f9981).setListener(new C2281(this, 2, view));
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
