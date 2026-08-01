package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: q8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0625q8 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4040b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0625q8(int i, Object obj) {
        this.f4039a = i;
        this.f4040b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4039a) {
            case Base64.NO_PADDING /* 1 */:
                C0189ej c0189ej = (C0189ej) this.f4040b;
                AccessibilityManager accessibilityManager = c0189ej.f1805t;
                if (c0189ej.f1806u != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = ja0.f2600a;
                    if (v90.m2495b(c0189ej)) {
                        AbstractC0949z.m2746a(accessibilityManager, c0189ej.f1806u);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f4039a) {
            case Base64.DEFAULT /* 0 */:
                ViewOnKeyListenerC0736t8 viewOnKeyListenerC0736t8 = (ViewOnKeyListenerC0736t8) this.f4040b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0736t8.f4545x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0736t8.f4545x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0736t8.f4545x.removeGlobalOnLayoutListener(viewOnKeyListenerC0736t8.f4530i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case Base64.NO_PADDING /* 1 */:
                C0189ej c0189ej = (C0189ej) this.f4040b;
                InterfaceC0001a0 interfaceC0001a0 = c0189ej.f1806u;
                if (interfaceC0001a0 != null && (accessibilityManager = c0189ej.f1805t) != null) {
                    AbstractC0949z.m2747b(accessibilityManager, interfaceC0001a0);
                    break;
                }
                break;
            default:
                q40 q40Var = (q40) this.f4040b;
                ViewTreeObserver viewTreeObserver2 = q40Var.f4008o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        q40Var.f4008o = view.getViewTreeObserver();
                    }
                    q40Var.f4008o.removeGlobalOnLayoutListener(q40Var.f4002i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m2156a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2157b(View view) {
    }
}
