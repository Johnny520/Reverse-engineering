package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class uf extends jz {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList r2) {
        int r0 = r2.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((b00) r2.get(r0)).a.animate().cancel();
        r0 = r0 - 1;
        goto L3
    }

    @Override // defpackage.jz
    public final boolean a(b00 r10, b00 r11, lw r12, lw r13) {
        int r2 = r12.a;
        int r3 = r12.b;
        if (r11.o() == false) goto L5;
        int r132 = r12.a;
        int r5 = r12.b;
        int r4 = r132;
    L6:
        if (r10 == r11) goto L8;
        View r102 = r10.a;
        float r122 = r102.getTranslationX();
        float r133 = r102.getTranslationY();
        float r6 = r102.getAlpha();
        l(r10);
        r102.setTranslationX(r122);
        r102.setTranslationY(r133);
        r102.setAlpha(r6);
        View r103 = r11.a;
        l(r11);
        r103.setTranslationX(-((int) ((r4 - r2) - r122)));
        r103.setTranslationY(-((int) ((r5 - r3) - r133)));
        r103.setAlpha(0.0f);
        ArrayList r104 = this.k;
        sf r123 = new sf();
        r123.a = r10;
        r123.b = r11;
        r123.c = r2;
        r123.d = r3;
        r123.e = r4;
        r123.f = r5;
        r104.add(r123);
        return true;
    L8:
        return g(r10, r2, r3, r4, r5);
    L5:
        r4 = r13.a;
        r5 = r13.b;
        goto L6
    }

    @Override // defpackage.jz
    public final void d(b00 r10) {
        ArrayList r0 = this.l;
        ArrayList r1 = this.m;
        ArrayList r2 = this.n;
        View r3 = r10.a;
        r3.animate().cancel();
        ArrayList r4 = this.j;
        int r5 = r4.size();
    L3:
        r5 = r5 - 1;
        if (r5 < 0) goto L9;
        if (((tf) r4.get(r5)).a != r10) goto L3;
        r3.setTranslationY(0.0f);
        r3.setTranslationX(0.0f);
        c(r10);
        r4.remove(r5);
        goto L3
    L9:
        j(this.k, r10);
        if (this.h.remove(r10) == false) goto L13;
        r3.setAlpha(1.0f);
        c(r10);
    L13:
        if (this.i.remove(r10) == false) goto L15;
        r3.setAlpha(1.0f);
        c(r10);
    L15:
        int r42 = r2.size() - 1;
    L16:
        if (r42 < 0) goto L21;
        ArrayList r7 = (ArrayList) r2.get(r42);
        j(r7, r10);
        if (r7.isEmpty() == false) goto L20;
        r2.remove(r42);
    L20:
        r42 = r42 - 1;
        goto L16
    L21:
        int r22 = r1.size() - 1;
    L22:
        if (r22 < 0) goto L32;
        ArrayList r43 = (ArrayList) r1.get(r22);
        int r72 = r43.size() - 1;
    L24:
        if (r72 < 0) goto L31;
        if (((tf) r43.get(r72)).a == r10) goto L27;
        r72 = r72 - 1;
        goto L24
    L27:
        r3.setTranslationY(0.0f);
        r3.setTranslationX(0.0f);
        c(r10);
        r43.remove(r72);
        if (r43.isEmpty() == false) goto L31;
        r1.remove(r22);
    L31:
        r22 = r22 - 1;
        goto L22
    L32:
        int r12 = r0.size() - 1;
    L33:
        if (r12 < 0) goto L40;
        ArrayList r23 = (ArrayList) r0.get(r12);
        if (r23.remove(r10) == false) goto L39;
        r3.setAlpha(1.0f);
        c(r10);
        if (r23.isEmpty() == false) goto L39;
        r0.remove(r12);
    L39:
        r12 = r12 - 1;
        goto L33
    L40:
        this.q.remove(r10);
        this.o.remove(r10);
        this.r.remove(r10);
        this.p.remove(r10);
        i();
    }

    @Override // defpackage.jz
    public final void e() {
        ArrayList r0 = this.n;
        ArrayList r1 = this.l;
        ArrayList r2 = this.m;
        ArrayList r3 = this.k;
        ArrayList r4 = this.i;
        ArrayList r5 = this.h;
        ArrayList r6 = this.j;
        int r7 = r6.size();
    L3:
        r7 = r7 - 1;
        if (r7 < 0) goto L6;
        tf r9 = (tf) r6.get(r7);
        View r10 = r9.a.a;
        r10.setTranslationY(0.0f);
        r10.setTranslationX(0.0f);
        c(r9.a);
        r6.remove(r7);
        goto L3
    L6:
        int r62 = r5.size() - 1;
    L7:
        if (r62 < 0) goto L9;
        c((b00) r5.get(r62));
        r5.remove(r62);
        r62 = r62 - 1;
        goto L7
    L9:
        int r52 = r4.size();
    L10:
        r52 = r52 - 1;
        if (r52 < 0) goto L13;
        b00 r72 = (b00) r4.get(r52);
        r72.a.setAlpha(1.0f);
        c(r72);
        r4.remove(r52);
        goto L10
    L13:
        int r42 = r3.size() - 1;
    L14:
        if (r42 < 0) goto L22;
        sf r53 = (sf) r3.get(r42);
        b00 r73 = r53.a;
        if (r73 == null) goto L18;
        k(r53, r73);
    L18:
        b00 r74 = r53.b;
        if (r74 == null) goto L21;
        k(r53, r74);
    L21:
        r42 = r42 - 1;
        goto L14
    L22:
        r3.clear();
        if (f() == true) goto L25;
        return;
    L25:
        int r32 = r2.size() - 1;
    L26:
        if (r32 < 0) goto L34;
        ArrayList r43 = (ArrayList) r2.get(r32);
        int r54 = r43.size() - 1;
    L28:
        if (r54 < 0) goto L33;
        tf r75 = (tf) r43.get(r54);
        View r92 = r75.a.a;
        r92.setTranslationY(0.0f);
        r92.setTranslationX(0.0f);
        c(r75.a);
        r43.remove(r54);
        if (r43.isEmpty() == false) goto L32;
        r2.remove(r43);
    L32:
        r54 = r54 - 1;
        goto L28
    L33:
        r32 = r32 - 1;
        goto L26
    L34:
        int r22 = r1.size() - 1;
    L35:
        if (r22 < 0) goto L43;
        ArrayList r33 = (ArrayList) r1.get(r22);
        int r44 = r33.size() - 1;
    L37:
        if (r44 < 0) goto L42;
        b00 r55 = (b00) r33.get(r44);
        r55.a.setAlpha(1.0f);
        c(r55);
        r33.remove(r44);
        if (r33.isEmpty() == false) goto L41;
        r1.remove(r33);
    L41:
        r44 = r44 - 1;
        goto L37
    L42:
        r22 = r22 - 1;
        goto L35
    L43:
        int r12 = r0.size() - 1;
    L44:
        if (r12 < 0) goto L58;
        ArrayList r23 = (ArrayList) r0.get(r12);
        int r34 = r23.size() - 1;
    L46:
        if (r34 < 0) goto L57;
        sf r45 = (sf) r23.get(r34);
        b00 r56 = r45.a;
        if (r56 == null) goto L50;
        k(r45, r56);
    L50:
        b00 r57 = r45.b;
        if (r57 == null) goto L54;
        k(r45, r57);
    L54:
        if (r23.isEmpty() == false) goto L56;
        r0.remove(r23);
    L56:
        r34 = r34 - 1;
        goto L46
    L57:
        r12 = r12 - 1;
        goto L44
    L58:
        h(this.q);
        h(this.p);
        h(this.o);
        h(this.r);
        ArrayList r02 = this.b;
        if (r02.size() > 0) goto L62;
        r02.clear();
        return;
    L62:
        r02.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.jz
    public final boolean f() {
        if (this.i.isEmpty() == true) goto L5;
        return true;
    L5:
        if (this.k.isEmpty() == true) goto L7;
        return true;
    L7:
        if (this.j.isEmpty() == true) goto L9;
        return true;
    L9:
        if (this.h.isEmpty() == true) goto L11;
        return true;
    L11:
        if (this.p.isEmpty() == true) goto L13;
        return true;
    L13:
        if (this.q.isEmpty() == true) goto L15;
        return true;
    L15:
        if (this.o.isEmpty() == true) goto L17;
        return true;
    L17:
        if (this.r.isEmpty() == true) goto L19;
        return true;
    L19:
        if (this.m.isEmpty() == true) goto L21;
        return true;
    L21:
        if (this.l.isEmpty() == true) goto L23;
        return true;
    L23:
        if (this.n.isEmpty() == false) goto L38;
        return false;
    L38:
        return true;
    }

    public final boolean g(b00 r4, int r5, int r6, int r7, int r8) {
        View r0 = r4.a;
        int r52 = r5 + ((int) r0.getTranslationX());
        int r62 = r6 + ((int) r4.a.getTranslationY());
        l(r4);
        int r1 = r7 - r52;
        int r2 = r8 - r62;
        if (r1 != 0) goto L7;
        if (r2 != 0) goto L7;
        c(r4);
        return false;
    L7:
        if (r1 == 0) goto L9;
        r0.setTranslationX(-r1);
    L9:
        if (r2 == 0) goto L11;
        r0.setTranslationY(-r2);
    L11:
        ArrayList r02 = this.j;
        tf r12 = new tf();
        r12.a = r4;
        r12.b = r52;
        r12.c = r62;
        r12.d = r7;
        r12.e = r8;
        r02.add(r12);
        return true;
    }

    public final void i() {
        if (f() == true) goto L10;
        ArrayList r0 = this.b;
        if (r0.size() > 0) goto L8;
        r0.clear();
        return;
    L8:
        r0.get(0).getClass();
        throw new ClassCastException();
    }

    public final void j(ArrayList r4, b00 r5) {
        int r0 = r4.size() - 1;
    L3:
        if (r0 < 0) goto L12;
        sf r1 = (sf) r4.get(r0);
        if (k(r1, r5) == false) goto L11;
        if (r1.a != null) goto L11;
        if (r1.b != null) goto L11;
        r4.remove(r1);
    L11:
        r0 = r0 - 1;
        goto L3
    }

    public final boolean k(sf r3, b00 r4) {
        if (r3.b != r4) goto L6;
        r3.b = null;
    L8:
        View r32 = r4.a;
        View r0 = r4.a;
        r32.setAlpha(1.0f);
        r0.setTranslationX(0.0f);
        r0.setTranslationY(0.0f);
        c(r4);
        return true;
    L6:
        if (r3.a != r4) goto L10;
        r3.a = null;
        goto L8
    L10:
        return false;
    }

    public final void l(b00 r3) {
        if (s != null) goto L5;
        s = new ValueAnimator().getInterpolator();
    L5:
        r3.a.animate().setInterpolator(s);
        d(r3);
    }
}
