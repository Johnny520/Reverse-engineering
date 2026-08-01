package p000;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: r4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0657r4 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0398k4 f4057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0694s4 f4058b;

    public C0657r4(C0694s4 c0694s4, ViewTreeObserverOnGlobalLayoutListenerC0398k4 viewTreeObserverOnGlobalLayoutListenerC0398k4) {
        this.f4058b = c0694s4;
        this.f4057a = viewTreeObserverOnGlobalLayoutListenerC0398k4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f4058b.f4206G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4057a);
        }
    }
}
