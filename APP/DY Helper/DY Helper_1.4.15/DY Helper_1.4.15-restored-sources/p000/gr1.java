package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gr1 implements android.widget.AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f4435;

    public gr1(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.f4435 = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.widget.SearchView r0 = r0.f4435
            r0.m283(r3)
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView r1) {
            r0 = this;
            return
    }
}
