package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uf extends defpackage.jz {
    public static android.animation.TimeInterpolator s;
    public boolean g;
    public java.util.ArrayList h;
    public java.util.ArrayList i;
    public java.util.ArrayList j;
    public java.util.ArrayList k;
    public java.util.ArrayList l;
    public java.util.ArrayList m;
    public java.util.ArrayList n;
    public java.util.ArrayList o;
    public java.util.ArrayList p;
    public java.util.ArrayList q;
    public java.util.ArrayList r;

    public static void h(java.util.ArrayList r2) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.get(r0)
            b00 r1 = (defpackage.b00) r1
            android.view.View r1 = r1.a
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.cancel()
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    @Override // defpackage.jz
    public final boolean a(defpackage.b00 r10, defpackage.b00 r11, defpackage.lw r12, defpackage.lw r13) {
            r9 = this;
            int r2 = r12.a
            int r3 = r12.b
            boolean r0 = r11.o()
            if (r0 == 0) goto L11
            int r13 = r12.a
            int r12 = r12.b
            r5 = r12
            r4 = r13
            goto L17
        L11:
            int r12 = r13.a
            int r13 = r13.b
            r4 = r12
            r5 = r13
        L17:
            if (r10 != r11) goto L20
            r0 = r9
            r1 = r10
            boolean r10 = r0.g(r1, r2, r3, r4, r5)
            return r10
        L20:
            r0 = r9
            r1 = r10
            android.view.View r10 = r1.a
            float r12 = r10.getTranslationX()
            float r13 = r10.getTranslationY()
            float r6 = r10.getAlpha()
            r9.l(r1)
            int r7 = r4 - r2
            float r7 = (float) r7
            float r7 = r7 - r12
            int r7 = (int) r7
            int r8 = r5 - r3
            float r8 = (float) r8
            float r8 = r8 - r13
            int r8 = (int) r8
            r10.setTranslationX(r12)
            r10.setTranslationY(r13)
            r10.setAlpha(r6)
            android.view.View r10 = r11.a
            r9.l(r11)
            int r12 = -r7
            float r12 = (float) r12
            r10.setTranslationX(r12)
            int r12 = -r8
            float r12 = (float) r12
            r10.setTranslationY(r12)
            r12 = 0
            r10.setAlpha(r12)
            java.util.ArrayList r10 = r0.k
            sf r12 = new sf
            r12.<init>()
            r12.a = r1
            r12.b = r11
            r12.c = r2
            r12.d = r3
            r12.e = r4
            r12.f = r5
            r10.add(r12)
            r10 = 1
            return r10
    }

    @Override // defpackage.jz
    public final void d(defpackage.b00 r10) {
            r9 = this;
            java.util.ArrayList r0 = r9.l
            java.util.ArrayList r1 = r9.m
            java.util.ArrayList r2 = r9.n
            android.view.View r3 = r10.a
            android.view.ViewPropertyAnimator r4 = r3.animate()
            r4.cancel()
            java.util.ArrayList r4 = r9.j
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L17:
            r6 = 0
            if (r5 < 0) goto L33
            java.lang.Object r7 = r4.get(r5)
            tf r7 = (defpackage.tf) r7
            b00 r7 = r7.a
            if (r7 != r10) goto L30
            r3.setTranslationY(r6)
            r3.setTranslationX(r6)
            r9.c(r10)
            r4.remove(r5)
        L30:
            int r5 = r5 + (-1)
            goto L17
        L33:
            java.util.ArrayList r4 = r9.k
            r9.j(r4, r10)
            java.util.ArrayList r4 = r9.h
            boolean r4 = r4.remove(r10)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L48
            r3.setAlpha(r5)
            r9.c(r10)
        L48:
            java.util.ArrayList r4 = r9.i
            boolean r4 = r4.remove(r10)
            if (r4 == 0) goto L56
            r3.setAlpha(r5)
            r9.c(r10)
        L56:
            int r4 = r2.size()
            int r4 = r4 + (-1)
        L5c:
            if (r4 < 0) goto L73
            java.lang.Object r7 = r2.get(r4)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r9.j(r7, r10)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L70
            r2.remove(r4)
        L70:
            int r4 = r4 + (-1)
            goto L5c
        L73:
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L79:
            if (r2 < 0) goto Laf
            java.lang.Object r4 = r1.get(r2)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r7 = r4.size()
            int r7 = r7 + (-1)
        L87:
            if (r7 < 0) goto Lac
            java.lang.Object r8 = r4.get(r7)
            tf r8 = (defpackage.tf) r8
            b00 r8 = r8.a
            if (r8 != r10) goto La9
            r3.setTranslationY(r6)
            r3.setTranslationX(r6)
            r9.c(r10)
            r4.remove(r7)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Lac
            r1.remove(r2)
            goto Lac
        La9:
            int r7 = r7 + (-1)
            goto L87
        Lac:
            int r2 = r2 + (-1)
            goto L79
        Laf:
            int r1 = r0.size()
            int r1 = r1 + (-1)
        Lb5:
            if (r1 < 0) goto Ld5
            java.lang.Object r2 = r0.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r4 = r2.remove(r10)
            if (r4 == 0) goto Ld2
            r3.setAlpha(r5)
            r9.c(r10)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Ld2
            r0.remove(r1)
        Ld2:
            int r1 = r1 + (-1)
            goto Lb5
        Ld5:
            java.util.ArrayList r0 = r9.q
            r0.remove(r10)
            java.util.ArrayList r0 = r9.o
            r0.remove(r10)
            java.util.ArrayList r0 = r9.r
            r0.remove(r10)
            java.util.ArrayList r0 = r9.p
            r0.remove(r10)
            r9.i()
            return
    }

    @Override // defpackage.jz
    public final void e() {
            r11 = this;
            java.util.ArrayList r0 = r11.n
            java.util.ArrayList r1 = r11.l
            java.util.ArrayList r2 = r11.m
            java.util.ArrayList r3 = r11.k
            java.util.ArrayList r4 = r11.i
            java.util.ArrayList r5 = r11.h
            java.util.ArrayList r6 = r11.j
            int r7 = r6.size()
            int r7 = r7 + (-1)
        L14:
            r8 = 0
            if (r7 < 0) goto L32
            java.lang.Object r9 = r6.get(r7)
            tf r9 = (defpackage.tf) r9
            b00 r10 = r9.a
            android.view.View r10 = r10.a
            r10.setTranslationY(r8)
            r10.setTranslationX(r8)
            b00 r8 = r9.a
            r11.c(r8)
            r6.remove(r7)
            int r7 = r7 + (-1)
            goto L14
        L32:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L38:
            if (r6 < 0) goto L49
            java.lang.Object r7 = r5.get(r6)
            b00 r7 = (defpackage.b00) r7
            r11.c(r7)
            r5.remove(r6)
            int r6 = r6 + (-1)
            goto L38
        L49:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L4f:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 < 0) goto L67
            java.lang.Object r7 = r4.get(r5)
            b00 r7 = (defpackage.b00) r7
            android.view.View r9 = r7.a
            r9.setAlpha(r6)
            r11.c(r7)
            r4.remove(r5)
            int r5 = r5 + (-1)
            goto L4f
        L67:
            int r4 = r3.size()
            int r4 = r4 + (-1)
        L6d:
            if (r4 < 0) goto L86
            java.lang.Object r5 = r3.get(r4)
            sf r5 = (defpackage.sf) r5
            b00 r7 = r5.a
            if (r7 == 0) goto L7c
            r11.k(r5, r7)
        L7c:
            b00 r7 = r5.b
            if (r7 == 0) goto L83
            r11.k(r5, r7)
        L83:
            int r4 = r4 + (-1)
            goto L6d
        L86:
            r3.clear()
            boolean r3 = r11.f()
            if (r3 != 0) goto L90
            return
        L90:
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L96:
            if (r3 < 0) goto Lcd
            java.lang.Object r4 = r2.get(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r5 = r5 + (-1)
        La4:
            if (r5 < 0) goto Lca
            java.lang.Object r7 = r4.get(r5)
            tf r7 = (defpackage.tf) r7
            b00 r9 = r7.a
            android.view.View r9 = r9.a
            r9.setTranslationY(r8)
            r9.setTranslationX(r8)
            b00 r7 = r7.a
            r11.c(r7)
            r4.remove(r5)
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto Lc7
            r2.remove(r4)
        Lc7:
            int r5 = r5 + (-1)
            goto La4
        Lca:
            int r3 = r3 + (-1)
            goto L96
        Lcd:
            int r2 = r1.size()
            int r2 = r2 + (-1)
        Ld3:
            if (r2 < 0) goto L103
            java.lang.Object r3 = r1.get(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            int r4 = r4 + (-1)
        Le1:
            if (r4 < 0) goto L100
            java.lang.Object r5 = r3.get(r4)
            b00 r5 = (defpackage.b00) r5
            android.view.View r7 = r5.a
            r7.setAlpha(r6)
            r11.c(r5)
            r3.remove(r4)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto Lfd
            r1.remove(r3)
        Lfd:
            int r4 = r4 + (-1)
            goto Le1
        L100:
            int r2 = r2 + (-1)
            goto Ld3
        L103:
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
            sf r4 = (defpackage.sf) r4
            b00 r5 = r4.a
            if (r5 == 0) goto L126
            r11.k(r4, r5)
        L126:
            b00 r5 = r4.b
            if (r5 == 0) goto L12d
            r11.k(r4, r5)
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
            java.util.ArrayList r0 = r11.q
            h(r0)
            java.util.ArrayList r0 = r11.p
            h(r0)
            java.util.ArrayList r0 = r11.o
            h(r0)
            java.util.ArrayList r0 = r11.r
            h(r0)
            java.util.ArrayList r0 = r11.b
            int r1 = r0.size()
            if (r1 > 0) goto L15c
            r0.clear()
            return
        L15c:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // defpackage.jz
    public final boolean f() {
            r1 = this;
            java.util.ArrayList r0 = r1.i
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.k
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.p
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.n
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

    public final boolean g(defpackage.b00 r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.View r0 = r4.a
            float r1 = r0.getTranslationX()
            int r1 = (int) r1
            int r5 = r5 + r1
            android.view.View r1 = r4.a
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
            java.util.ArrayList r0 = r3.j
            tf r1 = new tf
            r1.<init>()
            r1.a = r4
            r1.b = r5
            r1.c = r6
            r1.d = r7
            r1.e = r8
            r0.add(r1)
            r4 = 1
            return r4
    }

    public final void i() {
            r2 = this;
            boolean r0 = r2.f()
            if (r0 != 0) goto L20
            java.util.ArrayList r0 = r2.b
            int r1 = r0.size()
            if (r1 > 0) goto L12
            r0.clear()
            return
        L12:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L20:
            return
    }

    public final void j(java.util.ArrayList r4, defpackage.b00 r5) {
            r3 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L22
            java.lang.Object r1 = r4.get(r0)
            sf r1 = (defpackage.sf) r1
            boolean r2 = r3.k(r1, r5)
            if (r2 == 0) goto L1f
            b00 r2 = r1.a
            if (r2 != 0) goto L1f
            b00 r2 = r1.b
            if (r2 != 0) goto L1f
            r4.remove(r1)
        L1f:
            int r0 = r0 + (-1)
            goto L6
        L22:
            return
    }

    public final boolean k(defpackage.sf r3, defpackage.b00 r4) {
            r2 = this;
            b00 r0 = r3.b
            r1 = 0
            if (r0 != r4) goto L8
            r3.b = r1
            goto Le
        L8:
            b00 r0 = r3.a
            if (r0 != r4) goto L23
            r3.a = r1
        Le:
            android.view.View r3 = r4.a
            android.view.View r0 = r4.a
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r1)
            r3 = 0
            r0.setTranslationX(r3)
            r0.setTranslationY(r3)
            r2.c(r4)
            r3 = 1
            return r3
        L23:
            r3 = 0
            return r3
    }

    public final void l(defpackage.b00 r3) {
            r2 = this;
            android.animation.TimeInterpolator r0 = defpackage.uf.s
            if (r0 != 0) goto Lf
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            defpackage.uf.s = r0
        Lf:
            android.view.View r0 = r3.a
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r1 = defpackage.uf.s
            r0.setInterpolator(r1)
            r2.d(r3)
            return
    }
}
