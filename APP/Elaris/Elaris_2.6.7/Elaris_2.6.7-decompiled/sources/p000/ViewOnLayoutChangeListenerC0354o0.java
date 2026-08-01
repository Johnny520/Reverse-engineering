package p000;

import android.view.View;

/* JADX INFO: renamed from: o0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0354o0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0322m0 f622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0397p0 f623b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnLayoutChangeListenerC0354o0(C0397p0 c0397p0, C0322m0 c0322m0) {
        this.f623b = c0397p0;
        this.f622a = c0322m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f623b.f684i = true;
        AbstractC0429r0.m832l(this.f622a);
    }
}
