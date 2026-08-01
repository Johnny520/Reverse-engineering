package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ SearchView.SearchAutoComplete a;

    public d(SearchView.SearchAutoComplete r1) {
        this.a = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete r0 = this.a;
        if (r0.g == false) goto L6;
        ((InputMethodManager) r0.getContext().getSystemService("input_method")).showSoftInput(r0, 0);
        r0.g = false;
        return;
    }
}
