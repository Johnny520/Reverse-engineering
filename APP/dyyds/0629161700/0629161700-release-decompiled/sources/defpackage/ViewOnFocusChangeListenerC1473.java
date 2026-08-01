package defpackage;

/* JADX INFO: renamed from: ᛸᛴᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC1473 implements android.view.View.OnFocusChangeListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f6514;

    public ViewOnFocusChangeListenerC1473(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.f6514 = r1
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r1, boolean r2) {
            r0 = this;
            androidx.appcompat.widget.SearchView r0 = r0.f6514
            android.view.View$OnFocusChangeListener r1 = r0.f133
            if (r1 == 0) goto L9
            r1.onFocusChange(r0, r2)
        L9:
            return
    }
}
