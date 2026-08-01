package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r4 implements android.widget.PopupWindow.OnDismissListener {
    public final /* synthetic */ defpackage.k4 a;
    public final /* synthetic */ defpackage.s4 b;

    public r4(defpackage.s4 r1, defpackage.k4 r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r2 = this;
            s4 r0 = r2.b
            v4 r0 = r0.G
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto Lf
            k4 r1 = r2.a
            r0.removeGlobalOnLayoutListener(r1)
        Lf:
            return
    }
}
