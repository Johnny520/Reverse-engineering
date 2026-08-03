package a;

/* JADX INFO: renamed from: a.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0141fb extends a.F9 implements a.InterfaceC0087cb {
    public static final java.lang.reflect.Method D = null;
    public androidx.appcompat.view.menu.b.c C;

    /* JADX INFO: renamed from: a.fb$a */
    public static class a {
        public static void a(android.widget.PopupWindow r0, android.transition.Transition r1) {
                r0.setEnterTransition(r1)
                return
        }

        public static void b(android.widget.PopupWindow r0, android.transition.Transition r1) {
                r0.setExitTransition(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.fb$b */
    public static class b {
        public static void a(android.widget.PopupWindow r0, boolean r1) {
                r0.setTouchModal(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.fb$c */
    public static class c extends a.A5 {
        public final int m;
        public final int n;
        public a.InterfaceC0087cb o;
        public androidx.appcompat.view.menu.h p;

        public c(android.content.Context r3, boolean r4) {
                r2 = this;
                r2.<init>(r3, r4)
                android.content.res.Resources r3 = r3.getResources()
                android.content.res.Configuration r3 = r3.getConfiguration()
                r4 = 1
                int r3 = r3.getLayoutDirection()
                r0 = 22
                r1 = 21
                if (r4 != r3) goto L1b
                r2.m = r1
                r2.n = r0
                return
            L1b:
                r2.m = r0
                r2.n = r1
                return
        }

        @Override // a.A5, android.view.View
        public final boolean onHoverEvent(android.view.MotionEvent r5) {
                r4 = this;
                a.cb r0 = r4.o
                if (r0 == 0) goto L5a
                android.widget.ListAdapter r0 = r4.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L19
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                androidx.appcompat.view.menu.e r0 = (androidx.appcompat.view.menu.e) r0
                goto L1c
            L19:
                androidx.appcompat.view.menu.e r0 = (androidx.appcompat.view.menu.e) r0
                r1 = 0
            L1c:
                int r2 = r5.getAction()
                r3 = 10
                if (r2 == r3) goto L43
                float r2 = r5.getX()
                int r2 = (int) r2
                float r3 = r5.getY()
                int r3 = (int) r3
                int r2 = r4.pointToPosition(r2, r3)
                r3 = -1
                if (r2 == r3) goto L43
                int r2 = r2 - r1
                if (r2 < 0) goto L43
                int r1 = r0.getCount()
                if (r2 >= r1) goto L43
                androidx.appcompat.view.menu.h r1 = r0.c(r2)
                goto L44
            L43:
                r1 = 0
            L44:
                androidx.appcompat.view.menu.h r2 = r4.p
                if (r2 == r1) goto L5a
                androidx.appcompat.view.menu.f r0 = r0.f821a
                if (r2 == 0) goto L51
                a.cb r3 = r4.o
                r3.a(r0, r2)
            L51:
                r4.p = r1
                if (r1 == 0) goto L5a
                a.cb r2 = r4.o
                r2.h(r0, r1)
            L5a:
                boolean r5 = super.onHoverEvent(r5)
                return r5
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
                r4 = this;
                android.view.View r0 = r4.getSelectedView()
                androidx.appcompat.view.menu.ListMenuItemView r0 = (androidx.appcompat.view.menu.ListMenuItemView) r0
                r1 = 1
                if (r0 == 0) goto L29
                int r2 = r4.m
                if (r5 != r2) goto L29
                boolean r5 = r0.isEnabled()
                if (r5 == 0) goto L28
                androidx.appcompat.view.menu.h r5 = r0.getItemData()
                boolean r5 = r5.hasSubMenu()
                if (r5 == 0) goto L28
                int r5 = r4.getSelectedItemPosition()
                long r2 = r4.getSelectedItemId()
                r4.performItemClick(r0, r5, r2)
            L28:
                return r1
            L29:
                if (r0 == 0) goto L4d
                int r0 = r4.n
                if (r5 != r0) goto L4d
                r5 = -1
                r4.setSelection(r5)
                android.widget.ListAdapter r5 = r4.getAdapter()
                boolean r6 = r5 instanceof android.widget.HeaderViewListAdapter
                if (r6 == 0) goto L44
                android.widget.HeaderViewListAdapter r5 = (android.widget.HeaderViewListAdapter) r5
                android.widget.ListAdapter r5 = r5.getWrappedAdapter()
                androidx.appcompat.view.menu.e r5 = (androidx.appcompat.view.menu.e) r5
                goto L46
            L44:
                androidx.appcompat.view.menu.e r5 = (androidx.appcompat.view.menu.e) r5
            L46:
                androidx.appcompat.view.menu.f r5 = r5.f821a
                r6 = 0
                r5.c(r6)
                return r1
            L4d:
                boolean r5 = super.onKeyDown(r5, r6)
                return r5
        }

        public void setHoverListener(a.InterfaceC0087cb r1) {
                r0 = this;
                r0.o = r1
                return
        }

        @Override // a.A5, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.setSelector(r1)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoSuchMethodException -> L17
            r1 = 28
            if (r0 > r1) goto L1e
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r1 = "setTouchModal"
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L17
            a.C0141fb.D = r0     // Catch: java.lang.NoSuchMethodException -> L17
            return
        L17:
            java.lang.String r0 = "MenuPopupWindow"
            java.lang.String r1 = "Could not find method setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L1e:
            return
    }

    @Override // a.InterfaceC0087cb
    public final void a(androidx.appcompat.view.menu.f r2, androidx.appcompat.view.menu.h r3) {
            r1 = this;
            androidx.appcompat.view.menu.b$c r0 = r1.C
            if (r0 == 0) goto L7
            r0.a(r2, r3)
        L7:
            return
    }

    @Override // a.InterfaceC0087cb
    public final void h(androidx.appcompat.view.menu.f r2, androidx.appcompat.view.menu.h r3) {
            r1 = this;
            androidx.appcompat.view.menu.b$c r0 = r1.C
            if (r0 == 0) goto L7
            r0.h(r2, r3)
        L7:
            return
    }

    @Override // a.F9
    public final a.A5 q(android.content.Context r2, boolean r3) {
            r1 = this;
            a.fb$c r0 = new a.fb$c
            r0.<init>(r2, r3)
            r0.setHoverListener(r1)
            return r0
    }
}
