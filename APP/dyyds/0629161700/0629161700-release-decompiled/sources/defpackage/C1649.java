package defpackage;

/* JADX INFO: renamed from: ᲀᛳᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1649 implements android.widget.AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7343;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7344;

    public /* synthetic */ C1649(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7344 = r1
            r0.f7343 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m3034(android.widget.AdapterView r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m3035(android.widget.AdapterView r1) {
            r0 = this;
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            int r1 = r0.f7344
            java.lang.Object r0 = r0.f7343
            switch(r1) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            androidx.appcompat.widget.SearchView r0 = (androidx.appcompat.widget.SearchView) r0
            r0.m53(r3)
            return
        Ld:
            r1 = -1
            if (r3 == r1) goto L1a
            ᛸᛶᛳᛷ r0 = (defpackage.AbstractC1503) r0
            ᛲᲈᲁᛸ r0 = r0.f6621
            if (r0 == 0) goto L1a
            r1 = 0
            r0.setListSelectionHidden(r1)
        L1a:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView r1) {
            r0 = this;
            int r0 = r0.f7344
            return
    }
}
