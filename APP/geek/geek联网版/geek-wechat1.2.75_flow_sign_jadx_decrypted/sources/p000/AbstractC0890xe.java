package p000;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: renamed from: xe */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0890xe extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a */
    public boolean f5237a;

    /* JADX INFO: renamed from: b */
    public boolean f5238b;

    /* JADX INFO: renamed from: c */
    public Cursor f5239c;

    /* JADX INFO: renamed from: d */
    public int f5240d;

    /* JADX INFO: renamed from: e */
    public C0815ve f5241e;

    /* JADX INFO: renamed from: f */
    public C0853we f5242f;

    /* JADX INFO: renamed from: g */
    public C0927ye f5243g;

    /* JADX INFO: renamed from: a */
    public abstract void mo1738a(View view, Cursor cursor);

    /* JADX INFO: renamed from: b */
    public void mo1739b(Cursor cursor) {
        Cursor cursor2 = this.f5239c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0815ve c0815ve = this.f5241e;
                if (c0815ve != null) {
                    cursor2.unregisterContentObserver(c0815ve);
                }
                C0853we c0853we = this.f5242f;
                if (c0853we != null) {
                    cursor2.unregisterDataSetObserver(c0853we);
                }
            }
            this.f5239c = cursor;
            if (cursor != null) {
                C0815ve c0815ve2 = this.f5241e;
                if (c0815ve2 != null) {
                    cursor.registerContentObserver(c0815ve2);
                }
                C0853we c0853we2 = this.f5242f;
                if (c0853we2 != null) {
                    cursor.registerDataSetObserver(c0853we2);
                }
                this.f5240d = cursor.getColumnIndexOrThrow("_id");
                this.f5237a = true;
                notifyDataSetChanged();
            } else {
                this.f5240d = -1;
                this.f5237a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo1740c(Cursor cursor);

    /* JADX INFO: renamed from: d */
    public abstract View mo1741d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f5237a || (cursor = this.f5239c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f5237a) {
            return null;
        }
        this.f5239c.moveToPosition(i);
        if (view == null) {
            l50 l50Var = (l50) this;
            view = l50Var.f2923j.inflate(l50Var.f2922i, viewGroup, false);
        }
        mo1738a(view, this.f5239c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f5243g == null) {
            C0927ye c0927ye = new C0927ye();
            c0927ye.f5428a = this;
            this.f5243g = c0927ye;
        }
        return this.f5243g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f5237a || (cursor = this.f5239c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f5239c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f5237a && (cursor = this.f5239c) != null && cursor.moveToPosition(i)) {
            return this.f5239c.getLong(this.f5240d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f5237a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f5239c.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        if (view == null) {
            view = mo1741d(viewGroup);
        }
        mo1738a(view, this.f5239c);
        return view;
    }
}
