package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dr implements defpackage.dv, android.widget.AdapterView.OnItemClickListener {
    public android.content.Context a;
    public android.view.LayoutInflater b;
    public defpackage.ku c;
    public androidx.appcompat.view.menu.ExpandedMenuView d;
    public defpackage.cv e;
    public defpackage.cr f;

    public dr(android.content.ContextWrapper r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.b = r1
            return
    }

    @Override // defpackage.dv
    public final void a(defpackage.ku r2, boolean r3) {
            r1 = this;
            cv r0 = r1.e
            if (r0 == 0) goto L7
            r0.a(r2, r3)
        L7:
            return
    }

    @Override // defpackage.dv
    public final boolean c() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.dv
    public final boolean d(defpackage.ou r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.dv
    public final void e(defpackage.cv r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.dv
    public final boolean g(defpackage.ou r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.dv
    public final void h() {
            r1 = this;
            cr r0 = r1.f
            if (r0 == 0) goto L7
            r0.notifyDataSetChanged()
        L7:
            return
    }

    @Override // defpackage.dv
    public final void i(android.content.Context r2, defpackage.ku r3) {
            r1 = this;
            android.content.Context r0 = r1.a
            if (r0 == 0) goto L10
            r1.a = r2
            android.view.LayoutInflater r0 = r1.b
            if (r0 != 0) goto L10
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.b = r2
        L10:
            r1.c = r3
            cr r2 = r1.f
            if (r2 == 0) goto L19
            r2.notifyDataSetChanged()
        L19:
            return
    }

    @Override // defpackage.dv
    public final boolean k(defpackage.c50 r7) {
            r6 = this;
            boolean r0 = r7.hasVisibleItems()
            android.content.Context r1 = r7.a
            if (r0 != 0) goto La
            r7 = 0
            return r7
        La:
            lu r0 = new lu
            r0.<init>()
            r0.a = r7
            f2 r2 = new f2
            r2.<init>(r1)
            dr r3 = new dr
            java.lang.Object r4 = r2.b
            b2 r4 = (defpackage.b2) r4
            android.view.ContextThemeWrapper r5 = r4.a
            r3.<init>(r5)
            r0.c = r3
            r3.e = r0
            r7.b(r3, r1)
            dr r1 = r0.c
            cr r3 = r1.f
            if (r3 != 0) goto L35
            cr r3 = new cr
            r3.<init>(r1)
            r1.f = r3
        L35:
            cr r1 = r1.f
            r4.g = r1
            r4.h = r0
            android.view.View r1 = r7.o
            if (r1 == 0) goto L42
            r4.e = r1
            goto L4a
        L42:
            android.graphics.drawable.Drawable r1 = r7.n
            r4.c = r1
            java.lang.CharSequence r1 = r7.m
            r4.d = r1
        L4a:
            r4.f = r0
            g2 r1 = r2.a()
            r0.b = r1
            r1.setOnDismissListener(r0)
            g2 r1 = r0.b
            android.view.Window r1 = r1.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r2 = 1003(0x3eb, float:1.406E-42)
            r1.type = r2
            int r2 = r1.flags
            r3 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r3
            r1.flags = r2
            g2 r0 = r0.b
            r0.show()
            cv r0 = r6.e
            if (r0 == 0) goto L76
            r0.q(r7)
        L76:
            r7 = 1
            return r7
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            ku r1 = r0.c
            cr r2 = r0.f
            ou r2 = r2.b(r3)
            r3 = 0
            r1.q(r2, r0, r3)
            return
    }
}
