package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class we extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public ue e;
    public ve f;
    public xe g;

    public abstract void a(View r1, Cursor r2);

    public void b(Cursor r3) {
        Cursor r0 = this.c;
        if (r3 != r0) goto L5;
        r0 = null;
    L22:
        if (r0 == null) goto L25;
        r0.close();
        return;
    L25:
        return;
    L5:
        if (r0 == null) goto L12;
        ue r1 = this.e;
        if (r1 == null) goto L9;
        r0.unregisterContentObserver(r1);
    L9:
        ve r12 = this.f;
        if (r12 == null) goto L12;
        r0.unregisterDataSetObserver(r12);
    L12:
        this.c = r3;
        if (r3 == null) goto L21;
        ue r13 = this.e;
        if (r13 == null) goto L17;
        r3.registerContentObserver(r13);
    L17:
        ve r14 = this.f;
        if (r14 == null) goto L20;
        r3.registerDataSetObserver(r14);
    L20:
        this.d = r3.getColumnIndexOrThrow("_id");
        this.a = true;
        notifyDataSetChanged();
        goto L22
    L21:
        this.d = -1;
        this.a = false;
        notifyDataSetInvalidated();
        goto L22
    }

    public abstract String c(Cursor r1);

    public abstract View d(ViewGroup r1);

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.a == false) goto L8;
        Cursor r0 = this.c;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.getCount();
    L8:
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int r2, View r3, ViewGroup r4) {
        if (this.a == false) goto L9;
        this.c.moveToPosition(r2);
        if (r3 != null) goto L7;
        e50 r22 = (e50) this;
        int r32 = r22.i;
        r3 = r22.j.inflate(r32, r4, false);
    L7:
        a(r3, this.c);
        return r3;
    L9:
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.g != null) goto L6;
        xe r0 = new xe();
        r0.a = this;
        this.g = r0;
    L6:
        return this.g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r2) {
        if (this.a == false) goto L8;
        Cursor r0 = this.c;
        if (r0 == null) goto L10;
        r0.moveToPosition(r2);
        return this.c;
    L10:
        return null;
    L8:
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r4) {
        if (this.a == false) goto L10;
        Cursor r0 = this.c;
        if (r0 == null) goto L10;
        if (r0.moveToPosition(r4) == false) goto L10;
        return this.c.getLong(this.d);
    L10:
        return 0;
    }

    @Override // android.widget.Adapter
    public View getView(int r2, View r3, ViewGroup r4) {
        if (this.a == false) goto L13;
        if (this.c.moveToPosition(r2) == false) goto L11;
        if (r3 != null) goto L8;
        r3 = d(r4);
    L8:
        a(r3, this.c);
        return r3;
    L11:
        throw new IllegalStateException("couldn't move cursor to position " + r2);
    L13:
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
