package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ξ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0041 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete f856;

    public RunnableC0041(androidx.appcompat.widget.SearchView.SearchAutoComplete r1) {
            r0 = this;
            r0.<init>()
            r0.f856 = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r2.f856
            boolean r0 = r2.f689
            if (r0 == 0) goto L18
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r1 = 0
            r0.showSoftInput(r2, r1)
            r2.f689 = r1
        L18:
            return
    }
}
