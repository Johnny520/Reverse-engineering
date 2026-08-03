package a;

/* JADX INFO: renamed from: a.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0358re extends a.P implements androidx.appcompat.view.menu.f.a {
    public android.content.Context c;
    public androidx.appcompat.widget.ActionBarContextView d;
    public a.Q0.d e;
    public java.lang.ref.WeakReference<android.view.View> f;
    public boolean g;
    public androidx.appcompat.view.menu.f h;

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f r1, android.view.MenuItem r2) {
            r0 = this;
            a.Q0$d r1 = r0.e
            a.P$a r1 = r1.f217a
            boolean r1 = r1.d(r0, r2)
            return r1
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f r1) {
            r0 = this;
            r0.i()
            androidx.appcompat.widget.ActionBarContextView r1 = r0.d
            androidx.appcompat.widget.a r1 = r1.d
            if (r1 == 0) goto Lc
            r1.l()
        Lc:
            return
    }

    @Override // a.P
    public final void c() {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.g = r0
            a.Q0$d r0 = r1.e
            r0.b(r1)
            return
    }

    @Override // a.P
    public final android.view.View d() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // a.P
    public final androidx.appcompat.view.menu.f e() {
            r1 = this;
            androidx.appcompat.view.menu.f r0 = r1.h
            return r0
    }

    @Override // a.P
    public final android.view.MenuInflater f() {
            r2 = this;
            a.Ie r0 = new a.Ie
            androidx.appcompat.widget.ActionBarContextView r1 = r2.d
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    @Override // a.P
    public final java.lang.CharSequence g() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // a.P
    public final java.lang.CharSequence h() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // a.P
    public final void i() {
            r2 = this;
            androidx.appcompat.view.menu.f r0 = r2.h
            a.Q0$d r1 = r2.e
            r1.c(r2, r0)
            return
    }

    @Override // a.P
    public final boolean j() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            boolean r0 = r0.s
            return r0
    }

    @Override // a.P
    public final void k(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            r0.setCustomView(r2)
            if (r2 == 0) goto Ld
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.f = r0
            return
    }

    @Override // a.P
    public final void l(int r2) {
            r1 = this;
            android.content.Context r0 = r1.c
            java.lang.String r2 = r0.getString(r2)
            r1.m(r2)
            return
    }

    @Override // a.P
    public final void m(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            r0.setSubtitle(r2)
            return
    }

    @Override // a.P
    public final void n(int r2) {
            r1 = this;
            android.content.Context r0 = r1.c
            java.lang.String r2 = r0.getString(r2)
            r1.o(r2)
            return
    }

    @Override // a.P
    public final void o(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            r0.setTitle(r2)
            return
    }

    @Override // a.P
    public final void p(boolean r2) {
            r1 = this;
            r1.b = r2
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            r0.setTitleOptional(r2)
            return
    }
}
