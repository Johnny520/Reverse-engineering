package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p4 implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
    public android.widget.SpinnerAdapter a;
    public android.widget.ListAdapter b;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
            r1 = this;
            android.widget.ListAdapter r0 = r1.b
            if (r0 == 0) goto L9
            boolean r0 = r0.areAllItemsEnabled()
            return r0
        L9:
            r0 = 1
            return r0
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            android.widget.SpinnerAdapter r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getCount()
            return r0
    }

    @Override // android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.widget.SpinnerAdapter r0 = r1.a
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            android.view.View r2 = r0.getDropDownView(r2, r3, r4)
            return r2
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r2) {
            r1 = this;
            android.widget.SpinnerAdapter r0 = r1.a
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r2 = r0.getItem(r2)
            return r2
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
            r2 = this;
            android.widget.SpinnerAdapter r0 = r2.a
            if (r0 != 0) goto L7
            r0 = -1
            return r0
        L7:
            long r0 = r0.getItemId(r3)
            return r0
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View r1 = r0.getDropDownView(r1, r2, r3)
            return r1
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
            r1 = this;
            android.widget.SpinnerAdapter r0 = r1.a
            if (r0 == 0) goto Lc
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.getCount()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int r2) {
            r1 = this;
            android.widget.ListAdapter r0 = r1.b
            if (r0 == 0) goto L9
            boolean r2 = r0.isEnabled(r2)
            return r2
        L9:
            r2 = 1
            return r2
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(android.database.DataSetObserver r2) {
            r1 = this;
            android.widget.SpinnerAdapter r0 = r1.a
            if (r0 == 0) goto L7
            r0.registerDataSetObserver(r2)
        L7:
            return
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(android.database.DataSetObserver r2) {
            r1 = this;
            android.widget.SpinnerAdapter r0 = r1.a
            if (r0 == 0) goto L7
            r0.unregisterDataSetObserver(r2)
        L7:
            return
    }
}
