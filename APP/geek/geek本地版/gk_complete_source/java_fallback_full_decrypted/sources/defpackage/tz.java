package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tz {
    public final java.util.ArrayList a;
    public java.util.ArrayList b;
    public final java.util.ArrayList c;
    public final java.util.List d;
    public int e;
    public int f;
    public defpackage.sz g;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView h;

    public tz(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            r1.<init>()
            r1.h = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.a = r2
            r0 = 0
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.d = r2
            r2 = 2
            r1.e = r2
            r1.f = r2
            return
    }

    public final void a(defpackage.b00 r5, boolean r6) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView.j(r5)
            android.view.View r0 = r5.a
            androidx.recyclerview.widget.RecyclerView r1 = r4.h
            d00 r2 = r1.j0
            r3 = 0
            if (r2 == 0) goto L1d
            c00 r2 = r2.e
            if (r2 == 0) goto L19
            java.util.WeakHashMap r2 = r2.e
            java.lang.Object r2 = r2.remove(r0)
            x r2 = (defpackage.x) r2
            goto L1a
        L19:
            r2 = r3
        L1a:
            defpackage.ja0.l(r0, r2)
        L1d:
            if (r6 == 0) goto L28
            yz r6 = r1.c0
            if (r6 == 0) goto L28
            d4 r6 = r1.f
            r6.J(r5)
        L28:
            r5.r = r3
            sz r6 = r4.c()
            r6.getClass()
            int r0 = r5.f
            rz r1 = r6.a(r0)
            java.util.ArrayList r1 = r1.a
            android.util.SparseArray r6 = r6.a
            java.lang.Object r6 = r6.get(r0)
            rz r6 = (defpackage.rz) r6
            int r6 = r6.b
            int r0 = r1.size()
            if (r6 > r0) goto L4a
            return
        L4a:
            r5.m()
            r1.add(r5)
            return
    }

    public final int b(int r5) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.h
            if (r5 < 0) goto L1b
            yz r1 = r0.c0
            int r1 = r1.b()
            if (r5 >= r1) goto L1b
            yz r1 = r0.c0
            boolean r1 = r1.g
            if (r1 != 0) goto L13
            return r5
        L13:
            y1 r0 = r0.d
            r1 = 0
            int r5 = r0.e(r5, r1)
            return r5
        L1b:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "invalid position "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ". State item count is "
            r2.append(r5)
            yz r5 = r0.c0
            int r5 = r5.b()
            r2.append(r5)
            java.lang.String r5 = r0.y()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    public final defpackage.sz c() {
            r2 = this;
            sz r0 = r2.g
            if (r0 != 0) goto L15
            sz r0 = new sz
            r0.<init>()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.a = r1
            r1 = 0
            r0.b = r1
            r2.g = r0
        L15:
            sz r0 = r2.g
            return r0
    }

    public final void d() {
            r3 = this;
            java.util.ArrayList r0 = r3.c
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L8:
            if (r1 < 0) goto L10
            r3.e(r1)
            int r1 = r1 + (-1)
            goto L8
        L10:
            r0.clear()
            int[] r0 = androidx.recyclerview.widget.RecyclerView.s0
            androidx.recyclerview.widget.RecyclerView r0 = r3.h
            bn r0 = r0.b0
            int[] r1 = r0.c
            if (r1 == 0) goto L21
            r2 = -1
            java.util.Arrays.fill(r1, r2)
        L21:
            r1 = 0
            r0.d = r1
            return
    }

    public final void e(int r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.c
            java.lang.Object r1 = r0.get(r4)
            b00 r1 = (defpackage.b00) r1
            r2 = 1
            r3.a(r1, r2)
            r0.remove(r4)
            return
    }

    public final void f(android.view.View r4) {
            r3 = this;
            b00 r0 = androidx.recyclerview.widget.RecyclerView.I(r4)
            boolean r1 = r0.j()
            androidx.recyclerview.widget.RecyclerView r2 = r3.h
            if (r1 == 0) goto L10
            r1 = 0
            r2.removeDetachedView(r4, r1)
        L10:
            boolean r4 = r0.i()
            if (r4 == 0) goto L1c
            tz r4 = r0.n
            r4.j(r0)
            goto L28
        L1c:
            boolean r4 = r0.p()
            if (r4 == 0) goto L28
            int r4 = r0.j
            r4 = r4 & (-33)
            r0.j = r4
        L28:
            r3.g(r0)
            jz r4 = r2.H
            if (r4 == 0) goto L3a
            boolean r4 = r0.g()
            if (r4 != 0) goto L3a
            jz r4 = r2.H
            r4.d(r0)
        L3a:
            return
    }

    public final void g(defpackage.b00 r12) {
            r11 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r11.h
            bn r1 = r0.b0
            boolean r2 = r12.i()
            android.view.View r3 = r12.a
            r4 = 0
            r5 = 1
            if (r2 != 0) goto Le6
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L16
            goto Le6
        L16:
            boolean r2 = r12.j()
            if (r2 != 0) goto Lcb
            boolean r2 = r12.o()
            if (r2 != 0) goto Lb3
            int r2 = r12.j
            r2 = r2 & 16
            if (r2 != 0) goto L32
            java.util.WeakHashMap r2 = defpackage.ja0.a
            boolean r2 = defpackage.s90.i(r3)
            if (r2 == 0) goto L32
            r2 = r5
            goto L33
        L32:
            r2 = r4
        L33:
            boolean r3 = r12.g()
            if (r3 == 0) goto La3
            int r3 = r11.f
            if (r3 <= 0) goto L99
            int r3 = r12.j
            r3 = r3 & 526(0x20e, float:7.37E-43)
            if (r3 == 0) goto L44
            goto L99
        L44:
            java.util.ArrayList r3 = r11.c
            int r6 = r3.size()
            int r7 = r11.f
            if (r6 < r7) goto L55
            if (r6 <= 0) goto L55
            r11.e(r4)
            int r6 = r6 + (-1)
        L55:
            int[] r7 = androidx.recyclerview.widget.RecyclerView.s0
            if (r6 <= 0) goto L94
            int r7 = r12.c
            int[] r8 = r1.c
            if (r8 == 0) goto L70
            int r8 = r1.d
            int r8 = r8 * 2
            r9 = r4
        L64:
            if (r9 >= r8) goto L70
            int[] r10 = r1.c
            r10 = r10[r9]
            if (r10 != r7) goto L6d
            goto L94
        L6d:
            int r9 = r9 + 2
            goto L64
        L70:
            int r6 = r6 + (-1)
        L72:
            if (r6 < 0) goto L93
            java.lang.Object r7 = r3.get(r6)
            b00 r7 = (defpackage.b00) r7
            int r7 = r7.c
            int[] r8 = r1.c
            if (r8 == 0) goto L93
            int r8 = r1.d
            int r8 = r8 * 2
            r9 = r4
        L85:
            if (r9 >= r8) goto L93
            int[] r10 = r1.c
            r10 = r10[r9]
            if (r10 != r7) goto L90
            int r6 = r6 + (-1)
            goto L72
        L90:
            int r9 = r9 + 2
            goto L85
        L93:
            int r6 = r6 + r5
        L94:
            r3.add(r6, r12)
            r1 = r5
            goto L9a
        L99:
            r1 = r4
        L9a:
            if (r1 != 0) goto La1
            r11.a(r12, r5)
        L9f:
            r4 = r1
            goto La4
        La1:
            r5 = r4
            goto L9f
        La3:
            r5 = r4
        La4:
            d4 r0 = r0.f
            r0.J(r12)
            if (r4 != 0) goto Lb2
            if (r5 != 0) goto Lb2
            if (r2 == 0) goto Lb2
            r0 = 0
            r12.r = r0
        Lb2:
            return
        Lb3:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r1.<init>(r2)
            java.lang.String r0 = r0.y()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.<init>(r0)
            throw r12
        Lcb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r12 = r0.y()
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r1.<init>(r12)
            throw r1
        Le6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Scrapped or attached views may not be recycled. isScrap:"
            r2.<init>(r6)
            boolean r12 = r12.i()
            r2.append(r12)
            java.lang.String r12 = " isAttached:"
            r2.append(r12)
            android.view.ViewParent r12 = r3.getParent()
            if (r12 == 0) goto L102
            r4 = r5
        L102:
            r2.append(r4)
            java.lang.String r12 = r0.y()
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r1.<init>(r12)
            throw r1
    }

    public final void h(android.view.View r4) {
            r3 = this;
            b00 r4 = androidx.recyclerview.widget.RecyclerView.I(r4)
            int r0 = r4.j
            r0 = r0 & 12
            androidx.recyclerview.widget.RecyclerView r1 = r3.h
            if (r0 == 0) goto Ld
            goto L44
        Ld:
            boolean r0 = r4.k()
            if (r0 == 0) goto L44
            jz r0 = r1.H
            if (r0 == 0) goto L44
            java.util.List r2 = r4.c()
            uf r0 = (defpackage.uf) r0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L44
            boolean r0 = r0.g
            if (r0 == 0) goto L44
            boolean r0 = r4.f()
            if (r0 == 0) goto L2e
            goto L44
        L2e:
            java.util.ArrayList r0 = r3.b
            if (r0 != 0) goto L39
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.b = r0
        L39:
            r4.n = r3
            r0 = 1
            r4.o = r0
            java.util.ArrayList r0 = r3.b
            r0.add(r4)
            return
        L44:
            boolean r0 = r4.f()
            if (r0 == 0) goto L6f
            boolean r0 = r4.h()
            if (r0 != 0) goto L6f
            fz r0 = r1.k
            boolean r0 = r0.b
            if (r0 == 0) goto L57
            goto L6f
        L57:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            r0.<init>(r2)
            java.lang.String r1 = r1.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L6f:
            r4.n = r3
            r0 = 0
            r4.o = r0
            java.util.ArrayList r0 = r3.a
            r0.add(r4)
            return
    }

    public final defpackage.b00 i(int r28, long r29) {
            r27 = this;
            r1 = r27
            r0 = r28
            androidx.recyclerview.widget.RecyclerView r2 = r1.h
            yz r3 = r2.c0
            if (r0 < 0) goto L547
            int r4 = r3.b()
            if (r0 >= r4) goto L547
            boolean r4 = r3.g
            r5 = 32
            r8 = 0
            if (r4 == 0) goto L82
            java.util.ArrayList r4 = r1.b
            if (r4 == 0) goto L7b
            int r4 = r4.size()
            if (r4 != 0) goto L22
            goto L7b
        L22:
            r9 = r8
        L23:
            if (r9 >= r4) goto L40
            java.util.ArrayList r10 = r1.b
            java.lang.Object r10 = r10.get(r9)
            b00 r10 = (defpackage.b00) r10
            boolean r11 = r10.p()
            if (r11 != 0) goto L3d
            int r11 = r10.b()
            if (r11 != r0) goto L3d
            r10.a(r5)
            goto L7c
        L3d:
            int r9 = r9 + 1
            goto L23
        L40:
            fz r9 = r2.k
            boolean r9 = r9.b
            if (r9 == 0) goto L7b
            y1 r9 = r2.d
            int r9 = r9.e(r0, r8)
            if (r9 <= 0) goto L7b
            fz r10 = r2.k
            int r10 = r10.a()
            if (r9 >= r10) goto L7b
            fz r10 = r2.k
            long r9 = r10.b(r9)
            r11 = r8
        L5d:
            if (r11 >= r4) goto L7b
            java.util.ArrayList r12 = r1.b
            java.lang.Object r12 = r12.get(r11)
            b00 r12 = (defpackage.b00) r12
            boolean r13 = r12.p()
            if (r13 != 0) goto L78
            long r13 = r12.e
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 != 0) goto L78
            r12.a(r5)
            r10 = r12
            goto L7c
        L78:
            int r11 = r11 + 1
            goto L5d
        L7b:
            r10 = 0
        L7c:
            if (r10 == 0) goto L80
            r4 = 1
            goto L84
        L80:
            r4 = r8
            goto L84
        L82:
            r4 = r8
            r10 = 0
        L84:
            java.util.ArrayList r9 = r1.a
            java.util.ArrayList r11 = r1.c
            if (r10 != 0) goto L231
            int r10 = r9.size()
            r12 = r8
        L8f:
            if (r12 >= r10) goto Lbe
            java.lang.Object r13 = r9.get(r12)
            b00 r13 = (defpackage.b00) r13
            boolean r14 = r13.p()
            if (r14 != 0) goto Lbb
            int r14 = r13.b()
            if (r14 != r0) goto Lbb
            boolean r14 = r13.f()
            if (r14 != 0) goto Lbb
            boolean r14 = r3.g
            if (r14 != 0) goto Lb3
            boolean r14 = r13.h()
            if (r14 != 0) goto Lbb
        Lb3:
            r13.a(r5)
            r10 = r13
            r16 = 1
            goto L1b1
        Lbb:
            int r12 = r12 + 1
            goto L8f
        Lbe:
            r5 r10 = r2.e
            java.lang.Object r10 = r10.d
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r12 = r10.size()
            r13 = r8
        Lc9:
            if (r13 >= r12) goto Led
            java.lang.Object r14 = r10.get(r13)
            android.view.View r14 = (android.view.View) r14
            b00 r15 = androidx.recyclerview.widget.RecyclerView.I(r14)
            r16 = 1
            int r7 = r15.b()
            if (r7 != r0) goto Lea
            boolean r7 = r15.f()
            if (r7 != 0) goto Lea
            boolean r7 = r15.h()
            if (r7 != 0) goto Lea
            goto Lf0
        Lea:
            int r13 = r13 + 1
            goto Lc9
        Led:
            r16 = 1
            r14 = 0
        Lf0:
            if (r14 == 0) goto L189
            b00 r7 = androidx.recyclerview.widget.RecyclerView.I(r14)
            r5 r10 = r2.e
            java.lang.Object r12 = r10.c
            fa r12 = (defpackage.fa) r12
            java.lang.Object r13 = r10.b
            ez r13 = (defpackage.ez) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.a
            int r13 = r13.indexOfChild(r14)
            if (r13 < 0) goto L175
            boolean r15 = r12.d(r13)
            if (r15 == 0) goto L161
            r12.a(r13)
            r10.B(r14)
            r5 r10 = r2.e
            java.lang.Object r12 = r10.c
            fa r12 = (defpackage.fa) r12
            java.lang.Object r10 = r10.b
            ez r10 = (defpackage.ez) r10
            androidx.recyclerview.widget.RecyclerView r10 = r10.a
            int r10 = r10.indexOfChild(r14)
            r13 = -1
            if (r10 != r13) goto L129
        L127:
            r10 = r13
            goto L135
        L129:
            boolean r15 = r12.d(r10)
            if (r15 == 0) goto L130
            goto L127
        L130:
            int r12 = r12.b(r10)
            int r10 = r10 - r12
        L135:
            if (r10 == r13) goto L146
            r5 r12 = r2.e
            r12.d(r10)
            r1.h(r14)
            r10 = 8224(0x2020, float:1.1524E-41)
            r7.a(r10)
            r10 = r7
            goto L1b1
        L146:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "layout index should not be -1 after unhiding a view:"
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r2 = r2.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L161:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L175:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L189:
            int r7 = r11.size()
            r10 = r8
        L18e:
            if (r10 >= r7) goto L1b0
            java.lang.Object r12 = r11.get(r10)
            b00 r12 = (defpackage.b00) r12
            boolean r13 = r12.f()
            if (r13 != 0) goto L1ad
            int r13 = r12.b()
            if (r13 != r0) goto L1ad
            boolean r13 = r12.d()
            if (r13 != 0) goto L1ad
            r11.remove(r10)
            r10 = r12
            goto L1b1
        L1ad:
            int r10 = r10 + 1
            goto L18e
        L1b0:
            r10 = 0
        L1b1:
            if (r10 == 0) goto L233
            boolean r7 = r10.h()
            if (r7 == 0) goto L1bc
            boolean r7 = r3.g
            goto L1eb
        L1bc:
            int r7 = r10.c
            if (r7 < 0) goto L216
            fz r12 = r2.k
            int r12 = r12.a()
            if (r7 >= r12) goto L216
            boolean r7 = r3.g
            if (r7 != 0) goto L1d7
            fz r7 = r2.k
            r7.getClass()
            int r7 = r10.f
            if (r7 == 0) goto L1d7
        L1d5:
            r7 = r8
            goto L1eb
        L1d7:
            fz r7 = r2.k
            boolean r12 = r7.b
            if (r12 == 0) goto L1e9
            long r12 = r10.e
            int r14 = r10.c
            long r14 = r7.b(r14)
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L1d5
        L1e9:
            r7 = r16
        L1eb:
            if (r7 != 0) goto L213
            r7 = 4
            r10.a(r7)
            boolean r7 = r10.i()
            if (r7 == 0) goto L202
            android.view.View r7 = r10.a
            r2.removeDetachedView(r7, r8)
            tz r7 = r10.n
            r7.j(r10)
            goto L20e
        L202:
            boolean r7 = r10.p()
            if (r7 == 0) goto L20e
            int r7 = r10.j
            r7 = r7 & (-33)
            r10.j = r7
        L20e:
            r1.g(r10)
            r10 = 0
            goto L233
        L213:
            r4 = r16
            goto L233
        L216:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Inconsistency detected. Invalid view holder adapter position"
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r2 = r2.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L231:
            r16 = 1
        L233:
            r17 = 0
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r10 != 0) goto L3e3
            y1 r7 = r2.d
            int r7 = r7.e(r0, r8)
            if (r7 < 0) goto L3b3
            r21 = 3
            fz r12 = r2.k
            int r12 = r12.a()
            if (r7 >= r12) goto L3b3
            fz r12 = r2.k
            r12.getClass()
            fz r12 = r2.k
            boolean r13 = r12.b
            if (r13 == 0) goto L2ef
            long r12 = r12.b(r7)
            int r10 = r9.size()
            int r10 = r10 + (-1)
        L263:
            if (r10 < 0) goto L2b7
            java.lang.Object r23 = r9.get(r10)
            r24 = 4
            r14 = r23
            b00 r14 = (defpackage.b00) r14
            r23 = r7
            long r6 = r14.e
            android.view.View r15 = r14.a
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 != 0) goto L2b2
            boolean r6 = r14.p()
            if (r6 != 0) goto L2b2
            int r6 = r14.f
            if (r6 != 0) goto L29a
            r14.a(r5)
            boolean r5 = r14.h()
            if (r5 == 0) goto L298
            boolean r5 = r3.g
            if (r5 != 0) goto L298
            int r5 = r14.j
            r5 = r5 & (-15)
            r5 = r5 | 2
            r14.j = r5
        L298:
            r10 = r14
            goto L2e6
        L29a:
            r9.remove(r10)
            r2.removeDetachedView(r15, r8)
            b00 r6 = androidx.recyclerview.widget.RecyclerView.I(r15)
            r15 = 0
            r6.n = r15
            r6.o = r8
            int r7 = r6.j
            r7 = r7 & (-33)
            r6.j = r7
            r1.g(r6)
        L2b2:
            int r10 = r10 + (-1)
            r7 = r23
            goto L263
        L2b7:
            r23 = r7
            r24 = 4
            int r5 = r11.size()
            int r5 = r5 + (-1)
        L2c1:
            if (r5 < 0) goto L2e1
            java.lang.Object r6 = r11.get(r5)
            b00 r6 = (defpackage.b00) r6
            long r9 = r6.e
            int r7 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r7 != 0) goto L2e3
            boolean r7 = r6.d()
            if (r7 != 0) goto L2e3
            int r7 = r6.f
            if (r7 != 0) goto L2de
            r11.remove(r5)
            r10 = r6
            goto L2e6
        L2de:
            r1.e(r5)
        L2e1:
            r10 = 0
            goto L2e6
        L2e3:
            int r5 = r5 + (-1)
            goto L2c1
        L2e6:
            if (r10 == 0) goto L2f1
            r5 = r23
            r10.c = r5
            r4 = r16
            goto L2f1
        L2ef:
            r24 = 4
        L2f1:
            if (r10 != 0) goto L334
            sz r5 = r1.c()
            android.util.SparseArray r5 = r5.a
            java.lang.Object r5 = r5.get(r8)
            rz r5 = (defpackage.rz) r5
            if (r5 == 0) goto L329
            java.util.ArrayList r5 = r5.a
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L329
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L30f:
            if (r6 < 0) goto L329
            java.lang.Object r7 = r5.get(r6)
            b00 r7 = (defpackage.b00) r7
            boolean r7 = r7.d()
            if (r7 != 0) goto L326
            java.lang.Object r5 = r5.remove(r6)
            r26 = r5
            b00 r26 = (defpackage.b00) r26
            goto L32b
        L326:
            int r6 = r6 + (-1)
            goto L30f
        L329:
            r26 = 0
        L32b:
            if (r26 == 0) goto L332
            r26.m()
            int[] r5 = androidx.recyclerview.widget.RecyclerView.s0
        L332:
            r10 = r26
        L334:
            if (r10 != 0) goto L3b1
            long r5 = r2.getNanoTime()
            int r7 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r7 == 0) goto L358
            sz r7 = r1.g
            rz r7 = r7.a(r8)
            long r9 = r7.c
            int r7 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r7 == 0) goto L352
            long r9 = r9 + r5
            int r7 = (r9 > r29 ? 1 : (r9 == r29 ? 0 : -1))
            if (r7 >= 0) goto L350
            goto L352
        L350:
            r7 = r8
            goto L354
        L352:
            r7 = r16
        L354:
            if (r7 != 0) goto L358
            r15 = 0
            return r15
        L358:
            r15 = 0
            fz r7 = r2.k
            r7.getClass()
            java.lang.String r9 = "RV CreateView"
            int r10 = defpackage.n70.a     // Catch: java.lang.Throwable -> L3a1
            defpackage.m70.a(r9)     // Catch: java.lang.Throwable -> L3a1
            b00 r10 = r7.d(r2)     // Catch: java.lang.Throwable -> L3a1
            android.view.View r7 = r10.a     // Catch: java.lang.Throwable -> L3a1
            android.view.ViewParent r9 = r7.getParent()     // Catch: java.lang.Throwable -> L3a1
            if (r9 != 0) goto L3a3
            r10.f = r8     // Catch: java.lang.Throwable -> L3a1
            defpackage.m70.b()
            int[] r9 = androidx.recyclerview.widget.RecyclerView.s0
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.D(r7)
            if (r7 == 0) goto L385
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r7)
            r10.b = r9
        L385:
            long r11 = r2.getNanoTime()
            sz r7 = r1.g
            long r11 = r11 - r5
            rz r5 = r7.a(r8)
            long r6 = r5.c
            int r9 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r9 != 0) goto L397
            goto L39e
        L397:
            long r6 = r6 / r24
            long r6 = r6 * r21
            long r11 = r11 / r24
            long r11 = r11 + r6
        L39e:
            r5.c = r11
            goto L3e8
        L3a1:
            r0 = move-exception
            goto L3ab
        L3a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a1
            java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3a1
            throw r0     // Catch: java.lang.Throwable -> L3a1
        L3ab:
            int r2 = defpackage.n70.a
            defpackage.m70.b()
            throw r0
        L3b1:
            r15 = 0
            goto L3e8
        L3b3:
            r5 = r7
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Inconsistency detected. Invalid item position "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = "(offset:"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ").state:"
            r6.append(r0)
            int r0 = r3.b()
            r6.append(r0)
            java.lang.String r0 = r2.y()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.<init>(r0)
            throw r4
        L3e3:
            r15 = 0
            r21 = 3
            r24 = 4
        L3e8:
            android.view.View r5 = r10.a
            if (r4 == 0) goto L41a
            boolean r6 = r3.g
            if (r6 != 0) goto L41a
            int r6 = r10.j
            r7 = r6 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L3f9
            r7 = r16
            goto L3fa
        L3f9:
            r7 = r8
        L3fa:
            if (r7 == 0) goto L41a
            r6 = r6 & (-8193(0xffffffffffffdfff, float:NaN))
            r10.j = r6
            boolean r6 = r3.j
            if (r6 == 0) goto L41a
            defpackage.jz.b(r10)
            jz r6 = r2.H
            r10.c()
            r6.getClass()
            lw r6 = new lw
            r6.<init>()
            r6.a(r10)
            r2.T(r10, r6)
        L41a:
            boolean r6 = r3.g
            if (r6 == 0) goto L427
            boolean r6 = r10.e()
            if (r6 == 0) goto L427
            r10.g = r0
            goto L440
        L427:
            boolean r6 = r10.e()
            if (r6 == 0) goto L445
            int r6 = r10.j
            r6 = r6 & 2
            if (r6 == 0) goto L436
            r6 = r16
            goto L437
        L436:
            r6 = r8
        L437:
            if (r6 != 0) goto L445
            boolean r6 = r10.f()
            if (r6 == 0) goto L440
            goto L445
        L440:
            r0 = r8
            r7 = r16
            goto L519
        L445:
            y1 r6 = r2.d
            int r6 = r6.e(r0, r8)
            r10.r = r2
            int r7 = r10.f
            long r11 = r2.getNanoTime()
            int r9 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r9 == 0) goto L468
            sz r9 = r1.g
            rz r7 = r9.a(r7)
            long r13 = r7.d
            int r7 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r7 == 0) goto L468
            long r13 = r13 + r11
            int r7 = (r13 > r29 ? 1 : (r13 == r29 ? 0 : -1))
            if (r7 >= 0) goto L440
        L468:
            fz r7 = r2.k
            r7.getClass()
            r10.c = r6
            boolean r9 = r7.b
            if (r9 == 0) goto L479
            long r13 = r7.b(r6)
            r10.e = r13
        L479:
            int r9 = r10.j
            r9 = r9 & (-520(0xfffffffffffffdf8, float:NaN))
            r9 = r9 | 1
            r10.j = r9
            int r9 = defpackage.n70.a
            java.lang.String r9 = "RV OnBindView"
            defpackage.m70.a(r9)
            r10.c()
            r7.c(r10, r6)
            java.util.ArrayList r6 = r10.k
            if (r6 == 0) goto L495
            r6.clear()
        L495:
            int r6 = r10.j
            r6 = r6 & (-1025(0xfffffffffffffbff, float:NaN))
            r10.j = r6
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            boolean r7 = r6 instanceof defpackage.oz
            if (r7 == 0) goto L4a9
            oz r6 = (defpackage.oz) r6
            r7 = r16
            r6.c = r7
        L4a9:
            defpackage.m70.b()
            long r6 = r2.getNanoTime()
            sz r9 = r1.g
            int r13 = r10.f
            long r6 = r6 - r11
            rz r9 = r9.a(r13)
            long r11 = r9.d
            int r13 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r13 != 0) goto L4c0
            goto L4c7
        L4c0:
            long r11 = r11 / r24
            long r11 = r11 * r21
            long r6 = r6 / r24
            long r6 = r6 + r11
        L4c7:
            r9.d = r6
            android.view.accessibility.AccessibilityManager r6 = r2.x
            if (r6 == 0) goto L4d5
            boolean r6 = r6.isEnabled()
            if (r6 == 0) goto L4d5
            r7 = 1
            goto L4d6
        L4d5:
            r7 = r8
        L4d6:
            if (r7 == 0) goto L511
            java.util.WeakHashMap r6 = defpackage.ja0.a
            int r6 = defpackage.s90.c(r5)
            r7 = 1
            if (r6 != 0) goto L4e4
            defpackage.s90.s(r5, r7)
        L4e4:
            d00 r6 = r2.j0
            if (r6 != 0) goto L4e9
            goto L512
        L4e9:
            c00 r6 = r6.e
            if (r6 == 0) goto L50d
            android.view.View$AccessibilityDelegate r9 = defpackage.ja0.c(r5)
            if (r9 != 0) goto L4f4
            goto L504
        L4f4:
            boolean r11 = r9 instanceof defpackage.v
            if (r11 == 0) goto L4fe
            v r9 = (defpackage.v) r9
            x r9 = r9.a
            r15 = r9
            goto L504
        L4fe:
            x r11 = new x
            r11.<init>(r9)
            r15 = r11
        L504:
            if (r15 == 0) goto L50d
            if (r15 == r6) goto L50d
            java.util.WeakHashMap r9 = r6.e
            r9.put(r5, r15)
        L50d:
            defpackage.ja0.l(r5, r6)
            goto L512
        L511:
            r7 = 1
        L512:
            boolean r3 = r3.g
            if (r3 == 0) goto L518
            r10.g = r0
        L518:
            r0 = r7
        L519:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            if (r3 != 0) goto L529
            android.view.ViewGroup$LayoutParams r2 = r2.generateDefaultLayoutParams()
            oz r2 = (defpackage.oz) r2
            r5.setLayoutParams(r2)
            goto L53c
        L529:
            boolean r6 = r2.checkLayoutParams(r3)
            if (r6 != 0) goto L539
            android.view.ViewGroup$LayoutParams r2 = r2.generateLayoutParams(r3)
            oz r2 = (defpackage.oz) r2
            r5.setLayoutParams(r2)
            goto L53c
        L539:
            r2 = r3
            oz r2 = (defpackage.oz) r2
        L53c:
            r2.a = r10
            if (r4 == 0) goto L543
            if (r0 == 0) goto L543
            goto L544
        L543:
            r7 = r8
        L544:
            r2.d = r7
            return r10
        L547:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid item position "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = "("
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = "). Item count:"
            r5.append(r0)
            int r0 = r3.b()
            r5.append(r0)
            java.lang.String r0 = r2.y()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0)
            throw r4
    }

    public final void j(defpackage.b00 r2) {
            r1 = this;
            boolean r0 = r2.o
            if (r0 == 0) goto La
            java.util.ArrayList r0 = r1.b
            r0.remove(r2)
            goto Lf
        La:
            java.util.ArrayList r0 = r1.a
            r0.remove(r2)
        Lf:
            r0 = 0
            r2.n = r0
            r0 = 0
            r2.o = r0
            int r0 = r2.j
            r0 = r0 & (-33)
            r2.j = r0
            return
    }

    public final void k() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.h
            nz r0 = r0.l
            if (r0 == 0) goto L9
            int r0 = r0.j
            goto La
        L9:
            r0 = 0
        La:
            int r1 = r4.e
            int r1 = r1 + r0
            r4.f = r1
            java.util.ArrayList r0 = r4.c
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L17:
            if (r1 < 0) goto L27
            int r2 = r0.size()
            int r3 = r4.f
            if (r2 <= r3) goto L27
            r4.e(r1)
            int r1 = r1 + (-1)
            goto L17
        L27:
            return
    }
}
