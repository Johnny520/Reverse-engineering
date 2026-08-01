package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ᛷᛲᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0001 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete f217;

    public RunnableC0001(androidx.appcompat.widget.SearchView.SearchAutoComplete r1) {
            r0 = this;
            r0.<init>()
            r0.f217 = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r2.f217
            boolean r0 = r2.f167
            if (r0 == 0) goto L18
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r1 = 0
            r0.showSoftInput(r2, r1)
            r2.f167 = r1
        L18:
            return
    }
}
