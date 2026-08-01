package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import p068h.ViewOnKeyListenerC0580E;
import p068h.ViewOnKeyListenerC0588g;
import p099y.AbstractC1048L;
import p099y.AbstractC1094z;

/* JADX INFO: renamed from: androidx.fragment.app.E */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0414E implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1251c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnAttachStateChangeListenerC0414E(int i2, Object obj) {
        this.f1250b = i2;
        this.f1251c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1250b) {
            case 0:
                View view2 = (View) this.f1251c;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                AbstractC1094z.m2366c(view2);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1250b) {
            case 0:
                break;
            case 1:
                ViewOnKeyListenerC0588g viewOnKeyListenerC0588g = (ViewOnKeyListenerC0588g) this.f1251c;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0588g.f2013y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0588g.f2013y = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0588g.f2013y.removeGlobalOnLayoutListener(viewOnKeyListenerC0588g.f1998j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0580E viewOnKeyListenerC0580E = (ViewOnKeyListenerC0580E) this.f1251c;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0580E.f1955p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0580E.f1955p = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0580E.f1955p.removeGlobalOnLayoutListener(viewOnKeyListenerC0580E.f1949j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m786a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m787b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m788c(View view) {
    }
}
