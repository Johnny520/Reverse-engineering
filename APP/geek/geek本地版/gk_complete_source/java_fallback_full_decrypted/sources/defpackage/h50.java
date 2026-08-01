package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h50 extends android.view.ActionMode {
    public final android.content.Context a;
    public final defpackage.n1 b;

    public h50(android.content.Context r1, defpackage.n1 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // android.view.ActionMode
    public final void finish() {
            r1 = this;
            n1 r0 = r1.b
            r0.a()
            return
    }

    @Override // android.view.ActionMode
    public final android.view.View getCustomView() {
            r1 = this;
            n1 r0 = r1.b
            android.view.View r0 = r0.b()
            return r0
    }

    @Override // android.view.ActionMode
    public final android.view.Menu getMenu() {
            r3 = this;
            gv r0 = new gv
            n1 r1 = r3.b
            ku r1 = r1.c()
            android.content.Context r2 = r3.a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.view.ActionMode
    public final android.view.MenuInflater getMenuInflater() {
            r1 = this;
            n1 r0 = r1.b
            android.view.MenuInflater r0 = r0.d()
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getSubtitle() {
            r1 = this;
            n1 r0 = r1.b
            java.lang.CharSequence r0 = r0.e()
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.Object getTag() {
            r1 = this;
            n1 r0 = r1.b
            java.lang.Object r0 = r0.a
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getTitle() {
            r1 = this;
            n1 r0 = r1.b
            java.lang.CharSequence r0 = r0.f()
            return r0
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
            r1 = this;
            n1 r0 = r1.b
            boolean r0 = r0.b
            return r0
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
            r1 = this;
            n1 r0 = r1.b
            r0.g()
            return
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
            r1 = this;
            n1 r0 = r1.b
            boolean r0 = r0.h()
            return r0
    }

    @Override // android.view.ActionMode
    public final void setCustomView(android.view.View r2) {
            r1 = this;
            n1 r0 = r1.b
            r0.i(r2)
            return
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int r2) {
            r1 = this;
            n1 r0 = r1.b
            r0.j(r2)
            return
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            n1 r0 = r1.b
            r0.l(r2)
            return
    }

    @Override // android.view.ActionMode
    public final void setTag(java.lang.Object r2) {
            r1 = this;
            n1 r0 = r1.b
            r0.a = r2
            return
    }

    @Override // android.view.ActionMode
    public final void setTitle(int r2) {
            r1 = this;
            n1 r0 = r1.b
            r0.m(r2)
            return
    }

    @Override // android.view.ActionMode
    public final void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            n1 r0 = r1.b
            r0.o(r2)
            return
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean r2) {
            r1 = this;
            n1 r0 = r1.b
            r0.p(r2)
            return
    }
}
