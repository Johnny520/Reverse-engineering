package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class f implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.datepicker.MaterialCalendarGridView f1076a;
    public final /* synthetic */ com.google.android.material.datepicker.g b;

    public f(com.google.android.material.datepicker.g r1, com.google.android.material.datepicker.MaterialCalendarGridView r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f1076a = r2
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.google.android.material.datepicker.MaterialCalendarGridView r1 = r0.f1076a
            com.google.android.material.datepicker.e r2 = r1.a()
            int r4 = r2.b()
            if (r3 < r4) goto L67
            int r2 = r2.d()
            if (r3 > r2) goto L67
            com.google.android.material.datepicker.g r2 = r0.b
            com.google.android.material.datepicker.c$c r2 = r2.g
            com.google.android.material.datepicker.e r1 = r1.a()
            java.lang.Long r1 = r1.c(r3)
            long r3 = r1.longValue()
            com.google.android.material.datepicker.c r1 = r2.f1070a
            com.google.android.material.datepicker.a r2 = r1.Y
            com.google.android.material.datepicker.a$c r2 = r2.c
            boolean r2 = r2.f(r3)
            if (r2 == 0) goto L67
            a.I4<S> r2 = r1.X
            r2.b()
            java.util.LinkedHashSet<a.fc<S>> r2 = r1.V
            java.util.Iterator r2 = r2.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()
            a.fc r3 = (a.AbstractC0142fc) r3
            a.I4<S> r4 = r1.X
            java.lang.Object r4 = r4.a()
            r3.a(r4)
            goto L39
        L4f:
            androidx.recyclerview.widget.RecyclerView r2 = r1.e0
            androidx.recyclerview.widget.RecyclerView$d r2 = r2.getAdapter()
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.f966a
            r2.b()
            androidx.recyclerview.widget.RecyclerView r1 = r1.d0
            if (r1 == 0) goto L67
            androidx.recyclerview.widget.RecyclerView$d r1 = r1.getAdapter()
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.f966a
            r1.b()
        L67:
            return
    }
}
