package p008E;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p022L.AbstractC0174d;
import p069i.ViewOnClickListenerC0667c1;

/* JADX INFO: renamed from: E.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0099c extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: b */
    public boolean f386b;

    /* JADX INFO: renamed from: c */
    public boolean f387c;

    /* JADX INFO: renamed from: d */
    public Cursor f388d;

    /* JADX INFO: renamed from: e */
    public int f389e;

    /* JADX INFO: renamed from: f */
    public C0097a f390f;

    /* JADX INFO: renamed from: g */
    public C0098b f391g;

    /* JADX INFO: renamed from: h */
    public C0100d f392h;

    /* JADX INFO: renamed from: a */
    public abstract void mo242a(View view, Cursor cursor);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo243b(Cursor cursor) {
        Cursor cursor2 = this.f388d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0097a c0097a = this.f390f;
                if (c0097a != null) {
                    cursor2.unregisterContentObserver(c0097a);
                }
                C0098b c0098b = this.f391g;
                if (c0098b != null) {
                    cursor2.unregisterDataSetObserver(c0098b);
                }
            }
            this.f388d = cursor;
            if (cursor != null) {
                C0097a c0097a2 = this.f390f;
                if (c0097a2 != null) {
                    cursor.registerContentObserver(c0097a2);
                }
                C0098b c0098b2 = this.f391g;
                if (c0098b2 != null) {
                    cursor.registerDataSetObserver(c0098b2);
                }
                this.f389e = cursor.getColumnIndexOrThrow("_id");
                this.f386b = true;
                notifyDataSetChanged();
            } else {
                this.f389e = -1;
                this.f386b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo244c(Cursor cursor);

    /* JADX INFO: renamed from: d */
    public abstract View mo245d(ViewGroup viewGroup);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f386b || (cursor = this.f388d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f386b) {
            return null;
        }
        this.f388d.moveToPosition(i2);
        if (view == null) {
            ViewOnClickListenerC0667c1 viewOnClickListenerC0667c1 = (ViewOnClickListenerC0667c1) this;
            view = viewOnClickListenerC0667c1.f2257k.inflate(viewOnClickListenerC0667c1.f2256j, viewGroup, false);
        }
        mo242a(view, this.f388d);
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f392h == null) {
            C0100d c0100d = new C0100d();
            c0100d.f393a = this;
            this.f392h = c0100d;
        }
        return this.f392h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f386b || (cursor = this.f388d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f388d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f386b && (cursor = this.f388d) != null && cursor.moveToPosition(i2)) {
            return this.f388d.getLong(this.f389e);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f386b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f388d.moveToPosition(i2)) {
            throw new IllegalStateException(AbstractC0174d.m351g(i2, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = mo245d(viewGroup);
        }
        mo242a(view, this.f388d);
        return view;
    }
}
