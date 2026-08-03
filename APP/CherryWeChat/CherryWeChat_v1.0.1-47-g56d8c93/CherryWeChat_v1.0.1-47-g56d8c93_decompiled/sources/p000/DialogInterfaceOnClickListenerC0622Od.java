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

    public DialogInterfaceOnClickListenerC0622Od(InterfaceC0579Nd interfaceC0579Nd, EditText editText) {
        this.f1984a = interfaceC0579Nd;
        this.f1985b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC0579Nd interfaceC0579Nd = this.f1984a;
        if (interfaceC0579Nd != null) {
            interfaceC0579Nd.mo244r(this.f1985b);
        }
    }
}
