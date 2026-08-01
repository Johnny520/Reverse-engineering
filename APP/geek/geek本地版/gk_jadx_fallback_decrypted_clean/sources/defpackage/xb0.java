package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 extends defpackage.n1 implements defpackage.iu {
    public final android.content.Context c;
    public final defpackage.ku d;
    public defpackage.d4 e;
    public java.lang.ref.WeakReference f;
    public final /* synthetic */ defpackage.yb0 g;

    public xb0(defpackage.yb0 r1, android.content.Context r2, defpackage.d4 r3) {
            r0 = this;
            r0.<init>()
            r0.g = r1
            r0.c = r2
            r0.e = r3
            ku r1 = new ku
            r1.<init>(r2)
            r2 = 1
            r1.l = r2
            r0.d = r1
            r1.e = r0
            return
    }

    @Override // defpackage.n1
    public final void a() {
            r4 = this;
            yb0 r0 = r4.g
            xb0 r1 = r0.E
            if (r1 == r4) goto L7
            return
        L7:
            boolean r1 = r0.L
            if (r1 == 0) goto L12
            r0.F = r4
            d4 r1 = r4.e
            r0.G = r1
            goto L17
        L12:
            d4 r1 = r4.e
            r1.D(r4)
        L17:
            r1 = 0
            r4.e = r1
            r2 = 0
            r0.K(r2)
            androidx.appcompat.widget.ActionBarContextView r2 = r0.B
            android.view.View r3 = r2.k
            if (r3 != 0) goto L27
            r2.e()
        L27:
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r0.y
            boolean r3 = r0.Q
            r2.setHideOnContentScrollEnabled(r3)
            r0.E = r1
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
            ku r0 = r1.d
            return r0
    }

    @Override // defpackage.n1
    public final android.view.MenuInflater d() {
            r2 = this;
            k50 r0 = new k50
            android.content.Context r1 = r2.c
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.n1
    public final java.lang.CharSequence e() {
            r1 = this;
            yb0 r0 = r1.g
            androidx.appcompat.widget.ActionBarContextView r0 = r0.B
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // defpackage.n1
    public final java.lang.CharSequence f() {
            r1 = this;
            yb0 r0 = r1.g
            androidx.appcompat.widget.ActionBarContextView r0 = r0.B
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // defpackage.n1
    public final void g() {
            r2 = this;
            yb0 r0 = r2.g
            xb0 r0 = r0.E
            if (r0 == r2) goto L7
            return
        L7:
            ku r0 = r2.d
            r0.w()
            d4 r1 = r2.e     // Catch: java.lang.Throwable -> L15
            r1.E(r2, r0)     // Catch: java.lang.Throwable -> L15
            r0.v()
            return
        L15:
            r1 = move-exception
            r0.v()
            throw r1
    }

    @Override // defpackage.n1
    public final boolean h() {
            r1 = this;
            yb0 r0 = r1.g
            androidx.appcompat.widget.ActionBarContextView r0 = r0.B
            boolean r0 = r0.s
            return r0
    }

    @Override // defpackage.n1
    public final void i(android.view.View r2) {
            r1 = this;
            yb0 r0 = r1.g
            androidx.appcompat.widget.ActionBarContextView r0 = r0.B
            r0.setCustomView(r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f = r0
            return
    }

    @Override // defpackage.n1
    public final void j(int r2) {
            r1 = this;
            yb0 r0 = r1.g
            android.content.Context r0 = r0.w
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.l(r2)
            return
    }

    @Override // defpackage.iu
    public final void k(defpackage.ku r1) {
            r0 = this;
            d4 r1 = r0.e
            if (r1 != 0) goto L5
            goto L13
        L5:
            r0.g()
            yb0 r1 = r0.g
            androidx.appcompat.widget.ActionBarContextView r1 = r1.B
            j1 r1 = r1.d
            if (r1 == 0) goto L13
            r1.l()
        L13:
            return
    }

    @Override // defpackage.n1
    public final void l(java.lang.CharSequence r2) {
            r1 = this;
            yb0 r0 = r1.g
            androidx.appcompat.widget.ActionBarContextView r0 = r0.B
            r0.setSubtitle(r2)
            return
    }

    @Override // defpackage.n1
    public final void m(int r2) {
            r1 = this;
            yb0 r0 = r1.g
            android.content.Context r0 = r0.w
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.o(r2)
            return
    }

    @Override // defpackage.iu
    public final boolean n(defpackage.ku r1, android.view.MenuItem r2) {
            r0 = this;
            d4 r1 = r0.e
            if (r1 == 0) goto Ld
            java.lang.Object r1 = r1.b
            a8 r1 = (defpackage.a8) r1
            boolean r1 = r1.c(r0, r2)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // defpackage.n1
    public final void o(java.lang.CharSequence r2) {
            r1 = this;
            yb0 r0 = r1.g
            androidx.appcompat.widget.ActionBarContextView r0 = r0.B
            r0.setTitle(r2)
            return
    }

    @Override // defpackage.n1
    public final void p(boolean r2) {
            r1 = this;
            r1.b = r2
            yb0 r0 = r1.g
            androidx.appcompat.widget.ActionBarContextView r0 = r0.B
            r0.setTitleOptional(r2)
            return
    }
}
