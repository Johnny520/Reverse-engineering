package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.activity.AbstractC0900;
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
import p217.C8702;
import p332.AccessibilityManagerTouchExplorationStateChangeListenerC9498;
import p332.C9496;
import p332.InterfaceC9495;
import p333.AbstractC9501;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends AbstractC8705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f10342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AccessibilityManagerTouchExplorationStateChangeListenerC9498 f10344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AccessibilityManager f10345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C9496 f10346;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public TimeInterpolator f10348;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public TimeInterpolator f10349;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ViewPropertyAnimator f10350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashSet f10343 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f10352 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10353 = 2;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f10351 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f10347 = 0;

    public HideViewOnScrollBehavior() {
    }

    public void addOnScrollStateChangedListener(InterfaceC9495 interfaceC9495) {
        this.f10343.add(interfaceC9495);
    }

    public void removeOnScrollStateChangedListener(InterfaceC9495 interfaceC9495) {
        this.f10343.remove(interfaceC9495);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7563(View view, int i) {
        this.f10353 = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f10351 = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f10347 = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f10351);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f10347);
            }
        }
        Iterator it = this.f10343.iterator();
        if (it.hasNext()) {
            throw AbstractC3275.m5138(it);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7564(View view) {
        if (this.f10353 == 2) {
            return;
        }
        m7563(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f10350;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f10346.getClass();
        this.f10350 = this.f10346.m14951(view, 0).setInterpolator(this.f10349).setDuration(this.f10342).setListener(new C3114(this, 3, view));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7565(int i) {
        int i2;
        C9496 c9496 = this.f10346;
        if (c9496 != null) {
            switch (c9496.f24799) {
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
            this.f10346 = new C9496(2);
            return;
        }
        if (i == 1) {
            this.f10346 = new C9496(0);
        } else if (i == 2) {
            this.f10346 = new C9496(1);
        } else {
            C6755.m11869(AbstractC0900.m722(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
        }
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo7549(View view, int i, int i2) {
        return i == 2;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7552(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredHeight;
        int i2;
        if (this.f10345 == null) {
            this.f10345 = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f10345;
        if (accessibilityManager != null && this.f10344 == null) {
            AccessibilityManagerTouchExplorationStateChangeListenerC9498 accessibilityManagerTouchExplorationStateChangeListenerC9498 = new AccessibilityManagerTouchExplorationStateChangeListenerC9498(this, view, 1);
            this.f10344 = accessibilityManagerTouchExplorationStateChangeListenerC9498;
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC9498);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2427(this, 6));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((C8702) view.getLayoutParams()).f22000;
        if (i3 == 80 || i3 == 81) {
            m7565(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            m7565((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        switch (this.f10346.f24799) {
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
        this.f10352 = measuredHeight + i2;
        this.f10342 = AbstractC7176.m12481(view.getContext(), C0328R.attr.motionDurationLong2, Opcodes.SHR_INT_LIT8);
        this.f10341 = AbstractC7176.m12481(view.getContext(), C0328R.attr.motionDurationMedium4, 175);
        this.f10349 = AbstractC7176.m12482(view.getContext(), C0328R.attr.motionEasingEmphasizedInterpolator, AbstractC9501.f24810);
        this.f10348 = AbstractC7176.m12482(view.getContext(), C0328R.attr.motionEasingEmphasizedInterpolator, AbstractC9501.f24811);
        return false;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7553(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                m7564(view);
                return;
            }
            return;
        }
        if (this.f10353 == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f10345;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f10350;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m7563(view, 1);
            this.f10350 = this.f10346.m14951(view, this.f10352).setInterpolator(this.f10348).setDuration(this.f10341).setListener(new C3114(this, 3, view));
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
