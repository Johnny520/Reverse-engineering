package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u70 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public r70 a;
    public ViewGroup b;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        r70 r1 = this.a;
        ViewGroup r2 = this.b;
        r2.getViewTreeObserver().removeOnPreDrawListener(this);
        r2.removeOnAttachStateChangeListener(this);
        boolean r7 = true;
        if (v70.c.remove(r2) == true) goto L5;
        return true;
    L5:
        n6 r3 = v70.b();
        Long r4 = null;
        ArrayList r5 = (ArrayList) r3.getOrDefault(r2, null);
        if (r5 != null) goto L10;
        r5 = new ArrayList();
        r3.put(r2, r5);
    L8:
        ArrayList r6 = null;
    L12:
        r5.add(r1);
        r1.a(new t70(this, r3));
        int r32 = 0;
        r1.g(r2, false);
        if (r6 == null) goto L17;
        int r52 = r6.size();
        int r8 = 0;
    L15:
        if (r8 >= r52) goto L17;
        Object r9 = r6.get(r8);
        r8 = r8 + 1;
        ((r70) r9).v(r2);
    L17:
        r1.k = new ArrayList();
        r1.l = new ArrayList();
        a8 r53 = r1.g;
        a8 r62 = r1.h;
        n6 r82 = new n6((n6) r53.a);
        n6 r92 = new n6((n6) r62.a);
        int r10 = 0;
    L18:
        int[] r11 = r1.j;
        if (r10 >= r11.length) goto L92;
        int r112 = r11[r10];
        if (r112 != r7) goto L23;
        boolean r17 = r7;
        n6 r72 = r82;
        int r0 = r72.c - 1;
    L80:
        if (r0 < 0) goto L91;
        View r33 = (View) r72.h(r0);
        if (r33 == null) goto L90;
        if (r1.r(r33) == false) goto L90;
        x70 r34 = (x70) r92.remove(r33);
        if (r34 == null) goto L90;
        if (r1.r(r34.b) == false) goto L90;
        r1.k.add((x70) r72.i(r0));
        r1.l.add(r34);
    L90:
        r0 = r0 - 1;
    L91:
        r10 = r10 + 1;
        r82 = r72;
        r7 = r17;
        r32 = 0;
        r4 = null;
        goto L18
    L23:
        if (r112 != 2) goto L25;
        r17 = r7;
        r72 = r82;
        n6 r02 = (n6) r53.d;
        n6 r35 = (n6) r62.d;
        int r42 = r02.c;
        int r83 = 0;
    L65:
        if (r83 >= r42) goto L91;
        View r113 = (View) r02.j(r83);
        if (r113 == null) goto L78;
        if (r1.r(r113) == false) goto L78;
        View r12 = (View) r35.getOrDefault(r02.h(r83), null);
        if (r12 == null) goto L78;
        if (r1.r(r12) == false) goto L78;
        x70 r14 = (x70) r72.getOrDefault(r113, null);
        x70 r15 = (x70) r92.getOrDefault(r12, null);
        if (r14 == null) goto L78;
        if (r15 == null) goto L78;
        r1.k.add(r14);
        r1.l.add(r15);
        r72.remove(r113);
        r92.remove(r12);
    L78:
        r83 = r83 + 1;
        goto L65
    L25:
        if (r112 != 3) goto L27;
        r17 = r7;
        r72 = r82;
        SparseArray r03 = (SparseArray) r53.b;
        SparseArray r36 = (SparseArray) r62.b;
        int r43 = r03.size();
        int r84 = 0;
    L50:
        if (r84 >= r43) goto L91;
        View r114 = (View) r03.valueAt(r84);
        if (r114 == null) goto L63;
        if (r1.r(r114) == false) goto L63;
        View r122 = (View) r36.get(r03.keyAt(r84));
        if (r122 == null) goto L63;
        if (r1.r(r122) == false) goto L63;
        x70 r142 = (x70) r72.getOrDefault(r114, null);
        x70 r152 = (x70) r92.getOrDefault(r122, null);
        if (r142 == null) goto L63;
        if (r152 == null) goto L63;
        r1.k.add(r142);
        r1.l.add(r152);
        r72.remove(r114);
        r92.remove(r122);
    L63:
        r84 = r84 + 1;
        goto L50
    L27:
        if (r112 == 4) goto L29;
    L28:
        r17 = r7;
        r72 = r82;
        goto L91
    L29:
        bs r115 = (bs) r53.c;
        bs r123 = (bs) r62.c;
        int r13 = r115.e();
        int r143 = r32;
    L30:
        if (r143 >= r13) goto L28;
        View r153 = (View) r115.f(r143);
        if (r153 != null) goto L34;
    L47:
        boolean r172 = r7;
        n6 r73 = r82;
    L48:
        r143 = r143 + 1;
        r82 = r73;
        r7 = r172;
        r4 = null;
        goto L30
    L34:
        if (r1.r(r153) == false) goto L47;
        if (r115.a == false) goto L38;
        r115.b();
    L38:
        r172 = r7;
        n6 r18 = r82;
        View r37 = (View) r123.c(r115.b[r143], r4);
        if (r37 != null) goto L41;
    L46:
        r73 = r18;
        goto L48
    L41:
        if (r1.r(r37) == false) goto L46;
        r73 = r18;
        x70 r85 = (x70) r73.getOrDefault(r153, r4);
        x70 r44 = (x70) r92.getOrDefault(r37, r4);
        if (r85 == null) goto L48;
        if (r44 == null) goto L48;
        r1.k.add(r85);
        r1.l.add(r44);
        r73.remove(r153);
        r92.remove(r37);
        goto L48
    L92:
        boolean r173 = r7;
        n6 r74 = r82;
        int r04 = 0;
    L94:
        if (r04 >= r74.c) goto L99;
        x70 r38 = (x70) r74.j(r04);
        if (r1.r(r38.b) == false) goto L98;
        r1.k.add(r38);
        r1.l.add(null);
    L98:
        r04 = r04 + 1;
        goto L94
    L99:
        int r39 = 0;
    L101:
        if (r39 >= r92.c) goto L106;
        x70 r05 = (x70) r92.j(r39);
        if (r1.r(r05.b) == false) goto L105;
        r1.l.add(r05);
        r1.k.add(null);
    L105:
        r39 = r39 + 1;
        goto L101
    L106:
        n6 r06 = r70.n();
        int r310 = r06.c;
        db0 r45 = bb0.a;
        WindowId r46 = r2.getWindowId();
        int r311 = r310 - 1;
    L107:
        if (r311 < 0) goto L134;
        Animator r54 = (Animator) r06.h(r311);
        if (r54 == null) goto L133;
        p70 r63 = (p70) r06.getOrDefault(r54, null);
        if (r63 == null) goto L133;
        View r75 = r63.a;
        if (r75 == null) goto L133;
        if (r63.d.a.equals(r46) == false) goto L133;
        x70 r86 = r63.c;
        boolean r93 = r173;
        x70 r102 = r1.p(r75, r93);
        x70 r116 = r1.m(r75, r93);
        if (r102 != null) goto L121;
        if (r116 != null) goto L121;
        r116 = (x70) ((n6) r1.h.a).getOrDefault(r75, null);
    L121:
        if (r102 != null) goto L124;
        if (r116 == null) goto L133;
    L124:
        if (r63.e.q(r86, r116) == false) goto L133;
        if (r54.isRunning() == false) goto L128;
    L131:
        r54.cancel();
        goto L133
    L128:
        if (r54.isStarted() == true) goto L131;
        r06.remove(r54);
    L133:
        r311 = r311 - 1;
        r173 = true;
        goto L107
    L134:
        r1.k(r2, r1.g, r1.h, r1.k, r1.l);
        r1.w();
        return true;
    L10:
        if (r5.size() <= 0) goto L8;
        r6 = new ArrayList(r5);
        goto L12
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r5) {
        ViewGroup r52 = this.b;
        r52.getViewTreeObserver().removeOnPreDrawListener(this);
        r52.removeOnAttachStateChangeListener(this);
        v70.c.remove(r52);
        ArrayList r0 = (ArrayList) v70.b().getOrDefault(r52, null);
        if (r0 != null) goto L5;
    L9:
        this.a.h(true);
        return;
    L5:
        if (r0.size() <= 0) goto L9;
        int r1 = r0.size();
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L9;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ((r70) r3).v(r52);
        goto L7
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
    }
}
