package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ge extends android.view.ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f105a;
    public final a.P b;

    public static class a implements a.P.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.ActionMode.Callback f106a;
        public final android.content.Context b;
        public final java.util.ArrayList<a.Ge> c;
        public final a.C0162ge<android.view.Menu, android.view.Menu> d;

        public a(android.content.Context r1, android.view.ActionMode.Callback r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.f106a = r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.c = r1
                a.ge r1 = new a.ge
                r1.<init>()
                r0.d = r1
                return
        }

        @Override // a.P.a
        public final boolean a(a.P r4, androidx.appcompat.view.menu.f r5) {
                r3 = this;
                a.Ge r4 = r3.e(r4)
                a.ge<android.view.Menu, android.view.Menu> r0 = r3.d
                r1 = 0
                java.lang.Object r1 = r0.getOrDefault(r5, r1)
                android.view.Menu r1 = (android.view.Menu) r1
                if (r1 != 0) goto L19
                a.hb r1 = new a.hb
                android.content.Context r2 = r3.b
                r1.<init>(r2, r5)
                r0.put(r5, r1)
            L19:
                android.view.ActionMode$Callback r5 = r3.f106a
                boolean r4 = r5.onCreateActionMode(r4, r1)
                return r4
        }

        @Override // a.P.a
        public final void b(a.P r2) {
                r1 = this;
                a.Ge r2 = r1.e(r2)
                android.view.ActionMode$Callback r0 = r1.f106a
                r0.onDestroyActionMode(r2)
                return
        }

        @Override // a.P.a
        public final boolean c(a.P r4, androidx.appcompat.view.menu.f r5) {
                r3 = this;
                a.Ge r4 = r3.e(r4)
                a.ge<android.view.Menu, android.view.Menu> r0 = r3.d
                r1 = 0
                java.lang.Object r1 = r0.getOrDefault(r5, r1)
                android.view.Menu r1 = (android.view.Menu) r1
                if (r1 != 0) goto L19
                a.hb r1 = new a.hb
                android.content.Context r2 = r3.b
                r1.<init>(r2, r5)
                r0.put(r5, r1)
            L19:
                android.view.ActionMode$Callback r5 = r3.f106a
                boolean r4 = r5.onPrepareActionMode(r4, r1)
                return r4
        }

        @Override // a.P.a
        public final boolean d(a.P r3, android.view.MenuItem r4) {
                r2 = this;
                a.Ge r3 = r2.e(r3)
                a.db r0 = new a.db
                android.content.Context r1 = r2.b
                a.Je r4 = (a.Je) r4
                r0.<init>(r1, r4)
                android.view.ActionMode$Callback r4 = r2.f106a
                boolean r3 = r4.onActionItemClicked(r3, r0)
                return r3
        }

        public final a.Ge e(a.P r6) {
                r5 = this;
                java.util.ArrayList<a.Ge> r0 = r5.c
                int r1 = r0.size()
                r2 = 0
            L7:
                if (r2 >= r1) goto L19
                java.lang.Object r3 = r0.get(r2)
                a.Ge r3 = (a.Ge) r3
                if (r3 == 0) goto L16
                a.P r4 = r3.b
                if (r4 != r6) goto L16
                return r3
            L16:
                int r2 = r2 + 1
                goto L7
            L19:
                a.Ge r1 = new a.Ge
                android.content.Context r2 = r5.b
                r1.<init>(r2, r6)
                r0.add(r1)
                return r1
        }
    }

    public Ge(android.content.Context r1, a.P r2) {
            r0 = this;
            r0.<init>()
            r0.f105a = r1
            r0.b = r2
            return
    }

    @Override // android.view.ActionMode
    public final void finish() {
            r1 = this;
            a.P r0 = r1.b
            r0.c()
            return
    }

    @Override // android.view.ActionMode
    public final android.view.View getCustomView() {
            r1 = this;
            a.P r0 = r1.b
            android.view.View r0 = r0.d()
            return r0
    }

    @Override // android.view.ActionMode
    public final android.view.Menu getMenu() {
            r3 = this;
            a.hb r0 = new a.hb
            a.P r1 = r3.b
            androidx.appcompat.view.menu.f r1 = r1.e()
            android.content.Context r2 = r3.f105a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.view.ActionMode
    public final android.view.MenuInflater getMenuInflater() {
            r1 = this;
            a.P r0 = r1.b
            android.view.MenuInflater r0 = r0.f()
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getSubtitle() {
            r1 = this;
            a.P r0 = r1.b
            java.lang.CharSequence r0 = r0.g()
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.Object getTag() {
            r1 = this;
            a.P r0 = r1.b
            java.lang.Object r0 = r0.f203a
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getTitle() {
            r1 = this;
            a.P r0 = r1.b
            java.lang.CharSequence r0 = r0.h()
            return r0
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
            r1 = this;
            a.P r0 = r1.b
            boolean r0 = r0.b
            return r0
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
            r1 = this;
            a.P r0 = r1.b
            r0.i()
            return
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
            r1 = this;
            a.P r0 = r1.b
            boolean r0 = r0.j()
            return r0
    }

    @Override // android.view.ActionMode
    public final void setCustomView(android.view.View r2) {
            r1 = this;
            a.P r0 = r1.b
            r0.k(r2)
            return
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int r2) {
            r1 = this;
            a.P r0 = r1.b
            r0.l(r2)
            return
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            a.P r0 = r1.b
            r0.m(r2)
            return
    }

    @Override // android.view.ActionMode
    public final void setTag(java.lang.Object r2) {
            r1 = this;
            a.P r0 = r1.b
            r0.f203a = r2
            return
    }

    @Override // android.view.ActionMode
    public final void setTitle(int r2) {
            r1 = this;
            a.P r0 = r1.b
            r0.n(r2)
            return
    }

    @Override // android.view.ActionMode
    public final void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            a.P r0 = r1.b
            r0.o(r2)
            return
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean r2) {
            r1 = this;
            a.P r0 = r1.b
            r0.p(r2)
            return
    }
}
