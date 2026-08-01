package p000;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: renamed from: ye */
/* JADX INFO: loaded from: classes.dex */
public final class C0927ye extends Filter {

    /* JADX INFO: renamed from: a */
    public AbstractC0890xe f5428a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((l50) this.f5428a).mo1740c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            xe r0 = r4.f5428a
            l50 r0 = (p000.l50) r0
            androidx.appcompat.widget.SearchView r1 = r0.f2924k
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
            android.app.SearchableInfo r1 = r0.f2925l     // Catch: java.lang.RuntimeException -> L29
            android.database.Cursor r5 = r0.m1744g(r1, r5)     // Catch: java.lang.RuntimeException -> L29
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
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0927ye.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AbstractC0890xe abstractC0890xe = this.f5428a;
        Cursor cursor = abstractC0890xe.f5239c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((l50) abstractC0890xe).mo1739b((Cursor) obj);
    }
}
