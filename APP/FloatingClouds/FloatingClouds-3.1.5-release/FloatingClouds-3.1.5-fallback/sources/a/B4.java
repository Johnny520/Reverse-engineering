package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class B4 extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24a;
    public android.database.Cursor b;
    public int c;
    public a.C4 d;

    public abstract void b(android.view.View r1, android.database.Cursor r2);

    public void c(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.b
            if (r3 != r0) goto L6
            r0 = 0
            goto L22
        L6:
            r2.b = r3
            if (r3 == 0) goto L19
            java.lang.String r1 = "_id"
            int r3 = r3.getColumnIndexOrThrow(r1)
            r2.c = r3
            r3 = 1
            r2.f24a = r3
            r2.notifyDataSetChanged()
            goto L22
        L19:
            r3 = -1
            r2.c = r3
            r3 = 0
            r2.f24a = r3
            r2.notifyDataSetInvalidated()
        L22:
            if (r0 == 0) goto L27
            r0.close()
        L27:
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            boolean r0 = r1.f24a
            if (r0 == 0) goto Ld
            android.database.Cursor r0 = r1.b
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
            boolean r4 = r1.f24a
            r0 = 0
            if (r4 == 0) goto L13
            android.database.Cursor r4 = r1.b
            r4.moveToPosition(r2)
            if (r3 == 0) goto L12
            android.database.Cursor r2 = r1.b
            r1.b(r3, r2)
            return r3
        L12:
            throw r0
        L13:
            return r0
    }

    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
            r1 = this;
            a.C4 r0 = r1.d
            if (r0 != 0) goto Ld
            a.C4 r0 = new a.C4
            r0.<init>()
            r0.f42a = r1
            r1.d = r0
        Ld:
            a.C4 r0 = r1.d
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.f24a
            if (r0 == 0) goto Le
            android.database.Cursor r0 = r1.b
            if (r0 == 0) goto Le
            r0.moveToPosition(r2)
            android.database.Cursor r2 = r1.b
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.f24a
            r1 = 0
            if (r0 == 0) goto L19
            android.database.Cursor r0 = r3.b
            if (r0 == 0) goto L19
            boolean r4 = r0.moveToPosition(r4)
            if (r4 == 0) goto L19
            android.database.Cursor r4 = r3.b
            int r0 = r3.c
            long r0 = r4.getLong(r0)
            return r0
        L19:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            boolean r3 = r0.f24a
            if (r3 == 0) goto L22
            android.database.Cursor r3 = r0.b
            boolean r3 = r3.moveToPosition(r1)
            if (r3 == 0) goto L16
            if (r2 == 0) goto L14
            android.database.Cursor r1 = r0.b
            r0.b(r2, r1)
            return r2
        L14:
            r1 = 0
            throw r1
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "couldn't move cursor to position "
            java.lang.String r1 = a.C0487z.e(r3, r1)
            r2.<init>(r1)
            throw r2
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "this should only be called when the cursor is valid"
            r1.<init>(r2)
            throw r1
    }
}
