package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class r4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ k4 a;
    public final /* synthetic */ s4 b;

    public r4(s4 r1, k4 r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver r0 = this.b.G.getViewTreeObserver();
        if (r0 == null) goto L6;
        r0.removeGlobalOnLayoutListener(this.a);
        return;
    }
}
