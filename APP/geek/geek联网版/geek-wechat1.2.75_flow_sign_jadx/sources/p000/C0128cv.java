package p000;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: cv */
/* JADX INFO: loaded from: classes.dex */
public final class C0128cv implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0201ev f1266a;

    public C0128cv(C0201ev c0201ev) {
        this.f1266a = c0201ev;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f1266a.mo1030c();
    }
}
