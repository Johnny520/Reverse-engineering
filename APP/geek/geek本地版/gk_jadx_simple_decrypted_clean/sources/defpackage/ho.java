package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ho extends qb0 {
    @Override // defpackage.hg
    public final void a(hg r3) {
        jg r32 = this.h;
        if (r32.c == true) goto L6;
        return;
    L6:
        if (r32.j == false) goto L8;
        return;
    L8:
        jg r0 = (jg) r32.l.get(0);
        r32.d((int) ((r0.g * ((go) this.b).d0) + 0.5f));
    }

    @Override // defpackage.qb0
    public final void d() {
        pc r0 = this.b;
        go r1 = (go) r0;
        int r2 = r1.e0;
        int r3 = r1.f0;
        int r12 = r1.h0;
        jg r5 = this.h;
        if (r12 != 1) goto L11;
        if (r2 == (-1)) goto L6;
        r5.l.add(r0.I.d.h);
        this.b.I.d.h.k.add(r5);
        r5.f = r2;
    L9:
        m(this.b.d.h);
        m(this.b.d.i);
        return;
    L6:
        if (r3 == (-1)) goto L8;
        r5.l.add(r0.I.d.i);
        this.b.I.d.i.k.add(r5);
        r5.f = -r3;
        goto L9
    L8:
        r5.b = true;
        r5.l.add(r0.I.d.i);
        this.b.I.d.i.k.add(r5);
        goto L9
    L11:
        if (r2 == (-1)) goto L13;
        r5.l.add(r0.I.e.h);
        this.b.I.e.h.k.add(r5);
        r5.f = r2;
    L16:
        m(this.b.e.h);
        m(this.b.e.i);
        return;
    L13:
        if (r3 == (-1)) goto L15;
        r5.l.add(r0.I.e.i);
        this.b.I.e.i.k.add(r5);
        r5.f = -r3;
        goto L16
    L15:
        r5.b = true;
        r5.l.add(r0.I.e.i);
        this.b.I.e.i.k.add(r5);
        goto L16
    }

    @Override // defpackage.qb0
    public final void e() {
        pc r0 = this.b;
        int r1 = ((go) r0).h0;
        jg r3 = this.h;
        if (r1 != 1) goto L6;
        r0.N = r3.g;
        return;
    L6:
        r0.O = r3.g;
    }

    @Override // defpackage.qb0
    public final void f() {
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
