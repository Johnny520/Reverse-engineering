package p000a;

/* JADX INFO: renamed from: a.b8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0497b8 extends AbstractC0639ih {
    @Override // p000a.AbstractC0639ih, p000a.InterfaceC0348T4
    /* JADX INFO: renamed from: a */
    public final void mo521a(InterfaceC0348T4 interfaceC0348T4) {
        C0384V4 c0384v4 = this.f2349h;
        if (c0384v4.f1445c && !c0384v4.f1452j) {
            c0384v4.mo1014d((int) ((((C0384V4) c0384v4.f1454l.get(0)).f1449g * ((C0478a8) this.f2343b).f1792e0) + 0.5f));
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: d */
    public final void mo522d() {
        C0240N3 c0240n3 = this.f2343b;
        C0478a8 c0478a8 = (C0478a8) c0240n3;
        int i = c0478a8.f1793f0;
        int i2 = c0478a8.f1794g0;
        int i3 = c0478a8.f1796i0;
        C0384V4 c0384v4 = this.f2349h;
        if (i3 == 1) {
            if (i != -1) {
                c0384v4.f1454l.add(c0240n3.f793K.f815d.f2349h);
                this.f2343b.f793K.f815d.f2349h.f1453k.add(c0384v4);
                c0384v4.f1448f = i;
            } else if (i2 != -1) {
                c0384v4.f1454l.add(c0240n3.f793K.f815d.f2350i);
                this.f2343b.f793K.f815d.f2350i.f1453k.add(c0384v4);
                c0384v4.f1448f = -i2;
            } else {
                c0384v4.f1444b = true;
                c0384v4.f1454l.add(c0240n3.f793K.f815d.f2350i);
                this.f2343b.f793K.f815d.f2350i.f1453k.add(c0384v4);
            }
            m1227m(this.f2343b.f815d.f2349h);
            m1227m(this.f2343b.f815d.f2350i);
            return;
        }
        if (i != -1) {
            c0384v4.f1454l.add(c0240n3.f793K.f817e.f2349h);
            this.f2343b.f793K.f817e.f2349h.f1453k.add(c0384v4);
            c0384v4.f1448f = i;
        } else if (i2 != -1) {
            c0384v4.f1454l.add(c0240n3.f793K.f817e.f2350i);
            this.f2343b.f793K.f817e.f2350i.f1453k.add(c0384v4);
            c0384v4.f1448f = -i2;
        } else {
            c0384v4.f1444b = true;
            c0384v4.f1454l.add(c0240n3.f793K.f817e.f2350i);
            this.f2343b.f793K.f817e.f2350i.f1453k.add(c0384v4);
        }
        m1227m(this.f2343b.f817e.f2349h);
        m1227m(this.f2343b.f817e.f2350i);
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: e */
    public final void mo523e() {
        C0240N3 c0240n3 = this.f2343b;
        int i = ((C0478a8) c0240n3).f1796i0;
        C0384V4 c0384v4 = this.f2349h;
        if (i == 1) {
            c0240n3.f798P = c0384v4.f1449g;
        } else {
            c0240n3.f799Q = c0384v4.f1449g;
        }
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: f */
    public final void mo524f() {
        this.f2349h.m1013c();
    }

    @Override // p000a.AbstractC0639ih
    /* JADX INFO: renamed from: k */
    public final boolean mo525k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m1227m(C0384V4 c0384v4) {
        C0384V4 c0384v42 = this.f2349h;
        c0384v42.f1453k.add(c0384v4);
        c0384v4.f1454l.add(c0384v42);
    }
}
