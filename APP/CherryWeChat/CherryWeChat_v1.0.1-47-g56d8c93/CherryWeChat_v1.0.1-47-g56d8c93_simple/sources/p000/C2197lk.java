package p000;

/* JADX INFO: renamed from: lk */
/* JADX INFO: loaded from: classes.dex */
public final class C2197lk extends AbstractC1449gF {
    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    public final void mo1546a(InterfaceC2542td r3) {
        C2628vd r32 = this.f5064h;
        if (r32.f9112c == true) goto L6;
        return;
    L6:
        if (r32.f9119j == false) goto L8;
        return;
    L8:
        C2628vd r0 = (C2628vd) r32.f9121l.get(0);
        r32.mo1539d((int) ((r0.f9116g * ((C2150kk) this.f5058b).f7518q0) + 0.5f));
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: d */
    public final void mo1547d() {
        C2454rb r0 = this.f5058b;
        C2150kk r1 = (C2150kk) r0;
        int r2 = r1.f7519r0;
        int r3 = r1.f7520s0;
        int r12 = r1.f7522u0;
        C2628vd r5 = this.f5064h;
        if (r12 != 1) goto L11;
        if (r2 == (-1)) goto L6;
        r5.f9121l.add(r0.f8599T.f8612d.f5064h);
        this.f5058b.f8599T.f8612d.f5064h.f9120k.add(r5);
        r5.f9115f = r2;
    L9:
        m4427m(this.f5058b.f8612d.f5064h);
        m4427m(this.f5058b.f8612d.f5065i);
        return;
    L6:
        if (r3 == (-1)) goto L8;
        r5.f9121l.add(r0.f8599T.f8612d.f5065i);
        this.f5058b.f8599T.f8612d.f5065i.f9120k.add(r5);
        r5.f9115f = -r3;
        goto L9
    L8:
        r5.f9111b = true;
        r5.f9121l.add(r0.f8599T.f8612d.f5065i);
        this.f5058b.f8599T.f8612d.f5065i.f9120k.add(r5);
        goto L9
    L11:
        if (r2 == (-1)) goto L13;
        r5.f9121l.add(r0.f8599T.f8614e.f5064h);
        this.f5058b.f8599T.f8614e.f5064h.f9120k.add(r5);
        r5.f9115f = r2;
    L16:
        m4427m(this.f5058b.f8614e.f5064h);
        m4427m(this.f5058b.f8614e.f5065i);
        return;
    L13:
        if (r3 == (-1)) goto L15;
        r5.f9121l.add(r0.f8599T.f8614e.f5065i);
        this.f5058b.f8599T.f8614e.f5065i.f9120k.add(r5);
        r5.f9115f = -r3;
        goto L16
    L15:
        r5.f9111b = true;
        r5.f9121l.add(r0.f8599T.f8614e.f5065i);
        this.f5058b.f8599T.f8614e.f5065i.f9120k.add(r5);
        goto L16
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: e */
    public final void mo1548e() {
        C2454rb r0 = this.f5058b;
        int r1 = ((C2150kk) r0).f7522u0;
        C2628vd r3 = this.f5064h;
        if (r1 != 1) goto L6;
        r0.f8604Y = r3.f9116g;
        return;
    L6:
        r0.f8605Z = r3.f9116g;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: f */
    public final void mo1549f() {
        this.f5064h.m5144c();
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: k */
    public final boolean mo1550k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m4427m(C2628vd r3) {
        C2628vd r0 = this.f5064h;
        r0.f9120k.add(r3);
        r3.f9121l.add(r0);
    }
}
