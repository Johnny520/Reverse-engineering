package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ com.google.android.material.datepicker.MaterialCalendarGridView a;
    public final /* synthetic */ com.google.android.material.datepicker.c b;

    public a(com.google.android.material.datepicker.c r1, com.google.android.material.datepicker.MaterialCalendarGridView r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.google.android.material.datepicker.MaterialCalendarGridView r1 = r0.a
            aw r2 = r1.a()
            int r4 = r2.a()
            if (r3 < r4) goto L33
            int r2 = r2.c()
            if (r3 > r2) goto L33
            com.google.android.material.datepicker.c r2 = r0.b
            l0 r2 = r2.d
            aw r1 = r1.a()
            java.lang.Long r1 = r1.b(r3)
            long r3 = r1.longValue()
            java.lang.Object r1 = r2.b
            ut r1 = (defpackage.ut) r1
            c8 r1 = r1.T
            cf r1 = r1.c
            long r1 = r1.a
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L31
            return
        L31:
            r1 = 0
            throw r1
        L33:
            return
    }
}
