package p000a;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: renamed from: a.B4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0024B4 extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a */
    public boolean f70a;

    /* JADX INFO: renamed from: b */
    public Cursor f71b;

    /* JADX INFO: renamed from: c */
    public int f72c;

    /* JADX INFO: renamed from: d */
    public C0043C4 f73d;

    /* JADX INFO: renamed from: b */
    public abstract void mo58b(View view, Cursor cursor);

    /* JADX INFO: renamed from: c */
    public void mo59c(Cursor cursor) {
        Cursor cursor2 = this.f71b;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            this.f71b = cursor;
            if (cursor != null) {
                this.f72c = cursor.getColumnIndexOrThrow("_id");
                this.f70a = true;
                notifyDataSetChanged();
            } else {
                this.f72c = -1;
                this.f70a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f70a || (cursor = this.f71b) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f70a) {
            return null;
        }
        this.f71b.moveToPosition(i);
        if (view == null) {
            throw null;
        }
        mo58b(view, this.f71b);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f73d == null) {
            C0043C4 c0043c4 = new C0043C4();
            c0043c4.f166a = this;
            this.f73d = c0043c4;
        }
        return this.f73d;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f70a || (cursor = this.f71b) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f71b;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f70a && (cursor = this.f71b) != null && cursor.moveToPosition(i)) {
            return this.f71b.getLong(this.f72c);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f70a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f71b.moveToPosition(i)) {
            throw new IllegalStateException(C0944z.m2225e("couldn't move cursor to position ", i));
        }
        if (view == null) {
            throw null;
        }
        mo58b(view, this.f71b);
        return view;
    }
}
