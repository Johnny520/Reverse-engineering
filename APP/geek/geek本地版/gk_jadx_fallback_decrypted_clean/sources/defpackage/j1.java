package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements defpackage.dv {
    public final android.content.Context a;
    public android.content.Context b;
    public defpackage.ku c;
    public final android.view.LayoutInflater d;
    public defpackage.cv e;
    public final int f;
    public final int g;
    public defpackage.fv h;
    public defpackage.i1 i;
    public android.graphics.drawable.Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final android.util.SparseBooleanArray r;
    public defpackage.f1 s;
    public defpackage.f1 t;
    public defpackage.h1 u;
    public defpackage.g1 v;
    public final defpackage.l0 w;

    public j1(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.d = r2
            r2 = 2131492867(0x7f0c0003, float:1.8609198E38)
            r1.f = r2
            r2 = 2131492866(0x7f0c0002, float:1.8609196E38)
            r1.g = r2
            android.util.SparseBooleanArray r2 = new android.util.SparseBooleanArray
            r2.<init>()
            r1.r = r2
            l0 r2 = new l0
            r0 = 1
            r2.<init>(r0, r1)
            r1.w = r2
            return
    }

    @Override // defpackage.dv
    public final void a(defpackage.ku r3, boolean r4) {
            r2 = this;
            r2.f()
            f1 r0 = r2.t
            if (r0 == 0) goto L12
            boolean r1 = r0.b()
            if (r1 == 0) goto L12
            tu r0 = r0.i
            r0.dismiss()
        L12:
            cv r0 = r2.e
            if (r0 == 0) goto L19
            r0.a(r3, r4)
        L19:
            return
    }

    public final android.view.View b(defpackage.ou r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.View r0 = r4.getActionView()
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r2 = r4.e()
            if (r2 == 0) goto L3e
        Ld:
            boolean r0 = r5 instanceof defpackage.ev
            if (r0 == 0) goto L14
            ev r5 = (defpackage.ev) r5
            goto L1e
        L14:
            android.view.LayoutInflater r5 = r3.d
            int r0 = r3.g
            android.view.View r5 = r5.inflate(r0, r6, r1)
            ev r5 = (defpackage.ev) r5
        L1e:
            r5.c(r4)
            fv r0 = r3.h
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r2 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            r2.setItemInvoker(r0)
            g1 r0 = r3.v
            if (r0 != 0) goto L36
            g1 r0 = new g1
            r0.<init>(r3)
            r3.v = r0
        L36:
            g1 r0 = r3.v
            r2.setPopupCallback(r0)
            r0 = r5
            android.view.View r0 = (android.view.View) r0
        L3e:
            boolean r4 = r4.C
            if (r4 == 0) goto L44
            r1 = 8
        L44:
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionMenuView r6 = (androidx.appcompat.widget.ActionMenuView) r6
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            r6.getClass()
            boolean r5 = r4 instanceof defpackage.l1
            if (r5 != 0) goto L5b
            l1 r4 = androidx.appcompat.widget.ActionMenuView.k(r4)
            r0.setLayoutParams(r4)
        L5b:
            return r0
    }

    @Override // defpackage.dv
    public final boolean c() {
            r17 = this;
            r0 = r17
            ku r1 = r0.c
            r3 = 0
            if (r1 == 0) goto L10
            java.util.ArrayList r1 = r1.l()
            int r4 = r1.size()
            goto L12
        L10:
            r4 = r3
            r1 = 0
        L12:
            int r5 = r0.p
            int r6 = r0.o
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            fv r8 = r0.h
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9 = r3
            r10 = r9
            r11 = r10
            r12 = r11
        L22:
            r13 = 2
            r14 = 1
            if (r9 >= r4) goto L4a
            java.lang.Object r15 = r1.get(r9)
            ou r15 = (defpackage.ou) r15
            int r3 = r15.y
            r2 = r3 & 2
            if (r2 != r13) goto L35
            int r11 = r11 + 1
            goto L3d
        L35:
            r2 = r3 & 1
            if (r2 != r14) goto L3c
            int r12 = r12 + 1
            goto L3d
        L3c:
            r10 = r14
        L3d:
            boolean r2 = r0.q
            if (r2 == 0) goto L46
            boolean r2 = r15.C
            if (r2 == 0) goto L46
            r5 = 0
        L46:
            int r9 = r9 + 1
            r3 = 0
            goto L22
        L4a:
            boolean r2 = r0.l
            if (r2 == 0) goto L55
            if (r10 != 0) goto L53
            int r12 = r12 + r11
            if (r12 <= r5) goto L55
        L53:
            int r5 = r5 + (-1)
        L55:
            int r5 = r5 - r11
            android.util.SparseBooleanArray r2 = r0.r
            r2.clear()
            r3 = 0
            r9 = 0
        L5d:
            if (r3 >= r4) goto Lfb
            java.lang.Object r10 = r1.get(r3)
            ou r10 = (defpackage.ou) r10
            int r11 = r10.y
            r12 = r11 & 2
            if (r12 != r13) goto L6d
            r12 = r14
            goto L6e
        L6d:
            r12 = 0
        L6e:
            int r15 = r10.b
            if (r12 == 0) goto L8d
            r12 = 0
            android.view.View r11 = r0.b(r10, r12, r8)
            r11.measure(r7, r7)
            int r11 = r11.getMeasuredWidth()
            int r6 = r6 - r11
            if (r9 != 0) goto L82
            r9 = r11
        L82:
            if (r15 == 0) goto L87
            r2.put(r15, r14)
        L87:
            r10.f(r14)
        L8a:
            r0 = 0
            goto Lf3
        L8d:
            r11 = r11 & 1
            if (r11 != r14) goto Lef
            boolean r11 = r2.get(r15)
            if (r5 > 0) goto L99
            if (r11 == 0) goto L9d
        L99:
            if (r6 <= 0) goto L9d
            r12 = r14
            goto L9e
        L9d:
            r12 = 0
        L9e:
            r13 = 0
            if (r12 == 0) goto Lb8
            android.view.View r14 = r0.b(r10, r13, r8)
            r14.measure(r7, r7)
            int r14 = r14.getMeasuredWidth()
            int r6 = r6 - r14
            if (r9 != 0) goto Lb0
            r9 = r14
        Lb0:
            int r14 = r6 + r9
            if (r14 <= 0) goto Lb6
            r14 = 1
            goto Lb7
        Lb6:
            r14 = 0
        Lb7:
            r12 = r12 & r14
        Lb8:
            if (r12 == 0) goto Lc1
            if (r15 == 0) goto Lc1
            r14 = 1
            r2.put(r15, r14)
            goto Le7
        Lc1:
            if (r11 == 0) goto Le7
            r11 = 0
            r2.put(r15, r11)
            r11 = 0
        Lc8:
            if (r11 >= r3) goto Le7
            java.lang.Object r14 = r1.get(r11)
            ou r14 = (defpackage.ou) r14
            int r13 = r14.b
            if (r13 != r15) goto Le1
            int r13 = r14.x
            r0 = 32
            r13 = r13 & r0
            if (r13 != r0) goto Ldd
            int r5 = r5 + 1
        Ldd:
            r0 = 0
            r14.f(r0)
        Le1:
            int r11 = r11 + 1
            r13 = 0
            r0 = r17
            goto Lc8
        Le7:
            if (r12 == 0) goto Leb
            int r5 = r5 + (-1)
        Leb:
            r10.f(r12)
            goto L8a
        Lef:
            r0 = 0
            r10.f(r0)
        Lf3:
            int r3 = r3 + 1
            r13 = 2
            r0 = r17
            r14 = 1
            goto L5d
        Lfb:
            r16 = r14
            return r16
    }

    @Override // defpackage.dv
    public final boolean d(defpackage.ou r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.dv
    public final void e(defpackage.cv r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final boolean f() {
            r3 = this;
            h1 r0 = r3.u
            r1 = 1
            if (r0 == 0) goto L12
            fv r2 = r3.h
            if (r2 == 0) goto L12
            android.view.View r2 = (android.view.View) r2
            r2.removeCallbacks(r0)
            r0 = 0
            r3.u = r0
            return r1
        L12:
            f1 r0 = r3.s
            if (r0 == 0) goto L22
            boolean r2 = r0.b()
            if (r2 == 0) goto L21
            tu r0 = r0.i
            r0.dismiss()
        L21:
            return r1
        L22:
            r0 = 0
            return r0
    }

    @Override // defpackage.dv
    public final boolean g(defpackage.ou r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.dv
    public final void h() {
            r11 = this;
            fv r0 = r11.h
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto La
            goto L78
        La:
            ku r3 = r11.c
            if (r3 == 0) goto L62
            r3.i()
            ku r3 = r11.c
            java.util.ArrayList r3 = r3.l()
            int r4 = r3.size()
            r5 = r2
            r6 = r5
        L1d:
            if (r5 >= r4) goto L63
            java.lang.Object r7 = r3.get(r5)
            ou r7 = (defpackage.ou) r7
            int r8 = r7.x
            r9 = 32
            r8 = r8 & r9
            if (r8 != r9) goto L5f
            android.view.View r8 = r0.getChildAt(r6)
            boolean r9 = r8 instanceof defpackage.ev
            if (r9 == 0) goto L3c
            r9 = r8
            ev r9 = (defpackage.ev) r9
            ou r9 = r9.getItemData()
            goto L3d
        L3c:
            r9 = r1
        L3d:
            android.view.View r10 = r11.b(r7, r8, r0)
            if (r7 == r9) goto L49
            r10.setPressed(r2)
            r10.jumpDrawablesToCurrentState()
        L49:
            if (r10 == r8) goto L5d
            android.view.ViewParent r7 = r10.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 == 0) goto L56
            r7.removeView(r10)
        L56:
            fv r7 = r11.h
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.addView(r10, r6)
        L5d:
            int r6 = r6 + 1
        L5f:
            int r5 = r5 + 1
            goto L1d
        L62:
            r6 = r2
        L63:
            int r3 = r0.getChildCount()
            if (r6 >= r3) goto L78
            android.view.View r3 = r0.getChildAt(r6)
            i1 r4 = r11.i
            if (r3 != r4) goto L74
            int r6 = r6 + 1
            goto L63
        L74:
            r0.removeViewAt(r6)
            goto L63
        L78:
            fv r0 = r11.h
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            ku r0 = r11.c
            if (r0 == 0) goto L9a
            r0.i()
            java.util.ArrayList r0 = r0.i
            int r3 = r0.size()
            r4 = r2
        L8d:
            if (r4 >= r3) goto L9a
            java.lang.Object r5 = r0.get(r4)
            ou r5 = (defpackage.ou) r5
            pu r5 = r5.A
            int r4 = r4 + 1
            goto L8d
        L9a:
            ku r0 = r11.c
            if (r0 == 0) goto La3
            r0.i()
            java.util.ArrayList r1 = r0.j
        La3:
            boolean r0 = r11.l
            r3 = 1
            if (r0 == 0) goto Lbe
            if (r1 == 0) goto Lbe
            int r0 = r1.size()
            if (r0 != r3) goto Lbb
            java.lang.Object r0 = r1.get(r2)
            ou r0 = (defpackage.ou) r0
            boolean r0 = r0.C
            r2 = r0 ^ 1
            goto Lbe
        Lbb:
            if (r0 <= 0) goto Lbe
            r2 = r3
        Lbe:
            if (r2 == 0) goto Lf3
            i1 r0 = r11.i
            if (r0 != 0) goto Lcd
            i1 r0 = new i1
            android.content.Context r1 = r11.a
            r0.<init>(r11, r1)
            r11.i = r0
        Lcd:
            i1 r0 = r11.i
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            fv r1 = r11.h
            if (r0 == r1) goto L106
            if (r0 == 0) goto Le0
            i1 r1 = r11.i
            r0.removeView(r1)
        Le0:
            fv r0 = r11.h
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            i1 r1 = r11.i
            r0.getClass()
            l1 r2 = androidx.appcompat.widget.ActionMenuView.j()
            r2.a = r3
            r0.addView(r1, r2)
            goto L106
        Lf3:
            i1 r0 = r11.i
            if (r0 == 0) goto L106
            android.view.ViewParent r0 = r0.getParent()
            fv r1 = r11.h
            if (r0 != r1) goto L106
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            i1 r0 = r11.i
            r1.removeView(r0)
        L106:
            fv r0 = r11.h
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            boolean r1 = r11.l
            r0.setOverflowReserved(r1)
            return
    }

    @Override // defpackage.dv
    public final void i(android.content.Context r5, defpackage.ku r6) {
            r4 = this;
            r4.b = r5
            android.view.LayoutInflater.from(r5)
            r4.c = r6
            android.content.res.Resources r6 = r5.getResources()
            boolean r0 = r4.m
            if (r0 != 0) goto L12
            r0 = 1
            r4.l = r0
        L12:
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            r1 = 2
            int r0 = r0 / r1
            r4.n = r0
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r0 = r5.screenWidthDp
            int r2 = r5.screenHeightDp
            int r5 = r5.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r5 > r3) goto L5a
            if (r0 > r3) goto L5a
            r5 = 720(0x2d0, float:1.009E-42)
            r3 = 960(0x3c0, float:1.345E-42)
            if (r0 <= r3) goto L3c
            if (r2 > r5) goto L5a
        L3c:
            if (r0 <= r5) goto L41
            if (r2 <= r3) goto L41
            goto L5a
        L41:
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r5) goto L58
            r5 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r0 <= r3) goto L4d
            if (r2 > r5) goto L58
        L4d:
            if (r0 <= r5) goto L52
            if (r2 <= r3) goto L52
            goto L58
        L52:
            r5 = 360(0x168, float:5.04E-43)
            if (r0 < r5) goto L5b
            r1 = 3
            goto L5b
        L58:
            r1 = 4
            goto L5b
        L5a:
            r1 = 5
        L5b:
            r4.p = r1
            int r5 = r4.n
            boolean r0 = r4.l
            r1 = 0
            if (r0 == 0) goto L90
            i1 r0 = r4.i
            if (r0 != 0) goto L88
            i1 r0 = new i1
            android.content.Context r2 = r4.a
            r0.<init>(r4, r2)
            r4.i = r0
            boolean r2 = r4.k
            r3 = 0
            if (r2 == 0) goto L7f
            android.graphics.drawable.Drawable r2 = r4.j
            r0.setImageDrawable(r2)
            r4.j = r1
            r4.k = r3
        L7f:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            i1 r1 = r4.i
            r1.measure(r0, r0)
        L88:
            i1 r0 = r4.i
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            goto L92
        L90:
            r4.i = r1
        L92:
            r4.o = r5
            android.util.DisplayMetrics r5 = r6.getDisplayMetrics()
            float r5 = r5.density
            return
    }

    public final boolean j() {
            r1 = this;
            f1 r0 = r1.s
            if (r0 == 0) goto Lc
            boolean r0 = r0.b()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // defpackage.dv
    public final boolean k(defpackage.c50 r9) {
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            goto L3c
        L8:
            r0 = r9
        L9:
            ku r2 = r0.z
            ku r3 = r8.c
            if (r2 == r3) goto L13
            r0 = r2
            c50 r0 = (defpackage.c50) r0
            goto L9
        L13:
            ou r0 = r0.A
            fv r2 = r8.h
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L1d
            goto L3a
        L1d:
            int r4 = r2.getChildCount()
            r5 = r1
        L22:
            if (r5 >= r4) goto L3a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof defpackage.ev
            if (r7 == 0) goto L37
            r7 = r6
            ev r7 = (defpackage.ev) r7
            ou r7 = r7.getItemData()
            if (r7 != r0) goto L37
            r3 = r6
            goto L3a
        L37:
            int r5 = r5 + 1
            goto L22
        L3a:
            if (r3 != 0) goto L3d
        L3c:
            return r1
        L3d:
            ou r0 = r9.A
            r0.getClass()
            java.util.ArrayList r0 = r9.f
            int r0 = r0.size()
            r2 = r1
        L49:
            r4 = 1
            if (r2 >= r0) goto L61
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L5e
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L5e
            r0 = r4
            goto L62
        L5e:
            int r2 = r2 + 1
            goto L49
        L61:
            r0 = r1
        L62:
            f1 r2 = new f1
            android.content.Context r5 = r8.b
            r2.<init>(r8, r5, r9, r3)
            r8.t = r2
            r2.g = r0
            tu r2 = r2.i
            if (r2 == 0) goto L74
            r2.o(r0)
        L74:
            f1 r0 = r8.t
            boolean r2 = r0.b()
            if (r2 == 0) goto L7d
            goto L84
        L7d:
            android.view.View r2 = r0.e
            if (r2 == 0) goto L8c
            r0.d(r1, r1, r1, r1)
        L84:
            cv r0 = r8.e
            if (r0 == 0) goto L8b
            r0.q(r9)
        L8b:
            return r4
        L8c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
    }

    public final boolean l() {
            r4 = this;
            boolean r0 = r4.l
            if (r0 == 0) goto L3d
            boolean r0 = r4.j()
            if (r0 != 0) goto L3d
            ku r0 = r4.c
            if (r0 == 0) goto L3d
            fv r1 = r4.h
            if (r1 == 0) goto L3d
            h1 r1 = r4.u
            if (r1 != 0) goto L3d
            r0.i()
            java.util.ArrayList r0 = r0.j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3d
            f1 r0 = new f1
            android.content.Context r1 = r4.b
            ku r2 = r4.c
            i1 r3 = r4.i
            r0.<init>(r4, r1, r2, r3)
            h1 r1 = new h1
            r2 = 0
            r1.<init>(r4, r2, r0)
            r4.u = r1
            fv r0 = r4.h
            android.view.View r0 = (android.view.View) r0
            r0.post(r1)
            r0 = 1
            return r0
        L3d:
            r0 = 0
            return r0
    }
}
