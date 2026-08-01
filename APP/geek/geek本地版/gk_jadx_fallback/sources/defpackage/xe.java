package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xe extends android.widget.Filter {
    public defpackage.we a;

    @Override // android.widget.Filter
    public final java.lang.CharSequence convertResultToString(java.lang.Object r2) {
            r1 = this;
            we r0 = r1.a
            android.database.Cursor r2 = (android.database.Cursor) r2
            e50 r0 = (defpackage.e50) r0
            java.lang.String r2 = r0.c(r2)
            return r2
    }

    @Override // android.widget.Filter
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
            r4 = this;
            we r0 = r4.a
            e50 r0 = (defpackage.e50) r0
            androidx.appcompat.widget.SearchView r1 = r0.k
            if (r5 != 0) goto Lb
            java.lang.String r5 = ""
            goto Lf
        Lb:
            java.lang.String r5 = r5.toString()
        Lf:
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 != 0) goto L31
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L1d
            goto L31
        L1d:
            android.app.SearchableInfo r1 = r0.l     // Catch: java.lang.RuntimeException -> L29
            android.database.Cursor r5 = r0.g(r1, r5)     // Catch: java.lang.RuntimeException -> L29
            if (r5 == 0) goto L31
            r5.getCount()     // Catch: java.lang.RuntimeException -> L29
            goto L32
        L29:
            r5 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r5)
        L31:
            r5 = r3
        L32:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L42
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L47
        L42:
            r5 = 0
            r0.count = r5
            r0.values = r3
        L47:
            return r0
    }

    @Override // android.widget.Filter
    public final void publishResults(java.lang.CharSequence r2, android.widget.Filter.FilterResults r3) {
            r1 = this;
            we r2 = r1.a
            android.database.Cursor r0 = r2.c
            java.lang.Object r3 = r3.values
            if (r3 == 0) goto L11
            if (r3 == r0) goto L11
            android.database.Cursor r3 = (android.database.Cursor) r3
            e50 r2 = (defpackage.e50) r2
            r2.b(r3)
        L11:
            return
    }
}
