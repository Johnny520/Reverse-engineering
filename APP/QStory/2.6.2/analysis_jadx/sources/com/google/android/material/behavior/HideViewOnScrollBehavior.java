package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.activity.AbstractC0053;
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
import p201.C7872;
import p316.AccessibilityManagerTouchExplorationStateChangeListenerC8677;
import p316.C8675;
import p316.InterfaceC8674;
import p317.AbstractC8680;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends AbstractC7875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f9991;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f9992;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AccessibilityManagerTouchExplorationStateChangeListenerC8677 f9994;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AccessibilityManager f9995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8675 f9996;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public TimeInterpolator f9998;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public TimeInterpolator f9999;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ViewPropertyAnimator f10000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashSet f9993 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f10002 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10003 = 2;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f10001 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f9997 = 0;

    public HideViewOnScrollBehavior() {
    }

    public void addOnScrollStateChangedListener(InterfaceC8674 interfaceC8674) {
        this.f9993.add(interfaceC8674);
    }

    public void removeOnScrollStateChangedListener(InterfaceC8674 interfaceC8674) {
        this.f9993.remove(interfaceC8674);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7017(View view, int i) {
        this.f10003 = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f10001 = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f9997 = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f10001);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f9997);
            }
        }
        Iterator it = this.f9993.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4568(it);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7018(View view) {
        if (this.f10003 == 2) {
            return;
        }
        m7017(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f10000;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f9996.getClass();
        this.f10000 = this.f9996.m14372(view, 0).setInterpolator(this.f9999).setDuration(this.f9992).setListener(new C2281(this, 3, view));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7019(int i) {
        int i2;
        C8675 c8675 = this.f9996;
        if (c8675 != null) {
            switch (c8675.f24462) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return;
            }
        }
        if (i == 0) {
            this.f9996 = new C8675(2);
            return;
        }
        if (i == 1) {
            this.f9996 = new C8675(0);
        } else if (i == 2) {
            this.f9996 = new C8675(1);
        } else {
            C5919.m11249(AbstractC0053.m161(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
        }
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo7003(View view, int i, int i2) {
        return i == 2;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7006(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredHeight;
        int i2;
        if (this.f9995 == null) {
            this.f9995 = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f9995;
        if (accessibilityManager != null && this.f9994 == null) {
            AccessibilityManagerTouchExplorationStateChangeListenerC8677 accessibilityManagerTouchExplorationStateChangeListenerC8677 = new AccessibilityManagerTouchExplorationStateChangeListenerC8677(this, view, 1);
            this.f9994 = accessibilityManagerTouchExplorationStateChangeListenerC8677;
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC8677);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1592(this, 6));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((C7872) view.getLayoutParams()).f21658;
        if (i3 == 80 || i3 == 81) {
            m7019(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            m7019((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        switch (this.f9996.f24462) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        this.f10002 = measuredHeight + i2;
        this.f9992 = AbstractC7738.m13024(view.getContext(), R.attr.motionDurationLong2, Opcodes.SHR_INT_LIT8);
        this.f9991 = AbstractC7738.m13024(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f9999 = AbstractC7738.m13027(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC8680.f24473);
        this.f9998 = AbstractC7738.m13027(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC8680.f24474);
        return false;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7007(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                m7018(view);
                return;
            }
            return;
        }
        if (this.f10003 == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f9995;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f10000;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m7017(view, 1);
            this.f10000 = this.f9996.m14372(view, this.f10002).setInterpolator(this.f9998).setDuration(this.f9991).setListener(new C2281(this, 3, view));
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
