package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b20 implements android.view.View.OnFocusChangeListener {
    public final /* synthetic */ androidx.appcompat.widget.SearchView a;

    public b20(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.SearchView r2 = r1.a
            android.view.View$OnFocusChangeListener r0 = r2.K
            if (r0 == 0) goto L9
            r0.onFocusChange(r2, r3)
        L9:
            return
    }
}
