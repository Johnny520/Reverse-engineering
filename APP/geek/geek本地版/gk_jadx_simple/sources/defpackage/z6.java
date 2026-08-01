package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z6 extends r70 {
    public int A;
    public ArrayList w;
    public boolean x;
    public int y;
    public boolean z;

    @Override // defpackage.r70
    public final void A(iy r3) {
        super.A(r3);
        this.A |= 4;
        if (this.w == null) goto L8;
        int r0 = 0;
    L6:
        if (r0 >= this.w.size()) goto L10;
        ((r70) this.w.get(r0)).A(r3);
        r0 = r0 + 1;
        goto L6
    L10:
        return;
    }

    @Override // defpackage.r70
    public final void B() {
        this.A |= 2;
        int r0 = this.w.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((r70) this.w.get(r1)).B();
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.r70
    public final void C(long r1) {
        this.b = r1;
    }

    @Override // defpackage.r70
    public final String E(String r6) {
        String r0 = super.E(r6);
        int r1 = 0;
    L4:
        if (r1 >= this.w.size()) goto L6;
        StringBuilder r2 = new StringBuilder();
        r2.append(r0);
        r2.append("\n");
        r2.append(((r70) this.w.get(r1)).E(r6 + "  "));
        r0 = r2.toString();
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    public final void F(r70 r5) {
        this.w.add(r5);
        r5.i = this;
        long r0 = this.c;
        if (r0 < 0) goto L6;
        r5.x(r0);
    L6:
        if ((this.A & 1) == 0) goto L9;
        r5.z(this.d);
    L9:
        if ((this.A & 2) == 0) goto L12;
        r5.B();
    L12:
        if ((this.A & 4) == 0) goto L15;
        r5.A(this.s);
    L15:
        if ((this.A & 8) == 0) goto L18;
        r5.y(null);
        return;
    }

    @Override // defpackage.r70
    public final void c(x70 r7) {
        View r0 = r7.b;
        if (r(r0) == false) goto L9;
        ArrayList r1 = this.w;
        int r2 = r1.size();
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L15;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        r70 r42 = (r70) r4;
        if (r42.r(r0) == false) goto L5;
        r42.c(r7);
        r7.c.add(r42);
        goto L5
    L15:
        return;
    }

    @Override // defpackage.r70
    public final /* bridge */ /* synthetic */ Object clone() {
        return i();
    }

    @Override // defpackage.r70
    public final void e(x70 r4) {
        int r0 = this.w.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((r70) this.w.get(r1)).e(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.r70
    public final void f(x70 r7) {
        View r0 = r7.b;
        if (r(r0) == false) goto L9;
        ArrayList r1 = this.w;
        int r2 = r1.size();
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L15;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        r70 r42 = (r70) r4;
        if (r42.r(r0) == false) goto L5;
        r42.f(r7);
        r7.c.add(r42);
        goto L5
    L15:
        return;
    }

    @Override // defpackage.r70
    public final r70 i() {
        z6 r0 = (z6) super.i();
        r0.w = new ArrayList();
        int r1 = this.w.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r70 r3 = ((r70) this.w.get(r2)).i();
        r0.w.add(r3);
        r3.i = r0;
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    @Override // defpackage.r70
    public final void k(ViewGroup r12, a8 r13, a8 r14, ArrayList r15, ArrayList r16) {
        long r0 = this.b;
        int r2 = this.w.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L16;
        r70 r5 = (r70) this.w.get(r3);
        if (r0 <= 0) goto L15;
        if (this.x == true) goto L11;
        if (r3 != 0) goto L15;
    L11:
        long r8 = r5.b;
        if (r8 <= 0) goto L14;
        r5.C(r8 + r0);
        goto L15
    L14:
        r5.C(r0);
    L15:
        r5.k(r12, r13, r14, r15, r16);
        r3 = r3 + 1;
        goto L3
    }

    @Override // defpackage.r70
    public final void t(View r4) {
        super.t(r4);
        int r0 = this.w.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((r70) this.w.get(r1)).t(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.r70
    public final void v(View r4) {
        super.v(r4);
        int r0 = this.w.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((r70) this.w.get(r1)).v(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.r70
    public final void w() {
        if (this.w.isEmpty() == false) goto L6;
        D();
        l();
        return;
    L6:
        nj r0 = new nj();
        r0.b = this;
        ArrayList r1 = this.w;
        int r2 = r1.size();
        int r3 = 0;
        int r4 = 0;
    L7:
        if (r4 >= r2) goto L9;
        Object r5 = r1.get(r4);
        r4 = r4 + 1;
        ((r70) r5).a(r0);
        goto L7
    L9:
        this.y = this.w.size();
        if (this.x == true) goto L19;
        int r02 = 1;
    L13:
        if (r02 >= this.w.size()) goto L15;
        ((r70) this.w.get(r02 - 1)).a(new nj(1, (r70) this.w.get(r02)));
        r02 = r02 + 1;
        goto L13
    L15:
        r70 r03 = (r70) this.w.get(0);
        if (r03 == null) goto L22;
        r03.w();
        return;
    L22:
        return;
    L19:
        ArrayList r04 = this.w;
        int r12 = r04.size();
    L20:
        if (r3 >= r12) goto L26;
        Object r22 = r04.get(r3);
        r3 = r3 + 1;
        ((r70) r22).w();
        goto L20
    }

    @Override // defpackage.r70
    public final void x(long r4) {
        this.c = r4;
        if (r4 < 0) goto L9;
        ArrayList r0 = this.w;
        if (r0 == null) goto L11;
        int r02 = r0.size();
        int r1 = 0;
    L7:
        if (r1 >= r02) goto L12;
        ((r70) this.w.get(r1)).x(r4);
        r1 = r1 + 1;
        goto L7
    L12:
        return;
    L11:
        return;
    }

    @Override // defpackage.r70
    public final void y(gt r4) {
        this.A |= 8;
        int r0 = this.w.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((r70) this.w.get(r1)).y(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.r70
    public final void z(TimeInterpolator r4) {
        this.A |= 1;
        ArrayList r0 = this.w;
        if (r0 == null) goto L7;
        int r02 = r0.size();
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L7;
        ((r70) this.w.get(r1)).z(r4);
        r1 = r1 + 1;
    L7:
        this.d = r4;
    }
}
