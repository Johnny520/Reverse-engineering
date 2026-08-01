package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cr extends android.widget.BaseAdapter {
    public int a;
    public final /* synthetic */ defpackage.dr b;

    public cr(defpackage.dr r1) {
            r0 = this;
            r0.b = r1
            r0.<init>()
            r1 = -1
            r0.a = r1
            r0.a()
            return
    }

    public final void a() {
            r5 = this;
            dr r0 = r5.b
            ku r0 = r0.c
            ou r1 = r0.v
            if (r1 == 0) goto L22
            r0.i()
            java.util.ArrayList r0 = r0.j
            int r2 = r0.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto L22
            java.lang.Object r4 = r0.get(r3)
            ou r4 = (defpackage.ou) r4
            if (r4 != r1) goto L1f
            r5.a = r3
            return
        L1f:
            int r3 = r3 + 1
            goto L12
        L22:
            r0 = -1
            r5.a = r0
            return
    }

    public final defpackage.ou b(int r3) {
            r2 = this;
            dr r0 = r2.b
            ku r1 = r0.c
            r1.i()
            java.util.ArrayList r1 = r1.j
            r0.getClass()
            int r0 = r2.a
            if (r0 < 0) goto L14
            if (r3 < r0) goto L14
            int r3 = r3 + 1
        L14:
            java.lang.Object r3 = r1.get(r3)
            ou r3 = (defpackage.ou) r3
            return r3
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r2 = this;
            dr r0 = r2.b
            ku r1 = r0.c
            r1.i()
            java.util.ArrayList r1 = r1.j
            int r1 = r1.size()
            r0.getClass()
            int r0 = r2.a
            if (r0 >= 0) goto L15
            return r1
        L15:
            int r1 = r1 + (-1)
            return r1
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
    public final android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            if (r4 != 0) goto Le
            dr r4 = r2.b
            android.view.LayoutInflater r4 = r4.b
            r0 = 2131492880(0x7f0c0010, float:1.8609224E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
        Le:
            r5 = r4
            ev r5 = (defpackage.ev) r5
            ou r3 = r2.b(r3)
            r5.c(r3)
            return r4
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r0 = this;
            r0.a()
            super.notifyDataSetChanged()
            return
    }
}
