package p000;

/* JADX INFO: renamed from: lk */
/* JADX INFO: loaded from: classes.dex */
public final class C2197lk extends AbstractC1449gF {
    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    public final void mo1546a(InterfaceC2542td interfaceC2542td) {
        C2628vd c2628vd = this.f5064h;
        if (c2628vd.f9112c && !c2628vd.f9119j) {
            c2628vd.mo1539d((int) ((((C2628vd) c2628vd.f9121l.get(0)).f9116g * ((C2150kk) this.f5058b).f7518q0) + 0.5f));
        }
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: d */
    public final void mo1547d() {
        C2454rb c2454rb = this.f5058b;
        C2150kk c2150kk = (C2150kk) c2454rb;
        int i = c2150kk.f7519r0;
        int i2 = c2150kk.f7520s0;
        int i3 = c2150kk.f7522u0;
        C2628vd c2628vd = this.f5064h;
        if (i3 == 1) {
            if (i != -1) {
                c2628vd.f9121l.add(c2454rb.f8599T.f8612d.f5064h);
                this.f5058b.f8599T.f8612d.f5064h.f9120k.add(c2628vd);
                c2628vd.f9115f = i;
            } else if (i2 != -1) {
                c2628vd.f9121l.add(c2454rb.f8599T.f8612d.f5065i);
                this.f5058b.f8599T.f8612d.f5065i.f9120k.add(c2628vd);
                c2628vd.f9115f = -i2;
            } else {
                c2628vd.f9111b = true;
                c2628vd.f9121l.add(c2454rb.f8599T.f8612d.f5065i);
                this.f5058b.f8599T.f8612d.f5065i.f9120k.add(c2628vd);
            }
            m4427m(this.f5058b.f8612d.f5064h);
            m4427m(this.f5058b.f8612d.f5065i);
            return;
        }
        if (i != -1) {
            c2628vd.f9121l.add(c2454rb.f8599T.f8614e.f5064h);
            this.f5058b.f8599T.f8614e.f5064h.f9120k.add(c2628vd);
            c2628vd.f9115f = i;
        } else if (i2 != -1) {
            c2628vd.f9121l.add(c2454rb.f8599T.f8614e.f5065i);
            this.f5058b.f8599T.f8614e.f5065i.f9120k.add(c2628vd);
            c2628vd.f9115f = -i2;
        } else {
            c2628vd.f9111b = true;
            c2628vd.f9121l.add(c2454rb.f8599T.f8614e.f5065i);
            this.f5058b.f8599T.f8614e.f5065i.f9120k.add(c2628vd);
        }
        m4427m(this.f5058b.f8614e.f5064h);
        m4427m(this.f5058b.f8614e.f5065i);
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: e */
    public final void mo1548e() {
        C2454rb c2454rb = this.f5058b;
        int i = ((C2150kk) c2454rb).f7522u0;
        C2628vd c2628vd = this.f5064h;
        if (i == 1) {
            c2454rb.f8604Y = c2628vd.f9116g;
        } else {
            c2454rb.f8605Z = c2628vd.f9116g;
        }
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
    public final void m4427m(C2628vd c2628vd) {
        C2628vd c2628vd2 = this.f5064h;
        c2628vd2.f9120k.add(c2628vd);
        c2628vd.f9121l.add(c2628vd2);
    }
}
