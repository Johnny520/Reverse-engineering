package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ee extends a.AbstractC0286nd implements android.view.View.OnClickListener {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public static final class a {
    }

    public Ee() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // a.B4
    public final void b(android.view.View r4, android.database.Cursor r5) {
            r3 = this;
            java.lang.Object r4 = r4.getTag()
            a.Ee$a r4 = (a.Ee.a) r4
            int r0 = r3.k
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L10
            int r1 = r5.getInt(r0)
        L10:
            r4.getClass()
            r4 = 2
            r5 = 1
            int r0 = r3.e
            if (r0 == r4) goto L22
            if (r0 != r5) goto L20
            r4 = r1 & 1
            if (r4 == 0) goto L20
            goto L22
        L20:
            r4 = 0
            throw r4
        L22:
            r4 = 0
            throw r4
    }

    @Override // a.B4
    public final void c(android.database.Cursor r3) {
            r2 = this;
            super.c(r3)     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto L3e
            java.lang.String r0 = "suggest_text_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.f = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_text_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.g = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_text_2_url"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.h = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_icon_1"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.i = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_icon_2"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.j = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_flags"
            int r3 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r2.k = r3     // Catch: java.lang.Exception -> L36
            return
        L36:
            r3 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "error changing cursor and caching columns"
            android.util.Log.e(r0, r1, r3)
        L3e:
            return
    }

    public final android.graphics.drawable.Drawable d(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L23
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L23
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L12
            goto L23
        L12:
            java.lang.Integer.parseInt(r3)     // Catch: android.content.res.Resources.NotFoundException -> L16 java.lang.NumberFormatException -> L22
            throw r0
        L16:
            java.lang.String r1 = "Icon resource not found: "
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = "SuggestionsAdapter"
            android.util.Log.w(r1, r3)
            return r0
        L22:
            throw r0
        L23:
            return r0
    }

    @Override // a.B4, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View r1 = super.getDropDownView(r1, r2, r3)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.String r2 = "SuggestionsAdapter"
            java.lang.String r3 = "Search suggestions cursor threw exception."
            android.util.Log.w(r2, r3, r1)
            r1 = 0
            throw r1
    }

    @Override // a.B4, android.widget.Adapter
    public final android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            super.getView(r1, r2, r3)     // Catch: java.lang.RuntimeException -> L4
            return r2
        L4:
            r1 = move-exception
            java.lang.String r2 = "SuggestionsAdapter"
            java.lang.String r3 = "Search suggestions cursor threw exception."
            android.util.Log.w(r2, r3, r1)
            r1 = 0
            throw r1
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r2 = this;
            super.notifyDataSetChanged()
            android.database.Cursor r0 = r2.b
            if (r0 == 0) goto Lc
            android.os.Bundle r0 = r0.getExtras()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L14
            java.lang.String r1 = "in_progress"
            r0.getBoolean(r1)
        L14:
            return
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
            r2 = this;
            super.notifyDataSetInvalidated()
            android.database.Cursor r0 = r2.b
            if (r0 == 0) goto Lc
            android.os.Bundle r0 = r0.getExtras()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L14
            java.lang.String r1 = "in_progress"
            r0.getBoolean(r1)
        L14:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r1) {
            r0 = this;
            java.lang.Object r1 = r1.getTag()
            boolean r1 = r1 instanceof java.lang.CharSequence
            if (r1 != 0) goto L9
            return
        L9:
            r1 = 0
            throw r1
    }
}
