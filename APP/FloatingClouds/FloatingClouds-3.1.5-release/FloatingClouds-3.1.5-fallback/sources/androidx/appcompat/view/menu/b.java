package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a.AbstractC0123eb implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    public static final int A = 0;
    public final android.content.Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final android.os.Handler f;
    public final java.util.ArrayList g;
    public final java.util.ArrayList h;
    public final androidx.appcompat.view.menu.b.a i;
    public final androidx.appcompat.view.menu.b.ViewOnAttachStateChangeListenerC0009b j;
    public final androidx.appcompat.view.menu.b.c k;
    public int l;
    public int m;
    public android.view.View n;
    public android.view.View o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public androidx.appcompat.view.menu.j.a w;
    public android.view.ViewTreeObserver x;
    public androidx.appcompat.view.menu.i.a y;
    public boolean z;

    public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.menu.b f814a;

        public a(androidx.appcompat.view.menu.b r1) {
                r0 = this;
                r0.<init>()
                r0.f814a = r1
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
                r3 = this;
                androidx.appcompat.view.menu.b r0 = r3.f814a
                boolean r1 = r0.b()
                if (r1 == 0) goto L41
                java.util.ArrayList r1 = r0.h
                int r2 = r1.size()
                if (r2 <= 0) goto L41
                r2 = 0
                java.lang.Object r2 = r1.get(r2)
                androidx.appcompat.view.menu.b$d r2 = (androidx.appcompat.view.menu.b.d) r2
                a.fb r2 = r2.f817a
                boolean r2 = r2.y
                if (r2 != 0) goto L41
                android.view.View r2 = r0.o
                if (r2 == 0) goto L3e
                boolean r2 = r2.isShown()
                if (r2 != 0) goto L28
                goto L3e
            L28:
                java.util.Iterator r0 = r1.iterator()
            L2c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L41
                java.lang.Object r1 = r0.next()
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.b.d) r1
                a.fb r1 = r1.f817a
                r1.f()
                goto L2c
            L3e:
                r0.dismiss()
            L41:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0009b implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.menu.b f815a;

        public ViewOnAttachStateChangeListenerC0009b(androidx.appcompat.view.menu.b r1) {
                r0 = this;
                r0.<init>()
                r0.f815a = r1
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                androidx.appcompat.view.menu.b r0 = r2.f815a
                android.view.ViewTreeObserver r1 = r0.x
                if (r1 == 0) goto L19
                boolean r1 = r1.isAlive()
                if (r1 != 0) goto L12
                android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
                r0.x = r1
            L12:
                android.view.ViewTreeObserver r1 = r0.x
                androidx.appcompat.view.menu.b$a r0 = r0.i
                r1.removeGlobalOnLayoutListener(r0)
            L19:
                r3.removeOnAttachStateChangeListener(r2)
                return
        }
    }

    public class c implements a.InterfaceC0087cb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.menu.b f816a;

        public c(androidx.appcompat.view.menu.b r1) {
                r0 = this;
                r0.<init>()
                r0.f816a = r1
                return
        }

        @Override // a.InterfaceC0087cb
        public final void a(androidx.appcompat.view.menu.f r1, androidx.appcompat.view.menu.h r2) {
                r0 = this;
                androidx.appcompat.view.menu.b r2 = r0.f816a
                android.os.Handler r2 = r2.f
                r2.removeCallbacksAndMessages(r1)
                return
        }

        @Override // a.InterfaceC0087cb
        public final void h(androidx.appcompat.view.menu.f r8, androidx.appcompat.view.menu.h r9) {
                r7 = this;
                androidx.appcompat.view.menu.b r0 = r7.f816a
                android.os.Handler r1 = r0.f
                r2 = 0
                r1.removeCallbacksAndMessages(r2)
                java.util.ArrayList r1 = r0.h
                int r3 = r1.size()
                r4 = 0
            Lf:
                r5 = -1
                if (r4 >= r3) goto L20
                java.lang.Object r6 = r1.get(r4)
                androidx.appcompat.view.menu.b$d r6 = (androidx.appcompat.view.menu.b.d) r6
                androidx.appcompat.view.menu.f r6 = r6.b
                if (r8 != r6) goto L1d
                goto L21
            L1d:
                int r4 = r4 + 1
                goto Lf
            L20:
                r4 = r5
            L21:
                if (r4 != r5) goto L24
                return
            L24:
                int r4 = r4 + 1
                int r3 = r1.size()
                if (r4 >= r3) goto L33
                java.lang.Object r1 = r1.get(r4)
                r2 = r1
                androidx.appcompat.view.menu.b$d r2 = (androidx.appcompat.view.menu.b.d) r2
            L33:
                androidx.appcompat.view.menu.c r1 = new androidx.appcompat.view.menu.c
                r1.<init>(r7, r2, r9, r8)
                long r2 = android.os.SystemClock.uptimeMillis()
                r4 = 200(0xc8, double:9.9E-322)
                long r2 = r2 + r4
                android.os.Handler r9 = r0.f
                r9.postAtTime(r1, r8, r2)
                return
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.C0141fb f817a;
        public final androidx.appcompat.view.menu.f b;
        public final int c;

        public d(a.C0141fb r1, androidx.appcompat.view.menu.f r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f817a = r1
                r0.b = r2
                r0.c = r3
                return
        }
    }

    static {
            int r0 = androidx.appcompat.R.layout.abc_cascading_menu_item_layout
            androidx.appcompat.view.menu.b.A = r0
            return
    }

    public b(android.content.Context r2, android.view.View r3, int r4, boolean r5) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.h = r0
            androidx.appcompat.view.menu.b$a r0 = new androidx.appcompat.view.menu.b$a
            r0.<init>(r1)
            r1.i = r0
            androidx.appcompat.view.menu.b$b r0 = new androidx.appcompat.view.menu.b$b
            r0.<init>(r1)
            r1.j = r0
            androidx.appcompat.view.menu.b$c r0 = new androidx.appcompat.view.menu.b$c
            r0.<init>(r1)
            r1.k = r0
            r0 = 0
            r1.l = r0
            r1.m = r0
            r1.b = r2
            r1.n = r3
            r1.d = r4
            r1.e = r5
            r1.u = r0
            int r3 = r3.getLayoutDirection()
            r4 = 1
            if (r3 != r4) goto L3d
            goto L3e
        L3d:
            r0 = r4
        L3e:
            r1.p = r0
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r3 = r2.getDisplayMetrics()
            int r3 = r3.widthPixels
            int r3 = r3 / 2
            int r4 = androidx.appcompat.R.dimen.abc_config_prefDialogWidth
            int r2 = r2.getDimensionPixelSize(r4)
            int r2 = java.lang.Math.max(r3, r2)
            r1.c = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.f = r2
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(androidx.appcompat.view.menu.f r7, boolean r8) {
            r6 = this;
            java.util.ArrayList r0 = r6.h
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L18
            java.lang.Object r4 = r0.get(r3)
            androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.b.d) r4
            androidx.appcompat.view.menu.f r4 = r4.b
            if (r7 != r4) goto L15
            goto L19
        L15:
            int r3 = r3 + 1
            goto L8
        L18:
            r3 = -1
        L19:
            if (r3 >= 0) goto L1d
            goto La9
        L1d:
            int r1 = r3 + 1
            int r4 = r0.size()
            if (r1 >= r4) goto L30
            java.lang.Object r1 = r0.get(r1)
            androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.b.d) r1
            androidx.appcompat.view.menu.f r1 = r1.b
            r1.c(r2)
        L30:
            java.lang.Object r1 = r0.remove(r3)
            androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.b.d) r1
            androidx.appcompat.view.menu.f r3 = r1.b
            r3.r(r6)
            boolean r3 = r6.z
            a.fb r1 = r1.f817a
            r4 = 0
            if (r3 == 0) goto L4c
            a.g1 r3 = r1.z
            a.C0141fb.a.b(r3, r4)
            a.g1 r3 = r1.z
            r3.setAnimationStyle(r2)
        L4c:
            r1.dismiss()
            int r1 = r0.size()
            r3 = 1
            if (r1 <= 0) goto L63
            int r5 = r1 + (-1)
            java.lang.Object r5 = r0.get(r5)
            androidx.appcompat.view.menu.b$d r5 = (androidx.appcompat.view.menu.b.d) r5
            int r5 = r5.c
            r6.p = r5
            goto L70
        L63:
            android.view.View r5 = r6.n
            int r5 = r5.getLayoutDirection()
            if (r5 != r3) goto L6d
            r5 = r2
            goto L6e
        L6d:
            r5 = r3
        L6e:
            r6.p = r5
        L70:
            if (r1 != 0) goto L9c
            r6.dismiss()
            androidx.appcompat.view.menu.j$a r8 = r6.w
            if (r8 == 0) goto L7c
            r8.a(r7, r3)
        L7c:
            android.view.ViewTreeObserver r7 = r6.x
            if (r7 == 0) goto L8f
            boolean r7 = r7.isAlive()
            if (r7 == 0) goto L8d
            android.view.ViewTreeObserver r7 = r6.x
            androidx.appcompat.view.menu.b$a r8 = r6.i
            r7.removeGlobalOnLayoutListener(r8)
        L8d:
            r6.x = r4
        L8f:
            android.view.View r7 = r6.o
            androidx.appcompat.view.menu.b$b r8 = r6.j
            r7.removeOnAttachStateChangeListener(r8)
            androidx.appcompat.view.menu.i$a r7 = r6.y
            r7.onDismiss()
            return
        L9c:
            if (r8 == 0) goto La9
            java.lang.Object r7 = r0.get(r2)
            androidx.appcompat.view.menu.b$d r7 = (androidx.appcompat.view.menu.b.d) r7
            androidx.appcompat.view.menu.f r7 = r7.b
            r7.c(r2)
        La9:
            return
    }

    @Override // a.InterfaceC0108de
    public final boolean b() {
            r3 = this;
            java.util.ArrayList r0 = r3.h
            int r1 = r0.size()
            r2 = 0
            if (r1 <= 0) goto L1b
            java.lang.Object r0 = r0.get(r2)
            androidx.appcompat.view.menu.b$d r0 = (androidx.appcompat.view.menu.b.d) r0
            a.fb r0 = r0.f817a
            a.g1 r0 = r0.z
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L1b
            r0 = 1
            return r0
        L1b:
            return r2
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // a.InterfaceC0108de
    public final void dismiss() {
            r4 = this;
            java.util.ArrayList r0 = r4.h
            int r1 = r0.size()
            if (r1 <= 0) goto L28
            androidx.appcompat.view.menu.b$d[] r2 = new androidx.appcompat.view.menu.b.d[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            androidx.appcompat.view.menu.b$d[] r0 = (androidx.appcompat.view.menu.b.d[]) r0
            int r1 = r1 + (-1)
        L12:
            if (r1 < 0) goto L28
            r2 = r0[r1]
            a.fb r3 = r2.f817a
            a.g1 r3 = r3.z
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L25
            a.fb r2 = r2.f817a
            r2.dismiss()
        L25:
            int r1 = r1 + (-1)
            goto L12
        L28:
            return
    }

    @Override // a.InterfaceC0108de
    public final void f() {
            r3 = this;
            boolean r0 = r3.b()
            if (r0 == 0) goto L7
            goto L41
        L7:
            java.util.ArrayList r0 = r3.g
            java.util.Iterator r1 = r0.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            androidx.appcompat.view.menu.f r2 = (androidx.appcompat.view.menu.f) r2
            r3.v(r2)
            goto Ld
        L1d:
            r0.clear()
            android.view.View r0 = r3.n
            r3.o = r0
            if (r0 == 0) goto L41
            android.view.ViewTreeObserver r1 = r3.x
            if (r1 != 0) goto L2c
            r1 = 1
            goto L2d
        L2c:
            r1 = 0
        L2d:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r3.x = r0
            if (r1 == 0) goto L3a
            androidx.appcompat.view.menu.b$a r1 = r3.i
            r0.addOnGlobalLayoutListener(r1)
        L3a:
            android.view.View r0 = r3.o
            androidx.appcompat.view.menu.b$b r1 = r3.j
            r0.addOnAttachStateChangeListener(r1)
        L41:
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g() {
            r3 = this;
            java.util.ArrayList r0 = r3.h
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.b.d) r1
            a.fb r1 = r1.f817a
            a.A5 r1 = r1.c
            android.widget.ListAdapter r1 = r1.getAdapter()
            boolean r2 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r2 == 0) goto L27
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            android.widget.ListAdapter r1 = r1.getWrappedAdapter()
            androidx.appcompat.view.menu.e r1 = (androidx.appcompat.view.menu.e) r1
            goto L29
        L27:
            androidx.appcompat.view.menu.e r1 = (androidx.appcompat.view.menu.e) r1
        L29:
            r1.notifyDataSetChanged()
            goto L6
        L2d:
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(androidx.appcompat.view.menu.j.a r1) {
            r0 = this;
            r0.w = r1
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(androidx.appcompat.view.menu.m r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.h
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.b.d) r1
            androidx.appcompat.view.menu.f r3 = r1.b
            if (r5 != r3) goto L6
            a.fb r5 = r1.f817a
            a.A5 r5 = r5.c
            r5.requestFocus()
            return r2
        L1f:
            boolean r0 = r5.hasVisibleItems()
            if (r0 == 0) goto L30
            r4.l(r5)
            androidx.appcompat.view.menu.j$a r0 = r4.w
            if (r0 == 0) goto L2f
            r0.b(r5)
        L2f:
            return r2
        L30:
            r5 = 0
            return r5
    }

    @Override // a.InterfaceC0108de
    public final a.A5 k() {
            r2 = this;
            java.util.ArrayList r0 = r2.h
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            r0 = 0
            return r0
        La:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.b$d r0 = (androidx.appcompat.view.menu.b.d) r0
            a.fb r0 = r0.f817a
            a.A5 r0 = r0.c
            return r0
    }

    @Override // a.AbstractC0123eb
    public final void l(androidx.appcompat.view.menu.f r2) {
            r1 = this;
            android.content.Context r0 = r1.b
            r2.b(r1, r0)
            boolean r0 = r1.b()
            if (r0 == 0) goto Lf
            r1.v(r2)
            return
        Lf:
            java.util.ArrayList r0 = r1.g
            r0.add(r2)
            return
    }

    @Override // a.AbstractC0123eb
    public final void n(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.n
            if (r0 == r2) goto L12
            r1.n = r2
            int r0 = r1.l
            int r2 = r2.getLayoutDirection()
            int r2 = android.view.Gravity.getAbsoluteGravity(r0, r2)
            r1.m = r2
        L12:
            return
    }

    @Override // a.AbstractC0123eb
    public final void o(boolean r1) {
            r0 = this;
            r0.u = r1
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r6 = this;
            java.util.ArrayList r0 = r6.h
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L1e
            java.lang.Object r4 = r0.get(r3)
            androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.b.d) r4
            a.fb r5 = r4.f817a
            a.g1 r5 = r5.z
            boolean r5 = r5.isShowing()
            if (r5 != 0) goto L1b
            goto L1f
        L1b:
            int r3 = r3 + 1
            goto L8
        L1e:
            r4 = 0
        L1f:
            if (r4 == 0) goto L26
            androidx.appcompat.view.menu.f r0 = r4.b
            r0.c(r2)
        L26:
            return
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r1 = 0
            return r1
    }

    @Override // a.AbstractC0123eb
    public final void p(int r2) {
            r1 = this;
            int r0 = r1.l
            if (r0 == r2) goto L12
            r1.l = r2
            android.view.View r0 = r1.n
            int r0 = r0.getLayoutDirection()
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r0)
            r1.m = r2
        L12:
            return
    }

    @Override // a.AbstractC0123eb
    public final void q(int r2) {
            r1 = this;
            r0 = 1
            r1.q = r0
            r1.s = r2
            return
    }

    @Override // a.AbstractC0123eb
    public final void r(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            androidx.appcompat.view.menu.i$a r1 = (androidx.appcompat.view.menu.i.a) r1
            r0.y = r1
            return
    }

    @Override // a.AbstractC0123eb
    public final void s(boolean r1) {
            r0 = this;
            r0.v = r1
            return
    }

    @Override // a.AbstractC0123eb
    public final void t(int r2) {
            r1 = this;
            r0 = 1
            r1.r = r0
            r1.t = r2
            return
    }

    public final void v(androidx.appcompat.view.menu.f r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Context r2 = r0.b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.e r4 = new androidx.appcompat.view.menu.e
            boolean r5 = r0.e
            int r6 = androidx.appcompat.view.menu.b.A
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r0.b()
            r6 = 1
            if (r5 != 0) goto L21
            boolean r5 = r0.u
            if (r5 == 0) goto L21
            r4.c = r6
            goto L2d
        L21:
            boolean r5 = r0.b()
            if (r5 == 0) goto L2d
            boolean r5 = a.AbstractC0123eb.u(r1)
            r4.c = r5
        L2d:
            int r5 = r0.c
            int r5 = a.AbstractC0123eb.m(r4, r2, r5)
            a.fb r7 = new a.fb
            int r8 = r0.d
            r9 = 0
            r7.<init>(r2, r9, r8)
            androidx.appcompat.view.menu.b$c r2 = r0.k
            r7.C = r2
            r7.p = r0
            a.g1 r2 = r7.z
            r2.setOnDismissListener(r0)
            android.view.View r2 = r0.n
            r7.o = r2
            int r2 = r0.m
            r7.l = r2
            r7.y = r6
            a.g1 r2 = r7.z
            r2.setFocusable(r6)
            a.g1 r2 = r7.z
            r8 = 2
            r2.setInputMethodMode(r8)
            r7.o(r4)
            r7.r(r5)
            int r2 = r0.m
            r7.l = r2
            java.util.ArrayList r2 = r0.h
            int r4 = r2.size()
            r10 = 0
            if (r4 <= 0) goto Le8
            int r4 = r2.size()
            int r4 = r4 - r6
            java.lang.Object r4 = r2.get(r4)
            androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.b.d) r4
            androidx.appcompat.view.menu.f r11 = r4.b
            java.util.ArrayList<androidx.appcompat.view.menu.h> r12 = r11.f
            int r12 = r12.size()
            r13 = r10
        L82:
            if (r13 >= r12) goto L98
            android.view.MenuItem r14 = r11.getItem(r13)
            boolean r15 = r14.hasSubMenu()
            if (r15 == 0) goto L95
            android.view.SubMenu r15 = r14.getSubMenu()
            if (r1 != r15) goto L95
            goto L99
        L95:
            int r13 = r13 + 1
            goto L82
        L98:
            r14 = r9
        L99:
            if (r14 != 0) goto L9f
            r16 = r6
            r6 = r9
            goto Lec
        L9f:
            a.fb r11 = r4.f817a
            a.A5 r11 = r11.c
            android.widget.ListAdapter r12 = r11.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto Lb8
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            androidx.appcompat.view.menu.e r12 = (androidx.appcompat.view.menu.e) r12
            goto Lbb
        Lb8:
            androidx.appcompat.view.menu.e r12 = (androidx.appcompat.view.menu.e) r12
            r13 = r10
        Lbb:
            int r15 = r12.getCount()
            r16 = r6
            r6 = r10
        Lc2:
            r8 = -1
            if (r6 >= r15) goto Ld0
            androidx.appcompat.view.menu.h r9 = r12.c(r6)
            if (r14 != r9) goto Lcc
            goto Ld1
        Lcc:
            int r6 = r6 + 1
            r9 = 0
            goto Lc2
        Ld0:
            r6 = r8
        Ld1:
            if (r6 != r8) goto Ld4
            goto Leb
        Ld4:
            int r6 = r6 + r13
            int r8 = r11.getFirstVisiblePosition()
            int r6 = r6 - r8
            if (r6 < 0) goto Leb
            int r8 = r11.getChildCount()
            if (r6 < r8) goto Le3
            goto Leb
        Le3:
            android.view.View r6 = r11.getChildAt(r6)
            goto Lec
        Le8:
            r16 = r6
            r4 = 0
        Leb:
            r6 = 0
        Lec:
            if (r6 == 0) goto L180
            int r8 = android.os.Build.VERSION.SDK_INT
            a.g1 r9 = r7.z
            r11 = 28
            if (r8 > r11) goto L10c
            java.lang.reflect.Method r8 = a.C0141fb.D
            if (r8 == 0) goto L10f
            java.lang.Boolean r11 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L104
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.Exception -> L104
            r8.invoke(r9, r11)     // Catch: java.lang.Exception -> L104
            goto L10f
        L104:
            java.lang.String r8 = "MenuPopupWindow"
            java.lang.String r9 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r8, r9)
            goto L10f
        L10c:
            a.C0141fb.b.a(r9, r10)
        L10f:
            a.g1 r8 = r7.z
            r9 = 0
            a.C0141fb.a.a(r8, r9)
            int r8 = r2.size()
            int r8 = r8 + (-1)
            java.lang.Object r8 = r2.get(r8)
            androidx.appcompat.view.menu.b$d r8 = (androidx.appcompat.view.menu.b.d) r8
            a.fb r8 = r8.f817a
            a.A5 r8 = r8.c
            r9 = 2
            int[] r9 = new int[r9]
            r8.getLocationOnScreen(r9)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r12 = r0.o
            r12.getWindowVisibleDisplayFrame(r11)
            int r12 = r0.p
            r13 = r16
            if (r12 != r13) goto L14d
            r9 = r9[r10]
            int r8 = r8.getWidth()
            int r8 = r8 + r9
            int r8 = r8 + r5
            int r9 = r11.right
            if (r8 <= r9) goto L14a
        L147:
            r13 = r10
            r8 = 1
            goto L153
        L14a:
            r8 = 1
            r13 = 1
            goto L153
        L14d:
            r8 = r9[r10]
            int r8 = r8 - r5
            if (r8 >= 0) goto L147
            goto L14a
        L153:
            if (r13 != r8) goto L157
            r8 = 1
            goto L158
        L157:
            r8 = r10
        L158:
            r0.p = r13
            r7.o = r6
            int r9 = r0.m
            r11 = 5
            r9 = r9 & r11
            if (r9 != r11) goto L16c
            if (r8 == 0) goto L165
            goto L175
        L165:
            int r5 = r6.getWidth()
            int r5 = 0 - r5
            goto L175
        L16c:
            if (r8 == 0) goto L173
            int r5 = r6.getWidth()
            goto L175
        L173:
            int r5 = 0 - r5
        L175:
            r7.f = r5
            r8 = 1
            r7.k = r8
            r7.j = r8
            r7.n(r10)
            goto L19e
        L180:
            boolean r5 = r0.q
            if (r5 == 0) goto L188
            int r5 = r0.s
            r7.f = r5
        L188:
            boolean r5 = r0.r
            if (r5 == 0) goto L191
            int r5 = r0.t
            r7.n(r5)
        L191:
            android.graphics.Rect r5 = r0.f460a
            if (r5 == 0) goto L19b
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r5)
            goto L19c
        L19b:
            r9 = 0
        L19c:
            r7.x = r9
        L19e:
            androidx.appcompat.view.menu.b$d r5 = new androidx.appcompat.view.menu.b$d
            int r6 = r0.p
            r5.<init>(r7, r1, r6)
            r2.add(r5)
            r7.f()
            a.A5 r2 = r7.c
            r2.setOnKeyListener(r0)
            if (r4 != 0) goto L1da
            boolean r4 = r0.v
            if (r4 == 0) goto L1da
            java.lang.CharSequence r4 = r1.m
            if (r4 == 0) goto L1da
            int r4 = androidx.appcompat.R.layout.abc_popup_menu_header_item_layout
            android.view.View r3 = r3.inflate(r4, r2, r10)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r10)
            java.lang.CharSequence r1 = r1.m
            r4.setText(r1)
            r9 = 0
            r2.addHeaderView(r3, r9, r10)
            r7.f()
        L1da:
            return
    }
}
