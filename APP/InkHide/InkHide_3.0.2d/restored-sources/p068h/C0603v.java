package p068h;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: h.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0603v implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0605x f2097b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0603v(C0605x c0605x) {
        this.f2097b = c0605x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2097b.mo1207c();
    }
}
