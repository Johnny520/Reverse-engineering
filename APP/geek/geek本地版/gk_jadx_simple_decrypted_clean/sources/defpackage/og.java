package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class og implements DialogInterface.OnCancelListener {
    public final /* synthetic */ rg a;

    public og(rg r1) {
        this.a = r1;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface r2) {
        rg r22 = this.a;
        Dialog r0 = r22.a0;
        if (r0 == null) goto L6;
        r22.onCancel(r0);
        return;
    }
}
