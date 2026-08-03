package p000a;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;

/* JADX INFO: renamed from: a.C4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0043C4 extends Filter {

    /* JADX INFO: renamed from: a */
    public AbstractC0024B4 f166a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        Cursor cursor = (Cursor) obj;
        ((ViewOnClickListenerC0089Ee) this.f166a).getClass();
        if (cursor == null) {
            return null;
        }
        int columnIndex = cursor.getColumnIndex("suggest_intent_query");
        String string = null;
        if (columnIndex != -1) {
            try {
                string = cursor.getString(columnIndex);
            } catch (Exception e) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            }
        }
        string.getClass();
        return string;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ViewOnClickListenerC0089Ee viewOnClickListenerC0089Ee = (ViewOnClickListenerC0089Ee) this.f166a;
        if (charSequence != null) {
            viewOnClickListenerC0089Ee.getClass();
            charSequence.toString();
        }
        viewOnClickListenerC0089Ee.getClass();
        throw null;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AbstractC0024B4 abstractC0024B4 = this.f166a;
        Cursor cursor = abstractC0024B4.f71b;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((ViewOnClickListenerC0089Ee) abstractC0024B4).mo59c((Cursor) obj);
    }
}
