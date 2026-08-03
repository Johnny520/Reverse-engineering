package a;

/* JADX INFO: loaded from: classes.dex */
public final class C4 extends android.widget.Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.B4 f42a;

    @Override // android.widget.Filter
    public final java.lang.CharSequence convertResultToString(java.lang.Object r4) {
            r3 = this;
            android.database.Cursor r4 = (android.database.Cursor) r4
            a.B4 r0 = r3.f42a
            a.Ee r0 = (a.Ee) r0
            r0.getClass()
            if (r4 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            java.lang.String r0 = "suggest_intent_query"
            int r0 = r4.getColumnIndex(r0)
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L18
            goto L25
        L18:
            java.lang.String r2 = r4.getString(r0)     // Catch: java.lang.Exception -> L1d
            goto L25
        L1d:
            r4 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "unexpected error retrieving valid column from cursor, did the remote process die?"
            android.util.Log.e(r0, r1, r4)
        L25:
            r2.getClass()
            return r2
    }

    @Override // android.widget.Filter
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r2) {
            r1 = this;
            a.B4 r0 = r1.f42a
            a.Ee r0 = (a.Ee) r0
            if (r2 != 0) goto L7
            goto Ld
        L7:
            r0.getClass()
            r2.toString()
        Ld:
            r0.getClass()
            r2 = 0
            throw r2
    }

    @Override // android.widget.Filter
    public final void publishResults(java.lang.CharSequence r2, android.widget.Filter.FilterResults r3) {
            r1 = this;
            a.B4 r2 = r1.f42a
            android.database.Cursor r0 = r2.b
            java.lang.Object r3 = r3.values
            if (r3 == 0) goto L11
            if (r3 == r0) goto L11
            android.database.Cursor r3 = (android.database.Cursor) r3
            a.Ee r2 = (a.Ee) r2
            r2.c(r3)
        L11:
            return
    }
}
