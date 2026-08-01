package p000;

/* JADX INFO: renamed from: u5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0860u5 implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10596;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f10597;

    public /* synthetic */ C0860u5(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f10596 = r1
            r0.f10597 = r2
            r0.<init>()
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            int r1 = r0.f10596
            switch(r1) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r0.f10597
            androidx.appcompat.widget.SearchView r0 = (androidx.appcompat.widget.SearchView) r0
            r0.m282(r3)
            return
        Ld:
            java.lang.Object r0 = r0.f10597
            androidx.appcompat.widget.δ r0 = (androidx.appcompat.widget.C0031) r0
            androidx.appcompat.widget.AppCompatSpinner r1 = r0.f814
            r1.setSelection(r3)
            android.widget.AdapterView$OnItemClickListener r4 = r1.getOnItemClickListener()
            if (r4 == 0) goto L25
            t5 r4 = r0.f811
            long r4 = r4.getItemId(r3)
            r1.performItemClick(r2, r3, r4)
        L25:
            r0.dismiss()
            return
    }
}
