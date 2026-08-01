package defpackage;

/* JADX INFO: renamed from: ᛱᛷᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0134 extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C2039 f1068;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.C0915 f1069;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.database.Cursor f1070;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f1071;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f1072;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f1073;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C0853 f1074;

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            boolean r0 = r1.f1072
            if (r0 == 0) goto Ld
            android.database.Cursor r1 = r1.f1070
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
            boolean r0 = r1.f1072
            if (r0 == 0) goto L1d
            android.database.Cursor r0 = r1.f1070
            r0.moveToPosition(r2)
            if (r3 != 0) goto L17
            r2 = r1
            ᲇᛵᛶᛸ r2 = (defpackage.ViewOnClickListenerC2050) r2
            int r3 = r2.f8827
            r0 = 0
            android.view.LayoutInflater r2 = r2.f8828
            android.view.View r3 = r2.inflate(r3, r4, r0)
        L17:
            android.database.Cursor r2 = r1.f1070
            r1.mo649(r3, r2)
            return r3
        L1d:
            r1 = 0
            return r1
    }

    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
            r1 = this;
            ᛵᛶᛸᛲ r0 = r1.f1069
            if (r0 != 0) goto Ld
            ᛵᛶᛸᛲ r0 = new ᛵᛶᛸᛲ
            r0.<init>()
            r0.f4153 = r1
            r1.f1069 = r0
        Ld:
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.f1072
            if (r0 == 0) goto Le
            android.database.Cursor r0 = r1.f1070
            if (r0 == 0) goto Le
            r0.moveToPosition(r2)
            android.database.Cursor r1 = r1.f1070
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.f1072
            r1 = 0
            if (r0 == 0) goto L19
            android.database.Cursor r0 = r3.f1070
            if (r0 == 0) goto L19
            boolean r4 = r0.moveToPosition(r4)
            if (r4 == 0) goto L19
            android.database.Cursor r4 = r3.f1070
            int r3 = r3.f1073
            long r3 = r4.getLong(r3)
            return r3
        L19:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            boolean r0 = r2.f1072
            r1 = 0
            if (r0 == 0) goto L41
            android.database.Cursor r0 = r2.f1070
            boolean r0 = r0.moveToPosition(r3)
            if (r0 == 0) goto L37
            if (r4 != 0) goto L31
            r3 = r2
            ᲇᛵᛶᛸ r3 = (defpackage.ViewOnClickListenerC2050) r3
            int r4 = r3.f8835
            r0 = 0
            android.view.LayoutInflater r1 = r3.f8828
            android.view.View r4 = r1.inflate(r4, r5, r0)
            ᛵᲈᲀᲀ r5 = new ᛵᲈᲀᲀ
            r5.<init>(r4)
            r4.setTag(r5)
            r5 = 1711866265(0x66090199, float:1.6174842E23)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            int r3 = r3.f8839
            r5.setImageResource(r3)
        L31:
            android.database.Cursor r3 = r2.f1070
            r2.mo649(r4, r3)
            return r4
        L37:
            java.lang.String r2 = "couldn't move cursor to position "
            java.lang.String r2 = defpackage.AbstractC1124.m2145(r3, r2)
            defpackage.C2264.m3676(r2)
            return r1
        L41:
            java.lang.String r2 = "this should only be called when the cursor is valid"
            defpackage.C2264.m3676(r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public abstract java.lang.String mo648(android.database.Cursor r1);

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public abstract void mo649(android.view.View r1, android.database.Cursor r2);

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void mo650(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.f1070
            if (r3 != r0) goto L6
            r0 = 0
            goto L40
        L6:
            if (r0 == 0) goto L16
            ᛵᛳᛸᛸ r1 = r2.f1074
            if (r1 == 0) goto Lf
            r0.unregisterContentObserver(r1)
        Lf:
            ᲇᛴᛷᲀ r1 = r2.f1068
            if (r1 == 0) goto L16
            r0.unregisterDataSetObserver(r1)
        L16:
            r2.f1070 = r3
            if (r3 == 0) goto L37
            ᛵᛳᛸᛸ r1 = r2.f1074
            if (r1 == 0) goto L21
            r3.registerContentObserver(r1)
        L21:
            ᲇᛴᛷᲀ r1 = r2.f1068
            if (r1 == 0) goto L28
            r3.registerDataSetObserver(r1)
        L28:
            java.lang.String r1 = "_id"
            int r3 = r3.getColumnIndexOrThrow(r1)
            r2.f1073 = r3
            r3 = 1
            r2.f1072 = r3
            r2.notifyDataSetChanged()
            goto L40
        L37:
            r3 = -1
            r2.f1073 = r3
            r3 = 0
            r2.f1072 = r3
            r2.notifyDataSetInvalidated()
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            return
    }
}
