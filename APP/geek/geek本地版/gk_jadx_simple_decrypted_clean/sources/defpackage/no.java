package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class no extends qb0 {
    @Override // defpackage.hg
    public final void a(hg r10) {
        e7 r102 = (e7) this.b;
        int r0 = r102.f0;
        jg r1 = this.h;
        ArrayList r2 = r1.l;
        int r3 = r2.size();
        int r5 = 0;
        int r7 = -1;
        int r6 = 0;
    L3:
        if (r6 >= r3) goto L10;
        Object r8 = r2.get(r6);
        r6 = r6 + 1;
        int r82 = ((jg) r8).g;
        if (r7 == (-1)) goto L7;
        if (r82 < r7) goto L7;
    L8:
        if (r5 >= r82) goto L3;
        r5 = r82;
    L7:
        r7 = r82;
        goto L8
    L10:
        if (r0 != 0) goto L12;
    L16:
        r1.d(r7 + r102.h0);
        return;
    L12:
        if (r0 == 2) goto L16;
        r1.d(r5 + r102.h0);
    }

    @Override // defpackage.qb0
    public final void d() {
        pc r0 = this.b;
        if ((r0 instanceof e7) == false) goto L72;
        jg r1 = this.h;
        r1.b = true;
        ArrayList r3 = r1.l;
        e7 r02 = (e7) r0;
        int r4 = r02.f0;
        boolean r5 = r02.g0;
        int r7 = 0;
        if (r4 == 0) goto L48;
        if (r4 != 1) goto L8;
        r1.e = 5;
    L38:
        if (r7 >= r02.e0) goto L46;
        pc r2 = r02.d0[r7];
        if (r5 == false) goto L42;
    L44:
        jg r22 = r2.d.i;
        r22.k.add(r1);
        r3.add(r22);
    L45:
        r7 = r7 + 1;
        goto L38
    L42:
        if (r2.V != 8) goto L44;
    L46:
        m(this.b.d.h);
        m(this.b.d.i);
        return;
    L8:
        if (r4 != 2) goto L10;
        r1.e = 6;
    L26:
        if (r7 >= r02.e0) goto L34;
        pc r23 = r02.d0[r7];
        if (r5 == false) goto L30;
    L32:
        jg r24 = r23.e.h;
        r24.k.add(r1);
        r3.add(r24);
    L33:
        r7 = r7 + 1;
        goto L26
    L30:
        if (r23.V != 8) goto L32;
    L34:
        m(this.b.e.h);
        m(this.b.e.i);
        return;
    L10:
        if (r4 != 3) goto L73;
        r1.e = 7;
    L14:
        if (r7 >= r02.e0) goto L22;
        pc r25 = r02.d0[r7];
        if (r5 == false) goto L18;
    L20:
        jg r26 = r25.e.i;
        r26.k.add(r1);
        r3.add(r26);
    L21:
        r7 = r7 + 1;
        goto L14
    L18:
        if (r25.V != 8) goto L20;
    L22:
        m(this.b.e.h);
        m(this.b.e.i);
        return;
    L73:
        return;
    L48:
        r1.e = 4;
    L50:
        if (r7 >= r02.e0) goto L58;
        pc r27 = r02.d0[r7];
        if (r5 == false) goto L54;
    L56:
        jg r28 = r27.d.h;
        r28.k.add(r1);
        r3.add(r28);
    L57:
        r7 = r7 + 1;
        goto L50
    L54:
        if (r27.V != 8) goto L56;
    L58:
        m(this.b.d.h);
        m(this.b.d.i);
        return;
    }

    @Override // defpackage.qb0
    public final void e() {
        pc r0 = this.b;
        if ((r0 instanceof e7) == false) goto L13;
        int r1 = ((e7) r0).f0;
        jg r2 = this.h;
        if (r1 != 0) goto L7;
    L11:
        r0.N = r2.g;
        return;
    L7:
        if (r1 == 1) goto L11;
        r0.O = r2.g;
        return;
    }

    @Override // defpackage.qb0
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.qb0
    public final boolean k() {
        return false;
    }

    public final void m(jg r3) {
        jg r0 = this.h;
        r0.k.add(r3);
        r3.l.add(r0);
    }
}
