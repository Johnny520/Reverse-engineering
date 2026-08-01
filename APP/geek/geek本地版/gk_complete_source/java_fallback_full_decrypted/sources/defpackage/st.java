package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class st extends defpackage.kz {
    @Override // defpackage.kz
    public final void a(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            fz r0 = r2.getAdapter()
            boolean r0 = r0 instanceof defpackage.fd0
            if (r0 == 0) goto L1f
            nz r0 = r2.getLayoutManager()
            boolean r0 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 != 0) goto L11
            goto L1f
        L11:
            fz r0 = r2.getAdapter()
            fd0 r0 = (defpackage.fd0) r0
            nz r2 = r2.getLayoutManager()
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
            r2 = 0
            throw r2
        L1f:
            return
    }
}
