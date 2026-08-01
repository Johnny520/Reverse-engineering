package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class we extends android.widget.BaseAdapter implements android.widget.Filterable {
    public boolean a;
    public boolean b;
    public android.database.Cursor c;
    public int d;
    public defpackage.ue e;
    public defpackage.ve f;
    public defpackage.xe g;

    public abstract void a(android.view.View r1, android.database.Cursor r2);

    public void b(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.c
            if (r3 != r0) goto L6
            r0 = 0
            goto L40
        L6:
            if (r0 == 0) goto L16
            ue r1 = r2.e
            if (r1 == 0) goto Lf
            r0.unregisterContentObserver(r1)
        Lf:
            ve r1 = r2.f
            if (r1 == 0) goto L16
            r0.unregisterDataSetObserver(r1)
        L16:
            r2.c = r3
            if (r3 == 0) goto L37
            ue r1 = r2.e
            if (r1 == 0) goto L21
            r3.registerContentObserver(r1)
        L21:
            ve r1 = r2.f
            if (r1 == 0) goto L28
            r3.registerDataSetObserver(r1)
        L28:
            java.lang.String r1 = "_id"
            int r3 = r3.getColumnIndexOrThrow(r1)
            r2.d = r3
            r3 = 1
            r2.a = r3
            r2.notifyDataSetChanged()
            goto L40
        L37:
            r3 = -1
            r2.d = r3
            r3 = 0
            r2.a = r3
            r2.notifyDataSetInvalidated()
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            return
    }

    public abstract java.lang.String c(android.database.Cursor r1);

    public abstract android.view.View d(android.view.ViewGroup r1);

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto Ld
            android.database.Cursor r0 = r1.c
            if (r0 == 0) goto Ld
            int r0 = r0.getCount()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto L1d
            android.database.Cursor r0 = r1.c
            r0.moveToPosition(r2)
            if (r3 != 0) goto L17
            r2 = r1
            e50 r2 = (defpackage.e50) r2
            int r3 = r2.i
            r0 = 0
            android.view.LayoutInflater r2 = r2.j
            android.view.View r3 = r2.inflate(r3, r4, r0)
        L17:
            android.database.Cursor r2 = r1.c
            r1.a(r3, r2)
            return r3
        L1d:
            r2 = 0
            return r2
    }

    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
            r1 = this;
            xe r0 = r1.g
            if (r0 != 0) goto Ld
            xe r0 = new xe
            r0.<init>()
            r0.a = r1
            r1.g = r0
        Ld:
            xe r0 = r1.g
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto Le
            android.database.Cursor r0 = r1.c
            if (r0 == 0) goto Le
            r0.moveToPosition(r2)
            android.database.Cursor r2 = r1.c
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.a
            r1 = 0
            if (r0 == 0) goto L19
            android.database.Cursor r0 = r3.c
            if (r0 == 0) goto L19
            boolean r4 = r0.moveToPosition(r4)
            if (r4 == 0) goto L19
            android.database.Cursor r4 = r3.c
            int r0 = r3.d
            long r0 = r4.getLong(r0)
            return r0
        L19:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto L2c
            android.database.Cursor r0 = r1.c
            boolean r0 = r0.moveToPosition(r2)
            if (r0 == 0) goto L18
            if (r3 != 0) goto L12
            android.view.View r3 = r1.d(r4)
        L12:
            android.database.Cursor r2 = r1.c
            r1.a(r3, r2)
            return r3
        L18:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "couldn't move cursor to position "
            r4.<init>(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L2c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "this should only be called when the cursor is valid"
            r2.<init>(r3)
            throw r2
    }
}
