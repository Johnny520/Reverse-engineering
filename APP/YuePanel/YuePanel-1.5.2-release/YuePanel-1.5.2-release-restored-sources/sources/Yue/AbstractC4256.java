package Yue;

import Yue.C4257;
import Yue.InterfaceC7144;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4256 extends BaseAdapter implements Filterable, C4257.InterfaceC0371 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @Deprecated
    public static final int f8741 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f8742 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean f8743;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean f8744;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public Cursor f8745;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public Context f8746;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public int f8747;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public C0369 f8748;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public DataSetObserver f8749;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public C4257 f8750;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public FilterQueryProvider f8751;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۨۧ$ۥ */
    public class C0369 extends ContentObserver {
        public C0369() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC4256.this.m12287();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۨۧ$ۥ۟ */
    public class C0370 extends DataSetObserver {
        public C0370() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC4256 abstractC4256 = AbstractC4256.this;
            abstractC4256.f8743 = true;
            abstractC4256.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC4256 abstractC4256 = AbstractC4256.this;
            abstractC4256.f8743 = false;
            abstractC4256.notifyDataSetInvalidated();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public AbstractC4256(Context context, Cursor cursor) {
        m12283(context, cursor, 1);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f8743 || (cursor = this.f8745) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // Yue.C4257.InterfaceC0371
    public Cursor getCursor() {
        return this.f8745;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f8743) {
            return null;
        }
        this.f8745.moveToPosition(i);
        if (view == null) {
            view = mo12285(this.f8746, this.f8745, viewGroup);
        }
        mo12281(view, this.f8746, this.f8745);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f8750 == null) {
            this.f8750 = new C4257(this);
        }
        return this.f8750;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f8743 || (cursor = this.f8745) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f8745;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f8743 && (cursor = this.f8745) != null && cursor.moveToPosition(i)) {
            return this.f8745.getLong(this.f8747);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f8743) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f8745.moveToPosition(i)) {
            if (view == null) {
                view = mo12286(this.f8746, this.f8745, viewGroup);
            }
            mo12281(view, this.f8746, this.f8745);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // Yue.C4257.InterfaceC0371
    /* JADX INFO: renamed from: ۥ */
    public CharSequence mo1220(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // Yue.C4257.InterfaceC0371
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1221(Cursor cursor) {
        Cursor cursorMo12289 = mo12289(cursor);
        if (cursorMo12289 != null) {
            cursorMo12289.close();
        }
    }

    @Override // Yue.C4257.InterfaceC0371
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Cursor mo12280(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f8751;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f8745;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract void mo12281(View view, Context context, Cursor cursor);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public FilterQueryProvider m12282() {
        return this.f8751;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m12283(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f8744 = true;
        } else {
            this.f8744 = false;
        }
        boolean z = cursor != null;
        this.f8745 = cursor;
        this.f8743 = z;
        this.f8746 = context;
        this.f8747 = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f8748 = new C0369();
            this.f8749 = new C0370();
        } else {
            this.f8748 = null;
            this.f8749 = null;
        }
        if (z) {
            C0369 c0369 = this.f8748;
            if (c0369 != null) {
                cursor.registerContentObserver(c0369);
            }
            DataSetObserver dataSetObserver = this.f8749;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m12284(Context context, Cursor cursor, boolean z) {
        m12283(context, cursor, z ? 1 : 2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public View mo12285(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo12286(context, cursor, viewGroup);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract View mo12286(Context context, Cursor cursor, ViewGroup viewGroup);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m12287() {
        Cursor cursor;
        if (!this.f8744 || (cursor = this.f8745) == null || cursor.isClosed()) {
            return;
        }
        this.f8743 = this.f8745.requery();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m12288(FilterQueryProvider filterQueryProvider) {
        this.f8751 = filterQueryProvider;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Cursor mo12289(Cursor cursor) {
        Cursor cursor2 = this.f8745;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0369 c0369 = this.f8748;
            if (c0369 != null) {
                cursor2.unregisterContentObserver(c0369);
            }
            DataSetObserver dataSetObserver = this.f8749;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f8745 = cursor;
        if (cursor != null) {
            C0369 c03692 = this.f8748;
            if (c03692 != null) {
                cursor.registerContentObserver(c03692);
            }
            DataSetObserver dataSetObserver2 = this.f8749;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f8747 = cursor.getColumnIndexOrThrow("_id");
            this.f8743 = true;
            notifyDataSetChanged();
        } else {
            this.f8747 = -1;
            this.f8743 = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public AbstractC4256(Context context, Cursor cursor, boolean z) {
        m12283(context, cursor, z ? 1 : 2);
    }

    public AbstractC4256(Context context, Cursor cursor, int i) {
        m12283(context, cursor, i);
    }
}
