package p055f;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: f.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0782m implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0783n f2834a;

    public C0782m(C0783n c0783n) {
        this.f2834a = c0783n;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2834a.mo2028c();
    }
}
