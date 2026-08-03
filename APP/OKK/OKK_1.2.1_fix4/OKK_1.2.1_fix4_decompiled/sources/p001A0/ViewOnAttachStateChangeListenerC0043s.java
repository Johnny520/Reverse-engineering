package p001A0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;
import p006D.AbstractC0080Q;
import p008E.AccessibilityManagerTouchExplorationStateChangeListenerC0148b;
import p055f.ViewOnKeyListenerC0775f;
import p055f.ViewOnKeyListenerC0788s;

/* JADX INFO: renamed from: A0.s */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0043s implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f111b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0043s(int i2, Object obj) {
        this.f110a = i2;
        this.f111b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m138a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m139b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f110a) {
            case 0:
                C0045u c0045u = (C0045u) this.f111b;
                if (c0045u.f136u != null && (accessibilityManager = c0045u.f135t) != null) {
                    Field field = AbstractC0080Q.f219a;
                    if (c0045u.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0148b(c0045u.f136u));
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f110a) {
            case 0:
                C0045u c0045u = (C0045u) this.f111b;
                C0037m c0037m = c0045u.f136u;
                if (c0037m != null && (accessibilityManager = c0045u.f135t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0148b(c0037m));
                    break;
                }
                break;
            case 1:
                ViewOnKeyListenerC0775f viewOnKeyListenerC0775f = (ViewOnKeyListenerC0775f) this.f111b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0775f.f2776y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0775f.f2776y = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0775f.f2776y.removeGlobalOnLayoutListener(viewOnKeyListenerC0775f.f2761j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0788s viewOnKeyListenerC0788s = (ViewOnKeyListenerC0788s) this.f111b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0788s.f2861p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0788s.f2861p = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0788s.f2861p.removeGlobalOnLayoutListener(viewOnKeyListenerC0788s.f2855j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
