package yyds;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛷᛷᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1589 extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C0957 f8078;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C1219 f8079;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Cursor f8080;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C1474 f8081;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f8082;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f8083;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f8084;

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f8082 || (cursor = this.f8080) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f8082) {
            return null;
        }
        this.f8080.moveToPosition(i);
        if (view == null) {
            ViewOnClickListenerC1975 viewOnClickListenerC1975 = (ViewOnClickListenerC1975) this;
            view = viewOnClickListenerC1975.f9901.inflate(viewOnClickListenerC1975.f9900, viewGroup, false);
        }
        mo3256(view, this.f8080);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        C1219 c1219 = this.f8079;
        if (c1219 != null) {
            return c1219;
        }
        C1219 c12192 = new C1219();
        c12192.f5597 = this;
        this.f8079 = c12192;
        return c12192;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f8082 || (cursor = this.f8080) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f8080;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f8082 && (cursor = this.f8080) != null && cursor.moveToPosition(i)) {
            return this.f8080.getLong(this.f8083);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f8082) {
            C0188.m800("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.f8080.moveToPosition(i)) {
            C0188.m800(AbstractC0897.m1989(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            ViewOnClickListenerC1975 viewOnClickListenerC1975 = (ViewOnClickListenerC1975) this;
            view = viewOnClickListenerC1975.f9901.inflate(viewOnClickListenerC1975.f9902, viewGroup, false);
            view.setTag(new C2741(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(viewOnClickListenerC1975.f9897);
        }
        mo3256(view, this.f8080);
        return view;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public abstract void mo3256(View view, Cursor cursor);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void mo3257(Cursor cursor) {
        Cursor cursor2 = this.f8080;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C1474 c1474 = this.f8081;
                if (c1474 != null) {
                    cursor2.unregisterContentObserver(c1474);
                }
                C0957 c0957 = this.f8078;
                if (c0957 != null) {
                    cursor2.unregisterDataSetObserver(c0957);
                }
            }
            this.f8080 = cursor;
            if (cursor != null) {
                C1474 c14742 = this.f8081;
                if (c14742 != null) {
                    cursor.registerContentObserver(c14742);
                }
                C0957 c09572 = this.f8078;
                if (c09572 != null) {
                    cursor.registerDataSetObserver(c09572);
                }
                this.f8083 = cursor.getColumnIndexOrThrow("_id");
                this.f8082 = true;
                notifyDataSetChanged();
            } else {
                this.f8083 = -1;
                this.f8082 = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public abstract String mo3258(Cursor cursor);
}
