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

    public DialogInterfaceOnDismissListenerC0665Pd(Context context, EditText editText) {
        this.f2122a = context;
        this.f2123b = editText;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object systemService = this.f2122a.getSystemService(AbstractC0295Gu.m625r(-826918643431477L));
        AbstractC0295Gu.m625r(-826974478006325L);
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f2123b.getWindowToken(), 1);
    }
}
