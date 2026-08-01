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
import p034.AbstractC6347;
import p201.AbstractC7876;
import p316.AccessibilityManagerTouchExplorationStateChangeListenerC8669;
import p316.InterfaceC8668;
import p317.AbstractC8672;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC7876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public TimeInterpolator f9984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public TimeInterpolator f9985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f9986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f9987;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public AccessibilityManagerTouchExplorationStateChangeListenerC8669 f9990;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AccessibilityManager f9991;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ViewPropertyAnimator f9992;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashSet f9988 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f9983 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f9994 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f9995 = 2;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f9993 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f9989 = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    public void addOnScrollStateChangedListener(InterfaceC8668 interfaceC8668) {
        this.f9988.add(interfaceC8668);
    }

    public void removeOnScrollStateChangedListener(InterfaceC8668 interfaceC8668) {
        this.f9988.remove(interfaceC8668);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7002(View view, int i) {
        this.f9995 = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f9993 = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f9989 = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f9993);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f9989);
            }
        }
        Iterator it = this.f9988.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4578(it);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7003(View view) {
        int i = 2;
        if (this.f9995 == 2) {
            return;
        }
        m7002(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f9992;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f9992 = view.animate().translationY(0.0f).setInterpolator(this.f9985).setDuration(this.f9987).setListener(new C2281(this, i, view));
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public boolean mo6990(View view, int i, int i2) {
        return i == 2;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public boolean mo6993(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f9983 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f9987 = AbstractC6347.m11922(view.getContext(), R.attr.motionDurationLong2, Opcodes.SHR_INT_LIT8);
        this.f9986 = AbstractC6347.m11922(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f9985 = AbstractC6347.m11923(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC8672.f24465);
        this.f9984 = AbstractC6347.m11923(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC8672.f24466);
        if (this.f9991 == null) {
            this.f9991 = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f9991;
        if (accessibilityManager != null && this.f9990 == null) {
            AccessibilityManagerTouchExplorationStateChangeListenerC8669 accessibilityManagerTouchExplorationStateChangeListenerC8669 = new AccessibilityManagerTouchExplorationStateChangeListenerC8669(this, view, 0);
            this.f9990 = accessibilityManagerTouchExplorationStateChangeListenerC8669;
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC8669);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1592(this, 5));
        }
        return false;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6994(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                m7003(view);
            }
        } else {
            if (this.f9995 == 1) {
                return;
            }
            if (this.f9994 && (accessibilityManager = this.f9991) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f9992;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m7002(view, 1);
            this.f9992 = view.animate().translationY(this.f9983).setInterpolator(this.f9984).setDuration(this.f9986).setListener(new C2281(this, 2, view));
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
