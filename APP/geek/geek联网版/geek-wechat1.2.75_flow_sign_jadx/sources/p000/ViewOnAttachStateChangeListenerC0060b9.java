package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: b9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0060b9 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f698b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0060b9(int i, Object obj) {
        this.f697a = i;
        this.f698b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f697a) {
            case Base64.NO_PADDING /* 1 */:
                C0263gj c0263gj = (C0263gj) this.f698b;
                AccessibilityManager accessibilityManager = c0263gj.f2016t;
                if (c0263gj.f2017u != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = oa0.f3426a;
                    if (aa0.m39b(c0263gj)) {
                        AbstractC0949z.m2782a(accessibilityManager, c0263gj.f2017u);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f697a) {
            case Base64.DEFAULT /* 0 */:
                ViewOnKeyListenerC0179e9 viewOnKeyListenerC0179e9 = (ViewOnKeyListenerC0179e9) this.f698b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0179e9.f1557x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0179e9.f1557x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0179e9.f1557x.removeGlobalOnLayoutListener(viewOnKeyListenerC0179e9.f1542i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case Base64.NO_PADDING /* 1 */:
                C0263gj c0263gj = (C0263gj) this.f698b;
                InterfaceC0001a0 interfaceC0001a0 = c0263gj.f2017u;
                if (interfaceC0001a0 != null && (accessibilityManager = c0263gj.f2016t) != null) {
                    AbstractC0949z.m2783b(accessibilityManager, interfaceC0001a0);
                    break;
                }
                break;
            default:
                x40 x40Var = (x40) this.f698b;
                ViewTreeObserver viewTreeObserver2 = x40Var.f5177o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        x40Var.f5177o = view.getViewTreeObserver();
                    }
                    x40Var.f5177o.removeGlobalOnLayoutListener(x40Var.f5171i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m497a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m498b(View view) {
    }
}
