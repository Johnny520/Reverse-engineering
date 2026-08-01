package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ez {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ ez(RecyclerView r1) {
        this.a = r1;
    }

    public void a(x1 r4) {
        int r0 = r4.a;
        RecyclerView r2 = this.a;
        if (r0 != 1) goto L5;
        r2.l.U(r4.b, r4.c);
        return;
    L5:
        if (r0 != 2) goto L7;
        r2.l.X(r4.b, r4.c);
        return;
    L7:
        if (r0 != 4) goto L9;
        r2.l.Y(r4.b, r4.c);
        return;
    L9:
        if (r0 == 8) goto L11;
        return;
    L11:
        r2.l.W(r4.b, r4.c);
    }

    public b00 b(int r8) {
        RecyclerView r0 = this.a;
        int r1 = r0.e.t();
        int r3 = 0;
        b00 r4 = null;
    L3:
        if (r3 >= r1) goto L16;
        b00 r5 = RecyclerView.I(r0.e.s(r3));
        if (r5 == null) goto L15;
        if (r5.h() == true) goto L15;
        if (r5.c != r8) goto L15;
        r5 r42 = r0.e;
        if (((ArrayList) r42.d).contains(r5.a) == false) goto L14;
        r4 = r5;
        goto L15
    L14:
        r4 = r5;
    L15:
        r3 = r3 + 1;
    L16:
        if (r4 == null) goto L20;
        r5 r82 = r0.e;
        if (((ArrayList) r82.d).contains(r4.a) == true) goto L20;
        return r4;
    L20:
        return null;
    }

    public void c(int r9, int r10) {
        RecyclerView r0 = this.a;
        int r1 = r0.e.t();
        int r102 = r10 + r9;
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L15;
        View r5 = r0.e.s(r2);
        b00 r6 = RecyclerView.I(r5);
        if (r6 == null) goto L14;
        if (r6.o() == true) goto L14;
        int r7 = r6.c;
        if (r7 < r9) goto L14;
        if (r7 >= r102) goto L14;
        r6.a(2);
        r6.a(1024);
        ((oz) r5.getLayoutParams()).c = true;
    L14:
        r2 = r2 + 1;
        goto L4
    L15:
        tz r12 = r0.b;
        ArrayList r22 = r12.c;
        int r52 = r22.size() - 1;
    L16:
        if (r52 < 0) goto L25;
        b00 r62 = (b00) r22.get(r52);
        if (r62 == null) goto L24;
        int r72 = r62.c;
        if (r72 < r9) goto L24;
        if (r72 >= r102) goto L24;
        r62.a(2);
        r12.e(r52);
    L24:
        r52 = r52 - 1;
        goto L16
    L25:
        r0.g0 = true;
    }

    public void d(int r8, int r9) {
        RecyclerView r0 = this.a;
        int r1 = r0.e.t();
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= r1) goto L13;
        b00 r5 = RecyclerView.I(r0.e.s(r3));
        if (r5 == null) goto L12;
        if (r5.o() == true) goto L12;
        if (r5.c < r8) goto L12;
        r5.l(r9, false);
        r0.c0.f = true;
    L12:
        r3 = r3 + 1;
        goto L4
    L13:
        ArrayList r12 = r0.b.c;
        int r32 = r12.size();
    L14:
        if (r2 >= r32) goto L21;
        b00 r52 = (b00) r12.get(r2);
        if (r52 == null) goto L20;
        if (r52.c < r8) goto L20;
        r52.l(r9, true);
    L20:
        r2 = r2 + 1;
        goto L14
    L21:
        r0.requestLayout();
        r0.f0 = true;
    }

    public void e(int r12, int r13) {
        RecyclerView r0 = this.a;
        int r1 = r0.e.t();
        int r2 = -1;
        if (r12 >= r13) goto L5;
        int r4 = r12;
        int r5 = r13;
        int r6 = -1;
    L6:
        int r8 = 0;
    L7:
        if (r8 >= r1) goto L19;
        b00 r9 = RecyclerView.I(r0.e.s(r8));
        if (r9 == null) goto L18;
        int r10 = r9.c;
        if (r10 < r4) goto L18;
        if (r10 > r5) goto L18;
        if (r10 != r12) goto L16;
        r9.l(r13 - r12, false);
    L17:
        r0.c0.f = true;
        goto L18
    L16:
        r9.l(r6, false);
    L18:
        r8 = r8 + 1;
        goto L7
    L19:
        ArrayList r14 = r0.b.c;
        if (r12 >= r13) goto L22;
        int r42 = r12;
        int r52 = r13;
    L23:
        int r62 = r14.size();
        int r82 = 0;
    L24:
        if (r82 >= r62) goto L35;
        b00 r92 = (b00) r14.get(r82);
        if (r92 == null) goto L34;
        int r102 = r92.c;
        if (r102 < r42) goto L34;
        if (r102 > r52) goto L34;
        if (r102 != r12) goto L33;
        r92.l(r13 - r12, false);
        goto L34
    L33:
        r92.l(r2, false);
    L34:
        r82 = r82 + 1;
        goto L24
    L35:
        r0.requestLayout();
        r0.f0 = true;
        return;
    L22:
        r52 = r12;
        r42 = r13;
        r2 = 1;
        goto L23
    L5:
        r5 = r12;
        r4 = r13;
        r6 = 1;
        goto L6
    }

    public void f(b00 r9, lw r10, lw r11) {
        RecyclerView r0 = this.a;
        r0.getClass();
        r9.n(false);
        uf r2 = (uf) r0.H;
        if (r10 == null) goto L11;
        r2.getClass();
        int r4 = r10.a;
        int r6 = r11.a;
        if (r4 == r6) goto L7;
    L10:
        boolean r92 = r2.g(r9, r4, r10.b, r6, r11.b);
    L12:
        if (r92 == false) goto L15;
        r0.S();
        return;
    L15:
        return;
    L7:
        if (r10.b != r11.b) goto L10;
    L11:
        r2.l(r9);
        r9.a.setAlpha(0.0f);
        r2.i.add(r9);
        r92 = true;
        goto L12
    }

    public void g(b00 r9, lw r10, lw r11) {
        RecyclerView r0 = this.a;
        r0.b.j(r9);
        r0.f(r9);
        r9.n(false);
        uf r2 = (uf) r0.H;
        r2.getClass();
        int r4 = r10.a;
        int r5 = r10.b;
        View r102 = r9.a;
        if (r11 != null) goto L6;
        int r1 = r102.getLeft();
    L5:
        int r6 = r1;
        if (r11 != null) goto L10;
        int r112 = r102.getTop();
    L9:
        int r7 = r112;
        if (r9.h() == true) goto L18;
        if (r4 != r6) goto L17;
        if (r5 == r7) goto L18;
    L17:
        r102.layout(r6, r7, r102.getWidth() + r6, r102.getHeight() + r7);
        boolean r92 = r2.g(r9, r4, r5, r6, r7);
    L19:
        if (r92 == false) goto L22;
        r0.S();
        return;
    L22:
        return;
    L18:
        r2.l(r9);
        r2.h.add(r9);
        r92 = true;
        goto L19
    L10:
        r112 = r11.b;
        goto L9
    L6:
        r1 = r11.a;
        goto L5
    }

    public void h(int r3) {
        RecyclerView r0 = this.a;
        View r1 = r0.getChildAt(r3);
        if (r1 == null) goto L5;
        RecyclerView.I(r1);
        r1.clearAnimation();
    L5:
        r0.removeViewAt(r3);
    }
}
