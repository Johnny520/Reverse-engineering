package p091g3;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: g3.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1307f implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g */
    public final View f4364g;

    /* JADX INFO: renamed from: h */
    public ViewTreeObserver f4365h;

    /* JADX INFO: renamed from: i */
    public final RunnableC1336v f4366i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnPreDrawListenerC1307f(View view, RunnableC1336v runnableC1336v) {
        this.f4364g = view;
        this.f4365h = view.getViewTreeObserver();
        this.f4366i = runnableC1336v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f4365h.isAlive();
        View view = this.f4364g;
        if (zIsAlive) {
            this.f4365h.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f4366i.run();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f4365h = view.getViewTreeObserver();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f4365h.isAlive();
        View view2 = this.f4364g;
        if (zIsAlive) {
            this.f4365h.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
