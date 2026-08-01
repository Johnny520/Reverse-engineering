package androidx.compose.ui.graphics;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.textfield.C3194;
import kotlinx.coroutines.C5416;
import p190.ViewOnKeyListenerC7775;
import p190.ViewOnKeyListenerC7780;
import p316.AccessibilityManagerTouchExplorationStateChangeListenerC8677;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1592 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f4684;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4685;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1592(Object obj, int i) {
        this.f4685 = i;
        this.f4684 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f4685;
        Object obj = this.f4684;
        switch (i) {
            case 0:
                C1591 c1591 = (C1591) obj;
                Context context = view.getContext();
                if (!c1591.f4680) {
                    context.getApplicationContext().registerComponentCallbacks(c1591.f4679);
                    c1591.f4680 = true;
                }
                break;
            case 2:
                C3194 c3194 = (C3194) obj;
                AccessibilityManager accessibilityManager = c3194.f10762;
                if (c3194.f10761 != null && accessibilityManager != null && c3194.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(c3194.f10761);
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
        int i = this.f4685;
        Object obj = this.f4684;
        switch (i) {
            case 0:
                C1591 c1591 = (C1591) obj;
                Context context = view.getContext();
                if (c1591.f4680) {
                    context.getApplicationContext().unregisterComponentCallbacks(c1591.f4679);
                    c1591.f4680 = false;
                }
                break;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                ((C5416) obj).mo10252(null);
                break;
            case 2:
                C3194 c3194 = (C3194) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = c3194.f10761;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = c3194.f10762) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 3:
                ViewOnKeyListenerC7780 viewOnKeyListenerC7780 = (ViewOnKeyListenerC7780) obj;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC7780.f21146;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC7780.f21146 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC7780.f21146.removeGlobalOnLayoutListener(viewOnKeyListenerC7780.f21153);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                ViewOnKeyListenerC7775 viewOnKeyListenerC7775 = (ViewOnKeyListenerC7775) obj;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC7775.f21124;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC7775.f21124 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC7775.f21124.removeGlobalOnLayoutListener(viewOnKeyListenerC7775.f21118);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 5:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                AccessibilityManagerTouchExplorationStateChangeListenerC8677 accessibilityManagerTouchExplorationStateChangeListenerC8677 = hideBottomViewOnScrollBehavior.f9985;
                if (accessibilityManagerTouchExplorationStateChangeListenerC8677 != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f9986) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC8677);
                    hideBottomViewOnScrollBehavior.f9985 = null;
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                AccessibilityManagerTouchExplorationStateChangeListenerC8677 accessibilityManagerTouchExplorationStateChangeListenerC86772 = hideViewOnScrollBehavior.f9994;
                if (accessibilityManagerTouchExplorationStateChangeListenerC86772 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f9995) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC86772);
                    hideViewOnScrollBehavior.f9994 = null;
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private final void m2900(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m2901(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m2902(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m2903(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m2904(View view) {
    }
}
