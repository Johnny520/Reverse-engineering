package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aw extends android.widget.BaseAdapter {
    public static final int d = 0;
    public static final int e = 0;
    public final defpackage.zv a;
    public defpackage.d4 b;
    public final defpackage.c8 c;

    static {
            r0 = 0
            java.util.Calendar r1 = defpackage.u80.c(r0)
            r2 = 4
            int r1 = r1.getMaximum(r2)
            defpackage.aw.d = r1
            java.util.Calendar r1 = defpackage.u80.c(r0)
            r2 = 5
            int r1 = r1.getMaximum(r2)
            java.util.Calendar r0 = defpackage.u80.c(r0)
            r2 = 7
            int r0 = r0.getMaximum(r2)
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            defpackage.aw.e = r0
            return
    }

    public aw(defpackage.zv r1, defpackage.c8 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r1 = 0
            throw r1
    }

    public final int a() {
            r4 = this;
            c8 r0 = r4.c
            int r0 = r0.e
            zv r1 = r4.a
            java.util.Calendar r2 = r1.a
            r3 = 7
            int r3 = r2.get(r3)
            if (r0 <= 0) goto L10
            goto L14
        L10:
            int r0 = r2.getFirstDayOfWeek()
        L14:
            int r3 = r3 - r0
            if (r3 >= 0) goto L1a
            int r0 = r1.d
            int r3 = r3 + r0
        L1a:
            return r3
    }

    public final java.lang.Long b(int r3) {
            r2 = this;
            int r0 = r2.a()
            if (r3 < r0) goto L29
            int r0 = r2.c()
            if (r3 <= r0) goto Ld
            goto L29
        Ld:
            int r0 = r2.a()
            int r3 = r3 - r0
            int r3 = r3 + 1
            zv r0 = r2.a
            java.util.Calendar r0 = r0.a
            java.util.Calendar r0 = defpackage.u80.a(r0)
            r1 = 5
            r0.set(r1, r3)
            long r0 = r0.getTimeInMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L29:
            r3 = 0
            return r3
    }

    public final int c() {
            r2 = this;
            int r0 = r2.a()
            zv r1 = r2.a
            int r1 = r1.e
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            return r0
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            int r0 = defpackage.aw.e
            return r0
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Long r1 = r0.b(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
            r2 = this;
            zv r0 = r2.a
            int r0 = r0.d
            int r3 = r3 / r0
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
            r4 = this;
            android.content.Context r0 = r7.getContext()
            d4 r1 = r4.b
            if (r1 != 0) goto Lf
            d4 r1 = new d4
            r1.<init>(r0)
            r4.b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131492935(0x7f0c0047, float:1.8609336E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            zv r7 = r4.a
            int r2 = r7.e
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.b(r5)
            if (r5 != 0) goto L6c
            goto L6e
        L6c:
            if (r0 != 0) goto L6f
        L6e:
            return r0
        L6f:
            r0.getContext()
            java.util.Calendar r5 = defpackage.u80.b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
            r1 = this;
            r0 = 1
            return r0
    }
}
