package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class d implements java.lang.Runnable {
    public final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete a;

    public d(androidx.appcompat.widget.SearchView.SearchAutoComplete r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.a
            boolean r1 = r0.g
            if (r1 == 0) goto L18
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r2 = 0
            r1.showSoftInput(r0, r2)
            r0.g = r2
        L18:
            return
    }
}
