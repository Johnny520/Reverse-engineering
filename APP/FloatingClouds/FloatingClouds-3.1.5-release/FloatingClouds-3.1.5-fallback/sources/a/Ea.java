package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ea implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.datepicker.g f73a;
    public final /* synthetic */ com.google.android.material.datepicker.c b;

    public Ea(com.google.android.material.datepicker.c r1, com.google.android.material.datepicker.g r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f73a = r2
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            com.google.android.material.datepicker.c r4 = r3.b
            androidx.recyclerview.widget.RecyclerView r0 = r4.e0
            androidx.recyclerview.widget.RecyclerView$l r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.M0()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2a
            com.google.android.material.datepicker.g r1 = r3.f73a
            com.google.android.material.datepicker.a r1 = r1.d
            a.tb r1 = r1.f1067a
            java.util.Calendar r1 = r1.f697a
            java.util.Calendar r1 = a.Zf.c(r1)
            r2 = 2
            r1.add(r2, r0)
            a.tb r0 = new a.tb
            r0.<init>(r1)
            r4.G(r0)
        L2a:
            return
    }
}
