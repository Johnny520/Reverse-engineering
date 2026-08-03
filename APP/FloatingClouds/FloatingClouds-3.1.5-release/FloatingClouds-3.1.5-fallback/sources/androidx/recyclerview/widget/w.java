package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f1016a;

    public w(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.<init>()
            r0.f1016a = r1
            return
    }

    public final void a(androidx.recyclerview.widget.C0506a.C0023a r4) {
            r3 = this;
            int r0 = r4.f991a
            r1 = 1
            androidx.recyclerview.widget.RecyclerView r2 = r3.f1016a
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L26
            r1 = 4
            if (r0 == r1) goto L1c
            r1 = 8
            if (r0 == r1) goto L12
            return
        L12:
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            int r1 = r4.b
            int r4 = r4.c
            r0.a0(r1, r4)
            return
        L1c:
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            int r1 = r4.b
            int r4 = r4.c
            r0.c0(r1, r4)
            return
        L26:
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            int r1 = r4.b
            int r4 = r4.c
            r0.b0(r1, r4)
            return
        L30:
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.m
            int r1 = r4.b
            int r4 = r4.c
            r0.Y(r1, r4)
            return
    }

    public final androidx.recyclerview.widget.RecyclerView.A b(int r8) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.f1016a
            androidx.recyclerview.widget.b r1 = r0.f
            int r1 = r1.h()
            r2 = 0
            r3 = 0
            r4 = r2
        Lb:
            if (r3 >= r1) goto L37
            androidx.recyclerview.widget.b r5 = r0.f
            android.view.View r5 = r5.g(r3)
            androidx.recyclerview.widget.RecyclerView$A r5 = androidx.recyclerview.widget.RecyclerView.L(r5)
            if (r5 == 0) goto L34
            boolean r6 = r5.h()
            if (r6 != 0) goto L34
            int r6 = r5.c
            if (r6 == r8) goto L24
            goto L34
        L24:
            androidx.recyclerview.widget.b r4 = r0.f
            java.util.ArrayList r4 = r4.c
            android.view.View r6 = r5.f963a
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L32
            r4 = r5
            goto L34
        L32:
            r4 = r5
            goto L37
        L34:
            int r3 = r3 + 1
            goto Lb
        L37:
            if (r4 != 0) goto L3a
            goto L51
        L3a:
            androidx.recyclerview.widget.b r8 = r0.f
            java.util.ArrayList r8 = r8.c
            android.view.View r0 = r4.f963a
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L52
            boolean r8 = androidx.recyclerview.widget.RecyclerView.z0
            if (r8 == 0) goto L51
            java.lang.String r8 = "RecyclerView"
            java.lang.String r0 = "assuming view holder cannot be find because it is hidden"
            android.util.Log.d(r8, r0)
        L51:
            return r2
        L52:
            return r4
    }

    public final void c(int r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f1016a
            androidx.recyclerview.widget.b r1 = r0.f
            int r1 = r1.h()
            int r10 = r10 + r9
            r2 = 0
        La:
            r3 = 1
            r4 = 2
            if (r2 >= r1) goto L3a
            androidx.recyclerview.widget.b r5 = r0.f
            android.view.View r5 = r5.g(r2)
            androidx.recyclerview.widget.RecyclerView$A r6 = androidx.recyclerview.widget.RecyclerView.L(r5)
            if (r6 == 0) goto L37
            boolean r7 = r6.o()
            if (r7 == 0) goto L21
            goto L37
        L21:
            int r7 = r6.c
            if (r7 < r9) goto L37
            if (r7 >= r10) goto L37
            r6.a(r4)
            r4 = 1024(0x400, float:1.435E-42)
            r6.a(r4)
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r4 = (androidx.recyclerview.widget.RecyclerView.m) r4
            r4.c = r3
        L37:
            int r2 = r2 + 1
            goto La
        L3a:
            androidx.recyclerview.widget.RecyclerView$r r1 = r0.c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r2 = r1.c
            int r5 = r2.size()
            int r5 = r5 - r3
        L43:
            if (r5 < 0) goto L5d
            java.lang.Object r6 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView$A r6 = (androidx.recyclerview.widget.RecyclerView.A) r6
            if (r6 != 0) goto L4e
            goto L5a
        L4e:
            int r7 = r6.c
            if (r7 < r9) goto L5a
            if (r7 >= r10) goto L5a
            r6.a(r4)
            r1.g(r5)
        L5a:
            int r5 = r5 + (-1)
            goto L43
        L5d:
            r0.j0 = r3
            return
    }

    public final void d(int r13, int r14) {
            r12 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r12.f1016a
            androidx.recyclerview.widget.b r1 = r0.f
            int r1 = r1.h()
            r2 = 0
            r3 = r2
        La:
            r4 = 1
            java.lang.String r5 = " now at position "
            java.lang.String r6 = " holder "
            java.lang.String r7 = "RecyclerView"
            if (r3 >= r1) goto L57
            androidx.recyclerview.widget.b r8 = r0.f
            android.view.View r8 = r8.g(r3)
            androidx.recyclerview.widget.RecyclerView$A r8 = androidx.recyclerview.widget.RecyclerView.L(r8)
            if (r8 == 0) goto L54
            boolean r9 = r8.o()
            if (r9 != 0) goto L54
            int r9 = r8.c
            if (r9 < r13) goto L54
            boolean r9 = androidx.recyclerview.widget.RecyclerView.z0
            if (r9 == 0) goto L4d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "offsetPositionRecordsForInsert attached child "
            r9.<init>(r10)
            r9.append(r3)
            r9.append(r6)
            r9.append(r8)
            r9.append(r5)
            int r5 = r8.c
            int r5 = r5 + r14
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            android.util.Log.d(r7, r5)
        L4d:
            r8.l(r14, r2)
            androidx.recyclerview.widget.RecyclerView$w r5 = r0.f0
            r5.f = r4
        L54:
            int r3 = r3 + 1
            goto La
        L57:
            androidx.recyclerview.widget.RecyclerView$r r1 = r0.c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r1 = r1.c
            int r3 = r1.size()
            r8 = r2
        L60:
            if (r8 >= r3) goto L98
            java.lang.Object r9 = r1.get(r8)
            androidx.recyclerview.widget.RecyclerView$A r9 = (androidx.recyclerview.widget.RecyclerView.A) r9
            if (r9 == 0) goto L95
            int r10 = r9.c
            if (r10 < r13) goto L95
            boolean r10 = androidx.recyclerview.widget.RecyclerView.z0
            if (r10 == 0) goto L92
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "offsetPositionRecordsForInsert cached "
            r10.<init>(r11)
            r10.append(r8)
            r10.append(r6)
            r10.append(r9)
            r10.append(r5)
            int r11 = r9.c
            int r11 = r11 + r14
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r7, r10)
        L92:
            r9.l(r14, r2)
        L95:
            int r8 = r8 + 1
            goto L60
        L98:
            r0.requestLayout()
            r0.i0 = r4
            return
    }

    public final void e(int r17, int r18) {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r16
            androidx.recyclerview.widget.RecyclerView r3 = r2.f1016a
            androidx.recyclerview.widget.b r4 = r3.f
            int r4 = r4.h()
            r5 = 1
            if (r0 >= r1) goto L15
            r7 = r0
            r8 = r1
            r9 = -1
            goto L18
        L15:
            r8 = r0
            r7 = r1
            r9 = r5
        L18:
            r10 = 0
            r11 = r10
        L1a:
            java.lang.String r12 = " holder "
            java.lang.String r13 = "RecyclerView"
            if (r11 >= r4) goto L62
            androidx.recyclerview.widget.b r14 = r3.f
            android.view.View r14 = r14.g(r11)
            androidx.recyclerview.widget.RecyclerView$A r14 = androidx.recyclerview.widget.RecyclerView.L(r14)
            if (r14 == 0) goto L5f
            int r15 = r14.c
            if (r15 < r7) goto L5f
            if (r15 <= r8) goto L33
            goto L5f
        L33:
            boolean r15 = androidx.recyclerview.widget.RecyclerView.z0
            if (r15 == 0) goto L4e
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r6 = "offsetPositionRecordsForMove attached child "
            r15.<init>(r6)
            r15.append(r11)
            r15.append(r12)
            r15.append(r14)
            java.lang.String r6 = r15.toString()
            android.util.Log.d(r13, r6)
        L4e:
            int r6 = r14.c
            if (r6 != r0) goto L58
            int r6 = r1 - r0
            r14.l(r6, r10)
            goto L5b
        L58:
            r14.l(r9, r10)
        L5b:
            androidx.recyclerview.widget.RecyclerView$w r6 = r3.f0
            r6.f = r5
        L5f:
            int r11 = r11 + 1
            goto L1a
        L62:
            androidx.recyclerview.widget.RecyclerView$r r4 = r3.c
            r4.getClass()
            if (r0 >= r1) goto L6d
            r7 = r0
            r8 = r1
            r6 = -1
            goto L70
        L6d:
            r8 = r0
            r7 = r1
            r6 = r5
        L70:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r4 = r4.c
            int r9 = r4.size()
            r11 = r10
        L77:
            if (r11 >= r9) goto Lb2
            java.lang.Object r14 = r4.get(r11)
            androidx.recyclerview.widget.RecyclerView$A r14 = (androidx.recyclerview.widget.RecyclerView.A) r14
            if (r14 == 0) goto Lae
            int r15 = r14.c
            if (r15 < r7) goto Lae
            if (r15 <= r8) goto L88
            goto Lae
        L88:
            if (r15 != r0) goto L90
            int r15 = r1 - r0
            r14.l(r15, r10)
            goto L93
        L90:
            r14.l(r6, r10)
        L93:
            boolean r15 = androidx.recyclerview.widget.RecyclerView.z0
            if (r15 == 0) goto Lae
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r10 = "offsetPositionRecordsForMove cached child "
            r15.<init>(r10)
            r15.append(r11)
            r15.append(r12)
            r15.append(r14)
            java.lang.String r10 = r15.toString()
            android.util.Log.d(r13, r10)
        Lae:
            int r11 = r11 + 1
            r10 = 0
            goto L77
        Lb2:
            r3.requestLayout()
            r3.i0 = r5
            return
    }
}
