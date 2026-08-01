package p000;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: uu */
/* JADX INFO: loaded from: classes.dex */
public final class C0795uu implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0869wu f4771a;

    public C0795uu(C0869wu c0869wu) {
        this.f4771a = c0869wu;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4771a.mo1131c();
    }
}
