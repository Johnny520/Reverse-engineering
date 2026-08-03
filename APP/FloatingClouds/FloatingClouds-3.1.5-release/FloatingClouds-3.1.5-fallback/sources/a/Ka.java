package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ka implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.datepicker.g f152a;
    public final /* synthetic */ com.google.android.material.datepicker.c b;

    public Ka(com.google.android.material.datepicker.c r1, com.google.android.material.datepicker.g r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f152a = r2
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            com.google.android.material.datepicker.c r4 = r3.b
            androidx.recyclerview.widget.RecyclerView r0 = r4.e0
            androidx.recyclerview.widget.RecyclerView$l r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.v()
            r2 = 0
            android.view.View r0 = r0.O0(r2, r1, r2)
            if (r0 != 0) goto L17
            r0 = -1
            goto L1b
        L17:
            int r0 = androidx.recyclerview.widget.RecyclerView.l.H(r0)
        L1b:
            int r0 = r0 + 1
            androidx.recyclerview.widget.RecyclerView r1 = r4.e0
            androidx.recyclerview.widget.RecyclerView$d r1 = r1.getAdapter()
            int r1 = r1.a()
            if (r0 >= r1) goto L41
            com.google.android.material.datepicker.g r1 = r3.f152a
            com.google.android.material.datepicker.a r1 = r1.d
            a.tb r1 = r1.f1067a
            java.util.Calendar r1 = r1.f697a
            java.util.Calendar r1 = a.Zf.c(r1)
            r2 = 2
            r1.add(r2, r0)
            a.tb r0 = new a.tb
            r0.<init>(r1)
            r4.G(r0)
        L41:
            return
    }
}
