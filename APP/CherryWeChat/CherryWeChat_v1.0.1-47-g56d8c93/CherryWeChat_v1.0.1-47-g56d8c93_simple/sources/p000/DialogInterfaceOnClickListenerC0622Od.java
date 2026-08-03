package p000;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: Od */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0622Od implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0579Nd f1984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f1985b;

    public DialogInterfaceOnClickListenerC0622Od(InterfaceC0579Nd r1, EditText r2) {
        this.f1984a = r1;
        this.f1985b = r2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r1, int r2) {
        InterfaceC0579Nd r12 = this.f1984a;
        if (r12 == null) goto L6;
        r12.mo244r(this.f1985b);
        return;
    }
}
