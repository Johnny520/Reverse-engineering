package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class k extends androidx.recyclerview.widget.z {
    public static android.animation.TimeInterpolator s;
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A> h;
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A> i;
    public java.util.ArrayList<androidx.recyclerview.widget.k.b> j;
    public java.util.ArrayList<androidx.recyclerview.widget.k.a> k;
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A>> l;
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k.b>> m;
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k.a>> n;
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A> o;
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A> p;
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A> q;
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.A> r;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView.A f1002a;
        public androidx.recyclerview.widget.RecyclerView.A b;
        public int c;
        public int d;
        public int e;
        public int f;

        @android.annotation.SuppressLint({"UnknownNullness"})
        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ChangeInfo{oldHolder="
                r0.<init>(r1)
                androidx.recyclerview.widget.RecyclerView$A r1 = r2.f1002a
                r0.append(r1)
                java.lang.String r1 = ", newHolder="
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView$A r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", fromX="
                r0.append(r1)
                int r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", fromY="
                r0.append(r1)
                int r1 = r2.d
                r0.append(r1)
                java.lang.String r1 = ", toX="
                r0.append(r1)
                int r1 = r2.e
                r0.append(r1)
                java.lang.String r1 = ", toY="
                r0.append(r1)
                int r1 = r2.f
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView.A f1003a;
        public int b;
        public int c;
        public int d;
        public int e;
    }

    public static void h(java.util.ArrayList r2) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.get(r0)
            androidx.recyclerview.widget.RecyclerView$A r1 = (androidx.recyclerview.widget.RecyclerView.A) r1
            android.view.View r1 = r1.f963a
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.cancel()
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final void d(androidx.recyclerview.widget.RecyclerView.A r9) {
            r8 = this;
            android.view.View r0 = r9.f963a
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r1.cancel()
            java.util.ArrayList<androidx.recyclerview.widget.k$b> r1 = r8.j
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L11:
            r3 = 0
            if (r2 < 0) goto L2d
            java.lang.Object r4 = r1.get(r2)
            androidx.recyclerview.widget.k$b r4 = (androidx.recyclerview.widget.k.b) r4
            androidx.recyclerview.widget.RecyclerView$A r4 = r4.f1003a
            if (r4 != r9) goto L2a
            r0.setTranslationY(r3)
            r0.setTranslationX(r3)
            r8.c(r9)
            r1.remove(r2)
        L2a:
            int r2 = r2 + (-1)
            goto L11
        L2d:
            java.util.ArrayList<androidx.recyclerview.widget.k$a> r1 = r8.k
            r8.j(r1, r9)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r1 = r8.h
            boolean r1 = r1.remove(r9)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L42
            r0.setAlpha(r2)
            r8.c(r9)
        L42:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r1 = r8.i
            boolean r1 = r1.remove(r9)
            if (r1 == 0) goto L50
            r0.setAlpha(r2)
            r8.c(r9)
        L50:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k$a>> r1 = r8.n
            int r4 = r1.size()
            int r4 = r4 + (-1)
        L58:
            if (r4 < 0) goto L6f
            java.lang.Object r5 = r1.get(r4)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r8.j(r5, r9)
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L6c
            r1.remove(r4)
        L6c:
            int r4 = r4 + (-1)
            goto L58
        L6f:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k$b>> r1 = r8.m
            int r4 = r1.size()
            int r4 = r4 + (-1)
        L77:
            if (r4 < 0) goto Lad
            java.lang.Object r5 = r1.get(r4)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L85:
            if (r6 < 0) goto Laa
            java.lang.Object r7 = r5.get(r6)
            androidx.recyclerview.widget.k$b r7 = (androidx.recyclerview.widget.k.b) r7
            androidx.recyclerview.widget.RecyclerView$A r7 = r7.f1003a
            if (r7 != r9) goto La7
            r0.setTranslationY(r3)
            r0.setTranslationX(r3)
            r8.c(r9)
            r5.remove(r6)
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto Laa
            r1.remove(r4)
            goto Laa
        La7:
            int r6 = r6 + (-1)
            goto L85
        Laa:
            int r4 = r4 + (-1)
            goto L77
        Lad:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A>> r1 = r8.l
            int r3 = r1.size()
            int r3 = r3 + (-1)
        Lb5:
            if (r3 < 0) goto Ld5
            java.lang.Object r4 = r1.get(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r5 = r4.remove(r9)
            if (r5 == 0) goto Ld2
            r0.setAlpha(r2)
            r8.c(r9)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Ld2
            r1.remove(r3)
        Ld2:
            int r3 = r3 + (-1)
            goto Lb5
        Ld5:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r8.q
            r0.remove(r9)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r8.o
            r0.remove(r9)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r8.r
            r0.remove(r9)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r8.p
            r0.remove(r9)
            r8.i()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e() {
            r8 = this;
            java.util.ArrayList<androidx.recyclerview.widget.k$b> r0 = r8.j
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L8:
            r2 = 0
            if (r1 < 0) goto L26
            java.lang.Object r3 = r0.get(r1)
            androidx.recyclerview.widget.k$b r3 = (androidx.recyclerview.widget.k.b) r3
            androidx.recyclerview.widget.RecyclerView$A r4 = r3.f1003a
            android.view.View r4 = r4.f963a
            r4.setTranslationY(r2)
            r4.setTranslationX(r2)
            androidx.recyclerview.widget.RecyclerView$A r2 = r3.f1003a
            r8.c(r2)
            r0.remove(r1)
            int r1 = r1 + (-1)
            goto L8
        L26:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r8.h
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L2e:
            if (r1 < 0) goto L3f
            java.lang.Object r3 = r0.get(r1)
            androidx.recyclerview.widget.RecyclerView$A r3 = (androidx.recyclerview.widget.RecyclerView.A) r3
            r8.c(r3)
            r0.remove(r1)
            int r1 = r1 + (-1)
            goto L2e
        L3f:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r8.i
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L47:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto L5f
            java.lang.Object r4 = r0.get(r1)
            androidx.recyclerview.widget.RecyclerView$A r4 = (androidx.recyclerview.widget.RecyclerView.A) r4
            android.view.View r5 = r4.f963a
            r5.setAlpha(r3)
            r8.c(r4)
            r0.remove(r1)
            int r1 = r1 + (-1)
            goto L47
        L5f:
            java.util.ArrayList<androidx.recyclerview.widget.k$a> r0 = r8.k
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L67:
            if (r1 < 0) goto L80
            java.lang.Object r4 = r0.get(r1)
            androidx.recyclerview.widget.k$a r4 = (androidx.recyclerview.widget.k.a) r4
            androidx.recyclerview.widget.RecyclerView$A r5 = r4.f1002a
            if (r5 == 0) goto L76
            r8.k(r4, r5)
        L76:
            androidx.recyclerview.widget.RecyclerView$A r5 = r4.b
            if (r5 == 0) goto L7d
            r8.k(r4, r5)
        L7d:
            int r1 = r1 + (-1)
            goto L67
        L80:
            r0.clear()
            boolean r0 = r8.f()
            if (r0 != 0) goto L8a
            return
        L8a:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k$b>> r0 = r8.m
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L92:
            if (r1 < 0) goto Lc9
            java.lang.Object r4 = r0.get(r1)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r5 = r5 + (-1)
        La0:
            if (r5 < 0) goto Lc6
            java.lang.Object r6 = r4.get(r5)
            androidx.recyclerview.widget.k$b r6 = (androidx.recyclerview.widget.k.b) r6
            androidx.recyclerview.widget.RecyclerView$A r7 = r6.f1003a
            android.view.View r7 = r7.f963a
            r7.setTranslationY(r2)
            r7.setTranslationX(r2)
            androidx.recyclerview.widget.RecyclerView$A r6 = r6.f1003a
            r8.c(r6)
            r4.remove(r5)
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto Lc3
            r0.remove(r4)
        Lc3:
            int r5 = r5 + (-1)
            goto La0
        Lc6:
            int r1 = r1 + (-1)
            goto L92
        Lc9:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A>> r0 = r8.l
            int r1 = r0.size()
            int r1 = r1 + (-1)
        Ld1:
            if (r1 < 0) goto L101
            java.lang.Object r2 = r0.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r4 = r2.size()
            int r4 = r4 + (-1)
        Ldf:
            if (r4 < 0) goto Lfe
            java.lang.Object r5 = r2.get(r4)
            androidx.recyclerview.widget.RecyclerView$A r5 = (androidx.recyclerview.widget.RecyclerView.A) r5
            android.view.View r6 = r5.f963a
            r6.setAlpha(r3)
            r8.c(r5)
            r2.remove(r4)
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto Lfb
            r0.remove(r2)
        Lfb:
            int r4 = r4 + (-1)
            goto Ldf
        Lfe:
            int r1 = r1 + (-1)
            goto Ld1
        L101:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k$a>> r0 = r8.n
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L109:
            if (r1 < 0) goto L13c
            java.lang.Object r2 = r0.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L117:
            if (r3 < 0) goto L139
            java.lang.Object r4 = r2.get(r3)
            androidx.recyclerview.widget.k$a r4 = (androidx.recyclerview.widget.k.a) r4
            androidx.recyclerview.widget.RecyclerView$A r5 = r4.f1002a
            if (r5 == 0) goto L126
            r8.k(r4, r5)
        L126:
            androidx.recyclerview.widget.RecyclerView$A r5 = r4.b
            if (r5 == 0) goto L12d
            r8.k(r4, r5)
        L12d:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L136
            r0.remove(r2)
        L136:
            int r3 = r3 + (-1)
            goto L117
        L139:
            int r1 = r1 + (-1)
            goto L109
        L13c:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r8.q
            h(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r8.p
            h(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r8.o
            h(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r8.r
            h(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$i$a> r0 = r8.b
            int r1 = r0.size()
            r2 = 0
        L157:
            if (r2 >= r1) goto L165
            java.lang.Object r3 = r0.get(r2)
            androidx.recyclerview.widget.RecyclerView$i$a r3 = (androidx.recyclerview.widget.RecyclerView.i.a) r3
            r3.a()
            int r2 = r2 + 1
            goto L157
        L165:
            r0.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean f() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r1.i
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.k$a> r0 = r1.k
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.k$b> r0 = r1.j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r1.h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r1.p
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r1.q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r1.o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A> r0 = r1.r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k$b>> r0 = r1.m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$A>> r0 = r1.l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.k$a>> r0 = r1.n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L59
            goto L5b
        L59:
            r0 = 0
            return r0
        L5b:
            r0 = 1
            return r0
    }

    @Override // androidx.recyclerview.widget.z
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final boolean g(androidx.recyclerview.widget.RecyclerView.A r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.View r0 = r4.f963a
            float r1 = r0.getTranslationX()
            int r1 = (int) r1
            int r5 = r5 + r1
            android.view.View r1 = r4.f963a
            float r1 = r1.getTranslationY()
            int r1 = (int) r1
            int r6 = r6 + r1
            r3.l(r4)
            int r1 = r7 - r5
            int r2 = r8 - r6
            if (r1 != 0) goto L20
            if (r2 != 0) goto L20
            r3.c(r4)
            r4 = 0
            return r4
        L20:
            if (r1 == 0) goto L27
            int r1 = -r1
            float r1 = (float) r1
            r0.setTranslationX(r1)
        L27:
            if (r2 == 0) goto L2e
            int r1 = -r2
            float r1 = (float) r1
            r0.setTranslationY(r1)
        L2e:
            java.util.ArrayList<androidx.recyclerview.widget.k$b> r0 = r3.j
            androidx.recyclerview.widget.k$b r1 = new androidx.recyclerview.widget.k$b
            r1.<init>()
            r1.f1003a = r4
            r1.b = r5
            r1.c = r6
            r1.d = r7
            r1.e = r8
            r0.add(r1)
            r4 = 1
            return r4
    }

    public final void i() {
            r4 = this;
            boolean r0 = r4.f()
            if (r0 != 0) goto L1e
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$i$a> r0 = r4.b
            int r1 = r0.size()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1b
            java.lang.Object r3 = r0.get(r2)
            androidx.recyclerview.widget.RecyclerView$i$a r3 = (androidx.recyclerview.widget.RecyclerView.i.a) r3
            r3.a()
            int r2 = r2 + 1
            goto Ld
        L1b:
            r0.clear()
        L1e:
            return
    }

    public final void j(java.util.ArrayList r4, androidx.recyclerview.widget.RecyclerView.A r5) {
            r3 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L22
            java.lang.Object r1 = r4.get(r0)
            androidx.recyclerview.widget.k$a r1 = (androidx.recyclerview.widget.k.a) r1
            boolean r2 = r3.k(r1, r5)
            if (r2 == 0) goto L1f
            androidx.recyclerview.widget.RecyclerView$A r2 = r1.f1002a
            if (r2 != 0) goto L1f
            androidx.recyclerview.widget.RecyclerView$A r2 = r1.b
            if (r2 != 0) goto L1f
            r4.remove(r1)
        L1f:
            int r0 = r0 + (-1)
            goto L6
        L22:
            return
    }

    public final boolean k(androidx.recyclerview.widget.k.a r3, androidx.recyclerview.widget.RecyclerView.A r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$A r0 = r3.b
            r1 = 0
            if (r0 != r4) goto L8
            r3.b = r1
            goto Le
        L8:
            androidx.recyclerview.widget.RecyclerView$A r0 = r3.f1002a
            if (r0 != r4) goto L23
            r3.f1002a = r1
        Le:
            android.view.View r3 = r4.f963a
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r0)
            android.view.View r3 = r4.f963a
            r0 = 0
            r3.setTranslationX(r0)
            r3.setTranslationY(r0)
            r2.c(r4)
            r3 = 1
            return r3
        L23:
            r3 = 0
            return r3
    }

    public final void l(androidx.recyclerview.widget.RecyclerView.A r3) {
            r2 = this;
            android.animation.TimeInterpolator r0 = androidx.recyclerview.widget.k.s
            if (r0 != 0) goto Lf
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            androidx.recyclerview.widget.k.s = r0
        Lf:
            android.view.View r0 = r3.f963a
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r1 = androidx.recyclerview.widget.k.s
            r0.setInterpolator(r1)
            r2.d(r3)
            return
    }
}
