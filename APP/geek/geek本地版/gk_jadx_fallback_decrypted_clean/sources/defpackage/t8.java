package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t8 extends defpackage.tu implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    public final android.content.Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final android.os.Handler f;
    public final java.util.ArrayList g;
    public final java.util.ArrayList h;
    public final defpackage.k4 i;
    public final defpackage.q8 j;
    public final defpackage.l0 k;
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
    public defpackage.cv w;
    public android.view.ViewTreeObserver x;
    public android.widget.PopupWindow.OnDismissListener y;
    public boolean z;

    public t8(android.content.Context r5, android.view.View r6, int r7, boolean r8) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.h = r0
            k4 r0 = new k4
            r1 = 2
            r0.<init>(r1, r4)
            r4.i = r0
            q8 r0 = new q8
            r2 = 0
            r0.<init>(r2, r4)
            r4.j = r0
            l0 r0 = new l0
            r3 = 5
            r0.<init>(r3, r4)
            r4.k = r0
            r4.l = r2
            r4.m = r2
            r4.b = r5
            r4.n = r6
            r4.d = r7
            r4.e = r8
            r4.u = r2
            java.util.WeakHashMap r7 = defpackage.ja0.a
            int r6 = defpackage.t90.d(r6)
            r7 = 1
            if (r6 != r7) goto L41
            goto L42
        L41:
            r2 = r7
        L42:
            r4.p = r2
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r6 = r5.getDisplayMetrics()
            int r6 = r6.widthPixels
            int r6 = r6 / r1
            r7 = 2131165207(0x7f070017, float:1.7944625E38)
            int r5 = r5.getDimensionPixelSize(r7)
            int r5 = java.lang.Math.max(r6, r5)
            r4.c = r5
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            r4.f = r5
            return
    }

    @Override // defpackage.dv
    public final void a(defpackage.ku r8, boolean r9) {
            r7 = this;
            java.util.ArrayList r0 = r7.h
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L18
            java.lang.Object r4 = r0.get(r3)
            s8 r4 = (defpackage.s8) r4
            ku r4 = r4.b
            if (r8 != r4) goto L15
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
            s8 r1 = (defpackage.s8) r1
            ku r1 = r1.b
            r1.c(r2)
        L30:
            java.lang.Object r1 = r0.remove(r3)
            s8 r1 = (defpackage.s8) r1
            ku r3 = r1.b
            bv r1 = r1.a
            c4 r4 = r1.z
            r3.r(r7)
            boolean r3 = r7.z
            r5 = 0
            if (r3 == 0) goto L4a
            defpackage.xu.b(r4, r5)
            r4.setAnimationStyle(r2)
        L4a:
            r1.dismiss()
            int r1 = r0.size()
            r3 = 1
            if (r1 <= 0) goto L61
            int r4 = r1 + (-1)
            java.lang.Object r4 = r0.get(r4)
            s8 r4 = (defpackage.s8) r4
            int r4 = r4.c
            r7.p = r4
            goto L70
        L61:
            android.view.View r4 = r7.n
            java.util.WeakHashMap r6 = defpackage.ja0.a
            int r4 = defpackage.t90.d(r4)
            if (r4 != r3) goto L6d
            r4 = r2
            goto L6e
        L6d:
            r4 = r3
        L6e:
            r7.p = r4
        L70:
            if (r1 != 0) goto L9c
            r7.dismiss()
            cv r9 = r7.w
            if (r9 == 0) goto L7c
            r9.a(r8, r3)
        L7c:
            android.view.ViewTreeObserver r8 = r7.x
            if (r8 == 0) goto L8f
            boolean r8 = r8.isAlive()
            if (r8 == 0) goto L8d
            android.view.ViewTreeObserver r8 = r7.x
            k4 r9 = r7.i
            r8.removeGlobalOnLayoutListener(r9)
        L8d:
            r7.x = r5
        L8f:
            android.view.View r8 = r7.o
            q8 r9 = r7.j
            r8.removeOnAttachStateChangeListener(r9)
            android.widget.PopupWindow$OnDismissListener r8 = r7.y
            r8.onDismiss()
            return
        L9c:
            if (r9 == 0) goto La9
            java.lang.Object r8 = r0.get(r2)
            s8 r8 = (defpackage.s8) r8
            ku r8 = r8.b
            r8.c(r2)
        La9:
            return
    }

    @Override // defpackage.r30
    public final boolean b() {
            r3 = this;
            java.util.ArrayList r0 = r3.h
            int r1 = r0.size()
            r2 = 0
            if (r1 <= 0) goto L1b
            java.lang.Object r0 = r0.get(r2)
            s8 r0 = (defpackage.s8) r0
            bv r0 = r0.a
            c4 r0 = r0.z
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L1b
            r0 = 1
            return r0
        L1b:
            return r2
    }

    @Override // defpackage.dv
    public final boolean c() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.r30
    public final void dismiss() {
            r4 = this;
            java.util.ArrayList r0 = r4.h
            int r1 = r0.size()
            if (r1 <= 0) goto L28
            s8[] r2 = new defpackage.s8[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            s8[] r0 = (defpackage.s8[]) r0
            int r1 = r1 + (-1)
        L12:
            if (r1 < 0) goto L28
            r2 = r0[r1]
            bv r3 = r2.a
            c4 r3 = r3.z
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L25
            bv r2 = r2.a
            r2.dismiss()
        L25:
            int r1 = r1 + (-1)
            goto L12
        L28:
            return
    }

    @Override // defpackage.dv
    public final void e(defpackage.cv r1) {
            r0 = this;
            r0.w = r1
            return
    }

    @Override // defpackage.r30
    public final void f() {
            r5 = this;
            boolean r0 = r5.b()
            if (r0 == 0) goto L7
            goto L3f
        L7:
            java.util.ArrayList r0 = r5.g
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L1d
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            ku r4 = (defpackage.ku) r4
            r5.u(r4)
            goto Lf
        L1d:
            r0.clear()
            android.view.View r0 = r5.n
            r5.o = r0
            if (r0 == 0) goto L3f
            android.view.ViewTreeObserver r1 = r5.x
            if (r1 != 0) goto L2b
            r2 = 1
        L2b:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r5.x = r0
            if (r2 == 0) goto L38
            k4 r1 = r5.i
            r0.addOnGlobalLayoutListener(r1)
        L38:
            android.view.View r0 = r5.o
            q8 r1 = r5.j
            r0.addOnAttachStateChangeListener(r1)
        L3f:
            return
    }

    @Override // defpackage.dv
    public final void h() {
            r5 = this;
            java.util.ArrayList r0 = r5.h
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L2c
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            s8 r3 = (defpackage.s8) r3
            bv r3 = r3.a
            kh r3 = r3.c
            android.widget.ListAdapter r3 = r3.getAdapter()
            boolean r4 = r3 instanceof android.widget.HeaderViewListAdapter
            if (r4 == 0) goto L26
            android.widget.HeaderViewListAdapter r3 = (android.widget.HeaderViewListAdapter) r3
            android.widget.ListAdapter r3 = r3.getWrappedAdapter()
            hu r3 = (defpackage.hu) r3
            goto L28
        L26:
            hu r3 = (defpackage.hu) r3
        L28:
            r3.notifyDataSetChanged()
            goto L7
        L2c:
            return
    }

    @Override // defpackage.r30
    public final defpackage.kh j() {
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
            s8 r0 = (defpackage.s8) r0
            bv r0 = r0.a
            kh r0 = r0.c
            return r0
    }

    @Override // defpackage.dv
    public final boolean k(defpackage.c50 r8) {
            r7 = this;
            java.util.ArrayList r0 = r7.h
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            r4 = 1
            if (r3 >= r1) goto L1f
            java.lang.Object r5 = r0.get(r3)
            int r3 = r3 + 1
            s8 r5 = (defpackage.s8) r5
            ku r6 = r5.b
            if (r8 != r6) goto L8
            bv r8 = r5.a
            kh r8 = r8.c
            r8.requestFocus()
            return r4
        L1f:
            boolean r0 = r8.hasVisibleItems()
            if (r0 == 0) goto L30
            r7.l(r8)
            cv r0 = r7.w
            if (r0 == 0) goto L2f
            r0.q(r8)
        L2f:
            return r4
        L30:
            return r2
    }

    @Override // defpackage.tu
    public final void l(defpackage.ku r2) {
            r1 = this;
            android.content.Context r0 = r1.b
            r2.b(r1, r0)
            boolean r0 = r1.b()
            if (r0 == 0) goto Lf
            r1.u(r2)
            return
        Lf:
            java.util.ArrayList r0 = r1.g
            r0.add(r2)
            return
    }

    @Override // defpackage.tu
    public final void n(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.n
            if (r0 == r3) goto L14
            r2.n = r3
            int r0 = r2.l
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r3 = defpackage.t90.d(r3)
            int r3 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2.m = r3
        L14:
            return
    }

    @Override // defpackage.tu
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
            s8 r4 = (defpackage.s8) r4
            bv r5 = r4.a
            c4 r5 = r5.z
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
            ku r0 = r4.b
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

    @Override // defpackage.tu
    public final void p(int r3) {
            r2 = this;
            int r0 = r2.l
            if (r0 == r3) goto L14
            r2.l = r3
            android.view.View r0 = r2.n
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r0 = defpackage.t90.d(r0)
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r0)
            r2.m = r3
        L14:
            return
    }

    @Override // defpackage.tu
    public final void q(int r2) {
            r1 = this;
            r0 = 1
            r1.q = r0
            r1.s = r2
            return
    }

    @Override // defpackage.tu
    public final void r(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.y = r1
            return
    }

    @Override // defpackage.tu
    public final void s(boolean r1) {
            r0 = this;
            r0.v = r1
            return
    }

    @Override // defpackage.tu
    public final void t(int r2) {
            r1 = this;
            r0 = 1
            r1.r = r0
            r1.t = r2
            return
    }

    public final void u(defpackage.ku r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Context r2 = r0.b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            hu r4 = new hu
            boolean r5 = r0.e
            r6 = 2131492875(0x7f0c000b, float:1.8609214E38)
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r0.b()
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L23
            boolean r5 = r0.u
            if (r5 == 0) goto L23
            r4.c = r7
            goto L4a
        L23:
            boolean r5 = r0.b()
            if (r5 == 0) goto L4a
            java.util.ArrayList r5 = r1.f
            int r5 = r5.size()
            r8 = r6
        L30:
            if (r8 >= r5) goto L47
            android.view.MenuItem r9 = r1.getItem(r8)
            boolean r10 = r9.isVisible()
            if (r10 == 0) goto L44
            android.graphics.drawable.Drawable r9 = r9.getIcon()
            if (r9 == 0) goto L44
            r5 = r7
            goto L48
        L44:
            int r8 = r8 + 1
            goto L30
        L47:
            r5 = r6
        L48:
            r4.c = r5
        L4a:
            int r5 = r0.c
            int r5 = defpackage.tu.m(r4, r2, r5)
            bv r8 = new bv
            int r9 = r0.d
            r10 = 0
            r8.<init>(r2, r10, r9, r6)
            l0 r2 = r0.k
            r8.C = r2
            r8.p = r0
            c4 r2 = r8.z
            r2.setOnDismissListener(r0)
            android.view.View r2 = r0.n
            r8.o = r2
            int r2 = r0.m
            r8.l = r2
            r8.y = r7
            c4 r2 = r8.z
            r2.setFocusable(r7)
            c4 r2 = r8.z
            r9 = 2
            r2.setInputMethodMode(r9)
            r8.n(r4)
            r8.q(r5)
            int r2 = r0.m
            r8.l = r2
            java.util.ArrayList r2 = r0.h
            int r4 = r2.size()
            if (r4 <= 0) goto L104
            int r4 = r2.size()
            int r4 = r4 - r7
            java.lang.Object r4 = r2.get(r4)
            s8 r4 = (defpackage.s8) r4
            ku r11 = r4.b
            java.util.ArrayList r12 = r11.f
            int r12 = r12.size()
            r13 = r6
        L9e:
            if (r13 >= r12) goto Lb4
            android.view.MenuItem r14 = r11.getItem(r13)
            boolean r15 = r14.hasSubMenu()
            if (r15 == 0) goto Lb1
            android.view.SubMenu r15 = r14.getSubMenu()
            if (r1 != r15) goto Lb1
            goto Lb5
        Lb1:
            int r13 = r13 + 1
            goto L9e
        Lb4:
            r14 = r10
        Lb5:
            if (r14 != 0) goto Lbb
            r16 = r7
            r7 = r10
            goto L108
        Lbb:
            bv r11 = r4.a
            kh r11 = r11.c
            android.widget.ListAdapter r12 = r11.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto Ld4
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            hu r12 = (defpackage.hu) r12
            goto Ld7
        Ld4:
            hu r12 = (defpackage.hu) r12
            r13 = r6
        Ld7:
            int r15 = r12.getCount()
            r16 = r7
            r7 = r6
        Lde:
            r9 = -1
            if (r7 >= r15) goto Lec
            ou r10 = r12.b(r7)
            if (r14 != r10) goto Le8
            goto Led
        Le8:
            int r7 = r7 + 1
            r10 = 0
            goto Lde
        Lec:
            r7 = r9
        Led:
            if (r7 != r9) goto Lf0
            goto L107
        Lf0:
            int r7 = r7 + r13
            int r9 = r11.getFirstVisiblePosition()
            int r7 = r7 - r9
            if (r7 < 0) goto L107
            int r9 = r11.getChildCount()
            if (r7 < r9) goto Lff
            goto L107
        Lff:
            android.view.View r7 = r11.getChildAt(r7)
            goto L108
        L104:
            r16 = r7
            r4 = 0
        L107:
            r7 = 0
        L108:
            if (r7 == 0) goto L19c
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            c4 r11 = r8.z
            if (r9 > r10) goto L128
            java.lang.reflect.Method r9 = defpackage.bv.D
            if (r9 == 0) goto L12b
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L120
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Exception -> L120
            r9.invoke(r11, r10)     // Catch: java.lang.Exception -> L120
            goto L12b
        L120:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L12b
        L128:
            defpackage.yu.a(r11, r6)
        L12b:
            c4 r9 = r8.z
            r10 = 0
            defpackage.xu.a(r9, r10)
            int r9 = r2.size()
            int r9 = r9 + (-1)
            java.lang.Object r9 = r2.get(r9)
            s8 r9 = (defpackage.s8) r9
            bv r9 = r9.a
            kh r9 = r9.c
            r10 = 2
            int[] r10 = new int[r10]
            r9.getLocationOnScreen(r10)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r12 = r0.o
            r12.getWindowVisibleDisplayFrame(r11)
            int r12 = r0.p
            r13 = r16
            if (r12 != r13) goto L169
            r10 = r10[r6]
            int r9 = r9.getWidth()
            int r9 = r9 + r10
            int r9 = r9 + r5
            int r10 = r11.right
            if (r9 <= r10) goto L166
        L163:
            r13 = r6
            r9 = 1
            goto L16f
        L166:
            r9 = 1
            r13 = 1
            goto L16f
        L169:
            r9 = r10[r6]
            int r9 = r9 - r5
            if (r9 >= 0) goto L163
            goto L166
        L16f:
            if (r13 != r9) goto L173
            r9 = 1
            goto L174
        L173:
            r9 = r6
        L174:
            r0.p = r13
            r8.o = r7
            int r10 = r0.m
            r11 = 5
            r10 = r10 & r11
            if (r10 != r11) goto L188
            if (r9 == 0) goto L181
            goto L191
        L181:
            int r5 = r7.getWidth()
            int r5 = 0 - r5
            goto L191
        L188:
            if (r9 == 0) goto L18f
            int r5 = r7.getWidth()
            goto L191
        L18f:
            int r5 = 0 - r5
        L191:
            r8.f = r5
            r9 = 1
            r8.k = r9
            r8.j = r9
            r8.m(r6)
            goto L1ba
        L19c:
            boolean r5 = r0.q
            if (r5 == 0) goto L1a4
            int r5 = r0.s
            r8.f = r5
        L1a4:
            boolean r5 = r0.r
            if (r5 == 0) goto L1ad
            int r5 = r0.t
            r8.m(r5)
        L1ad:
            android.graphics.Rect r5 = r0.a
            if (r5 == 0) goto L1b7
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r5)
            goto L1b8
        L1b7:
            r10 = 0
        L1b8:
            r8.x = r10
        L1ba:
            s8 r5 = new s8
            int r7 = r0.p
            r5.<init>(r8, r1, r7)
            r2.add(r5)
            r8.f()
            kh r2 = r8.c
            r2.setOnKeyListener(r0)
            if (r4 != 0) goto L1f7
            boolean r4 = r0.v
            if (r4 == 0) goto L1f7
            java.lang.CharSequence r4 = r1.m
            if (r4 == 0) goto L1f7
            r4 = 2131492882(0x7f0c0012, float:1.8609228E38)
            android.view.View r3 = r3.inflate(r4, r2, r6)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r6)
            java.lang.CharSequence r1 = r1.m
            r4.setText(r1)
            r10 = 0
            r2.addHeaderView(r3, r10, r6)
            r8.f()
        L1f7:
            return
    }
}
