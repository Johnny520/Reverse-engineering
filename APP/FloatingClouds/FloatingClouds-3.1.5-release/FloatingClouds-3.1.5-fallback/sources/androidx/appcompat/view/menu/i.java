package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f826a;
    public final androidx.appcompat.view.menu.f b;
    public final boolean c;
    public final int d;
    public android.view.View e;
    public int f;
    public boolean g;
    public androidx.appcompat.view.menu.j.a h;
    public a.AbstractC0123eb i;
    public androidx.appcompat.view.menu.i.a j;
    public final androidx.appcompat.view.menu.i.a k;

    public class a implements android.widget.PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.menu.i f827a;

        public a(androidx.appcompat.view.menu.i r1) {
                r0 = this;
                r0.<init>()
                r0.f827a = r1
                return
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
                r1 = this;
                androidx.appcompat.view.menu.i r0 = r1.f827a
                r0.c()
                return
        }
    }

    public i(int r2, android.content.Context r3, android.view.View r4, androidx.appcompat.view.menu.f r5, boolean r6) {
            r1 = this;
            r1.<init>()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.f = r0
            androidx.appcompat.view.menu.i$a r0 = new androidx.appcompat.view.menu.i$a
            r0.<init>(r1)
            r1.k = r0
            r1.f826a = r3
            r1.b = r5
            r1.e = r4
            r1.c = r6
            r1.d = r2
            return
    }

    public final a.AbstractC0123eb a() {
            r11 = this;
            a.eb r0 = r11.i
            if (r0 != 0) goto L6a
            java.lang.String r0 = "window"
            android.content.Context r1 = r11.f826a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r2 = r1.getResources()
            int r3 = androidx.appcompat.R.dimen.abc_cascading_menus_min_smallest_width
            int r2 = r2.getDimensionPixelSize(r3)
            if (r0 < r2) goto L3a
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.view.View r2 = r11.e
            int r3 = r11.d
            boolean r4 = r11.c
            r0.<init>(r1, r2, r3, r4)
            goto L4a
        L3a:
            androidx.appcompat.view.menu.l r5 = new androidx.appcompat.view.menu.l
            android.view.View r8 = r11.e
            android.content.Context r7 = r11.f826a
            boolean r10 = r11.c
            androidx.appcompat.view.menu.f r9 = r11.b
            int r6 = r11.d
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = r5
        L4a:
            androidx.appcompat.view.menu.f r1 = r11.b
            r0.l(r1)
            androidx.appcompat.view.menu.i$a r1 = r11.k
            r0.r(r1)
            android.view.View r1 = r11.e
            r0.n(r1)
            androidx.appcompat.view.menu.j$a r1 = r11.h
            r0.h(r1)
            boolean r1 = r11.g
            r0.o(r1)
            int r1 = r11.f
            r0.p(r1)
            r11.i = r0
        L6a:
            a.eb r0 = r11.i
            return r0
    }

    public final boolean b() {
            r1 = this;
            a.eb r0 = r1.i
            if (r0 == 0) goto Lc
            boolean r0 = r0.b()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void c() {
            r1 = this;
            r0 = 0
            r1.i = r0
            androidx.appcompat.view.menu.i$a r0 = r1.j
            if (r0 == 0) goto La
            r0.onDismiss()
        La:
            return
    }

    public final void d(int r4, int r5, boolean r6, boolean r7) {
            r3 = this;
            a.eb r0 = r3.a()
            r0.s(r7)
            if (r6 == 0) goto L47
            int r6 = r3.f
            android.view.View r7 = r3.e
            int r7 = r7.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            r6 = r6 & 7
            r7 = 5
            if (r6 != r7) goto L21
            android.view.View r6 = r3.e
            int r6 = r6.getWidth()
            int r4 = r4 - r6
        L21:
            r0.q(r4)
            r0.t(r5)
            android.content.Context r6 = r3.f826a
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1111490560(0x42400000, float:48.0)
            float r6 = r6 * r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            int r6 = (int) r6
            android.graphics.Rect r7 = new android.graphics.Rect
            int r1 = r4 - r6
            int r2 = r5 - r6
            int r4 = r4 + r6
            int r5 = r5 + r6
            r7.<init>(r1, r2, r4, r5)
            r0.f460a = r7
        L47:
            r0.f()
            return
    }
}
