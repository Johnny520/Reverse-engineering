package p000;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: renamed from: we */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0853we extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a */
    public boolean f4956a;

    /* JADX INFO: renamed from: b */
    public boolean f4957b;

    /* JADX INFO: renamed from: c */
    public Cursor f4958c;

    /* JADX INFO: renamed from: d */
    public int f4959d;

    /* JADX INFO: renamed from: e */
    public C0779ue f4960e;

    /* JADX INFO: renamed from: f */
    public C0816ve f4961f;

    /* JADX INFO: renamed from: g */
    public C0890xe f4962g;

    /* JADX INFO: renamed from: a */
    public abstract void mo989a(View view, Cursor cursor);

    /* JADX INFO: renamed from: b */
    public void mo990b(Cursor cursor) {
        Cursor cursor2 = this.f4958c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0779ue c0779ue = this.f4960e;
                if (c0779ue != null) {
                    cursor2.unregisterContentObserver(c0779ue);
                }
                C0816ve c0816ve = this.f4961f;
                if (c0816ve != null) {
                    cursor2.unregisterDataSetObserver(c0816ve);
                }
            }
            this.f4958c = cursor;
            if (cursor != null) {
                C0779ue c0779ue2 = this.f4960e;
                if (c0779ue2 != null) {
                    cursor.registerContentObserver(c0779ue2);
                }
                C0816ve c0816ve2 = this.f4961f;
                if (c0816ve2 != null) {
                    cursor.registerDataSetObserver(c0816ve2);
                }
                this.f4959d = cursor.getColumnIndexOrThrow("_id");
                this.f4956a = true;
                notifyDataSetChanged();
            } else {
                this.f4959d = -1;
                this.f4956a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo991c(Cursor cursor);

    /* JADX INFO: renamed from: d */
    public abstract View mo992d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f4956a || (cursor = this.f4958c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4956a) {
            return null;
        }
        this.f4958c.moveToPosition(i);
        if (view == null) {
            e50 e50Var = (e50) this;
            view = e50Var.f1716j.inflate(e50Var.f1715i, viewGroup, false);
        }
        mo989a(view, this.f4958c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f4962g == null) {
            C0890xe c0890xe = new C0890xe();
            c0890xe.f5158a = this;
            this.f4962g = c0890xe;
        }
        return this.f4962g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f4956a || (cursor = this.f4958c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f4958c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f4956a && (cursor = this.f4958c) != null && cursor.moveToPosition(i)) {
            return this.f4958c.getLong(this.f4959d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4956a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f4958c.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        if (view == null) {
            view = mo992d(viewGroup);
        }
        mo989a(view, this.f4958c);
        return view;
    }
}
