package defpackage;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class xe extends Filter {
    public we a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object r2) {
        e50 r0 = (e50) this.a;
        return r0.c((Cursor) r2);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence r5) {
        e50 r0 = (e50) this.a;
        SearchView r1 = r0.k;
        if (r5 != null) goto L5;
        String r52 = "";
    L7:
        if (r1.getVisibility() == 0) goto L9;
    L17:
        Cursor r53 = null;
    L18:
        Filter.FilterResults r02 = new Filter.FilterResults();
        if (r53 == null) goto L21;
        r02.count = r53.getCount();
        r02.values = r53;
    L22:
        return r02;
    L21:
        r02.count = 0;
        r02.values = null;
        goto L22
    L9:
        if (r1.getWindowVisibility() != 0) goto L17;
        r53 = r0.g(r0.l, r52);     // Catch: RuntimeException -> L15
        if (r53 == null) goto L17;
        r53.getCount();     // Catch: RuntimeException -> L15
    L15:
        e = move-exception;
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        goto L17
    L5:
        r52 = r5.toString();
        goto L7
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence r2, Filter.FilterResults r3) {
        we r22 = this.a;
        Cursor r0 = r22.c;
        Object r32 = r3.values;
        if (r32 == null) goto L7;
        if (r32 == r0) goto L8;
        e50 r23 = (e50) r22;
        r23.b((Cursor) r32);
        return;
    L8:
        return;
    }
}
