package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class uu implements PopupWindow.OnDismissListener {
    public final /* synthetic */ wu a;

    public uu(wu r1) {
        this.a = r1;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
