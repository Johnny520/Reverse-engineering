package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.appcompat.view.menu.j, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.content.Context f819a;
    public android.view.LayoutInflater b;
    public androidx.appcompat.view.menu.f c;
    public androidx.appcompat.view.menu.ExpandedMenuView d;
    public final int e;
    public androidx.appcompat.view.menu.j.a f;
    public androidx.appcompat.view.menu.d.a g;

    public class a extends android.widget.BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f820a;
        public final /* synthetic */ androidx.appcompat.view.menu.d b;

        public a(androidx.appcompat.view.menu.d r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r1 = -1
                r0.f820a = r1
                r0.b()
                return
        }

        public final void b() {
                r5 = this;
                androidx.appcompat.view.menu.d r0 = r5.b
                androidx.appcompat.view.menu.f r0 = r0.c
                androidx.appcompat.view.menu.h r1 = r0.v
                if (r1 == 0) goto L22
                r0.i()
                java.util.ArrayList<androidx.appcompat.view.menu.h> r0 = r0.j
                int r2 = r0.size()
                r3 = 0
            L12:
                if (r3 >= r2) goto L22
                java.lang.Object r4 = r0.get(r3)
                androidx.appcompat.view.menu.h r4 = (androidx.appcompat.view.menu.h) r4
                if (r4 != r1) goto L1f
                r5.f820a = r3
                return
            L1f:
                int r3 = r3 + 1
                goto L12
            L22:
                r0 = -1
                r5.f820a = r0
                return
        }

        public final androidx.appcompat.view.menu.h c(int r3) {
                r2 = this;
                androidx.appcompat.view.menu.d r0 = r2.b
                androidx.appcompat.view.menu.f r1 = r0.c
                r1.i()
                java.util.ArrayList<androidx.appcompat.view.menu.h> r1 = r1.j
                r0.getClass()
                int r0 = r2.f820a
                if (r0 < 0) goto L14
                if (r3 < r0) goto L14
                int r3 = r3 + 1
            L14:
                java.lang.Object r3 = r1.get(r3)
                androidx.appcompat.view.menu.h r3 = (androidx.appcompat.view.menu.h) r3
                return r3
        }

        @Override // android.widget.Adapter
        public final int getCount() {
                r2 = this;
                androidx.appcompat.view.menu.d r0 = r2.b
                androidx.appcompat.view.menu.f r1 = r0.c
                r1.i()
                java.util.ArrayList<androidx.appcompat.view.menu.h> r1 = r1.j
                int r1 = r1.size()
                r0.getClass()
                int r0 = r2.f820a
                if (r0 >= 0) goto L15
                return r1
            L15:
                int r1 = r1 + (-1)
                return r1
        }

        @Override // android.widget.Adapter
        public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
                r0 = this;
                androidx.appcompat.view.menu.h r1 = r0.c(r1)
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
                if (r4 != 0) goto Ld
                androidx.appcompat.view.menu.d r4 = r2.b
                android.view.LayoutInflater r0 = r4.b
                int r4 = r4.e
                r1 = 0
                android.view.View r4 = r0.inflate(r4, r5, r1)
            Ld:
                r5 = r4
                androidx.appcompat.view.menu.k$a r5 = (androidx.appcompat.view.menu.k.a) r5
                androidx.appcompat.view.menu.h r3 = r2.c(r3)
                r5.b(r3)
                return r4
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
                r0 = this;
                r0.b()
                super.notifyDataSetChanged()
                return
        }
    }

    public d(android.content.ContextWrapper r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.e = r2
            r0.f819a = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.b = r1
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(androidx.appcompat.view.menu.f r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.j$a r0 = r1.f
            if (r0 == 0) goto L7
            r0.a(r2, r3)
        L7:
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c(androidx.appcompat.view.menu.h r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(android.content.Context r2, androidx.appcompat.view.menu.f r3) {
            r1 = this;
            android.content.Context r0 = r1.f819a
            if (r0 == 0) goto L10
            r1.f819a = r2
            android.view.LayoutInflater r0 = r1.b
            if (r0 != 0) goto L10
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.b = r2
        L10:
            r1.c = r3
            androidx.appcompat.view.menu.d$a r2 = r1.g
            if (r2 == 0) goto L19
            r2.notifyDataSetChanged()
        L19:
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g() {
            r1 = this;
            androidx.appcompat.view.menu.d$a r0 = r1.g
            if (r0 == 0) goto L7
            r0.notifyDataSetChanged()
        L7:
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(androidx.appcompat.view.menu.j.a r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(androidx.appcompat.view.menu.h r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(androidx.appcompat.view.menu.m r8) {
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            androidx.appcompat.view.menu.g r0 = new androidx.appcompat.view.menu.g
            r0.<init>()
            r0.f823a = r8
            androidx.appcompat.app.b$a r1 = new androidx.appcompat.app.b$a
            android.content.Context r2 = r8.f822a
            r1.<init>(r2)
            androidx.appcompat.view.menu.d r3 = new androidx.appcompat.view.menu.d
            androidx.appcompat.app.AlertController$b r4 = r1.f810a
            android.view.ContextThemeWrapper r5 = r4.f807a
            int r6 = androidx.appcompat.R.layout.abc_list_menu_item_layout
            r3.<init>(r5, r6)
            r0.c = r3
            r3.f = r0
            r8.b(r3, r2)
            androidx.appcompat.view.menu.d r2 = r0.c
            androidx.appcompat.view.menu.d$a r3 = r2.g
            if (r3 != 0) goto L35
            androidx.appcompat.view.menu.d$a r3 = new androidx.appcompat.view.menu.d$a
            r3.<init>(r2)
            r2.g = r3
        L35:
            androidx.appcompat.view.menu.d$a r2 = r2.g
            r4.g = r2
            r4.h = r0
            android.view.View r2 = r8.o
            if (r2 == 0) goto L42
            r4.e = r2
            goto L4a
        L42:
            android.graphics.drawable.Drawable r2 = r8.n
            r4.c = r2
            java.lang.CharSequence r2 = r8.m
            r4.d = r2
        L4a:
            r4.f = r0
            androidx.appcompat.app.b r1 = r1.a()
            r0.b = r1
            r1.setOnDismissListener(r0)
            androidx.appcompat.app.b r1 = r0.b
            android.view.Window r1 = r1.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r2 = 1003(0x3eb, float:1.406E-42)
            r1.type = r2
            int r2 = r1.flags
            r3 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r3
            r1.flags = r2
            androidx.appcompat.app.b r0 = r0.b
            r0.show()
            androidx.appcompat.view.menu.j$a r0 = r7.f
            if (r0 == 0) goto L76
            r0.b(r8)
        L76:
            r8 = 1
            return r8
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.view.menu.f r1 = r0.c
            androidx.appcompat.view.menu.d$a r2 = r0.g
            androidx.appcompat.view.menu.h r2 = r2.c(r3)
            r3 = 0
            r1.q(r2, r0, r3)
            return
    }
}
