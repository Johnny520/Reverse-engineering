package p260ra;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: ra.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3780d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f12381g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3784h f12382h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnGlobalLayoutListenerC3780d(C3784h c3784h, View view) {
        this.f12382h = c3784h;
        this.f12381g = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C3784h c3784h = this.f12382h;
        View view = this.f12381g;
        if (view.isEnabled() && view.getVisibility() == 0) {
            try {
                view.performClick();
                c3784h.m7963o("红包按钮已点击");
            } catch (Throwable th2) {
                c3784h.m7963o("红包按钮点击失败: " + th2.getMessage());
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
