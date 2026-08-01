package p008E;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import p069i.ViewOnClickListenerC0667c1;

/* JADX INFO: renamed from: E.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0100d extends Filter {

    /* JADX INFO: renamed from: a */
    public AbstractC0099c f393a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((ViewOnClickListenerC0667c1) this.f393a).mo244c((Cursor) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorM1295g;
        ViewOnClickListenerC0667c1 viewOnClickListenerC0667c1 = (ViewOnClickListenerC0667c1) this.f393a;
        if (charSequence == null) {
            string = "";
        } else {
            viewOnClickListenerC0667c1.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = viewOnClickListenerC0667c1.f2258l;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorM1295g = viewOnClickListenerC0667c1.m1295g(viewOnClickListenerC0667c1.f2259m, string);
                if (cursorM1295g != null) {
                    cursorM1295g.getCount();
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        } else {
            cursorM1295g = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorM1295g != null) {
            filterResults.count = cursorM1295g.getCount();
            filterResults.values = cursorM1295g;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AbstractC0099c abstractC0099c = this.f393a;
        Cursor cursor = abstractC0099c.f388d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((ViewOnClickListenerC0667c1) abstractC0099c).mo243b((Cursor) obj);
    }
}
