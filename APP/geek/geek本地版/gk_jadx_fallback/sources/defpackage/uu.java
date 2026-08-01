package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uu implements android.widget.PopupWindow.OnDismissListener {
    public final /* synthetic */ defpackage.wu a;

    public uu(defpackage.wu r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r1 = this;
            wu r0 = r1.a
            r0.c()
            return
    }
}
