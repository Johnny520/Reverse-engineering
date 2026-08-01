package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dr1 implements android.view.View.OnFocusChangeListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f3246;

    public dr1(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.f3246 = r1
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r1, boolean r2) {
            r0 = this;
            androidx.appcompat.widget.SearchView r0 = r0.f3246
            android.view.View$OnFocusChangeListener r1 = r0.f663
            if (r1 == 0) goto L9
            r1.onFocusChange(r0, r2)
        L9:
            return
    }
}
