package p000;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: b4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1202b4 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0949W3 f4114a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1245c4 f4115b;

    public C1202b4(C1245c4 c1245c4, ViewTreeObserverOnGlobalLayoutListenerC0949W3 viewTreeObserverOnGlobalLayoutListenerC0949W3) {
        this.f4115b = c1245c4;
        this.f4114a = viewTreeObserverOnGlobalLayoutListenerC0949W3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f4115b.f4236G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4114a);
        }
    }
}
