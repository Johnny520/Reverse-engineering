package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q40 extends defpackage.tu implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {
    public final android.content.Context b;
    public final defpackage.ku c;
    public final defpackage.hu d;
    public final boolean e;
    public final int f;
    public final int g;
    public final defpackage.bv h;
    public final defpackage.k4 i;
    public final defpackage.q8 j;
    public android.widget.PopupWindow.OnDismissListener k;
    public android.view.View l;
    public android.view.View m;
    public defpackage.cv n;
    public android.view.ViewTreeObserver o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public boolean t;

    public q40(android.content.Context r5, defpackage.ku r6, android.view.View r7, int r8, boolean r9) {
            r4 = this;
            r4.<init>()
            k4 r0 = new k4
            r1 = 3
            r0.<init>(r1, r4)
            r4.i = r0
            q8 r0 = new q8
            r1 = 2
            r0.<init>(r1, r4)
            r4.j = r0
            r0 = 0
            r4.s = r0
            r4.b = r5
            r4.c = r6
            r4.e = r9
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            hu r2 = new hu
            r3 = 2131492883(0x7f0c0013, float:1.860923E38)
            r2.<init>(r6, r1, r9, r3)
            r4.d = r2
            r4.g = r8
            android.content.res.Resources r9 = r5.getResources()
            android.util.DisplayMetrics r1 = r9.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r1 = r1 / 2
            r2 = 2131165207(0x7f070017, float:1.7944625E38)
            int r9 = r9.getDimensionPixelSize(r2)
            int r9 = java.lang.Math.max(r1, r9)
            r4.f = r9
            r4.l = r7
            bv r7 = new bv
            r9 = 0
            r7.<init>(r5, r9, r8, r0)
            r4.h = r7
            r6.b(r4, r5)
            return
    }

    @Override // defpackage.dv
    public final void a(defpackage.ku r2, boolean r3) {
            r1 = this;
            ku r0 = r1.c
            if (r2 == r0) goto L5
            goto Lf
        L5:
            r1.dismiss()
            cv r0 = r1.n
            if (r0 == 0) goto Lf
            r0.a(r2, r3)
        Lf:
            return
    }

    @Override // defpackage.r30
    public final boolean b() {
            r1 = this;
            boolean r0 = r1.p
            if (r0 != 0) goto L10
            bv r0 = r1.h
            c4 r0 = r0.z
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // defpackage.dv
    public final boolean c() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.r30
    public final void dismiss() {
            r1 = this;
            boolean r0 = r1.b()
            if (r0 == 0) goto Lb
            bv r0 = r1.h
            r0.dismiss()
        Lb:
            return
    }

    @Override // defpackage.dv
    public final void e(defpackage.cv r1) {
            r0 = this;
            r0.n = r1
            return
    }

    @Override // defpackage.r30
    public final void f() {
            r8 = this;
            boolean r0 = r8.b()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r8.p
            if (r0 != 0) goto La9
            android.view.View r0 = r8.l
            if (r0 == 0) goto La9
            r8.m = r0
            bv r0 = r8.h
            c4 r1 = r0.z
            c4 r2 = r0.z
            r1.setOnDismissListener(r8)
            r0.p = r8
            r1 = 1
            r0.y = r1
            r2.setFocusable(r1)
            android.view.View r3 = r8.m
            android.view.ViewTreeObserver r4 = r8.o
            r5 = 0
            if (r4 != 0) goto L2b
            r4 = r1
            goto L2c
        L2b:
            r4 = r5
        L2c:
            android.view.ViewTreeObserver r6 = r3.getViewTreeObserver()
            r8.o = r6
            if (r4 == 0) goto L39
            k4 r4 = r8.i
            r6.addOnGlobalLayoutListener(r4)
        L39:
            q8 r4 = r8.j
            r3.addOnAttachStateChangeListener(r4)
            r0.o = r3
            int r3 = r8.s
            r0.l = r3
            boolean r3 = r8.q
            android.content.Context r4 = r8.b
            hu r6 = r8.d
            if (r3 != 0) goto L56
            int r3 = r8.f
            int r3 = defpackage.tu.m(r6, r4, r3)
            r8.r = r3
            r8.q = r1
        L56:
            int r1 = r8.r
            r0.q(r1)
            r1 = 2
            r2.setInputMethodMode(r1)
            android.graphics.Rect r1 = r8.a
            r2 = 0
            if (r1 == 0) goto L6a
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1)
            goto L6b
        L6a:
            r3 = r2
        L6b:
            r0.x = r3
            r0.f()
            kh r1 = r0.c
            r1.setOnKeyListener(r8)
            boolean r3 = r8.t
            if (r3 == 0) goto La2
            ku r3 = r8.c
            java.lang.CharSequence r7 = r3.m
            if (r7 == 0) goto La2
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r7 = 2131492882(0x7f0c0012, float:1.8609228E38)
            android.view.View r4 = r4.inflate(r7, r1, r5)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r7 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L9c
            java.lang.CharSequence r3 = r3.m
            r7.setText(r3)
        L9c:
            r4.setEnabled(r5)
            r1.addHeaderView(r4, r2, r5)
        La2:
            r0.n(r6)
            r0.f()
            return
        La9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.dv
    public final void h() {
            r1 = this;
            r0 = 0
            r1.q = r0
            hu r0 = r1.d
            if (r0 == 0) goto La
            r0.notifyDataSetChanged()
        La:
            return
    }

    @Override // defpackage.r30
    public final defpackage.kh j() {
            r1 = this;
            bv r0 = r1.h
            kh r0 = r0.c
            return r0
    }

    @Override // defpackage.dv
    public final boolean k(defpackage.c50 r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L8f
            wu r2 = new wu
            android.view.View r5 = r9.m
            int r7 = r9.g
            r8 = 0
            android.content.Context r3 = r9.b
            boolean r6 = r9.e
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            cv r10 = r9.n
            r2.h = r10
            tu r0 = r2.i
            if (r0 == 0) goto L21
            r0.e(r10)
        L21:
            java.util.ArrayList r10 = r4.f
            int r10 = r10.size()
            r0 = r1
        L28:
            r3 = 1
            if (r0 >= r10) goto L40
            android.view.MenuItem r5 = r4.getItem(r0)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L3d
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L3d
            r10 = r3
            goto L41
        L3d:
            int r0 = r0 + 1
            goto L28
        L40:
            r10 = r1
        L41:
            r2.g = r10
            tu r0 = r2.i
            if (r0 == 0) goto L4a
            r0.o(r10)
        L4a:
            android.widget.PopupWindow$OnDismissListener r10 = r9.k
            r2.j = r10
            r10 = 0
            r9.k = r10
            ku r10 = r9.c
            r10.c(r1)
            bv r10 = r9.h
            int r0 = r10.f
            int r10 = r10.g()
            int r5 = r9.s
            android.view.View r6 = r9.l
            java.util.WeakHashMap r7 = defpackage.ja0.a
            int r6 = defpackage.t90.d(r6)
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r5 = r5 & 7
            r6 = 5
            if (r5 != r6) goto L78
            android.view.View r5 = r9.l
            int r5 = r5.getWidth()
            int r0 = r0 + r5
        L78:
            boolean r5 = r2.b()
            if (r5 == 0) goto L7f
            goto L87
        L7f:
            android.view.View r5 = r2.e
            if (r5 != 0) goto L84
            goto L8f
        L84:
            r2.d(r0, r10, r3, r3)
        L87:
            cv r10 = r9.n
            if (r10 == 0) goto L8e
            r10.q(r4)
        L8e:
            return r3
        L8f:
            return r1
    }

    @Override // defpackage.tu
    public final void l(defpackage.ku r1) {
            r0 = this;
            return
    }

    @Override // defpackage.tu
    public final void n(android.view.View r1) {
            r0 = this;
            r0.l = r1
            return
    }

    @Override // defpackage.tu
    public final void o(boolean r2) {
            r1 = this;
            hu r0 = r1.d
            r0.c = r2
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r2 = this;
            r0 = 1
            r2.p = r0
            ku r1 = r2.c
            r1.c(r0)
            android.view.ViewTreeObserver r0 = r2.o
            if (r0 == 0) goto L24
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1a
            android.view.View r0 = r2.m
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.o = r0
        L1a:
            android.view.ViewTreeObserver r0 = r2.o
            k4 r1 = r2.i
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.o = r0
        L24:
            android.view.View r0 = r2.m
            q8 r1 = r2.j
            r0.removeOnAttachStateChangeListener(r1)
            android.widget.PopupWindow$OnDismissListener r0 = r2.k
            if (r0 == 0) goto L32
            r0.onDismiss()
        L32:
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
    public final void p(int r1) {
            r0 = this;
            r0.s = r1
            return
    }

    @Override // defpackage.tu
    public final void q(int r2) {
            r1 = this;
            bv r0 = r1.h
            r0.f = r2
            return
    }

    @Override // defpackage.tu
    public final void r(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // defpackage.tu
    public final void s(boolean r1) {
            r0 = this;
            r0.t = r1
            return
    }

    @Override // defpackage.tu
    public final void t(int r2) {
            r1 = this;
            bv r0 = r1.h
            r0.m(r2)
            return
    }
}
