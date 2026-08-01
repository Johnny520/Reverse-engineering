package androidx.compose.ui.graphics;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.textfield.C3195;
import kotlinx.coroutines.C5417;
import p190.ViewOnKeyListenerC7776;
import p190.ViewOnKeyListenerC7781;
import p316.AccessibilityManagerTouchExplorationStateChangeListenerC8669;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1592 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f4685;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4686;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1592(Object obj, int i) {
        this.f4686 = i;
        this.f4685 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f4686;
        Object obj = this.f4685;
        switch (i) {
            case 0:
                C1591 c1591 = (C1591) obj;
                Context context = view.getContext();
                if (!c1591.f4681) {
                    context.getApplicationContext().registerComponentCallbacks(c1591.f4680);
                    c1591.f4681 = true;
                }
                break;
            case 2:
                C3195 c3195 = (C3195) obj;
                AccessibilityManager accessibilityManager = c3195.f10767;
                if (c3195.f10766 != null && accessibilityManager != null && c3195.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(c3195.f10766);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i = this.f4686;
        Object obj = this.f4685;
        switch (i) {
            case 0:
                C1591 c1591 = (C1591) obj;
                Context context = view.getContext();
                if (c1591.f4681) {
                    context.getApplicationContext().unregisterComponentCallbacks(c1591.f4680);
                    c1591.f4681 = false;
                }
                break;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                ((C5417) obj).mo10256(null);
                break;
            case 2:
                C3195 c3195 = (C3195) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = c3195.f10766;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = c3195.f10767) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 3:
                ViewOnKeyListenerC7781 viewOnKeyListenerC7781 = (ViewOnKeyListenerC7781) obj;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC7781.f21143;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC7781.f21143 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC7781.f21143.removeGlobalOnLayoutListener(viewOnKeyListenerC7781.f21150);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                ViewOnKeyListenerC7776 viewOnKeyListenerC7776 = (ViewOnKeyListenerC7776) obj;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC7776.f21121;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC7776.f21121 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC7776.f21121.removeGlobalOnLayoutListener(viewOnKeyListenerC7776.f21115);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 5:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                AccessibilityManagerTouchExplorationStateChangeListenerC8669 accessibilityManagerTouchExplorationStateChangeListenerC8669 = hideBottomViewOnScrollBehavior.f9990;
                if (accessibilityManagerTouchExplorationStateChangeListenerC8669 != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f9991) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC8669);
                    hideBottomViewOnScrollBehavior.f9990 = null;
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                AccessibilityManagerTouchExplorationStateChangeListenerC8669 accessibilityManagerTouchExplorationStateChangeListenerC86692 = hideViewOnScrollBehavior.f9999;
                if (accessibilityManagerTouchExplorationStateChangeListenerC86692 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f10000) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC86692);
                    hideViewOnScrollBehavior.f9999 = null;
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private final void m2910(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m2911(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m2912(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m2913(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m2914(View view) {
    }
}
