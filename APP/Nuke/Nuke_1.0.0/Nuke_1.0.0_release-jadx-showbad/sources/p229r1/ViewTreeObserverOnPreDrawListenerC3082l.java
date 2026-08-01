package p229r1;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: r1.l */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3082l implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d */
    public final View f9796d;

    /* JADX INFO: renamed from: e */
    public ViewTreeObserver f9797e;

    /* JADX INFO: renamed from: f */
    public final RunnableC3040A f9798f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnPreDrawListenerC3082l(View view, RunnableC3040A runnableC3040A) {
        this.f9796d = view;
        this.f9797e = view.getViewTreeObserver();
        this.f9798f = runnableC3040A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f9797e.isAlive();
        View view = this.f9796d;
        if (zIsAlive) {
            this.f9797e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f9798f.run();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f9797e = view.getViewTreeObserver();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f9797e.isAlive();
        View view2 = this.f9796d;
        if (zIsAlive) {
            this.f9797e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
