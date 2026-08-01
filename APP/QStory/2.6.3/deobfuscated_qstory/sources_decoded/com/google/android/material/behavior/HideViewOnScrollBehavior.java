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
import p034.AbstractC6347;
import p201.AbstractC7876;
import p201.C7873;
import p316.AccessibilityManagerTouchExplorationStateChangeListenerC8669;
import p316.C8667;
import p316.InterfaceC8666;
import p317.AbstractC8672;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends AbstractC7876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f9996;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f9997;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AccessibilityManagerTouchExplorationStateChangeListenerC8669 f9999;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AccessibilityManager f10000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8667 f10001;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public TimeInterpolator f10003;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public TimeInterpolator f10004;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ViewPropertyAnimator f10005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashSet f9998 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f10007 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10008 = 2;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f10006 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f10002 = 0;

    public HideViewOnScrollBehavior() {
    }

    public void addOnScrollStateChangedListener(InterfaceC8666 interfaceC8666) {
        this.f9998.add(interfaceC8666);
    }

    public void removeOnScrollStateChangedListener(InterfaceC8666 interfaceC8666) {
        this.f9998.remove(interfaceC8666);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7004(View view, int i) {
        this.f10008 = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f10006 = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f10002 = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f10006);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f10002);
            }
        }
        Iterator it = this.f9998.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4578(it);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7005(View view) {
        if (this.f10008 == 2) {
            return;
        }
        m7004(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f10005;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f10001.getClass();
        this.f10005 = this.f10001.m14392(view, 0).setInterpolator(this.f10004).setDuration(this.f9997).setListener(new C2281(this, 3, view));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7006(int i) {
        int i2;
        C8667 c8667 = this.f10001;
        if (c8667 != null) {
            switch (c8667.f24454) {
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
            this.f10001 = new C8667(2);
            return;
        }
        if (i == 1) {
            this.f10001 = new C8667(0);
        } else if (i == 2) {
            this.f10001 = new C8667(1);
        } else {
            C5925.m11310(AbstractC0053.m162(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
        }
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo6990(View view, int i, int i2) {
        return i == 2;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6993(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredHeight;
        int i2;
        if (this.f10000 == null) {
            this.f10000 = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f10000;
        if (accessibilityManager != null && this.f9999 == null) {
            AccessibilityManagerTouchExplorationStateChangeListenerC8669 accessibilityManagerTouchExplorationStateChangeListenerC8669 = new AccessibilityManagerTouchExplorationStateChangeListenerC8669(this, view, 1);
            this.f9999 = accessibilityManagerTouchExplorationStateChangeListenerC8669;
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC8669);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1592(this, 6));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((C7873) view.getLayoutParams()).f21655;
        if (i3 == 80 || i3 == 81) {
            m7006(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            m7006((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        switch (this.f10001.f24454) {
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
        this.f10007 = measuredHeight + i2;
        this.f9997 = AbstractC6347.m11922(view.getContext(), R.attr.motionDurationLong2, Opcodes.SHR_INT_LIT8);
        this.f9996 = AbstractC6347.m11922(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f10004 = AbstractC6347.m11923(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC8672.f24465);
        this.f10003 = AbstractC6347.m11923(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC8672.f24466);
        return false;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6994(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                m7005(view);
                return;
            }
            return;
        }
        if (this.f10008 == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f10000;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f10005;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m7004(view, 1);
            this.f10005 = this.f10001.m14392(view, this.f10007).setInterpolator(this.f10003).setDuration(this.f9996).setListener(new C2281(this, 3, view));
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
