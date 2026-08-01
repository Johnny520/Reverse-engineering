package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.η */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0034 implements android.widget.AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.appcompat.widget.C0035 f826;

    public C0034(androidx.appcompat.widget.C0035 r1) {
            r0 = this;
            r0.<init>()
            r0.f826 = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            r1 = -1
            if (r3 == r1) goto Ld
            androidx.appcompat.widget.θ r0 = r0.f826
            androidx.appcompat.widget.DropDownListView r0 = r0.f834
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setListSelectionHidden(r1)
        Ld:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView r1) {
            r0 = this;
            return
    }
}
