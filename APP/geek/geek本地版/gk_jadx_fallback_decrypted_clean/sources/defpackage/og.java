package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class og implements android.content.DialogInterface.OnCancelListener {
    public final /* synthetic */ defpackage.rg a;

    public og(defpackage.rg r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r2) {
            r1 = this;
            rg r2 = r1.a
            android.app.Dialog r0 = r2.a0
            if (r0 == 0) goto L9
            r2.onCancel(r0)
        L9:
            return
    }
}
