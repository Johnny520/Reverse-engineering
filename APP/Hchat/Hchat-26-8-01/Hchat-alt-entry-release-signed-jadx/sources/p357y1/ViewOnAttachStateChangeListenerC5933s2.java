package p357y1;

import android.view.View;
import p117i0.C1897y1;

/* JADX INFO: renamed from: y1.s2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC5933s2 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f24054g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1897y1 f24055h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC5933s2(View view, C1897y1 c1897y1) {
        this.f24054g = view;
        this.f24055h = c1897y1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f24054g.removeOnAttachStateChangeListener(this);
        this.f24055h.m4669x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
