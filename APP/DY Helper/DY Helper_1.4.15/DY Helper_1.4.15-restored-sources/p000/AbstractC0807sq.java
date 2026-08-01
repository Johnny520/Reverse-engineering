package p000;

/* JADX INFO: renamed from: sq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0807sq extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* JADX INFO: renamed from: ε */
    public boolean f9989;

    /* JADX INFO: renamed from: ζ */
    public boolean f9990;

    /* JADX INFO: renamed from: η */
    public android.database.Cursor f9991;

    /* JADX INFO: renamed from: θ */
    public int f9992;

    /* JADX INFO: renamed from: ι */
    public p000.C0733qq f9993;

    /* JADX INFO: renamed from: κ */
    public p000.C0770rq f9994;

    /* JADX INFO: renamed from: λ */
    public p000.C0844tq f9995;

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            boolean r0 = r1.f9989
            if (r0 == 0) goto Ld
            android.database.Cursor r1 = r1.f9991
            if (r1 == 0) goto Ld
            int r1 = r1.getCount()
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.f9989
            if (r0 == 0) goto L1d
            android.database.Cursor r0 = r1.f9991
            r0.moveToPosition(r2)
            if (r3 != 0) goto L17
            r2 = r1
            m12 r2 = (p000.m12) r2
            int r3 = r2.f6894
            r0 = 0
            android.view.LayoutInflater r2 = r2.f6895
            android.view.View r3 = r2.inflate(r3, r4, r0)
        L17:
            android.database.Cursor r2 = r1.f9991
            r1.mo3706(r3, r2)
            return r3
        L1d:
            r1 = 0
            return r1
    }

    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
            r1 = this;
            tq r0 = r1.f9995
            if (r0 != 0) goto Ld
            tq r0 = new tq
            r0.<init>()
            r0.f10429 = r1
            r1.f9995 = r0
        Ld:
            tq r1 = r1.f9995
            return r1
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.f9989
            if (r0 == 0) goto Le
            android.database.Cursor r0 = r1.f9991
            if (r0 == 0) goto Le
            r0.moveToPosition(r2)
            android.database.Cursor r1 = r1.f9991
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.f9989
            r1 = 0
            if (r0 == 0) goto L19
            android.database.Cursor r0 = r3.f9991
            if (r0 == 0) goto L19
            boolean r4 = r0.moveToPosition(r4)
            if (r4 == 0) goto L19
            android.database.Cursor r4 = r3.f9991
            int r3 = r3.f9992
            long r3 = r4.getLong(r3)
            return r3
        L19:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            boolean r0 = r2.f9989
            r1 = 0
            if (r0 == 0) goto L41
            android.database.Cursor r0 = r2.f9991
            boolean r0 = r0.moveToPosition(r3)
            if (r0 == 0) goto L37
            if (r4 != 0) goto L31
            r3 = r2
            m12 r3 = (p000.m12) r3
            int r4 = r3.f6893
            r0 = 0
            android.view.LayoutInflater r1 = r3.f6895
            android.view.View r4 = r1.inflate(r4, r5, r0)
            l12 r5 = new l12
            r5.<init>(r4)
            r4.setTag(r5)
            r5 = 2131296573(0x7f09013d, float:1.8211066E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            int r3 = r3.f6900
            r5.setImageResource(r3)
        L31:
            android.database.Cursor r3 = r2.f9991
            r2.mo3706(r4, r3)
            return r4
        L37:
            java.lang.String r2 = "couldn't move cursor to position "
            java.lang.String r2 = p000.a12.m17(r2, r3)
            p000.C1080.m7279(r2)
            return r1
        L41:
            java.lang.String r2 = "this should only be called when the cursor is valid"
            p000.C1080.m7279(r2)
            return r1
    }

    /* JADX INFO: renamed from: α */
    public abstract void mo3706(android.view.View r1, android.database.Cursor r2);

    /* JADX INFO: renamed from: β */
    public void mo3707(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.f9991
            if (r3 != r0) goto L6
            r0 = 0
            goto L40
        L6:
            if (r0 == 0) goto L16
            qq r1 = r2.f9993
            if (r1 == 0) goto Lf
            r0.unregisterContentObserver(r1)
        Lf:
            rq r1 = r2.f9994
            if (r1 == 0) goto L16
            r0.unregisterDataSetObserver(r1)
        L16:
            r2.f9991 = r3
            if (r3 == 0) goto L37
            qq r1 = r2.f9993
            if (r1 == 0) goto L21
            r3.registerContentObserver(r1)
        L21:
            rq r1 = r2.f9994
            if (r1 == 0) goto L28
            r3.registerDataSetObserver(r1)
        L28:
            java.lang.String r1 = "_id"
            int r3 = r3.getColumnIndexOrThrow(r1)
            r2.f9992 = r3
            r3 = 1
            r2.f9989 = r3
            r2.notifyDataSetChanged()
            goto L40
        L37:
            r3 = -1
            r2.f9992 = r3
            r3 = 0
            r2.f9989 = r3
            r2.notifyDataSetInvalidated()
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            return
    }

    /* JADX INFO: renamed from: γ */
    public abstract java.lang.String mo3708(android.database.Cursor r1);
}
