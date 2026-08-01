package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class er implements android.widget.AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ er(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    private final void a(android.widget.AdapterView r1) {
            r0 = this;
            return
    }

    private final void b(android.widget.AdapterView r1) {
            r0 = this;
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            int r1 = r0.a
            switch(r1) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r0.b
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            r1.o(r3)
            return
        Ld:
            r1 = -1
            if (r3 == r1) goto L1c
            java.lang.Object r1 = r0.b
            kr r1 = (defpackage.kr) r1
            kh r1 = r1.c
            if (r1 == 0) goto L1c
            r2 = 0
            r1.setListSelectionHidden(r2)
        L1c:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView r1) {
            r0 = this;
            int r1 = r0.a
            return
    }
}
