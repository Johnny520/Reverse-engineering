package p000;

/* JADX INFO: renamed from: ho */
/* JADX INFO: loaded from: classes.dex */
public final class C0305ho extends qb0 {
    @Override // p000.InterfaceC0297hg
    /* JADX INFO: renamed from: a */
    public final void mo1357a(InterfaceC0297hg interfaceC0297hg) {
        C0373jg c0373jg = this.f4059h;
        if (c0373jg.f2623c && !c0373jg.f2630j) {
            c0373jg.mo1597d((int) ((((C0373jg) c0373jg.f2632l.get(0)).f2627g * ((C0268go) this.f4053b).f2157d0) + 0.5f));
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: d */
    public final void mo1363d() {
        C0592pc c0592pc = this.f4053b;
        C0268go c0268go = (C0268go) c0592pc;
        int i = c0268go.f2158e0;
        int i2 = c0268go.f2159f0;
        int i3 = c0268go.f2161h0;
        C0373jg c0373jg = this.f4059h;
        if (i3 == 1) {
            if (i != -1) {
                c0373jg.f2632l.add(c0592pc.f3832I.f3856d.f4059h);
                this.f4053b.f3832I.f3856d.f4059h.f2631k.add(c0373jg);
                c0373jg.f2626f = i;
            } else if (i2 != -1) {
                c0373jg.f2632l.add(c0592pc.f3832I.f3856d.f4060i);
                this.f4053b.f3832I.f3856d.f4060i.f2631k.add(c0373jg);
                c0373jg.f2626f = -i2;
            } else {
                c0373jg.f2622b = true;
                c0373jg.f2632l.add(c0592pc.f3832I.f3856d.f4060i);
                this.f4053b.f3832I.f3856d.f4060i.f2631k.add(c0373jg);
            }
            m1367m(this.f4053b.f3856d.f4059h);
            m1367m(this.f4053b.f3856d.f4060i);
            return;
        }
        if (i != -1) {
            c0373jg.f2632l.add(c0592pc.f3832I.f3857e.f4059h);
            this.f4053b.f3832I.f3857e.f4059h.f2631k.add(c0373jg);
            c0373jg.f2626f = i;
        } else if (i2 != -1) {
            c0373jg.f2632l.add(c0592pc.f3832I.f3857e.f4060i);
            this.f4053b.f3832I.f3857e.f4060i.f2631k.add(c0373jg);
            c0373jg.f2626f = -i2;
        } else {
            c0373jg.f2622b = true;
            c0373jg.f2632l.add(c0592pc.f3832I.f3857e.f4060i);
            this.f4053b.f3832I.f3857e.f4060i.f2631k.add(c0373jg);
        }
        m1367m(this.f4053b.f3857e.f4059h);
        m1367m(this.f4053b.f3857e.f4060i);
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: e */
    public final void mo1364e() {
        C0592pc c0592pc = this.f4053b;
        int i = ((C0268go) c0592pc).f2161h0;
        C0373jg c0373jg = this.f4059h;
        if (i == 1) {
            c0592pc.f3837N = c0373jg.f2627g;
        } else {
            c0592pc.f3838O = c0373jg.f2627g;
        }
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: f */
    public final void mo1365f() {
        this.f4059h.m1596c();
    }

    @Override // p000.qb0
    /* JADX INFO: renamed from: k */
    public final boolean mo1366k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m1367m(C0373jg c0373jg) {
        C0373jg c0373jg2 = this.f4059h;
        c0373jg2.f2631k.add(c0373jg);
        c0373jg.f2632l.add(c0373jg2);
    }
}
