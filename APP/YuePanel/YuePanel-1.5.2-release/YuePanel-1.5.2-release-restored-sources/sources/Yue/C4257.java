package Yue;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4257 extends Filter {

    /* JADX INFO: renamed from: ۥ */
    public InterfaceC0371 f763;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۨۨ$ۥ */
    public interface InterfaceC0371 {
        Cursor getCursor();

        /* JADX INFO: renamed from: ۥ */
        CharSequence mo1220(Cursor cursor);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo1221(Cursor cursor);

        /* JADX INFO: renamed from: ۥ۟۟ */
        Cursor mo12280(CharSequence charSequence);
    }

    public C4257(InterfaceC0371 interfaceC0371) {
        this.f763 = interfaceC0371;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f763.mo1220((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorMo12280 = this.f763.mo12280(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorMo12280 != null) {
            filterResults.count = cursorMo12280.getCount();
            filterResults.values = cursorMo12280;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursor = this.f763.getCursor();
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        this.f763.mo1221((Cursor) obj);
    }
}
