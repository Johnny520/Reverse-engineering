package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ez {
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView a;

    public /* synthetic */ ez(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public void a(defpackage.x1 r4) {
            r3 = this;
            int r0 = r4.a
            r1 = 1
            androidx.recyclerview.widget.RecyclerView r2 = r3.a
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L26
            r1 = 4
            if (r0 == r1) goto L1c
            r1 = 8
            if (r0 == r1) goto L12
            return
        L12:
            nz r0 = r2.l
            int r1 = r4.b
            int r4 = r4.c
            r0.W(r1, r4)
            return
        L1c:
            nz r0 = r2.l
            int r1 = r4.b
            int r4 = r4.c
            r0.Y(r1, r4)
            return
        L26:
            nz r0 = r2.l
            int r1 = r4.b
            int r4 = r4.c
            r0.X(r1, r4)
            return
        L30:
            nz r0 = r2.l
            int r1 = r4.b
            int r4 = r4.c
            r0.U(r1, r4)
            return
    }

    public defpackage.b00 b(int r8) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.a
            r5 r1 = r0.e
            int r1 = r1.t()
            r2 = 0
            r3 = 0
            r4 = r2
        Lb:
            if (r3 >= r1) goto L39
            r5 r5 = r0.e
            android.view.View r5 = r5.s(r3)
            b00 r5 = androidx.recyclerview.widget.RecyclerView.I(r5)
            if (r5 == 0) goto L36
            boolean r6 = r5.h()
            if (r6 != 0) goto L36
            int r6 = r5.c
            if (r6 == r8) goto L24
            goto L36
        L24:
            r5 r4 = r0.e
            android.view.View r6 = r5.a
            java.lang.Object r4 = r4.d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L34
            r4 = r5
            goto L36
        L34:
            r4 = r5
            goto L39
        L36:
            int r3 = r3 + 1
            goto Lb
        L39:
            if (r4 != 0) goto L3c
            goto L4a
        L3c:
            r5 r8 = r0.e
            android.view.View r0 = r4.a
            java.lang.Object r8 = r8.d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L4b
        L4a:
            return r2
        L4b:
            return r4
    }

    public void c(int r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.a
            r5 r1 = r0.e
            int r1 = r1.t()
            int r10 = r10 + r9
            r2 = 0
        La:
            r3 = 2
            r4 = 1
            if (r2 >= r1) goto L3a
            r5 r5 = r0.e
            android.view.View r5 = r5.s(r2)
            b00 r6 = androidx.recyclerview.widget.RecyclerView.I(r5)
            if (r6 == 0) goto L37
            boolean r7 = r6.o()
            if (r7 == 0) goto L21
            goto L37
        L21:
            int r7 = r6.c
            if (r7 < r9) goto L37
            if (r7 >= r10) goto L37
            r6.a(r3)
            r3 = 1024(0x400, float:1.435E-42)
            r6.a(r3)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            r3.c = r4
        L37:
            int r2 = r2 + 1
            goto La
        L3a:
            tz r1 = r0.b
            java.util.ArrayList r2 = r1.c
            int r5 = r2.size()
            int r5 = r5 - r4
        L43:
            if (r5 < 0) goto L5d
            java.lang.Object r6 = r2.get(r5)
            b00 r6 = (defpackage.b00) r6
            if (r6 != 0) goto L4e
            goto L5a
        L4e:
            int r7 = r6.c
            if (r7 < r9) goto L5a
            if (r7 >= r10) goto L5a
            r6.a(r3)
            r1.e(r5)
        L5a:
            int r5 = r5 + (-1)
            goto L43
        L5d:
            r0.g0 = r4
            return
    }

    public void d(int r8, int r9) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.a
            r5 r1 = r0.e
            int r1 = r1.t()
            r2 = 0
            r3 = r2
        La:
            r4 = 1
            if (r3 >= r1) goto L2d
            r5 r5 = r0.e
            android.view.View r5 = r5.s(r3)
            b00 r5 = androidx.recyclerview.widget.RecyclerView.I(r5)
            if (r5 == 0) goto L2a
            boolean r6 = r5.o()
            if (r6 != 0) goto L2a
            int r6 = r5.c
            if (r6 < r8) goto L2a
            r5.l(r9, r2)
            yz r5 = r0.c0
            r5.f = r4
        L2a:
            int r3 = r3 + 1
            goto La
        L2d:
            tz r1 = r0.b
            java.util.ArrayList r1 = r1.c
            int r3 = r1.size()
        L35:
            if (r2 >= r3) goto L49
            java.lang.Object r5 = r1.get(r2)
            b00 r5 = (defpackage.b00) r5
            if (r5 == 0) goto L46
            int r6 = r5.c
            if (r6 < r8) goto L46
            r5.l(r9, r4)
        L46:
            int r2 = r2 + 1
            goto L35
        L49:
            r0.requestLayout()
            r0.f0 = r4
            return
    }

    public void e(int r12, int r13) {
            r11 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r11.a
            r5 r1 = r0.e
            int r1 = r1.t()
            r2 = -1
            r3 = 1
            if (r12 >= r13) goto L10
            r4 = r12
            r5 = r13
            r6 = r2
            goto L13
        L10:
            r5 = r12
            r4 = r13
            r6 = r3
        L13:
            r7 = 0
            r8 = r7
        L15:
            if (r8 >= r1) goto L3c
            r5 r9 = r0.e
            android.view.View r9 = r9.s(r8)
            b00 r9 = androidx.recyclerview.widget.RecyclerView.I(r9)
            if (r9 == 0) goto L39
            int r10 = r9.c
            if (r10 < r4) goto L39
            if (r10 <= r5) goto L2a
            goto L39
        L2a:
            if (r10 != r12) goto L32
            int r10 = r13 - r12
            r9.l(r10, r7)
            goto L35
        L32:
            r9.l(r6, r7)
        L35:
            yz r9 = r0.c0
            r9.f = r3
        L39:
            int r8 = r8 + 1
            goto L15
        L3c:
            tz r1 = r0.b
            java.util.ArrayList r1 = r1.c
            if (r12 >= r13) goto L45
            r4 = r12
            r5 = r13
            goto L48
        L45:
            r5 = r12
            r4 = r13
            r2 = r3
        L48:
            int r6 = r1.size()
            r8 = r7
        L4d:
            if (r8 >= r6) goto L6c
            java.lang.Object r9 = r1.get(r8)
            b00 r9 = (defpackage.b00) r9
            if (r9 == 0) goto L69
            int r10 = r9.c
            if (r10 < r4) goto L69
            if (r10 <= r5) goto L5e
            goto L69
        L5e:
            if (r10 != r12) goto L66
            int r10 = r13 - r12
            r9.l(r10, r7)
            goto L69
        L66:
            r9.l(r2, r7)
        L69:
            int r8 = r8 + 1
            goto L4d
        L6c:
            r0.requestLayout()
            r0.f0 = r3
            return
    }

    public void f(defpackage.b00 r9, defpackage.lw r10, defpackage.lw r11) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.a
            r0.getClass()
            r1 = 0
            r9.n(r1)
            jz r1 = r0.H
            r2 = r1
            uf r2 = (defpackage.uf) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.a
            int r6 = r11.a
            if (r4 != r6) goto L22
            int r1 = r10.b
            int r3 = r11.b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.b
            int r7 = r11.b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.l(r3)
            android.view.View r9 = r3.a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.S()
        L40:
            return
    }

    public void g(defpackage.b00 r9, defpackage.lw r10, defpackage.lw r11) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.a
            tz r1 = r0.b
            r1.j(r9)
            r0.f(r9)
            r1 = 0
            r9.n(r1)
            jz r1 = r0.H
            r2 = r1
            uf r2 = (defpackage.uf) r2
            r2.getClass()
            int r4 = r10.a
            int r5 = r10.b
            android.view.View r10 = r9.a
            if (r11 != 0) goto L24
            int r1 = r10.getLeft()
        L22:
            r6 = r1
            goto L27
        L24:
            int r1 = r11.a
            goto L22
        L27:
            if (r11 != 0) goto L2f
            int r11 = r10.getTop()
        L2d:
            r7 = r11
            goto L32
        L2f:
            int r11 = r11.b
            goto L2d
        L32:
            boolean r11 = r9.h()
            if (r11 != 0) goto L3d
            if (r4 != r6) goto L3f
            if (r5 == r7) goto L3d
            goto L3f
        L3d:
            r3 = r9
            goto L52
        L3f:
            int r11 = r10.getWidth()
            int r11 = r11 + r6
            int r1 = r10.getHeight()
            int r1 = r1 + r7
            r10.layout(r6, r7, r11, r1)
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L5b
        L52:
            r2.l(r3)
            java.util.ArrayList r9 = r2.h
            r9.add(r3)
            r9 = 1
        L5b:
            if (r9 == 0) goto L60
            r0.S()
        L60:
            return
    }

    public void h(int r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.a
            android.view.View r1 = r0.getChildAt(r3)
            if (r1 == 0) goto Le
            androidx.recyclerview.widget.RecyclerView.I(r1)
            r1.clearAnimation()
        Le:
            r0.removeViewAt(r3)
            return
    }
}
