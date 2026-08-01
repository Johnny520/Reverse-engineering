package p069i;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p068h.ViewTreeObserverOnGlobalLayoutListenerC0585d;

/* JADX INFO: renamed from: i.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0638P implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0585d f2184b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0640Q f2185c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0638P(C0640Q c0640q, ViewTreeObserverOnGlobalLayoutListenerC0585d viewTreeObserverOnGlobalLayoutListenerC0585d) {
        this.f2185c = c0640q;
        this.f2184b = viewTreeObserverOnGlobalLayoutListenerC0585d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2185c.f2198G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2184b);
        }
    }
}
