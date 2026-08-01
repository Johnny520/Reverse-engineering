package androidx.compose.p001ui.graphics;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.textfield.C4027;
import kotlinx.coroutines.C6249;
import p206.ViewOnKeyListenerC8605;
import p206.ViewOnKeyListenerC8610;
import p332.AccessibilityManagerTouchExplorationStateChangeListenerC9498;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2427 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f5030;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5031;

    public /* synthetic */ ViewOnAttachStateChangeListenerC2427(Object obj, int i) {
        this.f5031 = i;
        this.f5030 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f5031;
        Object obj = this.f5030;
        switch (i) {
            case 0:
                C2426 c2426 = (C2426) obj;
                Context context = view.getContext();
                if (!c2426.f5026) {
                    context.getApplicationContext().registerComponentCallbacks(c2426.f5025);
                    c2426.f5026 = true;
                }
                break;
            case 2:
                C4027 c4027 = (C4027) obj;
                AccessibilityManager accessibilityManager = c4027.f11112;
                if (c4027.f11111 != null && accessibilityManager != null && c4027.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(c4027.f11111);
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
        int i = this.f5031;
        Object obj = this.f5030;
        switch (i) {
            case 0:
                C2426 c2426 = (C2426) obj;
                Context context = view.getContext();
                if (c2426.f5026) {
                    context.getApplicationContext().unregisterComponentCallbacks(c2426.f5025);
                    c2426.f5026 = false;
                }
                break;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                ((C6249) obj).mo10815(null);
                break;
            case 2:
                C4027 c4027 = (C4027) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = c4027.f11111;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = c4027.f11112) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 3:
                ViewOnKeyListenerC8610 viewOnKeyListenerC8610 = (ViewOnKeyListenerC8610) obj;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC8610.f21488;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC8610.f21488 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC8610.f21488.removeGlobalOnLayoutListener(viewOnKeyListenerC8610.f21495);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                ViewOnKeyListenerC8605 viewOnKeyListenerC8605 = (ViewOnKeyListenerC8605) obj;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC8605.f21466;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC8605.f21466 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC8605.f21466.removeGlobalOnLayoutListener(viewOnKeyListenerC8605.f21460);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 5:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                AccessibilityManagerTouchExplorationStateChangeListenerC9498 accessibilityManagerTouchExplorationStateChangeListenerC9498 = hideBottomViewOnScrollBehavior.f10335;
                if (accessibilityManagerTouchExplorationStateChangeListenerC9498 != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f10336) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC9498);
                    hideBottomViewOnScrollBehavior.f10335 = null;
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                AccessibilityManagerTouchExplorationStateChangeListenerC9498 accessibilityManagerTouchExplorationStateChangeListenerC94982 = hideViewOnScrollBehavior.f10344;
                if (accessibilityManagerTouchExplorationStateChangeListenerC94982 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f10345) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC94982);
                    hideViewOnScrollBehavior.f10344 = null;
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private final void m3470(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m3471(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m3472(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m3473(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m3474(View view) {
    }
}
