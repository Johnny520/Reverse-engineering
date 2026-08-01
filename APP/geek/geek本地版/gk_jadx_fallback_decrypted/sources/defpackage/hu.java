package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hu extends android.widget.BaseAdapter {
    public final defpackage.ku a;
    public int b;
    public boolean c;
    public final boolean d;
    public final android.view.LayoutInflater e;
    public final int f;

    public hu(defpackage.ku r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.b = r0
            r1.d = r4
            r1.e = r3
            r1.a = r2
            r1.f = r5
            r1.a()
            return
    }

    public final void a() {
            r5 = this;
            ku r0 = r5.a
            ou r1 = r0.v
            if (r1 == 0) goto L20
            r0.i()
            java.util.ArrayList r0 = r0.j
            int r2 = r0.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L20
            java.lang.Object r4 = r0.get(r3)
            ou r4 = (defpackage.ou) r4
            if (r4 != r1) goto L1d
            r5.b = r3
            return
        L1d:
            int r3 = r3 + 1
            goto L10
        L20:
            r0 = -1
            r5.b = r0
            return
    }

    public final defpackage.ou b(int r3) {
            r2 = this;
            boolean r0 = r2.d
            ku r1 = r2.a
            if (r0 == 0) goto Lc
            r1.i()
            java.util.ArrayList r0 = r1.j
            goto L10
        Lc:
            java.util.ArrayList r0 = r1.l()
        L10:
            int r1 = r2.b
            if (r1 < 0) goto L18
            if (r3 < r1) goto L18
            int r3 = r3 + 1
        L18:
            java.lang.Object r3 = r0.get(r3)
            ou r3 = (defpackage.ou) r3
            return r3
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r2 = this;
            boolean r0 = r2.d
            ku r1 = r2.a
            if (r0 == 0) goto Lc
            r1.i()
            java.util.ArrayList r0 = r1.j
            goto L10
        Lc:
            java.util.ArrayList r0 = r1.l()
        L10:
            int r1 = r2.b
            if (r1 >= 0) goto L19
            int r0 = r0.size()
            return r0
        L19:
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            ou r1 = r0.b(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto Lb
            android.view.LayoutInflater r7 = r5.e
            int r1 = r5.f
            android.view.View r7 = r7.inflate(r1, r8, r0)
        Lb:
            ou r8 = r5.b(r6)
            int r8 = r8.b
            int r1 = r6 + (-1)
            if (r1 < 0) goto L1c
            ou r1 = r5.b(r1)
            int r1 = r1.b
            goto L1d
        L1c:
            r1 = r8
        L1d:
            r2 = r7
            androidx.appcompat.view.menu.ListMenuItemView r2 = (androidx.appcompat.view.menu.ListMenuItemView) r2
            ku r3 = r5.a
            boolean r3 = r3.m()
            r4 = 1
            if (r3 == 0) goto L2c
            if (r8 == r1) goto L2c
            r0 = r4
        L2c:
            r2.setGroupDividerEnabled(r0)
            r8 = r7
            ev r8 = (defpackage.ev) r8
            boolean r0 = r5.c
            if (r0 == 0) goto L39
            r2.setForceShowIcon(r4)
        L39:
            ou r6 = r5.b(r6)
            r8.c(r6)
            return r7
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r0 = this;
            r0.a()
            super.notifyDataSetChanged()
            return
    }
}
