package p000;

/* JADX INFO: renamed from: t5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0823t5 implements android.widget.ListAdapter, android.widget.SpinnerAdapter {

    /* JADX INFO: renamed from: ε */
    public android.widget.SpinnerAdapter f10200;

    /* JADX INFO: renamed from: ζ */
    public android.widget.ListAdapter f10201;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
            r0 = this;
            android.widget.ListAdapter r0 = r0.f10201
            if (r0 == 0) goto L9
            boolean r0 = r0.areAllItemsEnabled()
            return r0
        L9:
            r0 = 1
            return r0
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r0 = this;
            android.widget.SpinnerAdapter r0 = r0.f10200
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getCount()
            return r0
    }

    @Override // android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            android.widget.SpinnerAdapter r0 = r0.f10200
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getDropDownView(r1, r2, r3)
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r1) {
            r0 = this;
            android.widget.SpinnerAdapter r0 = r0.f10200
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.getItem(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            android.widget.SpinnerAdapter r0 = r0.f10200
            if (r0 != 0) goto L7
            r0 = -1
            return r0
        L7:
            long r0 = r0.getItemId(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View r0 = r0.getDropDownView(r1, r2, r3)
            return r0
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
            r0 = this;
            android.widget.SpinnerAdapter r0 = r0.f10200
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
            r0 = this;
            int r0 = r0.getCount()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int r1) {
            r0 = this;
            android.widget.ListAdapter r0 = r0.f10201
            if (r0 == 0) goto L9
            boolean r0 = r0.isEnabled(r1)
            return r0
        L9:
            r0 = 1
            return r0
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(android.database.DataSetObserver r1) {
            r0 = this;
            android.widget.SpinnerAdapter r0 = r0.f10200
            if (r0 == 0) goto L7
            r0.registerDataSetObserver(r1)
        L7:
            return
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(android.database.DataSetObserver r1) {
            r0 = this;
            android.widget.SpinnerAdapter r0 = r0.f10200
            if (r0 == 0) goto L7
            r0.unregisterDataSetObserver(r1)
        L7:
            return
    }
}
