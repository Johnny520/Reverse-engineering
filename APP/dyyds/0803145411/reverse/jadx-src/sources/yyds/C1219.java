package yyds;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: yyds.ᛵᲇᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1219 extends Filter {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public AbstractC1589 f5597;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f5597.mo3258((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorM3806;
        ViewOnClickListenerC1975 viewOnClickListenerC1975 = (ViewOnClickListenerC1975) this.f5597;
        SearchView searchView = viewOnClickListenerC1975.f9891;
        String string = charSequence == null ? "" : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorM3806 = viewOnClickListenerC1975.m3806(viewOnClickListenerC1975.f9890, string);
                if (cursorM3806 != null) {
                    cursorM3806.getCount();
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        } else {
            cursorM3806 = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorM3806 != null) {
            filterResults.count = cursorM3806.getCount();
            filterResults.values = cursorM3806;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AbstractC1589 abstractC1589 = this.f5597;
        Cursor cursor = abstractC1589.f8080;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        abstractC1589.mo3257((Cursor) obj);
    }
}
