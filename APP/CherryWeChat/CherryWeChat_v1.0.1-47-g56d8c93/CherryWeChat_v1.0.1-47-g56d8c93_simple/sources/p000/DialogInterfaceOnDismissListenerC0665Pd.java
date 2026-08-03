package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: renamed from: Pd */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0665Pd implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f2122a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f2123b;

    public DialogInterfaceOnDismissListenerC0665Pd(Context r1, EditText r2) {
        this.f2122a = r1;
        this.f2123b = r2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r3) {
        String r32 = AbstractC0295Gu.m625r(-826918643431477L);
        Object r33 = this.f2122a.getSystemService(r32);
        AbstractC0295Gu.m625r(-826974478006325L);
        ((InputMethodManager) r33).hideSoftInputFromWindow(this.f2123b.getWindowToken(), 1);
    }
}
