package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0995X6 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3168a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3169b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0995X6(int i, Object obj) {
        this.f3168a = i;
        this.f3169b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m1883a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1884b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m1885c(View view) {
    }

    /* JADX INFO: renamed from: d */
    private final void m1886d(View view) {
    }

    /* JADX INFO: renamed from: e */
    private final void m1887e(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f3168a;
        Object obj = this.f3169b;
        switch (i) {
            case 1:
                AbstractC0295Gu.m625r(-247325691738165L);
                view.removeOnAttachStateChangeListener(this);
                view.post(new RunnableC1398f8((C0693Q4) obj, 1));
                break;
            case 2:
                C1141ag c1141ag = (C1141ag) obj;
                AccessibilityManager accessibilityManager = c1141ag.f3625t;
                if (c1141ag.f3626u != null && accessibilityManager != null && c1141ag.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(c1141ag.f3626u);
                    break;
                }
                break;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                AbstractC1255cE.m2370c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f3168a) {
            case 0:
                ViewOnKeyListenerC1125a7 viewOnKeyListenerC1125a7 = (ViewOnKeyListenerC1125a7) this.f3169b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1125a7.f3564x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1125a7.f3564x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1125a7.f3564x.removeGlobalOnLayoutListener(viewOnKeyListenerC1125a7.f3549i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                AbstractC0295Gu.m625r(-247334281672757L);
                break;
            case 2:
                C1141ag c1141ag = (C1141ag) this.f3169b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = c1141ag.f3626u;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = c1141ag.f3625t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f3169b;
                AccessibilityManagerTouchExplorationStateChangeListenerC2807zk accessibilityManagerTouchExplorationStateChangeListenerC2807zk = hideBottomViewOnScrollBehavior.f4387h;
                if (accessibilityManagerTouchExplorationStateChangeListenerC2807zk != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f4386g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2807zk);
                    hideBottomViewOnScrollBehavior.f4387h = null;
                    break;
                }
                break;
            case 5:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f3169b;
                AccessibilityManagerTouchExplorationStateChangeListenerC2807zk accessibilityManagerTouchExplorationStateChangeListenerC2807zk2 = hideViewOnScrollBehavior.f4393c;
                if (accessibilityManagerTouchExplorationStateChangeListenerC2807zk2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f4392b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2807zk2);
                    hideViewOnScrollBehavior.f4393c = null;
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC1029Xy viewOnKeyListenerC1029Xy = (ViewOnKeyListenerC1029Xy) this.f3169b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1029Xy.f3288o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1029Xy.f3288o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1029Xy.f3288o.removeGlobalOnLayoutListener(viewOnKeyListenerC1029Xy.f3282i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
