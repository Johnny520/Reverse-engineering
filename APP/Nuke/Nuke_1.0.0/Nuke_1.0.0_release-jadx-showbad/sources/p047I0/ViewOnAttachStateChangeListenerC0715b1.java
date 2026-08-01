package p047I0;

import android.view.View;
import p095T.C1400z0;

/* JADX INFO: renamed from: I0.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0715b1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f2263d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1400z0 f2264e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC0715b1(View view, C1400z0 c1400z0) {
        this.f2263d = view;
        this.f2264e = c1400z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2263d.removeOnAttachStateChangeListener(this);
        this.f2264e.m2688x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
