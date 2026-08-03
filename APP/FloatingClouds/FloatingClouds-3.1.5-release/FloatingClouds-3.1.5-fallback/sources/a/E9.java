package a;

/* JADX INFO: loaded from: classes.dex */
public final class E9 implements android.widget.AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.F9 f72a;

    public E9(a.F9 r1) {
            r0 = this;
            r0.<init>()
            r0.f72a = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            r1 = -1
            if (r3 == r1) goto Ld
            a.F9 r1 = r0.f72a
            a.A5 r1 = r1.c
            if (r1 == 0) goto Ld
            r2 = 0
            r1.setListSelectionHidden(r2)
        Ld:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }
}
