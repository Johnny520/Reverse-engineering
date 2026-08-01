package p000;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: r4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0658r4 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0398k4 f4193a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0695s4 f4194b;

    public C0658r4(C0695s4 c0695s4, ViewTreeObserverOnGlobalLayoutListenerC0398k4 viewTreeObserverOnGlobalLayoutListenerC0398k4) {
        this.f4194b = c0695s4;
        this.f4193a = viewTreeObserverOnGlobalLayoutListenerC0398k4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f4194b.f4386G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4193a);
        }
    }
}
