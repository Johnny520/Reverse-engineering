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

    public C1202b4(C1245c4 r1, ViewTreeObserverOnGlobalLayoutListenerC0949W3 r2) {
        this.f4115b = r1;
        this.f4114a = r2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver r0 = this.f4115b.f4236G.getViewTreeObserver();
        if (r0 == null) goto L6;
        r0.removeGlobalOnLayoutListener(this.f4114a);
        return;
    }
}
