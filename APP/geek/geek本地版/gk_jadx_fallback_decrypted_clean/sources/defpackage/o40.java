package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o40 extends defpackage.n1 implements defpackage.iu {
    public android.content.Context c;
    public androidx.appcompat.widget.ActionBarContextView d;
    public defpackage.d4 e;
    public java.lang.ref.WeakReference f;
    public boolean g;
    public defpackage.ku h;

    @Override // defpackage.n1
    public final void a() {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.g = r0
            d4 r0 = r1.e
            r0.D(r1)
            return
    }

    @Override // defpackage.n1
    public final android.view.View b() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.f
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // defpackage.n1
    public final defpackage.ku c() {
            r1 = this;
            ku r0 = r1.h
            return r0
    }

    @Override // defpackage.n1
    public final android.view.MenuInflater d() {
            r2 = this;
            k50 r0 = new k50
            androidx.appcompat.widget.ActionBarContextView r1 = r2.d
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.n1
    public final java.lang.CharSequence e() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // defpackage.n1
    public final java.lang.CharSequence f() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // defpackage.n1
    public final void g() {
            r2 = this;
            d4 r0 = r2.e
            ku r1 = r2.h
            r0.E(r2, r1)
            return
    }

    @Override // defpackage.n1
    public final boolean h() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            boolean r0 = r0.s
            return r0
    }

    @Override // defpackage.n1
    public final void i(android.view.View r2) {
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

    @Override // defpackage.n1
    public final void j(int r2) {
            r1 = this;
            android.content.Context r0 = r1.c
            java.lang.String r2 = r0.getString(r2)
            r1.l(r2)
            return
    }

    @Override // defpackage.iu
    public final void k(defpackage.ku r1) {
            r0 = this;
            r0.g()
            androidx.appcompat.widget.ActionBarContextView r1 = r0.d
            j1 r1 = r1.d
            if (r1 == 0) goto Lc
            r1.l()
        Lc:
            return
    }

    @Override // defpackage.n1
    public final void l(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            r0.setSubtitle(r2)
            return
    }

    @Override // defpackage.n1
    public final void m(int r2) {
            r1 = this;
            android.content.Context r0 = r1.c
            java.lang.String r2 = r0.getString(r2)
            r1.o(r2)
            return
    }

    @Override // defpackage.iu
    public final boolean n(defpackage.ku r1, android.view.MenuItem r2) {
            r0 = this;
            d4 r1 = r0.e
            java.lang.Object r1 = r1.b
            a8 r1 = (defpackage.a8) r1
            boolean r1 = r1.c(r0, r2)
            return r1
    }

    @Override // defpackage.n1
    public final void o(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            r0.setTitle(r2)
            return
    }

    @Override // defpackage.n1
    public final void p(boolean r2) {
            r1 = this;
            r1.b = r2
            androidx.appcompat.widget.ActionBarContextView r0 = r1.d
            r0.setTitleOptional(r2)
            return
    }
}
