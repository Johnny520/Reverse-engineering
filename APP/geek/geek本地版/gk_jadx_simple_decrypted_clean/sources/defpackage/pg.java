package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class pg implements DialogInterface.OnDismissListener {
    public final /* synthetic */ rg a;

    public pg(rg r1) {
        this.a = r1;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r2) {
        rg r22 = this.a;
        Dialog r0 = r22.a0;
        if (r0 == null) goto L6;
        r22.onDismiss(r0);
        return;
    }
}
