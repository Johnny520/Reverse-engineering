package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ga extends androidx.recyclerview.widget.RecyclerView.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Calendar f98a;
    public final java.util.Calendar b;
    public final /* synthetic */ com.google.android.material.datepicker.c c;

    public Ga(com.google.android.material.datepicker.c r2) {
            r1 = this;
            r1.c = r2
            r1.<init>()
            r2 = 0
            java.util.Calendar r0 = a.Zf.e(r2)
            r1.f98a = r0
            java.util.Calendar r2 = a.Zf.e(r2)
            r1.b = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void c(android.graphics.Canvas r1, androidx.recyclerview.widget.RecyclerView r2) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView$d r1 = r2.getAdapter()
            boolean r1 = r1 instanceof a.Bh
            if (r1 == 0) goto L3b
            androidx.recyclerview.widget.RecyclerView$l r1 = r2.getLayoutManager()
            boolean r1 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r1 != 0) goto L11
            goto L3b
        L11:
            androidx.recyclerview.widget.RecyclerView$d r1 = r2.getAdapter()
            a.Bh r1 = (a.Bh) r1
            androidx.recyclerview.widget.RecyclerView$l r1 = r2.getLayoutManager()
            androidx.recyclerview.widget.GridLayoutManager r1 = (androidx.recyclerview.widget.GridLayoutManager) r1
            com.google.android.material.datepicker.c r1 = r0.c
            a.I4<S> r1 = r1.X
            java.util.Collection r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L30
            goto L3b
        L30:
            java.lang.Object r1 = r1.next()
            a.nc r1 = (a.C0285nc) r1
            r1.getClass()
            r1 = 0
            throw r1
        L3b:
            return
    }
}
